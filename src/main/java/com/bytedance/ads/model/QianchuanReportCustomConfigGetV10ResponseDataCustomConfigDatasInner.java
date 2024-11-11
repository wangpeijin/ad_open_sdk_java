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
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner;
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner;
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
 * QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private String dataTopic = null;

  public static final String SERIALIZED_NAME_DIMENSIONS = "dimensions";
  @SerializedName(SERIALIZED_NAME_DIMENSIONS)
  private List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner> dimensions = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner> metrics = null;

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner() {
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner dataTopic(String dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * 
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public String getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(String dataTopic) {
    this.dataTopic = dataTopic;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner dimensions(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner> dimensions) {
    
    this.dimensions = dimensions;
    return this;
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner addDimensionsItem(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner dimensionsItem) {
    if (this.dimensions == null) {
      this.dimensions = new ArrayList<>();
    }
    this.dimensions.add(dimensionsItem);
    return this;
  }

   /**
   * 
   * @return dimensions
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner> getDimensions() {
    return dimensions;
  }


  public void setDimensions(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInner> dimensions) {
    this.dimensions = dimensions;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner metrics(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner addMetricsItem(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * 
   * @return metrics
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerMetricsInner> metrics) {
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
    QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner = (QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner) o;
    return Objects.equals(this.dataTopic, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.dataTopic) &&
        Objects.equals(this.dimensions, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.dimensions) &&
        Objects.equals(this.metrics, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.metrics);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic, dimensions, metrics);
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
    sb.append("class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner {\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
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
    openapiFields.add("data_topic");
    openapiFields.add("dimensions");
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner
  */
  public static QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner.class);
  }

 /**
  * Convert an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

