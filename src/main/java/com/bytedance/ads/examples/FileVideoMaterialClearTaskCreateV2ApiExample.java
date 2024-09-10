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
import com.bytedance.ads.api.FileVideoMaterialClearTaskCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoMaterialClearTaskCreateV2Request;
import com.bytedance.ads.model.FileVideoMaterialClearTaskCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/material/clear_task/create/ POST
public class FileVideoMaterialClearTaskCreateV2ApiExample {

    private static final FileVideoMaterialClearTaskCreateV2Api api = new FileVideoMaterialClearTaskCreateV2Api();

    public static void main(String[] args) throws ApiException {
        FileVideoMaterialClearTaskCreateV2Request fileVideoMaterialClearTaskCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoMaterialClearTaskCreateV2Response response = api.openApi2FileVideoMaterialClearTaskCreatePost(fileVideoMaterialClearTaskCreateV2Request);
        System.out.println(response);
    }

}