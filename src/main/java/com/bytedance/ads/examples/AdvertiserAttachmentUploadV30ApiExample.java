/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.AdvertiserAttachmentUploadV30Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdvertiserAttachmentUploadV30AttachmentType;
import com.bytedance.ads.model.AdvertiserAttachmentUploadV30Response;
import java.io.File;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/v3.0/advertiser/attachment/upload/ POST
public class AdvertiserAttachmentUploadV30ApiExample {

    private static final AdvertiserAttachmentUploadV30Api api = new AdvertiserAttachmentUploadV30Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        AdvertiserAttachmentUploadV30AttachmentType attachmentType = null;
        String filename = null;
        File imageData = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        AdvertiserAttachmentUploadV30Response response = api.openApiV30AdvertiserAttachmentUploadPost(advertiserId, attachmentType, filename, imageData);
        System.out.println(response);
    }

}