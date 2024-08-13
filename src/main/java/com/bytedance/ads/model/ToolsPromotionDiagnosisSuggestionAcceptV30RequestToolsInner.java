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
import com.bytedance.ads.model.ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner {
  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner> params = null;

  public static final String SERIALIZED_NAME_TOOL = "tool";
  @SerializedName(SERIALIZED_NAME_TOOL)
  private String tool = null;

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner() {
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner params(List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner> params) {
    
    this.params = params;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner addParamsItem(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner paramsItem) {
    if (this.params == null) {
      this.params = new ArrayList<>();
    }
    this.params.add(paramsItem);
    return this;
  }

   /**
   * 
   * @return params
  **/
  @javax.annotation.Nullable
  public List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner> getParams() {
    return params;
  }


  public void setParams(List<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInner> params) {
    this.params = params;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner tool(String tool) {
    
    this.tool = tool;
    return this;
  }

   /**
   * 
   * @return tool
  **/
  @javax.annotation.Nullable
  public String getTool() {
    return tool;
  }


  public void setTool(String tool) {
    this.tool = tool;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner = (ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner) o;
    return Objects.equals(this.params, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner.params) &&
        Objects.equals(this.tool, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner.tool);
  }

  @Override
  public int hashCode() {
    return Objects.hash(params, tool);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner {\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
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
    openapiFields.add("params");
    openapiFields.add("tool");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner
  */
  public static ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

