/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsStarTaskMaterialTypeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsStarTaskMaterialTypeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/star_task/material_type/ GET
public class ToolsStarTaskMaterialTypeV2ApiExample {

    private static final ToolsStarTaskMaterialTypeV2Api api = new ToolsStarTaskMaterialTypeV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsStarTaskMaterialTypeV2Response response = api.openApi2ToolsStarTaskMaterialTypeGet(advertiserId);
        System.out.println(response);
    }

}