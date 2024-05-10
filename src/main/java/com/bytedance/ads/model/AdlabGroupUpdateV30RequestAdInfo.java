/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoDownloadMode;
import com.bytedance.ads.model.AdlabGroupUpdateV30AdInfoScheduleType;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestAdInfoAudience;
import com.bytedance.ads.model.AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class AdlabGroupUpdateV30RequestAdInfo {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private AdlabGroupUpdateV30RequestAdInfoAudience audience = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_CPA_BID = "deep_cpa_bid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPA_BID)
  private Double deepCpaBid = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_MODE = "download_mode";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_MODE)
  private AdlabGroupUpdateV30AdInfoDownloadMode downloadMode = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private AdlabGroupUpdateV30AdInfoScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_TRACK_URL_SETTING = "track_url_setting";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_SETTING)
  private AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrlSetting = null;

  public static final String SERIALIZED_NAME_WEEK_SCHEDULE = "week_schedule";
  @SerializedName(SERIALIZED_NAME_WEEK_SCHEDULE)
  private List<List<Long>> weekSchedule = null;

  public AdlabGroupUpdateV30RequestAdInfo() {
  }

  public AdlabGroupUpdateV30RequestAdInfo audience(AdlabGroupUpdateV30RequestAdInfoAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30RequestAdInfoAudience getAudience() {
    return audience;
  }


  public void setAudience(AdlabGroupUpdateV30RequestAdInfoAudience audience) {
    this.audience = audience;
  }


  public AdlabGroupUpdateV30RequestAdInfo cpaBid(Double cpaBid) {
    
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


  public AdlabGroupUpdateV30RequestAdInfo deepCpaBid(Double deepCpaBid) {
    
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


  public AdlabGroupUpdateV30RequestAdInfo downloadMode(AdlabGroupUpdateV30AdInfoDownloadMode downloadMode) {
    
    this.downloadMode = downloadMode;
    return this;
  }

   /**
   * Get downloadMode
   * @return downloadMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoDownloadMode getDownloadMode() {
    return downloadMode;
  }


  public void setDownloadMode(AdlabGroupUpdateV30AdInfoDownloadMode downloadMode) {
    this.downloadMode = downloadMode;
  }


  public AdlabGroupUpdateV30RequestAdInfo endTime(String endTime) {
    
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


  public AdlabGroupUpdateV30RequestAdInfo roiGoal(Double roiGoal) {
    
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


  public AdlabGroupUpdateV30RequestAdInfo scheduleType(AdlabGroupUpdateV30AdInfoScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30AdInfoScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(AdlabGroupUpdateV30AdInfoScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public AdlabGroupUpdateV30RequestAdInfo trackUrlSetting(AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrlSetting) {
    
    this.trackUrlSetting = trackUrlSetting;
    return this;
  }

   /**
   * Get trackUrlSetting
   * @return trackUrlSetting
  **/
  @javax.annotation.Nullable
  public AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting getTrackUrlSetting() {
    return trackUrlSetting;
  }


  public void setTrackUrlSetting(AdlabGroupUpdateV30RequestAdInfoTrackUrlSetting trackUrlSetting) {
    this.trackUrlSetting = trackUrlSetting;
  }


  public AdlabGroupUpdateV30RequestAdInfo weekSchedule(List<List<Long>> weekSchedule) {
    
    this.weekSchedule = weekSchedule;
    return this;
  }

  public AdlabGroupUpdateV30RequestAdInfo addWeekScheduleItem(List<Long> weekScheduleItem) {
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
    AdlabGroupUpdateV30RequestAdInfo adlabGroupUpdateV30RequestAdInfo = (AdlabGroupUpdateV30RequestAdInfo) o;
    return Objects.equals(this.audience, adlabGroupUpdateV30RequestAdInfo.audience) &&
        Objects.equals(this.cpaBid, adlabGroupUpdateV30RequestAdInfo.cpaBid) &&
        Objects.equals(this.deepCpaBid, adlabGroupUpdateV30RequestAdInfo.deepCpaBid) &&
        Objects.equals(this.downloadMode, adlabGroupUpdateV30RequestAdInfo.downloadMode) &&
        Objects.equals(this.endTime, adlabGroupUpdateV30RequestAdInfo.endTime) &&
        Objects.equals(this.roiGoal, adlabGroupUpdateV30RequestAdInfo.roiGoal) &&
        Objects.equals(this.scheduleType, adlabGroupUpdateV30RequestAdInfo.scheduleType) &&
        Objects.equals(this.trackUrlSetting, adlabGroupUpdateV30RequestAdInfo.trackUrlSetting) &&
        Objects.equals(this.weekSchedule, adlabGroupUpdateV30RequestAdInfo.weekSchedule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, cpaBid, deepCpaBid, downloadMode, endTime, roiGoal, scheduleType, trackUrlSetting, weekSchedule);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupUpdateV30RequestAdInfo {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepCpaBid: ").append(toIndentedString(deepCpaBid)).append("\n");
    sb.append("    downloadMode: ").append(toIndentedString(downloadMode)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_cpa_bid");
    openapiFields.add("download_mode");
    openapiFields.add("end_time");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_type");
    openapiFields.add("track_url_setting");
    openapiFields.add("week_schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupUpdateV30RequestAdInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupUpdateV30RequestAdInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupUpdateV30RequestAdInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupUpdateV30RequestAdInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupUpdateV30RequestAdInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupUpdateV30RequestAdInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupUpdateV30RequestAdInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupUpdateV30RequestAdInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupUpdateV30RequestAdInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupUpdateV30RequestAdInfo
  */
  public static AdlabGroupUpdateV30RequestAdInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupUpdateV30RequestAdInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupUpdateV30RequestAdInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

