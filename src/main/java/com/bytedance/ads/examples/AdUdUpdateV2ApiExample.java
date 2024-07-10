/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdUdUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdUdUpdateV2Request;
import com.bytedance.ads.model.AdUdUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/ad/ud/update/ POST
public class AdUdUpdateV2ApiExample {

    private static final AdUdUpdateV2Api api = new AdUdUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        AdUdUpdateV2Request adUdUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdUdUpdateV2Response response = api.openApi2AdUdUpdatePost(adUdUpdateV2Request);
        System.out.println(response);
    }

}