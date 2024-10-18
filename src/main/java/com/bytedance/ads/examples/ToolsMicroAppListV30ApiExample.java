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
import com.bytedance.ads.api.ToolsMicroAppListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsMicroAppListV30Filtering;
import com.bytedance.ads.model.ToolsMicroAppListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/tools/micro_app/list/ GET
public class ToolsMicroAppListV30ApiExample {

    private static final ToolsMicroAppListV30Api api = new ToolsMicroAppListV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        ToolsMicroAppListV30Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsMicroAppListV30Response response = api.openApiV30ToolsMicroAppListGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}