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
 * QianchuanAdPivativewordsUpdateV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class QianchuanAdPivativewordsUpdateV10Request {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_PHRASE_WORDS = "phrase_words";
  @SerializedName(SERIALIZED_NAME_PHRASE_WORDS)
  private List<String> phraseWords = null;

  public static final String SERIALIZED_NAME_PRECISE_WORDS = "precise_words";
  @SerializedName(SERIALIZED_NAME_PRECISE_WORDS)
  private List<String> preciseWords = null;

  public QianchuanAdPivativewordsUpdateV10Request() {
  }

  public QianchuanAdPivativewordsUpdateV10Request adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return adId
  **/
  @javax.annotation.Nonnull
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAdPivativewordsUpdateV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAdPivativewordsUpdateV10Request phraseWords(List<String> phraseWords) {
    
    this.phraseWords = phraseWords;
    return this;
  }

  public QianchuanAdPivativewordsUpdateV10Request addPhraseWordsItem(String phraseWordsItem) {
    if (this.phraseWords == null) {
      this.phraseWords = new ArrayList<>();
    }
    this.phraseWords.add(phraseWordsItem);
    return this;
  }

   /**
   * 短语否词，传空数组为清空
   * @return phraseWords
  **/
  @javax.annotation.Nullable
  public List<String> getPhraseWords() {
    return phraseWords;
  }


  public void setPhraseWords(List<String> phraseWords) {
    this.phraseWords = phraseWords;
  }


  public QianchuanAdPivativewordsUpdateV10Request preciseWords(List<String> preciseWords) {
    
    this.preciseWords = preciseWords;
    return this;
  }

  public QianchuanAdPivativewordsUpdateV10Request addPreciseWordsItem(String preciseWordsItem) {
    if (this.preciseWords == null) {
      this.preciseWords = new ArrayList<>();
    }
    this.preciseWords.add(preciseWordsItem);
    return this;
  }

   /**
   * 精确否词，传空数组为清空
   * @return preciseWords
  **/
  @javax.annotation.Nullable
  public List<String> getPreciseWords() {
    return preciseWords;
  }


  public void setPreciseWords(List<String> preciseWords) {
    this.preciseWords = preciseWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdPivativewordsUpdateV10Request qianchuanAdPivativewordsUpdateV10Request = (QianchuanAdPivativewordsUpdateV10Request) o;
    return Objects.equals(this.adId, qianchuanAdPivativewordsUpdateV10Request.adId) &&
        Objects.equals(this.advertiserId, qianchuanAdPivativewordsUpdateV10Request.advertiserId) &&
        Objects.equals(this.phraseWords, qianchuanAdPivativewordsUpdateV10Request.phraseWords) &&
        Objects.equals(this.preciseWords, qianchuanAdPivativewordsUpdateV10Request.preciseWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, phraseWords, preciseWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdPivativewordsUpdateV10Request {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    phraseWords: ").append(toIndentedString(phraseWords)).append("\n");
    sb.append("    preciseWords: ").append(toIndentedString(preciseWords)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("phrase_words");
    openapiFields.add("precise_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ad_id");
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdPivativewordsUpdateV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdPivativewordsUpdateV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdPivativewordsUpdateV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdPivativewordsUpdateV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdPivativewordsUpdateV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAdPivativewordsUpdateV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdPivativewordsUpdateV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdPivativewordsUpdateV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdPivativewordsUpdateV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdPivativewordsUpdateV10Request
  */
  public static QianchuanAdPivativewordsUpdateV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdPivativewordsUpdateV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAdPivativewordsUpdateV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

