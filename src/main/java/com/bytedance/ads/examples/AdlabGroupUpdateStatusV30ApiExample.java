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
import com.bytedance.ads.api.AdlabGroupUpdateStatusV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdlabGroupUpdateStatusV30Request;
import com.bytedance.ads.model.AdlabGroupUpdateStatusV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/adlab/group/update_status/ POST
public class AdlabGroupUpdateStatusV30ApiExample {

    private static final AdlabGroupUpdateStatusV30Api api = new AdlabGroupUpdateStatusV30Api();

    public static void main(String[] args) throws ApiException {
        AdlabGroupUpdateStatusV30Request adlabGroupUpdateStatusV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdlabGroupUpdateStatusV30Response response = api.openApiV30AdlabGroupUpdateStatusPost(adlabGroupUpdateStatusV30Request);
        System.out.println(response);
    }

}