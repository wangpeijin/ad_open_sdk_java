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
import com.bytedance.ads.api.ReportRubeexGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportRubeexGetV2Filtering;
import com.bytedance.ads.model.ReportRubeexGetV2Order;
import com.bytedance.ads.model.ReportRubeexGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/rubeex/get/ GET
public class ReportRubeexGetV2ApiExample {

    private static final ReportRubeexGetV2Api api = new ReportRubeexGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> dimensions = null;
        ReportRubeexGetV2Filtering filtering = null;
        List<String> metrics = null;
        ReportRubeexGetV2Order order = null;
        Long page = null;
        Long pageSize = null;
        Long projectId = null;
        List<String> statTimeDay = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportRubeexGetV2Response response = api.openApi2ReportRubeexGetGet(advertiserId, dimensions, filtering, metrics, order, page, pageSize, projectId, statTimeDay);
        System.out.println(response);
    }

}