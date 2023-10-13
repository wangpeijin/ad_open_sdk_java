/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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



import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2AccountType;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2Filtering;
import com.bytedance.ads.model.ToolsAppManagementExtendPackageListV2V2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAppManagementExtendPackageListV2V2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAppManagementExtendPackageListV2V2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAppManagementExtendPackageListV2V2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAppManagementExtendPackageListV2Get
     * @param accountId 账户id，如广告主id、bpid等 (required)
     * @param accountType 账户类型&lt;br&gt;枚举值：&#x60;BP&#x60;:巨量纵横组织; &#x60;AD&#x60; 广告主账号; &#x60;STAR&#x60; 星图 (required)
     * @param packageId 应用包ID，从“查询应用信息”接口中获取 (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementExtendPackageListV2GetCall(Long accountId, ToolsAppManagementExtendPackageListV2V2AccountType accountType, String packageId, Integer page, Integer pageSize, ToolsAppManagementExtendPackageListV2V2Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/app_management/extend_package/list_v2/";

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

        if (packageId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("package_id", packageId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2ToolsAppManagementExtendPackageListV2GetValidateBeforeCall(Long accountId, ToolsAppManagementExtendPackageListV2V2AccountType accountType, String packageId, Integer page, Integer pageSize, ToolsAppManagementExtendPackageListV2V2Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'accountId' is set
        if (accountId == null) {
            throw new ApiException("Missing the required parameter 'accountId' when calling openApi2ToolsAppManagementExtendPackageListV2Get(Async)");
        }

        // verify the required parameter 'accountType' is set
        if (accountType == null) {
            throw new ApiException("Missing the required parameter 'accountType' when calling openApi2ToolsAppManagementExtendPackageListV2Get(Async)");
        }

        // verify the required parameter 'packageId' is set
        if (packageId == null) {
            throw new ApiException("Missing the required parameter 'packageId' when calling openApi2ToolsAppManagementExtendPackageListV2Get(Async)");
        }

        return openApi2ToolsAppManagementExtendPackageListV2GetCall(accountId, accountType, packageId, page, pageSize, filtering, _callback);

    }

    /**
     * 
     * 
     * @param accountId 账户id，如广告主id、bpid等 (required)
     * @param accountType 账户类型&lt;br&gt;枚举值：&#x60;BP&#x60;:巨量纵横组织; &#x60;AD&#x60; 广告主账号; &#x60;STAR&#x60; 星图 (required)
     * @param packageId 应用包ID，从“查询应用信息”接口中获取 (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @return ToolsAppManagementExtendPackageListV2V2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAppManagementExtendPackageListV2V2Response openApi2ToolsAppManagementExtendPackageListV2Get(Long accountId, ToolsAppManagementExtendPackageListV2V2AccountType accountType, String packageId, Integer page, Integer pageSize, ToolsAppManagementExtendPackageListV2V2Filtering filtering) throws ApiException {
        ApiResponse<ToolsAppManagementExtendPackageListV2V2Response> localVarResp = openApi2ToolsAppManagementExtendPackageListV2GetWithHttpInfo(accountId, accountType, packageId, page, pageSize, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param accountId 账户id，如广告主id、bpid等 (required)
     * @param accountType 账户类型&lt;br&gt;枚举值：&#x60;BP&#x60;:巨量纵横组织; &#x60;AD&#x60; 广告主账号; &#x60;STAR&#x60; 星图 (required)
     * @param packageId 应用包ID，从“查询应用信息”接口中获取 (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @return ApiResponse&lt;ToolsAppManagementExtendPackageListV2V2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAppManagementExtendPackageListV2V2Response> openApi2ToolsAppManagementExtendPackageListV2GetWithHttpInfo(Long accountId, ToolsAppManagementExtendPackageListV2V2AccountType accountType, String packageId, Integer page, Integer pageSize, ToolsAppManagementExtendPackageListV2V2Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAppManagementExtendPackageListV2GetValidateBeforeCall(accountId, accountType, packageId, page, pageSize, filtering, null);
        Type localVarReturnType = new TypeToken<ToolsAppManagementExtendPackageListV2V2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param accountId 账户id，如广告主id、bpid等 (required)
     * @param accountType 账户类型&lt;br&gt;枚举值：&#x60;BP&#x60;:巨量纵横组织; &#x60;AD&#x60; 广告主账号; &#x60;STAR&#x60; 星图 (required)
     * @param packageId 应用包ID，从“查询应用信息”接口中获取 (required)
     * @param page 页码，默认值为1 (optional, default to 1)
     * @param pageSize 页面大小，默认值为10，最大不超过100 (optional, default to 10)
     * @param filtering 过滤条件 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAppManagementExtendPackageListV2GetAsync(Long accountId, ToolsAppManagementExtendPackageListV2V2AccountType accountType, String packageId, Integer page, Integer pageSize, ToolsAppManagementExtendPackageListV2V2Filtering filtering, final ApiCallback<ToolsAppManagementExtendPackageListV2V2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAppManagementExtendPackageListV2GetValidateBeforeCall(accountId, accountType, packageId, page, pageSize, filtering, _callback);
        Type localVarReturnType = new TypeToken<ToolsAppManagementExtendPackageListV2V2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
