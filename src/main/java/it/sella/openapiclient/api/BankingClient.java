package it.sella.openapiclient.api;

import it.sella.openapiclient.request.JSONRequest;

public class BankingClient extends GenericClient {
    public String getBalance(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_BALANCE.uri, processJsonRequest(aliasJson));
    }
    
    public String getTransactions(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_TRANSACTIONS.uri, processJsonRequest(aliasJson));
    }
    
    public String wireTransfer(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.WIRE_TRANSFER.uri, processJsonRequest(aliasJson));
    }
    
    public String getAccountDetails(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_ACCOUNT_DETAILS.uri, processJsonRequest(aliasJson));
    }
    
    public String getCardDetails(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_CARD_DETAILS.uri, processJsonRequest(aliasJson));
    }
}
