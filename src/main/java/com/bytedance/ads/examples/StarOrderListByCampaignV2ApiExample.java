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
import com.bytedance.ads.api.StarOrderListByCampaignV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.StarOrderListByCampaignV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/star/order/list_by_campaign/ GET
public class StarOrderListByCampaignV2ApiExample {

    private static final StarOrderListByCampaignV2Api api = new StarOrderListByCampaignV2Api();

    public static void main(String[] args) throws ApiException {
        Long starId = null;
        List<Long> campaignIds = null;
        Integer page = null;
        Integer limit = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        StarOrderListByCampaignV2Response response = api.openApi2StarOrderListByCampaignGet(starId, campaignIds, page, limit);
        System.out.println(response);
    }

}