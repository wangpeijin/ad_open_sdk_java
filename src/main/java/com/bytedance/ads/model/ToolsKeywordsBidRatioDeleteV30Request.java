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
 * ToolsKeywordsBidRatioDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsKeywordsBidRatioDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PROMOTION_WORD_IDS = "promotion_word_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_WORD_IDS)
  private List<String> promotionWordIds = null;

  public ToolsKeywordsBidRatioDeleteV30Request() {
  }

  public ToolsKeywordsBidRatioDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsKeywordsBidRatioDeleteV30Request promotionWordIds(List<String> promotionWordIds) {
    
    this.promotionWordIds = promotionWordIds;
    return this;
  }

  public ToolsKeywordsBidRatioDeleteV30Request addPromotionWordIdsItem(String promotionWordIdsItem) {
    if (this.promotionWordIds == null) {
      this.promotionWordIds = new ArrayList<>();
    }
    this.promotionWordIds.add(promotionWordIdsItem);
    return this;
  }

   /**
   * 要删除的优词计划id列表
   * @return promotionWordIds
  **/
  @javax.annotation.Nonnull
  public List<String> getPromotionWordIds() {
    return promotionWordIds;
  }


  public void setPromotionWordIds(List<String> promotionWordIds) {
    this.promotionWordIds = promotionWordIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsKeywordsBidRatioDeleteV30Request toolsKeywordsBidRatioDeleteV30Request = (ToolsKeywordsBidRatioDeleteV30Request) o;
    return Objects.equals(this.advertiserId, toolsKeywordsBidRatioDeleteV30Request.advertiserId) &&
        Objects.equals(this.promotionWordIds, toolsKeywordsBidRatioDeleteV30Request.promotionWordIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, promotionWordIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsKeywordsBidRatioDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    promotionWordIds: ").append(toIndentedString(promotionWordIds)).append("\n");
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
    openapiFields.add("promotion_word_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("promotion_word_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsBidRatioDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsBidRatioDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsBidRatioDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsBidRatioDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsBidRatioDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsBidRatioDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsBidRatioDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsBidRatioDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsBidRatioDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsBidRatioDeleteV30Request
  */
  public static ToolsKeywordsBidRatioDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsBidRatioDeleteV30Request.class);
  }

 /**
  * Convert an instance of ToolsKeywordsBidRatioDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

