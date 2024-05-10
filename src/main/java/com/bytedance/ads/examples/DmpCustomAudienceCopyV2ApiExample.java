/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DmpCustomAudienceCopyV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DmpCustomAudienceCopyV2Request;
import com.bytedance.ads.model.DmpCustomAudienceCopyV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/dmp/custom_audience/copy/ POST
public class DmpCustomAudienceCopyV2ApiExample {

    private static final DmpCustomAudienceCopyV2Api api = new DmpCustomAudienceCopyV2Api();

    public static void main(String[] args) throws ApiException {
        DmpCustomAudienceCopyV2Request dmpCustomAudienceCopyV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DmpCustomAudienceCopyV2Response response = api.openApi2DmpCustomAudienceCopyPost(dmpCustomAudienceCopyV2Request);
        System.out.println(response);
    }

}