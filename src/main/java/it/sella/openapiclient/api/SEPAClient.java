package it.sella.openapiclient.api;

import it.sella.openapiclient.request.JSONRequest;

public class SEPAClient extends GenericClient {
    public String getAccountList(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_ACCOUNT_LIST.uri, processJsonRequest(aliasJson));
    }
    
    public String getBusinessObjectTypeList(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_BUSINESS_OBJECT_TYPE_LIST.uri, processJsonRequest(aliasJson));
    }
    
    public String getBusinessObjectData(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_BUSINESS_OBJECT_DATA.uri, processJsonRequest(aliasJson));
    }
}
