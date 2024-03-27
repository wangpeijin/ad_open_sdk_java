/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
 * cvr波动范围
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation {
  public static final String SERIALIZED_NAME_VARIATION_MAX = "variation_max";
  @SerializedName(SERIALIZED_NAME_VARIATION_MAX)
  private String variationMax = null;

  public static final String SERIALIZED_NAME_VARIATION_MIN = "variation_min";
  @SerializedName(SERIALIZED_NAME_VARIATION_MIN)
  private String variationMin = null;

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation() {
  }

  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation variationMax(String variationMax) {
    
    this.variationMax = variationMax;
    return this;
  }

   /**
   * 波动范围上限
   * @return variationMax
  **/
  @javax.annotation.Nullable
  public String getVariationMax() {
    return variationMax;
  }


  public void setVariationMax(String variationMax) {
    this.variationMax = variationMax;
  }


  public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation variationMin(String variationMin) {
    
    this.variationMin = variationMin;
    return this;
  }

   /**
   * 波动范围下限
   * @return variationMin
  **/
  @javax.annotation.Nullable
  public String getVariationMin() {
    return variationMin;
  }


  public void setVariationMin(String variationMin) {
    this.variationMin = variationMin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation = (ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation) o;
    return Objects.equals(this.variationMax, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation.variationMax) &&
        Objects.equals(this.variationMin, toolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation.variationMin);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(variationMax, variationMin);
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
    sb.append("class ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation {\n");
    sb.append("    variationMax: ").append(toIndentedString(variationMax)).append("\n");
    sb.append("    variationMin: ").append(toIndentedString(variationMin)).append("\n");
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
    openapiFields.add("variation_max");
    openapiFields.add("variation_min");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation>() {
           @Override
           public void write(JsonWriter out, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation
  * @throws IOException if the JSON string is invalid with respect to ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation
  */
  public static ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation.class);
  }

 /**
  * Convert an instance of ToolsAbTestInfoGetV2ResponseDataTestReportsInnerMetricsCvrVariation to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
