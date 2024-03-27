/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ReportCustomAsyncTaskDownloadV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomAsyncTaskDownloadV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/async_task/download/ GET
public class ReportCustomAsyncTaskDownloadV30ApiExample {

    private static final ReportCustomAsyncTaskDownloadV30Api api = new ReportCustomAsyncTaskDownloadV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long taskId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomAsyncTaskDownloadV30Response response = api.openApiV30ReportCustomAsyncTaskDownloadGet(advertiserId, taskId);
        System.out.println(response);
    }

}