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
import com.bytedance.ads.api.NativeAnchorGetDetailV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.NativeAnchorGetDetailV30AnchorType;
import com.bytedance.ads.model.NativeAnchorGetDetailV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/native_anchor/get/detail/ GET
public class NativeAnchorGetDetailV30ApiExample {

    private static final NativeAnchorGetDetailV30Api api = new NativeAnchorGetDetailV30Api();

    public static void main(String[] args) throws ApiException {
        List<String> anchorIds = null;
        Long advertiserId = null;
        NativeAnchorGetDetailV30AnchorType anchorType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        NativeAnchorGetDetailV30Response response = api.openApiV30NativeAnchorGetDetailGet(anchorIds, advertiserId, anchorType);
        System.out.println(response);
    }

}