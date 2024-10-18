/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.LocalFileUploadTaskCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.LocalFileUploadTaskCreateV30Request;
import com.bytedance.ads.model.LocalFileUploadTaskCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/local/file/upload_task/create/ POST
public class LocalFileUploadTaskCreateV30ApiExample {

    private static final LocalFileUploadTaskCreateV30Api api = new LocalFileUploadTaskCreateV30Api();

    public static void main(String[] args) throws ApiException {
        LocalFileUploadTaskCreateV30Request localFileUploadTaskCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        LocalFileUploadTaskCreateV30Response response = api.openApiV30LocalFileUploadTaskCreatePost(localFileUploadTaskCreateV30Request);
        System.out.println(response);
    }

}