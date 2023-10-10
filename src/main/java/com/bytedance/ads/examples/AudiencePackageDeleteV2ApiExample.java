/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AudiencePackageDeleteV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AudiencePackageDeleteV2Request;
import com.bytedance.ads.model.AudiencePackageDeleteV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/audience_package/delete/ POST
public class AudiencePackageDeleteV2ApiExample {

    private static final AudiencePackageDeleteV2Api api = new AudiencePackageDeleteV2Api();

    public static void main(String[] args) throws ApiException {
        AudiencePackageDeleteV2Request audiencePackageDeleteV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AudiencePackageDeleteV2Response response = api.openApi2AudiencePackageDeletePost(audiencePackageDeleteV2Request);
        System.out.println(response);
    }

}