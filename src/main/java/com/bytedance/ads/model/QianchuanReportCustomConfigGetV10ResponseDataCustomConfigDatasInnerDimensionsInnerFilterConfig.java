/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private Long operator = null;

  public static final String SERIALIZED_NAME_RANGE_VALUES = "range_values";
  @SerializedName(SERIALIZED_NAME_RANGE_VALUES)
  private List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner> rangeValues = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private Long type = null;

  public static final String SERIALIZED_NAME_VALUE_LIMIT = "value_limit";
  @SerializedName(SERIALIZED_NAME_VALUE_LIMIT)
  private Long valueLimit = null;

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig() {
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig operator(Long operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * 
   * @return operator
  **/
  @javax.annotation.Nullable
  public Long getOperator() {
    return operator;
  }


  public void setOperator(Long operator) {
    this.operator = operator;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig rangeValues(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner> rangeValues) {
    
    this.rangeValues = rangeValues;
    return this;
  }

  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig addRangeValuesItem(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner rangeValuesItem) {
    if (this.rangeValues == null) {
      this.rangeValues = new ArrayList<>();
    }
    this.rangeValues.add(rangeValuesItem);
    return this;
  }

   /**
   * 
   * @return rangeValues
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner> getRangeValues() {
    return rangeValues;
  }


  public void setRangeValues(List<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfigRangeValuesInner> rangeValues) {
    this.rangeValues = rangeValues;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig type(Long type) {
    
    this.type = type;
    return this;
  }

   /**
   * 
   * @return type
  **/
  @javax.annotation.Nullable
  public Long getType() {
    return type;
  }


  public void setType(Long type) {
    this.type = type;
  }


  public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig valueLimit(Long valueLimit) {
    
    this.valueLimit = valueLimit;
    return this;
  }

   /**
   * 
   * @return valueLimit
  **/
  @javax.annotation.Nullable
  public Long getValueLimit() {
    return valueLimit;
  }


  public void setValueLimit(Long valueLimit) {
    this.valueLimit = valueLimit;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig = (QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig) o;
    return Objects.equals(this.operator, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.operator) &&
        Objects.equals(this.rangeValues, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.rangeValues) &&
        Objects.equals(this.type, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.type) &&
        Objects.equals(this.valueLimit, qianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.valueLimit);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, rangeValues, type, valueLimit);
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
    sb.append("class QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    rangeValues: ").append(toIndentedString(rangeValues)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    valueLimit: ").append(toIndentedString(valueLimit)).append("\n");
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
    openapiFields.add("operator");
    openapiFields.add("range_values");
    openapiFields.add("type");
    openapiFields.add("value_limit");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig>() {
           @Override
           public void write(JsonWriter out, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig
  */
  public static QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig.class);
  }

 /**
  * Convert an instance of QianchuanReportCustomConfigGetV10ResponseDataCustomConfigDatasInnerDimensionsInnerFilterConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

