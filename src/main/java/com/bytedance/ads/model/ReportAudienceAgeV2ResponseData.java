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
import com.bytedance.ads.model.ReportAudienceAgeV2ResponseDataMetricsDict;
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
public class ReportAudienceAgeV2ResponseData {
  public static final String SERIALIZED_NAME_AGE_NAME = "age_name";
  @SerializedName(SERIALIZED_NAME_AGE_NAME)
  private String ageName = null;

  public static final String SERIALIZED_NAME_METRICS_DICT = "metrics_dict";
  @SerializedName(SERIALIZED_NAME_METRICS_DICT)
  private ReportAudienceAgeV2ResponseDataMetricsDict metricsDict = null;

  public ReportAudienceAgeV2ResponseData() {
  }

  public ReportAudienceAgeV2ResponseData ageName(String ageName) {
    
    this.ageName = ageName;
    return this;
  }

   /**
   * 
   * @return ageName
  **/
  @javax.annotation.Nullable
  public String getAgeName() {
    return ageName;
  }


  public void setAgeName(String ageName) {
    this.ageName = ageName;
  }


  public ReportAudienceAgeV2ResponseData metricsDict(ReportAudienceAgeV2ResponseDataMetricsDict metricsDict) {
    
    this.metricsDict = metricsDict;
    return this;
  }

   /**
   * Get metricsDict
   * @return metricsDict
  **/
  @javax.annotation.Nullable
  public ReportAudienceAgeV2ResponseDataMetricsDict getMetricsDict() {
    return metricsDict;
  }


  public void setMetricsDict(ReportAudienceAgeV2ResponseDataMetricsDict metricsDict) {
    this.metricsDict = metricsDict;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceAgeV2ResponseData reportAudienceAgeV2ResponseData = (ReportAudienceAgeV2ResponseData) o;
    return Objects.equals(this.ageName, reportAudienceAgeV2ResponseData.ageName) &&
        Objects.equals(this.metricsDict, reportAudienceAgeV2ResponseData.metricsDict);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ageName, metricsDict);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceAgeV2ResponseData {\n");
    sb.append("    ageName: ").append(toIndentedString(ageName)).append("\n");
    sb.append("    metricsDict: ").append(toIndentedString(metricsDict)).append("\n");
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
    openapiFields.add("age_name");
    openapiFields.add("metrics_dict");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceAgeV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceAgeV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceAgeV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceAgeV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceAgeV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ReportAudienceAgeV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceAgeV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceAgeV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceAgeV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceAgeV2ResponseData
  */
  public static ReportAudienceAgeV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceAgeV2ResponseData.class);
  }

 /**
  * Convert an instance of ReportAudienceAgeV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

