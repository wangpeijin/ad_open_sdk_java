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
import com.bytedance.ads.api.QianchuanImageGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanImageGetV10Filtering;
import com.bytedance.ads.model.QianchuanImageGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/image/get/ GET
public class QianchuanImageGetV10ApiExample {

    private static final QianchuanImageGetV10Api api = new QianchuanImageGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanImageGetV10Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanImageGetV10Response response = api.openApiV10QianchuanImageGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}