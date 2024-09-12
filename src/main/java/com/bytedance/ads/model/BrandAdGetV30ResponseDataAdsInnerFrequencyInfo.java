/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus;
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
 * 频控信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerFrequencyInfo {
  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private Long frequency = null;

  public static final String SERIALIZED_NAME_FREQUENCY_STATUS = "frequency_status";
  @SerializedName(SERIALIZED_NAME_FREQUENCY_STATUS)
  private BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus frequencyStatus = null;

  public static final String SERIALIZED_NAME_REACH_TARGET = "reach_target";
  @SerializedName(SERIALIZED_NAME_REACH_TARGET)
  private Long reachTarget = null;

  public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo() {
  }

  public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo frequency(Long frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * 周期频控
   * @return frequency
  **/
  @javax.annotation.Nullable
  public Long getFrequency() {
    return frequency;
  }


  public void setFrequency(Long frequency) {
    this.frequency = frequency;
  }


  public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo frequencyStatus(BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus frequencyStatus) {
    
    this.frequencyStatus = frequencyStatus;
    return this;
  }

   /**
   * Get frequencyStatus
   * @return frequencyStatus
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus getFrequencyStatus() {
    return frequencyStatus;
  }


  public void setFrequencyStatus(BrandAdGetV30DataAdsFrequencyInfoFrequencyStatus frequencyStatus) {
    this.frequencyStatus = frequencyStatus;
  }


  public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo reachTarget(Long reachTarget) {
    
    this.reachTarget = reachTarget;
    return this;
  }

   /**
   * 触达次数
   * @return reachTarget
  **/
  @javax.annotation.Nullable
  public Long getReachTarget() {
    return reachTarget;
  }


  public void setReachTarget(Long reachTarget) {
    this.reachTarget = reachTarget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerFrequencyInfo brandAdGetV30ResponseDataAdsInnerFrequencyInfo = (BrandAdGetV30ResponseDataAdsInnerFrequencyInfo) o;
    return Objects.equals(this.frequency, brandAdGetV30ResponseDataAdsInnerFrequencyInfo.frequency) &&
        Objects.equals(this.frequencyStatus, brandAdGetV30ResponseDataAdsInnerFrequencyInfo.frequencyStatus) &&
        Objects.equals(this.reachTarget, brandAdGetV30ResponseDataAdsInnerFrequencyInfo.reachTarget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, frequencyStatus, reachTarget);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerFrequencyInfo {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    frequencyStatus: ").append(toIndentedString(frequencyStatus)).append("\n");
    sb.append("    reachTarget: ").append(toIndentedString(reachTarget)).append("\n");
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
    openapiFields.add("frequency");
    openapiFields.add("frequency_status");
    openapiFields.add("reach_target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerFrequencyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerFrequencyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerFrequencyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerFrequencyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerFrequencyInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerFrequencyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerFrequencyInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerFrequencyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerFrequencyInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerFrequencyInfo
  */
  public static BrandAdGetV30ResponseDataAdsInnerFrequencyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerFrequencyInfo.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerFrequencyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

