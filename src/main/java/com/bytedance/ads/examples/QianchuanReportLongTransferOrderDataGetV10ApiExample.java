/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanReportLongTransferOrderDataGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderDataGetV10DataTopic;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderDataGetV10FiltersInner;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderDataGetV10OrderByInner;
import com.bytedance.ads.model.QianchuanReportLongTransferOrderDataGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/long_transfer/order/data/get/ GET
public class QianchuanReportLongTransferOrderDataGetV10ApiExample {

    private static final QianchuanReportLongTransferOrderDataGetV10Api api = new QianchuanReportLongTransferOrderDataGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanReportLongTransferOrderDataGetV10DataTopic dataTopic = null;
        List<String> dimensions = null;
        List<String> metrics = null;
        List<QianchuanReportLongTransferOrderDataGetV10FiltersInner> filters = null;
        String startTime = null;
        String endTime = null;
        List<QianchuanReportLongTransferOrderDataGetV10OrderByInner> orderBy = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportLongTransferOrderDataGetV10Response response = api.openApiV10QianchuanReportLongTransferOrderDataGetGet(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize);
        System.out.println(response);
    }

}