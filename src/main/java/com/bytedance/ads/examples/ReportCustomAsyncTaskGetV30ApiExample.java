/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportCustomAsyncTaskGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomAsyncTaskGetV30Filtering;
import com.bytedance.ads.model.ReportCustomAsyncTaskGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/async_task/get/ GET
public class ReportCustomAsyncTaskGetV30ApiExample {

    private static final ReportCustomAsyncTaskGetV30Api api = new ReportCustomAsyncTaskGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ReportCustomAsyncTaskGetV30Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomAsyncTaskGetV30Response response = api.openApiV30ReportCustomAsyncTaskGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}