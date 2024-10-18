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
import com.bytedance.ads.api.FileCarouselAwemeGetV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileCarouselAwemeGetV30Filtering;
import com.bytedance.ads.model.FileCarouselAwemeGetV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/file/carousel/aweme/get/ GET
public class FileCarouselAwemeGetV30ApiExample {

    private static final FileCarouselAwemeGetV30Api api = new FileCarouselAwemeGetV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String awemeId = null;
        FileCarouselAwemeGetV30Filtering filtering = null;
        String cursor = null;
        Long count = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileCarouselAwemeGetV30Response response = api.openApiV30FileCarouselAwemeGetGet(advertiserId, awemeId, filtering, cursor, count);
        System.out.println(response);
    }

}