/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsDownloadPackageParseV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ToolsDownloadPackageParseV2Request;
import com.bytedance.ads.model.ToolsDownloadPackageParseV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/download/package/parse/ POST
public class ToolsDownloadPackageParseV2ApiExample {

    private static final ToolsDownloadPackageParseV2Api api = new ToolsDownloadPackageParseV2Api();

    public static void main(String[] args) throws ApiException {
        ToolsDownloadPackageParseV2Request toolsDownloadPackageParseV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsDownloadPackageParseV2Response response = api.openApi2ToolsDownloadPackageParsePost(toolsDownloadPackageParseV2Request);
        System.out.println(response);
    }

}