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
import com.bytedance.ads.api.AgentFundTransferSeqCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentFundTransferSeqCreateV2Request;
import com.bytedance.ads.model.AgentFundTransferSeqCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/fund/transfer_seq/create/ POST
public class AgentFundTransferSeqCreateV2ApiExample {

    private static final AgentFundTransferSeqCreateV2Api api = new AgentFundTransferSeqCreateV2Api();

    public static void main(String[] args) throws ApiException {
        AgentFundTransferSeqCreateV2Request agentFundTransferSeqCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentFundTransferSeqCreateV2Response response = api.openApi2AgentFundTransferSeqCreatePost(agentFundTransferSeqCreateV2Request);
        System.out.println(response);
    }

}