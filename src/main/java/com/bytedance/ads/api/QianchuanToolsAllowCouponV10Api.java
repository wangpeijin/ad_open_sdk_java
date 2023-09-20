/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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



import com.bytedance.ads.model.QianchuanToolsAllowCouponV10CampaignScene;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10MarketingGoal;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10MarketingScene;
import com.bytedance.ads.model.QianchuanToolsAllowCouponV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanToolsAllowCouponV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanToolsAllowCouponV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanToolsAllowCouponV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanToolsAllowCouponGet
     * @param advertiserId  (required)
     * @param marketingGoal  (required)
     * @param campaignScene  (required)
     * @param marketingScene  (required)
     * @param awemeIds  (optional)
     * @param productIds  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsAllowCouponGetCall(Long advertiserId, QianchuanToolsAllowCouponV10MarketingGoal marketingGoal, QianchuanToolsAllowCouponV10CampaignScene campaignScene, QianchuanToolsAllowCouponV10MarketingScene marketingScene, List<Long> awemeIds, List<Long> productIds, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/tools/allow_coupon/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (campaignScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_scene", campaignScene));
        }

        if (marketingScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_scene", marketingScene));
        }

        if (awemeIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "aweme_ids", awemeIds));
        }

        if (productIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "product_ids", productIds));
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
    private okhttp3.Call openApiV10QianchuanToolsAllowCouponGetValidateBeforeCall(Long advertiserId, QianchuanToolsAllowCouponV10MarketingGoal marketingGoal, QianchuanToolsAllowCouponV10CampaignScene campaignScene, QianchuanToolsAllowCouponV10MarketingScene marketingScene, List<Long> awemeIds, List<Long> productIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanToolsAllowCouponGet(Async)");
        }

        // verify the required parameter 'marketingGoal' is set
        if (marketingGoal == null) {
            throw new ApiException("Missing the required parameter 'marketingGoal' when calling openApiV10QianchuanToolsAllowCouponGet(Async)");
        }

        // verify the required parameter 'campaignScene' is set
        if (campaignScene == null) {
            throw new ApiException("Missing the required parameter 'campaignScene' when calling openApiV10QianchuanToolsAllowCouponGet(Async)");
        }

        // verify the required parameter 'marketingScene' is set
        if (marketingScene == null) {
            throw new ApiException("Missing the required parameter 'marketingScene' when calling openApiV10QianchuanToolsAllowCouponGet(Async)");
        }

        return openApiV10QianchuanToolsAllowCouponGetCall(advertiserId, marketingGoal, campaignScene, marketingScene, awemeIds, productIds, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param marketingGoal  (required)
     * @param campaignScene  (required)
     * @param marketingScene  (required)
     * @param awemeIds  (optional)
     * @param productIds  (optional)
     * @return QianchuanToolsAllowCouponV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanToolsAllowCouponV10Response openApiV10QianchuanToolsAllowCouponGet(Long advertiserId, QianchuanToolsAllowCouponV10MarketingGoal marketingGoal, QianchuanToolsAllowCouponV10CampaignScene campaignScene, QianchuanToolsAllowCouponV10MarketingScene marketingScene, List<Long> awemeIds, List<Long> productIds) throws ApiException {
        ApiResponse<QianchuanToolsAllowCouponV10Response> localVarResp = openApiV10QianchuanToolsAllowCouponGetWithHttpInfo(advertiserId, marketingGoal, campaignScene, marketingScene, awemeIds, productIds);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param marketingGoal  (required)
     * @param campaignScene  (required)
     * @param marketingScene  (required)
     * @param awemeIds  (optional)
     * @param productIds  (optional)
     * @return ApiResponse&lt;QianchuanToolsAllowCouponV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanToolsAllowCouponV10Response> openApiV10QianchuanToolsAllowCouponGetWithHttpInfo(Long advertiserId, QianchuanToolsAllowCouponV10MarketingGoal marketingGoal, QianchuanToolsAllowCouponV10CampaignScene campaignScene, QianchuanToolsAllowCouponV10MarketingScene marketingScene, List<Long> awemeIds, List<Long> productIds) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanToolsAllowCouponGetValidateBeforeCall(advertiserId, marketingGoal, campaignScene, marketingScene, awemeIds, productIds, null);
        Type localVarReturnType = new TypeToken<QianchuanToolsAllowCouponV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param marketingGoal  (required)
     * @param campaignScene  (required)
     * @param marketingScene  (required)
     * @param awemeIds  (optional)
     * @param productIds  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsAllowCouponGetAsync(Long advertiserId, QianchuanToolsAllowCouponV10MarketingGoal marketingGoal, QianchuanToolsAllowCouponV10CampaignScene campaignScene, QianchuanToolsAllowCouponV10MarketingScene marketingScene, List<Long> awemeIds, List<Long> productIds, final ApiCallback<QianchuanToolsAllowCouponV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanToolsAllowCouponGetValidateBeforeCall(advertiserId, marketingGoal, campaignScene, marketingScene, awemeIds, productIds, _callback);
        Type localVarReturnType = new TypeToken<QianchuanToolsAllowCouponV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
