/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportCreativeGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCreativeGetV2Filtering;
import com.bytedance.ads.model.ReportCreativeGetV2GroupBy;
import com.bytedance.ads.model.ReportCreativeGetV2OrderField;
import com.bytedance.ads.model.ReportCreativeGetV2OrderType;
import com.bytedance.ads.model.ReportCreativeGetV2Response;
import com.bytedance.ads.model.ReportCreativeGetV2TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/creative/get/ GET
public class ReportCreativeGetV2ApiExample {

    private static final ReportCreativeGetV2Api api = new ReportCreativeGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        List<String> fields = null;
        ReportCreativeGetV2Filtering filtering = null;
        List<ReportCreativeGetV2GroupBy> groupBy = null;
        ReportCreativeGetV2OrderField orderField = null;
        ReportCreativeGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startDate = null;
        ReportCreativeGetV2TimeGranularity timeGranularity = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCreativeGetV2Response response = api.openApi2ReportCreativeGetGet(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity);
        System.out.println(response);
    }

}