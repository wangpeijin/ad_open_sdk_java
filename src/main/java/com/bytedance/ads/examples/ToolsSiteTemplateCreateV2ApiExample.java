/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsSiteTemplateCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2Request;
import com.bytedance.ads.model.ToolsSiteTemplateCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/site_template/create/ POST
public class ToolsSiteTemplateCreateV2ApiExample {

    private static final ToolsSiteTemplateCreateV2Api api = new ToolsSiteTemplateCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsSiteTemplateCreateV2Request toolsSiteTemplateCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSiteTemplateCreateV2Response response = api.openApi2ToolsSiteTemplateCreatePost(toolsSiteTemplateCreateV2Request);
        System.out.println(response);
    }

}