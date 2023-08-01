/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.6
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
 * PromotionDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-01T15:20:00.039+08:00[Asia/Shanghai]")
public class PromotionDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PROMOTION_IDS = "promotion_ids";
  @SerializedName(SERIALIZED_NAME_PROMOTION_IDS)
  private List<Long> promotionIds = null;

  public PromotionDeleteV30Request() {
  }

  public PromotionDeleteV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public PromotionDeleteV30Request promotionIds(List<Long> promotionIds) {
    
    this.promotionIds = promotionIds;
    return this;
  }

  public PromotionDeleteV30Request addPromotionIdsItem(Long promotionIdsItem) {
    if (this.promotionIds == null) {
      this.promotionIds = new ArrayList<>();
    }
    this.promotionIds.add(promotionIdsItem);
    return this;
  }

   /**
   * 待删除的广告ID列表
   * @return promotionIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getPromotionIds() {
    return promotionIds;
  }


  public void setPromotionIds(List<Long> promotionIds) {
    this.promotionIds = promotionIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionDeleteV30Request promotionDeleteV30Request = (PromotionDeleteV30Request) o;
    return Objects.equals(this.advertiserId, promotionDeleteV30Request.advertiserId) &&
        Objects.equals(this.promotionIds, promotionDeleteV30Request.promotionIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, promotionIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    promotionIds: ").append(toIndentedString(promotionIds)).append("\n");
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
    openapiFields.add("promotion_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("promotion_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, PromotionDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to PromotionDeleteV30Request
  */
  public static PromotionDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionDeleteV30Request.class);
  }

 /**
  * Convert an instance of PromotionDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

