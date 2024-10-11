/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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



import com.bytedance.ads.model.ToolsIndustryGetV2Level;
import com.bytedance.ads.model.ToolsIndustryGetV2Response;
import com.bytedance.ads.model.ToolsIndustryGetV2Type;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsIndustryGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsIndustryGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsIndustryGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsIndustryGetGet
     * @param level  (optional)
     * @param type  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsIndustryGetGetCall(ToolsIndustryGetV2Level level, ToolsIndustryGetV2Type type, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/industry/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (level != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("level", level));
        }

        if (type != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("type", type));
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
    private okhttp3.Call openApi2ToolsIndustryGetGetValidateBeforeCall(ToolsIndustryGetV2Level level, ToolsIndustryGetV2Type type, final ApiCallback _callback) throws ApiException {
        return openApi2ToolsIndustryGetGetCall(level, type, _callback);

    }

    /**
     * 
     * 
     * @param level  (optional)
     * @param type  (optional)
     * @return ToolsIndustryGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsIndustryGetV2Response openApi2ToolsIndustryGetGet(ToolsIndustryGetV2Level level, ToolsIndustryGetV2Type type) throws ApiException {
        ApiResponse<ToolsIndustryGetV2Response> localVarResp = openApi2ToolsIndustryGetGetWithHttpInfo(level, type);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param level  (optional)
     * @param type  (optional)
     * @return ApiResponse&lt;ToolsIndustryGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsIndustryGetV2Response> openApi2ToolsIndustryGetGetWithHttpInfo(ToolsIndustryGetV2Level level, ToolsIndustryGetV2Type type) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsIndustryGetGetValidateBeforeCall(level, type, null);
        Type localVarReturnType = new TypeToken<ToolsIndustryGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param level  (optional)
     * @param type  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsIndustryGetGetAsync(ToolsIndustryGetV2Level level, ToolsIndustryGetV2Type type, final ApiCallback<ToolsIndustryGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsIndustryGetGetValidateBeforeCall(level, type, _callback);
        Type localVarReturnType = new TypeToken<ToolsIndustryGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
