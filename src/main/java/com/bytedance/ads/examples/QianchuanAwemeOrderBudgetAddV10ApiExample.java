/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanAwemeOrderBudgetAddV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAwemeOrderBudgetAddV10Request;
import com.bytedance.ads.model.QianchuanAwemeOrderBudgetAddV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/aweme/order/budget/add/ POST
public class QianchuanAwemeOrderBudgetAddV10ApiExample {

    private static final QianchuanAwemeOrderBudgetAddV10Api api = new QianchuanAwemeOrderBudgetAddV10Api();

    public static void main(String[] args) throws ApiException {
        QianchuanAwemeOrderBudgetAddV10Request qianchuanAwemeOrderBudgetAddV10Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAwemeOrderBudgetAddV10Response response = api.openApiV10QianchuanAwemeOrderBudgetAddPost(qianchuanAwemeOrderBudgetAddV10Request);
        System.out.println(response);
    }

}