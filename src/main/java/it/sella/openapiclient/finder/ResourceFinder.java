package it.sella.openapiclient.finder;

import java.util.ResourceBundle;

public class ResourceFinder {
    private final ResourceBundle resourceBundle = ResourceBundle.getBundle("uri_method_mapper");
    private static final ResourceFinder finder = new ResourceFinder();
    
    public static synchronized ResourceFinder getInstance() {
        return finder;
    }
    
    public String getMethod(String uriKey) {
        return this.resourceBundle.getString(uriKey);
    }
}
