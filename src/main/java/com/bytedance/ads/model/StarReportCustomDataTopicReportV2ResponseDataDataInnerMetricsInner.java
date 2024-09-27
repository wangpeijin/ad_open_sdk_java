/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarReportCustomDataTopicReportV2DataDataMetricsType;
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
 * StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private StarReportCustomDataTopicReportV2DataDataMetricsType type = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner() {
  }

  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 指标描述，建议首次使用前先调用/open_api/2/star/report/data_topic_config/接口详细了解具体数据主题下的Topic配置
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 指标字段，仅包含英文与下划线等符号
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 指标名称，中文或英文描述字段名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner type(StarReportCustomDataTopicReportV2DataDataMetricsType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  public StarReportCustomDataTopicReportV2DataDataMetricsType getType() {
    return type;
  }


  public void setType(StarReportCustomDataTopicReportV2DataDataMetricsType type) {
    this.type = type;
  }


  public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 指标值
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
    StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner = (StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner) o;
    return Objects.equals(this.description, starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.description) &&
        Objects.equals(this.field, starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.field) &&
        Objects.equals(this.name, starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.name) &&
        Objects.equals(this.type, starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.type) &&
        Objects.equals(this.value, starReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, field, name, type, value);
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
    sb.append("class StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("field");
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("field");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner>() {
           @Override
           public void write(JsonWriter out, StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner
  * @throws IOException if the JSON string is invalid with respect to StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner
  */
  public static StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner.class);
  }

 /**
  * Convert an instance of StarReportCustomDataTopicReportV2ResponseDataDataInnerMetricsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

