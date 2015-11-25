package it.sella.openapiclient.api;

import it.sella.openapiclient.request.JSONRequest;

public class OnboardingClient extends GenericClient {
    public String createUser(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.CREATE_USER.uri, processJsonRequest(aliasJson));
    }
    
    public String setUserPicture(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.SET_USER_PICTURE.uri, processJsonRequest(aliasJson));
    }
    
    public String setDocumentPicture(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.SET_DOCUMENT_PICTURE.uri, processJsonRequest(aliasJson));
    }
    
    public String getUserContract(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_USER_CONTRACT.uri, processJsonRequest(aliasJson));
    }
    
    public String getTermsAndConditions(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_TERMS_AND_CONDITIONS.uri, processJsonRequest(aliasJson));
    }
    
}
