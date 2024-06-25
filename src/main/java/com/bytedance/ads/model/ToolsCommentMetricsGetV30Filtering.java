/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCommentMetricsGetV30FilteringHideStatus;
import com.bytedance.ads.model.ToolsCommentMetricsGetV30FilteringLevelType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsCommentMetricsGetV30Filtering {
  public static final String SERIALIZED_NAME_AUTHOR_IDS = "author_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IDS)
  private List<Long> authorIds = null;

  public static final String SERIALIZED_NAME_HIDE_STATUS = "hide_status";
  @SerializedName(SERIALIZED_NAME_HIDE_STATUS)
  private ToolsCommentMetricsGetV30FilteringHideStatus hideStatus = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_LEVEL_TYPE = "level_type";
  @SerializedName(SERIALIZED_NAME_LEVEL_TYPE)
  private ToolsCommentMetricsGetV30FilteringLevelType levelType = null;

  public ToolsCommentMetricsGetV30Filtering() {
  }

  public ToolsCommentMetricsGetV30Filtering authorIds(List<Long> authorIds) {
    
    this.authorIds = authorIds;
    return this;
  }

  public ToolsCommentMetricsGetV30Filtering addAuthorIdsItem(Long authorIdsItem) {
    if (this.authorIds == null) {
      this.authorIds = new ArrayList<>();
    }
    this.authorIds.add(authorIdsItem);
    return this;
  }

   /**
   * 
   * @return authorIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAuthorIds() {
    return authorIds;
  }


  public void setAuthorIds(List<Long> authorIds) {
    this.authorIds = authorIds;
  }


  public ToolsCommentMetricsGetV30Filtering hideStatus(ToolsCommentMetricsGetV30FilteringHideStatus hideStatus) {
    
    this.hideStatus = hideStatus;
    return this;
  }

   /**
   * Get hideStatus
   * @return hideStatus
  **/
  @javax.annotation.Nullable
  public ToolsCommentMetricsGetV30FilteringHideStatus getHideStatus() {
    return hideStatus;
  }


  public void setHideStatus(ToolsCommentMetricsGetV30FilteringHideStatus hideStatus) {
    this.hideStatus = hideStatus;
  }


  public ToolsCommentMetricsGetV30Filtering itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public ToolsCommentMetricsGetV30Filtering addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 
   * @return itemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public ToolsCommentMetricsGetV30Filtering levelType(ToolsCommentMetricsGetV30FilteringLevelType levelType) {
    
    this.levelType = levelType;
    return this;
  }

   /**
   * Get levelType
   * @return levelType
  **/
  @javax.annotation.Nullable
  public ToolsCommentMetricsGetV30FilteringLevelType getLevelType() {
    return levelType;
  }


  public void setLevelType(ToolsCommentMetricsGetV30FilteringLevelType levelType) {
    this.levelType = levelType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCommentMetricsGetV30Filtering toolsCommentMetricsGetV30Filtering = (ToolsCommentMetricsGetV30Filtering) o;
    return Objects.equals(this.authorIds, toolsCommentMetricsGetV30Filtering.authorIds) &&
        Objects.equals(this.hideStatus, toolsCommentMetricsGetV30Filtering.hideStatus) &&
        Objects.equals(this.itemIds, toolsCommentMetricsGetV30Filtering.itemIds) &&
        Objects.equals(this.levelType, toolsCommentMetricsGetV30Filtering.levelType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorIds, hideStatus, itemIds, levelType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsCommentMetricsGetV30Filtering {\n");
    sb.append("    authorIds: ").append(toIndentedString(authorIds)).append("\n");
    sb.append("    hideStatus: ").append(toIndentedString(hideStatus)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    levelType: ").append(toIndentedString(levelType)).append("\n");
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
    openapiFields.add("author_ids");
    openapiFields.add("hide_status");
    openapiFields.add("item_ids");
    openapiFields.add("level_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCommentMetricsGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCommentMetricsGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCommentMetricsGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCommentMetricsGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCommentMetricsGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsCommentMetricsGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCommentMetricsGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCommentMetricsGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCommentMetricsGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsCommentMetricsGetV30Filtering
  */
  public static ToolsCommentMetricsGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCommentMetricsGetV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsCommentMetricsGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

