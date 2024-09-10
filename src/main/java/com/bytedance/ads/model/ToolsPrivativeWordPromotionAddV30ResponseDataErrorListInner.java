/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner;
import com.bytedance.ads.model.ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_FAIL_PHRASE_WORDS = "fail_phrase_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PHRASE_WORDS)
  private List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords = null;

  public static final String SERIALIZED_NAME_FAIL_PRECISE_WORDS = "fail_precise_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PRECISE_WORDS)
  private List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner() {
  }

  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner failPhraseWords(List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    
    this.failPhraseWords = failPhraseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner addFailPhraseWordsItem(ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner failPhraseWordsItem) {
    if (this.failPhraseWords == null) {
      this.failPhraseWords = new ArrayList<>();
    }
    this.failPhraseWords.add(failPhraseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPhraseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner> getFailPhraseWords() {
    return failPhraseWords;
  }


  public void setFailPhraseWords(List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    this.failPhraseWords = failPhraseWords;
  }


  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner failPreciseWords(List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    
    this.failPreciseWords = failPreciseWords;
    return this;
  }

  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner addFailPreciseWordsItem(ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner failPreciseWordsItem) {
    if (this.failPreciseWords == null) {
      this.failPreciseWords = new ArrayList<>();
    }
    this.failPreciseWords.add(failPreciseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPreciseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner> getFailPreciseWords() {
    return failPreciseWords;
  }


  public void setFailPreciseWords(List<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    this.failPreciseWords = failPreciseWords;
  }


  public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 
   * @return promotionId
  **/
  @javax.annotation.Nullable
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner toolsPrivativeWordPromotionAddV30ResponseDataErrorListInner = (ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner) o;
    return Objects.equals(this.errorMessage, toolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.failPhraseWords, toolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.failPhraseWords) &&
        Objects.equals(this.failPreciseWords, toolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.failPreciseWords) &&
        Objects.equals(this.promotionId, toolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.promotionId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, failPhraseWords, failPreciseWords, promotionId);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    failPhraseWords: ").append(toIndentedString(failPhraseWords)).append("\n");
    sb.append("    failPreciseWords: ").append(toIndentedString(failPreciseWords)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("error_message");
    openapiFields.add("fail_phrase_words");
    openapiFields.add("fail_precise_words");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner
  */
  public static ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordPromotionAddV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

