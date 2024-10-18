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
import com.bytedance.ads.api.AicMixcutTaskResultGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AicMixcutTaskResultGetV30AccountType;
import com.bytedance.ads.model.AicMixcutTaskResultGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/aic/mixcut_task/result/get/ GET
public class AicMixcutTaskResultGetV30ApiExample {

    private static final AicMixcutTaskResultGetV30Api api = new AicMixcutTaskResultGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        AicMixcutTaskResultGetV30AccountType accountType = null;
        String taskId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AicMixcutTaskResultGetV30Response response = api.openApiV30AicMixcutTaskResultGetGet(accountId, accountType, taskId);
        System.out.println(response);
    }

}