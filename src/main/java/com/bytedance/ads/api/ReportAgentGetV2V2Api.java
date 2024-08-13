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



import com.bytedance.ads.model.ReportAgentGetV2V2Filtering;
import com.bytedance.ads.model.ReportAgentGetV2V2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportAgentGetV2V2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportAgentGetV2V2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportAgentGetV2V2Api(ApiClient apiClient) {
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
     * Build call for openApi2ReportAgentGetV2Get
     * @param agentId  (optional)
     * @param cursor  (optional)
     * @param cursorSize  (optional)
     * @param endDate  (optional)
     * @param filtering  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportAgentGetV2GetCall(Long agentId, Long cursor, Long cursorSize, String endDate, ReportAgentGetV2V2Filtering filtering, Long page, Long pageSize, String startDate, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/report/agent/get_v2/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (cursorSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor_size", cursorSize));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
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

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
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
    private okhttp3.Call openApi2ReportAgentGetV2GetValidateBeforeCall(Long agentId, Long cursor, Long cursorSize, String endDate, ReportAgentGetV2V2Filtering filtering, Long page, Long pageSize, String startDate, final ApiCallback _callback) throws ApiException {
        return openApi2ReportAgentGetV2GetCall(agentId, cursor, cursorSize, endDate, filtering, page, pageSize, startDate, _callback);

    }

    /**
     * 
     * 
     * @param agentId  (optional)
     * @param cursor  (optional)
     * @param cursorSize  (optional)
     * @param endDate  (optional)
     * @param filtering  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @return ReportAgentGetV2V2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportAgentGetV2V2Response openApi2ReportAgentGetV2Get(Long agentId, Long cursor, Long cursorSize, String endDate, ReportAgentGetV2V2Filtering filtering, Long page, Long pageSize, String startDate) throws ApiException {
        ApiResponse<ReportAgentGetV2V2Response> localVarResp = openApi2ReportAgentGetV2GetWithHttpInfo(agentId, cursor, cursorSize, endDate, filtering, page, pageSize, startDate);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId  (optional)
     * @param cursor  (optional)
     * @param cursorSize  (optional)
     * @param endDate  (optional)
     * @param filtering  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @return ApiResponse&lt;ReportAgentGetV2V2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportAgentGetV2V2Response> openApi2ReportAgentGetV2GetWithHttpInfo(Long agentId, Long cursor, Long cursorSize, String endDate, ReportAgentGetV2V2Filtering filtering, Long page, Long pageSize, String startDate) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportAgentGetV2GetValidateBeforeCall(agentId, cursor, cursorSize, endDate, filtering, page, pageSize, startDate, null);
        Type localVarReturnType = new TypeToken<ReportAgentGetV2V2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId  (optional)
     * @param cursor  (optional)
     * @param cursorSize  (optional)
     * @param endDate  (optional)
     * @param filtering  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportAgentGetV2GetAsync(Long agentId, Long cursor, Long cursorSize, String endDate, ReportAgentGetV2V2Filtering filtering, Long page, Long pageSize, String startDate, final ApiCallback<ReportAgentGetV2V2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportAgentGetV2GetValidateBeforeCall(agentId, cursor, cursorSize, endDate, filtering, page, pageSize, startDate, _callback);
        Type localVarReturnType = new TypeToken<ReportAgentGetV2V2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
