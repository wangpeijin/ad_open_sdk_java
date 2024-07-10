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
import com.bytedance.ads.api.QianchuanReportUniPromotionDimensionDataRoomGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataRoomGetV10Dimension;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataRoomGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataRoomGetV10Metrics;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType;
import com.bytedance.ads.model.QianchuanReportUniPromotionDimensionDataRoomGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/report/uni_promotion/dimension_data/room/get/ GET
public class QianchuanReportUniPromotionDimensionDataRoomGetV10ApiExample {

    private static final QianchuanReportUniPromotionDimensionDataRoomGetV10Api api = new QianchuanReportUniPromotionDimensionDataRoomGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long roomId = null;
        String startTime = null;
        String endTime = null;
        QianchuanReportUniPromotionDimensionDataRoomGetV10Dimension dimension = null;
        List<QianchuanReportUniPromotionDimensionDataRoomGetV10Metrics> metrics = null;
        String orderField = null;
        QianchuanReportUniPromotionDimensionDataRoomGetV10OrderType orderType = null;
        Integer page = null;
        Integer pageSize = null;
        QianchuanReportUniPromotionDimensionDataRoomGetV10Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanReportUniPromotionDimensionDataRoomGetV10Response response = api.openApiV10QianchuanReportUniPromotionDimensionDataRoomGetGet(advertiserId, roomId, startTime, endTime, dimension, metrics, orderField, orderType, page, pageSize, filtering);
        System.out.println(response);
    }

}