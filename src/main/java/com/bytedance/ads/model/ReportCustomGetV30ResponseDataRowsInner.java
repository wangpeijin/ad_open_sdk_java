/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
import java.util.HashMap;
import java.util.Map;

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
 * ReportCustomGetV30ResponseDataRowsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ReportCustomGetV30ResponseDataRowsInner {
  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private Map<String, String> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, String> metrics = null;

  public ReportCustomGetV30ResponseDataRowsInner() {
  }

  public ReportCustomGetV30ResponseDataRowsInner dimensions(Map<String, String> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportCustomGetV30ResponseDataRowsInner putDimensionsItem(String key, String dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new HashMap<>();
    }
    this.dimensions.put(key, dimensionsItem);
    return this;
  }

   /**
   * 维度数据
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public Map<String, String> getDimensions() {
    return dimensions;
  }


  public void setDimensions(Map<String, String> dimensions) {
    this.dimensions = dimensions;
  }


  public ReportCustomGetV30ResponseDataRowsInner metrics(Map<String, String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public ReportCustomGetV30ResponseDataRowsInner putMetricsItem(String key, String metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * 指标数据
   * @return metrics
  **/
  @javax.annotation.Nullable
  public Map<String, String> getMetrics() {
    return metrics;
  }


  public void setMetrics(Map<String, String> metrics) {
    this.metrics = metrics;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportCustomGetV30ResponseDataRowsInner reportCustomGetV30ResponseDataRowsInner = (ReportCustomGetV30ResponseDataRowsInner) o;
    return Objects.equals(this.dimensions, reportCustomGetV30ResponseDataRowsInner.dimensions) &&
        Objects.equals(this.metrics, reportCustomGetV30ResponseDataRowsInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomGetV30ResponseDataRowsInner {\n");
    sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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
    openapiFields.add("dimensions");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("dimensions");
    openapiRequiredFields.add("metrics");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCustomGetV30ResponseDataRowsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomGetV30ResponseDataRowsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomGetV30ResponseDataRowsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomGetV30ResponseDataRowsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomGetV30ResponseDataRowsInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomGetV30ResponseDataRowsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomGetV30ResponseDataRowsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomGetV30ResponseDataRowsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomGetV30ResponseDataRowsInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomGetV30ResponseDataRowsInner
  */
  public static ReportCustomGetV30ResponseDataRowsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomGetV30ResponseDataRowsInner.class);
  }

 /**
  * Convert an instance of ReportCustomGetV30ResponseDataRowsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

