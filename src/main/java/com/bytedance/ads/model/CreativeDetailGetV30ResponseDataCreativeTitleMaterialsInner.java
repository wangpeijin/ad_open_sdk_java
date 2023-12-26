/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner;
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
 * CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner {
  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_DPA_WORD_LIST = "dpa_word_list";
  @SerializedName(SERIALIZED_NAME_DPA_WORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList = null;

  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner bidwordList(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner addBidwordListItem(CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner bidwordListItem) {
    if (this.bidwordList == null) {
      this.bidwordList = new ArrayList<>();
    }
    this.bidwordList.add(bidwordListItem);
    return this;
  }

   /**
   * 搜索关键词列表
   * @return bidwordList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner dpaWordList(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    
    this.dpaWordList = dpaWordList;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner addDpaWordListItem(CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner dpaWordListItem) {
    if (this.dpaWordList == null) {
      this.dpaWordList = new ArrayList<>();
    }
    this.dpaWordList.add(dpaWordListItem);
    return this;
  }

   /**
   * DPA词包ID列表
   * @return dpaWordList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner> getDpaWordList() {
    return dpaWordList;
  }


  public void setDpaWordList(List<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    this.dpaWordList = dpaWordList;
  }


  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 创意标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner wordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner addWordListItem(CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner wordListItem) {
    if (this.wordList == null) {
      this.wordList = new ArrayList<>();
    }
    this.wordList.add(wordListItem);
    return this;
  }

   /**
   * 动态词包ID列表
   * @return wordList
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeDetailGetV30ResponseDataCreativeAbstractMaterialsInnerTextAbstractInfoWordListInner> wordList) {
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
    CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner creativeDetailGetV30ResponseDataCreativeTitleMaterialsInner = (CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner) o;
    return Objects.equals(this.bidwordList, creativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.bidwordList) &&
        Objects.equals(this.dpaWordList, creativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.dpaWordList) &&
        Objects.equals(this.title, creativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.title) &&
        Objects.equals(this.wordList, creativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.wordList);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidwordList, dpaWordList, title, wordList);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner {\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
    sb.append("    dpaWordList: ").append(toIndentedString(dpaWordList)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("bidword_list");
    openapiFields.add("dpa_word_list");
    openapiFields.add("title");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeTitleMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

