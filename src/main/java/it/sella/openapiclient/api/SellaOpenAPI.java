package it.sella.openapiclient.api;

public class SellaOpenAPI {
    private static SellaOpenAPI openAPI = new SellaOpenAPI();
    public EMoneyClient EMONEY;
    public OnboardingClient ONBOARDING;
    public SEPAClient SEPA;
    public BankingClient BANKING;
    
    private SellaOpenAPI() {
        EMONEY = new EMoneyClient();
        ONBOARDING = new OnboardingClient();
        SEPA =  new SEPAClient();
        BANKING = new BankingClient();
    }
    
    public static SellaOpenAPI getClient() {
        return openAPI;
    }
}
