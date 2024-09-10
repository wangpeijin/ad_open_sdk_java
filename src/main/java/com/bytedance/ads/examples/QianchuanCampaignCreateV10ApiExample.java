/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanCampaignCreateV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanCampaignCreateV10Request;
import com.bytedance.ads.model.QianchuanCampaignCreateV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/campaign/create/ POST
public class QianchuanCampaignCreateV10ApiExample {

    private static final QianchuanCampaignCreateV10Api api = new QianchuanCampaignCreateV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanCampaignCreateV10Request qianchuanCampaignCreateV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanCampaignCreateV10Response response = api.openApiV10QianchuanCampaignCreatePost(qianchuanCampaignCreateV10Request);
        System.out.println(response);
    }

}