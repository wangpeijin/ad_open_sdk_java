/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAbTestInfoGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAbTestInfoGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ab_test_info/get/ GET
public class ToolsAbTestInfoGetV2ApiExample {

    private static final ToolsAbTestInfoGetV2Api api = new ToolsAbTestInfoGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long testId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAbTestInfoGetV2Response response = api.openApi2ToolsAbTestInfoGetGet(advertiserId, testId);
        System.out.println(response);
    }

}