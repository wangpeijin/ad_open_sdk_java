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
import com.bytedance.ads.api.StarReportCustomDataTopicDailyReportV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2Response;
import com.bytedance.ads.model.StarReportCustomDataTopicDailyReportV2Topics;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/report/custom_data_topic_daily_report/ GET
public class StarReportCustomDataTopicDailyReportV2ApiExample {

    private static final StarReportCustomDataTopicDailyReportV2Api api = new StarReportCustomDataTopicDailyReportV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long workId = null;
        Long demandId = null;
        List<StarReportCustomDataTopicDailyReportV2Topics> topics = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarReportCustomDataTopicDailyReportV2Response response = api.openApi2StarReportCustomDataTopicDailyReportGet(starId, workId, demandId, topics, startTime, endTime);
        System.out.println(response);
    }

}