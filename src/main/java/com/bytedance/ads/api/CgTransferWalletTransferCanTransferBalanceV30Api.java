/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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



import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30AccountType;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30Response;
import com.bytedance.ads.model.CgTransferWalletTransferCanTransferBalanceV30TransferDirection;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CgTransferWalletTransferCanTransferBalanceV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CgTransferWalletTransferCanTransferBalanceV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CgTransferWalletTransferCanTransferBalanceV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30CgTransferWalletTransferCanTransferBalanceGet
     * @param accountId 鉴权账户 (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param mainWalletId 大钱包id (required)
     * @param subWalletList 小钱包id列表 (required)
     * @param transferDirection 转账方向，以小钱包视角确定 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferWalletTransferCanTransferBalanceGetCall(Long accountId, CgTransferWalletTransferCanTransferBalanceV30AccountType accountType, String bizRequestNo, Long mainWalletId, List<Long> subWalletList, CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/cg_transfer/wallet/transfer/can_transfer_balance/";

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

        if (bizRequestNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_request_no", bizRequestNo));
        }

        if (mainWalletId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("main_wallet_id", mainWalletId));
        }

        if (subWalletList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "sub_wallet_list", subWalletList));
        }

        if (transferDirection != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("transfer_direction", transferDirection));
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
    private okhttp3.Call openApiV30CgTransferWalletTransferCanTransferBalanceGetValidateBeforeCall(Long accountId, CgTransferWalletTransferCanTransferBalanceV30AccountType accountType, String bizRequestNo, Long mainWalletId, List<Long> subWalletList, CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'bizRequestNo' is set
        if (bizRequestNo == null) {
            throw new ApiException("Missing the required parameter 'bizRequestNo' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'mainWalletId' is set
        if (mainWalletId == null) {
            throw new ApiException("Missing the required parameter 'mainWalletId' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'subWalletList' is set
        if (subWalletList == null) {
            throw new ApiException("Missing the required parameter 'subWalletList' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        // verify the required parameter 'transferDirection' is set
        if (transferDirection == null) {
            throw new ApiException("Missing the required parameter 'transferDirection' when calling openApiV30CgTransferWalletTransferCanTransferBalanceGet(Async)");
        }

        return openApiV30CgTransferWalletTransferCanTransferBalanceGetCall(accountId, accountType, bizRequestNo, mainWalletId, subWalletList, transferDirection, _callback);

    }

    /**
     * 
     * 
     * @param accountId 鉴权账户 (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param mainWalletId 大钱包id (required)
     * @param subWalletList 小钱包id列表 (required)
     * @param transferDirection 转账方向，以小钱包视角确定 (required)
     * @return CgTransferWalletTransferCanTransferBalanceV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CgTransferWalletTransferCanTransferBalanceV30Response openApiV30CgTransferWalletTransferCanTransferBalanceGet(Long accountId, CgTransferWalletTransferCanTransferBalanceV30AccountType accountType, String bizRequestNo, Long mainWalletId, List<Long> subWalletList, CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection) throws ApiException {
        ApiResponse<CgTransferWalletTransferCanTransferBalanceV30Response> localVarResp = openApiV30CgTransferWalletTransferCanTransferBalanceGetWithHttpInfo(accountId, accountType, bizRequestNo, mainWalletId, subWalletList, transferDirection);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 鉴权账户 (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param mainWalletId 大钱包id (required)
     * @param subWalletList 小钱包id列表 (required)
     * @param transferDirection 转账方向，以小钱包视角确定 (required)
     * @return ApiResponse&lt;CgTransferWalletTransferCanTransferBalanceV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CgTransferWalletTransferCanTransferBalanceV30Response> openApiV30CgTransferWalletTransferCanTransferBalanceGetWithHttpInfo(Long accountId, CgTransferWalletTransferCanTransferBalanceV30AccountType accountType, String bizRequestNo, Long mainWalletId, List<Long> subWalletList, CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection) throws ApiException {
        okhttp3.Call localVarCall = openApiV30CgTransferWalletTransferCanTransferBalanceGetValidateBeforeCall(accountId, accountType, bizRequestNo, mainWalletId, subWalletList, transferDirection, null);
        Type localVarReturnType = new TypeToken<CgTransferWalletTransferCanTransferBalanceV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 鉴权账户 (required)
     * @param accountType 鉴权账户类型 (required)
     * @param bizRequestNo 请求id，推荐uuid，方便请求链路对齐 (required)
     * @param mainWalletId 大钱包id (required)
     * @param subWalletList 小钱包id列表 (required)
     * @param transferDirection 转账方向，以小钱包视角确定 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30CgTransferWalletTransferCanTransferBalanceGetAsync(Long accountId, CgTransferWalletTransferCanTransferBalanceV30AccountType accountType, String bizRequestNo, Long mainWalletId, List<Long> subWalletList, CgTransferWalletTransferCanTransferBalanceV30TransferDirection transferDirection, final ApiCallback<CgTransferWalletTransferCanTransferBalanceV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30CgTransferWalletTransferCanTransferBalanceGetValidateBeforeCall(accountId, accountType, bizRequestNo, mainWalletId, subWalletList, transferDirection, _callback);
        Type localVarReturnType = new TypeToken<CgTransferWalletTransferCanTransferBalanceV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
