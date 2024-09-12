/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.StarDemandListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarDemandListV2Filtering;
import com.bytedance.ads.model.StarDemandListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/demand/list/ GET
public class StarDemandListV2ApiExample {

    private static final StarDemandListV2Api api = new StarDemandListV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        StarDemandListV2Filtering filtering = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarDemandListV2Response response = api.openApi2StarDemandListGet(starId, filtering, page, pageSize);
        System.out.println(response);
    }

}