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
import com.bytedance.ads.api.QianchuanAdGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanAdGetV10Filtering;
import com.bytedance.ads.model.QianchuanAdGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/ad/get/ GET
public class QianchuanAdGetV10ApiExample {

    private static final QianchuanAdGetV10Api api = new QianchuanAdGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanAdGetV10Filtering filtering = null;
        Long requestAwemeInfo = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanAdGetV10Response response = api.openApiV10QianchuanAdGetGet(advertiserId, filtering, requestAwemeInfo, page, pageSize);
        System.out.println(response);
    }

}