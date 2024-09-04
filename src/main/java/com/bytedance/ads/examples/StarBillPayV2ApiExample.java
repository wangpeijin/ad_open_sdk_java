/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarBillPayV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarBillPayV2Request;
import com.bytedance.ads.model.StarBillPayV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/bill/pay/ POST
public class StarBillPayV2ApiExample {

    private static final StarBillPayV2Api api = new StarBillPayV2Api();

    public static void main(String[] args) throws ApiException {
        StarBillPayV2Request starBillPayV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarBillPayV2Response response = api.openApi2StarBillPayPost(starBillPayV2Request);
        System.out.println(response);
    }

}