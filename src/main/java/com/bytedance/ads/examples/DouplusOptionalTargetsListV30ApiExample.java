/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOptionalTargetsListV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOptionalTargetsListV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/douplus/optional_targets/list/ GET
public class DouplusOptionalTargetsListV30ApiExample {

    private static final DouplusOptionalTargetsListV30Api api = new DouplusOptionalTargetsListV30Api();

    public static void main(String[] args) throws ApiException {
        String awemeSecUid = null;
        Long itemId = null;
        String liveAwemeId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DouplusOptionalTargetsListV30Response response = api.openApiV30DouplusOptionalTargetsListGet(awemeSecUid, itemId, liveAwemeId);
        System.out.println(response);
    }

}