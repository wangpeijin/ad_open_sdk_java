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



import com.bytedance.ads.model.ToolsClueClueOverviewQueryV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsClueClueOverviewQueryV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsClueClueOverviewQueryV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsClueClueOverviewQueryV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsClueClueOverviewQueryGet
     * @param advertiserId 广告主ID (required)
     * @param startTime 查询开始时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param endTime 查询结束时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueClueOverviewQueryGetCall(Long advertiserId, Long startTime, Long endTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/clue/clue/overview/query/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
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
    private okhttp3.Call openApi2ToolsClueClueOverviewQueryGetValidateBeforeCall(Long advertiserId, Long startTime, Long endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsClueClueOverviewQueryGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApi2ToolsClueClueOverviewQueryGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApi2ToolsClueClueOverviewQueryGet(Async)");
        }

        return openApi2ToolsClueClueOverviewQueryGetCall(advertiserId, startTime, endTime, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 查询开始时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param endTime 查询结束时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @return ToolsClueClueOverviewQueryV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsClueClueOverviewQueryV2Response openApi2ToolsClueClueOverviewQueryGet(Long advertiserId, Long startTime, Long endTime) throws ApiException {
        ApiResponse<ToolsClueClueOverviewQueryV2Response> localVarResp = openApi2ToolsClueClueOverviewQueryGetWithHttpInfo(advertiserId, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 查询开始时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param endTime 查询结束时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @return ApiResponse&lt;ToolsClueClueOverviewQueryV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsClueClueOverviewQueryV2Response> openApi2ToolsClueClueOverviewQueryGetWithHttpInfo(Long advertiserId, Long startTime, Long endTime) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsClueClueOverviewQueryGetValidateBeforeCall(advertiserId, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<ToolsClueClueOverviewQueryV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param startTime 查询开始时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param endTime 查询结束时间。毫秒级unix时间戳。查询时间跨度不得超过一个月，只能查询近半年的数据。 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsClueClueOverviewQueryGetAsync(Long advertiserId, Long startTime, Long endTime, final ApiCallback<ToolsClueClueOverviewQueryV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsClueClueOverviewQueryGetValidateBeforeCall(advertiserId, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<ToolsClueClueOverviewQueryV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
