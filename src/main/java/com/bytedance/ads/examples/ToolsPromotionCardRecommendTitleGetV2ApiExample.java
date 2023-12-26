/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPromotionCardRecommendTitleGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPromotionCardRecommendTitleGetV2ContentType;
import com.bytedance.ads.model.ToolsPromotionCardRecommendTitleGetV2Response;
import com.bytedance.ads.model.ToolsPromotionCardRecommendTitleGetV2TextType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/promotion_card/recommend_title/get/ GET
public class ToolsPromotionCardRecommendTitleGetV2ApiExample {

    private static final ToolsPromotionCardRecommendTitleGetV2Api api = new ToolsPromotionCardRecommendTitleGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long adId = null;
        Long advertiserId = null;
        ToolsPromotionCardRecommendTitleGetV2ContentType contentType = null;
        String externalUrl = null;
        Long industryId = null;
        ToolsPromotionCardRecommendTitleGetV2TextType textType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPromotionCardRecommendTitleGetV2Response response = api.openApi2ToolsPromotionCardRecommendTitleGetGet(adId, advertiserId, contentType, externalUrl, industryId, textType);
        System.out.println(response);
    }

}