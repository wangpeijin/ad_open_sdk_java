/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class DiagnosisTaskAgentCreateV2ResponseData {
  public static final String SERIALIZED_NAME_ERR_CODE = "err_code";
  @SerializedName(SERIALIZED_NAME_ERR_CODE)
  private String errCode = null;

  public static final String SERIALIZED_NAME_ERR_MESSAGE = "err_message";
  @SerializedName(SERIALIZED_NAME_ERR_MESSAGE)
  private String errMessage = null;

  public static final String SERIALIZED_NAME_FAIL_VIDEO_IDS = "fail_video_ids";
  @SerializedName(SERIALIZED_NAME_FAIL_VIDEO_IDS)
  private Map<String, Object> failVideoIds = null;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public DiagnosisTaskAgentCreateV2ResponseData() {
  }

  public DiagnosisTaskAgentCreateV2ResponseData errCode(String errCode) {
    
    this.errCode = errCode;
    return this;
  }

   /**
   * 
   * @return errCode
  **/
  @javax.annotation.Nullable
  public String getErrCode() {
    return errCode;
  }


  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }


  public DiagnosisTaskAgentCreateV2ResponseData errMessage(String errMessage) {
    
    this.errMessage = errMessage;
    return this;
  }

   /**
   * 
   * @return errMessage
  **/
  @javax.annotation.Nullable
  public String getErrMessage() {
    return errMessage;
  }


  public void setErrMessage(String errMessage) {
    this.errMessage = errMessage;
  }


  public DiagnosisTaskAgentCreateV2ResponseData failVideoIds(Map<String, Object> failVideoIds) {
    
    this.failVideoIds = failVideoIds;
    return this;
  }

  public DiagnosisTaskAgentCreateV2ResponseData putFailVideoIdsItem(String key, Object failVideoIdsItem) {
    if (this.failVideoIds == null) {
      this.failVideoIds = new HashMap<>();
    }
    this.failVideoIds.put(key, failVideoIdsItem);
    return this;
  }

   /**
   * 
   * @return failVideoIds
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getFailVideoIds() {
    return failVideoIds;
  }


  public void setFailVideoIds(Map<String, Object> failVideoIds) {
    this.failVideoIds = failVideoIds;
  }


  public DiagnosisTaskAgentCreateV2ResponseData taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public DiagnosisTaskAgentCreateV2ResponseData addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * 
   * @return taskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTaskIds() {
    return taskIds;
  }


  public void setTaskIds(List<Long> taskIds) {
    this.taskIds = taskIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisTaskAgentCreateV2ResponseData diagnosisTaskAgentCreateV2ResponseData = (DiagnosisTaskAgentCreateV2ResponseData) o;
    return Objects.equals(this.errCode, diagnosisTaskAgentCreateV2ResponseData.errCode) &&
        Objects.equals(this.errMessage, diagnosisTaskAgentCreateV2ResponseData.errMessage) &&
        Objects.equals(this.failVideoIds, diagnosisTaskAgentCreateV2ResponseData.failVideoIds) &&
        Objects.equals(this.taskIds, diagnosisTaskAgentCreateV2ResponseData.taskIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errCode, errMessage, failVideoIds, taskIds);
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
    sb.append("class DiagnosisTaskAgentCreateV2ResponseData {\n");
    sb.append("    errCode: ").append(toIndentedString(errCode)).append("\n");
    sb.append("    errMessage: ").append(toIndentedString(errMessage)).append("\n");
    sb.append("    failVideoIds: ").append(toIndentedString(failVideoIds)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
    openapiFields.add("err_code");
    openapiFields.add("err_message");
    openapiFields.add("fail_video_ids");
    openapiFields.add("task_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiagnosisTaskAgentCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosisTaskAgentCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosisTaskAgentCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosisTaskAgentCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosisTaskAgentCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, DiagnosisTaskAgentCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosisTaskAgentCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosisTaskAgentCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosisTaskAgentCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to DiagnosisTaskAgentCreateV2ResponseData
  */
  public static DiagnosisTaskAgentCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosisTaskAgentCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of DiagnosisTaskAgentCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

