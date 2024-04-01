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
import com.bytedance.ads.api.StarOrderGetInfoV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderGetInfoV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/get_info/ GET
public class StarOrderGetInfoV2ApiExample {

    private static final StarOrderGetInfoV2Api api = new StarOrderGetInfoV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        List<Long> orderIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderGetInfoV2Response response = api.openApi2StarOrderGetInfoGet(starId, orderIds);
        System.out.println(response);
    }

}