/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarReportDataTopicConfigV2DataStatDataTopic;
import com.bytedance.ads.model.StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner;
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
 * StarReportDataTopicConfigV2ResponseDataStatInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class StarReportDataTopicConfigV2ResponseDataStatInner {
  public static final String SERIALIZED_NAME_DATA_TOPIC = "data_topic";
  @SerializedName(SERIALIZED_NAME_DATA_TOPIC)
  private StarReportDataTopicConfigV2DataStatDataTopic dataTopic = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner> metrics = null;

  public StarReportDataTopicConfigV2ResponseDataStatInner() {
  }

  public StarReportDataTopicConfigV2ResponseDataStatInner dataTopic(StarReportDataTopicConfigV2DataStatDataTopic dataTopic) {
    
    this.dataTopic = dataTopic;
    return this;
  }

   /**
   * Get dataTopic
   * @return dataTopic
  **/
  @javax.annotation.Nullable
  public StarReportDataTopicConfigV2DataStatDataTopic getDataTopic() {
    return dataTopic;
  }


  public void setDataTopic(StarReportDataTopicConfigV2DataStatDataTopic dataTopic) {
    this.dataTopic = dataTopic;
  }


  public StarReportDataTopicConfigV2ResponseDataStatInner metrics(List<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner> metrics) {
    
    this.metrics = metrics;
    return this;
  }

  public StarReportDataTopicConfigV2ResponseDataStatInner addMetricsItem(StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

   /**
   * 数据主题下的数据指标，一个数据主题对应一个或多个数据指标。不存在的数据指标将缺省。
   * @return metrics
  **/
  @javax.annotation.Nullable
  public List<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<StarReportDataTopicConfigV2ResponseDataStatInnerMetricsInner> metrics) {
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
    StarReportDataTopicConfigV2ResponseDataStatInner starReportDataTopicConfigV2ResponseDataStatInner = (StarReportDataTopicConfigV2ResponseDataStatInner) o;
    return Objects.equals(this.dataTopic, starReportDataTopicConfigV2ResponseDataStatInner.dataTopic) &&
        Objects.equals(this.metrics, starReportDataTopicConfigV2ResponseDataStatInner.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataTopic, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarReportDataTopicConfigV2ResponseDataStatInner {\n");
    sb.append("    dataTopic: ").append(toIndentedString(dataTopic)).append("\n");
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
    openapiFields.add("metrics");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("data_topic");
    openapiRequiredFields.add("metrics");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportDataTopicConfigV2ResponseDataStatInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportDataTopicConfigV2ResponseDataStatInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportDataTopicConfigV2ResponseDataStatInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportDataTopicConfigV2ResponseDataStatInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportDataTopicConfigV2ResponseDataStatInner>() {
           @Override
           public void write(JsonWriter out, StarReportDataTopicConfigV2ResponseDataStatInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportDataTopicConfigV2ResponseDataStatInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportDataTopicConfigV2ResponseDataStatInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportDataTopicConfigV2ResponseDataStatInner
  * @throws IOException if the JSON string is invalid with respect to StarReportDataTopicConfigV2ResponseDataStatInner
  */
  public static StarReportDataTopicConfigV2ResponseDataStatInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportDataTopicConfigV2ResponseDataStatInner.class);
  }

 /**
  * Convert an instance of StarReportDataTopicConfigV2ResponseDataStatInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

