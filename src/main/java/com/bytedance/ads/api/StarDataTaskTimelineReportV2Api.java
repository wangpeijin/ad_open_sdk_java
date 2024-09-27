/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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



import com.bytedance.ads.model.StarDataTaskTimelineReportV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarDataTaskTimelineReportV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarDataTaskTimelineReportV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarDataTaskTimelineReportV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarDataTaskTimelineReportGet
     * @param starId 客户星图id (required)
     * @param partition 时间分区，格式 yyyyMMdd (required)
     * @param outerProjectIdList 外部项目ID (optional)
     * @param outerTaskIdList 外部任务ID (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDataTaskTimelineReportGetCall(Long starId, String partition, List<String> outerProjectIdList, List<String> outerTaskIdList, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/data/task_timeline_report/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (outerProjectIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "outer_project_id_list", outerProjectIdList));
        }

        if (outerTaskIdList != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "outer_task_id_list", outerTaskIdList));
        }

        if (partition != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("partition", partition));
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
    private okhttp3.Call openApi2StarDataTaskTimelineReportGetValidateBeforeCall(Long starId, String partition, List<String> outerProjectIdList, List<String> outerTaskIdList, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarDataTaskTimelineReportGet(Async)");
        }

        // verify the required parameter 'partition' is set
        if (partition == null) {
            throw new ApiException("Missing the required parameter 'partition' when calling openApi2StarDataTaskTimelineReportGet(Async)");
        }

        return openApi2StarDataTaskTimelineReportGetCall(starId, partition, outerProjectIdList, outerTaskIdList, _callback);

    }

    /**
     * 
     * 
     * @param starId 客户星图id (required)
     * @param partition 时间分区，格式 yyyyMMdd (required)
     * @param outerProjectIdList 外部项目ID (optional)
     * @param outerTaskIdList 外部任务ID (optional)
     * @return StarDataTaskTimelineReportV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarDataTaskTimelineReportV2Response openApi2StarDataTaskTimelineReportGet(Long starId, String partition, List<String> outerProjectIdList, List<String> outerTaskIdList) throws ApiException {
        ApiResponse<StarDataTaskTimelineReportV2Response> localVarResp = openApi2StarDataTaskTimelineReportGetWithHttpInfo(starId, partition, outerProjectIdList, outerTaskIdList);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 客户星图id (required)
     * @param partition 时间分区，格式 yyyyMMdd (required)
     * @param outerProjectIdList 外部项目ID (optional)
     * @param outerTaskIdList 外部任务ID (optional)
     * @return ApiResponse&lt;StarDataTaskTimelineReportV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarDataTaskTimelineReportV2Response> openApi2StarDataTaskTimelineReportGetWithHttpInfo(Long starId, String partition, List<String> outerProjectIdList, List<String> outerTaskIdList) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarDataTaskTimelineReportGetValidateBeforeCall(starId, partition, outerProjectIdList, outerTaskIdList, null);
        Type localVarReturnType = new TypeToken<StarDataTaskTimelineReportV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 客户星图id (required)
     * @param partition 时间分区，格式 yyyyMMdd (required)
     * @param outerProjectIdList 外部项目ID (optional)
     * @param outerTaskIdList 外部任务ID (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDataTaskTimelineReportGetAsync(Long starId, String partition, List<String> outerProjectIdList, List<String> outerTaskIdList, final ApiCallback<StarDataTaskTimelineReportV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarDataTaskTimelineReportGetValidateBeforeCall(starId, partition, outerProjectIdList, outerTaskIdList, _callback);
        Type localVarReturnType = new TypeToken<StarDataTaskTimelineReportV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
