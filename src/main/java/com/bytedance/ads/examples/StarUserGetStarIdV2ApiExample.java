/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarUserGetStarIdV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarUserGetStarIdV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/user/get_star_id/ GET
public class StarUserGetStarIdV2ApiExample {

    private static final StarUserGetStarIdV2Api api = new StarUserGetStarIdV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long awemeAuthorId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarUserGetStarIdV2Response response = api.openApi2StarUserGetStarIdGet(starId, awemeAuthorId);
        System.out.println(response);
    }

}