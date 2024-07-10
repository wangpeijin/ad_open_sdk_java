/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsThirdSiteCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsThirdSiteCreateV2Request;
import com.bytedance.ads.model.ToolsThirdSiteCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/third_site/create/ POST
public class ToolsThirdSiteCreateV2ApiExample {

    private static final ToolsThirdSiteCreateV2Api api = new ToolsThirdSiteCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsThirdSiteCreateV2Request toolsThirdSiteCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsThirdSiteCreateV2Response response = api.openApi2ToolsThirdSiteCreatePost(toolsThirdSiteCreateV2Request);
        System.out.println(response);
    }

}