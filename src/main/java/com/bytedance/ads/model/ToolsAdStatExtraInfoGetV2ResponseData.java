/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAdStatExtraInfoGetV2DataLearningPhase;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsAdStatExtraInfoGetV2ResponseData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_LEARNING_PHASE = "learning_phase";
  @SerializedName(SERIALIZED_NAME_LEARNING_PHASE)
  private ToolsAdStatExtraInfoGetV2DataLearningPhase learningPhase = null;

  public ToolsAdStatExtraInfoGetV2ResponseData() {
  }

  public ToolsAdStatExtraInfoGetV2ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ToolsAdStatExtraInfoGetV2ResponseData learningPhase(ToolsAdStatExtraInfoGetV2DataLearningPhase learningPhase) {
    
    this.learningPhase = learningPhase;
    return this;
  }

   /**
   * Get learningPhase
   * @return learningPhase
  **/
  @javax.annotation.Nullable
  public ToolsAdStatExtraInfoGetV2DataLearningPhase getLearningPhase() {
    return learningPhase;
  }


  public void setLearningPhase(ToolsAdStatExtraInfoGetV2DataLearningPhase learningPhase) {
    this.learningPhase = learningPhase;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAdStatExtraInfoGetV2ResponseData toolsAdStatExtraInfoGetV2ResponseData = (ToolsAdStatExtraInfoGetV2ResponseData) o;
    return Objects.equals(this.adId, toolsAdStatExtraInfoGetV2ResponseData.adId) &&
        Objects.equals(this.learningPhase, toolsAdStatExtraInfoGetV2ResponseData.learningPhase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, learningPhase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAdStatExtraInfoGetV2ResponseData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    learningPhase: ").append(toIndentedString(learningPhase)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("learning_phase");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAdStatExtraInfoGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAdStatExtraInfoGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAdStatExtraInfoGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAdStatExtraInfoGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAdStatExtraInfoGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsAdStatExtraInfoGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAdStatExtraInfoGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAdStatExtraInfoGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAdStatExtraInfoGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsAdStatExtraInfoGetV2ResponseData
  */
  public static ToolsAdStatExtraInfoGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAdStatExtraInfoGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsAdStatExtraInfoGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

