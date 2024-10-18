/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdScheduleFixedRangeUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdScheduleFixedRangeUpdateV10Request;
import com.bytedance.ads.model.QianchuanAdScheduleFixedRangeUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/schedule_fixed_range/update/ POST
public class QianchuanAdScheduleFixedRangeUpdateV10ApiExample {

    private static final QianchuanAdScheduleFixedRangeUpdateV10Api api = new QianchuanAdScheduleFixedRangeUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAdScheduleFixedRangeUpdateV10Request qianchuanAdScheduleFixedRangeUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdScheduleFixedRangeUpdateV10Response response = api.openApiV10QianchuanAdScheduleFixedRangeUpdatePost(qianchuanAdScheduleFixedRangeUpdateV10Request);
        System.out.println(response);
    }

}