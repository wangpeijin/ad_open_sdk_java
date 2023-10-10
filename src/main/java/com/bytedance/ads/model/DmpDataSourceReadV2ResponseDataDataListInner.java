/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DmpDataSourceReadV2DataDataListDataSourceType;
import com.bytedance.ads.model.DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner;
import com.bytedance.ads.model.DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DmpDataSourceReadV2ResponseDataDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class DmpDataSourceReadV2ResponseDataDataListInner {
  public static final String SERIALIZED_NAME_CHANGE_LOGS = "change_logs";
  @SerializedName(SERIALIZED_NAME_CHANGE_LOGS)
  private List<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner> changeLogs = null;

  public static final String SERIALIZED_NAME_COVER_NUM = "cover_num";
  @SerializedName(SERIALIZED_NAME_COVER_NUM)
  private Long coverNum = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_ID = "data_source_id";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_ID)
  private String dataSourceId = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE_TYPE = "data_source_type";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE_TYPE)
  private DmpDataSourceReadV2DataDataListDataSourceType dataSourceType = null;

  public static final String SERIALIZED_NAME_DEFAULT_AUDIENCE = "default_audience";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AUDIENCE)
  private DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience defaultAudience = null;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_LASTEST_PUBLISHED_CHANGE_LOG_ID = "lastest_published_change_log_id";
  @SerializedName(SERIALIZED_NAME_LASTEST_PUBLISHED_CHANGE_LOG_ID)
  private Long lastestPublishedChangeLogId = null;

  public static final String SERIALIZED_NAME_LASTEST_PUBLISHED_TIME = "lastest_published_time";
  @SerializedName(SERIALIZED_NAME_LASTEST_PUBLISHED_TIME)
  private String lastestPublishedTime = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Long status = null;

  public static final String SERIALIZED_NAME_UPLOAD_NUM = "upload_num";
  @SerializedName(SERIALIZED_NAME_UPLOAD_NUM)
  private Long uploadNum = null;

  public DmpDataSourceReadV2ResponseDataDataListInner() {
  }

  public DmpDataSourceReadV2ResponseDataDataListInner changeLogs(List<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner> changeLogs) {
    
    this.changeLogs = changeLogs;
    return this;
  }

  public DmpDataSourceReadV2ResponseDataDataListInner addChangeLogsItem(DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner changeLogsItem) {
    if (this.changeLogs == null) {
      this.changeLogs = new ArrayList<>();
    }
    this.changeLogs.add(changeLogsItem);
    return this;
  }

   /**
   * 
   * @return changeLogs
  **/
  @javax.annotation.Nullable
  public List<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner> getChangeLogs() {
    return changeLogs;
  }


  public void setChangeLogs(List<DmpDataSourceReadV2ResponseDataDataListInnerChangeLogsInner> changeLogs) {
    this.changeLogs = changeLogs;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner coverNum(Long coverNum) {
    
    this.coverNum = coverNum;
    return this;
  }

   /**
   * 
   * @return coverNum
  **/
  @javax.annotation.Nullable
  public Long getCoverNum() {
    return coverNum;
  }


  public void setCoverNum(Long coverNum) {
    this.coverNum = coverNum;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner createTime(String createTime) {
    
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


  public DmpDataSourceReadV2ResponseDataDataListInner dataSourceId(String dataSourceId) {
    
    this.dataSourceId = dataSourceId;
    return this;
  }

   /**
   * 
   * @return dataSourceId
  **/
  @javax.annotation.Nullable
  public String getDataSourceId() {
    return dataSourceId;
  }


  public void setDataSourceId(String dataSourceId) {
    this.dataSourceId = dataSourceId;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner dataSourceType(DmpDataSourceReadV2DataDataListDataSourceType dataSourceType) {
    
    this.dataSourceType = dataSourceType;
    return this;
  }

   /**
   * Get dataSourceType
   * @return dataSourceType
  **/
  @javax.annotation.Nullable
  public DmpDataSourceReadV2DataDataListDataSourceType getDataSourceType() {
    return dataSourceType;
  }


  public void setDataSourceType(DmpDataSourceReadV2DataDataListDataSourceType dataSourceType) {
    this.dataSourceType = dataSourceType;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner defaultAudience(DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience defaultAudience) {
    
    this.defaultAudience = defaultAudience;
    return this;
  }

   /**
   * Get defaultAudience
   * @return defaultAudience
  **/
  @javax.annotation.Nullable
  public DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience getDefaultAudience() {
    return defaultAudience;
  }


  public void setDefaultAudience(DmpDataSourceReadV2ResponseDataDataListInnerDefaultAudience defaultAudience) {
    this.defaultAudience = defaultAudience;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner lastestPublishedChangeLogId(Long lastestPublishedChangeLogId) {
    
    this.lastestPublishedChangeLogId = lastestPublishedChangeLogId;
    return this;
  }

   /**
   * 
   * @return lastestPublishedChangeLogId
  **/
  @javax.annotation.Nullable
  public Long getLastestPublishedChangeLogId() {
    return lastestPublishedChangeLogId;
  }


  public void setLastestPublishedChangeLogId(Long lastestPublishedChangeLogId) {
    this.lastestPublishedChangeLogId = lastestPublishedChangeLogId;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner lastestPublishedTime(String lastestPublishedTime) {
    
    this.lastestPublishedTime = lastestPublishedTime;
    return this;
  }

   /**
   * 
   * @return lastestPublishedTime
  **/
  @javax.annotation.Nullable
  public String getLastestPublishedTime() {
    return lastestPublishedTime;
  }


  public void setLastestPublishedTime(String lastestPublishedTime) {
    this.lastestPublishedTime = lastestPublishedTime;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner status(Long status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public Long getStatus() {
    return status;
  }


  public void setStatus(Long status) {
    this.status = status;
  }


  public DmpDataSourceReadV2ResponseDataDataListInner uploadNum(Long uploadNum) {
    
    this.uploadNum = uploadNum;
    return this;
  }

   /**
   * 
   * @return uploadNum
  **/
  @javax.annotation.Nullable
  public Long getUploadNum() {
    return uploadNum;
  }


  public void setUploadNum(Long uploadNum) {
    this.uploadNum = uploadNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DmpDataSourceReadV2ResponseDataDataListInner dmpDataSourceReadV2ResponseDataDataListInner = (DmpDataSourceReadV2ResponseDataDataListInner) o;
    return Objects.equals(this.changeLogs, dmpDataSourceReadV2ResponseDataDataListInner.changeLogs) &&
        Objects.equals(this.coverNum, dmpDataSourceReadV2ResponseDataDataListInner.coverNum) &&
        Objects.equals(this.createTime, dmpDataSourceReadV2ResponseDataDataListInner.createTime) &&
        Objects.equals(this.dataSourceId, dmpDataSourceReadV2ResponseDataDataListInner.dataSourceId) &&
        Objects.equals(this.dataSourceType, dmpDataSourceReadV2ResponseDataDataListInner.dataSourceType) &&
        Objects.equals(this.defaultAudience, dmpDataSourceReadV2ResponseDataDataListInner.defaultAudience) &&
        Objects.equals(this.description, dmpDataSourceReadV2ResponseDataDataListInner.description) &&
        Objects.equals(this.lastestPublishedChangeLogId, dmpDataSourceReadV2ResponseDataDataListInner.lastestPublishedChangeLogId) &&
        Objects.equals(this.lastestPublishedTime, dmpDataSourceReadV2ResponseDataDataListInner.lastestPublishedTime) &&
        Objects.equals(this.modifyTime, dmpDataSourceReadV2ResponseDataDataListInner.modifyTime) &&
        Objects.equals(this.name, dmpDataSourceReadV2ResponseDataDataListInner.name) &&
        Objects.equals(this.status, dmpDataSourceReadV2ResponseDataDataListInner.status) &&
        Objects.equals(this.uploadNum, dmpDataSourceReadV2ResponseDataDataListInner.uploadNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changeLogs, coverNum, createTime, dataSourceId, dataSourceType, defaultAudience, description, lastestPublishedChangeLogId, lastestPublishedTime, modifyTime, name, status, uploadNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DmpDataSourceReadV2ResponseDataDataListInner {\n");
    sb.append("    changeLogs: ").append(toIndentedString(changeLogs)).append("\n");
    sb.append("    coverNum: ").append(toIndentedString(coverNum)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    dataSourceId: ").append(toIndentedString(dataSourceId)).append("\n");
    sb.append("    dataSourceType: ").append(toIndentedString(dataSourceType)).append("\n");
    sb.append("    defaultAudience: ").append(toIndentedString(defaultAudience)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    lastestPublishedChangeLogId: ").append(toIndentedString(lastestPublishedChangeLogId)).append("\n");
    sb.append("    lastestPublishedTime: ").append(toIndentedString(lastestPublishedTime)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    uploadNum: ").append(toIndentedString(uploadNum)).append("\n");
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
    openapiFields.add("change_logs");
    openapiFields.add("cover_num");
    openapiFields.add("create_time");
    openapiFields.add("data_source_id");
    openapiFields.add("data_source_type");
    openapiFields.add("default_audience");
    openapiFields.add("description");
    openapiFields.add("lastest_published_change_log_id");
    openapiFields.add("lastest_published_time");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("upload_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DmpDataSourceReadV2ResponseDataDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DmpDataSourceReadV2ResponseDataDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DmpDataSourceReadV2ResponseDataDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DmpDataSourceReadV2ResponseDataDataListInner>() {
           @Override
           public void write(JsonWriter out, DmpDataSourceReadV2ResponseDataDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DmpDataSourceReadV2ResponseDataDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DmpDataSourceReadV2ResponseDataDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DmpDataSourceReadV2ResponseDataDataListInner
  * @throws IOException if the JSON string is invalid with respect to DmpDataSourceReadV2ResponseDataDataListInner
  */
  public static DmpDataSourceReadV2ResponseDataDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DmpDataSourceReadV2ResponseDataDataListInner.class);
  }

 /**
  * Convert an instance of DmpDataSourceReadV2ResponseDataDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

