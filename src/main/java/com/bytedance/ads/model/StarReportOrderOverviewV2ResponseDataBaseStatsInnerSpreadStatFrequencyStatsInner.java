/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner {
  public static final String SERIALIZED_NAME_FREQUENCY = "frequency";
  @SerializedName(SERIALIZED_NAME_FREQUENCY)
  private String frequency = null;

  public static final String SERIALIZED_NAME_PERIOD = "period";
  @SerializedName(SERIALIZED_NAME_PERIOD)
  private Long period = null;

  public static final String SERIALIZED_NAME_PROPORTION = "proportion";
  @SerializedName(SERIALIZED_NAME_PROPORTION)
  private Double proportion = null;

  public static final String SERIALIZED_NAME_UV = "uv";
  @SerializedName(SERIALIZED_NAME_UV)
  private Long uv = null;

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner() {
  }

  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner frequency(String frequency) {
    
    this.frequency = frequency;
    return this;
  }

   /**
   * 触达频次 eq_1 -&gt; eq_6 代表触达1 - 6次 ge_7 代表触达7次及以上
   * @return frequency
  **/
  @javax.annotation.Nullable
  public String getFrequency() {
    return frequency;
  }


  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner period(Long period) {
    
    this.period = period;
    return this;
  }

   /**
   * 周期
   * @return period
  **/
  @javax.annotation.Nullable
  public Long getPeriod() {
    return period;
  }


  public void setPeriod(Long period) {
    this.period = period;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner proportion(Double proportion) {
    
    this.proportion = proportion;
    return this;
  }

   /**
   * 触达人数占总人数的比例
   * @return proportion
  **/
  @javax.annotation.Nullable
  public Double getProportion() {
    return proportion;
  }


  public void setProportion(Double proportion) {
    this.proportion = proportion;
  }


  public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner uv(Long uv) {
    
    this.uv = uv;
    return this;
  }

   /**
   * 触达人数
   * @return uv
  **/
  @javax.annotation.Nullable
  public Long getUv() {
    return uv;
  }


  public void setUv(Long uv) {
    this.uv = uv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner = (StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner) o;
    return Objects.equals(this.frequency, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.frequency) &&
        Objects.equals(this.period, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.period) &&
        Objects.equals(this.proportion, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.proportion) &&
        Objects.equals(this.uv, starReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.uv);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(frequency, period, proportion, uv);
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
    sb.append("class StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner {\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    proportion: ").append(toIndentedString(proportion)).append("\n");
    sb.append("    uv: ").append(toIndentedString(uv)).append("\n");
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
    openapiFields.add("period");
    openapiFields.add("proportion");
    openapiFields.add("uv");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner>() {
           @Override
           public void write(JsonWriter out, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner
  * @throws IOException if the JSON string is invalid with respect to StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner
  */
  public static StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner.class);
  }

 /**
  * Convert an instance of StarReportOrderOverviewV2ResponseDataBaseStatsInnerSpreadStatFrequencyStatsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

