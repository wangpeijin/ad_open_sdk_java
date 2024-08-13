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
import com.bytedance.ads.api.Oauth2AppAccessTokenApi;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.Oauth2AppAccessTokenRequest;
import com.bytedance.ads.model.Oauth2AppAccessTokenResponse;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/oauth2/app_access_token/ POST
public class Oauth2AppAccessTokenApiExample {

    private static final Oauth2AppAccessTokenApi api = new Oauth2AppAccessTokenApi();

    public static void main(String[] args) throws ApiException {
        Oauth2AppAccessTokenRequest oauth2AppAccessTokenRequest = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        Oauth2AppAccessTokenResponse response = api.openApiOauth2AppAccessTokenPost(oauth2AppAccessTokenRequest);
        System.out.println(response);
    }

}