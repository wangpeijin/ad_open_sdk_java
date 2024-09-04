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
import com.bytedance.ads.api.FileVideoUploadTaskListV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.FileVideoUploadTaskListV2AccountType;
import com.bytedance.ads.model.FileVideoUploadTaskListV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/video/upload_task/list/ GET
public class FileVideoUploadTaskListV2ApiExample {

    private static final FileVideoUploadTaskListV2Api api = new FileVideoUploadTaskListV2Api();

    public static void main(String[] args) throws ApiException {
        Long accountId = null;
        FileVideoUploadTaskListV2AccountType accountType = null;
        List<Long> taskIds = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileVideoUploadTaskListV2Response response = api.openApi2FileVideoUploadTaskListGet(accountId, accountType, taskIds);
        System.out.println(response);
    }

}