/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.KeywordGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.KeywordGetV2Filtering;
import com.bytedance.ads.model.KeywordGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/keyword/get/ GET
public class KeywordGetV2ApiExample {

    private static final KeywordGetV2Api api = new KeywordGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        KeywordGetV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        KeywordGetV2Response response = api.openApi2KeywordGetGet(advertiserId, filtering);
        System.out.println(response);
    }

}