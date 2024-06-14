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
import com.bytedance.ads.api.ProjectCreateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectCreateV30Request;
import com.bytedance.ads.model.ProjectCreateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/create/ POST
public class ProjectCreateV30ApiExample {

    private static final ProjectCreateV30Api api = new ProjectCreateV30Api();

    public static void main(String[] args) throws ApiException {
        ProjectCreateV30Request projectCreateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectCreateV30Response response = api.openApiV30ProjectCreatePost(projectCreateV30Request);
        System.out.println(response);
    }

}