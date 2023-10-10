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
import com.bytedance.ads.api.ClueFormCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueFormCreateV2Request;
import com.bytedance.ads.model.ClueFormCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/form/create/ POST
public class ClueFormCreateV2ApiExample {

    private static final ClueFormCreateV2Api api = new ClueFormCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueFormCreateV2Request clueFormCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueFormCreateV2Response response = api.openApi2ClueFormCreatePost(clueFormCreateV2Request);
        System.out.println(response);
    }

}