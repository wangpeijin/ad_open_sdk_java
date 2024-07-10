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
import com.bytedance.ads.api.ToolsClueLiteContactRecordV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsClueLiteContactRecordV2Request;
import com.bytedance.ads.model.ToolsClueLiteContactRecordV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/clue/lite/contact/record/ POST
public class ToolsClueLiteContactRecordV2ApiExample {

    private static final ToolsClueLiteContactRecordV2Api api = new ToolsClueLiteContactRecordV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsClueLiteContactRecordV2Request toolsClueLiteContactRecordV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsClueLiteContactRecordV2Response response = api.openApi2ToolsClueLiteContactRecordPost(toolsClueLiteContactRecordV2Request);
        System.out.println(response);
    }

}