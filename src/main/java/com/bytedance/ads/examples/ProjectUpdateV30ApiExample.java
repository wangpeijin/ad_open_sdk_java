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
import com.bytedance.ads.api.ProjectUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectUpdateV30Request;
import com.bytedance.ads.model.ProjectUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/update/ POST
public class ProjectUpdateV30ApiExample {

    private static final ProjectUpdateV30Api api = new ProjectUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ProjectUpdateV30Request projectUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectUpdateV30Response response = api.openApiV30ProjectUpdatePost(projectUpdateV30Request);
        System.out.println(response);
    }

}