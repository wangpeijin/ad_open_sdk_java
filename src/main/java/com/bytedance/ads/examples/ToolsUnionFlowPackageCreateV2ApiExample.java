/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsUnionFlowPackageCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsUnionFlowPackageCreateV2Request;
import com.bytedance.ads.model.ToolsUnionFlowPackageCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/union/flow_package/create/ POST
public class ToolsUnionFlowPackageCreateV2ApiExample {

    private static final ToolsUnionFlowPackageCreateV2Api api = new ToolsUnionFlowPackageCreateV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsUnionFlowPackageCreateV2Request toolsUnionFlowPackageCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsUnionFlowPackageCreateV2Response response = api.openApi2ToolsUnionFlowPackageCreatePost(toolsUnionFlowPackageCreateV2Request);
        System.out.println(response);
    }

}