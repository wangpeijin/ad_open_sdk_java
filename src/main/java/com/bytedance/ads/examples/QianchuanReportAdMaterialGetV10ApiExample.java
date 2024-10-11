/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportAdMaterialGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportAdMaterialGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/ad/material/get/ GET
public class QianchuanReportAdMaterialGetV10ApiExample {

    private static final QianchuanReportAdMaterialGetV10Api api = new QianchuanReportAdMaterialGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        String startDate = null;
        String endDate = null;
        List<String> fields = null;
        QianchuanReportAdMaterialGetV10Filtering filtering = null;
        QianchuanReportAdMaterialGetV10OrderType orderType = null;
        String orderField = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportAdMaterialGetV10Response response = api.openApiV10QianchuanReportAdMaterialGetGet(advertiserId, adId, startDate, endDate, fields, filtering, orderType, orderField);
        System.out.println(response);
    }

}