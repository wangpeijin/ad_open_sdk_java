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
import com.bytedance.ads.api.FileImageAdvertiserV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.FileImageAdvertiserV2Response;
import com.bytedance.ads.model.FileImageAdvertiserV2UploadTo;
import com.bytedance.ads.model.FileImageAdvertiserV2UploadType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/image/advertiser/ POST
public class FileImageAdvertiserV2ApiExample {

    private static final FileImageAdvertiserV2Api api = new FileImageAdvertiserV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        FileImageAdvertiserV2UploadTo uploadTo = null;
        FileImageAdvertiserV2UploadType uploadType = null;
        File imageFile = null;
        String imageSignature = null;
        String imageUrl = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileImageAdvertiserV2Response response = api.openApi2FileImageAdvertiserPost(advertiserId, uploadTo, uploadType, imageFile, imageSignature, imageUrl);
        System.out.println(response);
    }

}