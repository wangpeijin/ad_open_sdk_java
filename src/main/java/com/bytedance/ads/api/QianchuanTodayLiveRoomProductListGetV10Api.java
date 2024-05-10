/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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



import com.bytedance.ads.model.QianchuanTodayLiveRoomProductListGetV10ExplainStatus;
import com.bytedance.ads.model.QianchuanTodayLiveRoomProductListGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanTodayLiveRoomProductListGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanTodayLiveRoomProductListGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanTodayLiveRoomProductListGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanTodayLiveRoomProductListGetGet
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param fields  (required)
     * @param explainStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomProductListGetGetCall(Long advertiserId, Long roomId, List<String> fields, QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/today_live/room/product_list/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (roomId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("room_id", roomId));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (explainStatus != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("explain_status", explainStatus));
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
    private okhttp3.Call openApiV10QianchuanTodayLiveRoomProductListGetGetValidateBeforeCall(Long advertiserId, Long roomId, List<String> fields, QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanTodayLiveRoomProductListGetGet(Async)");
        }

        // verify the required parameter 'roomId' is set
        if (roomId == null) {
            throw new ApiException("Missing the required parameter 'roomId' when calling openApiV10QianchuanTodayLiveRoomProductListGetGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanTodayLiveRoomProductListGetGet(Async)");
        }

        return openApiV10QianchuanTodayLiveRoomProductListGetGetCall(advertiserId, roomId, fields, explainStatus, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param fields  (required)
     * @param explainStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return QianchuanTodayLiveRoomProductListGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanTodayLiveRoomProductListGetV10Response openApiV10QianchuanTodayLiveRoomProductListGetGet(Long advertiserId, Long roomId, List<String> fields, QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<QianchuanTodayLiveRoomProductListGetV10Response> localVarResp = openApiV10QianchuanTodayLiveRoomProductListGetGetWithHttpInfo(advertiserId, roomId, fields, explainStatus, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param fields  (required)
     * @param explainStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @return ApiResponse&lt;QianchuanTodayLiveRoomProductListGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanTodayLiveRoomProductListGetV10Response> openApiV10QianchuanTodayLiveRoomProductListGetGetWithHttpInfo(Long advertiserId, Long roomId, List<String> fields, QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomProductListGetGetValidateBeforeCall(advertiserId, roomId, fields, explainStatus, page, pageSize, null);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomProductListGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param roomId  (required)
     * @param fields  (required)
     * @param explainStatus  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 20)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanTodayLiveRoomProductListGetGetAsync(Long advertiserId, Long roomId, List<String> fields, QianchuanTodayLiveRoomProductListGetV10ExplainStatus explainStatus, Integer page, Integer pageSize, final ApiCallback<QianchuanTodayLiveRoomProductListGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanTodayLiveRoomProductListGetGetValidateBeforeCall(advertiserId, roomId, fields, explainStatus, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<QianchuanTodayLiveRoomProductListGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
