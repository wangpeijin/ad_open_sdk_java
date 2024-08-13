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
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerDuplicateWords;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLengthWords;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLimitWords;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerHasEmojiWords;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerSuccessWords;
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
 * ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_DUPLICATE_WORDS = "duplicate_words";
  @SerializedName(SERIALIZED_NAME_DUPLICATE_WORDS)
  private ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerDuplicateWords duplicateWords = null;

  public static final String SERIALIZED_NAME_EXCEED_LENGTH_WORDS = "exceed_length_words";
  @SerializedName(SERIALIZED_NAME_EXCEED_LENGTH_WORDS)
  private ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLengthWords exceedLengthWords = null;

  public static final String SERIALIZED_NAME_EXCEED_LIMIT_WORDS = "exceed_limit_words";
  @SerializedName(SERIALIZED_NAME_EXCEED_LIMIT_WORDS)
  private ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLimitWords exceedLimitWords = null;

  public static final String SERIALIZED_NAME_HAS_EMOJI_WORDS = "has_emoji_words";
  @SerializedName(SERIALIZED_NAME_HAS_EMOJI_WORDS)
  private ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerHasEmojiWords hasEmojiWords = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status = null;

  public static final String SERIALIZED_NAME_SUCCESS_WORDS = "success_words";
  @SerializedName(SERIALIZED_NAME_SUCCESS_WORDS)
  private ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerSuccessWords successWords = null;

  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner() {
  }

  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner duplicateWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerDuplicateWords duplicateWords) {
    
    this.duplicateWords = duplicateWords;
    return this;
  }

   /**
   * Get duplicateWords
   * @return duplicateWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerDuplicateWords getDuplicateWords() {
    return duplicateWords;
  }


  public void setDuplicateWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerDuplicateWords duplicateWords) {
    this.duplicateWords = duplicateWords;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner exceedLengthWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLengthWords exceedLengthWords) {
    
    this.exceedLengthWords = exceedLengthWords;
    return this;
  }

   /**
   * Get exceedLengthWords
   * @return exceedLengthWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLengthWords getExceedLengthWords() {
    return exceedLengthWords;
  }


  public void setExceedLengthWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLengthWords exceedLengthWords) {
    this.exceedLengthWords = exceedLengthWords;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner exceedLimitWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLimitWords exceedLimitWords) {
    
    this.exceedLimitWords = exceedLimitWords;
    return this;
  }

   /**
   * Get exceedLimitWords
   * @return exceedLimitWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLimitWords getExceedLimitWords() {
    return exceedLimitWords;
  }


  public void setExceedLimitWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerExceedLimitWords exceedLimitWords) {
    this.exceedLimitWords = exceedLimitWords;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner hasEmojiWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerHasEmojiWords hasEmojiWords) {
    
    this.hasEmojiWords = hasEmojiWords;
    return this;
  }

   /**
   * Get hasEmojiWords
   * @return hasEmojiWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerHasEmojiWords getHasEmojiWords() {
    return hasEmojiWords;
  }


  public void setHasEmojiWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerHasEmojiWords hasEmojiWords) {
    this.hasEmojiWords = hasEmojiWords;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner successWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerSuccessWords successWords) {
    
    this.successWords = successWords;
    return this;
  }

   /**
   * Get successWords
   * @return successWords
  **/
  @javax.annotation.Nullable
  public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerSuccessWords getSuccessWords() {
    return successWords;
  }


  public void setSuccessWords(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInnerSuccessWords successWords) {
    this.successWords = successWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner = (ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner) o;
    return Objects.equals(this.campaignId, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.campaignId) &&
        Objects.equals(this.duplicateWords, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.duplicateWords) &&
        Objects.equals(this.exceedLengthWords, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.exceedLengthWords) &&
        Objects.equals(this.exceedLimitWords, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.exceedLimitWords) &&
        Objects.equals(this.hasEmojiWords, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.hasEmojiWords) &&
        Objects.equals(this.status, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.status) &&
        Objects.equals(this.successWords, toolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.successWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, duplicateWords, exceedLengthWords, exceedLimitWords, hasEmojiWords, status, successWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    duplicateWords: ").append(toIndentedString(duplicateWords)).append("\n");
    sb.append("    exceedLengthWords: ").append(toIndentedString(exceedLengthWords)).append("\n");
    sb.append("    exceedLimitWords: ").append(toIndentedString(exceedLimitWords)).append("\n");
    sb.append("    hasEmojiWords: ").append(toIndentedString(hasEmojiWords)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    successWords: ").append(toIndentedString(successWords)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("duplicate_words");
    openapiFields.add("exceed_length_words");
    openapiFields.add("exceed_limit_words");
    openapiFields.add("has_emoji_words");
    openapiFields.add("status");
    openapiFields.add("success_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner
  */
  public static ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

