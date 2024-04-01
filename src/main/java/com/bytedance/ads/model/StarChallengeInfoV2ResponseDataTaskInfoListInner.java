/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * StarChallengeInfoV2ResponseDataTaskInfoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInner {
  public static final String SERIALIZED_NAME_AUDIT_INFO = "audit_info";
  @SerializedName(SERIALIZED_NAME_AUDIT_INFO)
  private String auditInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_AUDIT_STATUS = "challenge_audit_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_AUDIT_STATUS)
  private Long challengeAuditStatus = null;

  public static final String SERIALIZED_NAME_CHALLENGE_BILL_INFO = "challenge_bill_info";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_BILL_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo challengeBillInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_INFO = "challenge_info";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo challengeInfo = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_STATUS = "challenge_task_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_STATUS)
  private Long challengeTaskStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_INFO = "demand_info";
  @SerializedName(SERIALIZED_NAME_DEMAND_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo demandInfo = null;

  public static final String SERIALIZED_NAME_PROGRESS_INFO = "progress_info";
  @SerializedName(SERIALIZED_NAME_PROGRESS_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo progressInfo = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInner() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInner auditInfo(String auditInfo) {
    
    this.auditInfo = auditInfo;
    return this;
  }

   /**
   * 
   * @return auditInfo
  **/
  @javax.annotation.Nullable
  public String getAuditInfo() {
    return auditInfo;
  }


  public void setAuditInfo(String auditInfo) {
    this.auditInfo = auditInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner challengeAuditStatus(Long challengeAuditStatus) {
    
    this.challengeAuditStatus = challengeAuditStatus;
    return this;
  }

   /**
   * 
   * @return challengeAuditStatus
  **/
  @javax.annotation.Nullable
  public Long getChallengeAuditStatus() {
    return challengeAuditStatus;
  }


  public void setChallengeAuditStatus(Long challengeAuditStatus) {
    this.challengeAuditStatus = challengeAuditStatus;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner challengeBillInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo challengeBillInfo) {
    
    this.challengeBillInfo = challengeBillInfo;
    return this;
  }

   /**
   * Get challengeBillInfo
   * @return challengeBillInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo getChallengeBillInfo() {
    return challengeBillInfo;
  }


  public void setChallengeBillInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeBillInfo challengeBillInfo) {
    this.challengeBillInfo = challengeBillInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner challengeInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo challengeInfo) {
    
    this.challengeInfo = challengeInfo;
    return this;
  }

   /**
   * Get challengeInfo
   * @return challengeInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo getChallengeInfo() {
    return challengeInfo;
  }


  public void setChallengeInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerChallengeInfo challengeInfo) {
    this.challengeInfo = challengeInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 
   * @return challengeTaskId
  **/
  @javax.annotation.Nullable
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner challengeTaskStatus(Long challengeTaskStatus) {
    
    this.challengeTaskStatus = challengeTaskStatus;
    return this;
  }

   /**
   * 
   * @return challengeTaskStatus
  **/
  @javax.annotation.Nullable
  public Long getChallengeTaskStatus() {
    return challengeTaskStatus;
  }


  public void setChallengeTaskStatus(Long challengeTaskStatus) {
    this.challengeTaskStatus = challengeTaskStatus;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner demandInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo demandInfo) {
    
    this.demandInfo = demandInfo;
    return this;
  }

   /**
   * Get demandInfo
   * @return demandInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo getDemandInfo() {
    return demandInfo;
  }


  public void setDemandInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo demandInfo) {
    this.demandInfo = demandInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInner progressInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo progressInfo) {
    
    this.progressInfo = progressInfo;
    return this;
  }

   /**
   * Get progressInfo
   * @return progressInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo getProgressInfo() {
    return progressInfo;
  }


  public void setProgressInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerProgressInfo progressInfo) {
    this.progressInfo = progressInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInner starChallengeInfoV2ResponseDataTaskInfoListInner = (StarChallengeInfoV2ResponseDataTaskInfoListInner) o;
    return Objects.equals(this.auditInfo, starChallengeInfoV2ResponseDataTaskInfoListInner.auditInfo) &&
        Objects.equals(this.challengeAuditStatus, starChallengeInfoV2ResponseDataTaskInfoListInner.challengeAuditStatus) &&
        Objects.equals(this.challengeBillInfo, starChallengeInfoV2ResponseDataTaskInfoListInner.challengeBillInfo) &&
        Objects.equals(this.challengeInfo, starChallengeInfoV2ResponseDataTaskInfoListInner.challengeInfo) &&
        Objects.equals(this.challengeTaskId, starChallengeInfoV2ResponseDataTaskInfoListInner.challengeTaskId) &&
        Objects.equals(this.challengeTaskStatus, starChallengeInfoV2ResponseDataTaskInfoListInner.challengeTaskStatus) &&
        Objects.equals(this.createTime, starChallengeInfoV2ResponseDataTaskInfoListInner.createTime) &&
        Objects.equals(this.demandInfo, starChallengeInfoV2ResponseDataTaskInfoListInner.demandInfo) &&
        Objects.equals(this.progressInfo, starChallengeInfoV2ResponseDataTaskInfoListInner.progressInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditInfo, challengeAuditStatus, challengeBillInfo, challengeInfo, challengeTaskId, challengeTaskStatus, createTime, demandInfo, progressInfo);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInner {\n");
    sb.append("    auditInfo: ").append(toIndentedString(auditInfo)).append("\n");
    sb.append("    challengeAuditStatus: ").append(toIndentedString(challengeAuditStatus)).append("\n");
    sb.append("    challengeBillInfo: ").append(toIndentedString(challengeBillInfo)).append("\n");
    sb.append("    challengeInfo: ").append(toIndentedString(challengeInfo)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    challengeTaskStatus: ").append(toIndentedString(challengeTaskStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandInfo: ").append(toIndentedString(demandInfo)).append("\n");
    sb.append("    progressInfo: ").append(toIndentedString(progressInfo)).append("\n");
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
    openapiFields.add("audit_info");
    openapiFields.add("challenge_audit_status");
    openapiFields.add("challenge_bill_info");
    openapiFields.add("challenge_info");
    openapiFields.add("challenge_task_id");
    openapiFields.add("challenge_task_status");
    openapiFields.add("create_time");
    openapiFields.add("demand_info");
    openapiFields.add("progress_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInner
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInner.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

