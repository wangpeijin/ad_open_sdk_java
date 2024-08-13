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
import com.bytedance.ads.api.ToolsCommentTermsBannedUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentTermsBannedUpdateV30Request;
import com.bytedance.ads.model.ToolsCommentTermsBannedUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment/terms_banned/update/ POST
public class ToolsCommentTermsBannedUpdateV30ApiExample {

    private static final ToolsCommentTermsBannedUpdateV30Api api = new ToolsCommentTermsBannedUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsCommentTermsBannedUpdateV30Request toolsCommentTermsBannedUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentTermsBannedUpdateV30Response response = api.openApiV30ToolsCommentTermsBannedUpdatePost(toolsCommentTermsBannedUpdateV30Request);
        System.out.println(response);
    }

}