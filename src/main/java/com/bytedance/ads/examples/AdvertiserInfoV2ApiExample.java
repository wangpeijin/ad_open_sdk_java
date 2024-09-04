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
import com.bytedance.ads.api.AdvertiserInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserInfoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/info/ GET
public class AdvertiserInfoV2ApiExample {

    private static final AdvertiserInfoV2Api api = new AdvertiserInfoV2Api();

    public static void main(String[] args) throws ApiException {
        List<Long> advertiserIds = null;
        List<String> fields = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserInfoV2Response response = api.openApi2AdvertiserInfoGet(advertiserIds, fields);
        System.out.println(response);
    }

}