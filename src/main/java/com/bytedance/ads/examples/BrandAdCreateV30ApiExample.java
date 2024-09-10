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
import com.bytedance.ads.api.BrandAdCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandAdCreateV30Request;
import com.bytedance.ads.model.BrandAdCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/ad/create/ POST
public class BrandAdCreateV30ApiExample {

    private static final BrandAdCreateV30Api api = new BrandAdCreateV30Api();

    public static void main(String[] args) throws ApiException {
        BrandAdCreateV30Request brandAdCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandAdCreateV30Response response = api.openApiV30BrandAdCreatePost(brandAdCreateV30Request);
        System.out.println(response);
    }

}