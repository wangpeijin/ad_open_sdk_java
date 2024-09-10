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
import com.bytedance.ads.api.ToolsPreAuditSendV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPreAuditSendV2Request;
import com.bytedance.ads.model.ToolsPreAuditSendV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/pre_audit/send/ POST
public class ToolsPreAuditSendV2ApiExample {

    private static final ToolsPreAuditSendV2Api api = new ToolsPreAuditSendV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsPreAuditSendV2Request toolsPreAuditSendV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPreAuditSendV2Response response = api.openApi2ToolsPreAuditSendPost(toolsPreAuditSendV2Request);
        System.out.println(response);
    }

}