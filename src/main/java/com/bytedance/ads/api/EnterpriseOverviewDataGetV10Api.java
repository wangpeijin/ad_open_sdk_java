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



import com.bytedance.ads.model.EnterpriseOverviewDataGetV10Filter;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10OrderType;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10Response;
import com.bytedance.ads.model.EnterpriseOverviewDataGetV10TimeDimension;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnterpriseOverviewDataGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public EnterpriseOverviewDataGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public EnterpriseOverviewDataGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10EnterpriseOverviewDataGetGet
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param fields  (optional)
     * @param filter  (optional)
     * @param lastEndTime  (optional)
     * @param lastStartTime  (optional)
     * @param limit  (optional, default to 100)
     * @param offset  (optional, default to 0)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param ratioFields  (optional)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseOverviewDataGetGetCall(Long advertiserId, String endTime, List<String> fields, EnterpriseOverviewDataGetV10Filter filter, String lastEndTime, String lastStartTime, Long limit, Long offset, String orderField, EnterpriseOverviewDataGetV10OrderType orderType, List<String> ratioFields, String startTime, EnterpriseOverviewDataGetV10TimeDimension timeDimension, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/enterprise/overview/data/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "fields", fields));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (lastEndTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_end_time", lastEndTime));
        }

        if (lastStartTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("last_start_time", lastStartTime));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (ratioFields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("multi", "ratio_fields", ratioFields));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (timeDimension != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("time_dimension", timeDimension));
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
    private okhttp3.Call openApiV10EnterpriseOverviewDataGetGetValidateBeforeCall(Long advertiserId, String endTime, List<String> fields, EnterpriseOverviewDataGetV10Filter filter, String lastEndTime, String lastStartTime, Long limit, Long offset, String orderField, EnterpriseOverviewDataGetV10OrderType orderType, List<String> ratioFields, String startTime, EnterpriseOverviewDataGetV10TimeDimension timeDimension, final ApiCallback _callback) throws ApiException {
        return openApiV10EnterpriseOverviewDataGetGetCall(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param fields  (optional)
     * @param filter  (optional)
     * @param lastEndTime  (optional)
     * @param lastStartTime  (optional)
     * @param limit  (optional, default to 100)
     * @param offset  (optional, default to 0)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param ratioFields  (optional)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @return EnterpriseOverviewDataGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public EnterpriseOverviewDataGetV10Response openApiV10EnterpriseOverviewDataGetGet(Long advertiserId, String endTime, List<String> fields, EnterpriseOverviewDataGetV10Filter filter, String lastEndTime, String lastStartTime, Long limit, Long offset, String orderField, EnterpriseOverviewDataGetV10OrderType orderType, List<String> ratioFields, String startTime, EnterpriseOverviewDataGetV10TimeDimension timeDimension) throws ApiException {
        ApiResponse<EnterpriseOverviewDataGetV10Response> localVarResp = openApiV10EnterpriseOverviewDataGetGetWithHttpInfo(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param fields  (optional)
     * @param filter  (optional)
     * @param lastEndTime  (optional)
     * @param lastStartTime  (optional)
     * @param limit  (optional, default to 100)
     * @param offset  (optional, default to 0)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param ratioFields  (optional)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @return ApiResponse&lt;EnterpriseOverviewDataGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<EnterpriseOverviewDataGetV10Response> openApiV10EnterpriseOverviewDataGetGetWithHttpInfo(Long advertiserId, String endTime, List<String> fields, EnterpriseOverviewDataGetV10Filter filter, String lastEndTime, String lastStartTime, Long limit, Long offset, String orderField, EnterpriseOverviewDataGetV10OrderType orderType, List<String> ratioFields, String startTime, EnterpriseOverviewDataGetV10TimeDimension timeDimension) throws ApiException {
        okhttp3.Call localVarCall = openApiV10EnterpriseOverviewDataGetGetValidateBeforeCall(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension, null);
        Type localVarReturnType = new TypeToken<EnterpriseOverviewDataGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (optional)
     * @param endTime  (optional)
     * @param fields  (optional)
     * @param filter  (optional)
     * @param lastEndTime  (optional)
     * @param lastStartTime  (optional)
     * @param limit  (optional, default to 100)
     * @param offset  (optional, default to 0)
     * @param orderField  (optional)
     * @param orderType  (optional)
     * @param ratioFields  (optional)
     * @param startTime  (optional)
     * @param timeDimension  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10EnterpriseOverviewDataGetGetAsync(Long advertiserId, String endTime, List<String> fields, EnterpriseOverviewDataGetV10Filter filter, String lastEndTime, String lastStartTime, Long limit, Long offset, String orderField, EnterpriseOverviewDataGetV10OrderType orderType, List<String> ratioFields, String startTime, EnterpriseOverviewDataGetV10TimeDimension timeDimension, final ApiCallback<EnterpriseOverviewDataGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10EnterpriseOverviewDataGetGetValidateBeforeCall(advertiserId, endTime, fields, filter, lastEndTime, lastStartTime, limit, offset, orderField, orderType, ratioFields, startTime, timeDimension, _callback);
        Type localVarReturnType = new TypeToken<EnterpriseOverviewDataGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
