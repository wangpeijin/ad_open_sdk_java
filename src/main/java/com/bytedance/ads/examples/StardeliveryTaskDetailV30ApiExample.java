/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StardeliveryTaskDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StardeliveryTaskDetailV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/stardelivery/task/detail/ GET
public class StardeliveryTaskDetailV30ApiExample {

    private static final StardeliveryTaskDetailV30Api api = new StardeliveryTaskDetailV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long starTaskId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StardeliveryTaskDetailV30Response response = api.openApiV30StardeliveryTaskDetailGet(advertiserId, starTaskId);
        System.out.println(response);
    }

}