/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalPromotionStatusUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalPromotionStatusUpdateV30Request;
import com.bytedance.ads.model.LocalPromotionStatusUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/promotion/status/update/ POST
public class LocalPromotionStatusUpdateV30ApiExample {

    private static final LocalPromotionStatusUpdateV30Api api = new LocalPromotionStatusUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        LocalPromotionStatusUpdateV30Request localPromotionStatusUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalPromotionStatusUpdateV30Response response = api.openApiV30LocalPromotionStatusUpdatePost(localPromotionStatusUpdateV30Request);
        System.out.println(response);
    }

}