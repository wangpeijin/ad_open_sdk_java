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
import com.bytedance.ads.api.ToolsAdConvertDeepbidReadV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2DeepExternalAction;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2DeliveryRange;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2ExternalAction;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2FlowControlMode;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2Response;
import com.bytedance.ads.model.ToolsAdConvertDeepbidReadV2SmartBidType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_convert/deepbid/read/ GET
public class ToolsAdConvertDeepbidReadV2ApiExample {

    private static final ToolsAdConvertDeepbidReadV2Api api = new ToolsAdConvertDeepbidReadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> assetsIds = null;
        Long campaignId = null;
        Long convertId = null;
        ToolsAdConvertDeepbidReadV2DeepExternalAction deepExternalAction = null;
        ToolsAdConvertDeepbidReadV2DeliveryRange deliveryRange = null;
        ToolsAdConvertDeepbidReadV2ExternalAction externalAction = null;
        ToolsAdConvertDeepbidReadV2FlowControlMode flowControlMode = null;
        ToolsAdConvertDeepbidReadV2SmartBidType smartBidType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdConvertDeepbidReadV2Response response = api.openApi2ToolsAdConvertDeepbidReadGet(advertiserId, assetsIds, campaignId, convertId, deepExternalAction, deliveryRange, externalAction, flowControlMode, smartBidType);
        System.out.println(response);
    }

}