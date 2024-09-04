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
import com.bytedance.ads.api.ReportBrandAdGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandAdGetV30LandingType;
import com.bytedance.ads.model.ReportBrandAdGetV30PricingType;
import com.bytedance.ads.model.ReportBrandAdGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/ad/get/ GET
public class ReportBrandAdGetV30ApiExample {

    private static final ReportBrandAdGetV30Api api = new ReportBrandAdGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long size = null;
        ReportBrandAdGetV30LandingType landingType = null;
        ReportBrandAdGetV30PricingType pricingType = null;
        List<String> adIds = null;
        String startTime = null;
        String endTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandAdGetV30Response response = api.openApiV30ReportBrandAdGetGet(advertiserId, page, size, landingType, pricingType, adIds, startTime, endTime);
        System.out.println(response);
    }

}