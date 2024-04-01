/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanRoiGoalUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanRoiGoalUpdateV10Request;
import com.bytedance.ads.model.QianchuanRoiGoalUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/roi/goal/update/ POST
public class QianchuanRoiGoalUpdateV10ApiExample {

    private static final QianchuanRoiGoalUpdateV10Api api = new QianchuanRoiGoalUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanRoiGoalUpdateV10Request qianchuanRoiGoalUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanRoiGoalUpdateV10Response response = api.openApiV10QianchuanRoiGoalUpdatePost(qianchuanRoiGoalUpdateV10Request);
        System.out.println(response);
    }

}