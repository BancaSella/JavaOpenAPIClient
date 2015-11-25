package it.sella.openapiclient.creator;

import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;

public class HttpPutMethodCreator implements IHttpMethodCreator {
    @Override
    public HttpPut create(String requestURL, StringEntity entity) {
        return new HttpPut(requestURL);
    }
}
