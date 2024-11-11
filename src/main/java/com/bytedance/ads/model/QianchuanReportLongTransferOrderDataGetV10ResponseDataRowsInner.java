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
import java.util.HashMap;
import java.util.Map;
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
 * QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner {
  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private Map<String, Object> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private Map<String, Object> metrics = null;

  public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner() {
  }

  public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner dimensions(Map<String, Object> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner putDimensionsItem(String key, Object dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new HashMap<>();
    }
    this.dimensions.put(key, dimensionsItem);
    return this;
  }

   /**
   * 
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getDimensions() {
    return dimensions;
  }


  public void setDimensions(Map<String, Object> dimensions) {
    this.dimensions = dimensions;
  }


  public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner metrics(Map<String, Object> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner putMetricsItem(String key, Object metricsItem) {
    if (this.metrics == null) {
      this.metrics = new HashMap<>();
    }
    this.metrics.put(key, metricsItem);
    return this;
  }

   /**
   * 
   * @return metrics
  **/
  @javax.annotation.Nullable
  public Map<String, Object> getMetrics() {
    return metrics;
  }


  public void setMetrics(Map<String, Object> metrics) {
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
    QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner qianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner = (QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner) o;
    return Objects.equals(this.dimensions, qianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner.dimensions) &&
        Objects.equals(this.metrics, qianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensions, metrics);
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
    sb.append("class QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner
  */
  public static QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner.class);
  }

 /**
  * Convert an instance of QianchuanReportLongTransferOrderDataGetV10ResponseDataRowsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

