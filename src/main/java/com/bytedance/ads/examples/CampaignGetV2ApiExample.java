/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.CampaignGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.CampaignGetV2Filtering;
import com.bytedance.ads.model.CampaignGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/campaign/get/ GET
public class CampaignGetV2ApiExample {

    private static final CampaignGetV2Api api = new CampaignGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<String> fields = null;
        CampaignGetV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        CampaignGetV2Response response = api.openApi2CampaignGetGet(advertiserId, fields, filtering, page, pageSize);
        System.out.println(response);
    }

}