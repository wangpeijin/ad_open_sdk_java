/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeEstimateProfitV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10Audience;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10DeliverySetting;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10MarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/estimate_profit/ GET
public class QianchuanAwemeEstimateProfitV10ApiExample {

    private static final QianchuanAwemeEstimateProfitV10Api api = new QianchuanAwemeEstimateProfitV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAwemeEstimateProfitV10MarketingGoal marketingGoal = null;
        QianchuanAwemeEstimateProfitV10DeliverySetting deliverySetting = null;
        QianchuanAwemeEstimateProfitV10Audience audience = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeEstimateProfitV10Response response = api.openApiV10QianchuanAwemeEstimateProfitGet(advertiserId, marketingGoal, deliverySetting, audience);
        System.out.println(response);
    }

}