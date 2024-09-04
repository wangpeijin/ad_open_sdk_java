/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportCustomCreativeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomCreativeGetV30FiltersInner;
import com.bytedance.ads.model.ReportCustomCreativeGetV30OrderByInner;
import com.bytedance.ads.model.ReportCustomCreativeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/creative/get/ GET
public class ReportCustomCreativeGetV30ApiExample {

    private static final ReportCustomCreativeGetV30Api api = new ReportCustomCreativeGetV30Api();

    public static void main(String[] args) throws ApiException {
        List<String> dimensions = null;
        Long advertiserId = null;
        List<String> metrics = null;
        List<ReportCustomCreativeGetV30FiltersInner> filters = null;
        String startTime = null;
        String endTime = null;
        List<ReportCustomCreativeGetV30OrderByInner> orderBy = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomCreativeGetV30Response response = api.openApiV30ReportCustomCreativeGetGet(dimensions, advertiserId, metrics, filters, startTime, endTime, orderBy, page, pageSize);
        System.out.println(response);
    }

}