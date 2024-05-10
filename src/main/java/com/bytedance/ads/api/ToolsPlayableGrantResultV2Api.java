/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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



import com.bytedance.ads.model.ToolsPlayableGrantResultV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsPlayableGrantResultV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsPlayableGrantResultV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsPlayableGrantResultV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsPlayableGrantResultGet
     * @param advertiserId  (required)
     * @param taskIds 推送任务id，可根据推送的task_id进行检索，允许传入数量上限200个 (optional)
     * @param startTime 根据任务创建时间进行过滤，过滤的起始时间，格式YYYY-mm-dd (optional)
     * @param endTime 根据任务的创建时间进行过滤，过滤的截止时间，格式YYYY-mm-dd (optional)
     * @param page 页码，默认1 (optional)
     * @param pageSize 页面大小，默认20，最大200 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPlayableGrantResultGetCall(Long advertiserId, List<Long> taskIds, String startTime, String endTime, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/playable/grant/result/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (taskIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "task_ids", taskIds));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2ToolsPlayableGrantResultGetValidateBeforeCall(Long advertiserId, List<Long> taskIds, String startTime, String endTime, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsPlayableGrantResultGet(Async)");
        }

        return openApi2ToolsPlayableGrantResultGetCall(advertiserId, taskIds, startTime, endTime, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param taskIds 推送任务id，可根据推送的task_id进行检索，允许传入数量上限200个 (optional)
     * @param startTime 根据任务创建时间进行过滤，过滤的起始时间，格式YYYY-mm-dd (optional)
     * @param endTime 根据任务的创建时间进行过滤，过滤的截止时间，格式YYYY-mm-dd (optional)
     * @param page 页码，默认1 (optional)
     * @param pageSize 页面大小，默认20，最大200 (optional)
     * @return ToolsPlayableGrantResultV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsPlayableGrantResultV2Response openApi2ToolsPlayableGrantResultGet(Long advertiserId, List<Long> taskIds, String startTime, String endTime, Long page, Long pageSize) throws ApiException {
        ApiResponse<ToolsPlayableGrantResultV2Response> localVarResp = openApi2ToolsPlayableGrantResultGetWithHttpInfo(advertiserId, taskIds, startTime, endTime, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param taskIds 推送任务id，可根据推送的task_id进行检索，允许传入数量上限200个 (optional)
     * @param startTime 根据任务创建时间进行过滤，过滤的起始时间，格式YYYY-mm-dd (optional)
     * @param endTime 根据任务的创建时间进行过滤，过滤的截止时间，格式YYYY-mm-dd (optional)
     * @param page 页码，默认1 (optional)
     * @param pageSize 页面大小，默认20，最大200 (optional)
     * @return ApiResponse&lt;ToolsPlayableGrantResultV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsPlayableGrantResultV2Response> openApi2ToolsPlayableGrantResultGetWithHttpInfo(Long advertiserId, List<Long> taskIds, String startTime, String endTime, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsPlayableGrantResultGetValidateBeforeCall(advertiserId, taskIds, startTime, endTime, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsPlayableGrantResultV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param taskIds 推送任务id，可根据推送的task_id进行检索，允许传入数量上限200个 (optional)
     * @param startTime 根据任务创建时间进行过滤，过滤的起始时间，格式YYYY-mm-dd (optional)
     * @param endTime 根据任务的创建时间进行过滤，过滤的截止时间，格式YYYY-mm-dd (optional)
     * @param page 页码，默认1 (optional)
     * @param pageSize 页面大小，默认20，最大200 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPlayableGrantResultGetAsync(Long advertiserId, List<Long> taskIds, String startTime, String endTime, Long page, Long pageSize, final ApiCallback<ToolsPlayableGrantResultV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsPlayableGrantResultGetValidateBeforeCall(advertiserId, taskIds, startTime, endTime, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsPlayableGrantResultV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
