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
import com.bytedance.ads.api.QueryProjectV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QueryProjectV2Filtering;
import com.bytedance.ads.model.QueryProjectV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/query/project/ GET
public class QueryProjectV2ApiExample {

    private static final QueryProjectV2Api api = new QueryProjectV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        Integer count = null;
        Long cursor = null;
        QueryProjectV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QueryProjectV2Response response = api.openApi2QueryProjectGet(agentId, count, cursor, filtering);
        System.out.println(response);
    }

}