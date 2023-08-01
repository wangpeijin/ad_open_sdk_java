/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30KeywordsMatchType;
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
 * PromotionCreateV30RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-01T18:09:26.254+08:00[Asia/Shanghai]")
public class PromotionCreateV30RequestKeywordsInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Float bid = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private PromotionCreateV30KeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public PromotionCreateV30RequestKeywordsInner() {
  }

  public PromotionCreateV30RequestKeywordsInner bid(Float bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Float getBid() {
    return bid;
  }


  public void setBid(Float bid) {
    this.bid = bid;
  }


  public PromotionCreateV30RequestKeywordsInner matchType(PromotionCreateV30KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public PromotionCreateV30KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(PromotionCreateV30KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public PromotionCreateV30RequestKeywordsInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nonnull
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30RequestKeywordsInner promotionCreateV30RequestKeywordsInner = (PromotionCreateV30RequestKeywordsInner) o;
    return Objects.equals(this.bid, promotionCreateV30RequestKeywordsInner.bid) &&
        Objects.equals(this.matchType, promotionCreateV30RequestKeywordsInner.matchType) &&
        Objects.equals(this.word, promotionCreateV30RequestKeywordsInner.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, matchType, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestKeywordsInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("match_type");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("match_type");
    openapiRequiredFields.add("word");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestKeywordsInner
  */
  public static PromotionCreateV30RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

