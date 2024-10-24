/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DmpCustomAudiencePushV2V2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpCustomAudiencePushV2V2Request;
import com.bytedance.ads.model.DmpCustomAudiencePushV2V2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/custom_audience/push_v2/ POST
public class DmpCustomAudiencePushV2V2ApiExample {

    private static final DmpCustomAudiencePushV2V2Api api = new DmpCustomAudiencePushV2V2Api();

    public static void main(String[] args) throws ApiException {
        DmpCustomAudiencePushV2V2Request dmpCustomAudiencePushV2V2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpCustomAudiencePushV2V2Response response = api.openApi2DmpCustomAudiencePushV2Post(dmpCustomAudiencePushV2V2Request);
        System.out.println(response);
    }

}