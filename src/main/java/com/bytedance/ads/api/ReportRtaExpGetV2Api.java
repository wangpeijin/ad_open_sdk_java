/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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



import com.bytedance.ads.model.ReportRtaExpGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReportRtaExpGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ReportRtaExpGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportRtaExpGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ReportRtaExpGetGet
     * @param advertiserId 广告主ID (required)
     * @param rtaId RTA ID (required)
     * @param startDate 开始时间，格式YYYYMMDD，示例：20220701 (required)
     * @param endDate 结束时间，格式YYYYMMDD，示例：20220701 (required)
     * @param strategy 联合实验策略。允许值：0 代表基线策略 ，传入1、2、3、4、5、6、7、8、9 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRtaExpGetGetCall(Long advertiserId, Long rtaId, String startDate, String endDate, Long strategy, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/report/rta_exp/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (rtaId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("rta_id", rtaId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (strategy != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("strategy", strategy));
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
    private okhttp3.Call openApi2ReportRtaExpGetGetValidateBeforeCall(Long advertiserId, Long rtaId, String startDate, String endDate, Long strategy, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ReportRtaExpGetGet(Async)");
        }

        // verify the required parameter 'rtaId' is set
        if (rtaId == null) {
            throw new ApiException("Missing the required parameter 'rtaId' when calling openApi2ReportRtaExpGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApi2ReportRtaExpGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApi2ReportRtaExpGetGet(Async)");
        }

        // verify the required parameter 'strategy' is set
        if (strategy == null) {
            throw new ApiException("Missing the required parameter 'strategy' when calling openApi2ReportRtaExpGetGet(Async)");
        }

        return openApi2ReportRtaExpGetGetCall(advertiserId, rtaId, startDate, endDate, strategy, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param rtaId RTA ID (required)
     * @param startDate 开始时间，格式YYYYMMDD，示例：20220701 (required)
     * @param endDate 结束时间，格式YYYYMMDD，示例：20220701 (required)
     * @param strategy 联合实验策略。允许值：0 代表基线策略 ，传入1、2、3、4、5、6、7、8、9 (required)
     * @return ReportRtaExpGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ReportRtaExpGetV2Response openApi2ReportRtaExpGetGet(Long advertiserId, Long rtaId, String startDate, String endDate, Long strategy) throws ApiException {
        ApiResponse<ReportRtaExpGetV2Response> localVarResp = openApi2ReportRtaExpGetGetWithHttpInfo(advertiserId, rtaId, startDate, endDate, strategy);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param rtaId RTA ID (required)
     * @param startDate 开始时间，格式YYYYMMDD，示例：20220701 (required)
     * @param endDate 结束时间，格式YYYYMMDD，示例：20220701 (required)
     * @param strategy 联合实验策略。允许值：0 代表基线策略 ，传入1、2、3、4、5、6、7、8、9 (required)
     * @return ApiResponse&lt;ReportRtaExpGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ReportRtaExpGetV2Response> openApi2ReportRtaExpGetGetWithHttpInfo(Long advertiserId, Long rtaId, String startDate, String endDate, Long strategy) throws ApiException {
        okhttp3.Call localVarCall = openApi2ReportRtaExpGetGetValidateBeforeCall(advertiserId, rtaId, startDate, endDate, strategy, null);
        Type localVarReturnType = new TypeToken<ReportRtaExpGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param rtaId RTA ID (required)
     * @param startDate 开始时间，格式YYYYMMDD，示例：20220701 (required)
     * @param endDate 结束时间，格式YYYYMMDD，示例：20220701 (required)
     * @param strategy 联合实验策略。允许值：0 代表基线策略 ，传入1、2、3、4、5、6、7、8、9 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ReportRtaExpGetGetAsync(Long advertiserId, Long rtaId, String startDate, String endDate, Long strategy, final ApiCallback<ReportRtaExpGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ReportRtaExpGetGetValidateBeforeCall(advertiserId, rtaId, startDate, endDate, strategy, _callback);
        Type localVarReturnType = new TypeToken<ReportRtaExpGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
