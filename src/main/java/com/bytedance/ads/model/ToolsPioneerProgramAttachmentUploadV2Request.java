/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2DataFileType;
import com.bytedance.ads.model.ToolsPioneerProgramAttachmentUploadV2Platform;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * ToolsPioneerProgramAttachmentUploadV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsPioneerProgramAttachmentUploadV2Request {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_DATA_FILE_TYPE = "data_file_type";
  @SerializedName(SERIALIZED_NAME_DATA_FILE_TYPE)
  private ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType = null;

  public static final String SERIALIZED_NAME_DEBUG_MODE = "debug_mode";
  @SerializedName(SERIALIZED_NAME_DEBUG_MODE)
  private Boolean debugMode = null;

  public static final String SERIALIZED_NAME_FILE_DATA = "file_data";
  @SerializedName(SERIALIZED_NAME_FILE_DATA)
  private File fileData = null;

  public static final String SERIALIZED_NAME_FILE_INDEX = "file_index";
  @SerializedName(SERIALIZED_NAME_FILE_INDEX)
  private Long fileIndex = null;

  public static final String SERIALIZED_NAME_FILE_TOTAL_NUM = "file_total_num";
  @SerializedName(SERIALIZED_NAME_FILE_TOTAL_NUM)
  private Long fileTotalNum = null;

  public static final String SERIALIZED_NAME_P_DATE = "p_date";
  @SerializedName(SERIALIZED_NAME_P_DATE)
  private String pDate = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private ToolsPioneerProgramAttachmentUploadV2Platform platform = null;

  public ToolsPioneerProgramAttachmentUploadV2Request() {
  }

  public ToolsPioneerProgramAttachmentUploadV2Request appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 即应用ID，开发者创建应用的唯一标识，可通过应用管理查看
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request dataFileType(ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType) {
    
    this.dataFileType = dataFileType;
    return this;
  }

   /**
   * Get dataFileType
   * @return dataFileType
  **/
  @javax.annotation.Nullable
  public ToolsPioneerProgramAttachmentUploadV2DataFileType getDataFileType() {
    return dataFileType;
  }


  public void setDataFileType(ToolsPioneerProgramAttachmentUploadV2DataFileType dataFileType) {
    this.dataFileType = dataFileType;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request debugMode(Boolean debugMode) {
    
    this.debugMode = debugMode;
    return this;
  }

   /**
   * 是否为调试模式，调试模式下数据不会被最终记录，默认为False
   * @return debugMode
  **/
  @javax.annotation.Nullable
  public Boolean getDebugMode() {
    return debugMode;
  }


  public void setDebugMode(Boolean debugMode) {
    this.debugMode = debugMode;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request fileData(File fileData) {
    
    this.fileData = fileData;
    return this;
  }

   /**
   * 文件数据，binary格式
   * @return fileData
  **/
  @javax.annotation.Nonnull
  public File getFileData() {
    return fileData;
  }


  public void setFileData(File fileData) {
    this.fileData = fileData;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request fileIndex(Long fileIndex) {
    
    this.fileIndex = fileIndex;
    return this;
  }

   /**
   * 当前文件序号，从1开始，最大值为file_total_num
   * @return fileIndex
  **/
  @javax.annotation.Nullable
  public Long getFileIndex() {
    return fileIndex;
  }


  public void setFileIndex(Long fileIndex) {
    this.fileIndex = fileIndex;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request fileTotalNum(Long fileTotalNum) {
    
    this.fileTotalNum = fileTotalNum;
    return this;
  }

   /**
   * p_date - platform - data_file_type维度下总文件数，如“2022-06-12”日“巨量引擎”平台的“后端投放数据”共计3份，则file_total_num为3
   * @return fileTotalNum
  **/
  @javax.annotation.Nullable
  public Long getFileTotalNum() {
    return fileTotalNum;
  }


  public void setFileTotalNum(Long fileTotalNum) {
    this.fileTotalNum = fileTotalNum;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request pDate(String pDate) {
    
    this.pDate = pDate;
    return this;
  }

   /**
   * 数据日期，格式为yyyy-MM-dd
   * @return pDate
  **/
  @javax.annotation.Nullable
  public String getpDate() {
    return pDate;
  }


  public void setpDate(String pDate) {
    this.pDate = pDate;
  }


  public ToolsPioneerProgramAttachmentUploadV2Request platform(ToolsPioneerProgramAttachmentUploadV2Platform platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @javax.annotation.Nullable
  public ToolsPioneerProgramAttachmentUploadV2Platform getPlatform() {
    return platform;
  }


  public void setPlatform(ToolsPioneerProgramAttachmentUploadV2Platform platform) {
    this.platform = platform;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPioneerProgramAttachmentUploadV2Request toolsPioneerProgramAttachmentUploadV2Request = (ToolsPioneerProgramAttachmentUploadV2Request) o;
    return Objects.equals(this.appId, toolsPioneerProgramAttachmentUploadV2Request.appId) &&
        Objects.equals(this.dataFileType, toolsPioneerProgramAttachmentUploadV2Request.dataFileType) &&
        Objects.equals(this.debugMode, toolsPioneerProgramAttachmentUploadV2Request.debugMode) &&
        Objects.equals(this.fileData, toolsPioneerProgramAttachmentUploadV2Request.fileData) &&
        Objects.equals(this.fileIndex, toolsPioneerProgramAttachmentUploadV2Request.fileIndex) &&
        Objects.equals(this.fileTotalNum, toolsPioneerProgramAttachmentUploadV2Request.fileTotalNum) &&
        Objects.equals(this.pDate, toolsPioneerProgramAttachmentUploadV2Request.pDate) &&
        Objects.equals(this.platform, toolsPioneerProgramAttachmentUploadV2Request.platform);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, dataFileType, debugMode, fileData, fileIndex, fileTotalNum, pDate, platform);
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
    sb.append("class ToolsPioneerProgramAttachmentUploadV2Request {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    dataFileType: ").append(toIndentedString(dataFileType)).append("\n");
    sb.append("    debugMode: ").append(toIndentedString(debugMode)).append("\n");
    sb.append("    fileData: ").append(toIndentedString(fileData)).append("\n");
    sb.append("    fileIndex: ").append(toIndentedString(fileIndex)).append("\n");
    sb.append("    fileTotalNum: ").append(toIndentedString(fileTotalNum)).append("\n");
    sb.append("    pDate: ").append(toIndentedString(pDate)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("data_file_type");
    openapiFields.add("debug_mode");
    openapiFields.add("file_data");
    openapiFields.add("file_index");
    openapiFields.add("file_total_num");
    openapiFields.add("p_date");
    openapiFields.add("platform");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_id");
    openapiRequiredFields.add("data_file_type");
    openapiRequiredFields.add("file_data");
    openapiRequiredFields.add("file_index");
    openapiRequiredFields.add("file_total_num");
    openapiRequiredFields.add("p_date");
    openapiRequiredFields.add("platform");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPioneerProgramAttachmentUploadV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPioneerProgramAttachmentUploadV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPioneerProgramAttachmentUploadV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPioneerProgramAttachmentUploadV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPioneerProgramAttachmentUploadV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPioneerProgramAttachmentUploadV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPioneerProgramAttachmentUploadV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPioneerProgramAttachmentUploadV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPioneerProgramAttachmentUploadV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPioneerProgramAttachmentUploadV2Request
  */
  public static ToolsPioneerProgramAttachmentUploadV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPioneerProgramAttachmentUploadV2Request.class);
  }

 /**
  * Convert an instance of ToolsPioneerProgramAttachmentUploadV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

