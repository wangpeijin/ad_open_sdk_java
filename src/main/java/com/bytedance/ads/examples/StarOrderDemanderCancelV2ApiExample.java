/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarOrderDemanderCancelV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderDemanderCancelV2Request;
import com.bytedance.ads.model.StarOrderDemanderCancelV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/demander_cancel/ POST
public class StarOrderDemanderCancelV2ApiExample {

    private static final StarOrderDemanderCancelV2Api api = new StarOrderDemanderCancelV2Api();

    public static void main(String[] args) throws ApiException {
        StarOrderDemanderCancelV2Request starOrderDemanderCancelV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderDemanderCancelV2Response response = api.openApi2StarOrderDemanderCancelPost(starOrderDemanderCancelV2Request);
        System.out.println(response);
    }

}