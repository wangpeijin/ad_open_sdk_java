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



import com.bytedance.ads.model.ToolsCommentMid2itemIdV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsCommentMid2itemIdV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsCommentMid2itemIdV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsCommentMid2itemIdV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30ToolsCommentMid2itemIdGet
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param materialId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentMid2itemIdGetCall(Long advertiserId, String startTime, String endTime, Long materialId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/tools/comment/mid2item_id/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (materialId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("material_id", materialId));
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
    private okhttp3.Call openApiV30ToolsCommentMid2itemIdGetValidateBeforeCall(Long advertiserId, String startTime, String endTime, Long materialId, Long page, Long pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30ToolsCommentMid2itemIdGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV30ToolsCommentMid2itemIdGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV30ToolsCommentMid2itemIdGet(Async)");
        }

        // verify the required parameter 'materialId' is set
        if (materialId == null) {
            throw new ApiException("Missing the required parameter 'materialId' when calling openApiV30ToolsCommentMid2itemIdGet(Async)");
        }

        return openApiV30ToolsCommentMid2itemIdGetCall(advertiserId, startTime, endTime, materialId, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param materialId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ToolsCommentMid2itemIdV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsCommentMid2itemIdV30Response openApiV30ToolsCommentMid2itemIdGet(Long advertiserId, String startTime, String endTime, Long materialId, Long page, Long pageSize) throws ApiException {
        ApiResponse<ToolsCommentMid2itemIdV30Response> localVarResp = openApiV30ToolsCommentMid2itemIdGetWithHttpInfo(advertiserId, startTime, endTime, materialId, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param materialId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @return ApiResponse&lt;ToolsCommentMid2itemIdV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsCommentMid2itemIdV30Response> openApiV30ToolsCommentMid2itemIdGetWithHttpInfo(Long advertiserId, String startTime, String endTime, Long materialId, Long page, Long pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApiV30ToolsCommentMid2itemIdGetValidateBeforeCall(advertiserId, startTime, endTime, materialId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ToolsCommentMid2itemIdV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param materialId  (required)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30ToolsCommentMid2itemIdGetAsync(Long advertiserId, String startTime, String endTime, Long materialId, Long page, Long pageSize, final ApiCallback<ToolsCommentMid2itemIdV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30ToolsCommentMid2itemIdGetValidateBeforeCall(advertiserId, startTime, endTime, materialId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ToolsCommentMid2itemIdV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
