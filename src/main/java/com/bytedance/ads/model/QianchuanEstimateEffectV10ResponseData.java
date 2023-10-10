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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class QianchuanEstimateEffectV10ResponseData {
  public static final String SERIALIZED_NAME_ESTIMATE_EFFECT_HIGH = "estimate_effect_high";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_EFFECT_HIGH)
  private Double estimateEffectHigh = null;

  public static final String SERIALIZED_NAME_ESTIMATE_EFFECT_LOW = "estimate_effect_low";
  @SerializedName(SERIALIZED_NAME_ESTIMATE_EFFECT_LOW)
  private Double estimateEffectLow = null;

  public QianchuanEstimateEffectV10ResponseData() {
  }

  public QianchuanEstimateEffectV10ResponseData estimateEffectHigh(Double estimateEffectHigh) {
    
    this.estimateEffectHigh = estimateEffectHigh;
    return this;
  }

   /**
   * 
   * @return estimateEffectHigh
  **/
  @javax.annotation.Nullable
  public Double getEstimateEffectHigh() {
    return estimateEffectHigh;
  }


  public void setEstimateEffectHigh(Double estimateEffectHigh) {
    this.estimateEffectHigh = estimateEffectHigh;
  }


  public QianchuanEstimateEffectV10ResponseData estimateEffectLow(Double estimateEffectLow) {
    
    this.estimateEffectLow = estimateEffectLow;
    return this;
  }

   /**
   * 
   * @return estimateEffectLow
  **/
  @javax.annotation.Nullable
  public Double getEstimateEffectLow() {
    return estimateEffectLow;
  }


  public void setEstimateEffectLow(Double estimateEffectLow) {
    this.estimateEffectLow = estimateEffectLow;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanEstimateEffectV10ResponseData qianchuanEstimateEffectV10ResponseData = (QianchuanEstimateEffectV10ResponseData) o;
    return Objects.equals(this.estimateEffectHigh, qianchuanEstimateEffectV10ResponseData.estimateEffectHigh) &&
        Objects.equals(this.estimateEffectLow, qianchuanEstimateEffectV10ResponseData.estimateEffectLow);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(estimateEffectHigh, estimateEffectLow);
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
    sb.append("class QianchuanEstimateEffectV10ResponseData {\n");
    sb.append("    estimateEffectHigh: ").append(toIndentedString(estimateEffectHigh)).append("\n");
    sb.append("    estimateEffectLow: ").append(toIndentedString(estimateEffectLow)).append("\n");
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
    openapiFields.add("estimate_effect_high");
    openapiFields.add("estimate_effect_low");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanEstimateEffectV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanEstimateEffectV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanEstimateEffectV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanEstimateEffectV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanEstimateEffectV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanEstimateEffectV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanEstimateEffectV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanEstimateEffectV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanEstimateEffectV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanEstimateEffectV10ResponseData
  */
  public static QianchuanEstimateEffectV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanEstimateEffectV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanEstimateEffectV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

