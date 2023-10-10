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
import com.bytedance.ads.api.AdvConvertOleConvertV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvConvertOleConvertV2Request;
import com.bytedance.ads.model.AdvConvertOleConvertV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/adv_convert/ole/convert/ POST
public class AdvConvertOleConvertV2ApiExample {

    private static final AdvConvertOleConvertV2Api api = new AdvConvertOleConvertV2Api();

    public static void main(String[] args) throws ApiException {
        AdvConvertOleConvertV2Request advConvertOleConvertV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvConvertOleConvertV2Response response = api.openApi2AdvConvertOleConvertPost(advConvertOleConvertV2Request);
        System.out.println(response);
    }

}