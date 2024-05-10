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
import com.bytedance.ads.model.ToolsBlueFlowKeywordListV30FilteringBlueFlowRecommendType;
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
public class ToolsBlueFlowKeywordListV30Filtering {
  public static final String SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME = "blue_flow_keyword_name";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_KEYWORD_NAME)
  private String blueFlowKeywordName = null;

  public static final String SERIALIZED_NAME_BLUE_FLOW_RECOMMEND_TYPE = "blue_flow_recommend_type";
  @SerializedName(SERIALIZED_NAME_BLUE_FLOW_RECOMMEND_TYPE)
  private ToolsBlueFlowKeywordListV30FilteringBlueFlowRecommendType blueFlowRecommendType = null;

  public ToolsBlueFlowKeywordListV30Filtering() {
  }

  public ToolsBlueFlowKeywordListV30Filtering blueFlowKeywordName(String blueFlowKeywordName) {
    
    this.blueFlowKeywordName = blueFlowKeywordName;
    return this;
  }

   /**
   * 
   * @return blueFlowKeywordName
  **/
  @javax.annotation.Nullable
  public String getBlueFlowKeywordName() {
    return blueFlowKeywordName;
  }


  public void setBlueFlowKeywordName(String blueFlowKeywordName) {
    this.blueFlowKeywordName = blueFlowKeywordName;
  }


  public ToolsBlueFlowKeywordListV30Filtering blueFlowRecommendType(ToolsBlueFlowKeywordListV30FilteringBlueFlowRecommendType blueFlowRecommendType) {
    
    this.blueFlowRecommendType = blueFlowRecommendType;
    return this;
  }

   /**
   * Get blueFlowRecommendType
   * @return blueFlowRecommendType
  **/
  @javax.annotation.Nullable
  public ToolsBlueFlowKeywordListV30FilteringBlueFlowRecommendType getBlueFlowRecommendType() {
    return blueFlowRecommendType;
  }


  public void setBlueFlowRecommendType(ToolsBlueFlowKeywordListV30FilteringBlueFlowRecommendType blueFlowRecommendType) {
    this.blueFlowRecommendType = blueFlowRecommendType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsBlueFlowKeywordListV30Filtering toolsBlueFlowKeywordListV30Filtering = (ToolsBlueFlowKeywordListV30Filtering) o;
    return Objects.equals(this.blueFlowKeywordName, toolsBlueFlowKeywordListV30Filtering.blueFlowKeywordName) &&
        Objects.equals(this.blueFlowRecommendType, toolsBlueFlowKeywordListV30Filtering.blueFlowRecommendType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueFlowKeywordName, blueFlowRecommendType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsBlueFlowKeywordListV30Filtering {\n");
    sb.append("    blueFlowKeywordName: ").append(toIndentedString(blueFlowKeywordName)).append("\n");
    sb.append("    blueFlowRecommendType: ").append(toIndentedString(blueFlowRecommendType)).append("\n");
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
    openapiFields.add("blue_flow_keyword_name");
    openapiFields.add("blue_flow_recommend_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsBlueFlowKeywordListV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsBlueFlowKeywordListV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsBlueFlowKeywordListV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsBlueFlowKeywordListV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsBlueFlowKeywordListV30Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsBlueFlowKeywordListV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsBlueFlowKeywordListV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsBlueFlowKeywordListV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsBlueFlowKeywordListV30Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsBlueFlowKeywordListV30Filtering
  */
  public static ToolsBlueFlowKeywordListV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsBlueFlowKeywordListV30Filtering.class);
  }

 /**
  * Convert an instance of ToolsBlueFlowKeywordListV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

