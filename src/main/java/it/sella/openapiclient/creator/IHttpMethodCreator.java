package it.sella.openapiclient.creator;

import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;

public interface IHttpMethodCreator {

    HttpRequestBase create(String requestURL, StringEntity entity);
    
}
