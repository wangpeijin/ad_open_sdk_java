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
import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2DataListTaskStatus;
import com.bytedance.ads.model.FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams;
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
 * FileVideoMaterialClearTaskGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class FileVideoMaterialClearTaskGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_CLEAR_ID = "clear_id";
  @SerializedName(SERIALIZED_NAME_CLEAR_ID)
  private Long clearId = null;

  public static final String SERIALIZED_NAME_CLEAR_TASK_PARAMS = "clear_task_params";
  @SerializedName(SERIALIZED_NAME_CLEAR_TASK_PARAMS)
  private FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams clearTaskParams = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_TASK_STATUS = "task_status";
  @SerializedName(SERIALIZED_NAME_TASK_STATUS)
  private FileVideoMaterialClearTaskGetV2DataListTaskStatus taskStatus = null;

  public FileVideoMaterialClearTaskGetV2ResponseDataListInner() {
  }

  public FileVideoMaterialClearTaskGetV2ResponseDataListInner clearId(Long clearId) {
    
    this.clearId = clearId;
    return this;
  }

   /**
   * 清理任务id
   * @return clearId
  **/
  @javax.annotation.Nullable
  public Long getClearId() {
    return clearId;
  }


  public void setClearId(Long clearId) {
    this.clearId = clearId;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInner clearTaskParams(FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams clearTaskParams) {
    
    this.clearTaskParams = clearTaskParams;
    return this;
  }

   /**
   * Get clearTaskParams
   * @return clearTaskParams
  **/
  @javax.annotation.Nullable
  public FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams getClearTaskParams() {
    return clearTaskParams;
  }


  public void setClearTaskParams(FileVideoMaterialClearTaskGetV2ResponseDataListInnerClearTaskParams clearTaskParams) {
    this.clearTaskParams = clearTaskParams;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 任务创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public FileVideoMaterialClearTaskGetV2ResponseDataListInner taskStatus(FileVideoMaterialClearTaskGetV2DataListTaskStatus taskStatus) {
    
    this.taskStatus = taskStatus;
    return this;
  }

   /**
   * Get taskStatus
   * @return taskStatus
  **/
  @javax.annotation.Nullable
  public FileVideoMaterialClearTaskGetV2DataListTaskStatus getTaskStatus() {
    return taskStatus;
  }


  public void setTaskStatus(FileVideoMaterialClearTaskGetV2DataListTaskStatus taskStatus) {
    this.taskStatus = taskStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoMaterialClearTaskGetV2ResponseDataListInner fileVideoMaterialClearTaskGetV2ResponseDataListInner = (FileVideoMaterialClearTaskGetV2ResponseDataListInner) o;
    return Objects.equals(this.clearId, fileVideoMaterialClearTaskGetV2ResponseDataListInner.clearId) &&
        Objects.equals(this.clearTaskParams, fileVideoMaterialClearTaskGetV2ResponseDataListInner.clearTaskParams) &&
        Objects.equals(this.createTime, fileVideoMaterialClearTaskGetV2ResponseDataListInner.createTime) &&
        Objects.equals(this.taskStatus, fileVideoMaterialClearTaskGetV2ResponseDataListInner.taskStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(clearId, clearTaskParams, createTime, taskStatus);
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
    sb.append("class FileVideoMaterialClearTaskGetV2ResponseDataListInner {\n");
    sb.append("    clearId: ").append(toIndentedString(clearId)).append("\n");
    sb.append("    clearTaskParams: ").append(toIndentedString(clearTaskParams)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
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
    openapiFields.add("clear_id");
    openapiFields.add("clear_task_params");
    openapiFields.add("create_time");
    openapiFields.add("task_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoMaterialClearTaskGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoMaterialClearTaskGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoMaterialClearTaskGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoMaterialClearTaskGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoMaterialClearTaskGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileVideoMaterialClearTaskGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoMaterialClearTaskGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoMaterialClearTaskGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoMaterialClearTaskGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileVideoMaterialClearTaskGetV2ResponseDataListInner
  */
  public static FileVideoMaterialClearTaskGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoMaterialClearTaskGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileVideoMaterialClearTaskGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

