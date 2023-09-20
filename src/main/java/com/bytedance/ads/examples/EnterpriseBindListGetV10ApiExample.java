/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EnterpriseBindListGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseBindListGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/bind/list/get/ GET
public class EnterpriseBindListGetV10ApiExample {

    private static final EnterpriseBindListGetV10Api api = new EnterpriseBindListGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseBindListGetV10Response response = api.openApiV10EnterpriseBindListGetGet(advertiserId);
        System.out.println(response);
    }

}