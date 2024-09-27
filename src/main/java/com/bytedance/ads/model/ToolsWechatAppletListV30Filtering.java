/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsWechatAppletListV30FilteringAuditStatus;
import com.bytedance.ads.model.ToolsWechatAppletListV30FilteringCreateTime;
import com.bytedance.ads.model.ToolsWechatAppletListV30FilteringSearchType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsWechatAppletListV30Filtering {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private ToolsWechatAppletListV30FilteringAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private ToolsWechatAppletListV30FilteringCreateTime createTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "search_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private ToolsWechatAppletListV30FilteringSearchType searchType = null;

  public ToolsWechatAppletListV30Filtering() {
  }

  public ToolsWechatAppletListV30Filtering auditStatus(ToolsWechatAppletListV30FilteringAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30FilteringAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(ToolsWechatAppletListV30FilteringAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public ToolsWechatAppletListV30Filtering createTime(ToolsWechatAppletListV30FilteringCreateTime createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30FilteringCreateTime getCreateTime() {
    return createTime;
  }


  public void setCreateTime(ToolsWechatAppletListV30FilteringCreateTime createTime) {
    this.createTime = createTime;
  }


  public ToolsWechatAppletListV30Filtering name(String name) {
    
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


  public ToolsWechatAppletListV30Filtering searchType(ToolsWechatAppletListV30FilteringSearchType searchType) {
    
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @javax.annotation.Nullable
  public ToolsWechatAppletListV30FilteringSearchType getSearchType() {
    return searchType;
  }


  public void setSearchType(ToolsWechatAppletListV30FilteringSearchType searchType) {
    this.searchType = searchType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsWechatAppletListV30Filtering toolsWechatAppletListV30Filtering = (ToolsWechatAppletListV30Filtering) o;
    return Objects.equals(this.auditStatus, toolsWechatAppletListV30Filtering.auditStatus) &&
        Objects.equals(this.createTime, toolsWechatAppletListV30Filtering.createTime) &&
        Objects.equals(this.name, toolsWechatAppletListV30Filtering.name) &&
        Objects.equals(this.searchType, toolsWechatAppletListV30Filtering.searchType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, createTime, name, searchType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsWechatAppletListV30Filtering {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("create_time");
    openapiFields.add("name");
    openapiFields.add("search_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsWechatAppletListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsWechatAppletListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsWechatAppletListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsWechatAppletListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsWechatAppletListV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsWechatAppletListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsWechatAppletListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsWechatAppletListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsWechatAppletListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsWechatAppletListV30Filtering
  */
  public static ToolsWechatAppletListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsWechatAppletListV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsWechatAppletListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

