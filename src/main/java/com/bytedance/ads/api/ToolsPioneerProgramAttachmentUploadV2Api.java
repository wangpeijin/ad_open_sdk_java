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



import java.io.File;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2DataFileType;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2Platform;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToolsPioneerProgramAttachmentUploadV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ToolsPioneerProgramAttachmentUploadV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public ToolsPioneerProgramAttachmentUploadV2Api(ApiClient apiClient) {
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
     * Build call for openApi2ToolsPioneerProgramAttachmentUploadPost
     * @param appId 即应用ID，开发者创建应用的唯一标识，可通过应用管理查看 (required)
     * @param dataFileType  (required)
     * @param fileData 文件数据，binary格式 (required)
     * @param fileIndex 当前文件序号，从1开始，最大值为file_total_num (required)
     * @param fileTotalNum p_date - platform - data_file_type维度下总文件数，如“2022-06-12”日“巨量引擎”平台的“后端投放数据”共计3份，则file_total_num为3 (required)
     * @param pDate 数据日期，格式为yyyy-MM-dd (required)
     * @param platform  (required)
     * @param debugMode 是否为调试模式，调试模式下数据不会被最终记录，默认为False (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPioneerProgramAttachmentUploadPostCall(Long appId, ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType, File fileData, Long fileIndex, Long fileTotalNum, String pDate, ToolsPioneerProgramAttachmentUploadV2Platform platform, Boolean debugMode, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/tools/pioneer_program/attachment/upload/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (appId != null) {
            localVarFormParams.put("app_id", appId);
        }

        if (dataFileType != null) {
            localVarFormParams.put("data_file_type", dataFileType);
        }

        if (debugMode != null) {
            localVarFormParams.put("debug_mode", debugMode);
        }

        if (fileData != null) {
            localVarFormParams.put("file_data", fileData);
        }

        if (fileIndex != null) {
            localVarFormParams.put("file_index", fileIndex);
        }

        if (fileTotalNum != null) {
            localVarFormParams.put("file_total_num", fileTotalNum);
        }

        if (pDate != null) {
            localVarFormParams.put("p_date", pDate);
        }

        if (platform != null) {
            localVarFormParams.put("platform", platform);
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
    private okhttp3.Call openApi2ToolsPioneerProgramAttachmentUploadPostValidateBeforeCall(Long appId, ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType, File fileData, Long fileIndex, Long fileTotalNum, String pDate, ToolsPioneerProgramAttachmentUploadV2Platform platform, Boolean debugMode, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'dataFileType' is set
        if (dataFileType == null) {
            throw new ApiException("Missing the required parameter 'dataFileType' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'fileData' is set
        if (fileData == null) {
            throw new ApiException("Missing the required parameter 'fileData' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'fileIndex' is set
        if (fileIndex == null) {
            throw new ApiException("Missing the required parameter 'fileIndex' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'fileTotalNum' is set
        if (fileTotalNum == null) {
            throw new ApiException("Missing the required parameter 'fileTotalNum' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'pDate' is set
        if (pDate == null) {
            throw new ApiException("Missing the required parameter 'pDate' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        // verify the required parameter 'platform' is set
        if (platform == null) {
            throw new ApiException("Missing the required parameter 'platform' when calling openApi2ToolsPioneerProgramAttachmentUploadPost(Async)");
        }

        return openApi2ToolsPioneerProgramAttachmentUploadPostCall(appId, dataFileType, fileData, fileIndex, fileTotalNum, pDate, platform, debugMode, _callback);

    }

    /**
     * 
     * 
     * @param appId 即应用ID，开发者创建应用的唯一标识，可通过应用管理查看 (required)
     * @param dataFileType  (required)
     * @param fileData 文件数据，binary格式 (required)
     * @param fileIndex 当前文件序号，从1开始，最大值为file_total_num (required)
     * @param fileTotalNum p_date - platform - data_file_type维度下总文件数，如“2022-06-12”日“巨量引擎”平台的“后端投放数据”共计3份，则file_total_num为3 (required)
     * @param pDate 数据日期，格式为yyyy-MM-dd (required)
     * @param platform  (required)
     * @param debugMode 是否为调试模式，调试模式下数据不会被最终记录，默认为False (optional)
     * @return ToolsPioneerProgramAttachmentUploadV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ToolsPioneerProgramAttachmentUploadV2Response openApi2ToolsPioneerProgramAttachmentUploadPost(Long appId, ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType, File fileData, Long fileIndex, Long fileTotalNum, String pDate, ToolsPioneerProgramAttachmentUploadV2Platform platform, Boolean debugMode) throws ApiException {
        ApiResponse<ToolsPioneerProgramAttachmentUploadV2Response> localVarResp = openApi2ToolsPioneerProgramAttachmentUploadPostWithHttpInfo(appId, dataFileType, fileData, fileIndex, fileTotalNum, pDate, platform, debugMode);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param appId 即应用ID，开发者创建应用的唯一标识，可通过应用管理查看 (required)
     * @param dataFileType  (required)
     * @param fileData 文件数据，binary格式 (required)
     * @param fileIndex 当前文件序号，从1开始，最大值为file_total_num (required)
     * @param fileTotalNum p_date - platform - data_file_type维度下总文件数，如“2022-06-12”日“巨量引擎”平台的“后端投放数据”共计3份，则file_total_num为3 (required)
     * @param pDate 数据日期，格式为yyyy-MM-dd (required)
     * @param platform  (required)
     * @param debugMode 是否为调试模式，调试模式下数据不会被最终记录，默认为False (optional)
     * @return ApiResponse&lt;ToolsPioneerProgramAttachmentUploadV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ToolsPioneerProgramAttachmentUploadV2Response> openApi2ToolsPioneerProgramAttachmentUploadPostWithHttpInfo(Long appId, ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType, File fileData, Long fileIndex, Long fileTotalNum, String pDate, ToolsPioneerProgramAttachmentUploadV2Platform platform, Boolean debugMode) throws ApiException {
        okhttp3.Call localVarCall = openApi2ToolsPioneerProgramAttachmentUploadPostValidateBeforeCall(appId, dataFileType, fileData, fileIndex, fileTotalNum, pDate, platform, debugMode, null);
        Type localVarReturnType = new TypeToken<ToolsPioneerProgramAttachmentUploadV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param appId 即应用ID，开发者创建应用的唯一标识，可通过应用管理查看 (required)
     * @param dataFileType  (required)
     * @param fileData 文件数据，binary格式 (required)
     * @param fileIndex 当前文件序号，从1开始，最大值为file_total_num (required)
     * @param fileTotalNum p_date - platform - data_file_type维度下总文件数，如“2022-06-12”日“巨量引擎”平台的“后端投放数据”共计3份，则file_total_num为3 (required)
     * @param pDate 数据日期，格式为yyyy-MM-dd (required)
     * @param platform  (required)
     * @param debugMode 是否为调试模式，调试模式下数据不会被最终记录，默认为False (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2ToolsPioneerProgramAttachmentUploadPostAsync(Long appId, ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType, File fileData, Long fileIndex, Long fileTotalNum, String pDate, ToolsPioneerProgramAttachmentUploadV2Platform platform, Boolean debugMode, final ApiCallback<ToolsPioneerProgramAttachmentUploadV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2ToolsPioneerProgramAttachmentUploadPostValidateBeforeCall(appId, dataFileType, fileData, fileIndex, fileTotalNum, pDate, platform, debugMode, _callback);
        Type localVarReturnType = new TypeToken<ToolsPioneerProgramAttachmentUploadV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
