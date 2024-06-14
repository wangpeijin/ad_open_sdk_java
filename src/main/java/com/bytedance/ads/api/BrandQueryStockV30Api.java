/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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



import com.bytedance.ads.model.BrandQueryStockV30AdForm;
import com.bytedance.ads.model.BrandQueryStockV30AppOrigin;
import com.bytedance.ads.model.BrandQueryStockV30AudienceInfo;
import com.bytedance.ads.model.BrandQueryStockV30Classify;
import com.bytedance.ads.model.BrandQueryStockV30GdSendType;
import com.bytedance.ads.model.BrandQueryStockV30LandingType;
import com.bytedance.ads.model.BrandQueryStockV30Response;
import com.bytedance.ads.model.BrandQueryStockV30ScheduleInfo;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BrandQueryStockV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public BrandQueryStockV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public BrandQueryStockV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30BrandQueryStockGet
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param landingType 推广目的 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param adForm 版位 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param scheduleInfo 日期 (required)
     * @param audienceInfo 定向 (optional)
     * @param merchantIntentionNo 招商意向单ID (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandQueryStockGetCall(Long advertiserId, BrandQueryStockV30Classify classify, BrandQueryStockV30LandingType landingType, BrandQueryStockV30AppOrigin appOrigin, BrandQueryStockV30AdForm adForm, BrandQueryStockV30GdSendType gdSendType, String policyNo, BrandQueryStockV30ScheduleInfo scheduleInfo, BrandQueryStockV30AudienceInfo audienceInfo, String merchantIntentionNo, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/brand/query_stock/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (classify != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("classify", classify));
        }

        if (landingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("landing_type", landingType));
        }

        if (appOrigin != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("app_origin", appOrigin));
        }

        if (adForm != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("ad_form", adForm));
        }

        if (gdSendType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("gd_send_type", gdSendType));
        }

        if (audienceInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("audience_info", audienceInfo));
        }

        if (policyNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("policy_no", policyNo));
        }

        if (scheduleInfo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("schedule_info", scheduleInfo));
        }

        if (merchantIntentionNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("merchant_intention_no", merchantIntentionNo));
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
    private okhttp3.Call openApiV30BrandQueryStockGetValidateBeforeCall(Long advertiserId, BrandQueryStockV30Classify classify, BrandQueryStockV30LandingType landingType, BrandQueryStockV30AppOrigin appOrigin, BrandQueryStockV30AdForm adForm, BrandQueryStockV30GdSendType gdSendType, String policyNo, BrandQueryStockV30ScheduleInfo scheduleInfo, BrandQueryStockV30AudienceInfo audienceInfo, String merchantIntentionNo, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'classify' is set
        if (classify == null) {
            throw new ApiException("Missing the required parameter 'classify' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'landingType' is set
        if (landingType == null) {
            throw new ApiException("Missing the required parameter 'landingType' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'appOrigin' is set
        if (appOrigin == null) {
            throw new ApiException("Missing the required parameter 'appOrigin' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'adForm' is set
        if (adForm == null) {
            throw new ApiException("Missing the required parameter 'adForm' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'gdSendType' is set
        if (gdSendType == null) {
            throw new ApiException("Missing the required parameter 'gdSendType' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'policyNo' is set
        if (policyNo == null) {
            throw new ApiException("Missing the required parameter 'policyNo' when calling openApiV30BrandQueryStockGet(Async)");
        }

        // verify the required parameter 'scheduleInfo' is set
        if (scheduleInfo == null) {
            throw new ApiException("Missing the required parameter 'scheduleInfo' when calling openApiV30BrandQueryStockGet(Async)");
        }

        return openApiV30BrandQueryStockGetCall(advertiserId, classify, landingType, appOrigin, adForm, gdSendType, policyNo, scheduleInfo, audienceInfo, merchantIntentionNo, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param landingType 推广目的 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param adForm 版位 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param scheduleInfo 日期 (required)
     * @param audienceInfo 定向 (optional)
     * @param merchantIntentionNo 招商意向单ID (optional)
     * @return BrandQueryStockV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public BrandQueryStockV30Response openApiV30BrandQueryStockGet(Long advertiserId, BrandQueryStockV30Classify classify, BrandQueryStockV30LandingType landingType, BrandQueryStockV30AppOrigin appOrigin, BrandQueryStockV30AdForm adForm, BrandQueryStockV30GdSendType gdSendType, String policyNo, BrandQueryStockV30ScheduleInfo scheduleInfo, BrandQueryStockV30AudienceInfo audienceInfo, String merchantIntentionNo) throws ApiException {
        ApiResponse<BrandQueryStockV30Response> localVarResp = openApiV30BrandQueryStockGetWithHttpInfo(advertiserId, classify, landingType, appOrigin, adForm, gdSendType, policyNo, scheduleInfo, audienceInfo, merchantIntentionNo);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param landingType 推广目的 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param adForm 版位 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param scheduleInfo 日期 (required)
     * @param audienceInfo 定向 (optional)
     * @param merchantIntentionNo 招商意向单ID (optional)
     * @return ApiResponse&lt;BrandQueryStockV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<BrandQueryStockV30Response> openApiV30BrandQueryStockGetWithHttpInfo(Long advertiserId, BrandQueryStockV30Classify classify, BrandQueryStockV30LandingType landingType, BrandQueryStockV30AppOrigin appOrigin, BrandQueryStockV30AdForm adForm, BrandQueryStockV30GdSendType gdSendType, String policyNo, BrandQueryStockV30ScheduleInfo scheduleInfo, BrandQueryStockV30AudienceInfo audienceInfo, String merchantIntentionNo) throws ApiException {
        okhttp3.Call localVarCall = openApiV30BrandQueryStockGetValidateBeforeCall(advertiserId, classify, landingType, appOrigin, adForm, gdSendType, policyNo, scheduleInfo, audienceInfo, merchantIntentionNo, null);
        Type localVarReturnType = new TypeToken<BrandQueryStockV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param classify 广告类别 (required)
     * @param landingType 推广目的 (required)
     * @param appOrigin 投放位置（媒体端） (required)
     * @param adForm 版位 (required)
     * @param gdSendType 优化目标 (required)
     * @param policyNo 政策编号 (required)
     * @param scheduleInfo 日期 (required)
     * @param audienceInfo 定向 (optional)
     * @param merchantIntentionNo 招商意向单ID (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30BrandQueryStockGetAsync(Long advertiserId, BrandQueryStockV30Classify classify, BrandQueryStockV30LandingType landingType, BrandQueryStockV30AppOrigin appOrigin, BrandQueryStockV30AdForm adForm, BrandQueryStockV30GdSendType gdSendType, String policyNo, BrandQueryStockV30ScheduleInfo scheduleInfo, BrandQueryStockV30AudienceInfo audienceInfo, String merchantIntentionNo, final ApiCallback<BrandQueryStockV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30BrandQueryStockGetValidateBeforeCall(advertiserId, classify, landingType, appOrigin, adForm, gdSendType, policyNo, scheduleInfo, audienceInfo, merchantIntentionNo, _callback);
        Type localVarReturnType = new TypeToken<BrandQueryStockV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
