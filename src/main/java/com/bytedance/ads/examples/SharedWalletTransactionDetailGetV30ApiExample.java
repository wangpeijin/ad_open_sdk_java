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
import com.bytedance.ads.api.SharedWalletTransactionDetailGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30AccountType;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/shared_wallet/transaction_detail/get/ GET
public class SharedWalletTransactionDetailGetV30ApiExample {

    private static final SharedWalletTransactionDetailGetV30Api api = new SharedWalletTransactionDetailGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        SharedWalletTransactionDetailGetV30AccountType accountType = null;
        Long sharedWalletId = null;
        String startDate = null;
        String endDate = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        SharedWalletTransactionDetailGetV30Response response = api.openApiV30SharedWalletTransactionDetailGetGet(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize);
        System.out.println(response);
    }

}