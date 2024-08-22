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
import com.bytedance.ads.api.FileMaterialAttributesListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileMaterialAttributesListV2AccountType;
import com.bytedance.ads.model.FileMaterialAttributesListV2Filtering;
import com.bytedance.ads.model.FileMaterialAttributesListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/material_attributes/list/ GET
public class FileMaterialAttributesListV2ApiExample {

    private static final FileMaterialAttributesListV2Api api = new FileMaterialAttributesListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        FileMaterialAttributesListV2AccountType accountType = null;
        Integer pageSize = null;
        Integer page = null;
        FileMaterialAttributesListV2Filtering filtering = null;
        Boolean returnLowqualitySuggestions = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileMaterialAttributesListV2Response response = api.openApi2FileMaterialAttributesListGet(accountId, accountType, pageSize, page, filtering, returnLowqualitySuggestions);
        System.out.println(response);
    }

}