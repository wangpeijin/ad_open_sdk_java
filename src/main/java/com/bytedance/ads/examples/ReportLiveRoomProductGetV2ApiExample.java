/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportLiveRoomProductGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportLiveRoomProductGetV2Filtering;
import com.bytedance.ads.model.ReportLiveRoomProductGetV2OrderField;
import com.bytedance.ads.model.ReportLiveRoomProductGetV2OrderType;
import com.bytedance.ads.model.ReportLiveRoomProductGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/live_room/product/get/ GET
public class ReportLiveRoomProductGetV2ApiExample {

    private static final ReportLiveRoomProductGetV2Api api = new ReportLiveRoomProductGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<String> fields = null;
        ReportLiveRoomProductGetV2Filtering filtering = null;
        ReportLiveRoomProductGetV2OrderField orderField = null;
        ReportLiveRoomProductGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportLiveRoomProductGetV2Response response = api.openApi2ReportLiveRoomProductGetGet(advertiserId, endTime, fields, filtering, orderField, orderType, page, pageSize, startTime);
        System.out.println(response);
    }

}