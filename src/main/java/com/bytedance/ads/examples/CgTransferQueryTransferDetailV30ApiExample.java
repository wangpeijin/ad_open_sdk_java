/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CgTransferQueryTransferDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CgTransferQueryTransferDetailV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/cg_transfer/query_transfer_detail/ GET
public class CgTransferQueryTransferDetailV30ApiExample {

    private static final CgTransferQueryTransferDetailV30Api api = new CgTransferQueryTransferDetailV30Api();

    public static void main(String[] args) throws ApiException {
        String bizRequestNo = null;
        Long agentId = null;
        String transferBizRequestNo = null;
        String transferSerial = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CgTransferQueryTransferDetailV30Response response = api.openApiV30CgTransferQueryTransferDetailGet(bizRequestNo, agentId, transferBizRequestNo, transferSerial);
        System.out.println(response);
    }

}