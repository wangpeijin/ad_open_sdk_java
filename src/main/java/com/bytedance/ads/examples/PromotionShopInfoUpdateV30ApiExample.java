/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.PromotionShopInfoUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.PromotionShopInfoUpdateV30Request;
import com.bytedance.ads.model.PromotionShopInfoUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/promotion/shop_info/update/ POST
public class PromotionShopInfoUpdateV30ApiExample {

    private static final PromotionShopInfoUpdateV30Api api = new PromotionShopInfoUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        PromotionShopInfoUpdateV30Request promotionShopInfoUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        PromotionShopInfoUpdateV30Response response = api.openApiV30PromotionShopInfoUpdatePost(promotionShopInfoUpdateV30Request);
        System.out.println(response);
    }

}