/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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



import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10CampaignScene;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10DeepBidType;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10DeepExternalAction;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10EcomGuestType;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10ExternalAction;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10MarketingGoal;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10MarketingScene;
import com.bytedance.ads.model.QianchuanSuggestRoiGoalV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanSuggestRoiGoalV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanSuggestRoiGoalV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanSuggestRoiGoalV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanSuggestRoiGoalGet
     * @param advertiserId 广告主ID (required)
     * @param awemeId 抖音id (optional, default to 0)
     * @param marketingScene 营销场景 (optional)
     * @param marketingGoal MarGoal (optional)
     * @param productId 商品ID (optional)
     * @param productNewOpen 是否开启新品加速 (optional)
     * @param externalAction  (optional)
     * @param campaignScene  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param ecomGuestType  (optional)
     * @param shopId  (optional, default to 0)
     * @param brandId  (optional, default to 0)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanSuggestRoiGoalGetCall(Long advertiserId, Long awemeId, QianchuanSuggestRoiGoalV10MarketingScene marketingScene, QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal, Long productId, Boolean productNewOpen, QianchuanSuggestRoiGoalV10ExternalAction externalAction, QianchuanSuggestRoiGoalV10CampaignScene campaignScene, QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction, QianchuanSuggestRoiGoalV10DeepBidType deepBidType, QianchuanSuggestRoiGoalV10EcomGuestType ecomGuestType, Long shopId, Long brandId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/suggest/roi/goal/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (marketingScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_scene", marketingScene));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (productId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_id", productId));
        }

        if (productNewOpen != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_new_open", productNewOpen));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (campaignScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("campaign_scene", campaignScene));
        }

        if (deepExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_external_action", deepExternalAction));
        }

        if (deepBidType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_bid_type", deepBidType));
        }

        if (ecomGuestType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ecom_guest_type", ecomGuestType));
        }

        if (shopId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shop_id", shopId));
        }

        if (brandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("brand_id", brandId));
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
    private okhttp3.Call openApiV10QianchuanSuggestRoiGoalGetValidateBeforeCall(Long advertiserId, Long awemeId, QianchuanSuggestRoiGoalV10MarketingScene marketingScene, QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal, Long productId, Boolean productNewOpen, QianchuanSuggestRoiGoalV10ExternalAction externalAction, QianchuanSuggestRoiGoalV10CampaignScene campaignScene, QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction, QianchuanSuggestRoiGoalV10DeepBidType deepBidType, QianchuanSuggestRoiGoalV10EcomGuestType ecomGuestType, Long shopId, Long brandId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanSuggestRoiGoalGet(Async)");
        }

        return openApiV10QianchuanSuggestRoiGoalGetCall(advertiserId, awemeId, marketingScene, marketingGoal, productId, productNewOpen, externalAction, campaignScene, deepExternalAction, deepBidType, ecomGuestType, shopId, brandId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param awemeId 抖音id (optional, default to 0)
     * @param marketingScene 营销场景 (optional)
     * @param marketingGoal MarGoal (optional)
     * @param productId 商品ID (optional)
     * @param productNewOpen 是否开启新品加速 (optional)
     * @param externalAction  (optional)
     * @param campaignScene  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param ecomGuestType  (optional)
     * @param shopId  (optional, default to 0)
     * @param brandId  (optional, default to 0)
     * @return QianchuanSuggestRoiGoalV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanSuggestRoiGoalV10Response openApiV10QianchuanSuggestRoiGoalGet(Long advertiserId, Long awemeId, QianchuanSuggestRoiGoalV10MarketingScene marketingScene, QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal, Long productId, Boolean productNewOpen, QianchuanSuggestRoiGoalV10ExternalAction externalAction, QianchuanSuggestRoiGoalV10CampaignScene campaignScene, QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction, QianchuanSuggestRoiGoalV10DeepBidType deepBidType, QianchuanSuggestRoiGoalV10EcomGuestType ecomGuestType, Long shopId, Long brandId) throws ApiException {
        ApiResponse<QianchuanSuggestRoiGoalV10Response> localVarResp = openApiV10QianchuanSuggestRoiGoalGetWithHttpInfo(advertiserId, awemeId, marketingScene, marketingGoal, productId, productNewOpen, externalAction, campaignScene, deepExternalAction, deepBidType, ecomGuestType, shopId, brandId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param awemeId 抖音id (optional, default to 0)
     * @param marketingScene 营销场景 (optional)
     * @param marketingGoal MarGoal (optional)
     * @param productId 商品ID (optional)
     * @param productNewOpen 是否开启新品加速 (optional)
     * @param externalAction  (optional)
     * @param campaignScene  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param ecomGuestType  (optional)
     * @param shopId  (optional, default to 0)
     * @param brandId  (optional, default to 0)
     * @return ApiResponse&lt;QianchuanSuggestRoiGoalV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanSuggestRoiGoalV10Response> openApiV10QianchuanSuggestRoiGoalGetWithHttpInfo(Long advertiserId, Long awemeId, QianchuanSuggestRoiGoalV10MarketingScene marketingScene, QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal, Long productId, Boolean productNewOpen, QianchuanSuggestRoiGoalV10ExternalAction externalAction, QianchuanSuggestRoiGoalV10CampaignScene campaignScene, QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction, QianchuanSuggestRoiGoalV10DeepBidType deepBidType, QianchuanSuggestRoiGoalV10EcomGuestType ecomGuestType, Long shopId, Long brandId) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanSuggestRoiGoalGetValidateBeforeCall(advertiserId, awemeId, marketingScene, marketingGoal, productId, productNewOpen, externalAction, campaignScene, deepExternalAction, deepBidType, ecomGuestType, shopId, brandId, null);
        Type localVarReturnType = new TypeToken<QianchuanSuggestRoiGoalV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param awemeId 抖音id (optional, default to 0)
     * @param marketingScene 营销场景 (optional)
     * @param marketingGoal MarGoal (optional)
     * @param productId 商品ID (optional)
     * @param productNewOpen 是否开启新品加速 (optional)
     * @param externalAction  (optional)
     * @param campaignScene  (optional)
     * @param deepExternalAction  (optional)
     * @param deepBidType  (optional)
     * @param ecomGuestType  (optional)
     * @param shopId  (optional, default to 0)
     * @param brandId  (optional, default to 0)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanSuggestRoiGoalGetAsync(Long advertiserId, Long awemeId, QianchuanSuggestRoiGoalV10MarketingScene marketingScene, QianchuanSuggestRoiGoalV10MarketingGoal marketingGoal, Long productId, Boolean productNewOpen, QianchuanSuggestRoiGoalV10ExternalAction externalAction, QianchuanSuggestRoiGoalV10CampaignScene campaignScene, QianchuanSuggestRoiGoalV10DeepExternalAction deepExternalAction, QianchuanSuggestRoiGoalV10DeepBidType deepBidType, QianchuanSuggestRoiGoalV10EcomGuestType ecomGuestType, Long shopId, Long brandId, final ApiCallback<QianchuanSuggestRoiGoalV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanSuggestRoiGoalGetValidateBeforeCall(advertiserId, awemeId, marketingScene, marketingGoal, productId, productNewOpen, externalAction, campaignScene, deepExternalAction, deepBidType, ecomGuestType, shopId, brandId, _callback);
        Type localVarReturnType = new TypeToken<QianchuanSuggestRoiGoalV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
