/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
 * StarChallengePushItemsToAdV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StarChallengePushItemsToAdV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_CHALLENGE_TASK_ID = "challenge_task_id";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_TASK_ID)
  private Long challengeTaskId = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public StarChallengePushItemsToAdV2Request() {
  }

  public StarChallengePushItemsToAdV2Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public StarChallengePushItemsToAdV2Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告主ID，最多500个
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public StarChallengePushItemsToAdV2Request challengeTaskId(Long challengeTaskId) {
    
    this.challengeTaskId = challengeTaskId;
    return this;
  }

   /**
   * 投稿任务ID
   * @return challengeTaskId
  **/
  @javax.annotation.Nonnull
  public Long getChallengeTaskId() {
    return challengeTaskId;
  }


  public void setChallengeTaskId(Long challengeTaskId) {
    this.challengeTaskId = challengeTaskId;
  }


  public StarChallengePushItemsToAdV2Request itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public StarChallengePushItemsToAdV2Request addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 推送的作品ID列表
   * @return itemIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public StarChallengePushItemsToAdV2Request starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户星图ID
   * @return starId
  **/
  @javax.annotation.Nonnull
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengePushItemsToAdV2Request starChallengePushItemsToAdV2Request = (StarChallengePushItemsToAdV2Request) o;
    return Objects.equals(this.advertiserIds, starChallengePushItemsToAdV2Request.advertiserIds) &&
        Objects.equals(this.challengeTaskId, starChallengePushItemsToAdV2Request.challengeTaskId) &&
        Objects.equals(this.itemIds, starChallengePushItemsToAdV2Request.itemIds) &&
        Objects.equals(this.starId, starChallengePushItemsToAdV2Request.starId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserIds, challengeTaskId, itemIds, starId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengePushItemsToAdV2Request {\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    challengeTaskId: ").append(toIndentedString(challengeTaskId)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("challenge_task_id");
    openapiFields.add("item_ids");
    openapiFields.add("star_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("challenge_task_id");
    openapiRequiredFields.add("item_ids");
    openapiRequiredFields.add("star_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengePushItemsToAdV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengePushItemsToAdV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengePushItemsToAdV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengePushItemsToAdV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengePushItemsToAdV2Request>() {
           @Override
           public void write(JsonWriter out, StarChallengePushItemsToAdV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengePushItemsToAdV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengePushItemsToAdV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengePushItemsToAdV2Request
  * @throws IOException if the JSON string is invalid with respect to StarChallengePushItemsToAdV2Request
  */
  public static StarChallengePushItemsToAdV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengePushItemsToAdV2Request.class);
  }

 /**
  * Convert an instance of StarChallengePushItemsToAdV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

