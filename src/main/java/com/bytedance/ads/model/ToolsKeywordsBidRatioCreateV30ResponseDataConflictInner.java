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
import com.bytedance.ads.model.ToolsKeywordsBidRatioCreateV30DataConflictDimension;
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
 * ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner {
  public static final String SERIALIZED_NAME_ADV_NAME = "advName";
  @SerializedName(SERIALIZED_NAME_ADV_NAME)
  private String advName = null;

  public static final String SERIALIZED_NAME_BID_COEFS = "bidCoefs";
  @SerializedName(SERIALIZED_NAME_BID_COEFS)
  private List<Double> bidCoefs = null;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private ToolsKeywordsBidRatioCreateV30DataConflictDimension dimension = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "projectId";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "projectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName = null;

  public static final String SERIALIZED_NAME_WORD = "word";
  @SerializedName(SERIALIZED_NAME_WORD)
  private String word = null;

  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner() {
  }

  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner advName(String advName) {
    
    this.advName = advName;
    return this;
  }

   /**
   * 
   * @return advName
  **/
  @javax.annotation.Nullable
  public String getAdvName() {
    return advName;
  }


  public void setAdvName(String advName) {
    this.advName = advName;
  }


  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner bidCoefs(List<Double> bidCoefs) {
    
    this.bidCoefs = bidCoefs;
    return this;
  }

  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner addBidCoefsItem(Double bidCoefsItem) {
    if (this.bidCoefs == null) {
      this.bidCoefs = new ArrayList<>();
    }
    this.bidCoefs.add(bidCoefsItem);
    return this;
  }

   /**
   * 
   * @return bidCoefs
  **/
  @javax.annotation.Nullable
  public List<Double> getBidCoefs() {
    return bidCoefs;
  }


  public void setBidCoefs(List<Double> bidCoefs) {
    this.bidCoefs = bidCoefs;
  }


  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner dimension(ToolsKeywordsBidRatioCreateV30DataConflictDimension dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * Get dimension
   * @return dimension
  **/
  @javax.annotation.Nullable
  public ToolsKeywordsBidRatioCreateV30DataConflictDimension getDimension() {
    return dimension;
  }


  public void setDimension(ToolsKeywordsBidRatioCreateV30DataConflictDimension dimension) {
    this.dimension = dimension;
  }


  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner projectId(Long projectId) {
    
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


  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 
   * @return projectName
  **/
  @javax.annotation.Nullable
  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner word(String word) {
    
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
    ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner toolsKeywordsBidRatioCreateV30ResponseDataConflictInner = (ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner) o;
    return Objects.equals(this.advName, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.advName) &&
        Objects.equals(this.bidCoefs, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.bidCoefs) &&
        Objects.equals(this.dimension, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.dimension) &&
        Objects.equals(this.projectId, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.projectId) &&
        Objects.equals(this.projectName, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.projectName) &&
        Objects.equals(this.word, toolsKeywordsBidRatioCreateV30ResponseDataConflictInner.word);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advName, bidCoefs, dimension, projectId, projectName, word);
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
    sb.append("class ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner {\n");
    sb.append("    advName: ").append(toIndentedString(advName)).append("\n");
    sb.append("    bidCoefs: ").append(toIndentedString(bidCoefs)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
    openapiFields.add("advName");
    openapiFields.add("bidCoefs");
    openapiFields.add("dimension");
    openapiFields.add("projectId");
    openapiFields.add("projectName");
    openapiFields.add("word");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bidCoefs");
    openapiRequiredFields.add("dimension");
    openapiRequiredFields.add("word");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner>() {
           @Override
           public void write(JsonWriter out, ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner
  * @throws IOException if the JSON string is invalid with respect to ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner
  */
  public static ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner.class);
  }

 /**
  * Convert an instance of ToolsKeywordsBidRatioCreateV30ResponseDataConflictInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

