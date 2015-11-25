package it.sella.openapiclient.creator;

import org.apache.http.client.methods.HttpDelete;
import org.apache.http.entity.StringEntity;

public class HttpDeleteMethodCreator implements IHttpMethodCreator {
    @Override
    public HttpDelete create(String requestURL, StringEntity entity) {
        return new HttpDelete(requestURL);
    }
}
