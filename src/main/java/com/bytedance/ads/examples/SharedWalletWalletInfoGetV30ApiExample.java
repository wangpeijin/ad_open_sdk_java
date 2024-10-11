/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.SharedWalletWalletInfoGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30AccountType;
import com.bytedance.ads.model.SharedWalletWalletInfoGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/shared_wallet/wallet_info/get/ GET
public class SharedWalletWalletInfoGetV30ApiExample {

    private static final SharedWalletWalletInfoGetV30Api api = new SharedWalletWalletInfoGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        List<Long> walletIdList = null;
        SharedWalletWalletInfoGetV30AccountType accountType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SharedWalletWalletInfoGetV30Response response = api.openApiV30SharedWalletWalletInfoGetGet(accountId, walletIdList, accountType);
        System.out.println(response);
    }

}