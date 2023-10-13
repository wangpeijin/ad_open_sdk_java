/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsCreativeWordSelectV2DataCreativeWordContentType;
import com.bytedance.ads.model.ToolsCreativeWordSelectV2DataCreativeWordStatus;
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
 * ToolsCreativeWordSelectV2ResponseDataCreativeWordInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ToolsCreativeWordSelectV2ResponseDataCreativeWordInner {
  public static final String SERIALIZED_NAME_CONTENT_TYPE = "content_type";
  @SerializedName(SERIALIZED_NAME_CONTENT_TYPE)
  private ToolsCreativeWordSelectV2DataCreativeWordContentType contentType = null;

  public static final String SERIALIZED_NAME_CREATIVE_WORD_ID = "creative_word_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_WORD_ID)
  private Long creativeWordId = null;

  public static final String SERIALIZED_NAME_DEFAULT_WORD = "default_word";
  @SerializedName(SERIALIZED_NAME_DEFAULT_WORD)
  private String defaultWord = null;

  public static final String SERIALIZED_NAME_MAX_WORD_LEN = "max_word_len";
  @SerializedName(SERIALIZED_NAME_MAX_WORD_LEN)
  private Integer maxWordLen = null;

  public static final String SERIALIZED_NAME_MIN_WORD_LEN = "min_word_len";
  @SerializedName(SERIALIZED_NAME_MIN_WORD_LEN)
  private Integer minWordLen = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsCreativeWordSelectV2DataCreativeWordStatus status = null;

  public static final String SERIALIZED_NAME_USER_RATE = "user_rate";
  @SerializedName(SERIALIZED_NAME_USER_RATE)
  private Double userRate = null;

  public static final String SERIALIZED_NAME_WORDS = "words";
  @SerializedName(SERIALIZED_NAME_WORDS)
  private List<String> words = null;

  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner() {
  }

  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner contentType(ToolsCreativeWordSelectV2DataCreativeWordContentType contentType) {
    
    this.contentType = contentType;
    return this;
  }

   /**
   * Get contentType
   * @return contentType
  **/
  @javax.annotation.Nullable
  public ToolsCreativeWordSelectV2DataCreativeWordContentType getContentType() {
    return contentType;
  }


  public void setContentType(ToolsCreativeWordSelectV2DataCreativeWordContentType contentType) {
    this.contentType = contentType;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner creativeWordId(Long creativeWordId) {
    
    this.creativeWordId = creativeWordId;
    return this;
  }

   /**
   * 
   * @return creativeWordId
  **/
  @javax.annotation.Nullable
  public Long getCreativeWordId() {
    return creativeWordId;
  }


  public void setCreativeWordId(Long creativeWordId) {
    this.creativeWordId = creativeWordId;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner defaultWord(String defaultWord) {
    
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


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner maxWordLen(Integer maxWordLen) {
    
    this.maxWordLen = maxWordLen;
    return this;
  }

   /**
   * 
   * @return maxWordLen
  **/
  @javax.annotation.Nullable
  public Integer getMaxWordLen() {
    return maxWordLen;
  }


  public void setMaxWordLen(Integer maxWordLen) {
    this.maxWordLen = maxWordLen;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner minWordLen(Integer minWordLen) {
    
    this.minWordLen = minWordLen;
    return this;
  }

   /**
   * 
   * @return minWordLen
  **/
  @javax.annotation.Nullable
  public Integer getMinWordLen() {
    return minWordLen;
  }


  public void setMinWordLen(Integer minWordLen) {
    this.minWordLen = minWordLen;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner status(ToolsCreativeWordSelectV2DataCreativeWordStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsCreativeWordSelectV2DataCreativeWordStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsCreativeWordSelectV2DataCreativeWordStatus status) {
    this.status = status;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner userRate(Double userRate) {
    
    this.userRate = userRate;
    return this;
  }

   /**
   * 
   * @return userRate
  **/
  @javax.annotation.Nullable
  public Double getUserRate() {
    return userRate;
  }


  public void setUserRate(Double userRate) {
    this.userRate = userRate;
  }


  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner words(List<String> words) {
    
    this.words = words;
    return this;
  }

  public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner addWordsItem(String wordsItem) {
    if (this.words == null) {
      this.words = new ArrayList<>();
    }
    this.words.add(wordsItem);
    return this;
  }

   /**
   * 
   * @return words
  **/
  @javax.annotation.Nullable
  public List<String> getWords() {
    return words;
  }


  public void setWords(List<String> words) {
    this.words = words;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsCreativeWordSelectV2ResponseDataCreativeWordInner toolsCreativeWordSelectV2ResponseDataCreativeWordInner = (ToolsCreativeWordSelectV2ResponseDataCreativeWordInner) o;
    return Objects.equals(this.contentType, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.contentType) &&
        Objects.equals(this.creativeWordId, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.creativeWordId) &&
        Objects.equals(this.defaultWord, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.defaultWord) &&
        Objects.equals(this.maxWordLen, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.maxWordLen) &&
        Objects.equals(this.minWordLen, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.minWordLen) &&
        Objects.equals(this.name, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.name) &&
        Objects.equals(this.status, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.status) &&
        Objects.equals(this.userRate, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.userRate) &&
        Objects.equals(this.words, toolsCreativeWordSelectV2ResponseDataCreativeWordInner.words);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, creativeWordId, defaultWord, maxWordLen, minWordLen, name, status, userRate, words);
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
    sb.append("class ToolsCreativeWordSelectV2ResponseDataCreativeWordInner {\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    creativeWordId: ").append(toIndentedString(creativeWordId)).append("\n");
    sb.append("    defaultWord: ").append(toIndentedString(defaultWord)).append("\n");
    sb.append("    maxWordLen: ").append(toIndentedString(maxWordLen)).append("\n");
    sb.append("    minWordLen: ").append(toIndentedString(minWordLen)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    userRate: ").append(toIndentedString(userRate)).append("\n");
    sb.append("    words: ").append(toIndentedString(words)).append("\n");
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
    openapiFields.add("content_type");
    openapiFields.add("creative_word_id");
    openapiFields.add("default_word");
    openapiFields.add("max_word_len");
    openapiFields.add("min_word_len");
    openapiFields.add("name");
    openapiFields.add("status");
    openapiFields.add("user_rate");
    openapiFields.add("words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsCreativeWordSelectV2ResponseDataCreativeWordInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsCreativeWordSelectV2ResponseDataCreativeWordInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsCreativeWordSelectV2ResponseDataCreativeWordInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsCreativeWordSelectV2ResponseDataCreativeWordInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsCreativeWordSelectV2ResponseDataCreativeWordInner>() {
           @Override
           public void write(JsonWriter out, ToolsCreativeWordSelectV2ResponseDataCreativeWordInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsCreativeWordSelectV2ResponseDataCreativeWordInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsCreativeWordSelectV2ResponseDataCreativeWordInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsCreativeWordSelectV2ResponseDataCreativeWordInner
  * @throws IOException if the JSON string is invalid with respect to ToolsCreativeWordSelectV2ResponseDataCreativeWordInner
  */
  public static ToolsCreativeWordSelectV2ResponseDataCreativeWordInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsCreativeWordSelectV2ResponseDataCreativeWordInner.class);
  }

 /**
  * Convert an instance of ToolsCreativeWordSelectV2ResponseDataCreativeWordInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

