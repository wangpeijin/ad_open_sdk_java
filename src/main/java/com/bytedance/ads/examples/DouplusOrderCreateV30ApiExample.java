/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOrderCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOrderCreateV30Request;
import com.bytedance.ads.model.DouplusOrderCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/douplus/order/create/ POST
public class DouplusOrderCreateV30ApiExample {

    private static final DouplusOrderCreateV30Api api = new DouplusOrderCreateV30Api();

    public static void main(String[] args) throws ApiException {
        DouplusOrderCreateV30Request douplusOrderCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DouplusOrderCreateV30Response response = api.openApiV30DouplusOrderCreatePost(douplusOrderCreateV30Request);
        System.out.println(response);
    }

}