/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdStatusUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdStatusUpdateV10Request;
import com.bytedance.ads.model.QianchuanAdStatusUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/status/update/ POST
public class QianchuanAdStatusUpdateV10ApiExample {

    private static final QianchuanAdStatusUpdateV10Api api = new QianchuanAdStatusUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAdStatusUpdateV10Request qianchuanAdStatusUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdStatusUpdateV10Response response = api.openApiV10QianchuanAdStatusUpdatePost(qianchuanAdStatusUpdateV10Request);
        System.out.println(response);
    }

}