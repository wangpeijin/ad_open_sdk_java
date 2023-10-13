/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdCreateV10KeywordsMatchType;
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
 * QianchuanAdCreateV10RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class QianchuanAdCreateV10RequestKeywordsInner {
  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private QianchuanAdCreateV10KeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public static final String SERIALIZED_NAME_WORD_ID = "word_id";
  @SerializedName(SERIALIZED_NAME_WORD_ID)
  private Long wordId = null;

  public static final String SERIALIZED_NAME_WORD_PACKAGE_ID = "word_package_id";
  @SerializedName(SERIALIZED_NAME_WORD_PACKAGE_ID)
  private Long wordPackageId = null;

  public static final String SERIALIZED_NAME_WORD_PACKAGE_NAME = "word_package_name";
  @SerializedName(SERIALIZED_NAME_WORD_PACKAGE_NAME)
  private String wordPackageName = null;

  public QianchuanAdCreateV10RequestKeywordsInner() {
  }

  public QianchuanAdCreateV10RequestKeywordsInner matchType(QianchuanAdCreateV10KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public QianchuanAdCreateV10KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(QianchuanAdCreateV10KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public QianchuanAdCreateV10RequestKeywordsInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nonnull
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public QianchuanAdCreateV10RequestKeywordsInner wordId(Long wordId) {
    
    this.wordId = wordId;
    return this;
  }

   /**
   * 
   * @return wordId
  **/
  @javax.annotation.Nullable
  public Long getWordId() {
    return wordId;
  }


  public void setWordId(Long wordId) {
    this.wordId = wordId;
  }


  public QianchuanAdCreateV10RequestKeywordsInner wordPackageId(Long wordPackageId) {
    
    this.wordPackageId = wordPackageId;
    return this;
  }

   /**
   * 
   * @return wordPackageId
  **/
  @javax.annotation.Nullable
  public Long getWordPackageId() {
    return wordPackageId;
  }


  public void setWordPackageId(Long wordPackageId) {
    this.wordPackageId = wordPackageId;
  }


  public QianchuanAdCreateV10RequestKeywordsInner wordPackageName(String wordPackageName) {
    
    this.wordPackageName = wordPackageName;
    return this;
  }

   /**
   * 
   * @return wordPackageName
  **/
  @javax.annotation.Nullable
  public String getWordPackageName() {
    return wordPackageName;
  }


  public void setWordPackageName(String wordPackageName) {
    this.wordPackageName = wordPackageName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdCreateV10RequestKeywordsInner qianchuanAdCreateV10RequestKeywordsInner = (QianchuanAdCreateV10RequestKeywordsInner) o;
    return Objects.equals(this.matchType, qianchuanAdCreateV10RequestKeywordsInner.matchType) &&
        Objects.equals(this.word, qianchuanAdCreateV10RequestKeywordsInner.word) &&
        Objects.equals(this.wordId, qianchuanAdCreateV10RequestKeywordsInner.wordId) &&
        Objects.equals(this.wordPackageId, qianchuanAdCreateV10RequestKeywordsInner.wordPackageId) &&
        Objects.equals(this.wordPackageName, qianchuanAdCreateV10RequestKeywordsInner.wordPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, word, wordId, wordPackageId, wordPackageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdCreateV10RequestKeywordsInner {\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    wordId: ").append(toIndentedString(wordId)).append("\n");
    sb.append("    wordPackageId: ").append(toIndentedString(wordPackageId)).append("\n");
    sb.append("    wordPackageName: ").append(toIndentedString(wordPackageName)).append("\n");
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
    openapiFields.add("match_type");
    openapiFields.add("word");
    openapiFields.add("word_id");
    openapiFields.add("word_package_id");
    openapiFields.add("word_package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("match_type");
    openapiRequiredFields.add("word");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdCreateV10RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdCreateV10RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdCreateV10RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdCreateV10RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdCreateV10RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdCreateV10RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdCreateV10RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdCreateV10RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdCreateV10RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdCreateV10RequestKeywordsInner
  */
  public static QianchuanAdCreateV10RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdCreateV10RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdCreateV10RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

