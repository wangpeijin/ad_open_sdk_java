/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAdPivativewordsUpdateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdPivativewordsUpdateV10Request;
import com.bytedance.ads.model.QianchuanAdPivativewordsUpdateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/pivativewords/update/ POST
public class QianchuanAdPivativewordsUpdateV10ApiExample {

    private static final QianchuanAdPivativewordsUpdateV10Api api = new QianchuanAdPivativewordsUpdateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAdPivativewordsUpdateV10Request qianchuanAdPivativewordsUpdateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdPivativewordsUpdateV10Response response = api.openApiV10QianchuanAdPivativewordsUpdatePost(qianchuanAdPivativewordsUpdateV10Request);
        System.out.println(response);
    }

}