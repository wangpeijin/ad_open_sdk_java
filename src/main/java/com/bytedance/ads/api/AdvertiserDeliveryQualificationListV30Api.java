/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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



import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30QualificationType;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30Response;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30Status;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvertiserDeliveryQualificationListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdvertiserDeliveryQualificationListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AdvertiserDeliveryQualificationListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AdvertiserDeliveryQualificationListGet
     * @param advertiserId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param qualificationType  (optional)
     * @param status  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserDeliveryQualificationListGetCall(Long advertiserId, Integer page, Integer pageSize, AdvertiserDeliveryQualificationListV30QualificationType qualificationType, AdvertiserDeliveryQualificationListV30Status status, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/advertiser/delivery_qualification/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (qualificationType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("qualification_type", qualificationType));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
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
    private okhttp3.Call openApiV30AdvertiserDeliveryQualificationListGetValidateBeforeCall(Long advertiserId, Integer page, Integer pageSize, AdvertiserDeliveryQualificationListV30QualificationType qualificationType, AdvertiserDeliveryQualificationListV30Status status, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30AdvertiserDeliveryQualificationListGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30AdvertiserDeliveryQualificationListGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApiV30AdvertiserDeliveryQualificationListGet(Async)");
        }

        return openApiV30AdvertiserDeliveryQualificationListGetCall(advertiserId, page, pageSize, qualificationType, status, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param qualificationType  (optional)
     * @param status  (optional)
     * @return AdvertiserDeliveryQualificationListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AdvertiserDeliveryQualificationListV30Response openApiV30AdvertiserDeliveryQualificationListGet(Long advertiserId, Integer page, Integer pageSize, AdvertiserDeliveryQualificationListV30QualificationType qualificationType, AdvertiserDeliveryQualificationListV30Status status) throws ApiException {
        ApiResponse<AdvertiserDeliveryQualificationListV30Response> localVarResp = openApiV30AdvertiserDeliveryQualificationListGetWithHttpInfo(advertiserId, page, pageSize, qualificationType, status);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param qualificationType  (optional)
     * @param status  (optional)
     * @return ApiResponse&lt;AdvertiserDeliveryQualificationListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdvertiserDeliveryQualificationListV30Response> openApiV30AdvertiserDeliveryQualificationListGetWithHttpInfo(Long advertiserId, Integer page, Integer pageSize, AdvertiserDeliveryQualificationListV30QualificationType qualificationType, AdvertiserDeliveryQualificationListV30Status status) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AdvertiserDeliveryQualificationListGetValidateBeforeCall(advertiserId, page, pageSize, qualificationType, status, null);
        Type localVarReturnType = new TypeToken<AdvertiserDeliveryQualificationListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param qualificationType  (optional)
     * @param status  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserDeliveryQualificationListGetAsync(Long advertiserId, Integer page, Integer pageSize, AdvertiserDeliveryQualificationListV30QualificationType qualificationType, AdvertiserDeliveryQualificationListV30Status status, final ApiCallback<AdvertiserDeliveryQualificationListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AdvertiserDeliveryQualificationListGetValidateBeforeCall(advertiserId, page, pageSize, qualificationType, status, _callback);
        Type localVarReturnType = new TypeToken<AdvertiserDeliveryQualificationListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
