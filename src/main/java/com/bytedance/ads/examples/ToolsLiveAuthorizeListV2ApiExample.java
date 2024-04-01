/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsLiveAuthorizeListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsLiveAuthorizeListV2Response;
import com.bytedance.ads.model.ToolsLiveAuthorizeListV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/live_authorize/list/ GET
public class ToolsLiveAuthorizeListV2ApiExample {

    private static final ToolsLiveAuthorizeListV2Api api = new ToolsLiveAuthorizeListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long page = null;
        Long pageSize = null;
        List<ToolsLiveAuthorizeListV2Status> status = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsLiveAuthorizeListV2Response response = api.openApi2ToolsLiveAuthorizeListGet(advertiserId, page, pageSize, status);
        System.out.println(response);
    }

}