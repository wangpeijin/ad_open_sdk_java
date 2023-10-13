/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAdRaiseResultGetV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2OrderType;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2Response;
import com.bytedance.ads.model.ToolsAdRaiseResultGetV2V2TimeDimension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/ad_raise_result/get_v2/ GET
public class ToolsAdRaiseResultGetV2V2ApiExample {

    private static final ToolsAdRaiseResultGetV2V2Api api = new ToolsAdRaiseResultGetV2V2Api();

    public static void main(String[] args) throws ApiException {
        Long adId = null;
        Long adRaiseVersion = null;
        Long advertiserId = null;
        String endTime = null;
        String orderField = null;
        ToolsAdRaiseResultGetV2V2OrderType orderType = null;
        Long page = null;
        Long pageSize = null;
        String startTime = null;
        ToolsAdRaiseResultGetV2V2TimeDimension timeDimension = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdRaiseResultGetV2V2Response response = api.openApi2ToolsAdRaiseResultGetV2Get(adId, adRaiseVersion, advertiserId, endTime, orderField, orderType, page, pageSize, startTime, timeDimension);
        System.out.println(response);
    }

}