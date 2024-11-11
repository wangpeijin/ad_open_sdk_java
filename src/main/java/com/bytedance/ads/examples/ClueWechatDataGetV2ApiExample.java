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
import com.bytedance.ads.api.ClueWechatDataGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueWechatDataGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/wechat_data/get/ GET
public class ClueWechatDataGetV2ApiExample {

    private static final ClueWechatDataGetV2Api api = new ClueWechatDataGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String unionId = null;
        String state = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueWechatDataGetV2Response response = api.openApi2ClueWechatDataGetGet(advertiserId, unionId, state);
        System.out.println(response);
    }

}