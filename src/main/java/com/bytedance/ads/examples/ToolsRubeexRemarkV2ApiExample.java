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
import com.bytedance.ads.api.ToolsRubeexRemarkV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsRubeexRemarkV2Filtering;
import com.bytedance.ads.model.ToolsRubeexRemarkV2Response;
import com.bytedance.ads.model.ToolsRubeexRemarkV2Scene;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/rubeex/remark/ GET
public class ToolsRubeexRemarkV2ApiExample {

    private static final ToolsRubeexRemarkV2Api api = new ToolsRubeexRemarkV2Api();

    public static void main(String[] args) throws ApiException {
        Double advertiserId = null;
        Double projectId = null;
        ToolsRubeexRemarkV2Scene scene = null;
        ToolsRubeexRemarkV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsRubeexRemarkV2Response response = api.openApi2ToolsRubeexRemarkGet(advertiserId, projectId, scene, filtering);
        System.out.println(response);
    }

}