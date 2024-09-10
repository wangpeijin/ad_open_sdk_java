/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarTaskBindProjectV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarTaskBindProjectV2Request;
import com.bytedance.ads.model.StarTaskBindProjectV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/task/bind_project/ POST
public class StarTaskBindProjectV2ApiExample {

    private static final StarTaskBindProjectV2Api api = new StarTaskBindProjectV2Api();

    public static void main(String[] args) throws ApiException {
        StarTaskBindProjectV2Request starTaskBindProjectV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarTaskBindProjectV2Response response = api.openApi2StarTaskBindProjectPost(starTaskBindProjectV2Request);
        System.out.println(response);
    }

}