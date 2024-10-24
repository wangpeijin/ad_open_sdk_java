/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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



import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10DataTopic;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10FiltersInner;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10OrderByInner;
import com.bytedance.ads.model.QianchuanReportTodayLiveRoomDataGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportTodayLiveRoomDataGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportTodayLiveRoomDataGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportTodayLiveRoomDataGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportTodayLiveRoomDataGetGet
     * @param advertiserId  (required)
     * @param dataTopic  (required)
     * @param dimensions  (required)
     * @param metrics  (required)
     * @param filters  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param orderBy  (required)
     * @param page 第几页 (optional, default to 1)
     * @param pageSize 页大小 (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportTodayLiveRoomDataGetGetCall(Long advertiserId, QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic, List<String> dimensions, List<String> metrics, List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters, String startTime, String endTime, List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/today_live/room/data/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (dataTopic != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("data_topic", dataTopic));
        }

        if (dimensions != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "dimensions", dimensions));
        }

        if (metrics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "metrics", metrics));
        }

        if (filters != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "filters", filters));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (orderBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "order_by", orderBy));
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
    private okhttp3.Call openApiV10QianchuanReportTodayLiveRoomDataGetGetValidateBeforeCall(Long advertiserId, QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic, List<String> dimensions, List<String> metrics, List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters, String startTime, String endTime, List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'dataTopic' is set
        if (dataTopic == null) {
            throw new ApiException("Missing the required parameter 'dataTopic' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'dimensions' is set
        if (dimensions == null) {
            throw new ApiException("Missing the required parameter 'dimensions' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'metrics' is set
        if (metrics == null) {
            throw new ApiException("Missing the required parameter 'metrics' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'filters' is set
        if (filters == null) {
            throw new ApiException("Missing the required parameter 'filters' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        // verify the required parameter 'orderBy' is set
        if (orderBy == null) {
            throw new ApiException("Missing the required parameter 'orderBy' when calling openApiV10QianchuanReportTodayLiveRoomDataGetGet(Async)");
        }

        return openApiV10QianchuanReportTodayLiveRoomDataGetGetCall(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataTopic  (required)
     * @param dimensions  (required)
     * @param metrics  (required)
     * @param filters  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param orderBy  (required)
     * @param page 第几页 (optional, default to 1)
     * @param pageSize 页大小 (optional, default to 100)
     * @return QianchuanReportTodayLiveRoomDataGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportTodayLiveRoomDataGetV10Response openApiV10QianchuanReportTodayLiveRoomDataGetGet(Long advertiserId, QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic, List<String> dimensions, List<String> metrics, List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters, String startTime, String endTime, List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy, Long page, Long pageSize) throws ApiException {
        ApiResponse<QianchuanReportTodayLiveRoomDataGetV10Response> localVarResp = openApiV10QianchuanReportTodayLiveRoomDataGetGetWithHttpInfo(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param dataTopic  (required)
     * @param dimensions  (required)
     * @param metrics  (required)
     * @param filters  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param orderBy  (required)
     * @param page 第几页 (optional, default to 1)
     * @param pageSize 页大小 (optional, default to 100)
     * @return ApiResponse&lt;QianchuanReportTodayLiveRoomDataGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportTodayLiveRoomDataGetV10Response> openApiV10QianchuanReportTodayLiveRoomDataGetGetWithHttpInfo(Long advertiserId, QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic, List<String> dimensions, List<String> metrics, List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters, String startTime, String endTime, List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportTodayLiveRoomDataGetGetValidateBeforeCall(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanReportTodayLiveRoomDataGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param dataTopic  (required)
     * @param dimensions  (required)
     * @param metrics  (required)
     * @param filters  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param orderBy  (required)
     * @param page 第几页 (optional, default to 1)
     * @param pageSize 页大小 (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportTodayLiveRoomDataGetGetAsync(Long advertiserId, QianchuanReportTodayLiveRoomDataGetV10DataTopic dataTopic, List<String> dimensions, List<String> metrics, List<QianchuanReportTodayLiveRoomDataGetV10FiltersInner> filters, String startTime, String endTime, List<QianchuanReportTodayLiveRoomDataGetV10OrderByInner> orderBy, Long page, Long pageSize, final ApiCallback<QianchuanReportTodayLiveRoomDataGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportTodayLiveRoomDataGetGetValidateBeforeCall(advertiserId, dataTopic, dimensions, metrics, filters, startTime, endTime, orderBy, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportTodayLiveRoomDataGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
