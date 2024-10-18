/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarStarAdUniteTaskListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarStarAdUniteTaskListV2Filtering;
import com.bytedance.ads.model.StarStarAdUniteTaskListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/star_ad_unite_task/list/ GET
public class StarStarAdUniteTaskListV2ApiExample {

    private static final StarStarAdUniteTaskListV2Api api = new StarStarAdUniteTaskListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Integer page = null;
        Integer pageSize = null;
        StarStarAdUniteTaskListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarStarAdUniteTaskListV2Response response = api.openApi2StarStarAdUniteTaskListGet(starId, page, pageSize, filtering);
        System.out.println(response);
    }

}