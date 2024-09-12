/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2ResponseDataPageInfo;
import com.bytedance.ads.model.ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolQuickAppManagementQuickAppGetV2ResponseData {
  public static final String SERIALIZED_NAME_PAGE_INFO = "page_info";
  @SerializedName(SERIALIZED_NAME_PAGE_INFO)
  private ToolQuickAppManagementQuickAppGetV2ResponseDataPageInfo pageInfo = null;

  public static final String SERIALIZED_NAME_QUICK_APP_INFO = "quick_app_info";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_INFO)
  private List<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner> quickAppInfo = null;

  public ToolQuickAppManagementQuickAppGetV2ResponseData() {
  }

  public ToolQuickAppManagementQuickAppGetV2ResponseData pageInfo(ToolQuickAppManagementQuickAppGetV2ResponseDataPageInfo pageInfo) {
    
    this.pageInfo = pageInfo;
    return this;
  }

   /**
   * Get pageInfo
   * @return pageInfo
  **/
  @javax.annotation.Nullable
  public ToolQuickAppManagementQuickAppGetV2ResponseDataPageInfo getPageInfo() {
    return pageInfo;
  }


  public void setPageInfo(ToolQuickAppManagementQuickAppGetV2ResponseDataPageInfo pageInfo) {
    this.pageInfo = pageInfo;
  }


  public ToolQuickAppManagementQuickAppGetV2ResponseData quickAppInfo(List<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner> quickAppInfo) {
    
    this.quickAppInfo = quickAppInfo;
    return this;
  }

  public ToolQuickAppManagementQuickAppGetV2ResponseData addQuickAppInfoItem(ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner quickAppInfoItem) {
    if (this.quickAppInfo == null) {
      this.quickAppInfo = new ArrayList<>();
    }
    this.quickAppInfo.add(quickAppInfoItem);
    return this;
  }

   /**
   * 
   * @return quickAppInfo
  **/
  @javax.annotation.Nullable
  public List<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner> getQuickAppInfo() {
    return quickAppInfo;
  }


  public void setQuickAppInfo(List<ToolQuickAppManagementQuickAppGetV2ResponseDataQuickAppInfoInner> quickAppInfo) {
    this.quickAppInfo = quickAppInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolQuickAppManagementQuickAppGetV2ResponseData toolQuickAppManagementQuickAppGetV2ResponseData = (ToolQuickAppManagementQuickAppGetV2ResponseData) o;
    return Objects.equals(this.pageInfo, toolQuickAppManagementQuickAppGetV2ResponseData.pageInfo) &&
        Objects.equals(this.quickAppInfo, toolQuickAppManagementQuickAppGetV2ResponseData.quickAppInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageInfo, quickAppInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolQuickAppManagementQuickAppGetV2ResponseData {\n");
    sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
    sb.append("    quickAppInfo: ").append(toIndentedString(quickAppInfo)).append("\n");
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
    openapiFields.add("page_info");
    openapiFields.add("quick_app_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("page_info");
    openapiRequiredFields.add("quick_app_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolQuickAppManagementQuickAppGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolQuickAppManagementQuickAppGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolQuickAppManagementQuickAppGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolQuickAppManagementQuickAppGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolQuickAppManagementQuickAppGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolQuickAppManagementQuickAppGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolQuickAppManagementQuickAppGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolQuickAppManagementQuickAppGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolQuickAppManagementQuickAppGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolQuickAppManagementQuickAppGetV2ResponseData
  */
  public static ToolQuickAppManagementQuickAppGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolQuickAppManagementQuickAppGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolQuickAppManagementQuickAppGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

