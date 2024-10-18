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
import com.bytedance.ads.api.DiagnosisTaskAdvGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DiagnosisTaskAdvGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/diagnosis_task/adv/get/ GET
public class DiagnosisTaskAdvGetV2ApiExample {

    private static final DiagnosisTaskAdvGetV2Api api = new DiagnosisTaskAdvGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> taskIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DiagnosisTaskAdvGetV2Response response = api.openApi2DiagnosisTaskAdvGetGet(advertiserId, taskIds);
        System.out.println(response);
    }

}