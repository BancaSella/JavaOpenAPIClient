package it.sella.openapiclient.generic;

import it.sella.openapiclient.creator.HttpMethodCreator;
import it.sella.openapiclient.finder.ResourceFinder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class RestAPIClientTemplate {

//    public abstract HttpResponse execute(HttpRequestBase request);
    private final String SANDBOX_URL = "sandbox.openapi.sella.it";
    private final String PROTOCOL = "https";
    public static final String INVALID_REST_INVOCATION_ERROR = "Invalid REST Invocation - Please check the URI you request";
    
    public String invokeRest(String requestURI) {
        return invokeRest(requestURI, null);
    }
    
    public String invokeRest(String requestURI, StringEntity entity) {
        String httpMethodString = ResourceFinder.getInstance().getMethod(requestURI);
        HttpClient client = initiateHttpClient();
        HttpHost target = new HttpHost(SANDBOX_URL, 443, PROTOCOL);
        HttpResponse response;
        String output;
        try {
            response = client.execute(target, HttpMethodCreator.create(httpMethodString, requestURI, entity));
            output = processResponse(response.getEntity());
        } catch (IOException ioException) {
            // This situation is not expected
            Logger.getLogger(RestAPIClientTemplate.class.getName()).log(Level.SEVERE, null, ioException);
            throw new InvalidRestInvocationException(INVALID_REST_INVOCATION_ERROR, ioException);
        }
        return output;
    }
    
    public CloseableHttpClient initiateHttpClient() {
        return HttpClients.createDefault();
    }
    
    public String processResponse(HttpEntity entity) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((entity.getContent())));
        String output;
        StringBuilder outputBuffer = new StringBuilder();
        while ((output = reader.readLine()) != null) {
            outputBuffer.append(output);
        }
        return outputBuffer.toString();
    }
    
/*    public String get(String requestURL) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet getRequest = new HttpGet(requestURL);
        getRequest.addHeader("accept", "application/json");
        HttpResponse response = httpClient.execute(getRequest);
        if (response.getStatusLine().getStatusCode() != 200) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatusLine().getStatusCode());
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));
        String output;
        StringBuilder outputBuffer = new StringBuilder();
        while ((output = reader.readLine()) != null) {
            outputBuffer.append(output);
        }
        httpClient.getConnectionManager().shutdown();
        return outputBuffer.toString();
    }

    public String post(String requestURL) throws IOException {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpPost postRequest = new HttpPost(requestURL);
        postRequest.addHeader("accept", "application/json");
        JSONObject json = new JSONObject();
        json.put("codiceIb", "");
        json.put("email", "");
        StringEntity se = new StringEntity(json.toString());
        postRequest.setEntity(se);
        System.out.println("Before httpclient execute" + postRequest);
        HttpResponse response = httpClient.execute(postRequest);
        if (response.getStatusLine().getStatusCode() != 201) {
            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatusLine().getStatusCode());
        }
        BufferedReader reader = new BufferedReader(
                new InputStreamReader((response.getEntity().getContent())));
        String output;
        StringBuilder outputBuffer = new StringBuilder();
        while ((output = reader.readLine()) != null) {
            outputBuffer.append(output);
        }
        httpClient.getConnectionManager().shutdown();
        return outputBuffer.toString();
    }*/
}
