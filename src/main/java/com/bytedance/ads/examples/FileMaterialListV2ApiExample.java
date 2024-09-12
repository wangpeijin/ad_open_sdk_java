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
import com.bytedance.ads.api.FileMaterialListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileMaterialListV2MaterialSource;
import com.bytedance.ads.model.FileMaterialListV2PropertiesFilter;
import com.bytedance.ads.model.FileMaterialListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/material/list/ GET
public class FileMaterialListV2ApiExample {

    private static final FileMaterialListV2Api api = new FileMaterialListV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        FileMaterialListV2MaterialSource materialSource = null;
        List<FileMaterialListV2PropertiesFilter> propertiesFilter = null;
        String startTime = null;
        String endTime = null;
        Integer page = null;
        Integer pageSize = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileMaterialListV2Response response = api.openApi2FileMaterialListGet(advertiserId, materialSource, propertiesFilter, startTime, endTime, page, pageSize);
        System.out.println(response);
    }

}