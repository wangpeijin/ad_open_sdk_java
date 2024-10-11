/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DmpDataSourceCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpDataSourceCreateV2Request;
import com.bytedance.ads.model.DmpDataSourceCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/data_source/create/ POST
public class DmpDataSourceCreateV2ApiExample {

    private static final DmpDataSourceCreateV2Api api = new DmpDataSourceCreateV2Api();

    public static void main(String[] args) throws ApiException {
        DmpDataSourceCreateV2Request dmpDataSourceCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpDataSourceCreateV2Response response = api.openApi2DmpDataSourceCreatePost(dmpDataSourceCreateV2Request);
        System.out.println(response);
    }

}