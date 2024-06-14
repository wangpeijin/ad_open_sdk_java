/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAdConvertOptimizedTargetGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2AppType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2CampaignType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ConvertType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DedicateType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2DeepExternalAction;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2ExternalAction;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2LandingType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2LaunchTargetType;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2MarketingPurpose;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2PromotionContent;
import com.bytedance.ads.model.ToolsAdConvertOptimizedTargetGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_convert/optimized_target/get/ GET
public class ToolsAdConvertOptimizedTargetGetV2ApiExample {

    private static final ToolsAdConvertOptimizedTargetGetV2Api api = new ToolsAdConvertOptimizedTargetGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String appSchema = null;
        ToolsAdConvertOptimizedTargetGetV2AppType appType = null;
        ToolsAdConvertOptimizedTargetGetV2CampaignType campaignType = null;
        Long convertId = null;
        String convertName = null;
        ToolsAdConvertOptimizedTargetGetV2ConvertType convertType = null;
        ToolsAdConvertOptimizedTargetGetV2DedicateType dedicateType = null;
        ToolsAdConvertOptimizedTargetGetV2DeepExternalAction deepExternalAction = null;
        ToolsAdConvertOptimizedTargetGetV2ExternalAction externalAction = null;
        String externalUrl = null;
        String itunesUrl = null;
        ToolsAdConvertOptimizedTargetGetV2LandingType landingType = null;
        ToolsAdConvertOptimizedTargetGetV2LaunchTargetType launchTargetType = null;
        ToolsAdConvertOptimizedTargetGetV2MarketingPurpose marketingPurpose = null;
        String packageName = null;
        Long page = null;
        Long pageSize = null;
        ToolsAdConvertOptimizedTargetGetV2PromotionContent promotionContent = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdConvertOptimizedTargetGetV2Response response = api.openApi2ToolsAdConvertOptimizedTargetGetGet(advertiserId, appSchema, appType, campaignType, convertId, convertName, convertType, dedicateType, deepExternalAction, externalAction, externalUrl, itunesUrl, landingType, launchTargetType, marketingPurpose, packageName, page, pageSize, promotionContent);
        System.out.println(response);
    }

}