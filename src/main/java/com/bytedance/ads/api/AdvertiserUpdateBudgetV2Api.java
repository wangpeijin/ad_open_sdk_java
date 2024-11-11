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



import com.bytedance.ads.model.AdvertiserUpdateBudgetV2Request;
import com.bytedance.ads.model.AdvertiserUpdateBudgetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvertiserUpdateBudgetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdvertiserUpdateBudgetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AdvertiserUpdateBudgetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2AdvertiserUpdateBudgetPost
     * @param advertiserUpdateBudgetV2Request  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2AdvertiserUpdateBudgetPostCall(AdvertiserUpdateBudgetV2Request advertiserUpdateBudgetV2Request, final ApiCallback _callback) throws ApiException {
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

        Object localVarPostBody = advertiserUpdateBudgetV2Request;

        // create path and map variables
        String localVarPath = "/open_api/2/advertiser/update/budget/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApi2AdvertiserUpdateBudgetPostValidateBeforeCall(AdvertiserUpdateBudgetV2Request advertiserUpdateBudgetV2Request, final ApiCallback _callback) throws ApiException {
        return openApi2AdvertiserUpdateBudgetPostCall(advertiserUpdateBudgetV2Request, _callback);

    }

    /**
     * 
     * 
     * @param advertiserUpdateBudgetV2Request  (optional)
     * @return AdvertiserUpdateBudgetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AdvertiserUpdateBudgetV2Response openApi2AdvertiserUpdateBudgetPost(AdvertiserUpdateBudgetV2Request advertiserUpdateBudgetV2Request) throws ApiException {
        ApiResponse<AdvertiserUpdateBudgetV2Response> localVarResp = openApi2AdvertiserUpdateBudgetPostWithHttpInfo(advertiserUpdateBudgetV2Request);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserUpdateBudgetV2Request  (optional)
     * @return ApiResponse&lt;AdvertiserUpdateBudgetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdvertiserUpdateBudgetV2Response> openApi2AdvertiserUpdateBudgetPostWithHttpInfo(AdvertiserUpdateBudgetV2Request advertiserUpdateBudgetV2Request) throws ApiException {
        okhttp3.Call localVarCall = openApi2AdvertiserUpdateBudgetPostValidateBeforeCall(advertiserUpdateBudgetV2Request, null);
        Type localVarReturnType = new TypeToken<AdvertiserUpdateBudgetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserUpdateBudgetV2Request  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2AdvertiserUpdateBudgetPostAsync(AdvertiserUpdateBudgetV2Request advertiserUpdateBudgetV2Request, final ApiCallback<AdvertiserUpdateBudgetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2AdvertiserUpdateBudgetPostValidateBeforeCall(advertiserUpdateBudgetV2Request, _callback);
        Type localVarReturnType = new TypeToken<AdvertiserUpdateBudgetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
