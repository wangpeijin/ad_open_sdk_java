/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsSuggestBudgetGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsSuggestBudgetGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/suggest_budget/get/ GET
public class ToolsSuggestBudgetGetV30ApiExample {

    private static final ToolsSuggestBudgetGetV30Api api = new ToolsSuggestBudgetGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> promotionIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsSuggestBudgetGetV30Response response = api.openApiV30ToolsSuggestBudgetGetGet(advertiserId, promotionIds);
        System.out.println(response);
    }

}