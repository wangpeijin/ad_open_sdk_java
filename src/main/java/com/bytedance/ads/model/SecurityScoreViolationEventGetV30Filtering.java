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
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30FilteringIllegalType;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class SecurityScoreViolationEventGetV30Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId = null;

  public static final String SERIALIZED_NAME_ILLEGAL_TYPE = "illegal_type";
  @SerializedName(SERIALIZED_NAME_ILLEGAL_TYPE)
  private SecurityScoreViolationEventGetV30FilteringIllegalType illegalType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SecurityScoreViolationEventGetV30FilteringStatus status = null;

  public SecurityScoreViolationEventGetV30Filtering() {
  }

  public SecurityScoreViolationEventGetV30Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 筛选时间（结束）
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public SecurityScoreViolationEventGetV30Filtering eventId(Long eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * 积分违规单
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }


  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public SecurityScoreViolationEventGetV30Filtering illegalType(SecurityScoreViolationEventGetV30FilteringIllegalType illegalType) {
    
    this.illegalType = illegalType;
    return this;
  }

   /**
   * Get illegalType
   * @return illegalType
  **/
  @javax.annotation.Nullable
  public SecurityScoreViolationEventGetV30FilteringIllegalType getIllegalType() {
    return illegalType;
  }


  public void setIllegalType(SecurityScoreViolationEventGetV30FilteringIllegalType illegalType) {
    this.illegalType = illegalType;
  }


  public SecurityScoreViolationEventGetV30Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 筛选时间（开始）
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public SecurityScoreViolationEventGetV30Filtering status(SecurityScoreViolationEventGetV30FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public SecurityScoreViolationEventGetV30FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(SecurityScoreViolationEventGetV30FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreViolationEventGetV30Filtering securityScoreViolationEventGetV30Filtering = (SecurityScoreViolationEventGetV30Filtering) o;
    return Objects.equals(this.endTime, securityScoreViolationEventGetV30Filtering.endTime) &&
        Objects.equals(this.eventId, securityScoreViolationEventGetV30Filtering.eventId) &&
        Objects.equals(this.illegalType, securityScoreViolationEventGetV30Filtering.illegalType) &&
        Objects.equals(this.startTime, securityScoreViolationEventGetV30Filtering.startTime) &&
        Objects.equals(this.status, securityScoreViolationEventGetV30Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, eventId, illegalType, startTime, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityScoreViolationEventGetV30Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    illegalType: ").append(toIndentedString(illegalType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("event_id");
    openapiFields.add("illegal_type");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreViolationEventGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreViolationEventGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreViolationEventGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreViolationEventGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreViolationEventGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, SecurityScoreViolationEventGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreViolationEventGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreViolationEventGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreViolationEventGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreViolationEventGetV30Filtering
  */
  public static SecurityScoreViolationEventGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreViolationEventGetV30Filtering.class);
  }

 /**
  * Convert an instance of SecurityScoreViolationEventGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

