/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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



import com.bytedance.ads.model.DouplusOptionalItemsListV30ExternalAction;
import com.bytedance.ads.model.DouplusOptionalItemsListV30Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DouplusOptionalItemsListV30Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DouplusOptionalItemsListV30Api() {
        this(Configuration.getDefaultApiClient());
    }

    public DouplusOptionalItemsListV30Api(ApiClient apiClient) {
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
     * Build call for openApiV30DouplusOptionalItemsListGet
     * @param awemeSecUid  (required)
     * @param externalAction 投放目的，将返回对应投放目的下的可投视频清单 1. LIKE_COMMENT_AMOUNT 点赞评论量 2. FOLLOWER_COUNT 粉丝量 3. VIDEO_PLAYBACK_VOLUME 视频播放量 4. DY_PRIVATE_MESSAGES 抖音私信 5. HIGH_INTERACTION_QUALITY 互动质量高 6. HIGH_INTERACTION_FREQUENCY 互动数量多 7. ONLY_FOR_ACTIVATION 激活 8. COMMENT_LINK_CLICK 评论链接点击 9. LIVE_ROOM_POPULARITY 直播间人气 10. LIVE_ROOM_FOLLOWER_INCREASE 直播间涨粉 11. VIEWER_DONATION 观众打赏 12. VIEWER_INTERACTION 观众互动 (required)
     * @param awemeId 需要拉取视频的抖音号id (required)
     * @param count 单页拉取视频数 允许值：1- 20 (required)
     * @param cursor 游标，翻页使用 最小值：0 翻页使用，第一页传0，第二页开始，需要传前一页resp返回的cursor (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOptionalItemsListGetCall(String awemeSecUid, DouplusOptionalItemsListV30ExternalAction externalAction, String awemeId, Long count, Long cursor, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v3.0/douplus/optional_items/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (awemeSecUid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_sec_uid", awemeSecUid));
        }

        if (externalAction != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_action", externalAction));
        }

        if (awemeId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("aweme_id", awemeId));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
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
    private okhttp3.Call openApiV30DouplusOptionalItemsListGetValidateBeforeCall(String awemeSecUid, DouplusOptionalItemsListV30ExternalAction externalAction, String awemeId, Long count, Long cursor, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'awemeSecUid' is set
        if (awemeSecUid == null) {
            throw new ApiException("Missing the required parameter 'awemeSecUid' when calling openApiV30DouplusOptionalItemsListGet(Async)");
        }

        // verify the required parameter 'externalAction' is set
        if (externalAction == null) {
            throw new ApiException("Missing the required parameter 'externalAction' when calling openApiV30DouplusOptionalItemsListGet(Async)");
        }

        // verify the required parameter 'awemeId' is set
        if (awemeId == null) {
            throw new ApiException("Missing the required parameter 'awemeId' when calling openApiV30DouplusOptionalItemsListGet(Async)");
        }

        // verify the required parameter 'count' is set
        if (count == null) {
            throw new ApiException("Missing the required parameter 'count' when calling openApiV30DouplusOptionalItemsListGet(Async)");
        }

        // verify the required parameter 'cursor' is set
        if (cursor == null) {
            throw new ApiException("Missing the required parameter 'cursor' when calling openApiV30DouplusOptionalItemsListGet(Async)");
        }

        return openApiV30DouplusOptionalItemsListGetCall(awemeSecUid, externalAction, awemeId, count, cursor, _callback);

    }

    /**
     * 
     * 
     * @param awemeSecUid  (required)
     * @param externalAction 投放目的，将返回对应投放目的下的可投视频清单 1. LIKE_COMMENT_AMOUNT 点赞评论量 2. FOLLOWER_COUNT 粉丝量 3. VIDEO_PLAYBACK_VOLUME 视频播放量 4. DY_PRIVATE_MESSAGES 抖音私信 5. HIGH_INTERACTION_QUALITY 互动质量高 6. HIGH_INTERACTION_FREQUENCY 互动数量多 7. ONLY_FOR_ACTIVATION 激活 8. COMMENT_LINK_CLICK 评论链接点击 9. LIVE_ROOM_POPULARITY 直播间人气 10. LIVE_ROOM_FOLLOWER_INCREASE 直播间涨粉 11. VIEWER_DONATION 观众打赏 12. VIEWER_INTERACTION 观众互动 (required)
     * @param awemeId 需要拉取视频的抖音号id (required)
     * @param count 单页拉取视频数 允许值：1- 20 (required)
     * @param cursor 游标，翻页使用 最小值：0 翻页使用，第一页传0，第二页开始，需要传前一页resp返回的cursor (required)
     * @return DouplusOptionalItemsListV30Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public DouplusOptionalItemsListV30Response openApiV30DouplusOptionalItemsListGet(String awemeSecUid, DouplusOptionalItemsListV30ExternalAction externalAction, String awemeId, Long count, Long cursor) throws ApiException {
        ApiResponse<DouplusOptionalItemsListV30Response> localVarResp = openApiV30DouplusOptionalItemsListGetWithHttpInfo(awemeSecUid, externalAction, awemeId, count, cursor);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param awemeSecUid  (required)
     * @param externalAction 投放目的，将返回对应投放目的下的可投视频清单 1. LIKE_COMMENT_AMOUNT 点赞评论量 2. FOLLOWER_COUNT 粉丝量 3. VIDEO_PLAYBACK_VOLUME 视频播放量 4. DY_PRIVATE_MESSAGES 抖音私信 5. HIGH_INTERACTION_QUALITY 互动质量高 6. HIGH_INTERACTION_FREQUENCY 互动数量多 7. ONLY_FOR_ACTIVATION 激活 8. COMMENT_LINK_CLICK 评论链接点击 9. LIVE_ROOM_POPULARITY 直播间人气 10. LIVE_ROOM_FOLLOWER_INCREASE 直播间涨粉 11. VIEWER_DONATION 观众打赏 12. VIEWER_INTERACTION 观众互动 (required)
     * @param awemeId 需要拉取视频的抖音号id (required)
     * @param count 单页拉取视频数 允许值：1- 20 (required)
     * @param cursor 游标，翻页使用 最小值：0 翻页使用，第一页传0，第二页开始，需要传前一页resp返回的cursor (required)
     * @return ApiResponse&lt;DouplusOptionalItemsListV30Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DouplusOptionalItemsListV30Response> openApiV30DouplusOptionalItemsListGetWithHttpInfo(String awemeSecUid, DouplusOptionalItemsListV30ExternalAction externalAction, String awemeId, Long count, Long cursor) throws ApiException {
        okhttp3.Call localVarCall = openApiV30DouplusOptionalItemsListGetValidateBeforeCall(awemeSecUid, externalAction, awemeId, count, cursor, null);
        Type localVarReturnType = new TypeToken<DouplusOptionalItemsListV30Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param awemeSecUid  (required)
     * @param externalAction 投放目的，将返回对应投放目的下的可投视频清单 1. LIKE_COMMENT_AMOUNT 点赞评论量 2. FOLLOWER_COUNT 粉丝量 3. VIDEO_PLAYBACK_VOLUME 视频播放量 4. DY_PRIVATE_MESSAGES 抖音私信 5. HIGH_INTERACTION_QUALITY 互动质量高 6. HIGH_INTERACTION_FREQUENCY 互动数量多 7. ONLY_FOR_ACTIVATION 激活 8. COMMENT_LINK_CLICK 评论链接点击 9. LIVE_ROOM_POPULARITY 直播间人气 10. LIVE_ROOM_FOLLOWER_INCREASE 直播间涨粉 11. VIEWER_DONATION 观众打赏 12. VIEWER_INTERACTION 观众互动 (required)
     * @param awemeId 需要拉取视频的抖音号id (required)
     * @param count 单页拉取视频数 允许值：1- 20 (required)
     * @param cursor 游标，翻页使用 最小值：0 翻页使用，第一页传0，第二页开始，需要传前一页resp返回的cursor (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV30DouplusOptionalItemsListGetAsync(String awemeSecUid, DouplusOptionalItemsListV30ExternalAction externalAction, String awemeId, Long count, Long cursor, final ApiCallback<DouplusOptionalItemsListV30Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV30DouplusOptionalItemsListGetValidateBeforeCall(awemeSecUid, externalAction, awemeId, count, cursor, _callback);
        Type localVarReturnType = new TypeToken<DouplusOptionalItemsListV30Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
