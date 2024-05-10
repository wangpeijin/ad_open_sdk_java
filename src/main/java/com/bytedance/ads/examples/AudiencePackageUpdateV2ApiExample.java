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
import com.bytedance.ads.api.AudiencePackageUpdateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AudiencePackageUpdateV2Request;
import com.bytedance.ads.model.AudiencePackageUpdateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/audience_package/update/ POST
public class AudiencePackageUpdateV2ApiExample {

    private static final AudiencePackageUpdateV2Api api = new AudiencePackageUpdateV2Api();

    public static void main(String[] args) throws ApiException {
        AudiencePackageUpdateV2Request audiencePackageUpdateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AudiencePackageUpdateV2Response response = api.openApi2AudiencePackageUpdatePost(audiencePackageUpdateV2Request);
        System.out.println(response);
    }

}