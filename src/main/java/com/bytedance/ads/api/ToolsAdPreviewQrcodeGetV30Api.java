/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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



import com.bytedance.ads.model.ToolsAdPreviewQrcodeGetV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsAdPreviewQrcodeGetV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsAdPreviewQrcodeGetV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsAdPreviewQrcodeGetV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsAdPreviewQrcodeGetGet
     * @param advertiserId 广告主ID (required)
     * @param idType 查询条件，可选值:\&quot;ID_TYPE_PROJECT\&quot;,\&quot;ID_TYPE_PROMOTION\&quot; (required)
     * @param promotionId 广告ID (required)
     * @param materialId 素材ID，查询素材预览时使用 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsAdPreviewQrcodeGetGetCall(Long advertiserId, String idType, Long promotionId, Long materialId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/ad_preview/qrcode_get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (idType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("id_type", idType));
        }

        if (promotionId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("promotion_id", promotionId));
        }

        if (materialId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("material_id", materialId));
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

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV30ToolsAdPreviewQrcodeGetGetValidateBeforeCall(Long advertiserId, String idType, Long promotionId, Long materialId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ToolsAdPreviewQrcodeGetGet(Async)");
        }

        // verify the required parameter 'idType' is set
        if (idType == null) {
            throw new ApiException("Missing the required parameter 'idType' when calling openApiV30ToolsAdPreviewQrcodeGetGet(Async)");
        }

        // verify the required parameter 'promotionId' is set
        if (promotionId == null) {
            throw new ApiException("Missing the required parameter 'promotionId' when calling openApiV30ToolsAdPreviewQrcodeGetGet(Async)");
        }

        return openApiV30ToolsAdPreviewQrcodeGetGetCall(advertiserId, idType, promotionId, materialId, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param idType 查询条件，可选值:\&quot;ID_TYPE_PROJECT\&quot;,\&quot;ID_TYPE_PROMOTION\&quot; (required)
     * @param promotionId 广告ID (required)
     * @param materialId 素材ID，查询素材预览时使用 (optional)
     * @return ToolsAdPreviewQrcodeGetV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsAdPreviewQrcodeGetV30Response openApiV30ToolsAdPreviewQrcodeGetGet(Long advertiserId, String idType, Long promotionId, Long materialId) throws ApiException {
        ApiResponse<ToolsAdPreviewQrcodeGetV30Response> localVarResp = openApiV30ToolsAdPreviewQrcodeGetGetWithHttpInfo(advertiserId, idType, promotionId, materialId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param idType 查询条件，可选值:\&quot;ID_TYPE_PROJECT\&quot;,\&quot;ID_TYPE_PROMOTION\&quot; (required)
     * @param promotionId 广告ID (required)
     * @param materialId 素材ID，查询素材预览时使用 (optional)
     * @return ApiResponse&lt;ToolsAdPreviewQrcodeGetV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsAdPreviewQrcodeGetV30Response> openApiV30ToolsAdPreviewQrcodeGetGetWithHttpInfo(Long advertiserId, String idType, Long promotionId, Long materialId) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsAdPreviewQrcodeGetGetValidateBeforeCall(advertiserId, idType, promotionId, materialId, null);
        Type localVarReturnType = new TypeToken<ToolsAdPreviewQrcodeGetV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param idType 查询条件，可选值:\&quot;ID_TYPE_PROJECT\&quot;,\&quot;ID_TYPE_PROMOTION\&quot; (required)
     * @param promotionId 广告ID (required)
     * @param materialId 素材ID，查询素材预览时使用 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsAdPreviewQrcodeGetGetAsync(Long advertiserId, String idType, Long promotionId, Long materialId, final ApiCallback<ToolsAdPreviewQrcodeGetV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsAdPreviewQrcodeGetGetValidateBeforeCall(advertiserId, idType, promotionId, materialId, _callback);
        Type localVarReturnType = new TypeToken<ToolsAdPreviewQrcodeGetV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
