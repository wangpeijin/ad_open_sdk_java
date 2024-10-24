/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarChallengeExpandRangeV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarChallengeExpandRangeV2Request;
import com.bytedance.ads.model.StarChallengeExpandRangeV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/challenge/expand_range/ POST
public class StarChallengeExpandRangeV2ApiExample {

    private static final StarChallengeExpandRangeV2Api api = new StarChallengeExpandRangeV2Api();

    public static void main(String[] args) throws ApiException {
        StarChallengeExpandRangeV2Request starChallengeExpandRangeV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarChallengeExpandRangeV2Response response = api.openApi2StarChallengeExpandRangePost(starChallengeExpandRangeV2Request);
        System.out.println(response);
    }

}