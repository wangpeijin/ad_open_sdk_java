/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarVasCreateBoostItemGroupV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2Request;
import com.bytedance.ads.model.StarVasCreateBoostItemGroupV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/vas/create_boost_item_group/ POST
public class StarVasCreateBoostItemGroupV2ApiExample {

    private static final StarVasCreateBoostItemGroupV2Api api = new StarVasCreateBoostItemGroupV2Api();

    public static void main(String[] args) throws ApiException {
        StarVasCreateBoostItemGroupV2Request starVasCreateBoostItemGroupV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarVasCreateBoostItemGroupV2Response response = api.openApi2StarVasCreateBoostItemGroupPost(starVasCreateBoostItemGroupV2Request);
        System.out.println(response);
    }

}