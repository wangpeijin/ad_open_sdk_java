/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class AsyncTaskCreateV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_ERR_MSG = "err_msg";
  @SerializedName(SERIALIZED_NAME_ERR_MSG)
  private String errMsg = null;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Long fileSize = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public static final String SERIALIZED_NAME_TASK_PARAMS = "task_params";
  @SerializedName(SERIALIZED_NAME_TASK_PARAMS)
  private Object taskParams = null;

  public static final String SERIALIZED_NAME_TASK_STATUS = "task_status";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  private String taskStatus = null;

  public static final String SERIALIZED_NAME_TASK_TYPE = "task_type";
  @SerializedName(SERIALIZED_NAME_TASK_TYPE)
  private String taskType = null;

  public AsyncTaskCreateV2ResponseData() {
  }

  public AsyncTaskCreateV2ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AsyncTaskCreateV2ResponseData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public AsyncTaskCreateV2ResponseData errMsg(String errMsg) {
    
    this.errMsg = errMsg;
    return this;
  }

   /**
   * 
   * @return errMsg
  **/
  @javax.annotation.Nullable
  public String getErrMsg() {
    return errMsg;
  }


  public void setErrMsg(String errMsg) {
    this.errMsg = errMsg;
  }


  public AsyncTaskCreateV2ResponseData fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * 
   * @return fileSize
  **/
  @javax.annotation.Nullable
  public Long getFileSize() {
    return fileSize;
  }


  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public AsyncTaskCreateV2ResponseData taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public AsyncTaskCreateV2ResponseData taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 
   * @return taskName
  **/
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }


  public AsyncTaskCreateV2ResponseData taskParams(Object taskParams) {
    
    this.taskParams = taskParams;
    return this;
  }

   /**
   * 
   * @return taskParams
  **/
  @javax.annotation.Nullable
  public Object getTaskParams() {
    return taskParams;
  }


  public void setTaskParams(Object taskParams) {
    this.taskParams = taskParams;
  }


  public AsyncTaskCreateV2ResponseData taskStatus(String taskStatus) {
    
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * 
   * @return taskStatus
  **/
  @javax.annotation.Nullable
  public String getTaskStatus() {
    return taskStatus;
  }


  public void setTaskStatus(String taskStatus) {
    this.taskStatus = taskStatus;
  }


  public AsyncTaskCreateV2ResponseData taskType(String taskType) {
    
    this.taskType = taskType;
    return this;
  }

   /**
   * 
   * @return taskType
  **/
  @javax.annotation.Nullable
  public String getTaskType() {
    return taskType;
  }


  public void setTaskType(String taskType) {
    this.taskType = taskType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTaskCreateV2ResponseData asyncTaskCreateV2ResponseData = (AsyncTaskCreateV2ResponseData) o;
    return Objects.equals(this.advertiserId, asyncTaskCreateV2ResponseData.advertiserId) &&
        Objects.equals(this.createTime, asyncTaskCreateV2ResponseData.createTime) &&
        Objects.equals(this.errMsg, asyncTaskCreateV2ResponseData.errMsg) &&
        Objects.equals(this.fileSize, asyncTaskCreateV2ResponseData.fileSize) &&
        Objects.equals(this.taskId, asyncTaskCreateV2ResponseData.taskId) &&
        Objects.equals(this.taskName, asyncTaskCreateV2ResponseData.taskName) &&
        Objects.equals(this.taskParams, asyncTaskCreateV2ResponseData.taskParams) &&
        Objects.equals(this.taskStatus, asyncTaskCreateV2ResponseData.taskStatus) &&
        Objects.equals(this.taskType, asyncTaskCreateV2ResponseData.taskType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, createTime, errMsg, fileSize, taskId, taskName, taskParams, taskStatus, taskType);
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
    sb.append("class AsyncTaskCreateV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    errMsg: ").append(toIndentedString(errMsg)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
    sb.append("    taskParams: ").append(toIndentedString(taskParams)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
    sb.append("    taskType: ").append(toIndentedString(taskType)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("create_time");
    openapiFields.add("err_msg");
    openapiFields.add("file_size");
    openapiFields.add("task_id");
    openapiFields.add("task_name");
    openapiFields.add("task_params");
    openapiFields.add("task_status");
    openapiFields.add("task_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncTaskCreateV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncTaskCreateV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncTaskCreateV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncTaskCreateV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncTaskCreateV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AsyncTaskCreateV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncTaskCreateV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncTaskCreateV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncTaskCreateV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AsyncTaskCreateV2ResponseData
  */
  public static AsyncTaskCreateV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncTaskCreateV2ResponseData.class);
  }

 /**
  * Convert an instance of AsyncTaskCreateV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

