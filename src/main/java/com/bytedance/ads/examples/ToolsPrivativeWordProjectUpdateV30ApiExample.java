/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsPrivativeWordProjectUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsPrivativeWordProjectUpdateV30Request;
import com.bytedance.ads.model.ToolsPrivativeWordProjectUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/privative_word/project/update/ POST
public class ToolsPrivativeWordProjectUpdateV30ApiExample {

    private static final ToolsPrivativeWordProjectUpdateV30Api api = new ToolsPrivativeWordProjectUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsPrivativeWordProjectUpdateV30Request toolsPrivativeWordProjectUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsPrivativeWordProjectUpdateV30Response response = api.openApiV30ToolsPrivativeWordProjectUpdatePost(toolsPrivativeWordProjectUpdateV30Request);
        System.out.println(response);
    }

}