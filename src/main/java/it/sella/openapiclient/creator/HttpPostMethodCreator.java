package it.sella.openapiclient.creator;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;

public class HttpPostMethodCreator implements IHttpMethodCreator {
    @Override
    public HttpPost create(String requestURL, StringEntity entity) { 
        HttpPost postRequest = new HttpPost(requestURL);
        postRequest.setEntity(entity);
        return postRequest;
    }
}
