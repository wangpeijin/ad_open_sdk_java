/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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



import com.bytedance.ads.model.QianchuanDmpAudiencesGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanDmpAudiencesGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanDmpAudiencesGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanDmpAudiencesGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanDmpAudiencesGetGet
     * @param advertiserId  (required)
     * @param retargetingTagsType  (required)
     * @param offset  (optional, default to 0)
     * @param limit  (optional, default to 100)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanDmpAudiencesGetGetCall(Long advertiserId, Integer retargetingTagsType, Long offset, Long limit, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/dmp/audiences/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (retargetingTagsType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("retargeting_tags_type", retargetingTagsType));
        }

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
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
    private okhttp3.Call openApiV10QianchuanDmpAudiencesGetGetValidateBeforeCall(Long advertiserId, Integer retargetingTagsType, Long offset, Long limit, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanDmpAudiencesGetGet(Async)");
        }

        // verify the required parameter 'retargetingTagsType' is set
        if (retargetingTagsType == null) {
            throw new ApiException("Missing the required parameter 'retargetingTagsType' when calling openApiV10QianchuanDmpAudiencesGetGet(Async)");
        }

        return openApiV10QianchuanDmpAudiencesGetGetCall(advertiserId, retargetingTagsType, offset, limit, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param retargetingTagsType  (required)
     * @param offset  (optional, default to 0)
     * @param limit  (optional, default to 100)
     * @return QianchuanDmpAudiencesGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanDmpAudiencesGetV10Response openApiV10QianchuanDmpAudiencesGetGet(Long advertiserId, Integer retargetingTagsType, Long offset, Long limit) throws ApiException {
        ApiResponse<QianchuanDmpAudiencesGetV10Response> localVarResp = openApiV10QianchuanDmpAudiencesGetGetWithHttpInfo(advertiserId, retargetingTagsType, offset, limit);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param retargetingTagsType  (required)
     * @param offset  (optional, default to 0)
     * @param limit  (optional, default to 100)
     * @return ApiResponse&lt;QianchuanDmpAudiencesGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanDmpAudiencesGetV10Response> openApiV10QianchuanDmpAudiencesGetGetWithHttpInfo(Long advertiserId, Integer retargetingTagsType, Long offset, Long limit) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanDmpAudiencesGetGetValidateBeforeCall(advertiserId, retargetingTagsType, offset, limit, null);
        Type localVarReturnType = new TypeToken<QianchuanDmpAudiencesGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param retargetingTagsType  (required)
     * @param offset  (optional, default to 0)
     * @param limit  (optional, default to 100)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanDmpAudiencesGetGetAsync(Long advertiserId, Integer retargetingTagsType, Long offset, Long limit, final ApiCallback<QianchuanDmpAudiencesGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanDmpAudiencesGetGetValidateBeforeCall(advertiserId, retargetingTagsType, offset, limit, _callback);
        Type localVarReturnType = new TypeToken<QianchuanDmpAudiencesGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
