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



import com.bytedance.ads.model.DouplusOrderListV30Filter;
import com.bytedance.ads.model.DouplusOrderListV30OrderByField;
import com.bytedance.ads.model.DouplusOrderListV30OrderByType;
import com.bytedance.ads.model.DouplusOrderListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DouplusOrderListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DouplusOrderListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DouplusOrderListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30DouplusOrderListGet
     * @param awemeSecUid  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param orderByField 排序字段 (optional)
     * @param orderByType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOrderListGetCall(String awemeSecUid, DouplusOrderListV30Filter filter, Long pageSize, Long page, DouplusOrderListV30OrderByField orderByField, DouplusOrderListV30OrderByType orderByType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/douplus/order/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (awemeSecUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_sec_uid", awemeSecUid));
        }

        if (filter != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter", filter));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (orderByField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by_field", orderByField));
        }

        if (orderByType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_by_type", orderByType));
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
    private okhttp3.Call openApiV30DouplusOrderListGetValidateBeforeCall(String awemeSecUid, DouplusOrderListV30Filter filter, Long pageSize, Long page, DouplusOrderListV30OrderByField orderByField, DouplusOrderListV30OrderByType orderByType, final ApiCallback _callback) throws ApiException {
        return openApiV30DouplusOrderListGetCall(awemeSecUid, filter, pageSize, page, orderByField, orderByType, _callback);

    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param orderByField 排序字段 (optional)
     * @param orderByType  (optional)
     * @return DouplusOrderListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DouplusOrderListV30Response openApiV30DouplusOrderListGet(String awemeSecUid, DouplusOrderListV30Filter filter, Long pageSize, Long page, DouplusOrderListV30OrderByField orderByField, DouplusOrderListV30OrderByType orderByType) throws ApiException {
        ApiResponse<DouplusOrderListV30Response> localVarResp = openApiV30DouplusOrderListGetWithHttpInfo(awemeSecUid, filter, pageSize, page, orderByField, orderByType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param awemeSecUid  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param orderByField 排序字段 (optional)
     * @param orderByType  (optional)
     * @return ApiResponse&lt;DouplusOrderListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DouplusOrderListV30Response> openApiV30DouplusOrderListGetWithHttpInfo(String awemeSecUid, DouplusOrderListV30Filter filter, Long pageSize, Long page, DouplusOrderListV30OrderByField orderByField, DouplusOrderListV30OrderByType orderByType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30DouplusOrderListGetValidateBeforeCall(awemeSecUid, filter, pageSize, page, orderByField, orderByType, null);
        Type localVarReturnType = new TypeToken<DouplusOrderListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param awemeSecUid  (optional)
     * @param filter  (optional)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param orderByField 排序字段 (optional)
     * @param orderByType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOrderListGetAsync(String awemeSecUid, DouplusOrderListV30Filter filter, Long pageSize, Long page, DouplusOrderListV30OrderByField orderByField, DouplusOrderListV30OrderByType orderByType, final ApiCallback<DouplusOrderListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30DouplusOrderListGetValidateBeforeCall(awemeSecUid, filter, pageSize, page, orderByField, orderByType, _callback);
        Type localVarReturnType = new TypeToken<DouplusOrderListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
