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
import com.bytedance.ads.api.QianchuanReportMaterialGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/material/get/ GET
public class QianchuanReportMaterialGetV10ApiExample {

    private static final QianchuanReportMaterialGetV10Api api = new QianchuanReportMaterialGetV10Api();

    public static void main(String[] args) throws ApiException {
        String startDate = null;
        String endDate = null;
        Long advertiserId = null;
        List<String> fields = null;
        QianchuanReportMaterialGetV10OrderType orderType = null;
        String orderField = null;
        QianchuanReportMaterialGetV10Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportMaterialGetV10Response response = api.openApiV10QianchuanReportMaterialGetGet(startDate, endDate, advertiserId, fields, orderType, orderField, filtering, page, pageSize);
        System.out.println(response);
    }

}