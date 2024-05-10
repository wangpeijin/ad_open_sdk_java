/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AccountFundGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AccountFundGetV30AccountType;
import com.bytedance.ads.model.AccountFundGetV30GrantTypeSplit;
import com.bytedance.ads.model.AccountFundGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/account/fund/get/ GET
public class AccountFundGetV30ApiExample {

    private static final AccountFundGetV30Api api = new AccountFundGetV30Api();

    public static void main(String[] args) throws ApiException {
        List<Long> accountIds = null;
        AccountFundGetV30AccountType accountType = null;
        AccountFundGetV30GrantTypeSplit grantTypeSplit = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AccountFundGetV30Response response = api.openApiV30AccountFundGetGet(accountIds, accountType, grantTypeSplit);
        System.out.println(response);
    }

}