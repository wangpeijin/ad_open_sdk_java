/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreativeMaterialMetricsV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeMaterialMetricsV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/material/metrics/ GET
public class CreativeMaterialMetricsV2ApiExample {

    private static final CreativeMaterialMetricsV2Api api = new CreativeMaterialMetricsV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> materialIds = null;
        String startDate = null;
        String endDate = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeMaterialMetricsV2Response response = api.openApi2CreativeMaterialMetricsGet(advertiserId, materialIds, startDate, endDate);
        System.out.println(response);
    }

}