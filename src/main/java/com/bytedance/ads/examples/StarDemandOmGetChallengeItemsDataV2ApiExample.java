/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarDemandOmGetChallengeItemsDataV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandOmGetChallengeItemsDataV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/om_get_challenge_items_data/ GET
public class StarDemandOmGetChallengeItemsDataV2ApiExample {

    private static final StarDemandOmGetChallengeItemsDataV2Api api = new StarDemandOmGetChallengeItemsDataV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long challengeTaskId = null;
        Integer page = null;
        Integer limit = null;
        Long developerId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandOmGetChallengeItemsDataV2Response response = api.openApi2StarDemandOmGetChallengeItemsDataGet(starId, challengeTaskId, page, limit, developerId);
        System.out.println(response);
    }

}