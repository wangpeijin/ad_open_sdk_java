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
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataKeywordsMatchType;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataKeywordsStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * QianchuanAdDetailGetV10ResponseDataKeywordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataKeywordsInner {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_MATCH_TYPE = "match_type";
  @SerializedName(SERIALIZED_NAME_MATCH_TYPE)
  private QianchuanAdDetailGetV10DataKeywordsMatchType matchType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAdDetailGetV10DataKeywordsStatus status = null;

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

  public QianchuanAdDetailGetV10ResponseDataKeywordsInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataKeywordsInner id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner matchType(QianchuanAdDetailGetV10DataKeywordsMatchType matchType) {
    
    this.matchType = matchType;
    return this;
  }

   /**
   * Get matchType
   * @return matchType
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataKeywordsMatchType getMatchType() {
    return matchType;
  }


  public void setMatchType(QianchuanAdDetailGetV10DataKeywordsMatchType matchType) {
    this.matchType = matchType;
  }


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner status(QianchuanAdDetailGetV10DataKeywordsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataKeywordsStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAdDetailGetV10DataKeywordsStatus status) {
    this.status = status;
  }


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner word(String word) {
    
    this.word = word;
    return this;
  }

   /**
   * 
   * @return word
  **/
  @javax.annotation.Nullable
  public String getWord() {
    return word;
  }


  public void setWord(String word) {
    this.word = word;
  }


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner wordId(Long wordId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner wordPackageId(Long wordPackageId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataKeywordsInner wordPackageName(String wordPackageName) {
    
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
    QianchuanAdDetailGetV10ResponseDataKeywordsInner qianchuanAdDetailGetV10ResponseDataKeywordsInner = (QianchuanAdDetailGetV10ResponseDataKeywordsInner) o;
    return Objects.equals(this.id, qianchuanAdDetailGetV10ResponseDataKeywordsInner.id) &&
        Objects.equals(this.matchType, qianchuanAdDetailGetV10ResponseDataKeywordsInner.matchType) &&
        Objects.equals(this.status, qianchuanAdDetailGetV10ResponseDataKeywordsInner.status) &&
        Objects.equals(this.word, qianchuanAdDetailGetV10ResponseDataKeywordsInner.word) &&
        Objects.equals(this.wordId, qianchuanAdDetailGetV10ResponseDataKeywordsInner.wordId) &&
        Objects.equals(this.wordPackageId, qianchuanAdDetailGetV10ResponseDataKeywordsInner.wordPackageId) &&
        Objects.equals(this.wordPackageName, qianchuanAdDetailGetV10ResponseDataKeywordsInner.wordPackageName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, matchType, status, word, wordId, wordPackageId, wordPackageName);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataKeywordsInner {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    matchType: ").append(toIndentedString(matchType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("match_type");
    openapiFields.add("status");
    openapiFields.add("word");
    openapiFields.add("word_id");
    openapiFields.add("word_package_id");
    openapiFields.add("word_package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataKeywordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataKeywordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataKeywordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataKeywordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataKeywordsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataKeywordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataKeywordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataKeywordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataKeywordsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataKeywordsInner
  */
  public static QianchuanAdDetailGetV10ResponseDataKeywordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataKeywordsInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataKeywordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

