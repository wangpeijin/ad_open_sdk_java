/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsAppIosListV2ResponseDataPageInfo {
  public static final String SERIALIZED_NAME_PAGE = "page";
  @SerializedName(SERIALIZED_NAME_PAGE)
  private Long page = null;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Long pageSize = null;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Long totalNumber = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE = "total_page";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE)
  private Long totalPage = null;

  public ToolsAppIosListV2ResponseDataPageInfo() {
  }

  public ToolsAppIosListV2ResponseDataPageInfo page(Long page) {
    
    this.page = page;
    return this;
  }

   /**
   * 
   * @return page
  **/
  @javax.annotation.Nullable
  public Long getPage() {
    return page;
  }


  public void setPage(Long page) {
    this.page = page;
  }


  public ToolsAppIosListV2ResponseDataPageInfo pageSize(Long pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 
   * @return pageSize
  **/
  @javax.annotation.Nullable
  public Long getPageSize() {
    return pageSize;
  }


  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }


  public ToolsAppIosListV2ResponseDataPageInfo totalNumber(Long totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  public Long getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Long totalNumber) {
    this.totalNumber = totalNumber;
  }


  public ToolsAppIosListV2ResponseDataPageInfo totalPage(Long totalPage) {
    
    this.totalPage = totalPage;
    return this;
  }

   /**
   * 
   * @return totalPage
  **/
  @javax.annotation.Nullable
  public Long getTotalPage() {
    return totalPage;
  }


  public void setTotalPage(Long totalPage) {
    this.totalPage = totalPage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppIosListV2ResponseDataPageInfo toolsAppIosListV2ResponseDataPageInfo = (ToolsAppIosListV2ResponseDataPageInfo) o;
    return Objects.equals(this.page, toolsAppIosListV2ResponseDataPageInfo.page) &&
        Objects.equals(this.pageSize, toolsAppIosListV2ResponseDataPageInfo.pageSize) &&
        Objects.equals(this.totalNumber, toolsAppIosListV2ResponseDataPageInfo.totalNumber) &&
        Objects.equals(this.totalPage, toolsAppIosListV2ResponseDataPageInfo.totalPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(page, pageSize, totalNumber, totalPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppIosListV2ResponseDataPageInfo {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
    sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
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
    openapiFields.add("page");
    openapiFields.add("page_size");
    openapiFields.add("total_number");
    openapiFields.add("total_page");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppIosListV2ResponseDataPageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppIosListV2ResponseDataPageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppIosListV2ResponseDataPageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppIosListV2ResponseDataPageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppIosListV2ResponseDataPageInfo>() {
           @Override
           public void write(JsonWriter out, ToolsAppIosListV2ResponseDataPageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppIosListV2ResponseDataPageInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppIosListV2ResponseDataPageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppIosListV2ResponseDataPageInfo
  * @throws IOException if the JSON string is invalid with respect to ToolsAppIosListV2ResponseDataPageInfo
  */
  public static ToolsAppIosListV2ResponseDataPageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppIosListV2ResponseDataPageInfo.class);
  }

 /**
  * Convert an instance of ToolsAppIosListV2ResponseDataPageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
