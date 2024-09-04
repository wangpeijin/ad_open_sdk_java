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
import com.bytedance.ads.api.AgentFundTransferSeqCommitV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentFundTransferSeqCommitV2Request;
import com.bytedance.ads.model.AgentFundTransferSeqCommitV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/fund/transfer_seq/commit/ POST
public class AgentFundTransferSeqCommitV2ApiExample {

    private static final AgentFundTransferSeqCommitV2Api api = new AgentFundTransferSeqCommitV2Api();

    public static void main(String[] args) throws ApiException {
        AgentFundTransferSeqCommitV2Request agentFundTransferSeqCommitV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentFundTransferSeqCommitV2Response response = api.openApi2AgentFundTransferSeqCommitPost(agentFundTransferSeqCommitV2Request);
        System.out.println(response);
    }

}