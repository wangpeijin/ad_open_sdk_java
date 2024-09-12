/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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



import com.bytedance.ads.model.StarMcnGetContractChallengeAuthorItemListV2V2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarMcnGetContractChallengeAuthorItemListV2V2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarMcnGetContractChallengeAuthorItemListV2V2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarMcnGetContractChallengeAuthorItemListV2V2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarMcnGetContractChallengeAuthorItemListV2Get
     * @param starId  (required)
     * @param demandId  (required)
     * @param page  (required)
     * @param pageSize  (required)
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
    public okhttp3.Call openApi2StarMcnGetContractChallengeAuthorItemListV2GetCall(Long starId, Long demandId, Integer page, Integer pageSize, Long developerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/mcn/get_contract_challenge_author_item_list_v2/";

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

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2StarMcnGetContractChallengeAuthorItemListV2GetValidateBeforeCall(Long starId, Long demandId, Integer page, Integer pageSize, Long developerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarMcnGetContractChallengeAuthorItemListV2Get(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarMcnGetContractChallengeAuthorItemListV2Get(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2StarMcnGetContractChallengeAuthorItemListV2Get(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2StarMcnGetContractChallengeAuthorItemListV2Get(Async)");
        }

        return openApi2StarMcnGetContractChallengeAuthorItemListV2GetCall(starId, demandId, page, pageSize, developerId, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param developerId  (optional)
     * @return StarMcnGetContractChallengeAuthorItemListV2V2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarMcnGetContractChallengeAuthorItemListV2V2Response openApi2StarMcnGetContractChallengeAuthorItemListV2Get(Long starId, Long demandId, Integer page, Integer pageSize, Long developerId) throws ApiException {
        ApiResponse<StarMcnGetContractChallengeAuthorItemListV2V2Response> localVarResp = openApi2StarMcnGetContractChallengeAuthorItemListV2GetWithHttpInfo(starId, demandId, page, pageSize, developerId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param developerId  (optional)
     * @return ApiResponse&lt;StarMcnGetContractChallengeAuthorItemListV2V2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarMcnGetContractChallengeAuthorItemListV2V2Response> openApi2StarMcnGetContractChallengeAuthorItemListV2GetWithHttpInfo(Long starId, Long demandId, Integer page, Integer pageSize, Long developerId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarMcnGetContractChallengeAuthorItemListV2GetValidateBeforeCall(starId, demandId, page, pageSize, developerId, null);
        Type localVarReturnType = new TypeToken<StarMcnGetContractChallengeAuthorItemListV2V2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param demandId  (required)
     * @param page  (required)
     * @param pageSize  (required)
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
    public okhttp3.Call openApi2StarMcnGetContractChallengeAuthorItemListV2GetAsync(Long starId, Long demandId, Integer page, Integer pageSize, Long developerId, final ApiCallback<StarMcnGetContractChallengeAuthorItemListV2V2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarMcnGetContractChallengeAuthorItemListV2GetValidateBeforeCall(starId, demandId, page, pageSize, developerId, _callback);
        Type localVarReturnType = new TypeToken<StarMcnGetContractChallengeAuthorItemListV2V2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
