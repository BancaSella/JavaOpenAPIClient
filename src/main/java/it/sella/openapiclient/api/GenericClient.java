package it.sella.openapiclient.api;

import it.sella.openapiclient.generic.RestAPIClientTemplate;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.entity.StringEntity;
import org.json.simple.JSONObject;

class GenericClient implements IGenericClient {
    public static final String INVALID_JSON_REQUEST = "JSON Request sent is invalid. Correct the JSON to get proper response";
    
    protected StringEntity processJsonRequest(JSONObject jsonRequest) {
        StringEntity requestEntity;
        try {
            requestEntity = new StringEntity(jsonRequest.toJSONString());
        } catch (UnsupportedEncodingException unsupportedEncodingException) {
            Logger.getLogger(EMoneyClient.class.getName()).log(Level.SEVERE, null, unsupportedEncodingException);
            throw new InvalidJsonRequestException(INVALID_JSON_REQUEST, unsupportedEncodingException);
        }
        return requestEntity;
    }
    
    protected String invokeRest(final String REQUEST_URI, StringEntity requestEntity) {
        RestAPIClientTemplate template = new RestAPIClientTemplate();
        return template.invokeRest(REQUEST_URI, requestEntity);
    }
}
