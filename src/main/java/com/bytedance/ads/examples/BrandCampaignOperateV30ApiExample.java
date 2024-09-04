/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.BrandCampaignOperateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.BrandCampaignOperateV30Request;
import com.bytedance.ads.model.BrandCampaignOperateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/brand/campaign/operate/ POST
public class BrandCampaignOperateV30ApiExample {

    private static final BrandCampaignOperateV30Api api = new BrandCampaignOperateV30Api();

    public static void main(String[] args) throws ApiException {
        BrandCampaignOperateV30Request brandCampaignOperateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        BrandCampaignOperateV30Response response = api.openApiV30BrandCampaignOperatePost(brandCampaignOperateV30Request);
        System.out.println(response);
    }

}