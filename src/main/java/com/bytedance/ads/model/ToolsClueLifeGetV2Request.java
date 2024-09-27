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
 * ToolsClueLifeGetV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsClueLifeGetV2Request {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_IDS = "local_account_ids";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_IDS)
  private List<Long> localAccountIds = null;

  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Integer page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ToolsClueLifeGetV2Request() {
  }

  public ToolsClueLifeGetV2Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 查询截止时间，格式：yyyy-MM-dd hh:mm:ss
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsClueLifeGetV2Request localAccountIds(List<Long> localAccountIds) {
    
    this.localAccountIds = localAccountIds;
    return this;
  }

  public ToolsClueLifeGetV2Request addLocalAccountIdsItem(Long localAccountIdsItem) {
    if (this.localAccountIds == null) {
      this.localAccountIds = new ArrayList<>();
    }
    this.localAccountIds.add(localAccountIdsItem);
    return this;
  }

   /**
   * 广告主ids，上限50
   * @return localAccountIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getLocalAccountIds() {
    return localAccountIds;
  }


  public void setLocalAccountIds(List<Long> localAccountIds) {
    this.localAccountIds = localAccountIds;
  }


  public ToolsClueLifeGetV2Request page(Integer page) {
    
    this.page = page;
    return this;
  }

   /**
   * 页数 默认值: 1
   * @return page
  **/
  @javax.annotation.Nonnull
  public Integer getPage() {
    return page;
  }


  public void setPage(Integer page) {
    this.page = page;
  }


  public ToolsClueLifeGetV2Request pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 页面大小 默认值: 10，上限：100
   * @return pageSize
  **/
  @javax.annotation.Nonnull
  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public ToolsClueLifeGetV2Request startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 查询起始时间，格式：yyyy-MM-dd hh:mm:ss
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
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
    ToolsClueLifeGetV2Request toolsClueLifeGetV2Request = (ToolsClueLifeGetV2Request) o;
    return Objects.equals(this.endTime, toolsClueLifeGetV2Request.endTime) &&
        Objects.equals(this.localAccountIds, toolsClueLifeGetV2Request.localAccountIds) &&
        Objects.equals(this.page, toolsClueLifeGetV2Request.page) &&
        Objects.equals(this.pageSize, toolsClueLifeGetV2Request.pageSize) &&
        Objects.equals(this.startTime, toolsClueLifeGetV2Request.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, localAccountIds, page, pageSize, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueLifeGetV2Request {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    localAccountIds: ").append(toIndentedString(localAccountIds)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
    openapiFields.add("local_account_ids");
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("local_account_ids");
    openapiRequiredFields.add("page");
    openapiRequiredFields.add("page_size");
    openapiRequiredFields.add("start_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueLifeGetV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueLifeGetV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueLifeGetV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueLifeGetV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueLifeGetV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueLifeGetV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueLifeGetV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueLifeGetV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueLifeGetV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueLifeGetV2Request
  */
  public static ToolsClueLifeGetV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueLifeGetV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueLifeGetV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

