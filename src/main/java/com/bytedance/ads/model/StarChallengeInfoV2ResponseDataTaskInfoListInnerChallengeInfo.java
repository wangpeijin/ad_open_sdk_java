/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo {
  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT = "max_upload_item_cnt";
  @SerializedName(SERIALIZED_NAME_MAX_UPLOAD_ITEM_CNT)
  private Long maxUploadItemCnt = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE = "participate_author_range";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_AUTHOR_RANGE)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange participateAuthorRange = null;

  public static final String SERIALIZED_NAME_SAMPLE_DELIVERY = "sample_delivery";
  @SerializedName(SERIALIZED_NAME_SAMPLE_DELIVERY)
  private Long sampleDelivery = null;

  public static final String SERIALIZED_NAME_SAMPLE_VIDEO = "sample_video";
  @SerializedName(SERIALIZED_NAME_SAMPLE_VIDEO)
  private List<Long> sampleVideo = null;

  public static final String SERIALIZED_NAME_SETTLEMENT_INFO = "settlement_info";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo settlementInfo = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE = "task_head_image";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE)
  private String taskHeadImage = null;

  public static final String SERIALIZED_NAME_TASK_ICON = "task_icon";
  @SerializedName(SERIALIZED_NAME_TASK_ICON)
  private String taskIcon = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 
   * @return authorTaskName
  **/
  @javax.annotation.Nullable
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo maxUploadItemCnt(Long maxUploadItemCnt) {
    
    this.maxUploadItemCnt = maxUploadItemCnt;
    return this;
  }

   /**
   * 
   * @return maxUploadItemCnt
  **/
  @javax.annotation.Nullable
  public Long getMaxUploadItemCnt() {
    return maxUploadItemCnt;
  }


  public void setMaxUploadItemCnt(Long maxUploadItemCnt) {
    this.maxUploadItemCnt = maxUploadItemCnt;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo participateAuthorRange(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange participateAuthorRange) {
    
    this.participateAuthorRange = participateAuthorRange;
    return this;
  }

   /**
   * Get participateAuthorRange
   * @return participateAuthorRange
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange getParticipateAuthorRange() {
    return participateAuthorRange;
  }


  public void setParticipateAuthorRange(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoParticipateAuthorRange participateAuthorRange) {
    this.participateAuthorRange = participateAuthorRange;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo sampleDelivery(Long sampleDelivery) {
    
    this.sampleDelivery = sampleDelivery;
    return this;
  }

   /**
   * 
   * @return sampleDelivery
  **/
  @javax.annotation.Nullable
  public Long getSampleDelivery() {
    return sampleDelivery;
  }


  public void setSampleDelivery(Long sampleDelivery) {
    this.sampleDelivery = sampleDelivery;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo sampleVideo(List<Long> sampleVideo) {
    
    this.sampleVideo = sampleVideo;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo addSampleVideoItem(Long sampleVideoItem) {
    if (this.sampleVideo == null) {
      this.sampleVideo = new ArrayList<>();
    }
    this.sampleVideo.add(sampleVideoItem);
    return this;
  }

   /**
   * 
   * @return sampleVideo
  **/
  @javax.annotation.Nullable
  public List<Long> getSampleVideo() {
    return sampleVideo;
  }


  public void setSampleVideo(List<Long> sampleVideo) {
    this.sampleVideo = sampleVideo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo settlementInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo settlementInfo) {
    
    this.settlementInfo = settlementInfo;
    return this;
  }

   /**
   * Get settlementInfo
   * @return settlementInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo getSettlementInfo() {
    return settlementInfo;
  }


  public void setSettlementInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfoSettlementInfo settlementInfo) {
    this.settlementInfo = settlementInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public Long getStartTime() {
    return startTime;
  }


  public void setStartTime(Long startTime) {
    this.startTime = startTime;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo taskHeadImage(String taskHeadImage) {
    
    this.taskHeadImage = taskHeadImage;
    return this;
  }

   /**
   * 
   * @return taskHeadImage
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImage() {
    return taskHeadImage;
  }


  public void setTaskHeadImage(String taskHeadImage) {
    this.taskHeadImage = taskHeadImage;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo taskIcon(String taskIcon) {
    
    this.taskIcon = taskIcon;
    return this;
  }

   /**
   * 
   * @return taskIcon
  **/
  @javax.annotation.Nullable
  public String getTaskIcon() {
    return taskIcon;
  }


  public void setTaskIcon(String taskIcon) {
    this.taskIcon = taskIcon;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo) o;
    return Objects.equals(this.authorTaskName, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.authorTaskName) &&
        Objects.equals(this.budget, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.budget) &&
        Objects.equals(this.endTime, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.endTime) &&
        Objects.equals(this.maxUploadItemCnt, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.maxUploadItemCnt) &&
        Objects.equals(this.participateAuthorRange, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.participateAuthorRange) &&
        Objects.equals(this.sampleDelivery, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.sampleDelivery) &&
        Objects.equals(this.sampleVideo, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.sampleVideo) &&
        Objects.equals(this.settlementInfo, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.settlementInfo) &&
        Objects.equals(this.startTime, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.startTime) &&
        Objects.equals(this.taskHeadImage, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.taskHeadImage) &&
        Objects.equals(this.taskIcon, starChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.taskIcon);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorTaskName, budget, endTime, maxUploadItemCnt, participateAuthorRange, sampleDelivery, sampleVideo, settlementInfo, startTime, taskHeadImage, taskIcon);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo {\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    maxUploadItemCnt: ").append(toIndentedString(maxUploadItemCnt)).append("\n");
    sb.append("    participateAuthorRange: ").append(toIndentedString(participateAuthorRange)).append("\n");
    sb.append("    sampleDelivery: ").append(toIndentedString(sampleDelivery)).append("\n");
    sb.append("    sampleVideo: ").append(toIndentedString(sampleVideo)).append("\n");
    sb.append("    settlementInfo: ").append(toIndentedString(settlementInfo)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    taskHeadImage: ").append(toIndentedString(taskHeadImage)).append("\n");
    sb.append("    taskIcon: ").append(toIndentedString(taskIcon)).append("\n");
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
    openapiFields.add("author_task_name");
    openapiFields.add("budget");
    openapiFields.add("end_time");
    openapiFields.add("max_upload_item_cnt");
    openapiFields.add("participate_author_range");
    openapiFields.add("sample_delivery");
    openapiFields.add("sample_video");
    openapiFields.add("settlement_info");
    openapiFields.add("start_time");
    openapiFields.add("task_head_image");
    openapiFields.add("task_icon");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_task_name");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("max_upload_item_cnt");
    openapiRequiredFields.add("participate_author_range");
    openapiRequiredFields.add("sample_delivery");
    openapiRequiredFields.add("settlement_info");
    openapiRequiredFields.add("start_time");
    openapiRequiredFields.add("task_icon");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

