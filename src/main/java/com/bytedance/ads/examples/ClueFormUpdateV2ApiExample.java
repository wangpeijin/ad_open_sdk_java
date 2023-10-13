/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueFormUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueFormUpdateV2Request;
import com.bytedance.ads.model.ClueFormUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/form/update/ POST
public class ClueFormUpdateV2ApiExample {

    private static final ClueFormUpdateV2Api api = new ClueFormUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueFormUpdateV2Request clueFormUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueFormUpdateV2Response response = api.openApi2ClueFormUpdatePost(clueFormUpdateV2Request);
        System.out.println(response);
    }

}