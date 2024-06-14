/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueExtInfoCallbackV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueExtInfoCallbackV2Request;
import com.bytedance.ads.model.ToolsClueExtInfoCallbackV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/ext_info/callback/ POST
public class ToolsClueExtInfoCallbackV2ApiExample {

    private static final ToolsClueExtInfoCallbackV2Api api = new ToolsClueExtInfoCallbackV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueExtInfoCallbackV2Request toolsClueExtInfoCallbackV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueExtInfoCallbackV2Response response = api.openApi2ToolsClueExtInfoCallbackPost(toolsClueExtInfoCallbackV2Request);
        System.out.println(response);
    }

}