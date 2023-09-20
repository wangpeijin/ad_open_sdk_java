/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolQuickAppManagementQuickAppGetV2UpdateTime {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private Long endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private Long startTime = null;

  public ToolQuickAppManagementQuickAppGetV2UpdateTime() {
  }

  public ToolQuickAppManagementQuickAppGetV2UpdateTime endTime(Long endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 时间戳（秒级）
   * @return endTime
  **/
  @javax.annotation.Nullable
  public Long getEndTime() {
    return endTime;
  }


  public void setEndTime(Long endTime) {
    this.endTime = endTime;
  }


  public ToolQuickAppManagementQuickAppGetV2UpdateTime startTime(Long startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 时间戳（秒级）
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
    ToolQuickAppManagementQuickAppGetV2UpdateTime toolQuickAppManagementQuickAppGetV2UpdateTime = (ToolQuickAppManagementQuickAppGetV2UpdateTime) o;
    return Objects.equals(this.endTime, toolQuickAppManagementQuickAppGetV2UpdateTime.endTime) &&
        Objects.equals(this.startTime, toolQuickAppManagementQuickAppGetV2UpdateTime.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolQuickAppManagementQuickAppGetV2UpdateTime {\n");
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
    openapiFields.add("end_time");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolQuickAppManagementQuickAppGetV2UpdateTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolQuickAppManagementQuickAppGetV2UpdateTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolQuickAppManagementQuickAppGetV2UpdateTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolQuickAppManagementQuickAppGetV2UpdateTime.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolQuickAppManagementQuickAppGetV2UpdateTime>() {
           @Override
           public void write(JsonWriter out, ToolQuickAppManagementQuickAppGetV2UpdateTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolQuickAppManagementQuickAppGetV2UpdateTime read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolQuickAppManagementQuickAppGetV2UpdateTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolQuickAppManagementQuickAppGetV2UpdateTime
  * @throws IOException if the JSON string is invalid with respect to ToolQuickAppManagementQuickAppGetV2UpdateTime
  */
  public static ToolQuickAppManagementQuickAppGetV2UpdateTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolQuickAppManagementQuickAppGetV2UpdateTime.class);
  }

 /**
  * Convert an instance of ToolQuickAppManagementQuickAppGetV2UpdateTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

