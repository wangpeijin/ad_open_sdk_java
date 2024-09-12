/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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



import com.bytedance.ads.model.ToolsAipThirdSiteGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAipThirdSiteGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAipThirdSiteGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAipThirdSiteGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsAipThirdSiteGetGet
     * @param advertiserId 广告主id (required)
     * @param siteId 站点id，暂不支持批量查询 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAipThirdSiteGetGetCall(Long advertiserId, Long siteId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/aip_third_site/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (siteId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("site_id", siteId));
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
    private okhttp3.Call openApi2ToolsAipThirdSiteGetGetValidateBeforeCall(Long advertiserId, Long siteId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2ToolsAipThirdSiteGetGet(Async)");
        }

        // verify the required parameter 'siteId' is set
        if (siteId == null) {
            throw new ApiException("Missing the required parameter 'siteId' when calling openApi2ToolsAipThirdSiteGetGet(Async)");
        }

        return openApi2ToolsAipThirdSiteGetGetCall(advertiserId, siteId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param siteId 站点id，暂不支持批量查询 (required)
     * @return ToolsAipThirdSiteGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAipThirdSiteGetV2Response openApi2ToolsAipThirdSiteGetGet(Long advertiserId, Long siteId) throws ApiException {
        ApiResponse<ToolsAipThirdSiteGetV2Response> localVarResp = openApi2ToolsAipThirdSiteGetGetWithHttpInfo(advertiserId, siteId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主id (required)
     * @param siteId 站点id，暂不支持批量查询 (required)
     * @return ApiResponse&lt;ToolsAipThirdSiteGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAipThirdSiteGetV2Response> openApi2ToolsAipThirdSiteGetGetWithHttpInfo(Long advertiserId, Long siteId) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsAipThirdSiteGetGetValidateBeforeCall(advertiserId, siteId, null);
        Type localVarReturnType = new TypeToken<ToolsAipThirdSiteGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主id (required)
     * @param siteId 站点id，暂不支持批量查询 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsAipThirdSiteGetGetAsync(Long advertiserId, Long siteId, final ApiCallback<ToolsAipThirdSiteGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsAipThirdSiteGetGetValidateBeforeCall(advertiserId, siteId, _callback);
        Type localVarReturnType = new TypeToken<ToolsAipThirdSiteGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
