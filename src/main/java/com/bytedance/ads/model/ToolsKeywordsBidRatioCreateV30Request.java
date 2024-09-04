/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsKeywordsBidRatioCreateV30Dimension;
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
 * ToolsKeywordsBidRatioCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsKeywordsBidRatioCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BID_RATIO = "bid_ratio";
  @SerializedName(SERIALIZED_NAME_BID_RATIO)
  private Double bidRatio = null;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private ToolsKeywordsBidRatioCreateV30Dimension dimension = null;

  public static final String SERIALIZED_NAME_PROJECT_IDS = "project_ids";
  @SerializedName(SERIALIZED_NAME_PROJECT_IDS)
  private List<Long> projectIds = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<String> wordList = null;

  public ToolsKeywordsBidRatioCreateV30Request() {
  }

  public ToolsKeywordsBidRatioCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsKeywordsBidRatioCreateV30Request bidRatio(Double bidRatio) {
    
    this.bidRatio = bidRatio;
    return this;
  }

   /**
   * 
   * @return bidRatio
  **/
  @javax.annotation.Nonnull
  public Double getBidRatio() {
    return bidRatio;
  }


  public void setBidRatio(Double bidRatio) {
    this.bidRatio = bidRatio;
  }


  public ToolsKeywordsBidRatioCreateV30Request dimension(ToolsKeywordsBidRatioCreateV30Dimension dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @javax.annotation.Nonnull
  public ToolsKeywordsBidRatioCreateV30Dimension getDimension() {
    return dimension;
  }


  public void setDimension(ToolsKeywordsBidRatioCreateV30Dimension dimension) {
    this.dimension = dimension;
  }


  public ToolsKeywordsBidRatioCreateV30Request projectIds(List<Long> projectIds) {
    
    this.projectIds = projectIds;
    return this;
  }

  public ToolsKeywordsBidRatioCreateV30Request addProjectIdsItem(Long projectIdsItem) {
    if (this.projectIds == null) {
      this.projectIds = new ArrayList<>();
    }
    this.projectIds.add(projectIdsItem);
    return this;
  }

   /**
   * 
   * @return projectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProjectIds() {
    return projectIds;
  }


  public void setProjectIds(List<Long> projectIds) {
    this.projectIds = projectIds;
  }


  public ToolsKeywordsBidRatioCreateV30Request wordList(List<String> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public ToolsKeywordsBidRatioCreateV30Request addWordListItem(String wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 优词列表
   * @return wordList
  **/
  @javax.annotation.Nonnull
  public List<String> getWordList() {
    return wordList;
  }


  public void setWordList(List<String> wordList) {
    this.wordList = wordList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsBidRatioCreateV30Request toolsKeywordsBidRatioCreateV30Request = (ToolsKeywordsBidRatioCreateV30Request) o;
    return Objects.equals(this.advertiserId, toolsKeywordsBidRatioCreateV30Request.advertiserId) &&
        Objects.equals(this.bidRatio, toolsKeywordsBidRatioCreateV30Request.bidRatio) &&
        Objects.equals(this.dimension, toolsKeywordsBidRatioCreateV30Request.dimension) &&
        Objects.equals(this.projectIds, toolsKeywordsBidRatioCreateV30Request.projectIds) &&
        Objects.equals(this.wordList, toolsKeywordsBidRatioCreateV30Request.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, bidRatio, dimension, projectIds, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsKeywordsBidRatioCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    bidRatio: ").append(toIndentedString(bidRatio)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    projectIds: ").append(toIndentedString(projectIds)).append("\n");
    sb.append("    wordList: ").append(toIndentedString(wordList)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("bid_ratio");
    openapiFields.add("dimension");
    openapiFields.add("project_ids");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("bid_ratio");
    openapiRequiredFields.add("dimension");
    openapiRequiredFields.add("word_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsBidRatioCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsBidRatioCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsBidRatioCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsBidRatioCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsBidRatioCreateV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsBidRatioCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsBidRatioCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsBidRatioCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsBidRatioCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsBidRatioCreateV30Request
  */
  public static ToolsKeywordsBidRatioCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsBidRatioCreateV30Request.class);
  }

 /**
  * Convert an instance of ToolsKeywordsBidRatioCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

