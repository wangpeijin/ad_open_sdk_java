/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarClueGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarClueGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/clue/get/ GET
public class StarClueGetV2ApiExample {

    private static final StarClueGetV2Api api = new StarClueGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long demandId = null;
        Long orderId = null;
        Long page = null;
        Long pageSize = null;
        Long starId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarClueGetV2Response response = api.openApi2StarClueGetGet(demandId, orderId, page, pageSize, starId);
        System.out.println(response);
    }

}