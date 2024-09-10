/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsSiteCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSiteCreateV2Request;
import com.bytedance.ads.model.ToolsSiteCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/site/create/ POST
public class ToolsSiteCreateV2ApiExample {

    private static final ToolsSiteCreateV2Api api = new ToolsSiteCreateV2Api();

    public static void main(String[] args) throws ApiException {
        String xOrangeCaller = null;
        ToolsSiteCreateV2Request toolsSiteCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSiteCreateV2Response response = api.openApi2ToolsSiteCreatePost(xOrangeCaller, toolsSiteCreateV2Request);
        System.out.println(response);
    }

}