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
import com.bytedance.ads.api.QianchuanUniAwemeAdCreateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10Request;
import com.bytedance.ads.model.QianchuanUniAwemeAdCreateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/uni_aweme/ad/create/ POST
public class QianchuanUniAwemeAdCreateV10ApiExample {

    private static final QianchuanUniAwemeAdCreateV10Api api = new QianchuanUniAwemeAdCreateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanUniAwemeAdCreateV10Request qianchuanUniAwemeAdCreateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanUniAwemeAdCreateV10Response response = api.openApiV10QianchuanUniAwemeAdCreatePost(qianchuanUniAwemeAdCreateV10Request);
        System.out.println(response);
    }

}