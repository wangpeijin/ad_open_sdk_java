/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsEstimatedPriceGetV2ResponseData {
  public static final String SERIALIZED_NAME_CPC_PRICE = "cpc_price";
  @SerializedName(SERIALIZED_NAME_CPC_PRICE)
  private Double cpcPrice = null;

  public static final String SERIALIZED_NAME_LOWER_BOUND = "lower_bound";
  @SerializedName(SERIALIZED_NAME_LOWER_BOUND)
  private Double lowerBound = null;

  public static final String SERIALIZED_NAME_UPPER_BOUND = "upper_bound";
  @SerializedName(SERIALIZED_NAME_UPPER_BOUND)
  private Double upperBound = null;

  public ToolsEstimatedPriceGetV2ResponseData() {
  }

  public ToolsEstimatedPriceGetV2ResponseData cpcPrice(Double cpcPrice) {
    
    this.cpcPrice = cpcPrice;
    return this;
  }

   /**
   * 
   * @return cpcPrice
  **/
  @javax.annotation.Nullable
  public Double getCpcPrice() {
    return cpcPrice;
  }


  public void setCpcPrice(Double cpcPrice) {
    this.cpcPrice = cpcPrice;
  }


  public ToolsEstimatedPriceGetV2ResponseData lowerBound(Double lowerBound) {
    
    this.lowerBound = lowerBound;
    return this;
  }

   /**
   * 
   * @return lowerBound
  **/
  @javax.annotation.Nullable
  public Double getLowerBound() {
    return lowerBound;
  }


  public void setLowerBound(Double lowerBound) {
    this.lowerBound = lowerBound;
  }


  public ToolsEstimatedPriceGetV2ResponseData upperBound(Double upperBound) {
    
    this.upperBound = upperBound;
    return this;
  }

   /**
   * 
   * @return upperBound
  **/
  @javax.annotation.Nullable
  public Double getUpperBound() {
    return upperBound;
  }


  public void setUpperBound(Double upperBound) {
    this.upperBound = upperBound;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEstimatedPriceGetV2ResponseData toolsEstimatedPriceGetV2ResponseData = (ToolsEstimatedPriceGetV2ResponseData) o;
    return Objects.equals(this.cpcPrice, toolsEstimatedPriceGetV2ResponseData.cpcPrice) &&
        Objects.equals(this.lowerBound, toolsEstimatedPriceGetV2ResponseData.lowerBound) &&
        Objects.equals(this.upperBound, toolsEstimatedPriceGetV2ResponseData.upperBound);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpcPrice, lowerBound, upperBound);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEstimatedPriceGetV2ResponseData {\n");
    sb.append("    cpcPrice: ").append(toIndentedString(cpcPrice)).append("\n");
    sb.append("    lowerBound: ").append(toIndentedString(lowerBound)).append("\n");
    sb.append("    upperBound: ").append(toIndentedString(upperBound)).append("\n");
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
    openapiFields.add("cpc_price");
    openapiFields.add("lower_bound");
    openapiFields.add("upper_bound");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEstimatedPriceGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEstimatedPriceGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEstimatedPriceGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEstimatedPriceGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEstimatedPriceGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsEstimatedPriceGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEstimatedPriceGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEstimatedPriceGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEstimatedPriceGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsEstimatedPriceGetV2ResponseData
  */
  public static ToolsEstimatedPriceGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEstimatedPriceGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsEstimatedPriceGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

