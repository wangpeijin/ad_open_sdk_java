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



import com.bytedance.ads.model.AdvertiserAttachmentUploadV30AttachmentType;
import com.bytedance.ads.model.AdvertiserAttachmentUploadV30Response;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AdvertiserAttachmentUploadV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdvertiserAttachmentUploadV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public AdvertiserAttachmentUploadV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30AdvertiserAttachmentUploadPost
     * @param advertiserId  (required)
     * @param attachmentType  (required)
     * @param filename 文件名 注意：不要包含文件路径，不要含有&#39;/&#39;等非法字符 (required)
     * @param imageData 图片数据 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserAttachmentUploadPostCall(Long advertiserId, AdvertiserAttachmentUploadV30AttachmentType attachmentType, String filename, File imageData, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/advertiser/attachment/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarFormParams.put("advertiser_id", advertiserId);
        }

        if (attachmentType != null) {
            localVarFormParams.put("attachment_type", attachmentType);
        }

        if (filename != null) {
            localVarFormParams.put("filename", filename);
        }

        if (imageData != null) {
            localVarFormParams.put("image_data", imageData);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "ApiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call openApiV30AdvertiserAttachmentUploadPostValidateBeforeCall(Long advertiserId, AdvertiserAttachmentUploadV30AttachmentType attachmentType, String filename, File imageData, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV30AdvertiserAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'attachmentType' is set
        if (attachmentType == null) {
            throw new ApiException("Missing the required parameter 'attachmentType' when calling openApiV30AdvertiserAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'filename' is set
        if (filename == null) {
            throw new ApiException("Missing the required parameter 'filename' when calling openApiV30AdvertiserAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'imageData' is set
        if (imageData == null) {
            throw new ApiException("Missing the required parameter 'imageData' when calling openApiV30AdvertiserAttachmentUploadPost(Async)");
        }

        return openApiV30AdvertiserAttachmentUploadPostCall(advertiserId, attachmentType, filename, imageData, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param attachmentType  (required)
     * @param filename 文件名 注意：不要包含文件路径，不要含有&#39;/&#39;等非法字符 (required)
     * @param imageData 图片数据 (required)
     * @return AdvertiserAttachmentUploadV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public AdvertiserAttachmentUploadV30Response openApiV30AdvertiserAttachmentUploadPost(Long advertiserId, AdvertiserAttachmentUploadV30AttachmentType attachmentType, String filename, File imageData) throws ApiException {
        ApiResponse<AdvertiserAttachmentUploadV30Response> localVarResp = openApiV30AdvertiserAttachmentUploadPostWithHttpInfo(advertiserId, attachmentType, filename, imageData);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param attachmentType  (required)
     * @param filename 文件名 注意：不要包含文件路径，不要含有&#39;/&#39;等非法字符 (required)
     * @param imageData 图片数据 (required)
     * @return ApiResponse&lt;AdvertiserAttachmentUploadV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AdvertiserAttachmentUploadV30Response> openApiV30AdvertiserAttachmentUploadPostWithHttpInfo(Long advertiserId, AdvertiserAttachmentUploadV30AttachmentType attachmentType, String filename, File imageData) throws ApiException {
        okhttp3.Call localVarCall = openApiV30AdvertiserAttachmentUploadPostValidateBeforeCall(advertiserId, attachmentType, filename, imageData, null);
        Type localVarReturnType = new TypeToken<AdvertiserAttachmentUploadV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param attachmentType  (required)
     * @param filename 文件名 注意：不要包含文件路径，不要含有&#39;/&#39;等非法字符 (required)
     * @param imageData 图片数据 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30AdvertiserAttachmentUploadPostAsync(Long advertiserId, AdvertiserAttachmentUploadV30AttachmentType attachmentType, String filename, File imageData, final ApiCallback<AdvertiserAttachmentUploadV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30AdvertiserAttachmentUploadPostValidateBeforeCall(advertiserId, attachmentType, filename, imageData, _callback);
        Type localVarReturnType = new TypeToken<AdvertiserAttachmentUploadV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
