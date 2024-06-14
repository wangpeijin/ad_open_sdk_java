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



import com.bytedance.ads.model.SharedWalletDailyStatGetV30AccountType;
import com.bytedance.ads.model.SharedWalletDailyStatGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SharedWalletDailyStatGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public SharedWalletDailyStatGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public SharedWalletDailyStatGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30SharedWalletDailyStatGetGet
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包id (required)
     * @param startDate 开始时间，格式YYYY-MM-DD，默认为当前年份的1月1日 (optional)
     * @param endDate 结束时间，格式YYYY-MM-DD，默认为今天，起止时间间隔不能超过一年。 (optional)
     * @param page 页码；默认为1；注意：page*page_size不可大于10000 (optional, default to 1)
     * @param pageSize 页面大小；默认为10 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletDailyStatGetGetCall(Long accountId, SharedWalletDailyStatGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/shared_wallet/daily_stat/get/";

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
    private okhttp3.Call openApiV30SharedWalletDailyStatGetGetValidateBeforeCall(Long accountId, SharedWalletDailyStatGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApiV30SharedWalletDailyStatGetGet(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApiV30SharedWalletDailyStatGetGet(Async)");
        }

        // verify the required parameter 'sharedWalletId' is set
        if (sharedWalletId == null) {
            throw new ApiException("Missing the required parameter 'sharedWalletId' when calling openApiV30SharedWalletDailyStatGetGet(Async)");
        }

        return openApiV30SharedWalletDailyStatGetGetCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包id (required)
     * @param startDate 开始时间，格式YYYY-MM-DD，默认为当前年份的1月1日 (optional)
     * @param endDate 结束时间，格式YYYY-MM-DD，默认为今天，起止时间间隔不能超过一年。 (optional)
     * @param page 页码；默认为1；注意：page*page_size不可大于10000 (optional, default to 1)
     * @param pageSize 页面大小；默认为10 (optional, default to 10)
     * @return SharedWalletDailyStatGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public SharedWalletDailyStatGetV30Response openApiV30SharedWalletDailyStatGetGet(Long accountId, SharedWalletDailyStatGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize) throws ApiException {
        ApiResponse<SharedWalletDailyStatGetV30Response> localVarResp = openApiV30SharedWalletDailyStatGetGetWithHttpInfo(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包id (required)
     * @param startDate 开始时间，格式YYYY-MM-DD，默认为当前年份的1月1日 (optional)
     * @param endDate 结束时间，格式YYYY-MM-DD，默认为今天，起止时间间隔不能超过一年。 (optional)
     * @param page 页码；默认为1；注意：page*page_size不可大于10000 (optional, default to 1)
     * @param pageSize 页面大小；默认为10 (optional, default to 10)
     * @return ApiResponse&lt;SharedWalletDailyStatGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<SharedWalletDailyStatGetV30Response> openApiV30SharedWalletDailyStatGetGetWithHttpInfo(Long accountId, SharedWalletDailyStatGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30SharedWalletDailyStatGetGetValidateBeforeCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, null);
        Type localVarReturnType = new TypeToken<SharedWalletDailyStatGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户ID，对于巨量AD、千川、本地推是广告主ID，对于代理商是代理商ID (required)
     * @param accountType 账户类型 (required)
     * @param sharedWalletId 共享钱包id (required)
     * @param startDate 开始时间，格式YYYY-MM-DD，默认为当前年份的1月1日 (optional)
     * @param endDate 结束时间，格式YYYY-MM-DD，默认为今天，起止时间间隔不能超过一年。 (optional)
     * @param page 页码；默认为1；注意：page*page_size不可大于10000 (optional, default to 1)
     * @param pageSize 页面大小；默认为10 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30SharedWalletDailyStatGetGetAsync(Long accountId, SharedWalletDailyStatGetV30AccountType accountType, Long sharedWalletId, String startDate, String endDate, Long page, Long pageSize, final ApiCallback<SharedWalletDailyStatGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30SharedWalletDailyStatGetGetValidateBeforeCall(accountId, accountType, sharedWalletId, startDate, endDate, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<SharedWalletDailyStatGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
