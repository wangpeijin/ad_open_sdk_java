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
import com.bytedance.ads.api.ToolsAdminInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAdminInfoV2Language;
import com.bytedance.ads.model.ToolsAdminInfoV2Response;
import com.bytedance.ads.model.ToolsAdminInfoV2SubDistrict;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/admin/info/ GET
public class ToolsAdminInfoV2ApiExample {

    private static final ToolsAdminInfoV2Api api = new ToolsAdminInfoV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> codes = null;
        ToolsAdminInfoV2Language language = null;
        ToolsAdminInfoV2SubDistrict subDistrict = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAdminInfoV2Response response = api.openApi2ToolsAdminInfoGet(advertiserId, codes, language, subDistrict);
        System.out.println(response);
    }

}