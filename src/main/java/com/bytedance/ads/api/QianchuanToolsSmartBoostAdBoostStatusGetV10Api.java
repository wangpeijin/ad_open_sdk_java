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



import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostStatusGetV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanToolsSmartBoostAdBoostStatusGetV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanToolsSmartBoostAdBoostStatusGetV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanToolsSmartBoostAdBoostStatusGetV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet
     * @param advertiserId 千川广告主账户ID。 (required)
     * @param adIds 广告计划id，限制1-10个。 (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetCall(Long advertiserId, List<Long> adIds, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/tools/smart_boost/ad_boost/status/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (adIds != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "ad_ids", adIds));
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
    private okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetValidateBeforeCall(Long advertiserId, List<Long> adIds, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet(Async)");
        }

        // verify the required parameter 'adIds' is set
        if (adIds == null) {
            throw new ApiException("Missing the required parameter 'adIds' when calling openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet(Async)");
        }

        return openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetCall(advertiserId, adIds, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主账户ID。 (required)
     * @param adIds 广告计划id，限制1-10个。 (required)
     * @return QianchuanToolsSmartBoostAdBoostStatusGetV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanToolsSmartBoostAdBoostStatusGetV10Response openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGet(Long advertiserId, List<Long> adIds) throws ApiException {
        ApiResponse<QianchuanToolsSmartBoostAdBoostStatusGetV10Response> localVarResp = openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetWithHttpInfo(advertiserId, adIds);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 千川广告主账户ID。 (required)
     * @param adIds 广告计划id，限制1-10个。 (required)
     * @return ApiResponse&lt;QianchuanToolsSmartBoostAdBoostStatusGetV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanToolsSmartBoostAdBoostStatusGetV10Response> openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetWithHttpInfo(Long advertiserId, List<Long> adIds) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetValidateBeforeCall(advertiserId, adIds, null);
        Type localVarReturnType = new TypeToken<QianchuanToolsSmartBoostAdBoostStatusGetV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 千川广告主账户ID。 (required)
     * @param adIds 广告计划id，限制1-10个。 (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetAsync(Long advertiserId, List<Long> adIds, final ApiCallback<QianchuanToolsSmartBoostAdBoostStatusGetV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanToolsSmartBoostAdBoostStatusGetGetValidateBeforeCall(advertiserId, adIds, _callback);
        Type localVarReturnType = new TypeToken<QianchuanToolsSmartBoostAdBoostStatusGetV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
