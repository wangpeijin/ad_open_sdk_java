/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPreAuditGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPreAuditGetV2Filter;
import com.bytedance.ads.model.ToolsPreAuditGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/pre_audit/get/ GET
public class ToolsPreAuditGetV2ApiExample {

    private static final ToolsPreAuditGetV2Api api = new ToolsPreAuditGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsPreAuditGetV2Filter filter = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPreAuditGetV2Response response = api.openApi2ToolsPreAuditGetGet(advertiserId, filter, page, pageSize);
        System.out.println(response);
    }

}