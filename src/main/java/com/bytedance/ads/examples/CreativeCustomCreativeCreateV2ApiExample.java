/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CreativeCustomCreativeCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2Request;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/custom_creative/create/ POST
public class CreativeCustomCreativeCreateV2ApiExample {

    private static final CreativeCustomCreativeCreateV2Api api = new CreativeCustomCreativeCreateV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeCustomCreativeCreateV2Request creativeCustomCreativeCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeCustomCreativeCreateV2Response response = api.openApi2CreativeCustomCreativeCreatePost(creativeCustomCreativeCreateV2Request);
        System.out.println(response);
    }

}