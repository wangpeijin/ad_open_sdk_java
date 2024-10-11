/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.QianchuanShopAdvertiserListV10Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.QianchuanShopAdvertiserListV10Permission;
import com.bytedance.ads.model.QianchuanShopAdvertiserListV10Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v1.0/qianchuan/shop/advertiser/list/ GET
public class QianchuanShopAdvertiserListV10ApiExample {

    private static final QianchuanShopAdvertiserListV10Api api = new QianchuanShopAdvertiserListV10Api();

    public static void main(String[] args) throws ApiException {
        Long shopId = null;
        List<QianchuanShopAdvertiserListV10Permission> permission = null;
        Long page = null;
        Long pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        QianchuanShopAdvertiserListV10Response response = api.openApiV10QianchuanShopAdvertiserListGet(shopId, permission, page, pageSize);
        System.out.println(response);
    }

}