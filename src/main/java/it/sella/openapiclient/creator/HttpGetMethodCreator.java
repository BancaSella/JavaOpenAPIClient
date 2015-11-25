package it.sella.openapiclient.creator;

import org.apache.http.client.methods.HttpGet;
import org.apache.http.entity.StringEntity;

public class HttpGetMethodCreator implements IHttpMethodCreator {
    @Override
    public HttpGet create(String requestURL, StringEntity entity) {
        return (new HttpGet(requestURL));
    }
}
