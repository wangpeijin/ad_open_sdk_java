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



import com.bytedance.ads.model.CgTransferQueryTransferBalanceV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferQueryTransferBalanceV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferQueryTransferBalanceV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferQueryTransferBalanceV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferQueryTransferBalanceGet
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountIdList 查询账户id列表 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferQueryTransferBalanceGetCall(String bizRequestNo, Long agentId, List<Long> accountIdList, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/query_transfer_balance/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (bizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_request_no", bizRequestNo));
        }

        if (agentId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agent_id", agentId));
        }

        if (accountIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "account_id_list", accountIdList));
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
    private okhttp3.Call openApiV30CgTransferQueryTransferBalanceGetValidateBeforeCall(String bizRequestNo, Long agentId, List<Long> accountIdList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferQueryTransferBalanceGet(Async)");
        }

        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApiV30CgTransferQueryTransferBalanceGet(Async)");
        }

        // verify the required parameter 'accountIdList' is set
        if (accountIdList == null) {
            throw new ApiException("Missing the required parameter 'accountIdList' when calling openApiV30CgTransferQueryTransferBalanceGet(Async)");
        }

        return openApiV30CgTransferQueryTransferBalanceGetCall(bizRequestNo, agentId, accountIdList, _callback);

    }

    /**
     * 
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountIdList 查询账户id列表 (required)
     * @return CgTransferQueryTransferBalanceV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferQueryTransferBalanceV30Response openApiV30CgTransferQueryTransferBalanceGet(String bizRequestNo, Long agentId, List<Long> accountIdList) throws ApiException {
        ApiResponse<CgTransferQueryTransferBalanceV30Response> localVarResp = openApiV30CgTransferQueryTransferBalanceGetWithHttpInfo(bizRequestNo, agentId, accountIdList);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountIdList 查询账户id列表 (required)
     * @return ApiResponse&lt;CgTransferQueryTransferBalanceV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferQueryTransferBalanceV30Response> openApiV30CgTransferQueryTransferBalanceGetWithHttpInfo(String bizRequestNo, Long agentId, List<Long> accountIdList) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferQueryTransferBalanceGetValidateBeforeCall(bizRequestNo, agentId, accountIdList, null);
        Type localVarReturnType = new TypeToken<CgTransferQueryTransferBalanceV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param agentId 代理商账户id，用于鉴权 (required)
     * @param accountIdList 查询账户id列表 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferQueryTransferBalanceGetAsync(String bizRequestNo, Long agentId, List<Long> accountIdList, final ApiCallback<CgTransferQueryTransferBalanceV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferQueryTransferBalanceGetValidateBeforeCall(bizRequestNo, agentId, accountIdList, _callback);
        Type localVarReturnType = new TypeToken<CgTransferQueryTransferBalanceV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
