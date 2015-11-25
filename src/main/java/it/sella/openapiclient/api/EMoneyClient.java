package it.sella.openapiclient.api;

import it.sella.openapiclient.request.JSONRequest;

public class EMoneyClient extends GenericClient {
    
    public String cancelMoneyRequest(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.CANCEL_PAYMENT.uri, processJsonRequest(aliasJson));
    }
    
    public String createAlias(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.CREATE_ALIAS.uri, processJsonRequest(aliasJson));
    }

    public String confirmAlias(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.CONFIRM_ALIAS.uri, processJsonRequest(aliasJson));
    }
    
    public String getActiveAliases(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_ACTIVE_ALIASES.uri, processJsonRequest(aliasJson));
    }
    
    public String getInactiveAliases(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_INACTIVE_ALIASES.uri, processJsonRequest(aliasJson));
    }
    
    public String sendMoney(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.SEND_MONEY.uri, processJsonRequest(aliasJson));
    }
    
    public String cancelPayment(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.CANCEL_PAYMENT.uri, processJsonRequest(aliasJson));
    }
    
    public String requestMoney(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.REQUEST_MONEY.uri, processJsonRequest(aliasJson));
    }
    
    public String receiveMoney(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.RECEIVE_MONEY.uri, processJsonRequest(aliasJson));
    }
    
    public String getPendingTransactions(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_PENDING_TRANSACTIONS.uri, processJsonRequest(aliasJson));
    }
    
    public String getMoneyViaSDD(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_MONEY_VIA_SDD.uri, processJsonRequest(aliasJson));
    }
    
    public String getBalance(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_LIGHT_BALANCE.uri, processJsonRequest(aliasJson));
    }
    
    public String getTransactions(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_LIGHT_TRANSACTION_LIST.uri, processJsonRequest(aliasJson));
    }
    
    public String sendMoneyToAccount(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.SEND_MONEY_TO_ACCOUNT.uri, processJsonRequest(aliasJson));
    }
    
    public String sendMoneyToMerchant(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.SEND_MONEY_TO_MERCHANT.uri, processJsonRequest(aliasJson));
    }
    
    public String getMoneyViaCard(JSONRequest aliasJson) throws Exception {
        return invokeRest(RequestURI.GET_MONEY_VIA_CARD.uri, processJsonRequest(aliasJson));
    }
    
}
