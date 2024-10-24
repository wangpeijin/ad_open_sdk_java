/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsNoBidSuggestBidV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2BudgetMode;
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2ExternalAction;
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2Filtering;
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/no_bid/suggest_bid/ GET
public class ToolsNoBidSuggestBidV2ApiExample {

    private static final ToolsNoBidSuggestBidV2Api api = new ToolsNoBidSuggestBidV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long budget = null;
        ToolsNoBidSuggestBidV2BudgetMode budgetMode = null;
        ToolsNoBidSuggestBidV2ExternalAction externalAction = null;
        ToolsNoBidSuggestBidV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsNoBidSuggestBidV2Response response = api.openApi2ToolsNoBidSuggestBidGet(advertiserId, budget, budgetMode, externalAction, filtering);
        System.out.println(response);
    }

}