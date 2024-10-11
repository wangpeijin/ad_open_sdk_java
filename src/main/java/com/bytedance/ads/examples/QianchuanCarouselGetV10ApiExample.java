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
import com.bytedance.ads.api.QianchuanCarouselGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanCarouselGetV10Filtering;
import com.bytedance.ads.model.QianchuanCarouselGetV10OrderType;
import com.bytedance.ads.model.QianchuanCarouselGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/carousel/get/ GET
public class QianchuanCarouselGetV10ApiExample {

    private static final QianchuanCarouselGetV10Api api = new QianchuanCarouselGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanCarouselGetV10Filtering filtering = null;
        String orderField = null;
        QianchuanCarouselGetV10OrderType orderType = null;
        Long pageSize = null;
        Long page = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanCarouselGetV10Response response = api.openApiV10QianchuanCarouselGetGet(advertiserId, filtering, orderField, orderType, pageSize, page);
        System.out.println(response);
    }

}