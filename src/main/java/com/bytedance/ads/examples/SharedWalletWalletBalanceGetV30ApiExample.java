/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.SharedWalletWalletBalanceGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30AccountType;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30Response;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30WalletBalanceFilters;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/shared_wallet/wallet_balance/get/ GET
public class SharedWalletWalletBalanceGetV30ApiExample {

    private static final SharedWalletWalletBalanceGetV30Api api = new SharedWalletWalletBalanceGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        SharedWalletWalletBalanceGetV30AccountType accountType = null;
        List<Long> walletIdList = null;
        SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SharedWalletWalletBalanceGetV30Response response = api.openApiV30SharedWalletWalletBalanceGetGet(accountId, accountType, walletIdList, walletBalanceFilters);
        System.out.println(response);
    }

}