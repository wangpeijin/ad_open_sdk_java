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



import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30AssetType;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30CampaignType;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30LandingType;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30MarketingPurpose;
import com.bytedance.ads.model.ToolsEventConvertOptimizedGoalGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsEventConvertOptimizedGoalGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsEventConvertOptimizedGoalGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsEventConvertOptimizedGoalGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsEventConvertOptimizedGoalGetGet
     * @param landingType  (required)
     * @param marketingPurpose  (required)
     * @param assetType  (required)
     * @param advertiserId  (optional)
     * @param siteId  (optional)
     * @param miniProgramId  (optional)
     * @param assetId  (optional)
     * @param campaignType  (optional)
     * @param microAppInstanceId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsEventConvertOptimizedGoalGetGetCall(ToolsEventConvertOptimizedGoalGetV30LandingType landingType, ToolsEventConvertOptimizedGoalGetV30MarketingPurpose marketingPurpose, ToolsEventConvertOptimizedGoalGetV30AssetType assetType, Long advertiserId, Long siteId, String miniProgramId, Long assetId, ToolsEventConvertOptimizedGoalGetV30CampaignType campaignType, Long microAppInstanceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/event_convert/optimized_goal/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (siteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("site_id", siteId));
        }

        if (miniProgramId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mini_program_id", miniProgramId));
        }

        if (assetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_id", assetId));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (marketingPurpose != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_purpose", marketingPurpose));
        }

        if (assetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("asset_type", assetType));
        }

        if (campaignType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_type", campaignType));
        }

        if (microAppInstanceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("micro_app_instance_id", microAppInstanceId));
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
    private okhttp3.Call openApiV30ToolsEventConvertOptimizedGoalGetGetValidateBeforeCall(ToolsEventConvertOptimizedGoalGetV30LandingType landingType, ToolsEventConvertOptimizedGoalGetV30MarketingPurpose marketingPurpose, ToolsEventConvertOptimizedGoalGetV30AssetType assetType, Long advertiserId, Long siteId, String miniProgramId, Long assetId, ToolsEventConvertOptimizedGoalGetV30CampaignType campaignType, Long microAppInstanceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'landingType' is set
        if (landingType == null) {
            throw new ApiException("Missing the required parameter 'landingType' when calling openApiV30ToolsEventConvertOptimizedGoalGetGet(Async)");
        }

        // verify the required parameter 'marketingPurpose' is set
        if (marketingPurpose == null) {
            throw new ApiException("Missing the required parameter 'marketingPurpose' when calling openApiV30ToolsEventConvertOptimizedGoalGetGet(Async)");
        }

        // verify the required parameter 'assetType' is set
        if (assetType == null) {
            throw new ApiException("Missing the required parameter 'assetType' when calling openApiV30ToolsEventConvertOptimizedGoalGetGet(Async)");
        }

        return openApiV30ToolsEventConvertOptimizedGoalGetGetCall(landingType, marketingPurpose, assetType, advertiserId, siteId, miniProgramId, assetId, campaignType, microAppInstanceId, _callback);

    }

    /**
     * 
     * 
     * @param landingType  (required)
     * @param marketingPurpose  (required)
     * @param assetType  (required)
     * @param advertiserId  (optional)
     * @param siteId  (optional)
     * @param miniProgramId  (optional)
     * @param assetId  (optional)
     * @param campaignType  (optional)
     * @param microAppInstanceId  (optional)
     * @return ToolsEventConvertOptimizedGoalGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsEventConvertOptimizedGoalGetV30Response openApiV30ToolsEventConvertOptimizedGoalGetGet(ToolsEventConvertOptimizedGoalGetV30LandingType landingType, ToolsEventConvertOptimizedGoalGetV30MarketingPurpose marketingPurpose, ToolsEventConvertOptimizedGoalGetV30AssetType assetType, Long advertiserId, Long siteId, String miniProgramId, Long assetId, ToolsEventConvertOptimizedGoalGetV30CampaignType campaignType, Long microAppInstanceId) throws ApiException {
        ApiResponse<ToolsEventConvertOptimizedGoalGetV30Response> localVarResp = openApiV30ToolsEventConvertOptimizedGoalGetGetWithHttpInfo(landingType, marketingPurpose, assetType, advertiserId, siteId, miniProgramId, assetId, campaignType, microAppInstanceId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param landingType  (required)
     * @param marketingPurpose  (required)
     * @param assetType  (required)
     * @param advertiserId  (optional)
     * @param siteId  (optional)
     * @param miniProgramId  (optional)
     * @param assetId  (optional)
     * @param campaignType  (optional)
     * @param microAppInstanceId  (optional)
     * @return ApiResponse&lt;ToolsEventConvertOptimizedGoalGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsEventConvertOptimizedGoalGetV30Response> openApiV30ToolsEventConvertOptimizedGoalGetGetWithHttpInfo(ToolsEventConvertOptimizedGoalGetV30LandingType landingType, ToolsEventConvertOptimizedGoalGetV30MarketingPurpose marketingPurpose, ToolsEventConvertOptimizedGoalGetV30AssetType assetType, Long advertiserId, Long siteId, String miniProgramId, Long assetId, ToolsEventConvertOptimizedGoalGetV30CampaignType campaignType, Long microAppInstanceId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsEventConvertOptimizedGoalGetGetValidateBeforeCall(landingType, marketingPurpose, assetType, advertiserId, siteId, miniProgramId, assetId, campaignType, microAppInstanceId, null);
        Type localVarReturnType = new TypeToken<ToolsEventConvertOptimizedGoalGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param landingType  (required)
     * @param marketingPurpose  (required)
     * @param assetType  (required)
     * @param advertiserId  (optional)
     * @param siteId  (optional)
     * @param miniProgramId  (optional)
     * @param assetId  (optional)
     * @param campaignType  (optional)
     * @param microAppInstanceId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsEventConvertOptimizedGoalGetGetAsync(ToolsEventConvertOptimizedGoalGetV30LandingType landingType, ToolsEventConvertOptimizedGoalGetV30MarketingPurpose marketingPurpose, ToolsEventConvertOptimizedGoalGetV30AssetType assetType, Long advertiserId, Long siteId, String miniProgramId, Long assetId, ToolsEventConvertOptimizedGoalGetV30CampaignType campaignType, Long microAppInstanceId, final ApiCallback<ToolsEventConvertOptimizedGoalGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsEventConvertOptimizedGoalGetGetValidateBeforeCall(landingType, marketingPurpose, assetType, advertiserId, siteId, miniProgramId, assetId, campaignType, microAppInstanceId, _callback);
        Type localVarReturnType = new TypeToken<ToolsEventConvertOptimizedGoalGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
