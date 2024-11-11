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
import com.bytedance.ads.api.QianchuanCampaignListGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanCampaignListGetV10Filter;
import com.bytedance.ads.model.QianchuanCampaignListGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/campaign_list/get/ GET
public class QianchuanCampaignListGetV10ApiExample {

    private static final QianchuanCampaignListGetV10Api api = new QianchuanCampaignListGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanCampaignListGetV10Filter filter = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanCampaignListGetV10Response response = api.openApiV10QianchuanCampaignListGetGet(advertiserId, filter, page, pageSize);
        System.out.println(response);
    }

}