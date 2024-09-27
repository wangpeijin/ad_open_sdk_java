/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QueryBookingBusinessEntityIdGetV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryBookingBusinessEntityIdGetV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/booking/business_entity_id/get/ GET
public class QueryBookingBusinessEntityIdGetV2ApiExample {

    private static final QueryBookingBusinessEntityIdGetV2Api api = new QueryBookingBusinessEntityIdGetV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        List<Long> orderIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryBookingBusinessEntityIdGetV2Response response = api.openApi2QueryBookingBusinessEntityIdGetGet(agentId, orderIds);
        System.out.println(response);
    }

}