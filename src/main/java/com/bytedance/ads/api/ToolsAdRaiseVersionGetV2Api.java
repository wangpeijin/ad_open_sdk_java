/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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



import com.bytedance.ads.model.ToolsAdRaiseVersionGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAdRaiseVersionGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAdRaiseVersionGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAdRaiseVersionGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAdRaiseVersionGetGet
     * @param adId  (required)
     * @param advertiserId  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdRaiseVersionGetGetCall(Long adId, Long advertiserId, Long pageSize, Long page, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/ad_raise_version/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (adId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_id", adId));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
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

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2ToolsAdRaiseVersionGetGetValidateBeforeCall(Long adId, Long advertiserId, Long pageSize, Long page, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'adId' is set
        if (adId == null) {
            throw new ApiException("Missing the required parameter 'adId' when calling openApi2ToolsAdRaiseVersionGetGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsAdRaiseVersionGetGet(Async)");
        }

        return openApi2ToolsAdRaiseVersionGetGetCall(adId, advertiserId, pageSize, page, _callback);

    }

    /**
     * 
     * 
     * @param adId  (required)
     * @param advertiserId  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @return ToolsAdRaiseVersionGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAdRaiseVersionGetV2Response openApi2ToolsAdRaiseVersionGetGet(Long adId, Long advertiserId, Long pageSize, Long page) throws ApiException {
        ApiResponse<ToolsAdRaiseVersionGetV2Response> localVarResp = openApi2ToolsAdRaiseVersionGetGetWithHttpInfo(adId, advertiserId, pageSize, page);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param adId  (required)
     * @param advertiserId  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @return ApiResponse&lt;ToolsAdRaiseVersionGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAdRaiseVersionGetV2Response> openApi2ToolsAdRaiseVersionGetGetWithHttpInfo(Long adId, Long advertiserId, Long pageSize, Long page) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAdRaiseVersionGetGetValidateBeforeCall(adId, advertiserId, pageSize, page, null);
        Type localVarReturnType = new TypeToken<ToolsAdRaiseVersionGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param adId  (required)
     * @param advertiserId  (required)
     * @param pageSize  (optional, default to 10)
     * @param page  (optional, default to 1)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAdRaiseVersionGetGetAsync(Long adId, Long advertiserId, Long pageSize, Long page, final ApiCallback<ToolsAdRaiseVersionGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAdRaiseVersionGetGetValidateBeforeCall(adId, advertiserId, pageSize, page, _callback);
        Type localVarReturnType = new TypeToken<ToolsAdRaiseVersionGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
