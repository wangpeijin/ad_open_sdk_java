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



import com.bytedance.ads.model.QianchuanUniPromotionListV10Fields;
import com.bytedance.ads.model.QianchuanUniPromotionListV10Filtering;
import com.bytedance.ads.model.QianchuanUniPromotionListV10MarketingGoal;
import com.bytedance.ads.model.QianchuanUniPromotionListV10OrderField;
import com.bytedance.ads.model.QianchuanUniPromotionListV10OrderType;
import com.bytedance.ads.model.QianchuanUniPromotionListV10PageSize;
import com.bytedance.ads.model.QianchuanUniPromotionListV10Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QianchuanUniPromotionListV10Api {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public QianchuanUniPromotionListV10Api() {
        this(Configuration.getDefaultApiClient());
    }

    public QianchuanUniPromotionListV10Api(ApiClient apiClient) {
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
     * Build call for openApiV10QianchuanUniPromotionListGet
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param marketingGoal  (required)
     * @param fields  (required)
     * @param orderType  (optional)
     * @param orderField  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional)
     * @param filtering 过滤器 (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanUniPromotionListGetCall(Long advertiserId, String startTime, String endTime, QianchuanUniPromotionListV10MarketingGoal marketingGoal, List<QianchuanUniPromotionListV10Fields> fields, QianchuanUniPromotionListV10OrderType orderType, QianchuanUniPromotionListV10OrderField orderField, Integer page, QianchuanUniPromotionListV10PageSize pageSize, QianchuanUniPromotionListV10Filtering filtering, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/open_api/v1.0/qianchuan/uni_promotion/list/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (advertiserId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("advertiser_id", advertiserId));
        }

        if (startTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("start_time", startTime));
        }

        if (endTime != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("end_time", endTime));
        }

        if (marketingGoal != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("marketing_goal", marketingGoal));
        }

        if (fields != null) {
            localVarCollectionQueryParams.addAll(localVarApiClient.parameterToPairs("csv", "fields", fields));
        }

        if (orderType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_type", orderType));
        }

        if (orderField != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_field", orderField));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (filtering != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filtering", filtering));
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
    private okhttp3.Call openApiV10QianchuanUniPromotionListGetValidateBeforeCall(Long advertiserId, String startTime, String endTime, QianchuanUniPromotionListV10MarketingGoal marketingGoal, List<QianchuanUniPromotionListV10Fields> fields, QianchuanUniPromotionListV10OrderType orderType, QianchuanUniPromotionListV10OrderField orderField, Integer page, QianchuanUniPromotionListV10PageSize pageSize, QianchuanUniPromotionListV10Filtering filtering, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'advertiserId' is set
        if (advertiserId == null) {
            throw new ApiException("Missing the required parameter 'advertiserId' when calling openApiV10QianchuanUniPromotionListGet(Async)");
        }

        // verify the required parameter 'startTime' is set
        if (startTime == null) {
            throw new ApiException("Missing the required parameter 'startTime' when calling openApiV10QianchuanUniPromotionListGet(Async)");
        }

        // verify the required parameter 'endTime' is set
        if (endTime == null) {
            throw new ApiException("Missing the required parameter 'endTime' when calling openApiV10QianchuanUniPromotionListGet(Async)");
        }

        // verify the required parameter 'marketingGoal' is set
        if (marketingGoal == null) {
            throw new ApiException("Missing the required parameter 'marketingGoal' when calling openApiV10QianchuanUniPromotionListGet(Async)");
        }

        // verify the required parameter 'fields' is set
        if (fields == null) {
            throw new ApiException("Missing the required parameter 'fields' when calling openApiV10QianchuanUniPromotionListGet(Async)");
        }

        return openApiV10QianchuanUniPromotionListGetCall(advertiserId, startTime, endTime, marketingGoal, fields, orderType, orderField, page, pageSize, filtering, _callback);

    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param marketingGoal  (required)
     * @param fields  (required)
     * @param orderType  (optional)
     * @param orderField  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional)
     * @param filtering 过滤器 (optional)
     * @return QianchuanUniPromotionListV10Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public QianchuanUniPromotionListV10Response openApiV10QianchuanUniPromotionListGet(Long advertiserId, String startTime, String endTime, QianchuanUniPromotionListV10MarketingGoal marketingGoal, List<QianchuanUniPromotionListV10Fields> fields, QianchuanUniPromotionListV10OrderType orderType, QianchuanUniPromotionListV10OrderField orderField, Integer page, QianchuanUniPromotionListV10PageSize pageSize, QianchuanUniPromotionListV10Filtering filtering) throws ApiException {
        ApiResponse<QianchuanUniPromotionListV10Response> localVarResp = openApiV10QianchuanUniPromotionListGetWithHttpInfo(advertiserId, startTime, endTime, marketingGoal, fields, orderType, orderField, page, pageSize, filtering);
        return localVarResp.getData();
    }

    /**
     * 
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param marketingGoal  (required)
     * @param fields  (required)
     * @param orderType  (optional)
     * @param orderField  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional)
     * @param filtering 过滤器 (optional)
     * @return ApiResponse&lt;QianchuanUniPromotionListV10Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<QianchuanUniPromotionListV10Response> openApiV10QianchuanUniPromotionListGetWithHttpInfo(Long advertiserId, String startTime, String endTime, QianchuanUniPromotionListV10MarketingGoal marketingGoal, List<QianchuanUniPromotionListV10Fields> fields, QianchuanUniPromotionListV10OrderType orderType, QianchuanUniPromotionListV10OrderField orderField, Integer page, QianchuanUniPromotionListV10PageSize pageSize, QianchuanUniPromotionListV10Filtering filtering) throws ApiException {
        okhttp3.Call localVarCall = openApiV10QianchuanUniPromotionListGetValidateBeforeCall(advertiserId, startTime, endTime, marketingGoal, fields, orderType, orderField, page, pageSize, filtering, null);
        Type localVarReturnType = new TypeToken<QianchuanUniPromotionListV10Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * 
     * @param advertiserId  (required)
     * @param startTime  (required)
     * @param endTime  (required)
     * @param marketingGoal  (required)
     * @param fields  (required)
     * @param orderType  (optional)
     * @param orderField  (optional)
     * @param page  (optional, default to 1)
     * @param pageSize  (optional)
     * @param filtering 过滤器 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> OK </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call openApiV10QianchuanUniPromotionListGetAsync(Long advertiserId, String startTime, String endTime, QianchuanUniPromotionListV10MarketingGoal marketingGoal, List<QianchuanUniPromotionListV10Fields> fields, QianchuanUniPromotionListV10OrderType orderType, QianchuanUniPromotionListV10OrderField orderField, Integer page, QianchuanUniPromotionListV10PageSize pageSize, QianchuanUniPromotionListV10Filtering filtering, final ApiCallback<QianchuanUniPromotionListV10Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = openApiV10QianchuanUniPromotionListGetValidateBeforeCall(advertiserId, startTime, endTime, marketingGoal, fields, orderType, orderField, page, pageSize, filtering, _callback);
        Type localVarReturnType = new TypeToken<QianchuanUniPromotionListV10Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
