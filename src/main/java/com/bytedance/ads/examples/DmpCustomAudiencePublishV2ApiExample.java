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
import com.bytedance.ads.api.DmpCustomAudiencePublishV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpCustomAudiencePublishV2Request;
import com.bytedance.ads.model.DmpCustomAudiencePublishV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/custom_audience/publish/ POST
public class DmpCustomAudiencePublishV2ApiExample {

    private static final DmpCustomAudiencePublishV2Api api = new DmpCustomAudiencePublishV2Api();

    public static void main(String[] args) throws ApiException {
        DmpCustomAudiencePublishV2Request dmpCustomAudiencePublishV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpCustomAudiencePublishV2Response response = api.openApi2DmpCustomAudiencePublishPost(dmpCustomAudiencePublishV2Request);
        System.out.println(response);
    }

}