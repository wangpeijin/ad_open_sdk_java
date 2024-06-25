/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdUpdateV10KeywordsMatchType;
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
 * QianchuanAdUpdateV10RequestKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class QianchuanAdUpdateV10RequestKeywordsInner {
  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private QianchuanAdUpdateV10KeywordsMatchType matchType = null;

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

  public QianchuanAdUpdateV10RequestKeywordsInner() {
  }

  public QianchuanAdUpdateV10RequestKeywordsInner matchType(QianchuanAdUpdateV10KeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nonnull
  public QianchuanAdUpdateV10KeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(QianchuanAdUpdateV10KeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public QianchuanAdUpdateV10RequestKeywordsInner word(String word) {
    
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


  public QianchuanAdUpdateV10RequestKeywordsInner wordId(Long wordId) {
    
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


  public QianchuanAdUpdateV10RequestKeywordsInner wordPackageId(Long wordPackageId) {
    
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


  public QianchuanAdUpdateV10RequestKeywordsInner wordPackageName(String wordPackageName) {
    
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
    QianchuanAdUpdateV10RequestKeywordsInner qianchuanAdUpdateV10RequestKeywordsInner = (QianchuanAdUpdateV10RequestKeywordsInner) o;
    return Objects.equals(this.matchType, qianchuanAdUpdateV10RequestKeywordsInner.matchType) &&
        Objects.equals(this.word, qianchuanAdUpdateV10RequestKeywordsInner.word) &&
        Objects.equals(this.wordId, qianchuanAdUpdateV10RequestKeywordsInner.wordId) &&
        Objects.equals(this.wordPackageId, qianchuanAdUpdateV10RequestKeywordsInner.wordPackageId) &&
        Objects.equals(this.wordPackageName, qianchuanAdUpdateV10RequestKeywordsInner.wordPackageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchType, word, wordId, wordPackageId, wordPackageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestKeywordsInner {\n");
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
       if (!QianchuanAdUpdateV10RequestKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestKeywordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestKeywordsInner
  */
  public static QianchuanAdUpdateV10RequestKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestKeywordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

