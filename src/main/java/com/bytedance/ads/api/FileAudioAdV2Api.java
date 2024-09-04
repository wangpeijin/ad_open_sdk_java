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



import java.io.File;
import com.bytedance.ads.model.FileAudioAdV2Response;
import com.bytedance.ads.model.FileAudioAdV2UploadType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileAudioAdV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileAudioAdV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileAudioAdV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileAudioAdPost
     * @param advertiserId 广告主ID (required)
     * @param uploadType  (required)
     * @param audioFile  (optional)
     * @param audioSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param audioUrl  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileAudioAdPostCall(Long advertiserId, FileAudioAdV2UploadType uploadType, File audioFile, String audioSignature, String audioUrl, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/audio/ad/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarFormParams.put("advertiser_id", advertiserId);
        }

        if (audioFile != null) {
            localVarFormParams.put("audio_file", audioFile);
        }

        if (audioSignature != null) {
            localVarFormParams.put("audio_signature", audioSignature);
        }

        if (audioUrl != null) {
            localVarFormParams.put("audio_url", audioUrl);
        }

        if (uploadType != null) {
            localVarFormParams.put("upload_type", uploadType);
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
    private okhttp3.Call openApi2FileAudioAdPostValidateBeforeCall(Long advertiserId, FileAudioAdV2UploadType uploadType, File audioFile, String audioSignature, String audioUrl, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2FileAudioAdPost(Async)");
        }

        // verify the required parameter 'uploadType' is set
        if (uploadType == null) {
            throw new ApiException("Missing the required parameter 'uploadType' when calling openApi2FileAudioAdPost(Async)");
        }

        return openApi2FileAudioAdPostCall(advertiserId, uploadType, audioFile, audioSignature, audioUrl, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param uploadType  (required)
     * @param audioFile  (optional)
     * @param audioSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param audioUrl  (optional)
     * @return FileAudioAdV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileAudioAdV2Response openApi2FileAudioAdPost(Long advertiserId, FileAudioAdV2UploadType uploadType, File audioFile, String audioSignature, String audioUrl) throws ApiException {
        ApiResponse<FileAudioAdV2Response> localVarResp = openApi2FileAudioAdPostWithHttpInfo(advertiserId, uploadType, audioFile, audioSignature, audioUrl);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID (required)
     * @param uploadType  (required)
     * @param audioFile  (optional)
     * @param audioSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param audioUrl  (optional)
     * @return ApiResponse&lt;FileAudioAdV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileAudioAdV2Response> openApi2FileAudioAdPostWithHttpInfo(Long advertiserId, FileAudioAdV2UploadType uploadType, File audioFile, String audioSignature, String audioUrl) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileAudioAdPostValidateBeforeCall(advertiserId, uploadType, audioFile, audioSignature, audioUrl, null);
        Type localVarReturnType = new TypeToken<FileAudioAdV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID (required)
     * @param uploadType  (required)
     * @param audioFile  (optional)
     * @param audioSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param audioUrl  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileAudioAdPostAsync(Long advertiserId, FileAudioAdV2UploadType uploadType, File audioFile, String audioSignature, String audioUrl, final ApiCallback<FileAudioAdV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileAudioAdPostValidateBeforeCall(advertiserId, uploadType, audioFile, audioSignature, audioUrl, _callback);
        Type localVarReturnType = new TypeToken<FileAudioAdV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
