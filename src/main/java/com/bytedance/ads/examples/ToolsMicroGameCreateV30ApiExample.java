/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsMicroGameCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsMicroGameCreateV30Request;
import com.bytedance.ads.model.ToolsMicroGameCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/micro_game/create/ POST
public class ToolsMicroGameCreateV30ApiExample {

    private static final ToolsMicroGameCreateV30Api api = new ToolsMicroGameCreateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsMicroGameCreateV30Request toolsMicroGameCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsMicroGameCreateV30Response response = api.openApiV30ToolsMicroGameCreatePost(toolsMicroGameCreateV30Request);
        System.out.println(response);
    }

}