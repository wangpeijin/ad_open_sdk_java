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
import com.bytedance.ads.api.CreativeCustomCreativeUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2Request;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/creative/custom_creative/update/ POST
public class CreativeCustomCreativeUpdateV2ApiExample {

    private static final CreativeCustomCreativeUpdateV2Api api = new CreativeCustomCreativeUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        CreativeCustomCreativeUpdateV2Request creativeCustomCreativeUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CreativeCustomCreativeUpdateV2Response response = api.openApi2CreativeCustomCreativeUpdatePost(creativeCustomCreativeUpdateV2Request);
        System.out.println(response);
    }

}