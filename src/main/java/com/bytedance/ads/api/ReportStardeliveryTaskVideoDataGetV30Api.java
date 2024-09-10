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


package com.bytedance.ads.api;

import com.bytedance.ads.ApiCallback;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.ApiException;
import com.bytedance.ads.ApiResponse;
import com.bytedance.ads.Configuration;
import com.bytedance.ads.Pair;

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30Filtering;
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30OrderType;
import com.bytedance.ads.model.ReportStardeliveryTaskVideoDataGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportStardeliveryTaskVideoDataGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportStardeliveryTaskVideoDataGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportStardeliveryTaskVideoDataGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportStardeliveryTaskVideoDataGetGet
     * @param advertiserId  (required)
     * @param starTaskId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期 (required)
     * @param filtering 过滤器 (optional)
     * @param orderField 排序字段 (optional, default to stat_cost)
     * @param orderType  (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportStardeliveryTaskVideoDataGetGetCall(Long advertiserId, Long starTaskId, String startDate, String endDate, ReportStardeliveryTaskVideoDataGetV30Filtering filtering, String orderField, ReportStardeliveryTaskVideoDataGetV30OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/stardelivery/task_video_data/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (starTaskId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_task_id", starTaskId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
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
    private okhttp3.Call openApiV30ReportStardeliveryTaskVideoDataGetGetValidateBeforeCall(Long advertiserId, Long starTaskId, String startDate, String endDate, ReportStardeliveryTaskVideoDataGetV30Filtering filtering, String orderField, ReportStardeliveryTaskVideoDataGetV30OrderType orderType, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportStardeliveryTaskVideoDataGetGet(Async)");
        }

        // verify the required parameter 'starTaskId' is set
        if (starTaskId == null) {
            throw new ApiException("Missing the required parameter 'starTaskId' when calling openApiV30ReportStardeliveryTaskVideoDataGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30ReportStardeliveryTaskVideoDataGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30ReportStardeliveryTaskVideoDataGetGet(Async)");
        }

        return openApiV30ReportStardeliveryTaskVideoDataGetGetCall(advertiserId, starTaskId, startDate, endDate, filtering, orderField, orderType, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param starTaskId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期 (required)
     * @param filtering 过滤器 (optional)
     * @param orderField 排序字段 (optional, default to stat_cost)
     * @param orderType  (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @return ReportStardeliveryTaskVideoDataGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportStardeliveryTaskVideoDataGetV30Response openApiV30ReportStardeliveryTaskVideoDataGetGet(Long advertiserId, Long starTaskId, String startDate, String endDate, ReportStardeliveryTaskVideoDataGetV30Filtering filtering, String orderField, ReportStardeliveryTaskVideoDataGetV30OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<ReportStardeliveryTaskVideoDataGetV30Response> localVarResp = openApiV30ReportStardeliveryTaskVideoDataGetGetWithHttpInfo(advertiserId, starTaskId, startDate, endDate, filtering, orderField, orderType, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param starTaskId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期 (required)
     * @param filtering 过滤器 (optional)
     * @param orderField 排序字段 (optional, default to stat_cost)
     * @param orderType  (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @return ApiResponse&lt;ReportStardeliveryTaskVideoDataGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportStardeliveryTaskVideoDataGetV30Response> openApiV30ReportStardeliveryTaskVideoDataGetGetWithHttpInfo(Long advertiserId, Long starTaskId, String startDate, String endDate, ReportStardeliveryTaskVideoDataGetV30Filtering filtering, String orderField, ReportStardeliveryTaskVideoDataGetV30OrderType orderType, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportStardeliveryTaskVideoDataGetGetValidateBeforeCall(advertiserId, starTaskId, startDate, endDate, filtering, orderField, orderType, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ReportStardeliveryTaskVideoDataGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param starTaskId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期 (required)
     * @param filtering 过滤器 (optional)
     * @param orderField 排序字段 (optional, default to stat_cost)
     * @param orderType  (optional)
     * @param page 页码 (optional, default to 1)
     * @param pageSize 页面大小 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportStardeliveryTaskVideoDataGetGetAsync(Long advertiserId, Long starTaskId, String startDate, String endDate, ReportStardeliveryTaskVideoDataGetV30Filtering filtering, String orderField, ReportStardeliveryTaskVideoDataGetV30OrderType orderType, Integer page, Integer pageSize, final ApiCallback<ReportStardeliveryTaskVideoDataGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportStardeliveryTaskVideoDataGetGetValidateBeforeCall(advertiserId, starTaskId, startDate, endDate, filtering, orderField, orderType, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ReportStardeliveryTaskVideoDataGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
