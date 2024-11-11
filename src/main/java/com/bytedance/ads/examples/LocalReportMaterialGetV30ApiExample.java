/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalReportMaterialGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalReportMaterialGetV30Filtering;
import com.bytedance.ads.model.LocalReportMaterialGetV30OrderType;
import com.bytedance.ads.model.LocalReportMaterialGetV30Response;
import com.bytedance.ads.model.LocalReportMaterialGetV30TimeGranularity;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/report/material/get/ GET
public class LocalReportMaterialGetV30ApiExample {

    private static final LocalReportMaterialGetV30Api api = new LocalReportMaterialGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long localAccountId = null;
        String startDate = null;
        String endDate = null;
        List<String> metrics = null;
        LocalReportMaterialGetV30TimeGranularity timeGranularity = null;
        LocalReportMaterialGetV30OrderType orderType = null;
        String orderField = null;
        LocalReportMaterialGetV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalReportMaterialGetV30Response response = api.openApiV30LocalReportMaterialGetGet(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize);
        System.out.println(response);
    }

}