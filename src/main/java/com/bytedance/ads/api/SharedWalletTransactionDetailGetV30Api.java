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



import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30AccountType;
import com.bytedance.ads.model.SharedWalletTransactionDetailGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedWalletTransactionDetailGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SharedWalletTransactionDetailGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedWalletTransactionDetailGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30SharedWalletTransactionDetailGetGet
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包ID (required)
     * @param startDate 开始时间，格式YYYY-MM-DD (required)
     * @param endDate 结束时间，格式YYYY-MM-DD (required)
     * @param page 页码；默认为1 (optional, default to 1)
     * @param pageSize 页面大小；默认为10; 注意：page*page_size不可大于10000 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletTransactionDetailGetGetCall(Long accountId, SharedWalletTransactionDetailGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/shared_wallet/transaction_detail/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (accountType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_type", accountType));
        }

        if (sharedWalletId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shared_wallet_id", sharedWalletId));
        }

        if (startDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_date", startDate));
        }

        if (endDate != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_date", endDate));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApiV30SharedWalletTransactionDetailGetGetValidateBeforeCall(Long accountId, SharedWalletTransactionDetailGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30SharedWalletTransactionDetailGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30SharedWalletTransactionDetailGetGet(Async)");
        }

        // verify the required parameter 'sharedWalletId' is set
        if (sharedWalletId == null) {
            throw new ApiException("Missing the required parameter 'sharedWalletId' when calling openApiV30SharedWalletTransactionDetailGetGet(Async)");
        }

        // verify the required parameter 'startDate' is set
        if (startDate == null) {
            throw new ApiException("Missing the required parameter 'startDate' when calling openApiV30SharedWalletTransactionDetailGetGet(Async)");
        }

        // verify the required parameter 'endDate' is set
        if (endDate == null) {
            throw new ApiException("Missing the required parameter 'endDate' when calling openApiV30SharedWalletTransactionDetailGetGet(Async)");
        }

        return openApiV30SharedWalletTransactionDetailGetGetCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包ID (required)
     * @param startDate 开始时间，格式YYYY-MM-DD (required)
     * @param endDate 结束时间，格式YYYY-MM-DD (required)
     * @param page 页码；默认为1 (optional, default to 1)
     * @param pageSize 页面大小；默认为10; 注意：page*page_size不可大于10000 (optional, default to 10)
     * @return SharedWalletTransactionDetailGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SharedWalletTransactionDetailGetV30Response openApiV30SharedWalletTransactionDetailGetGet(Long accountId, SharedWalletTransactionDetailGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize) throws ApiException {
        ApiResponse<SharedWalletTransactionDetailGetV30Response> localVarResp = openApiV30SharedWalletTransactionDetailGetGetWithHttpInfo(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包ID (required)
     * @param startDate 开始时间，格式YYYY-MM-DD (required)
     * @param endDate 结束时间，格式YYYY-MM-DD (required)
     * @param page 页码；默认为1 (optional, default to 1)
     * @param pageSize 页面大小；默认为10; 注意：page*page_size不可大于10000 (optional, default to 10)
     * @return ApiResponse&lt;SharedWalletTransactionDetailGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SharedWalletTransactionDetailGetV30Response> openApiV30SharedWalletTransactionDetailGetGetWithHttpInfo(Long accountId, SharedWalletTransactionDetailGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30SharedWalletTransactionDetailGetGetValidateBeforeCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, null);
        Type localVarReturnType = new TypeToken<SharedWalletTransactionDetailGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包ID (required)
     * @param startDate 开始时间，格式YYYY-MM-DD (required)
     * @param endDate 结束时间，格式YYYY-MM-DD (required)
     * @param page 页码；默认为1 (optional, default to 1)
     * @param pageSize 页面大小；默认为10; 注意：page*page_size不可大于10000 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletTransactionDetailGetGetAsync(Long accountId, SharedWalletTransactionDetailGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback<SharedWalletTransactionDetailGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30SharedWalletTransactionDetailGetGetValidateBeforeCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<SharedWalletTransactionDetailGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
