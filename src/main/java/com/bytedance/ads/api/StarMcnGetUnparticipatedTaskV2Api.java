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



import com.bytedance.ads.model.StarMcnGetUnparticipatedTaskV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarMcnGetUnparticipatedTaskV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarMcnGetUnparticipatedTaskV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarMcnGetUnparticipatedTaskV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarMcnGetUnparticipatedTaskGet
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp  (optional)
     * @param maxCreateTimeStamp  (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param keyword  (optional)
     * @param settlementType  (optional)
     * @param playletCategory  (optional)
     * @param playletTheme  (optional)
     * @param playletGender  (optional)
     * @param playletHot  (optional)
     * @param playletFirstWeek  (optional)
     * @param playletSecondWeek  (optional)
     * @param highProfitChallenge  (optional)
     * @param developerId  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnGetUnparticipatedTaskGetCall(Long starId, Integer page, Integer pageSize, Integer payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, String keyword, Integer settlementType, Integer playletCategory, List<Integer> playletTheme, Integer playletGender, Integer playletHot, Integer playletFirstWeek, Integer playletSecondWeek, Integer highProfitChallenge, Long developerId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/mcn/get_unparticipated_task/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (payType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pay_type", payType));
        }

        if (minCreateTimeStamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("min_create_time_stamp", minCreateTimeStamp));
        }

        if (maxCreateTimeStamp != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("max_create_time_stamp", maxCreateTimeStamp));
        }

        if (firstClassCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("first_class_category", firstClassCategory));
        }

        if (secondClassCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("second_class_category", secondClassCategory));
        }

        if (keyword != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("keyword", keyword));
        }

        if (settlementType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("settlement_type", settlementType));
        }

        if (playletCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playlet_category", playletCategory));
        }

        if (playletTheme != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "playlet_theme", playletTheme));
        }

        if (playletGender != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playlet_gender", playletGender));
        }

        if (playletHot != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playlet_hot", playletHot));
        }

        if (playletFirstWeek != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playlet_first_week", playletFirstWeek));
        }

        if (playletSecondWeek != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("playlet_second_week", playletSecondWeek));
        }

        if (highProfitChallenge != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("high_profit_challenge", highProfitChallenge));
        }

        if (developerId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("developer_id", developerId));
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
    private okhttp3.Call openApi2StarMcnGetUnparticipatedTaskGetValidateBeforeCall(Long starId, Integer page, Integer pageSize, Integer payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, String keyword, Integer settlementType, Integer playletCategory, List<Integer> playletTheme, Integer playletGender, Integer playletHot, Integer playletFirstWeek, Integer playletSecondWeek, Integer highProfitChallenge, Long developerId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarMcnGetUnparticipatedTaskGet(Async)");
        }

        // verify the required parameter 'page' is set
        if (page == null) {
            throw new ApiException("Missing the required parameter 'page' when calling openApi2StarMcnGetUnparticipatedTaskGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2StarMcnGetUnparticipatedTaskGet(Async)");
        }

        return openApi2StarMcnGetUnparticipatedTaskGetCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, keyword, settlementType, playletCategory, playletTheme, playletGender, playletHot, playletFirstWeek, playletSecondWeek, highProfitChallenge, developerId, _callback);

    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp  (optional)
     * @param maxCreateTimeStamp  (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param keyword  (optional)
     * @param settlementType  (optional)
     * @param playletCategory  (optional)
     * @param playletTheme  (optional)
     * @param playletGender  (optional)
     * @param playletHot  (optional)
     * @param playletFirstWeek  (optional)
     * @param playletSecondWeek  (optional)
     * @param highProfitChallenge  (optional)
     * @param developerId  (optional)
     * @return StarMcnGetUnparticipatedTaskV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarMcnGetUnparticipatedTaskV2Response openApi2StarMcnGetUnparticipatedTaskGet(Long starId, Integer page, Integer pageSize, Integer payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, String keyword, Integer settlementType, Integer playletCategory, List<Integer> playletTheme, Integer playletGender, Integer playletHot, Integer playletFirstWeek, Integer playletSecondWeek, Integer highProfitChallenge, Long developerId) throws ApiException {
        ApiResponse<StarMcnGetUnparticipatedTaskV2Response> localVarResp = openApi2StarMcnGetUnparticipatedTaskGetWithHttpInfo(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, keyword, settlementType, playletCategory, playletTheme, playletGender, playletHot, playletFirstWeek, playletSecondWeek, highProfitChallenge, developerId);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp  (optional)
     * @param maxCreateTimeStamp  (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param keyword  (optional)
     * @param settlementType  (optional)
     * @param playletCategory  (optional)
     * @param playletTheme  (optional)
     * @param playletGender  (optional)
     * @param playletHot  (optional)
     * @param playletFirstWeek  (optional)
     * @param playletSecondWeek  (optional)
     * @param highProfitChallenge  (optional)
     * @param developerId  (optional)
     * @return ApiResponse&lt;StarMcnGetUnparticipatedTaskV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarMcnGetUnparticipatedTaskV2Response> openApi2StarMcnGetUnparticipatedTaskGetWithHttpInfo(Long starId, Integer page, Integer pageSize, Integer payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, String keyword, Integer settlementType, Integer playletCategory, List<Integer> playletTheme, Integer playletGender, Integer playletHot, Integer playletFirstWeek, Integer playletSecondWeek, Integer highProfitChallenge, Long developerId) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarMcnGetUnparticipatedTaskGetValidateBeforeCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, keyword, settlementType, playletCategory, playletTheme, playletGender, playletHot, playletFirstWeek, playletSecondWeek, highProfitChallenge, developerId, null);
        Type localVarReturnType = new TypeToken<StarMcnGetUnparticipatedTaskV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId  (required)
     * @param page  (required)
     * @param pageSize  (required)
     * @param payType  (optional)
     * @param minCreateTimeStamp  (optional)
     * @param maxCreateTimeStamp  (optional)
     * @param firstClassCategory  (optional)
     * @param secondClassCategory  (optional)
     * @param keyword  (optional)
     * @param settlementType  (optional)
     * @param playletCategory  (optional)
     * @param playletTheme  (optional)
     * @param playletGender  (optional)
     * @param playletHot  (optional)
     * @param playletFirstWeek  (optional)
     * @param playletSecondWeek  (optional)
     * @param highProfitChallenge  (optional)
     * @param developerId  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarMcnGetUnparticipatedTaskGetAsync(Long starId, Integer page, Integer pageSize, Integer payType, Long minCreateTimeStamp, Long maxCreateTimeStamp, Integer firstClassCategory, Integer secondClassCategory, String keyword, Integer settlementType, Integer playletCategory, List<Integer> playletTheme, Integer playletGender, Integer playletHot, Integer playletFirstWeek, Integer playletSecondWeek, Integer highProfitChallenge, Long developerId, final ApiCallback<StarMcnGetUnparticipatedTaskV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarMcnGetUnparticipatedTaskGetValidateBeforeCall(starId, page, pageSize, payType, minCreateTimeStamp, maxCreateTimeStamp, firstClassCategory, secondClassCategory, keyword, settlementType, playletCategory, playletTheme, playletGender, playletHot, playletFirstWeek, playletSecondWeek, highProfitChallenge, developerId, _callback);
        Type localVarReturnType = new TypeToken<StarMcnGetUnparticipatedTaskV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
