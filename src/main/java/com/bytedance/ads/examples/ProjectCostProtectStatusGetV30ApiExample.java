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
import com.bytedance.ads.api.ProjectCostProtectStatusGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectCostProtectStatusGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/cost_protect_status/get/ GET
public class ProjectCostProtectStatusGetV30ApiExample {

    private static final ProjectCostProtectStatusGetV30Api api = new ProjectCostProtectStatusGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> projectIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectCostProtectStatusGetV30Response response = api.openApiV30ProjectCostProtectStatusGetGet(advertiserId, projectIds);
        System.out.println(response);
    }

}