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
 * ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner() {
  }

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner word(String word) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner toolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner = (ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner) o;
    return Objects.equals(this.reason, toolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner.reason) &&
        Objects.equals(this.word, toolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner.word);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, word);
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
    sb.append("class ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner
  */
  public static ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

