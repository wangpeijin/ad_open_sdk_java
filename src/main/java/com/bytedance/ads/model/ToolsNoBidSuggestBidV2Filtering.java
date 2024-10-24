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
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2FilteringFlowControlMode;
import com.bytedance.ads.model.ToolsNoBidSuggestBidV2FilteringPricing;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsNoBidSuggestBidV2Filtering {
  public static final String SERIALIZED_NAME_FLOW_CONTROL_MODE = "flow_control_mode";
  @SerializedName(SERIALIZED_NAME_FLOW_CONTROL_MODE)
  private ToolsNoBidSuggestBidV2FilteringFlowControlMode flowControlMode = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private ToolsNoBidSuggestBidV2FilteringPricing pricing = null;

  public ToolsNoBidSuggestBidV2Filtering() {
  }

  public ToolsNoBidSuggestBidV2Filtering flowControlMode(ToolsNoBidSuggestBidV2FilteringFlowControlMode flowControlMode) {
    
    this.flowControlMode = flowControlMode;
    return this;
  }

   /**
   * Get flowControlMode
   * @return flowControlMode
  **/
  @javax.annotation.Nullable
  public ToolsNoBidSuggestBidV2FilteringFlowControlMode getFlowControlMode() {
    return flowControlMode;
  }


  public void setFlowControlMode(ToolsNoBidSuggestBidV2FilteringFlowControlMode flowControlMode) {
    this.flowControlMode = flowControlMode;
  }


  public ToolsNoBidSuggestBidV2Filtering pricing(ToolsNoBidSuggestBidV2FilteringPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public ToolsNoBidSuggestBidV2FilteringPricing getPricing() {
    return pricing;
  }


  public void setPricing(ToolsNoBidSuggestBidV2FilteringPricing pricing) {
    this.pricing = pricing;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsNoBidSuggestBidV2Filtering toolsNoBidSuggestBidV2Filtering = (ToolsNoBidSuggestBidV2Filtering) o;
    return Objects.equals(this.flowControlMode, toolsNoBidSuggestBidV2Filtering.flowControlMode) &&
        Objects.equals(this.pricing, toolsNoBidSuggestBidV2Filtering.pricing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flowControlMode, pricing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsNoBidSuggestBidV2Filtering {\n");
    sb.append("    flowControlMode: ").append(toIndentedString(flowControlMode)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
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
    openapiFields.add("flow_control_mode");
    openapiFields.add("pricing");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsNoBidSuggestBidV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsNoBidSuggestBidV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsNoBidSuggestBidV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsNoBidSuggestBidV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsNoBidSuggestBidV2Filtering>() {
           @Override
           public void write(JsonWriter out, ToolsNoBidSuggestBidV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsNoBidSuggestBidV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsNoBidSuggestBidV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsNoBidSuggestBidV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ToolsNoBidSuggestBidV2Filtering
  */
  public static ToolsNoBidSuggestBidV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsNoBidSuggestBidV2Filtering.class);
  }

 /**
  * Convert an instance of ToolsNoBidSuggestBidV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

