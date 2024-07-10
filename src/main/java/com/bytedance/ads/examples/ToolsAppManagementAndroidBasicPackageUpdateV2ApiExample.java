/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAppManagementAndroidBasicPackageUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2Request;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/android_basic_package/update/ POST
public class ToolsAppManagementAndroidBasicPackageUpdateV2ApiExample {

    private static final ToolsAppManagementAndroidBasicPackageUpdateV2Api api = new ToolsAppManagementAndroidBasicPackageUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsAppManagementAndroidBasicPackageUpdateV2Request toolsAppManagementAndroidBasicPackageUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementAndroidBasicPackageUpdateV2Response response = api.openApi2ToolsAppManagementAndroidBasicPackageUpdatePost(toolsAppManagementAndroidBasicPackageUpdateV2Request);
        System.out.println(response);
    }

}