/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2FilteringCreateTime;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2FilteringPublishTime;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2FilteringSearchType;
import com.bytedance.ads.model.ToolsAppManagementAndroidAppListV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsAppManagementAndroidAppListV2Filtering {
  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private ToolsAppManagementAndroidAppListV2FilteringCreateTime createTime = null;

  public static final String SERIALIZED_NAME_PUBLISH_TIME = "publish_time";
  @SerializedName(SERIALIZED_NAME_PUBLISH_TIME)
  private ToolsAppManagementAndroidAppListV2FilteringPublishTime publishTime = null;

  public static final String SERIALIZED_NAME_SEARCH_KEY = "search_key";
  @SerializedName(SERIALIZED_NAME_SEARCH_KEY)
  private String searchKey = null;

  public static final String SERIALIZED_NAME_SEARCH_TYPE = "search_type";
  @SerializedName(SERIALIZED_NAME_SEARCH_TYPE)
  private ToolsAppManagementAndroidAppListV2FilteringSearchType searchType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppManagementAndroidAppListV2FilteringStatus status = null;

  public ToolsAppManagementAndroidAppListV2Filtering() {
  }

  public ToolsAppManagementAndroidAppListV2Filtering createTime(ToolsAppManagementAndroidAppListV2FilteringCreateTime createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * Get createTime
   * @return createTime
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidAppListV2FilteringCreateTime getCreateTime() {
    return createTime;
  }


  public void setCreateTime(ToolsAppManagementAndroidAppListV2FilteringCreateTime createTime) {
    this.createTime = createTime;
  }


  public ToolsAppManagementAndroidAppListV2Filtering publishTime(ToolsAppManagementAndroidAppListV2FilteringPublishTime publishTime) {
    
    this.publishTime = publishTime;
    return this;
  }

   /**
   * Get publishTime
   * @return publishTime
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidAppListV2FilteringPublishTime getPublishTime() {
    return publishTime;
  }


  public void setPublishTime(ToolsAppManagementAndroidAppListV2FilteringPublishTime publishTime) {
    this.publishTime = publishTime;
  }


  public ToolsAppManagementAndroidAppListV2Filtering searchKey(String searchKey) {
    
    this.searchKey = searchKey;
    return this;
  }

   /**
   * 
   * @return searchKey
  **/
  @javax.annotation.Nullable
  public String getSearchKey() {
    return searchKey;
  }


  public void setSearchKey(String searchKey) {
    this.searchKey = searchKey;
  }


  public ToolsAppManagementAndroidAppListV2Filtering searchType(ToolsAppManagementAndroidAppListV2FilteringSearchType searchType) {
    
    this.searchType = searchType;
    return this;
  }

   /**
   * Get searchType
   * @return searchType
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidAppListV2FilteringSearchType getSearchType() {
    return searchType;
  }


  public void setSearchType(ToolsAppManagementAndroidAppListV2FilteringSearchType searchType) {
    this.searchType = searchType;
  }


  public ToolsAppManagementAndroidAppListV2Filtering status(ToolsAppManagementAndroidAppListV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidAppListV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppManagementAndroidAppListV2FilteringStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidAppListV2Filtering toolsAppManagementAndroidAppListV2Filtering = (ToolsAppManagementAndroidAppListV2Filtering) o;
    return Objects.equals(this.createTime, toolsAppManagementAndroidAppListV2Filtering.createTime) &&
        Objects.equals(this.publishTime, toolsAppManagementAndroidAppListV2Filtering.publishTime) &&
        Objects.equals(this.searchKey, toolsAppManagementAndroidAppListV2Filtering.searchKey) &&
        Objects.equals(this.searchType, toolsAppManagementAndroidAppListV2Filtering.searchType) &&
        Objects.equals(this.status, toolsAppManagementAndroidAppListV2Filtering.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(createTime, publishTime, searchKey, searchType, status);
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
    sb.append("class ToolsAppManagementAndroidAppListV2Filtering {\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
    sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
    sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("publish_time");
    openapiFields.add("search_key");
    openapiFields.add("search_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidAppListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidAppListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidAppListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidAppListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidAppListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidAppListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidAppListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidAppListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidAppListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidAppListV2Filtering
  */
  public static ToolsAppManagementAndroidAppListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidAppListV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidAppListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

