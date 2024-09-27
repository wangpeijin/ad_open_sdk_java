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
import com.bytedance.ads.api.QianchuanProductAvailableGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10CampaignScene;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10Filter;
import com.bytedance.ads.model.QianchuanProductAvailableGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/product/available/get/ GET
public class QianchuanProductAvailableGetV10ApiExample {

    private static final QianchuanProductAvailableGetV10Api api = new QianchuanProductAvailableGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        Long awemeId = null;
        QianchuanProductAvailableGetV10Filter filter = null;
        QianchuanProductAvailableGetV10CampaignScene campaignScene = null;
        Integer page = null;
        Integer pageSize = null;
        Long cursor = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanProductAvailableGetV10Response response = api.openApiV10QianchuanProductAvailableGetGet(advertiserId, awemeId, filter, campaignScene, page, pageSize, cursor);
        System.out.println(response);
    }

}