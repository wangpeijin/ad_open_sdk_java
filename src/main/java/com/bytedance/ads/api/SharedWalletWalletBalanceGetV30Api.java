/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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



import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30AccountType;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30Response;
import com.bytedance.ads.model.SharedWalletWalletBalanceGetV30WalletBalanceFilters;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedWalletWalletBalanceGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SharedWalletWalletBalanceGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedWalletWalletBalanceGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30SharedWalletWalletBalanceGetGet
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param walletBalanceFilters 余额过滤条件 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletWalletBalanceGetGetCall(Long accountId, SharedWalletWalletBalanceGetV30AccountType accountType, List<Long> walletIdList, SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/shared_wallet/wallet_balance/get/";

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

        if (walletIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "wallet_id_list", walletIdList));
        }

        if (walletBalanceFilters != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("wallet_balance_filters", walletBalanceFilters));
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
    private okhttp3.Call openApiV30SharedWalletWalletBalanceGetGetValidateBeforeCall(Long accountId, SharedWalletWalletBalanceGetV30AccountType accountType, List<Long> walletIdList, SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30SharedWalletWalletBalanceGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30SharedWalletWalletBalanceGetGet(Async)");
        }

        // verify the required parameter 'walletIdList' is set
        if (walletIdList == null) {
            throw new ApiException("Missing the required parameter 'walletIdList' when calling openApiV30SharedWalletWalletBalanceGetGet(Async)");
        }

        return openApiV30SharedWalletWalletBalanceGetGetCall(accountId, accountType, walletIdList, walletBalanceFilters, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param walletBalanceFilters 余额过滤条件 (optional)
     * @return SharedWalletWalletBalanceGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SharedWalletWalletBalanceGetV30Response openApiV30SharedWalletWalletBalanceGetGet(Long accountId, SharedWalletWalletBalanceGetV30AccountType accountType, List<Long> walletIdList, SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters) throws ApiException {
        ApiResponse<SharedWalletWalletBalanceGetV30Response> localVarResp = openApiV30SharedWalletWalletBalanceGetGetWithHttpInfo(accountId, accountType, walletIdList, walletBalanceFilters);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param walletBalanceFilters 余额过滤条件 (optional)
     * @return ApiResponse&lt;SharedWalletWalletBalanceGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SharedWalletWalletBalanceGetV30Response> openApiV30SharedWalletWalletBalanceGetGetWithHttpInfo(Long accountId, SharedWalletWalletBalanceGetV30AccountType accountType, List<Long> walletIdList, SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters) throws ApiException {
        okhttp3.Call localVarCall = openApiV30SharedWalletWalletBalanceGetGetValidateBeforeCall(accountId, accountType, walletIdList, walletBalanceFilters, null);
        Type localVarReturnType = new TypeToken<SharedWalletWalletBalanceGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param walletIdList 资金共享钱包id列表，注意：传入的列表长度不可大于200 (required)
     * @param walletBalanceFilters 余额过滤条件 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletWalletBalanceGetGetAsync(Long accountId, SharedWalletWalletBalanceGetV30AccountType accountType, List<Long> walletIdList, SharedWalletWalletBalanceGetV30WalletBalanceFilters walletBalanceFilters, final ApiCallback<SharedWalletWalletBalanceGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30SharedWalletWalletBalanceGetGetValidateBeforeCall(accountId, accountType, walletIdList, walletBalanceFilters, _callback);
        Type localVarReturnType = new TypeToken<SharedWalletWalletBalanceGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
