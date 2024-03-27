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
import com.bytedance.ads.model.KeywordCreateV2V2KeywordsBidType;
import com.bytedance.ads.model.KeywordCreateV2V2KeywordsMatchType;
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
 * KeywordCreateV2V2RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class KeywordCreateV2V2RequestKeywordsInner {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private KeywordCreateV2V2KeywordsBidType bidType = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private KeywordCreateV2V2KeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public KeywordCreateV2V2RequestKeywordsInner() {
  }

  public KeywordCreateV2V2RequestKeywordsInner bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * minimum: 0.0
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public KeywordCreateV2V2RequestKeywordsInner bidType(KeywordCreateV2V2KeywordsBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public KeywordCreateV2V2KeywordsBidType getBidType() {
    return bidType;
  }


  public void setBidType(KeywordCreateV2V2KeywordsBidType bidType) {
    this.bidType = bidType;
  }


  public KeywordCreateV2V2RequestKeywordsInner matchType(KeywordCreateV2V2KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public KeywordCreateV2V2KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(KeywordCreateV2V2KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public KeywordCreateV2V2RequestKeywordsInner word(String word) {
    
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
    KeywordCreateV2V2RequestKeywordsInner keywordCreateV2V2RequestKeywordsInner = (KeywordCreateV2V2RequestKeywordsInner) o;
    return Objects.equals(this.bid, keywordCreateV2V2RequestKeywordsInner.bid) &&
        Objects.equals(this.bidType, keywordCreateV2V2RequestKeywordsInner.bidType) &&
        Objects.equals(this.matchType, keywordCreateV2V2RequestKeywordsInner.matchType) &&
        Objects.equals(this.word, keywordCreateV2V2RequestKeywordsInner.word);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidType, matchType, word);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeywordCreateV2V2RequestKeywordsInner {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
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
    openapiFields.add("bid_type");
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
       if (!KeywordCreateV2V2RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'KeywordCreateV2V2RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<KeywordCreateV2V2RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(KeywordCreateV2V2RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<KeywordCreateV2V2RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, KeywordCreateV2V2RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public KeywordCreateV2V2RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of KeywordCreateV2V2RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of KeywordCreateV2V2RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to KeywordCreateV2V2RequestKeywordsInner
  */
  public static KeywordCreateV2V2RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, KeywordCreateV2V2RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of KeywordCreateV2V2RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
