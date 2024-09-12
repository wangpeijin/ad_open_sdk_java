/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EventManagerOptimizedGoalGetV2V30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AdType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AppPromotionType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AppType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30AssetType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DeliveryMode;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DeliveryType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30DpaAdtype;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30LandingType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30MarketingGoal;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30MicroPromotionType;
import com.bytedance.ads.model.EventManagerOptimizedGoalGetV2V30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/event_manager/optimized_goal/get_v2/ GET
public class EventManagerOptimizedGoalGetV2V30ApiExample {

    private static final EventManagerOptimizedGoalGetV2V30Api api = new EventManagerOptimizedGoalGetV2V30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        EventManagerOptimizedGoalGetV2V30LandingType landingType = null;
        EventManagerOptimizedGoalGetV2V30AdType adType = null;
        EventManagerOptimizedGoalGetV2V30AssetType assetType = null;
        Long assetId = null;
        String packageName = null;
        EventManagerOptimizedGoalGetV2V30AppType appType = null;
        EventManagerOptimizedGoalGetV2V30AppPromotionType appPromotionType = null;
        EventManagerOptimizedGoalGetV2V30MarketingGoal marketingGoal = null;
        Long quickAppId = null;
        EventManagerOptimizedGoalGetV2V30DeliveryMode deliveryMode = null;
        String miniProgramId = null;
        EventManagerOptimizedGoalGetV2V30DpaAdtype dpaAdtype = null;
        EventManagerOptimizedGoalGetV2V30MicroPromotionType microPromotionType = null;
        Long microAppInstanceId = null;
        EventManagerOptimizedGoalGetV2V30DeliveryType deliveryType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EventManagerOptimizedGoalGetV2V30Response response = api.openApiV30EventManagerOptimizedGoalGetV2Get(advertiserId, landingType, adType, assetType, assetId, packageName, appType, appPromotionType, marketingGoal, quickAppId, deliveryMode, miniProgramId, dpaAdtype, microPromotionType, microAppInstanceId, deliveryType);
        System.out.println(response);
    }

}