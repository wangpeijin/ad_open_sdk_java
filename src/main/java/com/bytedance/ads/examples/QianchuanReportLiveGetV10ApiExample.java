/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportLiveGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportLiveGetV10Response;
import com.bytedance.ads.model.QianchuanReportLiveGetV10StatsAuthority;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/live/get/ GET
public class QianchuanReportLiveGetV10ApiExample {

    private static final QianchuanReportLiveGetV10Api api = new QianchuanReportLiveGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        String startTime = null;
        String endTime = null;
        List<String> fields = null;
        QianchuanReportLiveGetV10StatsAuthority statsAuthority = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportLiveGetV10Response response = api.openApiV10QianchuanReportLiveGetGet(advertiserId, awemeId, startTime, endTime, fields, statsAuthority);
        System.out.println(response);
    }

}