/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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



import com.bytedance.ads.model.AgentQueryRiskPromotionListV2BusinessType;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2Filtering;
import com.bytedance.ads.model.AgentQueryRiskPromotionListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AgentQueryRiskPromotionListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AgentQueryRiskPromotionListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AgentQueryRiskPromotionListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2AgentQueryRiskPromotionListGet
     * @param agentId 代理商账户ID (required)
     * @param businessType 业务线，默认AD业务线传-1 (required)
     * @param startDate 推送开始时间，比如：2024-03-01 (required)
     * @param endDate 推送结束时间，比如：2024-03-01（最长跨度31天） (required)
     * @param cursor 页码游标值，初始从Long.MAX开始，后续传入返回的cursor值，不传值相当于page&#x3D;1，查询count条数据 (optional)
     * @param count 页码游标值，最大支持500 (optional, default to 10)
     * @param filtering 过滤器 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2AgentQueryRiskPromotionListGetCall(Long agentId, AgentQueryRiskPromotionListV2BusinessType businessType, String startDate, String endDate, Long cursor, Integer count, AgentQueryRiskPromotionListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/agent/query/risk_promotion_list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (businessType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("business_type", businessType));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApi2AgentQueryRiskPromotionListGetValidateBeforeCall(Long agentId, AgentQueryRiskPromotionListV2BusinessType businessType, String startDate, String endDate, Long cursor, Integer count, AgentQueryRiskPromotionListV2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2AgentQueryRiskPromotionListGet(Async)");
        }

        // verify the required parameter 'businessType' is set
        if (businessType == null) {
            throw new ApiException("Missing the required parameter 'businessType' when calling openApi2AgentQueryRiskPromotionListGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApi2AgentQueryRiskPromotionListGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApi2AgentQueryRiskPromotionListGet(Async)");
        }

        return openApi2AgentQueryRiskPromotionListGetCall(agentId, businessType, startDate, endDate, cursor, count, filtering, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商账户ID (required)
     * @param businessType 业务线，默认AD业务线传-1 (required)
     * @param startDate 推送开始时间，比如：2024-03-01 (required)
     * @param endDate 推送结束时间，比如：2024-03-01（最长跨度31天） (required)
     * @param cursor 页码游标值，初始从Long.MAX开始，后续传入返回的cursor值，不传值相当于page&#x3D;1，查询count条数据 (optional)
     * @param count 页码游标值，最大支持500 (optional, default to 10)
     * @param filtering 过滤器 (optional)
     * @return AgentQueryRiskPromotionListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AgentQueryRiskPromotionListV2Response openApi2AgentQueryRiskPromotionListGet(Long agentId, AgentQueryRiskPromotionListV2BusinessType businessType, String startDate, String endDate, Long cursor, Integer count, AgentQueryRiskPromotionListV2Filtering filtering) throws ApiException {
        ApiResponse<AgentQueryRiskPromotionListV2Response> localVarResp = openApi2AgentQueryRiskPromotionListGetWithHttpInfo(agentId, businessType, startDate, endDate, cursor, count, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商账户ID (required)
     * @param businessType 业务线，默认AD业务线传-1 (required)
     * @param startDate 推送开始时间，比如：2024-03-01 (required)
     * @param endDate 推送结束时间，比如：2024-03-01（最长跨度31天） (required)
     * @param cursor 页码游标值，初始从Long.MAX开始，后续传入返回的cursor值，不传值相当于page&#x3D;1，查询count条数据 (optional)
     * @param count 页码游标值，最大支持500 (optional, default to 10)
     * @param filtering 过滤器 (optional)
     * @return ApiResponse&lt;AgentQueryRiskPromotionListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AgentQueryRiskPromotionListV2Response> openApi2AgentQueryRiskPromotionListGetWithHttpInfo(Long agentId, AgentQueryRiskPromotionListV2BusinessType businessType, String startDate, String endDate, Long cursor, Integer count, AgentQueryRiskPromotionListV2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2AgentQueryRiskPromotionListGetValidateBeforeCall(agentId, businessType, startDate, endDate, cursor, count, filtering, null);
        Type localVarReturnType = new TypeToken<AgentQueryRiskPromotionListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商账户ID (required)
     * @param businessType 业务线，默认AD业务线传-1 (required)
     * @param startDate 推送开始时间，比如：2024-03-01 (required)
     * @param endDate 推送结束时间，比如：2024-03-01（最长跨度31天） (required)
     * @param cursor 页码游标值，初始从Long.MAX开始，后续传入返回的cursor值，不传值相当于page&#x3D;1，查询count条数据 (optional)
     * @param count 页码游标值，最大支持500 (optional, default to 10)
     * @param filtering 过滤器 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2AgentQueryRiskPromotionListGetAsync(Long agentId, AgentQueryRiskPromotionListV2BusinessType businessType, String startDate, String endDate, Long cursor, Integer count, AgentQueryRiskPromotionListV2Filtering filtering, final ApiCallback<AgentQueryRiskPromotionListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2AgentQueryRiskPromotionListGetValidateBeforeCall(agentId, businessType, startDate, endDate, cursor, count, filtering, _callback);
        Type localVarReturnType = new TypeToken<AgentQueryRiskPromotionListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
