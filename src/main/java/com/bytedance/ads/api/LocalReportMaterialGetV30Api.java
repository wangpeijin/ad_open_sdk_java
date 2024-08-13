/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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



import com.bytedance.ads.model.LocalReportMaterialGetV30Filtering;
import com.bytedance.ads.model.LocalReportMaterialGetV30OrderType;
import com.bytedance.ads.model.LocalReportMaterialGetV30Response;
import com.bytedance.ads.model.LocalReportMaterialGetV30TimeGranularity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocalReportMaterialGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public LocalReportMaterialGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public LocalReportMaterialGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30LocalReportMaterialGetGet
     * @param localAccountId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期，格式：2021-04-05。 若不传time_granularity，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_DAILY时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_TOTAL时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_HOURLY时，则时间跨度不能超过7天 (required)
     * @param metrics 指标集 (required)
     * @param timeGranularity 时间粒度 (optional)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段，允许值参考数据指标 (optional)
     * @param filtering 过滤器 (optional)
     * @param page 第几页 (optional)
     * @param pageSize 页大小 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalReportMaterialGetGetCall(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalReportMaterialGetV30TimeGranularity timeGranularity, LocalReportMaterialGetV30OrderType orderType, String orderField, LocalReportMaterialGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/local/report/material/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (localAccountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("local_account_id", localAccountId));
        }

        if (timeGranularity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_granularity", timeGranularity));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "metrics", metrics));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApiV30LocalReportMaterialGetGetValidateBeforeCall(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalReportMaterialGetV30TimeGranularity timeGranularity, LocalReportMaterialGetV30OrderType orderType, String orderField, LocalReportMaterialGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'localAccountId' is set
        if (localAccountId == null) {
            throw new ApiException("Missing the required parameter 'localAccountId' when calling openApiV30LocalReportMaterialGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30LocalReportMaterialGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30LocalReportMaterialGetGet(Async)");
        }

        // verify the required parameter 'metrics' is set
        if (metrics == null) {
            throw new ApiException("Missing the required parameter 'metrics' when calling openApiV30LocalReportMaterialGetGet(Async)");
        }

        return openApiV30LocalReportMaterialGetGetCall(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期，格式：2021-04-05。 若不传time_granularity，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_DAILY时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_TOTAL时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_HOURLY时，则时间跨度不能超过7天 (required)
     * @param metrics 指标集 (required)
     * @param timeGranularity 时间粒度 (optional)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段，允许值参考数据指标 (optional)
     * @param filtering 过滤器 (optional)
     * @param page 第几页 (optional)
     * @param pageSize 页大小 (optional)
     * @return LocalReportMaterialGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public LocalReportMaterialGetV30Response openApiV30LocalReportMaterialGetGet(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalReportMaterialGetV30TimeGranularity timeGranularity, LocalReportMaterialGetV30OrderType orderType, String orderField, LocalReportMaterialGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        ApiResponse<LocalReportMaterialGetV30Response> localVarResp = openApiV30LocalReportMaterialGetGetWithHttpInfo(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期，格式：2021-04-05。 若不传time_granularity，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_DAILY时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_TOTAL时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_HOURLY时，则时间跨度不能超过7天 (required)
     * @param metrics 指标集 (required)
     * @param timeGranularity 时间粒度 (optional)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段，允许值参考数据指标 (optional)
     * @param filtering 过滤器 (optional)
     * @param page 第几页 (optional)
     * @param pageSize 页大小 (optional)
     * @return ApiResponse&lt;LocalReportMaterialGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<LocalReportMaterialGetV30Response> openApiV30LocalReportMaterialGetGetWithHttpInfo(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalReportMaterialGetV30TimeGranularity timeGranularity, LocalReportMaterialGetV30OrderType orderType, String orderField, LocalReportMaterialGetV30Filtering filtering, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30LocalReportMaterialGetGetValidateBeforeCall(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize, null);
        Type localVarReturnType = new TypeToken<LocalReportMaterialGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param localAccountId  (required)
     * @param startDate 查询起始日期 (required)
     * @param endDate 查询结束日期，格式：2021-04-05。 若不传time_granularity，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_DAILY时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_TOTAL时，则时间跨度不能超过365天； 若传time_granularity为TIME_GRANULARITY_HOURLY时，则时间跨度不能超过7天 (required)
     * @param metrics 指标集 (required)
     * @param timeGranularity 时间粒度 (optional)
     * @param orderType 排序方式 (optional)
     * @param orderField 排序字段，允许值参考数据指标 (optional)
     * @param filtering 过滤器 (optional)
     * @param page 第几页 (optional)
     * @param pageSize 页大小 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30LocalReportMaterialGetGetAsync(Long localAccountId, String startDate, String endDate, List<String> metrics, LocalReportMaterialGetV30TimeGranularity timeGranularity, LocalReportMaterialGetV30OrderType orderType, String orderField, LocalReportMaterialGetV30Filtering filtering, Long page, Long pageSize, final ApiCallback<LocalReportMaterialGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30LocalReportMaterialGetGetValidateBeforeCall(localAccountId, startDate, endDate, metrics, timeGranularity, orderType, orderField, filtering, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<LocalReportMaterialGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
