/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarMcnGetContractChallengeAuthorItemListV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarMcnGetContractChallengeAuthorItemListV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/mcn/get_contract_challenge_author_item_list_v2/ GET
public class StarMcnGetContractChallengeAuthorItemListV2V2ApiExample {

    private static final StarMcnGetContractChallengeAuthorItemListV2V2Api api = new StarMcnGetContractChallengeAuthorItemListV2V2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long demandId = null;
        Integer page = null;
        Integer pageSize = null;
        Long developerId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarMcnGetContractChallengeAuthorItemListV2V2Response response = api.openApi2StarMcnGetContractChallengeAuthorItemListV2Get(starId, demandId, page, pageSize, developerId);
        System.out.println(response);
    }

}