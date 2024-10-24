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
import com.bytedance.ads.api.ReportLiveRoomAudiencePortraitGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportLiveRoomAudiencePortraitGetV2Dimension;
import com.bytedance.ads.model.ReportLiveRoomAudiencePortraitGetV2Filtering;
import com.bytedance.ads.model.ReportLiveRoomAudiencePortraitGetV2OrderField;
import com.bytedance.ads.model.ReportLiveRoomAudiencePortraitGetV2OrderType;
import com.bytedance.ads.model.ReportLiveRoomAudiencePortraitGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/live_room/audience/portrait/get/ GET
public class ReportLiveRoomAudiencePortraitGetV2ApiExample {

    private static final ReportLiveRoomAudiencePortraitGetV2Api api = new ReportLiveRoomAudiencePortraitGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ReportLiveRoomAudiencePortraitGetV2Dimension dimension = null;
        String endTime = null;
        List<String> fields = null;
        ReportLiveRoomAudiencePortraitGetV2Filtering filtering = null;
        ReportLiveRoomAudiencePortraitGetV2OrderField orderField = null;
        ReportLiveRoomAudiencePortraitGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportLiveRoomAudiencePortraitGetV2Response response = api.openApi2ReportLiveRoomAudiencePortraitGetGet(advertiserId, dimension, endTime, fields, filtering, orderField, orderType, page, pageSize, startTime);
        System.out.println(response);
    }

}