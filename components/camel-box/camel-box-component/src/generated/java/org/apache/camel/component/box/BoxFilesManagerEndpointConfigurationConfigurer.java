/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.box;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BoxFilesManagerEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "access":
        case "Access": target.setAccess(property(camelContext, com.box.sdk.BoxSharedLink.Access.class, value)); return true;
        case "accesstokencache":
        case "AccessTokenCache": target.setAccessTokenCache(property(camelContext, com.box.sdk.IAccessTokenCache.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.box.internal.BoxApiName.class, value)); return true;
        case "authenticationtype":
        case "AuthenticationType": target.setAuthenticationType(property(camelContext, java.lang.String.class, value)); return true;
        case "check":
        case "Check": target.setCheck(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "clientid":
        case "ClientId": target.setClientId(property(camelContext, java.lang.String.class, value)); return true;
        case "clientsecret":
        case "ClientSecret": target.setClientSecret(property(camelContext, java.lang.String.class, value)); return true;
        case "content":
        case "Content": target.setContent(property(camelContext, java.io.InputStream.class, value)); return true;
        case "created":
        case "Created": target.setCreated(property(camelContext, java.util.Date.class, value)); return true;
        case "destinationfolderid":
        case "DestinationFolderId": target.setDestinationFolderId(property(camelContext, java.lang.String.class, value)); return true;
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": target.setEncryptionAlgorithm(property(camelContext, java.lang.String.class, value)); return true;
        case "enterpriseid":
        case "EnterpriseId": target.setEnterpriseId(property(camelContext, java.lang.String.class, value)); return true;
        case "fields":
        case "Fields": target.setFields(property(camelContext, java.lang.String[].class, value)); return true;
        case "filecontent":
        case "FileContent": target.setFileContent(property(camelContext, java.io.InputStream.class, value)); return true;
        case "fileid":
        case "FileId": target.setFileId(property(camelContext, java.lang.String.class, value)); return true;
        case "filename":
        case "FileName": target.setFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "filesize":
        case "FileSize": target.setFileSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "filetype":
        case "FileType": target.setFileType(property(camelContext, com.box.sdk.BoxFile.ThumbnailFileType.class, value)); return true;
        case "httpparams":
        case "HttpParams": target.setHttpParams(property(camelContext, java.util.Map.class, value)); return true;
        case "info":
        case "Info": target.setInfo(property(camelContext, com.box.sdk.BoxFile.Info.class, value)); return true;
        case "listener":
        case "Listener": target.setListener(property(camelContext, com.box.sdk.ProgressListener.class, value)); return true;
        case "maxcacheentries":
        case "MaxCacheEntries": target.setMaxCacheEntries(property(camelContext, int.class, value)); return true;
        case "maxheight":
        case "MaxHeight": target.setMaxHeight(property(camelContext, java.lang.Integer.class, value)); return true;
        case "maxwidth":
        case "MaxWidth": target.setMaxWidth(property(camelContext, java.lang.Integer.class, value)); return true;
        case "metadata":
        case "Metadata": target.setMetadata(property(camelContext, com.box.sdk.Metadata.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "minheight":
        case "MinHeight": target.setMinHeight(property(camelContext, java.lang.Integer.class, value)); return true;
        case "minwidth":
        case "MinWidth": target.setMinWidth(property(camelContext, java.lang.Integer.class, value)); return true;
        case "modified":
        case "Modified": target.setModified(property(camelContext, java.util.Date.class, value)); return true;
        case "newfilename":
        case "NewFileName": target.setNewFileName(property(camelContext, java.lang.String.class, value)); return true;
        case "newname":
        case "NewName": target.setNewName(property(camelContext, java.lang.String.class, value)); return true;
        case "output":
        case "Output": target.setOutput(property(camelContext, java.io.OutputStream.class, value)); return true;
        case "parentfolderid":
        case "ParentFolderId": target.setParentFolderId(property(camelContext, java.lang.String.class, value)); return true;
        case "permissions":
        case "Permissions": target.setPermissions(property(camelContext, com.box.sdk.BoxSharedLink.Permissions.class, value)); return true;
        case "privatekeyfile":
        case "PrivateKeyFile": target.setPrivateKeyFile(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekeypassword":
        case "PrivateKeyPassword": target.setPrivateKeyPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "publickeyid":
        case "PublicKeyId": target.setPublicKeyId(property(camelContext, java.lang.String.class, value)); return true;
        case "rangeend":
        case "RangeEnd": target.setRangeEnd(property(camelContext, java.lang.Long.class, value)); return true;
        case "rangestart":
        case "RangeStart": target.setRangeStart(property(camelContext, java.lang.Long.class, value)); return true;
        case "size":
        case "Size": target.setSize(property(camelContext, java.lang.Long.class, value)); return true;
        case "sslcontextparameters":
        case "SslContextParameters": target.setSslContextParameters(property(camelContext, org.apache.camel.support.jsse.SSLContextParameters.class, value)); return true;
        case "typename":
        case "TypeName": target.setTypeName(property(camelContext, java.lang.String.class, value)); return true;
        case "unsharedate":
        case "UnshareDate": target.setUnshareDate(property(camelContext, java.util.Date.class, value)); return true;
        case "userid":
        case "UserId": target.setUserId(property(camelContext, java.lang.String.class, value)); return true;
        case "username":
        case "UserName": target.setUserName(property(camelContext, java.lang.String.class, value)); return true;
        case "userpassword":
        case "UserPassword": target.setUserPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "version":
        case "Version": target.setVersion(property(camelContext, java.lang.Integer.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        Map<String, Object> answer = new CaseInsensitiveMap();
        answer.put("Access", com.box.sdk.BoxSharedLink.Access.class);
        answer.put("AccessTokenCache", com.box.sdk.IAccessTokenCache.class);
        answer.put("ApiName", org.apache.camel.component.box.internal.BoxApiName.class);
        answer.put("AuthenticationType", java.lang.String.class);
        answer.put("Check", java.lang.Boolean.class);
        answer.put("ClientId", java.lang.String.class);
        answer.put("ClientSecret", java.lang.String.class);
        answer.put("Content", java.io.InputStream.class);
        answer.put("Created", java.util.Date.class);
        answer.put("DestinationFolderId", java.lang.String.class);
        answer.put("EncryptionAlgorithm", java.lang.String.class);
        answer.put("EnterpriseId", java.lang.String.class);
        answer.put("Fields", java.lang.String[].class);
        answer.put("FileContent", java.io.InputStream.class);
        answer.put("FileId", java.lang.String.class);
        answer.put("FileName", java.lang.String.class);
        answer.put("FileSize", java.lang.Long.class);
        answer.put("FileType", com.box.sdk.BoxFile.ThumbnailFileType.class);
        answer.put("HttpParams", java.util.Map.class);
        answer.put("Info", com.box.sdk.BoxFile.Info.class);
        answer.put("Listener", com.box.sdk.ProgressListener.class);
        answer.put("MaxCacheEntries", int.class);
        answer.put("MaxHeight", java.lang.Integer.class);
        answer.put("MaxWidth", java.lang.Integer.class);
        answer.put("Metadata", com.box.sdk.Metadata.class);
        answer.put("MethodName", java.lang.String.class);
        answer.put("MinHeight", java.lang.Integer.class);
        answer.put("MinWidth", java.lang.Integer.class);
        answer.put("Modified", java.util.Date.class);
        answer.put("NewFileName", java.lang.String.class);
        answer.put("NewName", java.lang.String.class);
        answer.put("Output", java.io.OutputStream.class);
        answer.put("ParentFolderId", java.lang.String.class);
        answer.put("Permissions", com.box.sdk.BoxSharedLink.Permissions.class);
        answer.put("PrivateKeyFile", java.lang.String.class);
        answer.put("PrivateKeyPassword", java.lang.String.class);
        answer.put("PublicKeyId", java.lang.String.class);
        answer.put("RangeEnd", java.lang.Long.class);
        answer.put("RangeStart", java.lang.Long.class);
        answer.put("Size", java.lang.Long.class);
        answer.put("SslContextParameters", org.apache.camel.support.jsse.SSLContextParameters.class);
        answer.put("TypeName", java.lang.String.class);
        answer.put("UnshareDate", java.util.Date.class);
        answer.put("UserId", java.lang.String.class);
        answer.put("UserName", java.lang.String.class);
        answer.put("UserPassword", java.lang.String.class);
        answer.put("Version", java.lang.Integer.class);
        return answer;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration target = (org.apache.camel.component.box.BoxFilesManagerEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "access":
        case "Access": return target.getAccess();
        case "accesstokencache":
        case "AccessTokenCache": return target.getAccessTokenCache();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "authenticationtype":
        case "AuthenticationType": return target.getAuthenticationType();
        case "check":
        case "Check": return target.getCheck();
        case "clientid":
        case "ClientId": return target.getClientId();
        case "clientsecret":
        case "ClientSecret": return target.getClientSecret();
        case "content":
        case "Content": return target.getContent();
        case "created":
        case "Created": return target.getCreated();
        case "destinationfolderid":
        case "DestinationFolderId": return target.getDestinationFolderId();
        case "encryptionalgorithm":
        case "EncryptionAlgorithm": return target.getEncryptionAlgorithm();
        case "enterpriseid":
        case "EnterpriseId": return target.getEnterpriseId();
        case "fields":
        case "Fields": return target.getFields();
        case "filecontent":
        case "FileContent": return target.getFileContent();
        case "fileid":
        case "FileId": return target.getFileId();
        case "filename":
        case "FileName": return target.getFileName();
        case "filesize":
        case "FileSize": return target.getFileSize();
        case "filetype":
        case "FileType": return target.getFileType();
        case "httpparams":
        case "HttpParams": return target.getHttpParams();
        case "info":
        case "Info": return target.getInfo();
        case "listener":
        case "Listener": return target.getListener();
        case "maxcacheentries":
        case "MaxCacheEntries": return target.getMaxCacheEntries();
        case "maxheight":
        case "MaxHeight": return target.getMaxHeight();
        case "maxwidth":
        case "MaxWidth": return target.getMaxWidth();
        case "metadata":
        case "Metadata": return target.getMetadata();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "minheight":
        case "MinHeight": return target.getMinHeight();
        case "minwidth":
        case "MinWidth": return target.getMinWidth();
        case "modified":
        case "Modified": return target.getModified();
        case "newfilename":
        case "NewFileName": return target.getNewFileName();
        case "newname":
        case "NewName": return target.getNewName();
        case "output":
        case "Output": return target.getOutput();
        case "parentfolderid":
        case "ParentFolderId": return target.getParentFolderId();
        case "permissions":
        case "Permissions": return target.getPermissions();
        case "privatekeyfile":
        case "PrivateKeyFile": return target.getPrivateKeyFile();
        case "privatekeypassword":
        case "PrivateKeyPassword": return target.getPrivateKeyPassword();
        case "publickeyid":
        case "PublicKeyId": return target.getPublicKeyId();
        case "rangeend":
        case "RangeEnd": return target.getRangeEnd();
        case "rangestart":
        case "RangeStart": return target.getRangeStart();
        case "size":
        case "Size": return target.getSize();
        case "sslcontextparameters":
        case "SslContextParameters": return target.getSslContextParameters();
        case "typename":
        case "TypeName": return target.getTypeName();
        case "unsharedate":
        case "UnshareDate": return target.getUnshareDate();
        case "userid":
        case "UserId": return target.getUserId();
        case "username":
        case "UserName": return target.getUserName();
        case "userpassword":
        case "UserPassword": return target.getUserPassword();
        case "version":
        case "Version": return target.getVersion();
        default: return null;
        }
    }
}
