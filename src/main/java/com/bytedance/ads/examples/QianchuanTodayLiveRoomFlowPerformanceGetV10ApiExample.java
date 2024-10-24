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
import com.bytedance.ads.api.QianchuanTodayLiveRoomFlowPerformanceGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource;
import com.bytedance.ads.model.QianchuanTodayLiveRoomFlowPerformanceGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/today_live/room/flow_performance/get/ GET
public class QianchuanTodayLiveRoomFlowPerformanceGetV10ApiExample {

    private static final QianchuanTodayLiveRoomFlowPerformanceGetV10Api api = new QianchuanTodayLiveRoomFlowPerformanceGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long roomId = null;
        QianchuanTodayLiveRoomFlowPerformanceGetV10FlowSource flowSource = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanTodayLiveRoomFlowPerformanceGetV10Response response = api.openApiV10QianchuanTodayLiveRoomFlowPerformanceGetGet(advertiserId, roomId, flowSource);
        System.out.println(response);
    }

}