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
import com.bytedance.ads.api.ToolsWechatAppletUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsWechatAppletUpdateV30Request;
import com.bytedance.ads.model.ToolsWechatAppletUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/wechat_applet/update/ POST
public class ToolsWechatAppletUpdateV30ApiExample {

    private static final ToolsWechatAppletUpdateV30Api api = new ToolsWechatAppletUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ToolsWechatAppletUpdateV30Request toolsWechatAppletUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsWechatAppletUpdateV30Response response = api.openApiV30ToolsWechatAppletUpdatePost(toolsWechatAppletUpdateV30Request);
        System.out.println(response);
    }

}