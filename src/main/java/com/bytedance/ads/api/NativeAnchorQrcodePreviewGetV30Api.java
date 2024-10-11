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



import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30AnchorType;
import com.bytedance.ads.model.NativeAnchorQrcodePreviewGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NativeAnchorQrcodePreviewGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public NativeAnchorQrcodePreviewGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public NativeAnchorQrcodePreviewGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30NativeAnchorQrcodePreviewGetGet
     * @param advertiserId  (required)
     * @param anchorIds  (required)
     * @param anchorType  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30NativeAnchorQrcodePreviewGetGetCall(Long advertiserId, List<String> anchorIds, NativeAnchorQrcodePreviewGetV30AnchorType anchorType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/native_anchor/qrcode_preview/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (anchorIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "anchor_ids", anchorIds));
        }

        if (anchorType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("anchor_type", anchorType));
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
    private okhttp3.Call openApiV30NativeAnchorQrcodePreviewGetGetValidateBeforeCall(Long advertiserId, List<String> anchorIds, NativeAnchorQrcodePreviewGetV30AnchorType anchorType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30NativeAnchorQrcodePreviewGetGet(Async)");
        }

        // verify the required parameter 'anchorIds' is set
        if (anchorIds == null) {
            throw new ApiException("Missing the required parameter 'anchorIds' when calling openApiV30NativeAnchorQrcodePreviewGetGet(Async)");
        }

        // verify the required parameter 'anchorType' is set
        if (anchorType == null) {
            throw new ApiException("Missing the required parameter 'anchorType' when calling openApiV30NativeAnchorQrcodePreviewGetGet(Async)");
        }

        return openApiV30NativeAnchorQrcodePreviewGetGetCall(advertiserId, anchorIds, anchorType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param anchorIds  (required)
     * @param anchorType  (required)
     * @return NativeAnchorQrcodePreviewGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public NativeAnchorQrcodePreviewGetV30Response openApiV30NativeAnchorQrcodePreviewGetGet(Long advertiserId, List<String> anchorIds, NativeAnchorQrcodePreviewGetV30AnchorType anchorType) throws ApiException {
        ApiResponse<NativeAnchorQrcodePreviewGetV30Response> localVarResp = openApiV30NativeAnchorQrcodePreviewGetGetWithHttpInfo(advertiserId, anchorIds, anchorType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param anchorIds  (required)
     * @param anchorType  (required)
     * @return ApiResponse&lt;NativeAnchorQrcodePreviewGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<NativeAnchorQrcodePreviewGetV30Response> openApiV30NativeAnchorQrcodePreviewGetGetWithHttpInfo(Long advertiserId, List<String> anchorIds, NativeAnchorQrcodePreviewGetV30AnchorType anchorType) throws ApiException {
        okhttp3.Call localVarCall = openApiV30NativeAnchorQrcodePreviewGetGetValidateBeforeCall(advertiserId, anchorIds, anchorType, null);
        Type localVarReturnType = new TypeToken<NativeAnchorQrcodePreviewGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param anchorIds  (required)
     * @param anchorType  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30NativeAnchorQrcodePreviewGetGetAsync(Long advertiserId, List<String> anchorIds, NativeAnchorQrcodePreviewGetV30AnchorType anchorType, final ApiCallback<NativeAnchorQrcodePreviewGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30NativeAnchorQrcodePreviewGetGetValidateBeforeCall(advertiserId, anchorIds, anchorType, _callback);
        Type localVarReturnType = new TypeToken<NativeAnchorQrcodePreviewGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
