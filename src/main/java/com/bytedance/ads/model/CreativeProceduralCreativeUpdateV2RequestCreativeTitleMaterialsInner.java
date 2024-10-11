/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner;
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
 * CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner {
  public static final String SERIALIZED_NAME_BIDWORD_LIST = "bidword_list";
  @SerializedName(SERIALIZED_NAME_BIDWORD_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList = null;

  public static final String SERIALIZED_NAME_DPA_WORD_LIST = "dpa_word_list";
  @SerializedName(SERIALIZED_NAME_DPA_WORD_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_WORD_LIST = "word_list";
  @SerializedName(SERIALIZED_NAME_WORD_LIST)
  private List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner bidwordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    
    this.bidwordList = bidwordList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner addBidwordListItem(CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner bidwordListItem) {
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
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner> getBidwordList() {
    return bidwordList;
  }


  public void setBidwordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerBidwordListInner> bidwordList) {
    this.bidwordList = bidwordList;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner dpaWordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    
    this.dpaWordList = dpaWordList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner addDpaWordListItem(CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner dpaWordListItem) {
    if (this.dpaWordList == null) {
      this.dpaWordList = new ArrayList<>();
    }
    this.dpaWordList.add(dpaWordListItem);
    return this;
  }

   /**
   * 
   * @return dpaWordList
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> getDpaWordList() {
    return dpaWordList;
  }


  public void setDpaWordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerDpaWordListInner> dpaWordList) {
    this.dpaWordList = dpaWordList;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nonnull
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner wordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList) {
    
    this.wordList = wordList;
    return this;
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner addWordListItem(CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner wordListItem) {
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
  public List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner> getWordList() {
    return wordList;
  }


  public void setWordList(List<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInnerWordListInner> wordList) {
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
    CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner = (CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner) o;
    return Objects.equals(this.bidwordList, creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.bidwordList) &&
        Objects.equals(this.dpaWordList, creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.dpaWordList) &&
        Objects.equals(this.materialId, creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.materialId) &&
        Objects.equals(this.title, creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.title) &&
        Objects.equals(this.wordList, creativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.wordList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidwordList, dpaWordList, materialId, title, wordList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner {\n");
    sb.append("    bidwordList: ").append(toIndentedString(bidwordList)).append("\n");
    sb.append("    dpaWordList: ").append(toIndentedString(dpaWordList)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("title");
    openapiFields.add("word_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeTitleMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

