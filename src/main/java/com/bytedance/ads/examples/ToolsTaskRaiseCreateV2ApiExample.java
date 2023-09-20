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
import com.bytedance.ads.api.ToolsTaskRaiseCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsTaskRaiseCreateV2Request;
import com.bytedance.ads.model.ToolsTaskRaiseCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/task_raise/create/ POST
public class ToolsTaskRaiseCreateV2ApiExample {

    private static final ToolsTaskRaiseCreateV2Api api = new ToolsTaskRaiseCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsTaskRaiseCreateV2Request toolsTaskRaiseCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsTaskRaiseCreateV2Response response = api.openApi2ToolsTaskRaiseCreatePost(toolsTaskRaiseCreateV2Request);
        System.out.println(response);
    }

}