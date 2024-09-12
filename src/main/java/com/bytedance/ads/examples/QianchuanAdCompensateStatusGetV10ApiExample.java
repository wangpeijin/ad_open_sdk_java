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
import com.bytedance.ads.api.QianchuanAdCompensateStatusGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdCompensateStatusGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/compensate_status/get/ GET
public class QianchuanAdCompensateStatusGetV10ApiExample {

    private static final QianchuanAdCompensateStatusGetV10Api api = new QianchuanAdCompensateStatusGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        List<Long> adIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdCompensateStatusGetV10Response response = api.openApiV10QianchuanAdCompensateStatusGetGet(advertiserId, adIds);
        System.out.println(response);
    }

}