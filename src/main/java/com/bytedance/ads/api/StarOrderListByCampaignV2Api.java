/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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



import com.bytedance.ads.model.StarOrderListByCampaignV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarOrderListByCampaignV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarOrderListByCampaignV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarOrderListByCampaignV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarOrderListByCampaignGet
     * @param starId 星图客户ID (required)
     * @param campaignIds 需求ID (required)
     * @param page 分页页码 (optional, default to 1)
     * @param limit 页大小 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderListByCampaignGetCall(Long starId, List<Long> campaignIds, Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/order/list_by_campaign/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (campaignIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "campaign_ids", campaignIds));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call openApi2StarOrderListByCampaignGetValidateBeforeCall(Long starId, List<Long> campaignIds, Integer page, Integer limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarOrderListByCampaignGet(Async)");
        }

        // verify the required parameter 'campaignIds' is set
        if (campaignIds == null) {
            throw new ApiException("Missing the required parameter 'campaignIds' when calling openApi2StarOrderListByCampaignGet(Async)");
        }

        return openApi2StarOrderListByCampaignGetCall(starId, campaignIds, page, limit, _callback);

    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param campaignIds 需求ID (required)
     * @param page 分页页码 (optional, default to 1)
     * @param limit 页大小 (optional, default to 10)
     * @return StarOrderListByCampaignV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarOrderListByCampaignV2Response openApi2StarOrderListByCampaignGet(Long starId, List<Long> campaignIds, Integer page, Integer limit) throws ApiException {
        ApiResponse<StarOrderListByCampaignV2Response> localVarResp = openApi2StarOrderListByCampaignGetWithHttpInfo(starId, campaignIds, page, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 星图客户ID (required)
     * @param campaignIds 需求ID (required)
     * @param page 分页页码 (optional, default to 1)
     * @param limit 页大小 (optional, default to 10)
     * @return ApiResponse&lt;StarOrderListByCampaignV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarOrderListByCampaignV2Response> openApi2StarOrderListByCampaignGetWithHttpInfo(Long starId, List<Long> campaignIds, Integer page, Integer limit) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarOrderListByCampaignGetValidateBeforeCall(starId, campaignIds, page, limit, null);
        Type localVarReturnType = new TypeToken<StarOrderListByCampaignV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 星图客户ID (required)
     * @param campaignIds 需求ID (required)
     * @param page 分页页码 (optional, default to 1)
     * @param limit 页大小 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarOrderListByCampaignGetAsync(Long starId, List<Long> campaignIds, Integer page, Integer limit, final ApiCallback<StarOrderListByCampaignV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarOrderListByCampaignGetValidateBeforeCall(starId, campaignIds, page, limit, _callback);
        Type localVarReturnType = new TypeToken<StarOrderListByCampaignV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
