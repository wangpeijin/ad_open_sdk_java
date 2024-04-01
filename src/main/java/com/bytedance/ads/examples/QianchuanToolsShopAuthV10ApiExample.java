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
import com.bytedance.ads.api.QianchuanToolsShopAuthV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanToolsShopAuthV10Request;
import com.bytedance.ads.model.QianchuanToolsShopAuthV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/tools/shop_auth/ POST
public class QianchuanToolsShopAuthV10ApiExample {

    private static final QianchuanToolsShopAuthV10Api api = new QianchuanToolsShopAuthV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanToolsShopAuthV10Request qianchuanToolsShopAuthV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanToolsShopAuthV10Response response = api.openApiV10QianchuanToolsShopAuthPost(qianchuanToolsShopAuthV10Request);
        System.out.println(response);
    }

}