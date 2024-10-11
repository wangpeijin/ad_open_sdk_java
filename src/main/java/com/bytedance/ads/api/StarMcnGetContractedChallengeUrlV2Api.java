/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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



import com.bytedance.ads.model.StarMcnGetContractedChallengeUrlV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarMcnGetContractedChallengeUrlV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarMcnGetContractedChallengeUrlV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarMcnGetContractedChallengeUrlV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarMcnGetContractedChallengeUrlGet
     * @param starId  (required)
     * @param demandId  (required)
     * @param channelId  (optional)
     * @param developerId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnGetContractedChallengeUrlGetCall(Long starId, Long demandId, String channelId, Long developerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/mcn/get_contracted_challenge_url/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (channelId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("channel_id", channelId));
        }

        if (developerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developer_id", developerId));
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
    private okhttp3.Call openApi2StarMcnGetContractedChallengeUrlGetValidateBeforeCall(Long starId, Long demandId, String channelId, Long developerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarMcnGetContractedChallengeUrlGet(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarMcnGetContractedChallengeUrlGet(Async)");
        }

        return openApi2StarMcnGetContractedChallengeUrlGetCall(starId, demandId, channelId, developerId, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param channelId  (optional)
     * @param developerId  (optional)
     * @return StarMcnGetContractedChallengeUrlV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarMcnGetContractedChallengeUrlV2Response openApi2StarMcnGetContractedChallengeUrlGet(Long starId, Long demandId, String channelId, Long developerId) throws ApiException {
        ApiResponse<StarMcnGetContractedChallengeUrlV2Response> localVarResp = openApi2StarMcnGetContractedChallengeUrlGetWithHttpInfo(starId, demandId, channelId, developerId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param channelId  (optional)
     * @param developerId  (optional)
     * @return ApiResponse&lt;StarMcnGetContractedChallengeUrlV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarMcnGetContractedChallengeUrlV2Response> openApi2StarMcnGetContractedChallengeUrlGetWithHttpInfo(Long starId, Long demandId, String channelId, Long developerId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarMcnGetContractedChallengeUrlGetValidateBeforeCall(starId, demandId, channelId, developerId, null);
        Type localVarReturnType = new TypeToken<StarMcnGetContractedChallengeUrlV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param channelId  (optional)
     * @param developerId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnGetContractedChallengeUrlGetAsync(Long starId, Long demandId, String channelId, Long developerId, final ApiCallback<StarMcnGetContractedChallengeUrlV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarMcnGetContractedChallengeUrlGetValidateBeforeCall(starId, demandId, channelId, developerId, _callback);
        Type localVarReturnType = new TypeToken<StarMcnGetContractedChallengeUrlV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
