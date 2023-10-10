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

import com.google.gson.reflect.TypeToken;



import com.bytedance.ads.model.SpiTaskGetV2Response;
import com.bytedance.ads.model.SpiTaskGetV2Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpiTaskGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SpiTaskGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SpiTaskGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2SpiTaskGetGet
     * @param appId  (optional)
     * @param endDate  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param serviceLabel  (optional)
     * @param startDate  (optional)
     * @param status  (optional)
     * @param subscribeId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2SpiTaskGetGetCall(Long appId, String endDate, Long page, Long pageSize, String serviceLabel, String startDate, SpiTaskGetV2Status status, Long subscribeId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/spi_task/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_id", appId));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (serviceLabel != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service_label", serviceLabel));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
        }

        if (subscribeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("subscribe_id", subscribeId));
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
    private okhttp3.Call openApi2SpiTaskGetGetValidateBeforeCall(Long appId, String endDate, Long page, Long pageSize, String serviceLabel, String startDate, SpiTaskGetV2Status status, Long subscribeId, final ApiCallback _callback) throws ApiException {
        return openApi2SpiTaskGetGetCall(appId, endDate, page, pageSize, serviceLabel, startDate, status, subscribeId, _callback);

    }

    /**
     * 
     * 
     * @param appId  (optional)
     * @param endDate  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param serviceLabel  (optional)
     * @param startDate  (optional)
     * @param status  (optional)
     * @param subscribeId  (optional)
     * @return SpiTaskGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SpiTaskGetV2Response openApi2SpiTaskGetGet(Long appId, String endDate, Long page, Long pageSize, String serviceLabel, String startDate, SpiTaskGetV2Status status, Long subscribeId) throws ApiException {
        ApiResponse<SpiTaskGetV2Response> localVarResp = openApi2SpiTaskGetGetWithHttpInfo(appId, endDate, page, pageSize, serviceLabel, startDate, status, subscribeId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param appId  (optional)
     * @param endDate  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param serviceLabel  (optional)
     * @param startDate  (optional)
     * @param status  (optional)
     * @param subscribeId  (optional)
     * @return ApiResponse&lt;SpiTaskGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SpiTaskGetV2Response> openApi2SpiTaskGetGetWithHttpInfo(Long appId, String endDate, Long page, Long pageSize, String serviceLabel, String startDate, SpiTaskGetV2Status status, Long subscribeId) throws ApiException {
        okhttp3.Call localVarCall = openApi2SpiTaskGetGetValidateBeforeCall(appId, endDate, page, pageSize, serviceLabel, startDate, status, subscribeId, null);
        Type localVarReturnType = new TypeToken<SpiTaskGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId  (optional)
     * @param endDate  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param serviceLabel  (optional)
     * @param startDate  (optional)
     * @param status  (optional)
     * @param subscribeId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2SpiTaskGetGetAsync(Long appId, String endDate, Long page, Long pageSize, String serviceLabel, String startDate, SpiTaskGetV2Status status, Long subscribeId, final ApiCallback<SpiTaskGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2SpiTaskGetGetValidateBeforeCall(appId, endDate, page, pageSize, serviceLabel, startDate, status, subscribeId, _callback);
        Type localVarReturnType = new TypeToken<SpiTaskGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}