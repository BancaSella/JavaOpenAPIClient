package it.sella.openapiclient.main;

import it.sella.openapiclient.api.EMoneyClient;
import it.sella.openapiclient.request.JSONRequest;

public class Client {
    public static void main(String[] args) throws Exception {
        EMoneyClient cl = new EMoneyClient();
        JSONRequest aliasJson = new JSONRequest();
        aliasJson.put("alias", "test@gmail.com");
        aliasJson.put("aliasType","EMAIL");
        System.out.println(cl.createAlias(aliasJson));
    }
}
