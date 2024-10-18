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
import com.bytedance.ads.api.ToolsPrivativeWordCampaignAddV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2Request;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/privative_word/campaign/add/ POST
public class ToolsPrivativeWordCampaignAddV2ApiExample {

    private static final ToolsPrivativeWordCampaignAddV2Api api = new ToolsPrivativeWordCampaignAddV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordCampaignAddV2Request toolsPrivativeWordCampaignAddV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordCampaignAddV2Response response = api.openApi2ToolsPrivativeWordCampaignAddPost(toolsPrivativeWordCampaignAddV2Request);
        System.out.println(response);
    }

}