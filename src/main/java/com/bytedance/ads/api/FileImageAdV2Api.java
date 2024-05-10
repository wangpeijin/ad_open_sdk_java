/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
import com.bytedance.ads.model.FileImageAdV2Response;
import com.bytedance.ads.model.FileImageAdV2UploadType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileImageAdV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileImageAdV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileImageAdV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileImageAdPost
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param imageFile 图片文件 upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内 (optional)
     * @param imageSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param imageUrl 图片url地址，如http://xxx.xxx upload_type为UPLOAD_BY_URL必填 (optional)
     * @param isAigc 图片素材是否为AIGC生成 (optional)
     * @param uploadType  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileImageAdPostCall(Long advertiserId, String filename, File imageFile, String imageSignature, String imageUrl, Boolean isAigc, FileImageAdV2UploadType uploadType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/image/ad/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarFormParams.put("advertiser_id", advertiserId);
        }

        if (filename != null) {
            localVarFormParams.put("filename", filename);
        }

        if (imageFile != null) {
            localVarFormParams.put("image_file", imageFile);
        }

        if (imageSignature != null) {
            localVarFormParams.put("image_signature", imageSignature);
        }

        if (imageUrl != null) {
            localVarFormParams.put("image_url", imageUrl);
        }

        if (isAigc != null) {
            localVarFormParams.put("is_aigc", isAigc);
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
    private okhttp3.Call openApi2FileImageAdPostValidateBeforeCall(Long advertiserId, String filename, File imageFile, String imageSignature, String imageUrl, Boolean isAigc, FileImageAdV2UploadType uploadType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2FileImageAdPost(Async)");
        }

        return openApi2FileImageAdPostCall(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param imageFile 图片文件 upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内 (optional)
     * @param imageSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param imageUrl 图片url地址，如http://xxx.xxx upload_type为UPLOAD_BY_URL必填 (optional)
     * @param isAigc 图片素材是否为AIGC生成 (optional)
     * @param uploadType  (optional)
     * @return FileImageAdV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileImageAdV2Response openApi2FileImageAdPost(Long advertiserId, String filename, File imageFile, String imageSignature, String imageUrl, Boolean isAigc, FileImageAdV2UploadType uploadType) throws ApiException {
        ApiResponse<FileImageAdV2Response> localVarResp = openApi2FileImageAdPostWithHttpInfo(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param imageFile 图片文件 upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内 (optional)
     * @param imageSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param imageUrl 图片url地址，如http://xxx.xxx upload_type为UPLOAD_BY_URL必填 (optional)
     * @param isAigc 图片素材是否为AIGC生成 (optional)
     * @param uploadType  (optional)
     * @return ApiResponse&lt;FileImageAdV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileImageAdV2Response> openApi2FileImageAdPostWithHttpInfo(Long advertiserId, String filename, File imageFile, String imageSignature, String imageUrl, Boolean isAigc, FileImageAdV2UploadType uploadType) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileImageAdPostValidateBeforeCall(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType, null);
        Type localVarReturnType = new TypeToken<FileImageAdV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主ID  (required)
     * @param filename 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名 (optional)
     * @param imageFile 图片文件 upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内 (optional)
     * @param imageSignature 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE (optional)
     * @param imageUrl 图片url地址，如http://xxx.xxx upload_type为UPLOAD_BY_URL必填 (optional)
     * @param isAigc 图片素材是否为AIGC生成 (optional)
     * @param uploadType  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileImageAdPostAsync(Long advertiserId, String filename, File imageFile, String imageSignature, String imageUrl, Boolean isAigc, FileImageAdV2UploadType uploadType, final ApiCallback<FileImageAdV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileImageAdPostValidateBeforeCall(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType, _callback);
        Type localVarReturnType = new TypeToken<FileImageAdV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
