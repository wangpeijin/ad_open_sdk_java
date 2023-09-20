/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FundSharedWalletBalanceGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FundSharedWalletBalanceGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/fund/shared_wallet_balance/get/ GET
public class FundSharedWalletBalanceGetV2ApiExample {

    private static final FundSharedWalletBalanceGetV2Api api = new FundSharedWalletBalanceGetV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FundSharedWalletBalanceGetV2Response response = api.openApi2FundSharedWalletBalanceGetGet(advertiserIds);
        System.out.println(response);
    }

}