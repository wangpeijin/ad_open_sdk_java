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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.AicMixcutTaskResultGetV30AccountType;
import com.bytedance.ads.model.AicMixcutTaskResultGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AicMixcutTaskResultGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AicMixcutTaskResultGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AicMixcutTaskResultGetV30Api(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for openApiV30AicMixcutTaskResultGetGet
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举 (required)
     * @param taskId 生成接口返回任务ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicMixcutTaskResultGetGetCall(Long accountId, AicMixcutTaskResultGetV30AccountType accountType, String taskId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/open_api/v3.0/aic/mixcut_task/result/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (taskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("task_id", taskId));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV30AicMixcutTaskResultGetGetValidateBeforeCall(Long accountId, AicMixcutTaskResultGetV30AccountType accountType, String taskId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30AicMixcutTaskResultGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30AicMixcutTaskResultGetGet(Async)");
        }

        // verify the required parameter 'taskId' is set
        if (taskId == null) {
            throw new ApiException("Missing the required parameter 'taskId' when calling openApiV30AicMixcutTaskResultGetGet(Async)");
        }

        return openApiV30AicMixcutTaskResultGetGetCall(accountId, accountType, taskId, _callback);

    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举 (required)
     * @param taskId 生成接口返回任务ID (required)
     * @return AicMixcutTaskResultGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AicMixcutTaskResultGetV30Response openApiV30AicMixcutTaskResultGetGet(Long accountId, AicMixcutTaskResultGetV30AccountType accountType, String taskId) throws ApiException {
        ApiResponse<AicMixcutTaskResultGetV30Response> localVarResp = openApiV30AicMixcutTaskResultGetGetWithHttpInfo(accountId, accountType, taskId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举 (required)
     * @param taskId 生成接口返回任务ID (required)
     * @return ApiResponse&lt;AicMixcutTaskResultGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AicMixcutTaskResultGetV30Response> openApiV30AicMixcutTaskResultGetGetWithHttpInfo(Long accountId, AicMixcutTaskResultGetV30AccountType accountType, String taskId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AicMixcutTaskResultGetGetValidateBeforeCall(accountId, accountType, taskId, null);
        Type localVarReturnType = new TypeToken<AicMixcutTaskResultGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId BP账户体系:组织id，Agent账户体系:代理商id (required)
     * @param accountType 账户体系枚举 (required)
     * @param taskId 生成接口返回任务ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AicMixcutTaskResultGetGetAsync(Long accountId, AicMixcutTaskResultGetV30AccountType accountType, String taskId, final ApiCallback<AicMixcutTaskResultGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AicMixcutTaskResultGetGetValidateBeforeCall(accountId, accountType, taskId, _callback);
        Type localVarReturnType = new TypeToken<AicMixcutTaskResultGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
