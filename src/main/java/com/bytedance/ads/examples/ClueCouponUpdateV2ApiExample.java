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
import com.bytedance.ads.api.ClueCouponUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCouponUpdateV2Request;
import com.bytedance.ads.model.ClueCouponUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/coupon/update/ POST
public class ClueCouponUpdateV2ApiExample {

    private static final ClueCouponUpdateV2Api api = new ClueCouponUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueCouponUpdateV2Request clueCouponUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCouponUpdateV2Response response = api.openApi2ClueCouponUpdatePost(clueCouponUpdateV2Request);
        System.out.println(response);
    }

}