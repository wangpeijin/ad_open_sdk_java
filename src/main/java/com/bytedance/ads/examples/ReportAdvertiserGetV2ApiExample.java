/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportAdvertiserGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportAdvertiserGetV2Filtering;
import com.bytedance.ads.model.ReportAdvertiserGetV2GroupBy;
import com.bytedance.ads.model.ReportAdvertiserGetV2OrderField;
import com.bytedance.ads.model.ReportAdvertiserGetV2OrderType;
import com.bytedance.ads.model.ReportAdvertiserGetV2Response;
import com.bytedance.ads.model.ReportAdvertiserGetV2TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/advertiser/get/ GET
public class ReportAdvertiserGetV2ApiExample {

    private static final ReportAdvertiserGetV2Api api = new ReportAdvertiserGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        List<String> fields = null;
        ReportAdvertiserGetV2Filtering filtering = null;
        List<ReportAdvertiserGetV2GroupBy> groupBy = null;
        ReportAdvertiserGetV2OrderField orderField = null;
        ReportAdvertiserGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startDate = null;
        ReportAdvertiserGetV2TimeGranularity timeGranularity = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportAdvertiserGetV2Response response = api.openApi2ReportAdvertiserGetGet(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity);
        System.out.println(response);
    }

}