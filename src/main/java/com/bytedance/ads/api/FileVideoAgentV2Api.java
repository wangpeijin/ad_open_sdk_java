/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
import com.bytedance.ads.model.FileVideoAgentV2Response;
import com.bytedance.ads.model.FileVideoAgentV2UploadType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileVideoAgentV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileVideoAgentV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileVideoAgentV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileVideoAgentPost
     * @param agentId 代理商id (required)
     * @param fileName 视频上传名称 (required)
     * @param isNeedAuth 标注是否允许授权(素材搬运)，目前只支持true (required)
     * @param isAigc 标注是否为AIGC生成,默认false (optional, default to false)
     * @param uploadType  (optional)
     * @param videoFile 文件数据 (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填 (optional)
     * @param videoUrl 视频URL地址，upload_type为UPLOAD_BY_URL必传 只支持连山tos地址 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoAgentPostCall(Long agentId, String fileName, Boolean isNeedAuth, Boolean isAigc, FileVideoAgentV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/video/agent/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (agentId != null) {
            localVarFormParams.put("agent_id", agentId);
        }

        if (fileName != null) {
            localVarFormParams.put("file_name", fileName);
        }

        if (isAigc != null) {
            localVarFormParams.put("is_aigc", isAigc);
        }

        if (isNeedAuth != null) {
            localVarFormParams.put("is_need_auth", isNeedAuth);
        }

        if (uploadType != null) {
            localVarFormParams.put("upload_type", uploadType);
        }

        if (videoFile != null) {
            localVarFormParams.put("video_file", videoFile);
        }

        if (videoSignature != null) {
            localVarFormParams.put("video_signature", videoSignature);
        }

        if (videoUrl != null) {
            localVarFormParams.put("video_url", videoUrl);
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
    private okhttp3.Call openApi2FileVideoAgentPostValidateBeforeCall(Long agentId, String fileName, Boolean isNeedAuth, Boolean isAigc, FileVideoAgentV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'agentId' is set
        if (agentId == null) {
            throw new ApiException("Missing the required parameter 'agentId' when calling openApi2FileVideoAgentPost(Async)");
        }

        // verify the required parameter 'fileName' is set
        if (fileName == null) {
            throw new ApiException("Missing the required parameter 'fileName' when calling openApi2FileVideoAgentPost(Async)");
        }

        // verify the required parameter 'isNeedAuth' is set
        if (isNeedAuth == null) {
            throw new ApiException("Missing the required parameter 'isNeedAuth' when calling openApi2FileVideoAgentPost(Async)");
        }

        return openApi2FileVideoAgentPostCall(agentId, fileName, isNeedAuth, isAigc, uploadType, videoFile, videoSignature, videoUrl, _callback);

    }

    /**
     * 
     * 
     * @param agentId 代理商id (required)
     * @param fileName 视频上传名称 (required)
     * @param isNeedAuth 标注是否允许授权(素材搬运)，目前只支持true (required)
     * @param isAigc 标注是否为AIGC生成,默认false (optional, default to false)
     * @param uploadType  (optional)
     * @param videoFile 文件数据 (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填 (optional)
     * @param videoUrl 视频URL地址，upload_type为UPLOAD_BY_URL必传 只支持连山tos地址 (optional)
     * @return FileVideoAgentV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileVideoAgentV2Response openApi2FileVideoAgentPost(Long agentId, String fileName, Boolean isNeedAuth, Boolean isAigc, FileVideoAgentV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl) throws ApiException {
        ApiResponse<FileVideoAgentV2Response> localVarResp = openApi2FileVideoAgentPostWithHttpInfo(agentId, fileName, isNeedAuth, isAigc, uploadType, videoFile, videoSignature, videoUrl);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param agentId 代理商id (required)
     * @param fileName 视频上传名称 (required)
     * @param isNeedAuth 标注是否允许授权(素材搬运)，目前只支持true (required)
     * @param isAigc 标注是否为AIGC生成,默认false (optional, default to false)
     * @param uploadType  (optional)
     * @param videoFile 文件数据 (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填 (optional)
     * @param videoUrl 视频URL地址，upload_type为UPLOAD_BY_URL必传 只支持连山tos地址 (optional)
     * @return ApiResponse&lt;FileVideoAgentV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileVideoAgentV2Response> openApi2FileVideoAgentPostWithHttpInfo(Long agentId, String fileName, Boolean isNeedAuth, Boolean isAigc, FileVideoAgentV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileVideoAgentPostValidateBeforeCall(agentId, fileName, isNeedAuth, isAigc, uploadType, videoFile, videoSignature, videoUrl, null);
        Type localVarReturnType = new TypeToken<FileVideoAgentV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param agentId 代理商id (required)
     * @param fileName 视频上传名称 (required)
     * @param isNeedAuth 标注是否允许授权(素材搬运)，目前只支持true (required)
     * @param isAigc 标注是否为AIGC生成,默认false (optional, default to false)
     * @param uploadType  (optional)
     * @param videoFile 文件数据 (optional)
     * @param videoSignature 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填 (optional)
     * @param videoUrl 视频URL地址，upload_type为UPLOAD_BY_URL必传 只支持连山tos地址 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileVideoAgentPostAsync(Long agentId, String fileName, Boolean isNeedAuth, Boolean isAigc, FileVideoAgentV2UploadType uploadType, File videoFile, String videoSignature, String videoUrl, final ApiCallback<FileVideoAgentV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileVideoAgentPostValidateBeforeCall(agentId, fileName, isNeedAuth, isAigc, uploadType, videoFile, videoSignature, videoUrl, _callback);
        Type localVarReturnType = new TypeToken<FileVideoAgentV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
