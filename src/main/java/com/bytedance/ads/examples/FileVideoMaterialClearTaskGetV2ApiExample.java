/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileVideoMaterialClearTaskGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/material/clear_task/get/ GET
public class FileVideoMaterialClearTaskGetV2ApiExample {

    private static final FileVideoMaterialClearTaskGetV2Api api = new FileVideoMaterialClearTaskGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> clearIds = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoMaterialClearTaskGetV2Response response = api.openApi2FileVideoMaterialClearTaskGetGet(advertiserId, clearIds, page, pageSize);
        System.out.println(response);
    }

}