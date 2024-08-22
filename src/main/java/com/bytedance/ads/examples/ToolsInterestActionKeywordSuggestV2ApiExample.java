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
import com.bytedance.ads.api.ToolsInterestActionKeywordSuggestV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2ActionDays;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2Response;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2TagType;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2TargetingType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/interest_action/keyword/suggest/ GET
public class ToolsInterestActionKeywordSuggestV2ApiExample {

    private static final ToolsInterestActionKeywordSuggestV2Api api = new ToolsInterestActionKeywordSuggestV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long id = null;
        ToolsInterestActionKeywordSuggestV2TagType tagType = null;
        ToolsInterestActionKeywordSuggestV2TargetingType targetingType = null;
        ToolsInterestActionKeywordSuggestV2ActionDays actionDays = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsInterestActionKeywordSuggestV2Response response = api.openApi2ToolsInterestActionKeywordSuggestGet(advertiserId, id, tagType, targetingType, actionDays);
        System.out.println(response);
    }

}