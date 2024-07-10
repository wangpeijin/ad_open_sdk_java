/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarOrderApproveResourceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderApproveResourceV2Request;
import com.bytedance.ads.model.StarOrderApproveResourceV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/approve_resource/ POST
public class StarOrderApproveResourceV2ApiExample {

    private static final StarOrderApproveResourceV2Api api = new StarOrderApproveResourceV2Api();

    public static void main(String[] args) throws ApiException {
        StarOrderApproveResourceV2Request starOrderApproveResourceV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderApproveResourceV2Response response = api.openApi2StarOrderApproveResourcePost(starOrderApproveResourceV2Request);
        System.out.println(response);
    }

}