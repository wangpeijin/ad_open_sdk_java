/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferQueryCanTransferBalanceV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30Response;
import com.bytedance.ads.model.CgTransferQueryCanTransferBalanceV30TransferDirection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/query_can_transfer_balance/ GET
public class CgTransferQueryCanTransferBalanceV30ApiExample {

    private static final CgTransferQueryCanTransferBalanceV30Api api = new CgTransferQueryCanTransferBalanceV30Api();

    public static void main(String[] args) throws ApiException {
        String bizRequestNo = null;
        Long agentId = null;
        Long accountId = null;
        List<Long> targetAccountIdList = null;
        CgTransferQueryCanTransferBalanceV30TransferDirection transferDirection = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferQueryCanTransferBalanceV30Response response = api.openApiV30CgTransferQueryCanTransferBalanceGet(bizRequestNo, agentId, accountId, targetAccountIdList, transferDirection);
        System.out.println(response);
    }

}