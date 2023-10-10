/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsSearchBidRatioGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSearchBidRatioGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/search_bid_ratio/get/ GET
public class ToolsSearchBidRatioGetV2ApiExample {

    private static final ToolsSearchBidRatioGetV2Api api = new ToolsSearchBidRatioGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSearchBidRatioGetV2Response response = api.openApi2ToolsSearchBidRatioGetGet(advertiserId, adId);
        System.out.println(response);
    }

}