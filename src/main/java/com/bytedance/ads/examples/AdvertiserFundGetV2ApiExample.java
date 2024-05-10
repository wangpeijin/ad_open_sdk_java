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
import com.bytedance.ads.api.AdvertiserFundGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserFundGetV2GrantTypeSplit;
import com.bytedance.ads.model.AdvertiserFundGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/fund/get/ GET
public class AdvertiserFundGetV2ApiExample {

    private static final AdvertiserFundGetV2Api api = new AdvertiserFundGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        AdvertiserFundGetV2GrantTypeSplit grantTypeSplit = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserFundGetV2Response response = api.openApi2AdvertiserFundGetGet(advertiserId, grantTypeSplit);
        System.out.println(response);
    }

}