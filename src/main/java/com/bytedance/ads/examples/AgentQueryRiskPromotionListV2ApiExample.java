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
import com.bytedance.ads.api.AgentQueryRiskPromotionListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2BusinessType;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2Filtering;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/agent/query/risk_promotion_list/ GET
public class AgentQueryRiskPromotionListV2ApiExample {

    private static final AgentQueryRiskPromotionListV2Api api = new AgentQueryRiskPromotionListV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        AgentQueryRiskPromotionListV2BusinessType businessType = null;
        String startDate = null;
        String endDate = null;
        Long cursor = null;
        Integer count = null;
        AgentQueryRiskPromotionListV2Filtering filtering = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AgentQueryRiskPromotionListV2Response response = api.openApi2AgentQueryRiskPromotionListGet(agentId, businessType, startDate, endDate, cursor, count, filtering);
        System.out.println(response);
    }

}