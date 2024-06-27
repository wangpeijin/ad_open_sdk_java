/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList = null;

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo abstractText(String abstractText) {
    
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


  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo bidwordList(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo addBidwordListItem(CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner bidwordListItem) {
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
  public List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo wordList(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo addWordListItem(CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner wordListItem) {
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
  public List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
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
    CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo = (CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo) o;
    return Objects.equals(this.abstractText, creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.abstractText) &&
        Objects.equals(this.bidwordList, creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.bidwordList) &&
        Objects.equals(this.wordList, creativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractText, bidwordList, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo {\n");
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
       if (!CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo
  */
  public static CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

