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
import com.bytedance.ads.api.QianchuanToolsSmartBoostAdBoostVersionGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostVersionGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/version/get/ GET
public class QianchuanToolsSmartBoostAdBoostVersionGetV10ApiExample {

    private static final QianchuanToolsSmartBoostAdBoostVersionGetV10Api api = new QianchuanToolsSmartBoostAdBoostVersionGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long adId = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsSmartBoostAdBoostVersionGetV10Response response = api.openApiV10QianchuanToolsSmartBoostAdBoostVersionGetGet(advertiserId, adId, cursor, count);
        System.out.println(response);
    }

}