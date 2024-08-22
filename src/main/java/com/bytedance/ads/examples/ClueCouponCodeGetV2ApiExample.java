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
import com.bytedance.ads.api.ClueCouponCodeGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueCouponCodeGetV2Response;
import com.bytedance.ads.model.ClueCouponCodeGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/coupon/code/get/ GET
public class ClueCouponCodeGetV2ApiExample {

    private static final ClueCouponCodeGetV2Api api = new ClueCouponCodeGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long activityId = null;
        Long advertiserId = null;
        Long couponId = null;
        String endTime = null;
        Long page = null;
        Long pageSize = null;
        Long resourceId = null;
        String startTime = null;
        ClueCouponCodeGetV2Status status = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueCouponCodeGetV2Response response = api.openApi2ClueCouponCodeGetGet(activityId, advertiserId, couponId, endTime, page, pageSize, resourceId, startTime, status);
        System.out.println(response);
    }

}