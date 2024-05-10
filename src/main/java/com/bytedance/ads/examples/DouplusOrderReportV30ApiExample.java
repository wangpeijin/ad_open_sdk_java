/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOrderReportV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOrderReportV30Filter;
import com.bytedance.ads.model.DouplusOrderReportV30GroupBy;
import com.bytedance.ads.model.DouplusOrderReportV30Response;
import com.bytedance.ads.model.DouplusOrderReportV30StatTime;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/douplus/order/report/ GET
public class DouplusOrderReportV30ApiExample {

    private static final DouplusOrderReportV30Api api = new DouplusOrderReportV30Api();

    public static void main(String[] args) throws ApiException {
        String awemeSecUid = null;
        DouplusOrderReportV30StatTime statTime = null;
        List<DouplusOrderReportV30GroupBy> groupBy = null;
        DouplusOrderReportV30Filter filter = null;
        Long pageSize = null;
        Long page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DouplusOrderReportV30Response response = api.openApiV30DouplusOrderReportGet(awemeSecUid, statTime, groupBy, filter, pageSize, page);
        System.out.println(response);
    }

}