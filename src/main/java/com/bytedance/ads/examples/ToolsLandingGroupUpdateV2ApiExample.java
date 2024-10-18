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
import com.bytedance.ads.api.ToolsLandingGroupUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsLandingGroupUpdateV2Request;
import com.bytedance.ads.model.ToolsLandingGroupUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/landing_group/update/ POST
public class ToolsLandingGroupUpdateV2ApiExample {

    private static final ToolsLandingGroupUpdateV2Api api = new ToolsLandingGroupUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        String xOrangeCaller = null;
        ToolsLandingGroupUpdateV2Request toolsLandingGroupUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsLandingGroupUpdateV2Response response = api.openApi2ToolsLandingGroupUpdatePost(xOrangeCaller, toolsLandingGroupUpdateV2Request);
        System.out.println(response);
    }

}