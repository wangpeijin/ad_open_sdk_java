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
import com.bytedance.ads.api.ToolsClueInfoUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueInfoUpdateV2Request;
import com.bytedance.ads.model.ToolsClueInfoUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/info/update/ POST
public class ToolsClueInfoUpdateV2ApiExample {

    private static final ToolsClueInfoUpdateV2Api api = new ToolsClueInfoUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueInfoUpdateV2Request toolsClueInfoUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueInfoUpdateV2Response response = api.openApi2ToolsClueInfoUpdatePost(toolsClueInfoUpdateV2Request);
        System.out.println(response);
    }

}