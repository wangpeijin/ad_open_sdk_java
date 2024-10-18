/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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



import com.bytedance.ads.model.YuntuAudienceInfoGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class YuntuAudienceInfoGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public YuntuAudienceInfoGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public YuntuAudienceInfoGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30YuntuAudienceInfoGetGet
     * @param yuntuBrandId 品牌id (required)
     * @param serviceProviderId 服务商id (required)
     * @param advertiserId 广告主ID，即品牌虚拟adv_id (required)
     * @param customAudienceId 人群包ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30YuntuAudienceInfoGetGetCall(Long yuntuBrandId, Long serviceProviderId, Long advertiserId, Long customAudienceId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/yuntu/audience_info/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (yuntuBrandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("yuntu_brand_id", yuntuBrandId));
        }

        if (serviceProviderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("service_provider_id", serviceProviderId));
        }

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (customAudienceId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("custom_audience_id", customAudienceId));
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
    private okhttp3.Call openApiV30YuntuAudienceInfoGetGetValidateBeforeCall(Long yuntuBrandId, Long serviceProviderId, Long advertiserId, Long customAudienceId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'yuntuBrandId' is set
        if (yuntuBrandId == null) {
            throw new ApiException("Missing the required parameter 'yuntuBrandId' when calling openApiV30YuntuAudienceInfoGetGet(Async)");
        }

        // verify the required parameter 'serviceProviderId' is set
        if (serviceProviderId == null) {
            throw new ApiException("Missing the required parameter 'serviceProviderId' when calling openApiV30YuntuAudienceInfoGetGet(Async)");
        }

        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30YuntuAudienceInfoGetGet(Async)");
        }

        // verify the required parameter 'customAudienceId' is set
        if (customAudienceId == null) {
            throw new ApiException("Missing the required parameter 'customAudienceId' when calling openApiV30YuntuAudienceInfoGetGet(Async)");
        }

        return openApiV30YuntuAudienceInfoGetGetCall(yuntuBrandId, serviceProviderId, advertiserId, customAudienceId, _callback);

    }

    /**
     * 
     * 
     * @param yuntuBrandId 品牌id (required)
     * @param serviceProviderId 服务商id (required)
     * @param advertiserId 广告主ID，即品牌虚拟adv_id (required)
     * @param customAudienceId 人群包ID (required)
     * @return YuntuAudienceInfoGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public YuntuAudienceInfoGetV30Response openApiV30YuntuAudienceInfoGetGet(Long yuntuBrandId, Long serviceProviderId, Long advertiserId, Long customAudienceId) throws ApiException {
        ApiResponse<YuntuAudienceInfoGetV30Response> localVarResp = openApiV30YuntuAudienceInfoGetGetWithHttpInfo(yuntuBrandId, serviceProviderId, advertiserId, customAudienceId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param yuntuBrandId 品牌id (required)
     * @param serviceProviderId 服务商id (required)
     * @param advertiserId 广告主ID，即品牌虚拟adv_id (required)
     * @param customAudienceId 人群包ID (required)
     * @return ApiResponse&lt;YuntuAudienceInfoGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<YuntuAudienceInfoGetV30Response> openApiV30YuntuAudienceInfoGetGetWithHttpInfo(Long yuntuBrandId, Long serviceProviderId, Long advertiserId, Long customAudienceId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30YuntuAudienceInfoGetGetValidateBeforeCall(yuntuBrandId, serviceProviderId, advertiserId, customAudienceId, null);
        Type localVarReturnType = new TypeToken<YuntuAudienceInfoGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param yuntuBrandId 品牌id (required)
     * @param serviceProviderId 服务商id (required)
     * @param advertiserId 广告主ID，即品牌虚拟adv_id (required)
     * @param customAudienceId 人群包ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30YuntuAudienceInfoGetGetAsync(Long yuntuBrandId, Long serviceProviderId, Long advertiserId, Long customAudienceId, final ApiCallback<YuntuAudienceInfoGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30YuntuAudienceInfoGetGetValidateBeforeCall(yuntuBrandId, serviceProviderId, advertiserId, customAudienceId, _callback);
        Type localVarReturnType = new TypeToken<YuntuAudienceInfoGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
