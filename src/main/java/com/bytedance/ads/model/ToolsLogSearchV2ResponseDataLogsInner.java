/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * ToolsLogSearchV2ResponseDataLogsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ToolsLogSearchV2ResponseDataLogsInner {
  public static final String SERIALIZED_NAME_CONTENT_LOG = "content_log";
  @SerializedName(SERIALIZED_NAME_CONTENT_LOG)
  private List<String> contentLog = null;

  public static final String SERIALIZED_NAME_CONTENT_TITLE = "content_title";
  @SerializedName(SERIALIZED_NAME_CONTENT_TITLE)
  private String contentTitle = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_OBJECT_ID = "object_id";
  @SerializedName(SERIALIZED_NAME_OBJECT_ID)
  private Long objectId = null;

  public static final String SERIALIZED_NAME_OBJECT_NAME = "object_name";
  @SerializedName(SERIALIZED_NAME_OBJECT_NAME)
  private String objectName = null;

  public static final String SERIALIZED_NAME_OBJECT_TYPE = "object_type";
  @SerializedName(SERIALIZED_NAME_OBJECT_TYPE)
  private String objectType = null;

  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator = null;

  public static final String SERIALIZED_NAME_OPT_IP = "opt_ip";
  @SerializedName(SERIALIZED_NAME_OPT_IP)
  private String optIp = null;

  public ToolsLogSearchV2ResponseDataLogsInner() {
  }

  public ToolsLogSearchV2ResponseDataLogsInner contentLog(List<String> contentLog) {
    
    this.contentLog = contentLog;
    return this;
  }

  public ToolsLogSearchV2ResponseDataLogsInner addContentLogItem(String contentLogItem) {
    if (this.contentLog == null) {
      this.contentLog = new ArrayList<>();
    }
    this.contentLog.add(contentLogItem);
    return this;
  }

   /**
   * 
   * @return contentLog
  **/
  @javax.annotation.Nullable
  public List<String> getContentLog() {
    return contentLog;
  }


  public void setContentLog(List<String> contentLog) {
    this.contentLog = contentLog;
  }


  public ToolsLogSearchV2ResponseDataLogsInner contentTitle(String contentTitle) {
    
    this.contentTitle = contentTitle;
    return this;
  }

   /**
   * 
   * @return contentTitle
  **/
  @javax.annotation.Nullable
  public String getContentTitle() {
    return contentTitle;
  }


  public void setContentTitle(String contentTitle) {
    this.contentTitle = contentTitle;
  }


  public ToolsLogSearchV2ResponseDataLogsInner createTime(String createTime) {
    
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


  public ToolsLogSearchV2ResponseDataLogsInner objectId(Long objectId) {
    
    this.objectId = objectId;
    return this;
  }

   /**
   * 
   * @return objectId
  **/
  @javax.annotation.Nullable
  public Long getObjectId() {
    return objectId;
  }


  public void setObjectId(Long objectId) {
    this.objectId = objectId;
  }


  public ToolsLogSearchV2ResponseDataLogsInner objectName(String objectName) {
    
    this.objectName = objectName;
    return this;
  }

   /**
   * 
   * @return objectName
  **/
  @javax.annotation.Nullable
  public String getObjectName() {
    return objectName;
  }


  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }


  public ToolsLogSearchV2ResponseDataLogsInner objectType(String objectType) {
    
    this.objectType = objectType;
    return this;
  }

   /**
   * 
   * @return objectType
  **/
  @javax.annotation.Nullable
  public String getObjectType() {
    return objectType;
  }


  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }


  public ToolsLogSearchV2ResponseDataLogsInner operator(String operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @javax.annotation.Nullable
  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public ToolsLogSearchV2ResponseDataLogsInner optIp(String optIp) {
    
    this.optIp = optIp;
    return this;
  }

   /**
   * 
   * @return optIp
  **/
  @javax.annotation.Nullable
  public String getOptIp() {
    return optIp;
  }


  public void setOptIp(String optIp) {
    this.optIp = optIp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLogSearchV2ResponseDataLogsInner toolsLogSearchV2ResponseDataLogsInner = (ToolsLogSearchV2ResponseDataLogsInner) o;
    return Objects.equals(this.contentLog, toolsLogSearchV2ResponseDataLogsInner.contentLog) &&
        Objects.equals(this.contentTitle, toolsLogSearchV2ResponseDataLogsInner.contentTitle) &&
        Objects.equals(this.createTime, toolsLogSearchV2ResponseDataLogsInner.createTime) &&
        Objects.equals(this.objectId, toolsLogSearchV2ResponseDataLogsInner.objectId) &&
        Objects.equals(this.objectName, toolsLogSearchV2ResponseDataLogsInner.objectName) &&
        Objects.equals(this.objectType, toolsLogSearchV2ResponseDataLogsInner.objectType) &&
        Objects.equals(this.operator, toolsLogSearchV2ResponseDataLogsInner.operator) &&
        Objects.equals(this.optIp, toolsLogSearchV2ResponseDataLogsInner.optIp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentLog, contentTitle, createTime, objectId, objectName, objectType, operator, optIp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLogSearchV2ResponseDataLogsInner {\n");
    sb.append("    contentLog: ").append(toIndentedString(contentLog)).append("\n");
    sb.append("    contentTitle: ").append(toIndentedString(contentTitle)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    optIp: ").append(toIndentedString(optIp)).append("\n");
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
    openapiFields.add("content_log");
    openapiFields.add("content_title");
    openapiFields.add("create_time");
    openapiFields.add("object_id");
    openapiFields.add("object_name");
    openapiFields.add("object_type");
    openapiFields.add("operator");
    openapiFields.add("opt_ip");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLogSearchV2ResponseDataLogsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLogSearchV2ResponseDataLogsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLogSearchV2ResponseDataLogsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLogSearchV2ResponseDataLogsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLogSearchV2ResponseDataLogsInner>() {
           @Override
           public void write(JsonWriter out, ToolsLogSearchV2ResponseDataLogsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLogSearchV2ResponseDataLogsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLogSearchV2ResponseDataLogsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLogSearchV2ResponseDataLogsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsLogSearchV2ResponseDataLogsInner
  */
  public static ToolsLogSearchV2ResponseDataLogsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLogSearchV2ResponseDataLogsInner.class);
  }

 /**
  * Convert an instance of ToolsLogSearchV2ResponseDataLogsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

