/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPlayableGrantResultV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPlayableGrantResultV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable/grant/result/ GET
public class ToolsPlayableGrantResultV2ApiExample {

    private static final ToolsPlayableGrantResultV2Api api = new ToolsPlayableGrantResultV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> taskIds = null;
        String startTime = null;
        String endTime = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableGrantResultV2Response response = api.openApi2ToolsPlayableGrantResultGet(advertiserId, taskIds, startTime, endTime, page, pageSize);
        System.out.println(response);
    }

}