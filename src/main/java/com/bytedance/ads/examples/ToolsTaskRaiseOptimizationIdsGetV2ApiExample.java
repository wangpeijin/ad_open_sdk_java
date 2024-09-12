/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsTaskRaiseOptimizationIdsGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsTaskRaiseOptimizationIdsGetV2PlatformVersion;
import com.bytedance.ads.model.ToolsTaskRaiseOptimizationIdsGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/task_raise/optimization_ids/get/ GET
public class ToolsTaskRaiseOptimizationIdsGetV2ApiExample {

    private static final ToolsTaskRaiseOptimizationIdsGetV2Api api = new ToolsTaskRaiseOptimizationIdsGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsTaskRaiseOptimizationIdsGetV2PlatformVersion platformVersion = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsTaskRaiseOptimizationIdsGetV2Response response = api.openApi2ToolsTaskRaiseOptimizationIdsGetGet(advertiserId, platformVersion);
        System.out.println(response);
    }

}