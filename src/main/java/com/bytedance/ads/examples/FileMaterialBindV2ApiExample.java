/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileMaterialBindV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileMaterialBindV2Request;
import com.bytedance.ads.model.FileMaterialBindV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/material/bind/ POST
public class FileMaterialBindV2ApiExample {

    private static final FileMaterialBindV2Api api = new FileMaterialBindV2Api();

    public static void main(String[] args) throws ApiException {
        FileMaterialBindV2Request fileMaterialBindV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileMaterialBindV2Response response = api.openApi2FileMaterialBindPost(fileMaterialBindV2Request);
        System.out.println(response);
    }

}