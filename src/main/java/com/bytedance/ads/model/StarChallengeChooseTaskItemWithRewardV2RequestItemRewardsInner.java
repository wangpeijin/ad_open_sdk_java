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
 * StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner {
  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_REWARD_AMOUNT = "reward_amount";
  @SerializedName(SERIALIZED_NAME_REWARD_AMOUNT)
  private Long rewardAmount = null;

  public StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner() {
  }

  public StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 作品id
   * @return itemId
  **/
  @javax.annotation.Nonnull
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner rewardAmount(Long rewardAmount) {
    
    this.rewardAmount = rewardAmount;
    return this;
  }

   /**
   * 选稿金额（单位：分）
   * @return rewardAmount
  **/
  @javax.annotation.Nonnull
  public Long getRewardAmount() {
    return rewardAmount;
  }


  public void setRewardAmount(Long rewardAmount) {
    this.rewardAmount = rewardAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner starChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner = (StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner) o;
    return Objects.equals(this.itemId, starChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner.itemId) &&
        Objects.equals(this.rewardAmount, starChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner.rewardAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemId, rewardAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner {\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    rewardAmount: ").append(toIndentedString(rewardAmount)).append("\n");
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
    openapiFields.add("item_id");
    openapiFields.add("reward_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("reward_amount");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner>() {
           @Override
           public void write(JsonWriter out, StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner
  * @throws IOException if the JSON string is invalid with respect to StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner
  */
  public static StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner.class);
  }

 /**
  * Convert an instance of StarChallengeChooseTaskItemWithRewardV2RequestItemRewardsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

