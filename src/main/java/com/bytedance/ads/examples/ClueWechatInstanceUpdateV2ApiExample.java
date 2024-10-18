/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ClueWechatInstanceUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ClueWechatInstanceUpdateV2Request;
import com.bytedance.ads.model.ClueWechatInstanceUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/clue/wechat_instance/update/ POST
public class ClueWechatInstanceUpdateV2ApiExample {

    private static final ClueWechatInstanceUpdateV2Api api = new ClueWechatInstanceUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        ClueWechatInstanceUpdateV2Request clueWechatInstanceUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ClueWechatInstanceUpdateV2Response response = api.openApi2ClueWechatInstanceUpdatePost(clueWechatInstanceUpdateV2Request);
        System.out.println(response);
    }

}