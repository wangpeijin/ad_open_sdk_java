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
import com.bytedance.ads.api.ToolsAppManagementBookingGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAppManagementBookingGetV2CreateTime;
import com.bytedance.ads.model.ToolsAppManagementBookingGetV2Response;
import com.bytedance.ads.model.ToolsAppManagementBookingGetV2ScheduledPublishTime;
import com.bytedance.ads.model.ToolsAppManagementBookingGetV2SearchType;
import com.bytedance.ads.model.ToolsAppManagementBookingGetV2Status;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/app_management/booking/get/ GET
public class ToolsAppManagementBookingGetV2ApiExample {

    private static final ToolsAppManagementBookingGetV2Api api = new ToolsAppManagementBookingGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Integer page = null;
        Integer pageSize = null;
        String searchKey = null;
        ToolsAppManagementBookingGetV2SearchType searchType = null;
        ToolsAppManagementBookingGetV2Status status = null;
        ToolsAppManagementBookingGetV2ScheduledPublishTime scheduledPublishTime = null;
        ToolsAppManagementBookingGetV2CreateTime createTime = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAppManagementBookingGetV2Response response = api.openApi2ToolsAppManagementBookingGetGet(advertiserId, page, pageSize, searchKey, searchType, status, scheduledPublishTime, createTime);
        System.out.println(response);
    }

}