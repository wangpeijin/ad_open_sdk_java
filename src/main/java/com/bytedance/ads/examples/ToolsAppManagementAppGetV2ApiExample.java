/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsAppManagementAppGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementAppGetV2CreateTime;
import com.bytedance.ads.model.ToolsAppManagementAppGetV2PublishTime;
import com.bytedance.ads.model.ToolsAppManagementAppGetV2Response;
import com.bytedance.ads.model.ToolsAppManagementAppGetV2SearchType;
import com.bytedance.ads.model.ToolsAppManagementAppGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/app/get/ GET
public class ToolsAppManagementAppGetV2ApiExample {

    private static final ToolsAppManagementAppGetV2Api api = new ToolsAppManagementAppGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        String searchKey = null;
        ToolsAppManagementAppGetV2SearchType searchType = null;
        ToolsAppManagementAppGetV2Status status = null;
        ToolsAppManagementAppGetV2PublishTime publishTime = null;
        ToolsAppManagementAppGetV2CreateTime createTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementAppGetV2Response response = api.openApi2ToolsAppManagementAppGetGet(advertiserId, page, pageSize, searchKey, searchType, status, publishTime, createTime);
        System.out.println(response);
    }

}