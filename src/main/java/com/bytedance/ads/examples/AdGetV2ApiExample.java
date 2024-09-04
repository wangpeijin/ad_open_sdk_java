/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdGetV2Filtering;
import com.bytedance.ads.model.AdGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/ad/get/ GET
public class AdGetV2ApiExample {

    private static final AdGetV2Api api = new AdGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> fields = null;
        AdGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdGetV2Response response = api.openApi2AdGetGet(advertiserId, fields, filtering, page, pageSize);
        System.out.println(response);
    }

}