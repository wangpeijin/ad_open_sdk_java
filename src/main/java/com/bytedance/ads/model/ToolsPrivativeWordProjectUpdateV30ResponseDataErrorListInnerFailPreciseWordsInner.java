/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner() {
  }

  public ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner reason(String reason) {
    
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


  public ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner word(String word) {
    
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
    ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner toolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner = (ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner) o;
    return Objects.equals(this.reason, toolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner.reason) &&
        Objects.equals(this.word, toolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner.word);
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
    sb.append("class ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner {\n");
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
       if (!ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner
  */
  public static ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordProjectUpdateV30ResponseDataErrorListInnerFailPreciseWordsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

