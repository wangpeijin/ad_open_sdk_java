/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData;
import com.bytedance.ads.model.DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * DouplusOrderReportV30ResponseDataOrderMetricsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class DouplusOrderReportV30ResponseDataOrderMetricsInner {
  public static final String SERIALIZED_NAME_DIMENSION_DATA = "dimension_data";
  @SerializedName(SERIALIZED_NAME_DIMENSION_DATA)
  private DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData dimensionData = null;

  public static final String SERIALIZED_NAME_METRICS_DATA = "metrics_data";
  @SerializedName(SERIALIZED_NAME_METRICS_DATA)
  private DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData metricsData = null;

  public DouplusOrderReportV30ResponseDataOrderMetricsInner() {
  }

  public DouplusOrderReportV30ResponseDataOrderMetricsInner dimensionData(DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData dimensionData) {
    
    this.dimensionData = dimensionData;
    return this;
  }

   /**
   * Get dimensionData
   * @return dimensionData
  **/
  @javax.annotation.Nullable
  public DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData getDimensionData() {
    return dimensionData;
  }


  public void setDimensionData(DouplusOrderReportV30ResponseDataOrderMetricsInnerDimensionData dimensionData) {
    this.dimensionData = dimensionData;
  }


  public DouplusOrderReportV30ResponseDataOrderMetricsInner metricsData(DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData metricsData) {
    
    this.metricsData = metricsData;
    return this;
  }

   /**
   * Get metricsData
   * @return metricsData
  **/
  @javax.annotation.Nullable
  public DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData getMetricsData() {
    return metricsData;
  }


  public void setMetricsData(DouplusOrderReportV30ResponseDataOrderMetricsInnerMetricsData metricsData) {
    this.metricsData = metricsData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30ResponseDataOrderMetricsInner douplusOrderReportV30ResponseDataOrderMetricsInner = (DouplusOrderReportV30ResponseDataOrderMetricsInner) o;
    return Objects.equals(this.dimensionData, douplusOrderReportV30ResponseDataOrderMetricsInner.dimensionData) &&
        Objects.equals(this.metricsData, douplusOrderReportV30ResponseDataOrderMetricsInner.metricsData);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimensionData, metricsData);
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
    sb.append("class DouplusOrderReportV30ResponseDataOrderMetricsInner {\n");
    sb.append("    dimensionData: ").append(toIndentedString(dimensionData)).append("\n");
    sb.append("    metricsData: ").append(toIndentedString(metricsData)).append("\n");
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
    openapiFields.add("dimension_data");
    openapiFields.add("metrics_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30ResponseDataOrderMetricsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30ResponseDataOrderMetricsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30ResponseDataOrderMetricsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30ResponseDataOrderMetricsInner>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30ResponseDataOrderMetricsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30ResponseDataOrderMetricsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30ResponseDataOrderMetricsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30ResponseDataOrderMetricsInner
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30ResponseDataOrderMetricsInner
  */
  public static DouplusOrderReportV30ResponseDataOrderMetricsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30ResponseDataOrderMetricsInner.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30ResponseDataOrderMetricsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

