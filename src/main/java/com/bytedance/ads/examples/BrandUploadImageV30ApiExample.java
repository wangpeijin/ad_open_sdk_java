/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandUploadImageV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandUploadImageV30Response;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/upload_image/ POST
public class BrandUploadImageV30ApiExample {

    private static final BrandUploadImageV30Api api = new BrandUploadImageV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        File imageFile = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandUploadImageV30Response response = api.openApiV30BrandUploadImagePost(advertiserId, imageFile);
        System.out.println(response);
    }

}