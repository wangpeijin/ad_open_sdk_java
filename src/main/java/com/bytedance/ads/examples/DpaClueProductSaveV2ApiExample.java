/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DpaClueProductSaveV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DpaClueProductSaveV2Request;
import com.bytedance.ads.model.DpaClueProductSaveV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dpa/clue_product/save/ POST
public class DpaClueProductSaveV2ApiExample {

    private static final DpaClueProductSaveV2Api api = new DpaClueProductSaveV2Api();

    public static void main(String[] args) throws ApiException {
        DpaClueProductSaveV2Request dpaClueProductSaveV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DpaClueProductSaveV2Response response = api.openApi2DpaClueProductSavePost(dpaClueProductSaveV2Request);
        System.out.println(response);
    }

}