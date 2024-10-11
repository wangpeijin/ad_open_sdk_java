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
import com.bytedance.ads.model.ToolsLogSearchV2ResponseDataLogsInner;
import com.bytedance.ads.model.ToolsLogSearchV2ResponseDataPageInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class ToolsLogSearchV2ResponseData {
  public static final String SERIALIZED_NAME_LOGS = "logs";
  @SerializedName(SERIALIZED_NAME_LOGS)
  private List<ToolsLogSearchV2ResponseDataLogsInner> logs = null;

  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolsLogSearchV2ResponseDataPageInfo pageInfo = null;

  public ToolsLogSearchV2ResponseData() {
  }

  public ToolsLogSearchV2ResponseData logs(List<ToolsLogSearchV2ResponseDataLogsInner> logs) {
    
    this.logs = logs;
    return this;
  }

  public ToolsLogSearchV2ResponseData addLogsItem(ToolsLogSearchV2ResponseDataLogsInner logsItem) {
    if (this.logs == null) {
      this.logs = new ArrayList<>();
    }
    this.logs.add(logsItem);
    return this;
  }

   /**
   * 
   * @return logs
  **/
  @javax.annotation.Nullable
  public List<ToolsLogSearchV2ResponseDataLogsInner> getLogs() {
    return logs;
  }


  public void setLogs(List<ToolsLogSearchV2ResponseDataLogsInner> logs) {
    this.logs = logs;
  }


  public ToolsLogSearchV2ResponseData pageInfo(ToolsLogSearchV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolsLogSearchV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolsLogSearchV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsLogSearchV2ResponseData toolsLogSearchV2ResponseData = (ToolsLogSearchV2ResponseData) o;
    return Objects.equals(this.logs, toolsLogSearchV2ResponseData.logs) &&
        Objects.equals(this.pageInfo, toolsLogSearchV2ResponseData.pageInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logs, pageInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsLogSearchV2ResponseData {\n");
    sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
    openapiFields.add("logs");
    openapiFields.add("page_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsLogSearchV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsLogSearchV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsLogSearchV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsLogSearchV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsLogSearchV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsLogSearchV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsLogSearchV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsLogSearchV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsLogSearchV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsLogSearchV2ResponseData
  */
  public static ToolsLogSearchV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsLogSearchV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsLogSearchV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

