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



import com.bytedance.ads.model.PromotionRejectReasonGetV30DeliveryMode;
import com.bytedance.ads.model.PromotionRejectReasonGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PromotionRejectReasonGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PromotionRejectReasonGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public PromotionRejectReasonGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30PromotionRejectReasonGetGet
     * @param advertiserId 广告主ID (required)
     * @param promotionIds 广告id列表 (required)
     * @param deliveryMode 投放模式，允许值： MANUAL手动投放（默认值） PROCEDURAL自动投放 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30PromotionRejectReasonGetGetCall(Long advertiserId, List<Long> promotionIds, PromotionRejectReasonGetV30DeliveryMode deliveryMode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/promotion/reject_reason/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (promotionIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "promotion_ids", promotionIds));
        }

        if (deliveryMode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("delivery_mode", deliveryMode));
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
    private okhttp3.Call openApiV30PromotionRejectReasonGetGetValidateBeforeCall(Long advertiserId, List<Long> promotionIds, PromotionRejectReasonGetV30DeliveryMode deliveryMode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30PromotionRejectReasonGetGet(Async)");
        }

        // verify the required parameter 'promotionIds' is set
        if (promotionIds == null) {
            throw new ApiException("Missing the required parameter 'promotionIds' when calling openApiV30PromotionRejectReasonGetGet(Async)");
        }

        return openApiV30PromotionRejectReasonGetGetCall(advertiserId, promotionIds, deliveryMode, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param promotionIds 广告id列表 (required)
     * @param deliveryMode 投放模式，允许值： MANUAL手动投放（默认值） PROCEDURAL自动投放 (optional)
     * @return PromotionRejectReasonGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public PromotionRejectReasonGetV30Response openApiV30PromotionRejectReasonGetGet(Long advertiserId, List<Long> promotionIds, PromotionRejectReasonGetV30DeliveryMode deliveryMode) throws ApiException {
        ApiResponse<PromotionRejectReasonGetV30Response> localVarResp = openApiV30PromotionRejectReasonGetGetWithHttpInfo(advertiserId, promotionIds, deliveryMode);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param promotionIds 广告id列表 (required)
     * @param deliveryMode 投放模式，允许值： MANUAL手动投放（默认值） PROCEDURAL自动投放 (optional)
     * @return ApiResponse&lt;PromotionRejectReasonGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PromotionRejectReasonGetV30Response> openApiV30PromotionRejectReasonGetGetWithHttpInfo(Long advertiserId, List<Long> promotionIds, PromotionRejectReasonGetV30DeliveryMode deliveryMode) throws ApiException {
        okhttp3.Call localVarCall = openApiV30PromotionRejectReasonGetGetValidateBeforeCall(advertiserId, promotionIds, deliveryMode, null);
        Type localVarReturnType = new TypeToken<PromotionRejectReasonGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param promotionIds 广告id列表 (required)
     * @param deliveryMode 投放模式，允许值： MANUAL手动投放（默认值） PROCEDURAL自动投放 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30PromotionRejectReasonGetGetAsync(Long advertiserId, List<Long> promotionIds, PromotionRejectReasonGetV30DeliveryMode deliveryMode, final ApiCallback<PromotionRejectReasonGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30PromotionRejectReasonGetGetValidateBeforeCall(advertiserId, promotionIds, deliveryMode, _callback);
        Type localVarReturnType = new TypeToken<PromotionRejectReasonGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}