/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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



import com.bytedance.ads.model.ReportRtaExpLocalHourlyGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRtaExpLocalHourlyGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportRtaExpLocalHourlyGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportRtaExpLocalHourlyGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportRtaExpLocalHourlyGetGet
     * @param rtaId  (required)
     * @param advertiserId  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param vid  (optional, default to -1)
     * @param cusVid  (optional, default to -1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportRtaExpLocalHourlyGetGetCall(Long rtaId, Long advertiserId, String startDate, String endDate, Long vid, Long cusVid, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/rta_exp_local_hourly/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (rtaId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rta_id", rtaId));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (vid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("vid", vid));
        }

        if (cusVid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cus_vid", cusVid));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
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
    private okhttp3.Call openApiV30ReportRtaExpLocalHourlyGetGetValidateBeforeCall(Long rtaId, Long advertiserId, String startDate, String endDate, Long vid, Long cusVid, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'rtaId' is set
        if (rtaId == null) {
            throw new ApiException("Missing the required parameter 'rtaId' when calling openApiV30ReportRtaExpLocalHourlyGetGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportRtaExpLocalHourlyGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30ReportRtaExpLocalHourlyGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30ReportRtaExpLocalHourlyGetGet(Async)");
        }

        return openApiV30ReportRtaExpLocalHourlyGetGetCall(rtaId, advertiserId, startDate, endDate, vid, cusVid, _callback);

    }

    /**
     * 
     * 
     * @param rtaId  (required)
     * @param advertiserId  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param vid  (optional, default to -1)
     * @param cusVid  (optional, default to -1)
     * @return ReportRtaExpLocalHourlyGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportRtaExpLocalHourlyGetV30Response openApiV30ReportRtaExpLocalHourlyGetGet(Long rtaId, Long advertiserId, String startDate, String endDate, Long vid, Long cusVid) throws ApiException {
        ApiResponse<ReportRtaExpLocalHourlyGetV30Response> localVarResp = openApiV30ReportRtaExpLocalHourlyGetGetWithHttpInfo(rtaId, advertiserId, startDate, endDate, vid, cusVid);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param rtaId  (required)
     * @param advertiserId  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param vid  (optional, default to -1)
     * @param cusVid  (optional, default to -1)
     * @return ApiResponse&lt;ReportRtaExpLocalHourlyGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportRtaExpLocalHourlyGetV30Response> openApiV30ReportRtaExpLocalHourlyGetGetWithHttpInfo(Long rtaId, Long advertiserId, String startDate, String endDate, Long vid, Long cusVid) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportRtaExpLocalHourlyGetGetValidateBeforeCall(rtaId, advertiserId, startDate, endDate, vid, cusVid, null);
        Type localVarReturnType = new TypeToken<ReportRtaExpLocalHourlyGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param rtaId  (required)
     * @param advertiserId  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param vid  (optional, default to -1)
     * @param cusVid  (optional, default to -1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportRtaExpLocalHourlyGetGetAsync(Long rtaId, Long advertiserId, String startDate, String endDate, Long vid, Long cusVid, final ApiCallback<ReportRtaExpLocalHourlyGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportRtaExpLocalHourlyGetGetValidateBeforeCall(rtaId, advertiserId, startDate, endDate, vid, cusVid, _callback);
        Type localVarReturnType = new TypeToken<ReportRtaExpLocalHourlyGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
