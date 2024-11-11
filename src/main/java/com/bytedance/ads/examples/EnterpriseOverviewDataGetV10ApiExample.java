/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EnterpriseOverviewDataGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10Filter;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10OrderType;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10Response;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10TimeDimension;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/enterprise/overview/data/get/ GET
public class EnterpriseOverviewDataGetV10ApiExample {

    private static final EnterpriseOverviewDataGetV10Api api = new EnterpriseOverviewDataGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String endTime = null;
        List<String> fields = null;
        EnterpriseOverviewDataGetV10Filter filter = null;
        String lastEndTime = null;
        String lastStartTime = null;
        Long limit = null;
        Long offset = null;
        String orderField = null;
        EnterpriseOverviewDataGetV10OrderType orderType = null;
        List<String> ratioFields = null;
        String startTime = null;
        EnterpriseOverviewDataGetV10TimeDimension timeDimension = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EnterpriseOverviewDataGetV10Response response = api.openApiV10EnterpriseOverviewDataGetGet(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension);
        System.out.println(response);
    }

}