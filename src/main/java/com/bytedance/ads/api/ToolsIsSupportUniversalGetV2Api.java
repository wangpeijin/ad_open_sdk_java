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



import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2DeepBidType;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2DeepExternalAction;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2ExternalAction;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2LandingType;
import com.bytedance.ads.model.ToolsIsSupportUniversalGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsIsSupportUniversalGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsIsSupportUniversalGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsIsSupportUniversalGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsIsSupportUniversalGetGet
     * @param advertiserId 广告主id (required)
     * @param landingType 广告组推广目的, 详见【附录-推广目的类型】&lt;br&gt;允许值: &#x60;LINK&#x60;、&#x60;APP&#x60;、&#x60;QUICK_APP&#x60;、&#x60;DPA&#x60;、&#x60;GOODS&#x60;、&#x60;SHOP&#x60;、&#x60;AWEME&#x60;、&#x60;LIVE&#x60; (required)
     * @param externalAction 优化目标，可通过【获取优化目标】接口获取 (required)
     * @param deepExternalAction 深度转化目标，可通过【获取优化目标】接口获取 (optional)
     * @param deepBidType 深度优化方式，允许值详见【附录-深度优化方式】，对于每次付费的转化，深度优化类型需要设置为BID_PER_ACTION（每次付费出价） (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsIsSupportUniversalGetGetCall(Long advertiserId, ToolsIsSupportUniversalGetV2LandingType landingType, ToolsIsSupportUniversalGetV2ExternalAction externalAction, ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction, ToolsIsSupportUniversalGetV2DeepBidType deepBidType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/is_support_universal/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (deepExternalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_external_action", deepExternalAction));
        }

        if (deepBidType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("deep_bid_type", deepBidType));
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
    private okhttp3.Call openApi2ToolsIsSupportUniversalGetGetValidateBeforeCall(Long advertiserId, ToolsIsSupportUniversalGetV2LandingType landingType, ToolsIsSupportUniversalGetV2ExternalAction externalAction, ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction, ToolsIsSupportUniversalGetV2DeepBidType deepBidType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsIsSupportUniversalGetGet(Async)");
        }

        // verify the required parameter 'landingType' is set
        if (landingType == null) {
            throw new ApiException("Missing the required parameter 'landingType' when calling openApi2ToolsIsSupportUniversalGetGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApi2ToolsIsSupportUniversalGetGet(Async)");
        }

        return openApi2ToolsIsSupportUniversalGetGetCall(advertiserId, landingType, externalAction, deepExternalAction, deepBidType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 广告组推广目的, 详见【附录-推广目的类型】&lt;br&gt;允许值: &#x60;LINK&#x60;、&#x60;APP&#x60;、&#x60;QUICK_APP&#x60;、&#x60;DPA&#x60;、&#x60;GOODS&#x60;、&#x60;SHOP&#x60;、&#x60;AWEME&#x60;、&#x60;LIVE&#x60; (required)
     * @param externalAction 优化目标，可通过【获取优化目标】接口获取 (required)
     * @param deepExternalAction 深度转化目标，可通过【获取优化目标】接口获取 (optional)
     * @param deepBidType 深度优化方式，允许值详见【附录-深度优化方式】，对于每次付费的转化，深度优化类型需要设置为BID_PER_ACTION（每次付费出价） (optional)
     * @return ToolsIsSupportUniversalGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsIsSupportUniversalGetV2Response openApi2ToolsIsSupportUniversalGetGet(Long advertiserId, ToolsIsSupportUniversalGetV2LandingType landingType, ToolsIsSupportUniversalGetV2ExternalAction externalAction, ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction, ToolsIsSupportUniversalGetV2DeepBidType deepBidType) throws ApiException {
        ApiResponse<ToolsIsSupportUniversalGetV2Response> localVarResp = openApi2ToolsIsSupportUniversalGetGetWithHttpInfo(advertiserId, landingType, externalAction, deepExternalAction, deepBidType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 广告组推广目的, 详见【附录-推广目的类型】&lt;br&gt;允许值: &#x60;LINK&#x60;、&#x60;APP&#x60;、&#x60;QUICK_APP&#x60;、&#x60;DPA&#x60;、&#x60;GOODS&#x60;、&#x60;SHOP&#x60;、&#x60;AWEME&#x60;、&#x60;LIVE&#x60; (required)
     * @param externalAction 优化目标，可通过【获取优化目标】接口获取 (required)
     * @param deepExternalAction 深度转化目标，可通过【获取优化目标】接口获取 (optional)
     * @param deepBidType 深度优化方式，允许值详见【附录-深度优化方式】，对于每次付费的转化，深度优化类型需要设置为BID_PER_ACTION（每次付费出价） (optional)
     * @return ApiResponse&lt;ToolsIsSupportUniversalGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsIsSupportUniversalGetV2Response> openApi2ToolsIsSupportUniversalGetGetWithHttpInfo(Long advertiserId, ToolsIsSupportUniversalGetV2LandingType landingType, ToolsIsSupportUniversalGetV2ExternalAction externalAction, ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction, ToolsIsSupportUniversalGetV2DeepBidType deepBidType) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsIsSupportUniversalGetGetValidateBeforeCall(advertiserId, landingType, externalAction, deepExternalAction, deepBidType, null);
        Type localVarReturnType = new TypeToken<ToolsIsSupportUniversalGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param landingType 广告组推广目的, 详见【附录-推广目的类型】&lt;br&gt;允许值: &#x60;LINK&#x60;、&#x60;APP&#x60;、&#x60;QUICK_APP&#x60;、&#x60;DPA&#x60;、&#x60;GOODS&#x60;、&#x60;SHOP&#x60;、&#x60;AWEME&#x60;、&#x60;LIVE&#x60; (required)
     * @param externalAction 优化目标，可通过【获取优化目标】接口获取 (required)
     * @param deepExternalAction 深度转化目标，可通过【获取优化目标】接口获取 (optional)
     * @param deepBidType 深度优化方式，允许值详见【附录-深度优化方式】，对于每次付费的转化，深度优化类型需要设置为BID_PER_ACTION（每次付费出价） (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsIsSupportUniversalGetGetAsync(Long advertiserId, ToolsIsSupportUniversalGetV2LandingType landingType, ToolsIsSupportUniversalGetV2ExternalAction externalAction, ToolsIsSupportUniversalGetV2DeepExternalAction deepExternalAction, ToolsIsSupportUniversalGetV2DeepBidType deepBidType, final ApiCallback<ToolsIsSupportUniversalGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsIsSupportUniversalGetGetValidateBeforeCall(advertiserId, landingType, externalAction, deepExternalAction, deepBidType, _callback);
        Type localVarReturnType = new TypeToken<ToolsIsSupportUniversalGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
