/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * ToolsPrivativeWordCampaignUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ToolsPrivativeWordCampaignUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_PHRASE_WORDS = "phrase_words";
  @SerializedName(SERIALIZED_NAME_PHRASE_WORDS)
  private List<String> phraseWords = null;

  public static final String SERIALIZED_NAME_PRECISE_WORDS = "precise_words";
  @SerializedName(SERIALIZED_NAME_PRECISE_WORDS)
  private List<String> preciseWords = null;

  public ToolsPrivativeWordCampaignUpdateV2Request() {
  }

  public ToolsPrivativeWordCampaignUpdateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
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


  public ToolsPrivativeWordCampaignUpdateV2Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ToolsPrivativeWordCampaignUpdateV2Request phraseWords(List<String> phraseWords) {
    
    this.phraseWords = phraseWords;
    return this;
  }

  public ToolsPrivativeWordCampaignUpdateV2Request addPhraseWordsItem(String phraseWordsItem) {
    if (this.phraseWords == null) {
      this.phraseWords = new ArrayList<>();
    }
    this.phraseWords.add(phraseWordsItem);
    return this;
  }

   /**
   * 
   * @return phraseWords
  **/
  @javax.annotation.Nullable
  public List<String> getPhraseWords() {
    return phraseWords;
  }


  public void setPhraseWords(List<String> phraseWords) {
    this.phraseWords = phraseWords;
  }


  public ToolsPrivativeWordCampaignUpdateV2Request preciseWords(List<String> preciseWords) {
    
    this.preciseWords = preciseWords;
    return this;
  }

  public ToolsPrivativeWordCampaignUpdateV2Request addPreciseWordsItem(String preciseWordsItem) {
    if (this.preciseWords == null) {
      this.preciseWords = new ArrayList<>();
    }
    this.preciseWords.add(preciseWordsItem);
    return this;
  }

   /**
   * 
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
    ToolsPrivativeWordCampaignUpdateV2Request toolsPrivativeWordCampaignUpdateV2Request = (ToolsPrivativeWordCampaignUpdateV2Request) o;
    return Objects.equals(this.advertiserId, toolsPrivativeWordCampaignUpdateV2Request.advertiserId) &&
        Objects.equals(this.campaignId, toolsPrivativeWordCampaignUpdateV2Request.campaignId) &&
        Objects.equals(this.phraseWords, toolsPrivativeWordCampaignUpdateV2Request.phraseWords) &&
        Objects.equals(this.preciseWords, toolsPrivativeWordCampaignUpdateV2Request.preciseWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignId, phraseWords, preciseWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordCampaignUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_id");
    openapiFields.add("phrase_words");
    openapiFields.add("precise_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordCampaignUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordCampaignUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordCampaignUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordCampaignUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordCampaignUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordCampaignUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordCampaignUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordCampaignUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordCampaignUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordCampaignUpdateV2Request
  */
  public static ToolsPrivativeWordCampaignUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordCampaignUpdateV2Request.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordCampaignUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

