/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner;
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
 * PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<Long> wordList = null;

  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner() {
  }

  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner abstractText(String abstractText) {
    
    this.abstractText = abstractText;
    return this;
  }

   /**
   * 
   * @return abstractText
  **/
  @javax.annotation.Nonnull
  public String getAbstractText() {
    return abstractText;
  }


  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }


  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner bidwordList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner addBidwordListItem(PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner bidwordListItem) {
    if (this.bidwordList == null) {
      this.bidwordList = new ArrayList<>();
    }
    this.bidwordList.add(bidwordListItem);
    return this;
  }

   /**
   * 
   * @return bidwordList
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInnerBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner wordList(List<Long> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner addWordListItem(Long wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<Long> getWordList() {
    return wordList;
  }


  public void setWordList(List<Long> wordList) {
    this.wordList = wordList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner promotionCreateV30RequestPromotionMaterialsTextAbstractListInner = (PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner) o;
    return Objects.equals(this.abstractText, promotionCreateV30RequestPromotionMaterialsTextAbstractListInner.abstractText) &&
        Objects.equals(this.bidwordList, promotionCreateV30RequestPromotionMaterialsTextAbstractListInner.bidwordList) &&
        Objects.equals(this.wordList, promotionCreateV30RequestPromotionMaterialsTextAbstractListInner.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractText, bidwordList, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner {\n");
    sb.append("    abstractText: ").append(toIndentedString(abstractText)).append("\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
    sb.append("    wordList: ").append(toIndentedString(wordList)).append("\n");
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
    openapiFields.add("abstract_text");
    openapiFields.add("bidword_list");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("abstract_text");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner
  */
  public static PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestPromotionMaterialsTextAbstractListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

