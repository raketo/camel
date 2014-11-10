/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.management.mbean;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.camel.Component;
import org.apache.camel.ServiceStatus;
import org.apache.camel.StatefulService;
import org.apache.camel.api.management.ManagedInstance;
import org.apache.camel.api.management.ManagedResource;
import org.apache.camel.api.management.mbean.ManagedComponentMBean;
import org.apache.camel.spi.ManagementStrategy;
import org.apache.camel.util.JsonSchemaHelper;
import org.apache.camel.util.ObjectHelper;

/**
 * @version 
 */
@ManagedResource(description = "Managed Component")
public class ManagedComponent implements ManagedInstance, ManagedComponentMBean {
    private final Component component;
    private final String name;
    private String description;

    public ManagedComponent(String name, Component component) {
        this.name = name;
        this.component = component;

        try {
            String json = component.getCamelContext().getComponentParameterJsonSchema(name);
            List<Map<String, String>> rows = JsonSchemaHelper.parseJsonSchema("component", json, false);
            for (Map<String, String> row : rows) {
                if (row.containsKey("description")) {
                    this.description = row.get("description");
                    break;
                }
            }
        } catch (Exception e) {
            // ignore
        }
    }

    public void init(ManagementStrategy strategy) {
        // do nothing
    }

    public Component getComponent() {
        return component;
    }

    public String getComponentName() {
        return name;
    }

    public String getComponentDescription() {
        return description;
    }

    public String getState() {
        // must use String type to be sure remote JMX can read the attribute without requiring Camel classes.
        if (component instanceof StatefulService) {
            ServiceStatus status = ((StatefulService) component).getStatus();
            return status.name();
        }

        // assume started if not a ServiceSupport instance
        return ServiceStatus.Started.name();
    }

    public String getCamelId() {
        return component.getCamelContext().getName();
    }

    public String getCamelManagementName() {
        return component.getCamelContext().getManagementName();
    }

    public Object getInstance() {
        return component;
    }

    @Override
    public String informationJson() {
        try {
            return component.getCamelContext().getComponentParameterJsonSchema(name);
        } catch (IOException e) {
            throw ObjectHelper.wrapRuntimeCamelException(e);
        }
    }
}
