/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarDemandOmExpandChallengeProviderV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmExpandChallengeProviderV2Request;
import com.bytedance.ads.model.StarDemandOmExpandChallengeProviderV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_expand_challenge_provider/ POST
public class StarDemandOmExpandChallengeProviderV2ApiExample {

    private static final StarDemandOmExpandChallengeProviderV2Api api = new StarDemandOmExpandChallengeProviderV2Api();

    public static void main(String[] args) throws ApiException {
        StarDemandOmExpandChallengeProviderV2Request starDemandOmExpandChallengeProviderV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmExpandChallengeProviderV2Response response = api.openApi2StarDemandOmExpandChallengeProviderPost(starDemandOmExpandChallengeProviderV2Request);
        System.out.println(response);
    }

}