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
import com.bytedance.ads.api.StardeliveryTaskAuthorVideoDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30Filtering;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30Response;
import com.bytedance.ads.model.StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/stardelivery/task_author_video/detail/ GET
public class StardeliveryTaskAuthorVideoDetailV30ApiExample {

    private static final StardeliveryTaskAuthorVideoDetailV30Api api = new StardeliveryTaskAuthorVideoDetailV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long starTaskId = null;
        String awemeId = null;
        StardeliveryTaskAuthorVideoDetailV30StarTaskVideoRange starTaskVideoRange = null;
        StardeliveryTaskAuthorVideoDetailV30Filtering filtering = null;
        Long cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StardeliveryTaskAuthorVideoDetailV30Response response = api.openApiV30StardeliveryTaskAuthorVideoDetailGet(advertiserId, starTaskId, awemeId, starTaskVideoRange, filtering, cursor, count);
        System.out.println(response);
    }

}