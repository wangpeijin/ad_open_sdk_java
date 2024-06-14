/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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



import com.bytedance.ads.model.FileMaterialListV2MaterialSource;
import com.bytedance.ads.model.FileMaterialListV2PropertiesFilter;
import com.bytedance.ads.model.FileMaterialListV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileMaterialListV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public FileMaterialListV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public FileMaterialListV2Api(ApiClient apiClient) {
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
     * Build call for openApi2FileMaterialListGet
     * @param advertiserId 广告主 id (required)
     * @param materialSource 素材来源，允许值： QIANCHUAN 千川 AD 广告平台 (required)
     * @param propertiesFilter 素材标签过滤项， 允许值： INEFFICIENT_MATERIAL低效素材； SIMILAR_MATERIAL 同质化挤压严重素材； SIMILAR_QUEUE_MATERIAL 同质化素材风险-排队投放素材 AD_HIGH_QUALITY_MATERIAL AD 优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 FIRST_PUBLISH_MATERIAL  首发素材 如果不传，则默认为全部素材标签 (optional)
     * @param startTime 素材创建时间，格式为yyyy-mm-dd HH:MM:SS， 最早允许传入时间：2022-01-01 00:00:00 (optional, default to 2021-01-01 00:00:00)
     * @param endTime 素材结束时间，格式为yyyy-mm-dd HH:MM:SS (optional)
     * @param page 页数默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小默认值:10, 最大值：3000 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileMaterialListGetCall(Long advertiserId, FileMaterialListV2MaterialSource materialSource, List<FileMaterialListV2PropertiesFilter> propertiesFilter, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/file/material/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (materialSource != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("material_source", materialSource));
        }

        if (propertiesFilter != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "properties_filter", propertiesFilter));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call openApi2FileMaterialListGetValidateBeforeCall(Long advertiserId, FileMaterialListV2MaterialSource materialSource, List<FileMaterialListV2PropertiesFilter> propertiesFilter, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2FileMaterialListGet(Async)");
        }

        // verify the required parameter 'materialSource' is set
        if (materialSource == null) {
            throw new ApiException("Missing the required parameter 'materialSource' when calling openApi2FileMaterialListGet(Async)");
        }

        return openApi2FileMaterialListGetCall(advertiserId, materialSource, propertiesFilter, startTime, endTime, page, pageSize, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId 广告主 id (required)
     * @param materialSource 素材来源，允许值： QIANCHUAN 千川 AD 广告平台 (required)
     * @param propertiesFilter 素材标签过滤项， 允许值： INEFFICIENT_MATERIAL低效素材； SIMILAR_MATERIAL 同质化挤压严重素材； SIMILAR_QUEUE_MATERIAL 同质化素材风险-排队投放素材 AD_HIGH_QUALITY_MATERIAL AD 优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 FIRST_PUBLISH_MATERIAL  首发素材 如果不传，则默认为全部素材标签 (optional)
     * @param startTime 素材创建时间，格式为yyyy-mm-dd HH:MM:SS， 最早允许传入时间：2022-01-01 00:00:00 (optional, default to 2021-01-01 00:00:00)
     * @param endTime 素材结束时间，格式为yyyy-mm-dd HH:MM:SS (optional)
     * @param page 页数默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小默认值:10, 最大值：3000 (optional, default to 10)
     * @return FileMaterialListV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public FileMaterialListV2Response openApi2FileMaterialListGet(Long advertiserId, FileMaterialListV2MaterialSource materialSource, List<FileMaterialListV2PropertiesFilter> propertiesFilter, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        ApiResponse<FileMaterialListV2Response> localVarResp = openApi2FileMaterialListGetWithHttpInfo(advertiserId, materialSource, propertiesFilter, startTime, endTime, page, pageSize);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId 广告主 id (required)
     * @param materialSource 素材来源，允许值： QIANCHUAN 千川 AD 广告平台 (required)
     * @param propertiesFilter 素材标签过滤项， 允许值： INEFFICIENT_MATERIAL低效素材； SIMILAR_MATERIAL 同质化挤压严重素材； SIMILAR_QUEUE_MATERIAL 同质化素材风险-排队投放素材 AD_HIGH_QUALITY_MATERIAL AD 优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 FIRST_PUBLISH_MATERIAL  首发素材 如果不传，则默认为全部素材标签 (optional)
     * @param startTime 素材创建时间，格式为yyyy-mm-dd HH:MM:SS， 最早允许传入时间：2022-01-01 00:00:00 (optional, default to 2021-01-01 00:00:00)
     * @param endTime 素材结束时间，格式为yyyy-mm-dd HH:MM:SS (optional)
     * @param page 页数默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小默认值:10, 最大值：3000 (optional, default to 10)
     * @return ApiResponse&lt;FileMaterialListV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<FileMaterialListV2Response> openApi2FileMaterialListGetWithHttpInfo(Long advertiserId, FileMaterialListV2MaterialSource materialSource, List<FileMaterialListV2PropertiesFilter> propertiesFilter, String startTime, String endTime, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = openApi2FileMaterialListGetValidateBeforeCall(advertiserId, materialSource, propertiesFilter, startTime, endTime, page, pageSize, null);
        Type localVarReturnType = new TypeToken<FileMaterialListV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId 广告主 id (required)
     * @param materialSource 素材来源，允许值： QIANCHUAN 千川 AD 广告平台 (required)
     * @param propertiesFilter 素材标签过滤项， 允许值： INEFFICIENT_MATERIAL低效素材； SIMILAR_MATERIAL 同质化挤压严重素材； SIMILAR_QUEUE_MATERIAL 同质化素材风险-排队投放素材 AD_HIGH_QUALITY_MATERIAL AD 优质素材 ECP_HIGH_QUALITY_MATERIAL 千川优质素材 FIRST_PUBLISH_MATERIAL  首发素材 如果不传，则默认为全部素材标签 (optional)
     * @param startTime 素材创建时间，格式为yyyy-mm-dd HH:MM:SS， 最早允许传入时间：2022-01-01 00:00:00 (optional, default to 2021-01-01 00:00:00)
     * @param endTime 素材结束时间，格式为yyyy-mm-dd HH:MM:SS (optional)
     * @param page 页数默认值: 1 (optional, default to 1)
     * @param pageSize 页面大小默认值:10, 最大值：3000 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2FileMaterialListGetAsync(Long advertiserId, FileMaterialListV2MaterialSource materialSource, List<FileMaterialListV2PropertiesFilter> propertiesFilter, String startTime, String endTime, Integer page, Integer pageSize, final ApiCallback<FileMaterialListV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2FileMaterialListGetValidateBeforeCall(advertiserId, materialSource, propertiesFilter, startTime, endTime, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<FileMaterialListV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
