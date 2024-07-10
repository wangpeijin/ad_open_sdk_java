/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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



import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10Filtering;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10OrderType;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10PageSize;
import com.bytedance.ads.model.QianchuanAwemeReportOrderGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanAwemeReportOrderGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanAwemeReportOrderGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanAwemeReportOrderGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanAwemeReportOrderGetGet
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过180天 (required)
     * @param filtering  (required)
     * @param fields 需要查询的消耗指标。不传递默认查询stat_cost (optional)
     * @param orderField 排序字段，允许值参考数据指标，默认不传为stat_cost (optional, default to stat_cost)
     * @param orderType 排序方式，允许值： ASC 升序（默认）、DESC 降序 (optional)
     * @param page 页码，默认值：1 (optional, default to 1)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100, 200，默认值：10 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAwemeReportOrderGetGetCall(Long advertiserId, String startDate, String endDate, QianchuanAwemeReportOrderGetV10Filtering filtering, List<String> fields, String orderField, QianchuanAwemeReportOrderGetV10OrderType orderType, Long page, QianchuanAwemeReportOrderGetV10PageSize pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/aweme/report/order/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
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
    private okhttp3.Call openApiV10QianchuanAwemeReportOrderGetGetValidateBeforeCall(Long advertiserId, String startDate, String endDate, QianchuanAwemeReportOrderGetV10Filtering filtering, List<String> fields, String orderField, QianchuanAwemeReportOrderGetV10OrderType orderType, Long page, QianchuanAwemeReportOrderGetV10PageSize pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanAwemeReportOrderGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV10QianchuanAwemeReportOrderGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV10QianchuanAwemeReportOrderGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanAwemeReportOrderGetGet(Async)");
        }

        return openApiV10QianchuanAwemeReportOrderGetGetCall(advertiserId, startDate, endDate, filtering, fields, orderField, orderType, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过180天 (required)
     * @param filtering  (required)
     * @param fields 需要查询的消耗指标。不传递默认查询stat_cost (optional)
     * @param orderField 排序字段，允许值参考数据指标，默认不传为stat_cost (optional, default to stat_cost)
     * @param orderType 排序方式，允许值： ASC 升序（默认）、DESC 降序 (optional)
     * @param page 页码，默认值：1 (optional, default to 1)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100, 200，默认值：10 (optional)
     * @return QianchuanAwemeReportOrderGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanAwemeReportOrderGetV10Response openApiV10QianchuanAwemeReportOrderGetGet(Long advertiserId, String startDate, String endDate, QianchuanAwemeReportOrderGetV10Filtering filtering, List<String> fields, String orderField, QianchuanAwemeReportOrderGetV10OrderType orderType, Long page, QianchuanAwemeReportOrderGetV10PageSize pageSize) throws ApiException {
        ApiResponse<QianchuanAwemeReportOrderGetV10Response> localVarResp = openApiV10QianchuanAwemeReportOrderGetGetWithHttpInfo(advertiserId, startDate, endDate, filtering, fields, orderField, orderType, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过180天 (required)
     * @param filtering  (required)
     * @param fields 需要查询的消耗指标。不传递默认查询stat_cost (optional)
     * @param orderField 排序字段，允许值参考数据指标，默认不传为stat_cost (optional, default to stat_cost)
     * @param orderType 排序方式，允许值： ASC 升序（默认）、DESC 降序 (optional)
     * @param page 页码，默认值：1 (optional, default to 1)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100, 200，默认值：10 (optional)
     * @return ApiResponse&lt;QianchuanAwemeReportOrderGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanAwemeReportOrderGetV10Response> openApiV10QianchuanAwemeReportOrderGetGetWithHttpInfo(Long advertiserId, String startDate, String endDate, QianchuanAwemeReportOrderGetV10Filtering filtering, List<String> fields, String orderField, QianchuanAwemeReportOrderGetV10OrderType orderType, Long page, QianchuanAwemeReportOrderGetV10PageSize pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanAwemeReportOrderGetGetValidateBeforeCall(advertiserId, startDate, endDate, filtering, fields, orderField, orderType, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanAwemeReportOrderGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param startDate 开始时间，格式 2021-04-05 (required)
     * @param endDate 结束时间，格式 2021-04-05，时间跨度不能超过180天 (required)
     * @param filtering  (required)
     * @param fields 需要查询的消耗指标。不传递默认查询stat_cost (optional)
     * @param orderField 排序字段，允许值参考数据指标，默认不传为stat_cost (optional, default to stat_cost)
     * @param orderType 排序方式，允许值： ASC 升序（默认）、DESC 降序 (optional)
     * @param page 页码，默认值：1 (optional, default to 1)
     * @param pageSize 页面大小，允许值：10, 20, 50, 100, 200，默认值：10 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanAwemeReportOrderGetGetAsync(Long advertiserId, String startDate, String endDate, QianchuanAwemeReportOrderGetV10Filtering filtering, List<String> fields, String orderField, QianchuanAwemeReportOrderGetV10OrderType orderType, Long page, QianchuanAwemeReportOrderGetV10PageSize pageSize, final ApiCallback<QianchuanAwemeReportOrderGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanAwemeReportOrderGetGetValidateBeforeCall(advertiserId, startDate, endDate, filtering, fields, orderField, orderType, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanAwemeReportOrderGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
