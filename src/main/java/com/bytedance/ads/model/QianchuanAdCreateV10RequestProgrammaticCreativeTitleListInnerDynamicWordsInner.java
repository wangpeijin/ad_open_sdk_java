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
 * QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner {
  public static final String SERIALIZED_NAME_DEFAULT_WORD = "default_word";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORD)
  private String defaultWord = null;

  public static final String SERIALIZED_NAME_DICT_NAME = "dict_name";
  @SerializedName(SERIALIZED_NAME_DICT_NAME)
  private String dictName = null;

  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner() {
  }

  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner defaultWord(String defaultWord) {
    
    this.defaultWord = defaultWord;
    return this;
  }

   /**
   * 
   * @return defaultWord
  **/
  @javax.annotation.Nullable
  public String getDefaultWord() {
    return defaultWord;
  }


  public void setDefaultWord(String defaultWord) {
    this.defaultWord = defaultWord;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner dictName(String dictName) {
    
    this.dictName = dictName;
    return this;
  }

   /**
   * 
   * @return dictName
  **/
  @javax.annotation.Nullable
  public String getDictName() {
    return dictName;
  }


  public void setDictName(String dictName) {
    this.dictName = dictName;
  }


  public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return wordId
  **/
  @javax.annotation.Nonnull
  public Long getWordId() {
    return wordId;
  }


  public void setWordId(Long wordId) {
    this.wordId = wordId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner = (QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner) o;
    return Objects.equals(this.defaultWord, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.defaultWord) &&
        Objects.equals(this.dictName, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.dictName) &&
        Objects.equals(this.wordId, qianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.wordId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultWord, dictName, wordId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner {\n");
    sb.append("    defaultWord: ").append(toIndentedString(defaultWord)).append("\n");
    sb.append("    dictName: ").append(toIndentedString(dictName)).append("\n");
    sb.append("    wordId: ").append(toIndentedString(wordId)).append("\n");
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
    openapiFields.add("default_word");
    openapiFields.add("dict_name");
    openapiFields.add("word_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("word_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner
  */
  public static QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestProgrammaticCreativeTitleListInnerDynamicWordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

