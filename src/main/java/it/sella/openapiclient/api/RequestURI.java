package it.sella.openapiclient.api;

public enum RequestURI {

    SEND_MONEY("/lightbanking/v1/accounts/emoney/send"),
    REQUEST_MONEY("/lightbanking/v1/accounts/emoney/request"),
    RECEIVE_MONEY("/lightbanking/v1/accounts/emoney/receive"),
    CANCEL_PAYMENT("/lightbanking/v1/accounts/emoney/cancelsend"),
    GET_PENDING_TRANSACTIONS("/lightbanking/v1/accounts/emoney/movements/pending"),
    CREATE_ALIAS("/lightbanking/v1/accounts/emoney/addalias"),
    CONFIRM_ALIAS("/lightbanking/v1/accounts/emoney/confirmalias"),
    GET_ACTIVE_ALIASES("/lightbanking/v1/user/alias/list/active"),
    GET_INACTIVE_ALIASES("/lightbanking/v1/user/alias/list/inactive"),
    GET_LIGHT_BALANCE("/lightbanking/v1/balance/getbalance"),
    GET_LIGHT_TRANSACTION_LIST("/lightbanking/v1/transaction/list"),
    SEND_MONEY_TO_ACCOUNT("/lightbanking/v1/hype/moneytransfer"),
    SEND_MONEY_TO_MERCHANT("/lightbanking/v1/hype/paywithhype"),
    GET_MONEY_VIA_CARD("/lightbanking/v1/pdc/rechargefromcard"),
    WIRE_TRANSFER("/banking/v1/payments/fundtransfer"),
    GET_BALANCE("/banking/v1/balance/getbalance"),
    GET_TRANSACTIONS("/banking/v1/accounts/movementslist"),
    GET_MONEY_VIA_SDD("/banking/v1/rechargesdd"),
    GET_BUSINESS_OBJECT_TYPE_LIST("/banking/v1/sepa/getbusinessobjecttypelist"),
    GET_ACCOUNT_LIST("/banking/v1/sepa/getaccountlist"),
    GET_BUSINESS_OBJECT_DATA("/banking/v1/sepa/getbusinessobjectdata"),
    GET_ACCOUNT_DETAILS("/banking/v1/accounts/getaccountdetails"),
    GET_CARD_DETAILS("/banking/v1/accounts/getcarddetails"),
    GET_USER_CONTRACT("/onboarding/v1/contacts/12345/contract"),
    SET_DOCUMENT_PICTURE("/onboarding/v1/contacts/12345/document"),
    GET_TERMS_AND_CONDITIONS("/onboarding/v1/tnc"),
    CREATE_USER("/onboarding/v1/contacts"),
    SET_USER_PICTURE("/onboarding/v1/contacts/12345/profilepic");

    public String uri;

    RequestURI(final String uri) {
        this.uri = uri;
    }
}
