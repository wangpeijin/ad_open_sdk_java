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


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataAdDownloadStatus;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataAnchorRelatedType;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataAnchorType;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataCreativeAutoGenerateSwitch;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataEnableSmartSource;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataIsCommentDisable;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataIsFeedAndFavSee;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataParamsType;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2AdDataPriorityTrial;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.bytedance.ads.JSON;

/**
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class CreativeCustomCreativeCreateV2RequestAdData {
  public static final String SERIALIZED_NAME_AD_CATEGORY = "ad_category";
  @SerializedName(SERIALIZED_NAME_AD_CATEGORY)
  private Long adCategory = null;

  public static final String SERIALIZED_NAME_AD_DOWNLOAD_STATUS = "ad_download_status";
  @SerializedName(SERIALIZED_NAME_AD_DOWNLOAD_STATUS)
  private CreativeCustomCreativeCreateV2AdDataAdDownloadStatus adDownloadStatus = null;

  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_ANCHOR_ID = "anchor_id";
  @SerializedName(SERIALIZED_NAME_ANCHOR_ID)
  private String anchorId = null;

  public static final String SERIALIZED_NAME_ANCHOR_RELATED_TYPE = "anchor_related_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_RELATED_TYPE)
  private CreativeCustomCreativeCreateV2AdDataAnchorRelatedType anchorRelatedType = null;

  public static final String SERIALIZED_NAME_ANCHOR_TYPE = "anchor_type";
  @SerializedName(SERIALIZED_NAME_ANCHOR_TYPE)
  private CreativeCustomCreativeCreateV2AdDataAnchorType anchorType = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private CreativeCustomCreativeCreateV2AdDataCreativeAutoGenerateSwitch creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_DPA_EXTERNAL_URL_FIELD = "dpa_external_url_field";
  @SerializedName(SERIALIZED_NAME_DPA_EXTERNAL_URL_FIELD)
  private String dpaExternalUrlField = null;

  public static final String SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH = "dynamic_creative_switch";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_CREATIVE_SWITCH)
  private List<CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch> dynamicCreativeSwitch = null;

  public static final String SERIALIZED_NAME_ENABLE_SMART_SOURCE = "enable_smart_source";
  @SerializedName(SERIALIZED_NAME_ENABLE_SMART_SOURCE)
  private CreativeCustomCreativeCreateV2AdDataEnableSmartSource enableSmartSource = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL_PARAMS = "external_url_params";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL_PARAMS)
  private String externalUrlParams = null;

  public static final String SERIALIZED_NAME_IES_CORE_USER_ID = "ies_core_user_id";
  @SerializedName(SERIALIZED_NAME_IES_CORE_USER_ID)
  private String iesCoreUserId = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private CreativeCustomCreativeCreateV2AdDataIsCommentDisable isCommentDisable = null;

  public static final String SERIALIZED_NAME_IS_FEED_AND_FAV_SEE = "is_feed_and_fav_see";
  @SerializedName(SERIALIZED_NAME_IS_FEED_AND_FAV_SEE)
  private CreativeCustomCreativeCreateV2AdDataIsFeedAndFavSee isFeedAndFavSee = null;

  public static final String SERIALIZED_NAME_MINI_PROGRAM_INFO = "mini_program_info";
  @SerializedName(SERIALIZED_NAME_MINI_PROGRAM_INFO)
  private CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo miniProgramInfo = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PARAMS_TYPE = "params_type";
  @SerializedName(SERIALIZED_NAME_PARAMS_TYPE)
  private CreativeCustomCreativeCreateV2AdDataParamsType paramsType = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_PRIORITY_TRIAL = "priority_trial";
  @SerializedName(SERIALIZED_NAME_PRIORITY_TRIAL)
  private CreativeCustomCreativeCreateV2AdDataPriorityTrial priorityTrial = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_SUB_LINK_ID_LIST = "sub_link_id_list";
  @SerializedName(SERIALIZED_NAME_SUB_LINK_ID_LIST)
  private List<Long> subLinkIdList = null;

  public static final String SERIALIZED_NAME_SUPPLEMENTS = "supplements";
  @SerializedName(SERIALIZED_NAME_SUPPLEMENTS)
  private List<CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner> supplements = null;

  public static final String SERIALIZED_NAME_THIRD_INDUSTRY_ID = "third_industry_id";
  @SerializedName(SERIALIZED_NAME_THIRD_INDUSTRY_ID)
  private Long thirdIndustryId = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public CreativeCustomCreativeCreateV2RequestAdData() {
  }

  public CreativeCustomCreativeCreateV2RequestAdData adCategory(Long adCategory) {
    
    this.adCategory = adCategory;
    return this;
  }

   /**
   * 
   * @return adCategory
  **/
  @javax.annotation.Nullable
  public Long getAdCategory() {
    return adCategory;
  }


  public void setAdCategory(Long adCategory) {
    this.adCategory = adCategory;
  }


  public CreativeCustomCreativeCreateV2RequestAdData adDownloadStatus(CreativeCustomCreativeCreateV2AdDataAdDownloadStatus adDownloadStatus) {
    
    this.adDownloadStatus = adDownloadStatus;
    return this;
  }

   /**
   * Get adDownloadStatus
   * @return adDownloadStatus
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataAdDownloadStatus getAdDownloadStatus() {
    return adDownloadStatus;
  }


  public void setAdDownloadStatus(CreativeCustomCreativeCreateV2AdDataAdDownloadStatus adDownloadStatus) {
    this.adDownloadStatus = adDownloadStatus;
  }


  public CreativeCustomCreativeCreateV2RequestAdData adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestAdData addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public CreativeCustomCreativeCreateV2RequestAdData anchorId(String anchorId) {
    
    this.anchorId = anchorId;
    return this;
  }

   /**
   * 
   * @return anchorId
  **/
  @javax.annotation.Nullable
  public String getAnchorId() {
    return anchorId;
  }


  public void setAnchorId(String anchorId) {
    this.anchorId = anchorId;
  }


  public CreativeCustomCreativeCreateV2RequestAdData anchorRelatedType(CreativeCustomCreativeCreateV2AdDataAnchorRelatedType anchorRelatedType) {
    
    this.anchorRelatedType = anchorRelatedType;
    return this;
  }

   /**
   * Get anchorRelatedType
   * @return anchorRelatedType
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataAnchorRelatedType getAnchorRelatedType() {
    return anchorRelatedType;
  }


  public void setAnchorRelatedType(CreativeCustomCreativeCreateV2AdDataAnchorRelatedType anchorRelatedType) {
    this.anchorRelatedType = anchorRelatedType;
  }


  public CreativeCustomCreativeCreateV2RequestAdData anchorType(CreativeCustomCreativeCreateV2AdDataAnchorType anchorType) {
    
    this.anchorType = anchorType;
    return this;
  }

   /**
   * Get anchorType
   * @return anchorType
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataAnchorType getAnchorType() {
    return anchorType;
  }


  public void setAnchorType(CreativeCustomCreativeCreateV2AdDataAnchorType anchorType) {
    this.anchorType = anchorType;
  }


  public CreativeCustomCreativeCreateV2RequestAdData appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public CreativeCustomCreativeCreateV2RequestAdData creativeAutoGenerateSwitch(CreativeCustomCreativeCreateV2AdDataCreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * Get creativeAutoGenerateSwitch
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataCreativeAutoGenerateSwitch getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(CreativeCustomCreativeCreateV2AdDataCreativeAutoGenerateSwitch creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public CreativeCustomCreativeCreateV2RequestAdData dpaExternalUrlField(String dpaExternalUrlField) {
    
    this.dpaExternalUrlField = dpaExternalUrlField;
    return this;
  }

   /**
   * 
   * @return dpaExternalUrlField
  **/
  @javax.annotation.Nullable
  public String getDpaExternalUrlField() {
    return dpaExternalUrlField;
  }


  public void setDpaExternalUrlField(String dpaExternalUrlField) {
    this.dpaExternalUrlField = dpaExternalUrlField;
  }


  public CreativeCustomCreativeCreateV2RequestAdData dynamicCreativeSwitch(List<CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch> dynamicCreativeSwitch) {
    
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestAdData addDynamicCreativeSwitchItem(CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch dynamicCreativeSwitchItem) {
    if (this.dynamicCreativeSwitch == null) {
      this.dynamicCreativeSwitch = new ArrayList<>();
    }
    this.dynamicCreativeSwitch.add(dynamicCreativeSwitchItem);
    return this;
  }

   /**
   * 
   * @return dynamicCreativeSwitch
  **/
  @javax.annotation.Nullable
  public List<CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch> getDynamicCreativeSwitch() {
    return dynamicCreativeSwitch;
  }


  public void setDynamicCreativeSwitch(List<CreativeCustomCreativeCreateV2AdDataDynamicCreativeSwitch> dynamicCreativeSwitch) {
    this.dynamicCreativeSwitch = dynamicCreativeSwitch;
  }


  public CreativeCustomCreativeCreateV2RequestAdData enableSmartSource(CreativeCustomCreativeCreateV2AdDataEnableSmartSource enableSmartSource) {
    
    this.enableSmartSource = enableSmartSource;
    return this;
  }

   /**
   * Get enableSmartSource
   * @return enableSmartSource
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataEnableSmartSource getEnableSmartSource() {
    return enableSmartSource;
  }


  public void setEnableSmartSource(CreativeCustomCreativeCreateV2AdDataEnableSmartSource enableSmartSource) {
    this.enableSmartSource = enableSmartSource;
  }


  public CreativeCustomCreativeCreateV2RequestAdData externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public CreativeCustomCreativeCreateV2RequestAdData externalUrlParams(String externalUrlParams) {
    
    this.externalUrlParams = externalUrlParams;
    return this;
  }

   /**
   * 
   * @return externalUrlParams
  **/
  @javax.annotation.Nullable
  public String getExternalUrlParams() {
    return externalUrlParams;
  }


  public void setExternalUrlParams(String externalUrlParams) {
    this.externalUrlParams = externalUrlParams;
  }


  public CreativeCustomCreativeCreateV2RequestAdData iesCoreUserId(String iesCoreUserId) {
    
    this.iesCoreUserId = iesCoreUserId;
    return this;
  }

   /**
   * 
   * @return iesCoreUserId
  **/
  @javax.annotation.Nullable
  public String getIesCoreUserId() {
    return iesCoreUserId;
  }


  public void setIesCoreUserId(String iesCoreUserId) {
    this.iesCoreUserId = iesCoreUserId;
  }


  public CreativeCustomCreativeCreateV2RequestAdData isCommentDisable(CreativeCustomCreativeCreateV2AdDataIsCommentDisable isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * Get isCommentDisable
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataIsCommentDisable getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(CreativeCustomCreativeCreateV2AdDataIsCommentDisable isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public CreativeCustomCreativeCreateV2RequestAdData isFeedAndFavSee(CreativeCustomCreativeCreateV2AdDataIsFeedAndFavSee isFeedAndFavSee) {
    
    this.isFeedAndFavSee = isFeedAndFavSee;
    return this;
  }

   /**
   * Get isFeedAndFavSee
   * @return isFeedAndFavSee
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataIsFeedAndFavSee getIsFeedAndFavSee() {
    return isFeedAndFavSee;
  }


  public void setIsFeedAndFavSee(CreativeCustomCreativeCreateV2AdDataIsFeedAndFavSee isFeedAndFavSee) {
    this.isFeedAndFavSee = isFeedAndFavSee;
  }


  public CreativeCustomCreativeCreateV2RequestAdData miniProgramInfo(CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo miniProgramInfo) {
    
    this.miniProgramInfo = miniProgramInfo;
    return this;
  }

   /**
   * Get miniProgramInfo
   * @return miniProgramInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo getMiniProgramInfo() {
    return miniProgramInfo;
  }


  public void setMiniProgramInfo(CreativeCustomCreativeCreateV2RequestAdDataMiniProgramInfo miniProgramInfo) {
    this.miniProgramInfo = miniProgramInfo;
  }


  public CreativeCustomCreativeCreateV2RequestAdData openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public CreativeCustomCreativeCreateV2RequestAdData paramsType(CreativeCustomCreativeCreateV2AdDataParamsType paramsType) {
    
    this.paramsType = paramsType;
    return this;
  }

   /**
   * Get paramsType
   * @return paramsType
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataParamsType getParamsType() {
    return paramsType;
  }


  public void setParamsType(CreativeCustomCreativeCreateV2AdDataParamsType paramsType) {
    this.paramsType = paramsType;
  }


  public CreativeCustomCreativeCreateV2RequestAdData playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public CreativeCustomCreativeCreateV2RequestAdData priorityTrial(CreativeCustomCreativeCreateV2AdDataPriorityTrial priorityTrial) {
    
    this.priorityTrial = priorityTrial;
    return this;
  }

   /**
   * Get priorityTrial
   * @return priorityTrial
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2AdDataPriorityTrial getPriorityTrial() {
    return priorityTrial;
  }


  public void setPriorityTrial(CreativeCustomCreativeCreateV2AdDataPriorityTrial priorityTrial) {
    this.priorityTrial = priorityTrial;
  }


  public CreativeCustomCreativeCreateV2RequestAdData source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public CreativeCustomCreativeCreateV2RequestAdData subLinkIdList(List<Long> subLinkIdList) {
    
    this.subLinkIdList = subLinkIdList;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestAdData addSubLinkIdListItem(Long subLinkIdListItem) {
    if (this.subLinkIdList == null) {
      this.subLinkIdList = new ArrayList<>();
    }
    this.subLinkIdList.add(subLinkIdListItem);
    return this;
  }

   /**
   * 
   * @return subLinkIdList
  **/
  @javax.annotation.Nullable
  public List<Long> getSubLinkIdList() {
    return subLinkIdList;
  }


  public void setSubLinkIdList(List<Long> subLinkIdList) {
    this.subLinkIdList = subLinkIdList;
  }


  public CreativeCustomCreativeCreateV2RequestAdData supplements(List<CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner> supplements) {
    
    this.supplements = supplements;
    return this;
  }

  public CreativeCustomCreativeCreateV2RequestAdData addSupplementsItem(CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner supplementsItem) {
    if (this.supplements == null) {
      this.supplements = new ArrayList<>();
    }
    this.supplements.add(supplementsItem);
    return this;
  }

   /**
   * 
   * @return supplements
  **/
  @javax.annotation.Nullable
  public List<CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner> getSupplements() {
    return supplements;
  }


  public void setSupplements(List<CreativeCustomCreativeCreateV2RequestAdDataSupplementsInner> supplements) {
    this.supplements = supplements;
  }


  public CreativeCustomCreativeCreateV2RequestAdData thirdIndustryId(Long thirdIndustryId) {
    
    this.thirdIndustryId = thirdIndustryId;
    return this;
  }

   /**
   * 
   * @return thirdIndustryId
  **/
  @javax.annotation.Nullable
  public Long getThirdIndustryId() {
    return thirdIndustryId;
  }


  public void setThirdIndustryId(Long thirdIndustryId) {
    this.thirdIndustryId = thirdIndustryId;
  }


  public CreativeCustomCreativeCreateV2RequestAdData webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeCreateV2RequestAdData creativeCustomCreativeCreateV2RequestAdData = (CreativeCustomCreativeCreateV2RequestAdData) o;
    return Objects.equals(this.adCategory, creativeCustomCreativeCreateV2RequestAdData.adCategory) &&
        Objects.equals(this.adDownloadStatus, creativeCustomCreativeCreateV2RequestAdData.adDownloadStatus) &&
        Objects.equals(this.adKeywords, creativeCustomCreativeCreateV2RequestAdData.adKeywords) &&
        Objects.equals(this.anchorId, creativeCustomCreativeCreateV2RequestAdData.anchorId) &&
        Objects.equals(this.anchorRelatedType, creativeCustomCreativeCreateV2RequestAdData.anchorRelatedType) &&
        Objects.equals(this.anchorType, creativeCustomCreativeCreateV2RequestAdData.anchorType) &&
        Objects.equals(this.appName, creativeCustomCreativeCreateV2RequestAdData.appName) &&
        Objects.equals(this.creativeAutoGenerateSwitch, creativeCustomCreativeCreateV2RequestAdData.creativeAutoGenerateSwitch) &&
        Objects.equals(this.dpaExternalUrlField, creativeCustomCreativeCreateV2RequestAdData.dpaExternalUrlField) &&
        Objects.equals(this.dynamicCreativeSwitch, creativeCustomCreativeCreateV2RequestAdData.dynamicCreativeSwitch) &&
        Objects.equals(this.enableSmartSource, creativeCustomCreativeCreateV2RequestAdData.enableSmartSource) &&
        Objects.equals(this.externalUrl, creativeCustomCreativeCreateV2RequestAdData.externalUrl) &&
        Objects.equals(this.externalUrlParams, creativeCustomCreativeCreateV2RequestAdData.externalUrlParams) &&
        Objects.equals(this.iesCoreUserId, creativeCustomCreativeCreateV2RequestAdData.iesCoreUserId) &&
        Objects.equals(this.isCommentDisable, creativeCustomCreativeCreateV2RequestAdData.isCommentDisable) &&
        Objects.equals(this.isFeedAndFavSee, creativeCustomCreativeCreateV2RequestAdData.isFeedAndFavSee) &&
        Objects.equals(this.miniProgramInfo, creativeCustomCreativeCreateV2RequestAdData.miniProgramInfo) &&
        Objects.equals(this.openUrl, creativeCustomCreativeCreateV2RequestAdData.openUrl) &&
        Objects.equals(this.paramsType, creativeCustomCreativeCreateV2RequestAdData.paramsType) &&
        Objects.equals(this.playableUrl, creativeCustomCreativeCreateV2RequestAdData.playableUrl) &&
        Objects.equals(this.priorityTrial, creativeCustomCreativeCreateV2RequestAdData.priorityTrial) &&
        Objects.equals(this.source, creativeCustomCreativeCreateV2RequestAdData.source) &&
        Objects.equals(this.subLinkIdList, creativeCustomCreativeCreateV2RequestAdData.subLinkIdList) &&
        Objects.equals(this.supplements, creativeCustomCreativeCreateV2RequestAdData.supplements) &&
        Objects.equals(this.thirdIndustryId, creativeCustomCreativeCreateV2RequestAdData.thirdIndustryId) &&
        Objects.equals(this.webUrl, creativeCustomCreativeCreateV2RequestAdData.webUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCategory, adDownloadStatus, adKeywords, anchorId, anchorRelatedType, anchorType, appName, creativeAutoGenerateSwitch, dpaExternalUrlField, dynamicCreativeSwitch, enableSmartSource, externalUrl, externalUrlParams, iesCoreUserId, isCommentDisable, isFeedAndFavSee, miniProgramInfo, openUrl, paramsType, playableUrl, priorityTrial, source, subLinkIdList, supplements, thirdIndustryId, webUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestAdData {\n");
    sb.append("    adCategory: ").append(toIndentedString(adCategory)).append("\n");
    sb.append("    adDownloadStatus: ").append(toIndentedString(adDownloadStatus)).append("\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    anchorId: ").append(toIndentedString(anchorId)).append("\n");
    sb.append("    anchorRelatedType: ").append(toIndentedString(anchorRelatedType)).append("\n");
    sb.append("    anchorType: ").append(toIndentedString(anchorType)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    dpaExternalUrlField: ").append(toIndentedString(dpaExternalUrlField)).append("\n");
    sb.append("    dynamicCreativeSwitch: ").append(toIndentedString(dynamicCreativeSwitch)).append("\n");
    sb.append("    enableSmartSource: ").append(toIndentedString(enableSmartSource)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    externalUrlParams: ").append(toIndentedString(externalUrlParams)).append("\n");
    sb.append("    iesCoreUserId: ").append(toIndentedString(iesCoreUserId)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    isFeedAndFavSee: ").append(toIndentedString(isFeedAndFavSee)).append("\n");
    sb.append("    miniProgramInfo: ").append(toIndentedString(miniProgramInfo)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    paramsType: ").append(toIndentedString(paramsType)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    priorityTrial: ").append(toIndentedString(priorityTrial)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    subLinkIdList: ").append(toIndentedString(subLinkIdList)).append("\n");
    sb.append("    supplements: ").append(toIndentedString(supplements)).append("\n");
    sb.append("    thirdIndustryId: ").append(toIndentedString(thirdIndustryId)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ad_category");
    openapiFields.add("ad_download_status");
    openapiFields.add("ad_keywords");
    openapiFields.add("anchor_id");
    openapiFields.add("anchor_related_type");
    openapiFields.add("anchor_type");
    openapiFields.add("app_name");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("dpa_external_url_field");
    openapiFields.add("dynamic_creative_switch");
    openapiFields.add("enable_smart_source");
    openapiFields.add("external_url");
    openapiFields.add("external_url_params");
    openapiFields.add("ies_core_user_id");
    openapiFields.add("is_comment_disable");
    openapiFields.add("is_feed_and_fav_see");
    openapiFields.add("mini_program_info");
    openapiFields.add("open_url");
    openapiFields.add("params_type");
    openapiFields.add("playable_url");
    openapiFields.add("priority_trial");
    openapiFields.add("source");
    openapiFields.add("sub_link_id_list");
    openapiFields.add("supplements");
    openapiFields.add("third_industry_id");
    openapiFields.add("web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestAdData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestAdData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestAdData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestAdData.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestAdData>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestAdData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestAdData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestAdData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestAdData
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestAdData
  */
  public static CreativeCustomCreativeCreateV2RequestAdData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestAdData.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestAdData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

