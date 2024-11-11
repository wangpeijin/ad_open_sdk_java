/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsTaskRaiseGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsTaskRaiseGetV2PlatformVersion;
import com.bytedance.ads.model.ToolsTaskRaiseGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/task_raise/get/ GET
public class ToolsTaskRaiseGetV2ApiExample {

    private static final ToolsTaskRaiseGetV2Api api = new ToolsTaskRaiseGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        ToolsTaskRaiseGetV2PlatformVersion platformVersion = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsTaskRaiseGetV2Response response = api.openApi2ToolsTaskRaiseGetGet(advertiserId, page, pageSize, platformVersion);
        System.out.println(response);
    }

}