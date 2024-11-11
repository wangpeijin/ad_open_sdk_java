/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.EventManagerEventsCreateV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.EventManagerEventsCreateV2Request;
import com.bytedance.ads.model.EventManagerEventsCreateV2Response;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/event_manager/events/create/ POST
public class EventManagerEventsCreateV2ApiExample {

    private static final EventManagerEventsCreateV2Api api = new EventManagerEventsCreateV2Api();

    public static void main(String[] args) throws ApiException {
        EventManagerEventsCreateV2Request eventManagerEventsCreateV2Request = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        EventManagerEventsCreateV2Response response = api.openApi2EventManagerEventsCreatePost(eventManagerEventsCreateV2Request);
        System.out.println(response);
    }

}