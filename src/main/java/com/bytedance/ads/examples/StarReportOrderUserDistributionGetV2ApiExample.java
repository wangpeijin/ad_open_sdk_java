/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarReportOrderUserDistributionGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarReportOrderUserDistributionGetV2FanType;
import com.bytedance.ads.model.StarReportOrderUserDistributionGetV2InteractiveType;
import com.bytedance.ads.model.StarReportOrderUserDistributionGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/report/order_user_distribution/get/ GET
public class StarReportOrderUserDistributionGetV2ApiExample {

    private static final StarReportOrderUserDistributionGetV2Api api = new StarReportOrderUserDistributionGetV2Api();

    public static void main(String[] args) throws ApiException {
        StarReportOrderUserDistributionGetV2FanType fanType = null;
        StarReportOrderUserDistributionGetV2InteractiveType interactiveType = null;
        Long orderId = null;
        Long starId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarReportOrderUserDistributionGetV2Response response = api.openApi2StarReportOrderUserDistributionGetGet(fanType, interactiveType, orderId, starId);
        System.out.println(response);
    }

}