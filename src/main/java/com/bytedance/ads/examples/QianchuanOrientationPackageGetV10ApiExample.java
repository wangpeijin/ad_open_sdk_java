/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanOrientationPackageGetV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10Filtering;
import com.bytedance.ads.model.QianchuanOrientationPackageGetV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/orientation_package/get/ GET
public class QianchuanOrientationPackageGetV10ApiExample {

    private static final QianchuanOrientationPackageGetV10Api api = new QianchuanOrientationPackageGetV10Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        QianchuanOrientationPackageGetV10Filtering filtering = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanOrientationPackageGetV10Response response = api.openApiV10QianchuanOrientationPackageGetGet(advertiserId, filtering, page, pageSize);
        System.out.println(response);
    }

}