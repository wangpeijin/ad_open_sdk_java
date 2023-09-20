/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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



import com.bytedance.ads.model.QianchuanReportVideoUserLoseGetV10Filtering;
import com.bytedance.ads.model.QianchuanReportVideoUserLoseGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanReportVideoUserLoseGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanReportVideoUserLoseGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanReportVideoUserLoseGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanReportVideoUserLoseGetGet
     * @param fields  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param filtering  (required)
     * @param advertiserId  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportVideoUserLoseGetGetCall(List<String> fields, String startDate, String endDate, QianchuanReportVideoUserLoseGetV10Filtering filtering, Long advertiserId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/report/video_user_lose/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
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

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV10QianchuanReportVideoUserLoseGetGetValidateBeforeCall(List<String> fields, String startDate, String endDate, QianchuanReportVideoUserLoseGetV10Filtering filtering, Long advertiserId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanReportVideoUserLoseGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV10QianchuanReportVideoUserLoseGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV10QianchuanReportVideoUserLoseGetGet(Async)");
        }

        // verify the required parameter 'filtering' is set
        if (filtering == null) {
            throw new ApiException("Missing the required parameter 'filtering' when calling openApiV10QianchuanReportVideoUserLoseGetGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanReportVideoUserLoseGetGet(Async)");
        }

        return openApiV10QianchuanReportVideoUserLoseGetGetCall(fields, startDate, endDate, filtering, advertiserId, _callback);

    }

    /**
     * 
     * 
     * @param fields  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param filtering  (required)
     * @param advertiserId  (required)
     * @return QianchuanReportVideoUserLoseGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanReportVideoUserLoseGetV10Response openApiV10QianchuanReportVideoUserLoseGetGet(List<String> fields, String startDate, String endDate, QianchuanReportVideoUserLoseGetV10Filtering filtering, Long advertiserId) throws ApiException {
        ApiResponse<QianchuanReportVideoUserLoseGetV10Response> localVarResp = openApiV10QianchuanReportVideoUserLoseGetGetWithHttpInfo(fields, startDate, endDate, filtering, advertiserId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param fields  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param filtering  (required)
     * @param advertiserId  (required)
     * @return ApiResponse&lt;QianchuanReportVideoUserLoseGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanReportVideoUserLoseGetV10Response> openApiV10QianchuanReportVideoUserLoseGetGetWithHttpInfo(List<String> fields, String startDate, String endDate, QianchuanReportVideoUserLoseGetV10Filtering filtering, Long advertiserId) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanReportVideoUserLoseGetGetValidateBeforeCall(fields, startDate, endDate, filtering, advertiserId, null);
        Type localVarReturnType = new TypeToken<QianchuanReportVideoUserLoseGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param fields  (required)
     * @param startDate  (required)
     * @param endDate  (required)
     * @param filtering  (required)
     * @param advertiserId  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanReportVideoUserLoseGetGetAsync(List<String> fields, String startDate, String endDate, QianchuanReportVideoUserLoseGetV10Filtering filtering, Long advertiserId, final ApiCallback<QianchuanReportVideoUserLoseGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanReportVideoUserLoseGetGetValidateBeforeCall(fields, startDate, endDate, filtering, advertiserId, _callback);
        Type localVarReturnType = new TypeToken<QianchuanReportVideoUserLoseGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
