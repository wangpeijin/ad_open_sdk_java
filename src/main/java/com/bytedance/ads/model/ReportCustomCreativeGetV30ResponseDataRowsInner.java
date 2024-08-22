/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * ReportCustomCreativeGetV30ResponseDataRowsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ReportCustomCreativeGetV30ResponseDataRowsInner {
  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private Map<String, String> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, String> metrics = null;

  public ReportCustomCreativeGetV30ResponseDataRowsInner() {
  }

  public ReportCustomCreativeGetV30ResponseDataRowsInner dimensions(Map<String, String> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public ReportCustomCreativeGetV30ResponseDataRowsInner putDimensionsItem(String key, String dimensionsItem) {
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


  public ReportCustomCreativeGetV30ResponseDataRowsInner metrics(Map<String, String> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public ReportCustomCreativeGetV30ResponseDataRowsInner putMetricsItem(String key, String metricsItem) {
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
    ReportCustomCreativeGetV30ResponseDataRowsInner reportCustomCreativeGetV30ResponseDataRowsInner = (ReportCustomCreativeGetV30ResponseDataRowsInner) o;
    return Objects.equals(this.dimensions, reportCustomCreativeGetV30ResponseDataRowsInner.dimensions) &&
        Objects.equals(this.metrics, reportCustomCreativeGetV30ResponseDataRowsInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCustomCreativeGetV30ResponseDataRowsInner {\n");
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
       if (!ReportCustomCreativeGetV30ResponseDataRowsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCustomCreativeGetV30ResponseDataRowsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCustomCreativeGetV30ResponseDataRowsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCustomCreativeGetV30ResponseDataRowsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCustomCreativeGetV30ResponseDataRowsInner>() {
           @Override
           public void write(JsonWriter out, ReportCustomCreativeGetV30ResponseDataRowsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCustomCreativeGetV30ResponseDataRowsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCustomCreativeGetV30ResponseDataRowsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCustomCreativeGetV30ResponseDataRowsInner
  * @throws IOException if the JSON string is invalid with respect to ReportCustomCreativeGetV30ResponseDataRowsInner
  */
  public static ReportCustomCreativeGetV30ResponseDataRowsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCustomCreativeGetV30ResponseDataRowsInner.class);
  }

 /**
  * Convert an instance of ReportCustomCreativeGetV30ResponseDataRowsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

