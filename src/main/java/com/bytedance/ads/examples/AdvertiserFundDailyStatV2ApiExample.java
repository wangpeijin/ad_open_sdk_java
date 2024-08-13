/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdvertiserFundDailyStatV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserFundDailyStatV2AccountType;
import com.bytedance.ads.model.AdvertiserFundDailyStatV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/advertiser/fund/daily_stat/ GET
public class AdvertiserFundDailyStatV2ApiExample {

    private static final AdvertiserFundDailyStatV2Api api = new AdvertiserFundDailyStatV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String startDate = null;
        String endDate = null;
        Long page = null;
        Long pageSize = null;
        AdvertiserFundDailyStatV2AccountType accountType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserFundDailyStatV2Response response = api.openApi2AdvertiserFundDailyStatGet(advertiserId, startDate, endDate, page, pageSize, accountType);
        System.out.println(response);
    }

}