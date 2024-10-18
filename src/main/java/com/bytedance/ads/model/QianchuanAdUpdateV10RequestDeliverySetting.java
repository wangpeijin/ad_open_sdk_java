/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10DeliverySettingLiveScheduleType;
import com.bytedance.ads.model.QianchuanAdUpdateV10DeliverySettingQcpxMode;
import com.bytedance.ads.model.QianchuanAdUpdateV10DeliverySettingVideoScheduleType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanAdUpdateV10RequestDeliverySetting {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE = "grab_first_screen_bid_adjust_rate";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_BID_ADJUST_RATE)
  private Long grabFirstScreenBidAdjustRate = null;

  public static final String SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH = "grab_first_screen_switch";
  @SerializedName(SERIALIZED_NAME_GRAB_FIRST_SCREEN_SWITCH)
  private Boolean grabFirstScreenSwitch = null;

  public static final String SERIALIZED_NAME_LIVE_SCHEDULE_TYPE = "live_schedule_type";
  @SerializedName(SERIALIZED_NAME_LIVE_SCHEDULE_TYPE)
  private QianchuanAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType = null;

  public static final String SERIALIZED_NAME_PRODUCT_NEW_OPEN = "product_new_open";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NEW_OPEN)
  private Boolean productNewOpen = null;

  public static final String SERIALIZED_NAME_QCPX_MODE = "qcpx_mode";
  @SerializedName(SERIALIZED_NAME_QCPX_MODE)
  private QianchuanAdUpdateV10DeliverySettingQcpxMode qcpxMode = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_RANGE = "schedule_fixed_range";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_RANGE)
  private Long scheduleFixedRange = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE = "video_schedule_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_SCHEDULE_TYPE)
  private QianchuanAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType = null;

  public QianchuanAdUpdateV10RequestDeliverySetting() {
  }

  public QianchuanAdUpdateV10RequestDeliverySetting budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting grabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
    return this;
  }

   /**
   * 抢首屏ROI目标降低幅度
   * @return grabFirstScreenBidAdjustRate
  **/
  @javax.annotation.Nullable
  public Long getGrabFirstScreenBidAdjustRate() {
    return grabFirstScreenBidAdjustRate;
  }


  public void setGrabFirstScreenBidAdjustRate(Long grabFirstScreenBidAdjustRate) {
    this.grabFirstScreenBidAdjustRate = grabFirstScreenBidAdjustRate;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting grabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
    return this;
  }

   /**
   * 抢首屏开关
   * @return grabFirstScreenSwitch
  **/
  @javax.annotation.Nullable
  public Boolean getGrabFirstScreenSwitch() {
    return grabFirstScreenSwitch;
  }


  public void setGrabFirstScreenSwitch(Boolean grabFirstScreenSwitch) {
    this.grabFirstScreenSwitch = grabFirstScreenSwitch;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting liveScheduleType(QianchuanAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType) {
    
    this.liveScheduleType = liveScheduleType;
    return this;
  }

   /**
   * Get liveScheduleType
   * @return liveScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10DeliverySettingLiveScheduleType getLiveScheduleType() {
    return liveScheduleType;
  }


  public void setLiveScheduleType(QianchuanAdUpdateV10DeliverySettingLiveScheduleType liveScheduleType) {
    this.liveScheduleType = liveScheduleType;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting productNewOpen(Boolean productNewOpen) {
    
    this.productNewOpen = productNewOpen;
    return this;
  }

   /**
   * 新品链路
   * @return productNewOpen
  **/
  @javax.annotation.Nullable
  public Boolean getProductNewOpen() {
    return productNewOpen;
  }


  public void setProductNewOpen(Boolean productNewOpen) {
    this.productNewOpen = productNewOpen;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting qcpxMode(QianchuanAdUpdateV10DeliverySettingQcpxMode qcpxMode) {
    
    this.qcpxMode = qcpxMode;
    return this;
  }

   /**
   * Get qcpxMode
   * @return qcpxMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10DeliverySettingQcpxMode getQcpxMode() {
    return qcpxMode;
  }


  public void setQcpxMode(QianchuanAdUpdateV10DeliverySettingQcpxMode qcpxMode) {
    this.qcpxMode = qcpxMode;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting scheduleFixedRange(Long scheduleFixedRange) {
    
    this.scheduleFixedRange = scheduleFixedRange;
    return this;
  }

   /**
   * 
   * minimum: 1800
   * maximum: 86400
   * @return scheduleFixedRange
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedRange() {
    return scheduleFixedRange;
  }


  public void setScheduleFixedRange(Long scheduleFixedRange) {
    this.scheduleFixedRange = scheduleFixedRange;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public QianchuanAdUpdateV10RequestDeliverySetting videoScheduleType(QianchuanAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType) {
    
    this.videoScheduleType = videoScheduleType;
    return this;
  }

   /**
   * Get videoScheduleType
   * @return videoScheduleType
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10DeliverySettingVideoScheduleType getVideoScheduleType() {
    return videoScheduleType;
  }


  public void setVideoScheduleType(QianchuanAdUpdateV10DeliverySettingVideoScheduleType videoScheduleType) {
    this.videoScheduleType = videoScheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdUpdateV10RequestDeliverySetting qianchuanAdUpdateV10RequestDeliverySetting = (QianchuanAdUpdateV10RequestDeliverySetting) o;
    return Objects.equals(this.budget, qianchuanAdUpdateV10RequestDeliverySetting.budget) &&
        Objects.equals(this.cpaBid, qianchuanAdUpdateV10RequestDeliverySetting.cpaBid) &&
        Objects.equals(this.endTime, qianchuanAdUpdateV10RequestDeliverySetting.endTime) &&
        Objects.equals(this.grabFirstScreenBidAdjustRate, qianchuanAdUpdateV10RequestDeliverySetting.grabFirstScreenBidAdjustRate) &&
        Objects.equals(this.grabFirstScreenSwitch, qianchuanAdUpdateV10RequestDeliverySetting.grabFirstScreenSwitch) &&
        Objects.equals(this.liveScheduleType, qianchuanAdUpdateV10RequestDeliverySetting.liveScheduleType) &&
        Objects.equals(this.productNewOpen, qianchuanAdUpdateV10RequestDeliverySetting.productNewOpen) &&
        Objects.equals(this.qcpxMode, qianchuanAdUpdateV10RequestDeliverySetting.qcpxMode) &&
        Objects.equals(this.roiGoal, qianchuanAdUpdateV10RequestDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleFixedRange, qianchuanAdUpdateV10RequestDeliverySetting.scheduleFixedRange) &&
        Objects.equals(this.scheduleTime, qianchuanAdUpdateV10RequestDeliverySetting.scheduleTime) &&
        Objects.equals(this.videoScheduleType, qianchuanAdUpdateV10RequestDeliverySetting.videoScheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, cpaBid, endTime, grabFirstScreenBidAdjustRate, grabFirstScreenSwitch, liveScheduleType, productNewOpen, qcpxMode, roiGoal, scheduleFixedRange, scheduleTime, videoScheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestDeliverySetting {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    grabFirstScreenBidAdjustRate: ").append(toIndentedString(grabFirstScreenBidAdjustRate)).append("\n");
    sb.append("    grabFirstScreenSwitch: ").append(toIndentedString(grabFirstScreenSwitch)).append("\n");
    sb.append("    liveScheduleType: ").append(toIndentedString(liveScheduleType)).append("\n");
    sb.append("    productNewOpen: ").append(toIndentedString(productNewOpen)).append("\n");
    sb.append("    qcpxMode: ").append(toIndentedString(qcpxMode)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleFixedRange: ").append(toIndentedString(scheduleFixedRange)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    videoScheduleType: ").append(toIndentedString(videoScheduleType)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("cpa_bid");
    openapiFields.add("end_time");
    openapiFields.add("grab_first_screen_bid_adjust_rate");
    openapiFields.add("grab_first_screen_switch");
    openapiFields.add("live_schedule_type");
    openapiFields.add("product_new_open");
    openapiFields.add("qcpx_mode");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_fixed_range");
    openapiFields.add("schedule_time");
    openapiFields.add("video_schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestDeliverySetting
  */
  public static QianchuanAdUpdateV10RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

