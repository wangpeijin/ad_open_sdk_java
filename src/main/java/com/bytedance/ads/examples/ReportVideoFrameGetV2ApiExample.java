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
import com.bytedance.ads.api.ReportVideoFrameGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportVideoFrameGetV2Filtering;
import com.bytedance.ads.model.ReportVideoFrameGetV2Metrics;
import com.bytedance.ads.model.ReportVideoFrameGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/video/frame/get/ GET
public class ReportVideoFrameGetV2ApiExample {

    private static final ReportVideoFrameGetV2Api api = new ReportVideoFrameGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        ReportVideoFrameGetV2Filtering filtering = null;
        List<ReportVideoFrameGetV2Metrics> metrics = null;
        String startDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportVideoFrameGetV2Response response = api.openApi2ReportVideoFrameGetGet(advertiserId, endDate, filtering, metrics, startDate);
        System.out.println(response);
    }

}