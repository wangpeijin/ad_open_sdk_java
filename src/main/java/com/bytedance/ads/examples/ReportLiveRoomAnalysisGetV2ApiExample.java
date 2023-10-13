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
import com.bytedance.ads.api.ReportLiveRoomAnalysisGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportLiveRoomAnalysisGetV2Filtering;
import com.bytedance.ads.model.ReportLiveRoomAnalysisGetV2OrderField;
import com.bytedance.ads.model.ReportLiveRoomAnalysisGetV2OrderType;
import com.bytedance.ads.model.ReportLiveRoomAnalysisGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/live_room/analysis/get/ GET
public class ReportLiveRoomAnalysisGetV2ApiExample {

    private static final ReportLiveRoomAnalysisGetV2Api api = new ReportLiveRoomAnalysisGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<String> fields = null;
        ReportLiveRoomAnalysisGetV2Filtering filtering = null;
        ReportLiveRoomAnalysisGetV2OrderField orderField = null;
        ReportLiveRoomAnalysisGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportLiveRoomAnalysisGetV2Response response = api.openApi2ReportLiveRoomAnalysisGetGet(advertiserId, endTime, fields, filtering, orderField, orderType, page, pageSize, startTime);
        System.out.println(response);
    }

}