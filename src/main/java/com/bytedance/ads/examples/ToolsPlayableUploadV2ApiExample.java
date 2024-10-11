/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPlayableUploadV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.ToolsPlayableUploadV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/playable/upload/ POST
public class ToolsPlayableUploadV2ApiExample {

    private static final ToolsPlayableUploadV2Api api = new ToolsPlayableUploadV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File playablePackage = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPlayableUploadV2Response response = api.openApi2ToolsPlayableUploadPost(advertiserId, playablePackage);
        System.out.println(response);
    }

}