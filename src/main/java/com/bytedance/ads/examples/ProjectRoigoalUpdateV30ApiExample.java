/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ProjectRoigoalUpdateV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.ProjectRoigoalUpdateV30Request;
import com.bytedance.ads.model.ProjectRoigoalUpdateV30Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/project/roigoal/update/ POST
public class ProjectRoigoalUpdateV30ApiExample {

    private static final ProjectRoigoalUpdateV30Api api = new ProjectRoigoalUpdateV30Api();

    public static void main(String[] args) throws ApiException {
        ProjectRoigoalUpdateV30Request projectRoigoalUpdateV30Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ProjectRoigoalUpdateV30Response response = api.openApiV30ProjectRoigoalUpdatePost(projectRoigoalUpdateV30Request);
        System.out.println(response);
    }

}