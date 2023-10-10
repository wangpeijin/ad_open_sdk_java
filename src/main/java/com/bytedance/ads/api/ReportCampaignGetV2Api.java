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



import com.bytedance.ads.model.ReportCampaignGetV2Filtering;
import com.bytedance.ads.model.ReportCampaignGetV2GroupBy;
import com.bytedance.ads.model.ReportCampaignGetV2OrderField;
import com.bytedance.ads.model.ReportCampaignGetV2OrderType;
import com.bytedance.ads.model.ReportCampaignGetV2Response;
import com.bytedance.ads.model.ReportCampaignGetV2TimeGranularity;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportCampaignGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportCampaignGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportCampaignGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ReportCampaignGetGet
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param fields  (optional)
     * @param filtering  (optional)
     * @param groupBy  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportCampaignGetGetCall(Long advertiserId, String endDate, List<String> fields, ReportCampaignGetV2Filtering filtering, List<ReportCampaignGetV2GroupBy> groupBy, ReportCampaignGetV2OrderField orderField, ReportCampaignGetV2OrderType orderType, Long page, Long pageSize, String startDate, ReportCampaignGetV2TimeGranularity timeGranularity, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/report/campaign/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "fields", fields));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (groupBy != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "group_by", groupBy));
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

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (timeGranularity != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_granularity", timeGranularity));
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
    private okhttp3.Call openApi2ReportCampaignGetGetValidateBeforeCall(Long advertiserId, String endDate, List<String> fields, ReportCampaignGetV2Filtering filtering, List<ReportCampaignGetV2GroupBy> groupBy, ReportCampaignGetV2OrderField orderField, ReportCampaignGetV2OrderType orderType, Long page, Long pageSize, String startDate, ReportCampaignGetV2TimeGranularity timeGranularity, final ApiCallback _callback) throws ApiException {
        return openApi2ReportCampaignGetGetCall(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param fields  (optional)
     * @param filtering  (optional)
     * @param groupBy  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @return ReportCampaignGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportCampaignGetV2Response openApi2ReportCampaignGetGet(Long advertiserId, String endDate, List<String> fields, ReportCampaignGetV2Filtering filtering, List<ReportCampaignGetV2GroupBy> groupBy, ReportCampaignGetV2OrderField orderField, ReportCampaignGetV2OrderType orderType, Long page, Long pageSize, String startDate, ReportCampaignGetV2TimeGranularity timeGranularity) throws ApiException {
        ApiResponse<ReportCampaignGetV2Response> localVarResp = openApi2ReportCampaignGetGetWithHttpInfo(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param fields  (optional)
     * @param filtering  (optional)
     * @param groupBy  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @return ApiResponse&lt;ReportCampaignGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportCampaignGetV2Response> openApi2ReportCampaignGetGetWithHttpInfo(Long advertiserId, String endDate, List<String> fields, ReportCampaignGetV2Filtering filtering, List<ReportCampaignGetV2GroupBy> groupBy, ReportCampaignGetV2OrderField orderField, ReportCampaignGetV2OrderType orderType, Long page, Long pageSize, String startDate, ReportCampaignGetV2TimeGranularity timeGranularity) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportCampaignGetGetValidateBeforeCall(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity, null);
        Type localVarReturnType = new TypeToken<ReportCampaignGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param endDate  (optional)
     * @param fields  (optional)
     * @param filtering  (optional)
     * @param groupBy  (optional)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param startDate  (optional)
     * @param timeGranularity  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportCampaignGetGetAsync(Long advertiserId, String endDate, List<String> fields, ReportCampaignGetV2Filtering filtering, List<ReportCampaignGetV2GroupBy> groupBy, ReportCampaignGetV2OrderField orderField, ReportCampaignGetV2OrderType orderType, Long page, Long pageSize, String startDate, ReportCampaignGetV2TimeGranularity timeGranularity, final ApiCallback<ReportCampaignGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportCampaignGetGetValidateBeforeCall(advertiserId, endDate, fields, filtering, groupBy, orderField, orderType, page, pageSize, startDate, timeGranularity, _callback);
        Type localVarReturnType = new TypeToken<ReportCampaignGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}