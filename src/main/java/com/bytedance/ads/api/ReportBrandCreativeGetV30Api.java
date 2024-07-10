/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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



import com.bytedance.ads.model.ReportBrandCreativeGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportBrandCreativeGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportBrandCreativeGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportBrandCreativeGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ReportBrandCreativeGetGet
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认最大为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param creativeIds 创意ID 默认每次请求最多100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandCreativeGetGetCall(Long advertiserId, Long page, Long size, Long landingType, Long pricingType, List<String> creativeIds, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/report/brand/creative/get/";

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

        if (pricingType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pricing_type", pricingType));
        }

        if (creativeIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "creative_ids", creativeIds));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (size != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("size", size));
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
    private okhttp3.Call openApiV30ReportBrandCreativeGetGetValidateBeforeCall(Long advertiserId, Long page, Long size, Long landingType, Long pricingType, List<String> creativeIds, String startTime, String endTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ReportBrandCreativeGetGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApiV30ReportBrandCreativeGetGet(Async)");
        }

        // verify the required parameter 'size' is set
        if (size == null) {
            throw new ApiException("Missing the required parameter 'size' when calling openApiV30ReportBrandCreativeGetGet(Async)");
        }

        return openApiV30ReportBrandCreativeGetGetCall(advertiserId, page, size, landingType, pricingType, creativeIds, startTime, endTime, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认最大为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param creativeIds 创意ID 默认每次请求最多100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @return ReportBrandCreativeGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportBrandCreativeGetV30Response openApiV30ReportBrandCreativeGetGet(Long advertiserId, Long page, Long size, Long landingType, Long pricingType, List<String> creativeIds, String startTime, String endTime) throws ApiException {
        ApiResponse<ReportBrandCreativeGetV30Response> localVarResp = openApiV30ReportBrandCreativeGetGetWithHttpInfo(advertiserId, page, size, landingType, pricingType, creativeIds, startTime, endTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认最大为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param creativeIds 创意ID 默认每次请求最多100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @return ApiResponse&lt;ReportBrandCreativeGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportBrandCreativeGetV30Response> openApiV30ReportBrandCreativeGetGetWithHttpInfo(Long advertiserId, Long page, Long size, Long landingType, Long pricingType, List<String> creativeIds, String startTime, String endTime) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ReportBrandCreativeGetGetValidateBeforeCall(advertiserId, page, size, landingType, pricingType, creativeIds, startTime, endTime, null);
        Type localVarReturnType = new TypeToken<ReportBrandCreativeGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param page 分页参数 默认从1开始 (required)
     * @param size 分页参数 默认最大为100 (required)
     * @param landingType 推广目的 (optional)
     * @param pricingType 计费类型 (optional)
     * @param creativeIds 创意ID 默认每次请求最多100个 (optional)
     * @param startTime 开始时间 格式2023-01-01 (optional)
     * @param endTime 结束时间 格式2023-01-01 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ReportBrandCreativeGetGetAsync(Long advertiserId, Long page, Long size, Long landingType, Long pricingType, List<String> creativeIds, String startTime, String endTime, final ApiCallback<ReportBrandCreativeGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ReportBrandCreativeGetGetValidateBeforeCall(advertiserId, page, size, landingType, pricingType, creativeIds, startTime, endTime, _callback);
        Type localVarReturnType = new TypeToken<ReportBrandCreativeGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
