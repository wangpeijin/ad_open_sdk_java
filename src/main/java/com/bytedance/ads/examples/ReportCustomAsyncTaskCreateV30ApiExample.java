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
import com.bytedance.ads.api.ReportCustomAsyncTaskCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30Request;
import com.bytedance.ads.model.ReportCustomAsyncTaskCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/custom/async_task/create/ POST
public class ReportCustomAsyncTaskCreateV30ApiExample {

    private static final ReportCustomAsyncTaskCreateV30Api api = new ReportCustomAsyncTaskCreateV30Api();

    public static void main(String[] args) throws ApiException {
        ReportCustomAsyncTaskCreateV30Request reportCustomAsyncTaskCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportCustomAsyncTaskCreateV30Response response = api.openApiV30ReportCustomAsyncTaskCreatePost(reportCustomAsyncTaskCreateV30Request);
        System.out.println(response);
    }

}