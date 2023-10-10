/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanFileImageDeleteV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanFileImageDeleteV10Request;
import com.bytedance.ads.model.QianchuanFileImageDeleteV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/file/image/delete/ POST
public class QianchuanFileImageDeleteV10ApiExample {

    private static final QianchuanFileImageDeleteV10Api api = new QianchuanFileImageDeleteV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanFileImageDeleteV10Request qianchuanFileImageDeleteV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanFileImageDeleteV10Response response = api.openApiV10QianchuanFileImageDeletePost(qianchuanFileImageDeleteV10Request);
        System.out.println(response);
    }

}