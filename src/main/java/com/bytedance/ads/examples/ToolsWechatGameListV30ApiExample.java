/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsWechatGameListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsWechatGameListV30AccountType;
import com.bytedance.ads.model.ToolsWechatGameListV30Filtering;
import com.bytedance.ads.model.ToolsWechatGameListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/wechat_game/list/ GET
public class ToolsWechatGameListV30ApiExample {

    private static final ToolsWechatGameListV30Api api = new ToolsWechatGameListV30Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        ToolsWechatGameListV30AccountType accountType = null;
        ToolsWechatGameListV30Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsWechatGameListV30Response response = api.openApiV30ToolsWechatGameListGet(accountId, accountType, filtering, page, pageSize);
        System.out.println(response);
    }

}