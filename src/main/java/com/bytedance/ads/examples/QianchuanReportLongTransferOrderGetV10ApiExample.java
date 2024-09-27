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
import com.bytedance.ads.api.QianchuanReportLongTransferOrderGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10MarketingGoal;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10OptimizationTimeScope;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/long_transfer/order/get/ GET
public class QianchuanReportLongTransferOrderGetV10ApiExample {

    private static final QianchuanReportLongTransferOrderGetV10Api api = new QianchuanReportLongTransferOrderGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        QianchuanReportLongTransferOrderGetV10OptimizationTimeScope optimizationTimeScope = null;
        QianchuanReportLongTransferOrderGetV10Filtering filtering = null;
        QianchuanReportLongTransferOrderGetV10MarketingGoal marketingGoal = null;
        QianchuanReportLongTransferOrderGetV10OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportLongTransferOrderGetV10Response response = api.openApiV10QianchuanReportLongTransferOrderGetGet(advertiserId, startDate, endDate, optimizationTimeScope, filtering, marketingGoal, orderType, page, pageSize);
        System.out.println(response);
    }

}