/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAppManagementExtendPackageListV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2AccountType;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2Filtering;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/extend_package/list_v2/ GET
public class ToolsAppManagementExtendPackageListV2V2ApiExample {

    private static final ToolsAppManagementExtendPackageListV2V2Api api = new ToolsAppManagementExtendPackageListV2V2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsAppManagementExtendPackageListV2V2AccountType accountType = null;
        String packageId = null;
        Integer page = null;
        Integer pageSize = null;
        ToolsAppManagementExtendPackageListV2V2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementExtendPackageListV2V2Response response = api.openApi2ToolsAppManagementExtendPackageListV2Get(accountId, accountType, packageId, page, pageSize, filtering);
        System.out.println(response);
    }

}