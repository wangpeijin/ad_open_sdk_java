/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileImageGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileImageGetV2Filtering;
import com.bytedance.ads.model.FileImageGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/image/get/ GET
public class FileImageGetV2ApiExample {

    private static final FileImageGetV2Api api = new FileImageGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        FileImageGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileImageGetV2Response response = api.openApi2FileImageGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}