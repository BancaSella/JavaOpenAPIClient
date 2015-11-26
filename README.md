## Introduction
This repository represents the client source code for the OpenAPI services provided by Banca Sella. Using this client library you can make direct simple Java method calls from your application to consume the REST services exposed.

## Alternative
If you are a kind of person who prefer to live with your own implementation client, you can read the complete contract definition and documentation of our API in our [APIPortal site](https://openapi.sella.it/) and design your client accordingly.

## Client Handles
The following are the client handles that we have exposed for our REST services. 
* **BANKING**
  * getBalance
  * getTransactions
  * wireTransfer
  * getAccountDetails
  * getCardDetails 
* **EMONEY**
  * getBalance
  * getTransactions
  * getActiveAliases
  * getInactiveAliases
  * createAlias
  * confirmAlias
  * cancelMoneyRequest
  * cancelPayment
  * getPendingTransactions
  * sendMoney
  * requestMoney
  * receiveMoney
  * sendMoneyToAccount
  * sendMoneyToMerchant
  * getMoneyViaCreditCard
  * getMoneyViaSDD
* **ONBOARDING**
  * getUserContract
  * getTermsAndConditions
  * createUser
  * setUserPicture
  * setDocumentPicture
* **SEPA**
  * getBusinessObjectTypeList
  * getBusinessObjectData
  * getAccountList

With our library you need not bother about mentioning the appropriate HTTP method. We have designed our client library in such a way to decide itself the right HTTP method and perform invocation on your behalf.

## Usage
Invoking our client library (there-by invoking the actual REST) is quite simple and straightforward. Let's take an example of `getBalance` API inside `Banking`. All you need to do to invoke this service from our client library is
```java
SellaOpenAPI.getClient().BANKING.getBalance();
```
We have designed our client library in such a way to have the same name as that of the actual API. Also the categorization of `Banking`, `EMoney` so on are similar except for the CAPS case.
Similarly, here is a sample of a client call for `EMONEY.createAlias()` to invoke an API with some parameter(s) or input passed. All you have to do here is to use our `it.sella.openapiclient.request.JSONRequest` object:
```java
JSONRequest aliasJson = new JSONRequest();
aliasJson.put("alias", "test@gmail.com");
aliasJson.put("aliasType","EMAIL");
SellaOpenAPI.getClient().EMONEY.createAlias(aliasJson);
```

