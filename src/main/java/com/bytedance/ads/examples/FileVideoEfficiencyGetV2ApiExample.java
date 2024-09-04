/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileVideoEfficiencyGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoEfficiencyGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/efficiency/get/ GET
public class FileVideoEfficiencyGetV2ApiExample {

    private static final FileVideoEfficiencyGetV2Api api = new FileVideoEfficiencyGetV2Api();

    public static void main(String[] args) throws ApiException {
        String advertiserId = null;
        List<String> materialIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoEfficiencyGetV2Response response = api.openApi2FileVideoEfficiencyGetGet(advertiserId, materialIds);
        System.out.println(response);
    }

}