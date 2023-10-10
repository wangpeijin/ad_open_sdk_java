/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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

import com.bytedance.ads.model.CommonResponse;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommonReqApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CommonReqApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CommonReqApi(ApiClient apiClient) {
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
     * Build call for commonReqGetCall
     * @param method 请求方法，GET、POST (required)
     * @param path 请求 path (required)
     * @param contentType 请求 Content-Type，method 为 POST 时必传，根据需求传 "application/json"、"application/x-www-form-urlencoded"、"multipart/form-data"
     * @param queryParams GET 请求的 query 参数
     * @param formParams  POST FORM 的 form 内容
     * @param requestBody POST JSON 的请求体
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call commonReqCall(String method, String path, String contentType, List<Pair> queryParams, Map<String, Object> formParams, Object requestBody, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = requestBody;

        // create path and map variables
        String localVarPath = path;

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (queryParams != null) {
            localVarQueryParams.addAll(queryParams);
        }

        if (formParams != null) {
            localVarFormParams.putAll(formParams);
        }


        final String[] localVarAccepts = {
                "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String localVarContentType = contentType;
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, method, localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call commonReqValidateBeforeCall(String method, String path, String contentType, List<Pair> queryParams, Map<String, Object> formParams, Object requestBody, final ApiCallback _callback) throws ApiException {

        return commonReqCall(method, path, contentType, queryParams, formParams, requestBody, _callback);

    }

    /**
     *
     *
     * @param method 请求方法，GET、POST (required)
     * @param path 请求 path (required)
     * @param contentType 请求 Content-Type，method 为 POST 时必传，根据需求传 "application/json"、"application/x-www-form-urlencoded"、"multipart/form-data"
     * @param queryParams GET 请求的 query 参数
     * @param formParams  POST FORM 的 form 内容
     * @param requestBody POST JSON 的请求体
     * @return CommonResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
    </table>
     */
    public CommonResponse commonReq(String method, String path, String contentType, List<Pair> queryParams, Map<String, Object> formParams, Object requestBody) throws ApiException {
        ApiResponse<CommonResponse> localVarResp = commonReqWithHttpInfo(method, path, contentType, queryParams, formParams, requestBody);
        return localVarResp.getData();
    }

    /**
     *
     *
     * @param method 请求方法，GET、POST (required)
     * @param path 请求 path (required)
     * @param contentType 请求 Content-Type，method 为 POST 时必传
     * @param queryParams GET 请求的 query 参数
     * @param formParams  POST FORM 的 form 内容
     * @param requestBody POST JSON 的请求体
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
    </table>
     */
    public ApiResponse<CommonResponse> commonReqWithHttpInfo(String method, String path, String contentType, List<Pair> queryParams, Map<String, Object> formParams, Object requestBody) throws ApiException {
        okhttp3.Call localVarCall = commonReqValidateBeforeCall(method, path, contentType, queryParams, formParams, requestBody, null);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     *
     * @param method 请求方法，GET、POST (required)
     * @param path 请求 path (required)
     * @param contentType 请求 Content-Type，method 为 POST 时必传，根据需求传 "application/json"/"application/x-www-form-urlencoded"/"multipart/form-data"
     * @param queryParams GET 请求的 query 参数
     * @param formParams  POST FORM 的 form 内容
     * @param requestBody POST JSON 的请求体
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
    <table summary="Response Details" border="1">
    <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
    <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
    </table>
     */
    public okhttp3.Call commonReqAsync(String method, String path, String contentType, List<Pair> queryParams, Map<String, Object> formParams, Object requestBody, final ApiCallback<CommonResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = commonReqValidateBeforeCall(method, path, contentType, queryParams, formParams, requestBody, _callback);
        Type localVarReturnType = new TypeToken<CommonResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}