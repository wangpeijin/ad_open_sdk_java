/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner;
import com.bytedance.ads.model.ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner;
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
 * ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner {
  public static final String SERIALIZED_NAME_ERROR_MESSAGE = "error_message";
  @SerializedName(SERIALIZED_NAME_ERROR_MESSAGE)
  private String errorMessage = null;

  public static final String SERIALIZED_NAME_FAIL_PHRASE_WORDS = "fail_phrase_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PHRASE_WORDS)
  private List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords = null;

  public static final String SERIALIZED_NAME_FAIL_PRECISE_WORDS = "fail_precise_words";
  @SerializedName(SERIALIZED_NAME_FAIL_PRECISE_WORDS)
  private List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner() {
  }

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner errorMessage(String errorMessage) {
    
    this.errorMessage = errorMessage;
    return this;
  }

   /**
   * 
   * @return errorMessage
  **/
  @javax.annotation.Nullable
  public String getErrorMessage() {
    return errorMessage;
  }


  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }


  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner failPhraseWords(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    
    this.failPhraseWords = failPhraseWords;
    return this;
  }

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner addFailPhraseWordsItem(ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner failPhraseWordsItem) {
    if (this.failPhraseWords == null) {
      this.failPhraseWords = new ArrayList<>();
    }
    this.failPhraseWords.add(failPhraseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPhraseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner> getFailPhraseWords() {
    return failPhraseWords;
  }


  public void setFailPhraseWords(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPhraseWordsInner> failPhraseWords) {
    this.failPhraseWords = failPhraseWords;
  }


  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner failPreciseWords(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    
    this.failPreciseWords = failPreciseWords;
    return this;
  }

  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner addFailPreciseWordsItem(ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner failPreciseWordsItem) {
    if (this.failPreciseWords == null) {
      this.failPreciseWords = new ArrayList<>();
    }
    this.failPreciseWords.add(failPreciseWordsItem);
    return this;
  }

   /**
   * 
   * @return failPreciseWords
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner> getFailPreciseWords() {
    return failPreciseWords;
  }


  public void setFailPreciseWords(List<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInnerFailPreciseWordsInner> failPreciseWords) {
    this.failPreciseWords = failPreciseWords;
  }


  public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner toolsPrivativeWordProjectAddV30ResponseDataErrorListInner = (ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner) o;
    return Objects.equals(this.errorMessage, toolsPrivativeWordProjectAddV30ResponseDataErrorListInner.errorMessage) &&
        Objects.equals(this.failPhraseWords, toolsPrivativeWordProjectAddV30ResponseDataErrorListInner.failPhraseWords) &&
        Objects.equals(this.failPreciseWords, toolsPrivativeWordProjectAddV30ResponseDataErrorListInner.failPreciseWords) &&
        Objects.equals(this.projectId, toolsPrivativeWordProjectAddV30ResponseDataErrorListInner.projectId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorMessage, failPhraseWords, failPreciseWords, projectId);
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
    sb.append("class ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner {\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    failPhraseWords: ").append(toIndentedString(failPhraseWords)).append("\n");
    sb.append("    failPreciseWords: ").append(toIndentedString(failPreciseWords)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("error_message");
    openapiFields.add("fail_phrase_words");
    openapiFields.add("fail_precise_words");
    openapiFields.add("project_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner
  */
  public static ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordProjectAddV30ResponseDataErrorListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

