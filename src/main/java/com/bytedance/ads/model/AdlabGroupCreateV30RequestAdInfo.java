/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAdTarget;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoAppType;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDeepBidType;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDeepExternalAction;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDownloadMode;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoDownloadType;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoExternalAction;
import com.bytedance.ads.model.AdlabGroupCreateV30AdInfoScheduleType;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoAudience;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoDeliveryRange;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoProductInfoInner;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestAdInfoTrackUrlSetting;
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
 * 广告计划维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AdlabGroupCreateV30RequestAdInfo {
  public static final String SERIALIZED_NAME_AD_TARGET = "ad_target";
  @SerializedName(SERIALIZED_NAME_AD_TARGET)
  private AdlabGroupCreateV30AdInfoAdTarget adTarget = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private AdlabGroupCreateV30AdInfoAppType appType = null;

  public static final String SERIALIZED_NAME_ASSETS_IDS = "assets_ids";
  @SerializedName(SERIALIZED_NAME_ASSETS_IDS)
  private List<Long> assetsIds = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private AdlabGroupCreateV30RequestAdInfoAudience audience = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private AdlabGroupCreateV30AdInfoDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_EXTERNAL_ACTION = "deep_external_action";
  @SerializedName(SERIALIZED_NAME_DEEP_EXTERNAL_ACTION)
  private AdlabGroupCreateV30AdInfoDeepExternalAction deepExternalAction = null;

  public static final String SERIALIZED_NAME_DELIVERY_RANGE = "delivery_range";
  @SerializedName(SERIALIZED_NAME_DELIVERY_RANGE)
  private AdlabGroupCreateV30RequestAdInfoDeliveryRange deliveryRange = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_MODE = "download_mode";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_MODE)
  private AdlabGroupCreateV30AdInfoDownloadMode downloadMode = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_TYPE = "download_type";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_TYPE)
  private AdlabGroupCreateV30AdInfoDownloadType downloadType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private AdlabGroupCreateV30AdInfoExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_OPEN_URL = "open_url";
  @SerializedName(SERIALIZED_NAME_OPEN_URL)
  private String openUrl = null;

  public static final String SERIALIZED_NAME_PACKAGE = "package";
  @SerializedName(SERIALIZED_NAME_PACKAGE)
  private String _package = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private List<AdlabGroupCreateV30RequestAdInfoProductInfoInner> productInfo = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private AdlabGroupCreateV30AdInfoScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SETTING = "track_url_setting";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SETTING)
  private AdlabGroupCreateV30RequestAdInfoTrackUrlSetting trackUrlSetting = null;

  public static final String SERIALIZED_NAME_WEEK_SCHEDULE = "week_schedule";
  @SerializedName(SERIALIZED_NAME_WEEK_SCHEDULE)
  private List<List<Long>> weekSchedule = null;

  public AdlabGroupCreateV30RequestAdInfo() {
  }

  public AdlabGroupCreateV30RequestAdInfo adTarget(AdlabGroupCreateV30AdInfoAdTarget adTarget) {
    
    this.adTarget = adTarget;
    return this;
  }

   /**
   * Get adTarget
   * @return adTarget
  **/
  @javax.annotation.Nonnull
  public AdlabGroupCreateV30AdInfoAdTarget getAdTarget() {
    return adTarget;
  }


  public void setAdTarget(AdlabGroupCreateV30AdInfoAdTarget adTarget) {
    this.adTarget = adTarget;
  }


  public AdlabGroupCreateV30RequestAdInfo appType(AdlabGroupCreateV30AdInfoAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoAppType getAppType() {
    return appType;
  }


  public void setAppType(AdlabGroupCreateV30AdInfoAppType appType) {
    this.appType = appType;
  }


  public AdlabGroupCreateV30RequestAdInfo assetsIds(List<Long> assetsIds) {
    
    this.assetsIds = assetsIds;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfo addAssetsIdsItem(Long assetsIdsItem) {
    if (this.assetsIds == null) {
      this.assetsIds = new ArrayList<>();
    }
    this.assetsIds.add(assetsIdsItem);
    return this;
  }

   /**
   * 资产 id，当使用事件管理时必填 字节小程序链路下，需要传入两个资产id（字节小程序资产+备用落地页资产），其他场景仅需传入一个资产id
   * @return assetsIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAssetsIds() {
    return assetsIds;
  }


  public void setAssetsIds(List<Long> assetsIds) {
    this.assetsIds = assetsIds;
  }


  public AdlabGroupCreateV30RequestAdInfo audience(AdlabGroupCreateV30RequestAdInfoAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30RequestAdInfoAudience getAudience() {
    return audience;
  }


  public void setAudience(AdlabGroupCreateV30RequestAdInfoAudience audience) {
    this.audience = audience;
  }


  public AdlabGroupCreateV30RequestAdInfo cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 目标转化出价/预期成本
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public AdlabGroupCreateV30RequestAdInfo deepBidType(AdlabGroupCreateV30AdInfoDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(AdlabGroupCreateV30AdInfoDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public AdlabGroupCreateV30RequestAdInfo deepCpaBid(Double deepCpaBid) {
    
    this.deepCpaBid = deepCpaBid;
    return this;
  }

   /**
   * 深度优化出价 设定深度转化目标时才会有效。 取值范围：0.1~10000元
   * @return deepCpaBid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpaBid() {
    return deepCpaBid;
  }


  public void setDeepCpaBid(Double deepCpaBid) {
    this.deepCpaBid = deepCpaBid;
  }


  public AdlabGroupCreateV30RequestAdInfo deepExternalAction(AdlabGroupCreateV30AdInfoDeepExternalAction deepExternalAction) {
    
    this.deepExternalAction = deepExternalAction;
    return this;
  }

   /**
   * Get deepExternalAction
   * @return deepExternalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoDeepExternalAction getDeepExternalAction() {
    return deepExternalAction;
  }


  public void setDeepExternalAction(AdlabGroupCreateV30AdInfoDeepExternalAction deepExternalAction) {
    this.deepExternalAction = deepExternalAction;
  }


  public AdlabGroupCreateV30RequestAdInfo deliveryRange(AdlabGroupCreateV30RequestAdInfoDeliveryRange deliveryRange) {
    
    this.deliveryRange = deliveryRange;
    return this;
  }

   /**
   * Get deliveryRange
   * @return deliveryRange
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30RequestAdInfoDeliveryRange getDeliveryRange() {
    return deliveryRange;
  }


  public void setDeliveryRange(AdlabGroupCreateV30RequestAdInfoDeliveryRange deliveryRange) {
    this.deliveryRange = deliveryRange;
  }


  public AdlabGroupCreateV30RequestAdInfo downloadMode(AdlabGroupCreateV30AdInfoDownloadMode downloadMode) {
    
    this.downloadMode = downloadMode;
    return this;
  }

   /**
   * Get downloadMode
   * @return downloadMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoDownloadMode getDownloadMode() {
    return downloadMode;
  }


  public void setDownloadMode(AdlabGroupCreateV30AdInfoDownloadMode downloadMode) {
    this.downloadMode = downloadMode;
  }


  public AdlabGroupCreateV30RequestAdInfo downloadType(AdlabGroupCreateV30AdInfoDownloadType downloadType) {
    
    this.downloadType = downloadType;
    return this;
  }

   /**
   * Get downloadType
   * @return downloadType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoDownloadType getDownloadType() {
    return downloadType;
  }


  public void setDownloadType(AdlabGroupCreateV30AdInfoDownloadType downloadType) {
    this.downloadType = downloadType;
  }


  public AdlabGroupCreateV30RequestAdInfo downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 下载链接
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public AdlabGroupCreateV30RequestAdInfo endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 投放结束时间 当schedule_type为SCHEDULE_START_END时必填，形式如：2017-01-01
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public AdlabGroupCreateV30RequestAdInfo externalAction(AdlabGroupCreateV30AdInfoExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(AdlabGroupCreateV30AdInfoExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public AdlabGroupCreateV30RequestAdInfo openUrl(String openUrl) {
    
    this.openUrl = openUrl;
    return this;
  }

   /**
   * 直达链接。（点击唤起APP）直达链接仅支持部分App唤起，点击创意将优先跳转App，再根据投放内容跳转相关链接
   * @return openUrl
  **/
  @javax.annotation.Nullable
  public String getOpenUrl() {
    return openUrl;
  }


  public void setOpenUrl(String openUrl) {
    this.openUrl = openUrl;
  }


  public AdlabGroupCreateV30RequestAdInfo _package(String _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * 应用包名，需要与应用下载链接中包名一致（格式例如：com.xx.xx）
   * @return _package
  **/
  @javax.annotation.Nullable
  public String getPackage() {
    return _package;
  }


  public void setPackage(String _package) {
    this._package = _package;
  }


  public AdlabGroupCreateV30RequestAdInfo productInfo(List<AdlabGroupCreateV30RequestAdInfoProductInfoInner> productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfo addProductInfoItem(AdlabGroupCreateV30RequestAdInfoProductInfoInner productInfoItem) {
    if (this.productInfo == null) {
      this.productInfo = new ArrayList<>();
    }
    this.productInfo.add(productInfoItem);
    return this;
  }

   /**
   * 商品信息，最多允许传入1个
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30RequestAdInfoProductInfoInner> getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(List<AdlabGroupCreateV30RequestAdInfoProductInfoInner> productInfo) {
    this.productInfo = productInfo;
  }


  public AdlabGroupCreateV30RequestAdInfo roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 深度转化ROI系数 范围(0,5]，精度：保留小数点后四位
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public AdlabGroupCreateV30RequestAdInfo scheduleType(AdlabGroupCreateV30AdInfoScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30AdInfoScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(AdlabGroupCreateV30AdInfoScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public AdlabGroupCreateV30RequestAdInfo startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 投放起始时间 当schedule_type为SCHEDULE_START_END时必填，形式如：2017-01-01
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public AdlabGroupCreateV30RequestAdInfo trackUrlSetting(AdlabGroupCreateV30RequestAdInfoTrackUrlSetting trackUrlSetting) {
    
    this.trackUrlSetting = trackUrlSetting;
    return this;
  }

   /**
   * Get trackUrlSetting
   * @return trackUrlSetting
  **/
  @javax.annotation.Nullable
  public AdlabGroupCreateV30RequestAdInfoTrackUrlSetting getTrackUrlSetting() {
    return trackUrlSetting;
  }


  public void setTrackUrlSetting(AdlabGroupCreateV30RequestAdInfoTrackUrlSetting trackUrlSetting) {
    this.trackUrlSetting = trackUrlSetting;
  }


  public AdlabGroupCreateV30RequestAdInfo weekSchedule(List<List<Long>> weekSchedule) {
    
    this.weekSchedule = weekSchedule;
    return this;
  }

  public AdlabGroupCreateV30RequestAdInfo addWeekScheduleItem(List<Long> weekScheduleItem) {
    if (this.weekSchedule == null) {
      this.weekSchedule = new ArrayList<>();
    }
    this.weekSchedule.add(weekScheduleItem);
    return this;
  }

   /**
   * 投放时段 使用要求： 1、 数组为空，表示表示全时段投放 2、 第一层数组不为空时，必须为7个元素，依次表示每周从周一到周日7天的投放时间段信息 3、 第二层数组最少0个元素，最多48个元素。每个元素的范围为 [0,47]，表示全天每半个小时是否投放。 - 例如：包含0表示 00:00-00:29 需要进行投放，包含47表示 23:00-23:59需要进行投放 - 例如：周一0点到2点投放，周三0点到1点半投放，其他时段都不投放，表示为：[[0,1,2,3], [], [0,1,2], [], [], [], []]
   * @return weekSchedule
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getWeekSchedule() {
    return weekSchedule;
  }


  public void setWeekSchedule(List<List<Long>> weekSchedule) {
    this.weekSchedule = weekSchedule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestAdInfo adlabGroupCreateV30RequestAdInfo = (AdlabGroupCreateV30RequestAdInfo) o;
    return Objects.equals(this.adTarget, adlabGroupCreateV30RequestAdInfo.adTarget) &&
        Objects.equals(this.appType, adlabGroupCreateV30RequestAdInfo.appType) &&
        Objects.equals(this.assetsIds, adlabGroupCreateV30RequestAdInfo.assetsIds) &&
        Objects.equals(this.audience, adlabGroupCreateV30RequestAdInfo.audience) &&
        Objects.equals(this.cpaBid, adlabGroupCreateV30RequestAdInfo.cpaBid) &&
        Objects.equals(this.deepBidType, adlabGroupCreateV30RequestAdInfo.deepBidType) &&
        Objects.equals(this.deepCpaBid, adlabGroupCreateV30RequestAdInfo.deepCpaBid) &&
        Objects.equals(this.deepExternalAction, adlabGroupCreateV30RequestAdInfo.deepExternalAction) &&
        Objects.equals(this.deliveryRange, adlabGroupCreateV30RequestAdInfo.deliveryRange) &&
        Objects.equals(this.downloadMode, adlabGroupCreateV30RequestAdInfo.downloadMode) &&
        Objects.equals(this.downloadType, adlabGroupCreateV30RequestAdInfo.downloadType) &&
        Objects.equals(this.downloadUrl, adlabGroupCreateV30RequestAdInfo.downloadUrl) &&
        Objects.equals(this.endTime, adlabGroupCreateV30RequestAdInfo.endTime) &&
        Objects.equals(this.externalAction, adlabGroupCreateV30RequestAdInfo.externalAction) &&
        Objects.equals(this.openUrl, adlabGroupCreateV30RequestAdInfo.openUrl) &&
        Objects.equals(this._package, adlabGroupCreateV30RequestAdInfo._package) &&
        Objects.equals(this.productInfo, adlabGroupCreateV30RequestAdInfo.productInfo) &&
        Objects.equals(this.roiGoal, adlabGroupCreateV30RequestAdInfo.roiGoal) &&
        Objects.equals(this.scheduleType, adlabGroupCreateV30RequestAdInfo.scheduleType) &&
        Objects.equals(this.startTime, adlabGroupCreateV30RequestAdInfo.startTime) &&
        Objects.equals(this.trackUrlSetting, adlabGroupCreateV30RequestAdInfo.trackUrlSetting) &&
        Objects.equals(this.weekSchedule, adlabGroupCreateV30RequestAdInfo.weekSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adTarget, appType, assetsIds, audience, cpaBid, deepBidType, deepCpaBid, deepExternalAction, deliveryRange, downloadMode, downloadType, downloadUrl, endTime, externalAction, openUrl, _package, productInfo, roiGoal, scheduleType, startTime, trackUrlSetting, weekSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestAdInfo {\n");
    sb.append("    adTarget: ").append(toIndentedString(adTarget)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    assetsIds: ").append(toIndentedString(assetsIds)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    deepExternalAction: ").append(toIndentedString(deepExternalAction)).append("\n");
    sb.append("    deliveryRange: ").append(toIndentedString(deliveryRange)).append("\n");
    sb.append("    downloadMode: ").append(toIndentedString(downloadMode)).append("\n");
    sb.append("    downloadType: ").append(toIndentedString(downloadType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    openUrl: ").append(toIndentedString(openUrl)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    trackUrlSetting: ").append(toIndentedString(trackUrlSetting)).append("\n");
    sb.append("    weekSchedule: ").append(toIndentedString(weekSchedule)).append("\n");
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
    openapiFields.add("ad_target");
    openapiFields.add("app_type");
    openapiFields.add("assets_ids");
    openapiFields.add("audience");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpa_bid");
    openapiFields.add("deep_external_action");
    openapiFields.add("delivery_range");
    openapiFields.add("download_mode");
    openapiFields.add("download_type");
    openapiFields.add("download_url");
    openapiFields.add("end_time");
    openapiFields.add("external_action");
    openapiFields.add("open_url");
    openapiFields.add("package");
    openapiFields.add("product_info");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_type");
    openapiFields.add("start_time");
    openapiFields.add("track_url_setting");
    openapiFields.add("week_schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_target");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestAdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestAdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestAdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestAdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestAdInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestAdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestAdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestAdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestAdInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestAdInfo
  */
  public static AdlabGroupCreateV30RequestAdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestAdInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestAdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

