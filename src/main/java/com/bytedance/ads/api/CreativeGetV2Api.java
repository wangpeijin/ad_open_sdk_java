/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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



import com.bytedance.ads.model.CreativeGetV2Filtering;
import com.bytedance.ads.model.CreativeGetV2Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreativeGetV2Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public CreativeGetV2Api() {
        this(Configuration.getDefaultApiClient());
    }

    public CreativeGetV2Api(ApiClient apiClient) {
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
     * Build call for openApi2CreativeGetGet
     * @param advertiserId  (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param fields 查询字段集合, 如果指定, 则返回结果数组中, 每个元素是包含所查询字段的字典，默认全部指定 允许值: \&quot;creative_id\&quot;, \&quot;ad_id\&quot;, \&quot;advertiser_id\&quot;, \&quot;status\&quot;,\&quot;opt_status\&quot;, \&quot;image_mode\&quot;, \&quot;title\&quot;, \&quot;creative_word_ids\&quot;,\&quot;third_party_id\&quot;, \&quot;image_ids\&quot;, \&quot;image_id\&quot;, \&quot;video_id\&quot;,\&quot;materials\&quot; (optional)
     * @param page 页数默认值: 1，page范围为[1,99999]，2022年1月6号生效。 默认走page翻页 (optional, default to 1)
     * @param pageSize 页面大小默认值:10，page_size范围为[1,100]，2022年1月6号生效。默认走page翻页 (optional, default to 10)
     * @param cursor 页码游标值，第一次拉取，无需入参 同时传入时，cursor优先级大于page 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional)
     * @param count 页面数据量 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional, default to 10)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2CreativeGetGetCall(Long advertiserId, CreativeGetV2Filtering filtering, List<String> fields, Long page, Long pageSize, Long cursor, Long count, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/2/creative/get/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (cursor != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("cursor", cursor));
        }

        if (count != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("count", count));
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
    private okhttp3.Call openApi2CreativeGetGetValidateBeforeCall(Long advertiserId, CreativeGetV2Filtering filtering, List<String> fields, Long page, Long pageSize, Long cursor, Long count, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApi2CreativeGetGet(Async)");
        }

        return openApi2CreativeGetGetCall(advertiserId, filtering, fields, page, pageSize, cursor, count, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param fields 查询字段集合, 如果指定, 则返回结果数组中, 每个元素是包含所查询字段的字典，默认全部指定 允许值: \&quot;creative_id\&quot;, \&quot;ad_id\&quot;, \&quot;advertiser_id\&quot;, \&quot;status\&quot;,\&quot;opt_status\&quot;, \&quot;image_mode\&quot;, \&quot;title\&quot;, \&quot;creative_word_ids\&quot;,\&quot;third_party_id\&quot;, \&quot;image_ids\&quot;, \&quot;image_id\&quot;, \&quot;video_id\&quot;,\&quot;materials\&quot; (optional)
     * @param page 页数默认值: 1，page范围为[1,99999]，2022年1月6号生效。 默认走page翻页 (optional, default to 1)
     * @param pageSize 页面大小默认值:10，page_size范围为[1,100]，2022年1月6号生效。默认走page翻页 (optional, default to 10)
     * @param cursor 页码游标值，第一次拉取，无需入参 同时传入时，cursor优先级大于page 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional)
     * @param count 页面数据量 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional, default to 10)
     * @return CreativeGetV2Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public CreativeGetV2Response openApi2CreativeGetGet(Long advertiserId, CreativeGetV2Filtering filtering, List<String> fields, Long page, Long pageSize, Long cursor, Long count) throws ApiException {
        ApiResponse<CreativeGetV2Response> localVarResp = openApi2CreativeGetGetWithHttpInfo(advertiserId, filtering, fields, page, pageSize, cursor, count);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param fields 查询字段集合, 如果指定, 则返回结果数组中, 每个元素是包含所查询字段的字典，默认全部指定 允许值: \&quot;creative_id\&quot;, \&quot;ad_id\&quot;, \&quot;advertiser_id\&quot;, \&quot;status\&quot;,\&quot;opt_status\&quot;, \&quot;image_mode\&quot;, \&quot;title\&quot;, \&quot;creative_word_ids\&quot;,\&quot;third_party_id\&quot;, \&quot;image_ids\&quot;, \&quot;image_id\&quot;, \&quot;video_id\&quot;,\&quot;materials\&quot; (optional)
     * @param page 页数默认值: 1，page范围为[1,99999]，2022年1月6号生效。 默认走page翻页 (optional, default to 1)
     * @param pageSize 页面大小默认值:10，page_size范围为[1,100]，2022年1月6号生效。默认走page翻页 (optional, default to 10)
     * @param cursor 页码游标值，第一次拉取，无需入参 同时传入时，cursor优先级大于page 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional)
     * @param count 页面数据量 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional, default to 10)
     * @return ApiResponse&lt;CreativeGetV2Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreativeGetV2Response> openApi2CreativeGetGetWithHttpInfo(Long advertiserId, CreativeGetV2Filtering filtering, List<String> fields, Long page, Long pageSize, Long cursor, Long count) throws ApiException {
        okhttp3.Call localVarCall = openApi2CreativeGetGetValidateBeforeCall(advertiserId, filtering, fields, page, pageSize, cursor, count, null);
        Type localVarReturnType = new TypeToken<CreativeGetV2Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param filtering 过滤条件，若此字段不传，或传空则视为无限制条件 (optional)
     * @param fields 查询字段集合, 如果指定, 则返回结果数组中, 每个元素是包含所查询字段的字典，默认全部指定 允许值: \&quot;creative_id\&quot;, \&quot;ad_id\&quot;, \&quot;advertiser_id\&quot;, \&quot;status\&quot;,\&quot;opt_status\&quot;, \&quot;image_mode\&quot;, \&quot;title\&quot;, \&quot;creative_word_ids\&quot;,\&quot;third_party_id\&quot;, \&quot;image_ids\&quot;, \&quot;image_id\&quot;, \&quot;video_id\&quot;,\&quot;materials\&quot; (optional)
     * @param page 页数默认值: 1，page范围为[1,99999]，2022年1月6号生效。 默认走page翻页 (optional, default to 1)
     * @param pageSize 页面大小默认值:10，page_size范围为[1,100]，2022年1月6号生效。默认走page翻页 (optional, default to 10)
     * @param cursor 页码游标值，第一次拉取，无需入参 同时传入时，cursor优先级大于page 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional)
     * @param count 页面数据量 注：page+page_size与cursor+count为两种分页方式 cursor+count适用于获取数据记录数≥10000的场景 (optional, default to 10)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApi2CreativeGetGetAsync(Long advertiserId, CreativeGetV2Filtering filtering, List<String> fields, Long page, Long pageSize, Long cursor, Long count, final ApiCallback<CreativeGetV2Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApi2CreativeGetGetValidateBeforeCall(advertiserId, filtering, fields, page, pageSize, cursor, count, _callback);
        Type localVarReturnType = new TypeToken<CreativeGetV2Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
