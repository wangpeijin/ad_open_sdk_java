/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsCommentReplyGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsCommentReplyGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/comment_reply/get/ GET
public class ToolsCommentReplyGetV30ApiExample {

    private static final ToolsCommentReplyGetV30Api api = new ToolsCommentReplyGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long commentId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsCommentReplyGetV30Response response = api.openApiV30ToolsCommentReplyGetGet(advertiserId, commentId, page, pageSize);
        System.out.println(response);
    }

}