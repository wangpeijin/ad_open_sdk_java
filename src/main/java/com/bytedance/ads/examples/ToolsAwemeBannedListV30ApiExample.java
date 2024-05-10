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
import com.bytedance.ads.api.ToolsAwemeBannedListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsAwemeBannedListV30BannedType;
import com.bytedance.ads.model.ToolsAwemeBannedListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/aweme_banned/list/ GET
public class ToolsAwemeBannedListV30ApiExample {

    private static final ToolsAwemeBannedListV30Api api = new ToolsAwemeBannedListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsAwemeBannedListV30BannedType bannedType = null;
        String awemeId = null;
        Boolean isApplyToAdv = null;
        String nicknameKeyword = null;
        String awemeUserId = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsAwemeBannedListV30Response response = api.openApiV30ToolsAwemeBannedListGet(advertiserId, bannedType, awemeId, isApplyToAdv, nicknameKeyword, awemeUserId, page, pageSize);
        System.out.println(response);
    }

}