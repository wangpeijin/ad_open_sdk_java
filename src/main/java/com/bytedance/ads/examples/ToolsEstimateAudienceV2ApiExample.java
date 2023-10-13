/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.examples;

import com.bytedance.ads.ApiException;
import com.bytedance.ads.api.ToolsEstimateAudienceV2Api;
import com.bytedance.ads.ApiClient;
import com.bytedance.ads.model.AdGetV2ResponseDataAudienceGeolocationInner;
import com.bytedance.ads.model.ToolsBidSuggestV2ExcludeCustomActionsInner;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Ac;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ActionDays;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ActivateType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Age;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AndroidOsv;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AppBehaviorTarget;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ArticleCategory;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AutoExtendEnabled;
import com.bytedance.ads.model.ToolsEstimateAudienceV2AutoExtendTargets;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Carrier;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DeviceBrand;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DeviceType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2District;
import com.bytedance.ads.model.ToolsEstimateAudienceV2DpaLocalAudience;
import com.bytedance.ads.model.ToolsEstimateAudienceV2FilterAwemeAbnormalActive;
import com.bytedance.ads.model.ToolsEstimateAudienceV2FilterOwnAwemeFans;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Gender;
import com.bytedance.ads.model.ToolsEstimateAudienceV2InterestActionMode;
import com.bytedance.ads.model.ToolsEstimateAudienceV2IosOsv;
import com.bytedance.ads.model.ToolsEstimateAudienceV2LocationType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Platform;
import com.bytedance.ads.model.ToolsEstimateAudienceV2Response;
import com.bytedance.ads.model.ToolsEstimateAudienceV2RetargetingType;
import com.bytedance.ads.model.ToolsEstimateAudienceV2SuperiorPopularityType;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// url: https://api.oceanengine.com/open_api/2/tools/estimate_audience/ GET
public class ToolsEstimateAudienceV2ApiExample {

    private static final ToolsEstimateAudienceV2Api api = new ToolsEstimateAudienceV2Api();

    public static void main(String[] args) throws ApiException {
        List<ToolsEstimateAudienceV2Ac> ac = null;
        List<Long> actionCategories = null;
        ToolsEstimateAudienceV2ActionDays actionDays = null;
        List<Long> actionWords = null;
        List<ToolsEstimateAudienceV2ActivateType> activateType = null;
        List<Long> adTag = null;
        Long advertiserId = null;
        List<ToolsEstimateAudienceV2Age> age = null;
        ToolsEstimateAudienceV2AndroidOsv androidOsv = null;
        ToolsEstimateAudienceV2AppBehaviorTarget appBehaviorTarget = null;
        List<Long> appCategory = null;
        List<Long> appIds = null;
        List<ToolsEstimateAudienceV2ArticleCategory> articleCategory = null;
        Long audiencePackageId = null;
        ToolsEstimateAudienceV2AutoExtendEnabled autoExtendEnabled = null;
        List<ToolsEstimateAudienceV2AutoExtendTargets> autoExtendTargets = null;
        List<Long> awemeFansNumbers = null;
        List<ToolsEstimateAudienceV2Carrier> carrier = null;
        List<Long> city = null;
        List<ToolsEstimateAudienceV2DeviceBrand> deviceBrand = null;
        List<ToolsEstimateAudienceV2DeviceType> deviceType = null;
        ToolsEstimateAudienceV2District district = null;
        ToolsEstimateAudienceV2DpaLocalAudience dpaLocalAudience = null;
        List<ToolsBidSuggestV2ExcludeCustomActionsInner> excludeCustomActions = null;
        List<Long> excludeFlowPackage = null;
        ToolsEstimateAudienceV2FilterAwemeAbnormalActive filterAwemeAbnormalActive = null;
        Long filterAwemeFansCount = null;
        ToolsEstimateAudienceV2FilterOwnAwemeFans filterOwnAwemeFans = null;
        List<Long> flowPackage = null;
        ToolsEstimateAudienceV2Gender gender = null;
        List<AdGetV2ResponseDataAudienceGeolocationInner> geolocation = null;
        List<ToolsBidSuggestV2ExcludeCustomActionsInner> includeCustomActions = null;
        ToolsEstimateAudienceV2InterestActionMode interestActionMode = null;
        List<Long> interestCategories = null;
        List<Long> interestTags = null;
        List<Long> interestWords = null;
        ToolsEstimateAudienceV2IosOsv iosOsv = null;
        List<Long> launchPrice = null;
        ToolsEstimateAudienceV2LocationType locationType = null;
        List<ToolsEstimateAudienceV2Platform> platform = null;
        List<Long> retargetingTags = null;
        List<Long> retargetingTagsExclude = null;
        List<Long> retargetingTagsInclude = null;
        ToolsEstimateAudienceV2RetargetingType retargetingType = null;
        ToolsEstimateAudienceV2SuperiorPopularityType superiorPopularityType = null;
        List<Long> userType = null;
        ApiClient apiClient = api.getApiClient();
        apiClient.addDefaultHeader("Access-Token", "");
        apiClient.setDebugging(true);
        api.setApiClient(apiClient);
        ToolsEstimateAudienceV2Response response = api.openApi2ToolsEstimateAudienceGet(ac, actionCategories, actionDays, actionWords, activateType, adTag, advertiserId, age, androidOsv, appBehaviorTarget, appCategory, appIds, articleCategory, audiencePackageId, autoExtendEnabled, autoExtendTargets, awemeFansNumbers, carrier, city, deviceBrand, deviceType, district, dpaLocalAudience, excludeCustomActions, excludeFlowPackage, filterAwemeAbnormalActive, filterAwemeFansCount, filterOwnAwemeFans, flowPackage, gender, geolocation, includeCustomActions, interestActionMode, interestCategories, interestTags, interestWords, iosOsv, launchPrice, locationType, platform, retargetingTags, retargetingTagsExclude, retargetingTagsInclude, retargetingType, superiorPopularityType, userType);
        System.out.println(response);
    }

}