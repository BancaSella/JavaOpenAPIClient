package it.sella.openapiclient.creator;

import it.sella.openapiclient.generic.HttpMethodTypes;
import java.util.Hashtable;
import java.util.Map;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.entity.StringEntity;

public class HttpMethodCreator {
    private static final Map<String, String> httpMethodMap = new Hashtable<String, String>();
    
    static {
        httpMethodMap.put(HttpMethodTypes.GET.name(), "it.sella.openapiclient.creator.HttpGetMethodCreator");
        httpMethodMap.put(HttpMethodTypes.POST.name(), "it.sella.openapiclient.creator.HttpPostMethodCreator");
        httpMethodMap.put(HttpMethodTypes.PUT.name(), "it.sella.openapiclient.creator.HttpPutMethodCreator");
        httpMethodMap.put(HttpMethodTypes.DELETE.name(), "it.sella.openapiclient.creator.HttpDeleteMethodCreator");
    }
    
    public static HttpRequestBase create(String method, String requestURL, StringEntity entity) {
        HttpRequestBase request = ((IHttpMethodCreator) ClassInstantiator.createInstance(httpMethodMap.get(method))).create(requestURL, entity);
        request.addHeader("content-type", "application/json");
        return request;
    }
}
