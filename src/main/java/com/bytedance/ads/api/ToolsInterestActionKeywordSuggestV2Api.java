/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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



import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2ActionDays;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2Response;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2TagType;
import com.bytedance.ads.model.ToolsInterestActionKeywordSuggestV2TargetingType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsInterestActionKeywordSuggestV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsInterestActionKeywordSuggestV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsInterestActionKeywordSuggestV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsInterestActionKeywordSuggestGet
     * @param advertiserId  (required)
     * @param id  (required)
     * @param tagType  (required)
     * @param targetingType  (required)
     * @param actionDays  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsInterestActionKeywordSuggestGetCall(Long advertiserId, Long id, ToolsInterestActionKeywordSuggestV2TagType tagType, ToolsInterestActionKeywordSuggestV2TargetingType targetingType, ToolsInterestActionKeywordSuggestV2ActionDays actionDays, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/interest_action/keyword/suggest/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (id != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id", id));
        }

        if (tagType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("tag_type", tagType));
        }

        if (targetingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("targeting_type", targetingType));
        }

        if (actionDays != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("action_days", actionDays));
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
    private okhttp3.Call openApi2ToolsInterestActionKeywordSuggestGetValidateBeforeCall(Long advertiserId, Long id, ToolsInterestActionKeywordSuggestV2TagType tagType, ToolsInterestActionKeywordSuggestV2TargetingType targetingType, ToolsInterestActionKeywordSuggestV2ActionDays actionDays, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsInterestActionKeywordSuggestGet(Async)");
        }

        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling openApi2ToolsInterestActionKeywordSuggestGet(Async)");
        }

        // verify the required parameter 'tagType' is set
        if (tagType == null) {
            throw new ApiException("Missing the required parameter 'tagType' when calling openApi2ToolsInterestActionKeywordSuggestGet(Async)");
        }

        // verify the required parameter 'targetingType' is set
        if (targetingType == null) {
            throw new ApiException("Missing the required parameter 'targetingType' when calling openApi2ToolsInterestActionKeywordSuggestGet(Async)");
        }

        return openApi2ToolsInterestActionKeywordSuggestGetCall(advertiserId, id, tagType, targetingType, actionDays, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param id  (required)
     * @param tagType  (required)
     * @param targetingType  (required)
     * @param actionDays  (optional)
     * @return ToolsInterestActionKeywordSuggestV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsInterestActionKeywordSuggestV2Response openApi2ToolsInterestActionKeywordSuggestGet(Long advertiserId, Long id, ToolsInterestActionKeywordSuggestV2TagType tagType, ToolsInterestActionKeywordSuggestV2TargetingType targetingType, ToolsInterestActionKeywordSuggestV2ActionDays actionDays) throws ApiException {
        ApiResponse<ToolsInterestActionKeywordSuggestV2Response> localVarResp = openApi2ToolsInterestActionKeywordSuggestGetWithHttpInfo(advertiserId, id, tagType, targetingType, actionDays);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param id  (required)
     * @param tagType  (required)
     * @param targetingType  (required)
     * @param actionDays  (optional)
     * @return ApiResponse&lt;ToolsInterestActionKeywordSuggestV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsInterestActionKeywordSuggestV2Response> openApi2ToolsInterestActionKeywordSuggestGetWithHttpInfo(Long advertiserId, Long id, ToolsInterestActionKeywordSuggestV2TagType tagType, ToolsInterestActionKeywordSuggestV2TargetingType targetingType, ToolsInterestActionKeywordSuggestV2ActionDays actionDays) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsInterestActionKeywordSuggestGetValidateBeforeCall(advertiserId, id, tagType, targetingType, actionDays, null);
        Type localVarReturnType = new TypeToken<ToolsInterestActionKeywordSuggestV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param id  (required)
     * @param tagType  (required)
     * @param targetingType  (required)
     * @param actionDays  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsInterestActionKeywordSuggestGetAsync(Long advertiserId, Long id, ToolsInterestActionKeywordSuggestV2TagType tagType, ToolsInterestActionKeywordSuggestV2TargetingType targetingType, ToolsInterestActionKeywordSuggestV2ActionDays actionDays, final ApiCallback<ToolsInterestActionKeywordSuggestV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsInterestActionKeywordSuggestGetValidateBeforeCall(advertiserId, id, tagType, targetingType, actionDays, _callback);
        Type localVarReturnType = new TypeToken<ToolsInterestActionKeywordSuggestV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
