/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DouplusOrderCloseV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DouplusOrderCloseV30Request;
import com.bytedance.ads.model.DouplusOrderCloseV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/douplus/order/close/ POST
public class DouplusOrderCloseV30ApiExample {

    private static final DouplusOrderCloseV30Api api = new DouplusOrderCloseV30Api();

    public static void main(String[] args) throws ApiException {
        DouplusOrderCloseV30Request douplusOrderCloseV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DouplusOrderCloseV30Response response = api.openApiV30DouplusOrderClosePost(douplusOrderCloseV30Request);
        System.out.println(response);
    }

}