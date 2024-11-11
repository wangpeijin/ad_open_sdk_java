/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.DownloadStatementV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.DownloadStatementV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/download/statement/ GET
public class DownloadStatementV2ApiExample {

    private static final DownloadStatementV2Api api = new DownloadStatementV2Api();

    public static void main(String[] args) throws ApiException {
        Long agentId = null;
        Long attachId = null;
        Long statementId = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        DownloadStatementV2Response response = api.openApi2DownloadStatementGet(agentId, attachId, statementId);
        System.out.println(response);
    }

}