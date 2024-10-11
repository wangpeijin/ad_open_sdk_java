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
import com.bytedance.ads.api.DiagnosisTaskAgentGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/diagnosis_task/agent/get/ GET
public class DiagnosisTaskAgentGetV2ApiExample {

    private static final DiagnosisTaskAgentGetV2Api api = new DiagnosisTaskAgentGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        List<Long> taskIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DiagnosisTaskAgentGetV2Response response = api.openApi2DiagnosisTaskAgentGetGet(agentId, taskIds);
        System.out.println(response);
    }

}