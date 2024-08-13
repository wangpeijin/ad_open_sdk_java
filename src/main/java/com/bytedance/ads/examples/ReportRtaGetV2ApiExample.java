/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportRtaGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportRtaGetV2OrderField;
import com.bytedance.ads.model.ReportRtaGetV2OrderType;
import com.bytedance.ads.model.ReportRtaGetV2ReportType;
import com.bytedance.ads.model.ReportRtaGetV2Response;
import com.bytedance.ads.model.ReportRtaGetV2TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/report/rta/get/ GET
public class ReportRtaGetV2ApiExample {

    private static final ReportRtaGetV2Api api = new ReportRtaGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endDate = null;
        ReportRtaGetV2OrderField orderField = null;
        ReportRtaGetV2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        ReportRtaGetV2ReportType reportType = null;
        String startDate = null;
        ReportRtaGetV2TimeGranularity timeGranularity = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportRtaGetV2Response response = api.openApi2ReportRtaGetGet(advertiserId, endDate, orderField, orderType, page, pageSize, reportType, startDate, timeGranularity);
        System.out.println(response);
    }

}