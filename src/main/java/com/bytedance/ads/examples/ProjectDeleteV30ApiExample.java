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
import com.bytedance.ads.api.ProjectDeleteV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectDeleteV30Request;
import com.bytedance.ads.model.ProjectDeleteV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/delete/ POST
public class ProjectDeleteV30ApiExample {

    private static final ProjectDeleteV30Api api = new ProjectDeleteV30Api();

    public static void main(String[] args) throws ApiException {
        ProjectDeleteV30Request projectDeleteV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectDeleteV30Response response = api.openApiV30ProjectDeletePost(projectDeleteV30Request);
        System.out.println(response);
    }

}