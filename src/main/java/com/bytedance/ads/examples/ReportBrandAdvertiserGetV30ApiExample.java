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
import com.bytedance.ads.api.ReportBrandAdvertiserGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30LandingType;
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30PricingType;
import com.bytedance.ads.model.ReportBrandAdvertiserGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/report/brand/advertiser/get/ GET
public class ReportBrandAdvertiserGetV30ApiExample {

    private static final ReportBrandAdvertiserGetV30Api api = new ReportBrandAdvertiserGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startTime = null;
        String endTime = null;
        Long page = null;
        Long size = null;
        ReportBrandAdvertiserGetV30LandingType landingType = null;
        ReportBrandAdvertiserGetV30PricingType pricingType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ReportBrandAdvertiserGetV30Response response = api.openApiV30ReportBrandAdvertiserGetGet(advertiserId, startTime, endTime, page, size, landingType, pricingType);
        System.out.println(response);
    }

}