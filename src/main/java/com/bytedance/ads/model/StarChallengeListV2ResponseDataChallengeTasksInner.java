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
 * StarChallengeListV2ResponseDataChallengeTasksInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StarChallengeListV2ResponseDataChallengeTasksInner {
  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_CHALLENGE_AUDIT_STATUS = "challenge_audit_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_AUDIT_STATUS)
  private Long challengeAuditStatus = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_STATUS = "challenge_task_status";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_STATUS)
  private Long challengeTaskStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public StarChallengeListV2ResponseDataChallengeTasksInner() {
  }

  public StarChallengeListV2ResponseDataChallengeTasksInner authorTaskName(String authorTaskName) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner challengeAuditStatus(Long challengeAuditStatus) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner challengeTaskId(Long challengeTaskId) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner challengeTaskStatus(Long challengeTaskStatus) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner createTime(Long createTime) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarChallengeListV2ResponseDataChallengeTasksInner endTime(Long endTime) {
    
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


  public StarChallengeListV2ResponseDataChallengeTasksInner startTime(Long startTime) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeListV2ResponseDataChallengeTasksInner starChallengeListV2ResponseDataChallengeTasksInner = (StarChallengeListV2ResponseDataChallengeTasksInner) o;
    return Objects.equals(this.authorTaskName, starChallengeListV2ResponseDataChallengeTasksInner.authorTaskName) &&
        Objects.equals(this.challengeAuditStatus, starChallengeListV2ResponseDataChallengeTasksInner.challengeAuditStatus) &&
        Objects.equals(this.challengeTaskId, starChallengeListV2ResponseDataChallengeTasksInner.challengeTaskId) &&
        Objects.equals(this.challengeTaskStatus, starChallengeListV2ResponseDataChallengeTasksInner.challengeTaskStatus) &&
        Objects.equals(this.createTime, starChallengeListV2ResponseDataChallengeTasksInner.createTime) &&
        Objects.equals(this.demandName, starChallengeListV2ResponseDataChallengeTasksInner.demandName) &&
        Objects.equals(this.endTime, starChallengeListV2ResponseDataChallengeTasksInner.endTime) &&
        Objects.equals(this.startTime, starChallengeListV2ResponseDataChallengeTasksInner.startTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorTaskName, challengeAuditStatus, challengeTaskId, challengeTaskStatus, createTime, demandName, endTime, startTime);
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
    sb.append("class StarChallengeListV2ResponseDataChallengeTasksInner {\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    challengeAuditStatus: ").append(toIndentedString(challengeAuditStatus)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    challengeTaskStatus: ").append(toIndentedString(challengeTaskStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("challenge_audit_status");
    openapiFields.add("challenge_task_id");
    openapiFields.add("challenge_task_status");
    openapiFields.add("create_time");
    openapiFields.add("demand_name");
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeListV2ResponseDataChallengeTasksInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeListV2ResponseDataChallengeTasksInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeListV2ResponseDataChallengeTasksInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeListV2ResponseDataChallengeTasksInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeListV2ResponseDataChallengeTasksInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeListV2ResponseDataChallengeTasksInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeListV2ResponseDataChallengeTasksInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeListV2ResponseDataChallengeTasksInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeListV2ResponseDataChallengeTasksInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeListV2ResponseDataChallengeTasksInner
  */
  public static StarChallengeListV2ResponseDataChallengeTasksInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeListV2ResponseDataChallengeTasksInner.class);
  }

 /**
  * Convert an instance of StarChallengeListV2ResponseDataChallengeTasksInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

