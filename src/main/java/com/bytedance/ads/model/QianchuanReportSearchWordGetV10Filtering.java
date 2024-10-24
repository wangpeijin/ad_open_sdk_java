/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportSearchWordGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanReportSearchWordGetV10FilteringRange;
import com.bytedance.ads.model.QianchuanReportSearchWordGetV10FilteringWordType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class QianchuanReportSearchWordGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_KEYWORD_MERGE = "keyword_merge";
  @SerializedName(SERIALIZED_NAME_KEYWORD_MERGE)
  private Boolean keywordMerge = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanReportSearchWordGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_RANGE = "range";
  @SerializedName(SERIALIZED_NAME_RANGE)
  private QianchuanReportSearchWordGetV10FilteringRange range = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public static final String SERIALIZED_NAME_WORD_TYPE = "word_type";
  @SerializedName(SERIALIZED_NAME_WORD_TYPE)
  private QianchuanReportSearchWordGetV10FilteringWordType wordType = null;

  public QianchuanReportSearchWordGetV10Filtering() {
  }

  public QianchuanReportSearchWordGetV10Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public QianchuanReportSearchWordGetV10Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public QianchuanReportSearchWordGetV10Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public QianchuanReportSearchWordGetV10Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }


  public QianchuanReportSearchWordGetV10Filtering keywordMerge(Boolean keywordMerge) {
    
    this.keywordMerge = keywordMerge;
    return this;
  }

   /**
   * 
   * @return keywordMerge
  **/
  @javax.annotation.Nullable
  public Boolean getKeywordMerge() {
    return keywordMerge;
  }


  public void setKeywordMerge(Boolean keywordMerge) {
    this.keywordMerge = keywordMerge;
  }


  public QianchuanReportSearchWordGetV10Filtering marketingGoal(QianchuanReportSearchWordGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanReportSearchWordGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanReportSearchWordGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanReportSearchWordGetV10Filtering range(QianchuanReportSearchWordGetV10FilteringRange range) {
    
    this.range = range;
    return this;
  }

   /**
   * Get range
   * @return range
  **/
  @javax.annotation.Nullable
  public QianchuanReportSearchWordGetV10FilteringRange getRange() {
    return range;
  }


  public void setRange(QianchuanReportSearchWordGetV10FilteringRange range) {
    this.range = range;
  }


  public QianchuanReportSearchWordGetV10Filtering word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public QianchuanReportSearchWordGetV10Filtering wordType(QianchuanReportSearchWordGetV10FilteringWordType wordType) {
    
    this.wordType = wordType;
    return this;
  }

   /**
   * Get wordType
   * @return wordType
  **/
  @javax.annotation.Nullable
  public QianchuanReportSearchWordGetV10FilteringWordType getWordType() {
    return wordType;
  }


  public void setWordType(QianchuanReportSearchWordGetV10FilteringWordType wordType) {
    this.wordType = wordType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportSearchWordGetV10Filtering qianchuanReportSearchWordGetV10Filtering = (QianchuanReportSearchWordGetV10Filtering) o;
    return Objects.equals(this.adIds, qianchuanReportSearchWordGetV10Filtering.adIds) &&
        Objects.equals(this.campaignIds, qianchuanReportSearchWordGetV10Filtering.campaignIds) &&
        Objects.equals(this.keywordMerge, qianchuanReportSearchWordGetV10Filtering.keywordMerge) &&
        Objects.equals(this.marketingGoal, qianchuanReportSearchWordGetV10Filtering.marketingGoal) &&
        Objects.equals(this.range, qianchuanReportSearchWordGetV10Filtering.range) &&
        Objects.equals(this.word, qianchuanReportSearchWordGetV10Filtering.word) &&
        Objects.equals(this.wordType, qianchuanReportSearchWordGetV10Filtering.wordType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, campaignIds, keywordMerge, marketingGoal, range, word, wordType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportSearchWordGetV10Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    keywordMerge: ").append(toIndentedString(keywordMerge)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    wordType: ").append(toIndentedString(wordType)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("campaign_ids");
    openapiFields.add("keyword_merge");
    openapiFields.add("marketing_goal");
    openapiFields.add("range");
    openapiFields.add("word");
    openapiFields.add("word_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportSearchWordGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportSearchWordGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportSearchWordGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportSearchWordGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportSearchWordGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanReportSearchWordGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportSearchWordGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportSearchWordGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportSearchWordGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportSearchWordGetV10Filtering
  */
  public static QianchuanReportSearchWordGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportSearchWordGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanReportSearchWordGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

