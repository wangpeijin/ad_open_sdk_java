/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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



import com.bytedance.ads.model.StarReportCustomDataTopicReportV2Response;
import com.bytedance.ads.model.StarReportCustomDataTopicReportV2Topics;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarReportCustomDataTopicReportV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarReportCustomDataTopicReportV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarReportCustomDataTopicReportV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarReportCustomDataTopicReportGet
     * @param starId  (required)
     * @param workId 交付作品Id：如视频Id、直播间Id (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现、 DY_SHOP_DATA：抖音进店、 USER_DISTRIBUTION_DATA：用户画像、 INDEX_SCORE_DATA： 指数得分、 COMMENT_DATA：评论数据 直播用户画像仅保留近90天且直播时长 &gt;&#x3D; 25 分钟直播数据 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarReportCustomDataTopicReportGetCall(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicReportV2Topics> topics, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/report/custom_data_topic_report/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (workId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("work_id", workId));
        }

        if (demandId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("demand_id", demandId));
        }

        if (topics != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "topics", topics));
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
    private okhttp3.Call openApi2StarReportCustomDataTopicReportGetValidateBeforeCall(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicReportV2Topics> topics, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarReportCustomDataTopicReportGet(Async)");
        }

        // verify the required parameter 'workId' is set
        if (workId == null) {
            throw new ApiException("Missing the required parameter 'workId' when calling openApi2StarReportCustomDataTopicReportGet(Async)");
        }

        // verify the required parameter 'demandId' is set
        if (demandId == null) {
            throw new ApiException("Missing the required parameter 'demandId' when calling openApi2StarReportCustomDataTopicReportGet(Async)");
        }

        // verify the required parameter 'topics' is set
        if (topics == null) {
            throw new ApiException("Missing the required parameter 'topics' when calling openApi2StarReportCustomDataTopicReportGet(Async)");
        }

        return openApi2StarReportCustomDataTopicReportGetCall(starId, workId, demandId, topics, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param workId 交付作品Id：如视频Id、直播间Id (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现、 DY_SHOP_DATA：抖音进店、 USER_DISTRIBUTION_DATA：用户画像、 INDEX_SCORE_DATA： 指数得分、 COMMENT_DATA：评论数据 直播用户画像仅保留近90天且直播时长 &gt;&#x3D; 25 分钟直播数据 (required)
     * @return StarReportCustomDataTopicReportV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarReportCustomDataTopicReportV2Response openApi2StarReportCustomDataTopicReportGet(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicReportV2Topics> topics) throws ApiException {
        ApiResponse<StarReportCustomDataTopicReportV2Response> localVarResp = openApi2StarReportCustomDataTopicReportGetWithHttpInfo(starId, workId, demandId, topics);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param workId 交付作品Id：如视频Id、直播间Id (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现、 DY_SHOP_DATA：抖音进店、 USER_DISTRIBUTION_DATA：用户画像、 INDEX_SCORE_DATA： 指数得分、 COMMENT_DATA：评论数据 直播用户画像仅保留近90天且直播时长 &gt;&#x3D; 25 分钟直播数据 (required)
     * @return ApiResponse&lt;StarReportCustomDataTopicReportV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarReportCustomDataTopicReportV2Response> openApi2StarReportCustomDataTopicReportGetWithHttpInfo(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicReportV2Topics> topics) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarReportCustomDataTopicReportGetValidateBeforeCall(starId, workId, demandId, topics, null);
        Type localVarReturnType = new TypeToken<StarReportCustomDataTopicReportV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param workId 交付作品Id：如视频Id、直播间Id (required)
     * @param demandId 任务id (required)
     * @param topics 数据主题: BASIC_DATA：基础信息、 FLOW_DATA：流量表现、 CONVERT_DATA：转化表现、 SEARCH_DATA：搜索表现、 RECOMMEND_DATA： 种草表现、 DY_SHOP_DATA：抖音进店、 USER_DISTRIBUTION_DATA：用户画像、 INDEX_SCORE_DATA： 指数得分、 COMMENT_DATA：评论数据 直播用户画像仅保留近90天且直播时长 &gt;&#x3D; 25 分钟直播数据 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarReportCustomDataTopicReportGetAsync(Long starId, Long workId, Long demandId, List<StarReportCustomDataTopicReportV2Topics> topics, final ApiCallback<StarReportCustomDataTopicReportV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarReportCustomDataTopicReportGetValidateBeforeCall(starId, workId, demandId, topics, _callback);
        Type localVarReturnType = new TypeToken<StarReportCustomDataTopicReportV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
