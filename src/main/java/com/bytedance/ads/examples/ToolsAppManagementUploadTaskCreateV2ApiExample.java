/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAppManagementUploadTaskCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskCreateV2Request;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/upload_task/create/ POST
public class ToolsAppManagementUploadTaskCreateV2ApiExample {

    private static final ToolsAppManagementUploadTaskCreateV2Api api = new ToolsAppManagementUploadTaskCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAppManagementUploadTaskCreateV2Request toolsAppManagementUploadTaskCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementUploadTaskCreateV2Response response = api.openApi2ToolsAppManagementUploadTaskCreatePost(toolsAppManagementUploadTaskCreateV2Request);
        System.out.println(response);
    }

}