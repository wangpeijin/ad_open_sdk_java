/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportSearchWordGetV10FilteringRangeCalculation;
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
 * 关键词/搜索词 只支持部分指标过滤
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class QianchuanReportSearchWordGetV10FilteringRange {
  public static final String SERIALIZED_NAME_CALCULATION = "calculation";
  @SerializedName(SERIALIZED_NAME_CALCULATION)
  private QianchuanReportSearchWordGetV10FilteringRangeCalculation calculation = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public QianchuanReportSearchWordGetV10FilteringRange() {
  }

  public QianchuanReportSearchWordGetV10FilteringRange calculation(QianchuanReportSearchWordGetV10FilteringRangeCalculation calculation) {
    
    this.calculation = calculation;
    return this;
  }

   /**
   * Get calculation
   * @return calculation
  **/
  @javax.annotation.Nullable
  public QianchuanReportSearchWordGetV10FilteringRangeCalculation getCalculation() {
    return calculation;
  }


  public void setCalculation(QianchuanReportSearchWordGetV10FilteringRangeCalculation calculation) {
    this.calculation = calculation;
  }


  public QianchuanReportSearchWordGetV10FilteringRange field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public QianchuanReportSearchWordGetV10FilteringRange value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportSearchWordGetV10FilteringRange qianchuanReportSearchWordGetV10FilteringRange = (QianchuanReportSearchWordGetV10FilteringRange) o;
    return Objects.equals(this.calculation, qianchuanReportSearchWordGetV10FilteringRange.calculation) &&
        Objects.equals(this.field, qianchuanReportSearchWordGetV10FilteringRange.field) &&
        Objects.equals(this.value, qianchuanReportSearchWordGetV10FilteringRange.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calculation, field, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportSearchWordGetV10FilteringRange {\n");
    sb.append("    calculation: ").append(toIndentedString(calculation)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("calculation");
    openapiFields.add("field");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportSearchWordGetV10FilteringRange.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportSearchWordGetV10FilteringRange' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportSearchWordGetV10FilteringRange> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportSearchWordGetV10FilteringRange.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportSearchWordGetV10FilteringRange>() {
           @Override
           public void write(JsonWriter out, QianchuanReportSearchWordGetV10FilteringRange value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportSearchWordGetV10FilteringRange read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportSearchWordGetV10FilteringRange given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportSearchWordGetV10FilteringRange
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportSearchWordGetV10FilteringRange
  */
  public static QianchuanReportSearchWordGetV10FilteringRange fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportSearchWordGetV10FilteringRange.class);
  }

 /**
  * Convert an instance of QianchuanReportSearchWordGetV10FilteringRange to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

