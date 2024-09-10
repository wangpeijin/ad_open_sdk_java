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
import com.bytedance.ads.api.ToolsPrivativeWordCampaignUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignUpdateV2Request;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/privative_word/campaign/update/ POST
public class ToolsPrivativeWordCampaignUpdateV2ApiExample {

    private static final ToolsPrivativeWordCampaignUpdateV2Api api = new ToolsPrivativeWordCampaignUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordCampaignUpdateV2Request toolsPrivativeWordCampaignUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordCampaignUpdateV2Response response = api.openApi2ToolsPrivativeWordCampaignUpdatePost(toolsPrivativeWordCampaignUpdateV2Request);
        System.out.println(response);
    }

}