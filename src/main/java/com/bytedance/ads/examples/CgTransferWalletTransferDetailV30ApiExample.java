/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferWalletTransferDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferDetailV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/wallet/transfer/detail/ GET
public class CgTransferWalletTransferDetailV30ApiExample {

    private static final CgTransferWalletTransferDetailV30Api api = new CgTransferWalletTransferDetailV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        CgTransferWalletTransferDetailV30AccountType accountType = null;
        String bizRequestNo = null;
        String transferBizRequestNo = null;
        String transferSerial = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferWalletTransferDetailV30Response response = api.openApiV30CgTransferWalletTransferDetailGet(accountId, accountType, bizRequestNo, transferBizRequestNo, transferSerial);
        System.out.println(response);
    }

}