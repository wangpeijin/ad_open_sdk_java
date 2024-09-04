/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsCommentMetricsGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentMetricsGetV30Filtering;
import com.bytedance.ads.model.ToolsCommentMetricsGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment_metrics/get/ GET
public class ToolsCommentMetricsGetV30ApiExample {

    private static final ToolsCommentMetricsGetV30Api api = new ToolsCommentMetricsGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startTime = null;
        String endTime = null;
        ToolsCommentMetricsGetV30Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentMetricsGetV30Response response = api.openApiV30ToolsCommentMetricsGetGet(advertiserId, startTime, endTime, filtering);
        System.out.println(response);
    }

}