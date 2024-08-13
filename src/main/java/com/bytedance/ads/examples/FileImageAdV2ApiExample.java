/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.FileImageAdV2Api;
import com.bytedance.ads.ApiClient;
import java.io.File;
import com.bytedance.ads.model.FileImageAdV2Response;
import com.bytedance.ads.model.FileImageAdV2UploadType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/file/image/ad/ POST
public class FileImageAdV2ApiExample {

    private static final FileImageAdV2Api api = new FileImageAdV2Api();

    public static void main(String[] args) throws ApiException {
        Long advertiserId = null;
        String filename = null;
        File imageFile = null;
        String imageSignature = null;
        String imageUrl = null;
        Boolean isAigc = null;
        FileImageAdV2UploadType uploadType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        FileImageAdV2Response response = api.openApi2FileImageAdPost(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType);
        System.out.println(response);
    }

}