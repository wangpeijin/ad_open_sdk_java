/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsBlueFlowKeywordListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsBlueFlowKeywordListV30Filtering;
import com.bytedance.ads.model.ToolsBlueFlowKeywordListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/blue_flow_keyword/list/ GET
public class ToolsBlueFlowKeywordListV30ApiExample {

    private static final ToolsBlueFlowKeywordListV30Api api = new ToolsBlueFlowKeywordListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long projectId = null;
        ToolsBlueFlowKeywordListV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsBlueFlowKeywordListV30Response response = api.openApiV30ToolsBlueFlowKeywordListGet(advertiserId, projectId, filtering);
        System.out.println(response);
    }

}