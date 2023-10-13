/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsKeywordsBidRatioDeleteV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsKeywordsBidRatioDeleteV30Request;
import com.bytedance.ads.model.ToolsKeywordsBidRatioDeleteV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/keywords_bid_ratio/delete/ POST
public class ToolsKeywordsBidRatioDeleteV30ApiExample {

    private static final ToolsKeywordsBidRatioDeleteV30Api api = new ToolsKeywordsBidRatioDeleteV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsKeywordsBidRatioDeleteV30Request toolsKeywordsBidRatioDeleteV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsKeywordsBidRatioDeleteV30Response response = api.openApiV30ToolsKeywordsBidRatioDeletePost(toolsKeywordsBidRatioDeleteV30Request);
        System.out.println(response);
    }

}