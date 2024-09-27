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
import com.bytedance.ads.api.StarOrderDetailV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderDetailV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/detail/ GET
public class StarOrderDetailV2ApiExample {

    private static final StarOrderDetailV2Api api = new StarOrderDetailV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        Long orderId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderDetailV2Response response = api.openApi2StarOrderDetailGet(starId, orderId);
        System.out.println(response);
    }

}