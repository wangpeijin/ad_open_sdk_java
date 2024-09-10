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



import com.bytedance.ads.model.StarDemandOmGetDemandListV2Response;
import com.bytedance.ads.model.StarDemandOmGetDemandListV2UniversalSettlementType;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StarDemandOmGetDemandListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public StarDemandOmGetDemandListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public StarDemandOmGetDemandListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2StarDemandOmGetDemandListGet
     * @param starId 客户星图ID (required)
     * @param pageNo page (required)
     * @param pageSize limit (required)
     * @param universalSettlementType 结算方式 枚举，付费分佣、广告分成 (optional)
     * @param microAppId 小程序ID (optional)
     * @param createStartTime 任务开始时间 (optional)
     * @param createEndTime 任务结束时间 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOmGetDemandListGetCall(Long starId, Integer pageNo, Integer pageSize, StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType, String microAppId, Long createStartTime, Long createEndTime, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/star/demand/om_get_demand_list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (starId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("star_id", starId));
        }

        if (universalSettlementType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("universal_settlement_type", universalSettlementType));
        }

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (microAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("micro_app_id", microAppId));
        }

        if (createStartTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("create_start_time", createStartTime));
        }

        if (createEndTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("create_end_time", createEndTime));
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
    private okhttp3.Call openApi2StarDemandOmGetDemandListGetValidateBeforeCall(Long starId, Integer pageNo, Integer pageSize, StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType, String microAppId, Long createStartTime, Long createEndTime, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'starId' is set
        if (starId == null) {
            throw new ApiException("Missing the required parameter 'starId' when calling openApi2StarDemandOmGetDemandListGet(Async)");
        }

        // verify the required parameter 'pageNo' is set
        if (pageNo == null) {
            throw new ApiException("Missing the required parameter 'pageNo' when calling openApi2StarDemandOmGetDemandListGet(Async)");
        }

        // verify the required parameter 'pageSize' is set
        if (pageSize == null) {
            throw new ApiException("Missing the required parameter 'pageSize' when calling openApi2StarDemandOmGetDemandListGet(Async)");
        }

        return openApi2StarDemandOmGetDemandListGetCall(starId, pageNo, pageSize, universalSettlementType, microAppId, createStartTime, createEndTime, _callback);

    }

    /**
     * 
     * 
     * @param starId 客户星图ID (required)
     * @param pageNo page (required)
     * @param pageSize limit (required)
     * @param universalSettlementType 结算方式 枚举，付费分佣、广告分成 (optional)
     * @param microAppId 小程序ID (optional)
     * @param createStartTime 任务开始时间 (optional)
     * @param createEndTime 任务结束时间 (optional)
     * @return StarDemandOmGetDemandListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public StarDemandOmGetDemandListV2Response openApi2StarDemandOmGetDemandListGet(Long starId, Integer pageNo, Integer pageSize, StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType, String microAppId, Long createStartTime, Long createEndTime) throws ApiException {
        ApiResponse<StarDemandOmGetDemandListV2Response> localVarResp = openApi2StarDemandOmGetDemandListGetWithHttpInfo(starId, pageNo, pageSize, universalSettlementType, microAppId, createStartTime, createEndTime);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param starId 客户星图ID (required)
     * @param pageNo page (required)
     * @param pageSize limit (required)
     * @param universalSettlementType 结算方式 枚举，付费分佣、广告分成 (optional)
     * @param microAppId 小程序ID (optional)
     * @param createStartTime 任务开始时间 (optional)
     * @param createEndTime 任务结束时间 (optional)
     * @return ApiResponse&lt;StarDemandOmGetDemandListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<StarDemandOmGetDemandListV2Response> openApi2StarDemandOmGetDemandListGetWithHttpInfo(Long starId, Integer pageNo, Integer pageSize, StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType, String microAppId, Long createStartTime, Long createEndTime) throws ApiException {
        okhttp3.Call localVarCall = openApi2StarDemandOmGetDemandListGetValidateBeforeCall(starId, pageNo, pageSize, universalSettlementType, microAppId, createStartTime, createEndTime, null);
        Type localVarReturnType = new TypeToken<StarDemandOmGetDemandListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param starId 客户星图ID (required)
     * @param pageNo page (required)
     * @param pageSize limit (required)
     * @param universalSettlementType 结算方式 枚举，付费分佣、广告分成 (optional)
     * @param microAppId 小程序ID (optional)
     * @param createStartTime 任务开始时间 (optional)
     * @param createEndTime 任务结束时间 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2StarDemandOmGetDemandListGetAsync(Long starId, Integer pageNo, Integer pageSize, StarDemandOmGetDemandListV2UniversalSettlementType universalSettlementType, String microAppId, Long createStartTime, Long createEndTime, final ApiCallback<StarDemandOmGetDemandListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2StarDemandOmGetDemandListGetValidateBeforeCall(starId, pageNo, pageSize, universalSettlementType, microAppId, createStartTime, createEndTime, _callback);
        Type localVarReturnType = new TypeToken<StarDemandOmGetDemandListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
