/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPrivativeWordPromotionUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionUpdateV30Request;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/privative_word/promotion/update/ POST
public class ToolsPrivativeWordPromotionUpdateV30ApiExample {

    private static final ToolsPrivativeWordPromotionUpdateV30Api api = new ToolsPrivativeWordPromotionUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordPromotionUpdateV30Request toolsPrivativeWordPromotionUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordPromotionUpdateV30Response response = api.openApiV30ToolsPrivativeWordPromotionUpdatePost(toolsPrivativeWordPromotionUpdateV30Request);
        System.out.println(response);
    }

}