/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsClueCallVirtualNumberRefundDetailGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueCallVirtualNumberRefundDetailGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/call_virtual_number/refund_detail/get/ GET
public class ToolsClueCallVirtualNumberRefundDetailGetV2ApiExample {

    private static final ToolsClueCallVirtualNumberRefundDetailGetV2Api api = new ToolsClueCallVirtualNumberRefundDetailGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String month = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueCallVirtualNumberRefundDetailGetV2Response response = api.openApi2ToolsClueCallVirtualNumberRefundDetailGetGet(advertiserId, month, page, pageSize);
        System.out.println(response);
    }

}