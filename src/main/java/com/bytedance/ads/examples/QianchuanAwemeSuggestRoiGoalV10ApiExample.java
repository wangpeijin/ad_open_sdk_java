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
import com.bytedance.ads.api.QianchuanAwemeSuggestRoiGoalV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeSuggestRoiGoalV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/suggest/roi/goal/ GET
public class QianchuanAwemeSuggestRoiGoalV10ApiExample {

    private static final QianchuanAwemeSuggestRoiGoalV10Api api = new QianchuanAwemeSuggestRoiGoalV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeSuggestRoiGoalV10Response response = api.openApiV10QianchuanAwemeSuggestRoiGoalGet(advertiserId, awemeId);
        System.out.println(response);
    }

}