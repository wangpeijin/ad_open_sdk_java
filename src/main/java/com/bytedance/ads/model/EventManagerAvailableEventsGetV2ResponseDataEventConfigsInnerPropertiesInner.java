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
import com.bytedance.ads.model.EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
 * EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_ENUM_VALUE = "enum_value";
  @SerializedName(SERIALIZED_NAME_ENUM_VALUE)
  private Map<String, String> enumValue = null;

  public static final String SERIALIZED_NAME_FIELD = "field";
  @SerializedName(SERIALIZED_NAME_FIELD)
  private String field = null;

  public static final String SERIALIZED_NAME_FIELD_NAME = "field_name";
  @SerializedName(SERIALIZED_NAME_FIELD_NAME)
  private String fieldName = null;

  public static final String SERIALIZED_NAME_UNIT = "unit";
  @SerializedName(SERIALIZED_NAME_UNIT)
  private String unit = null;

  public static final String SERIALIZED_NAME_VARIABLE_TYPE = "variable_type";
  @SerializedName(SERIALIZED_NAME_VARIABLE_TYPE)
  private EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType variableType = null;

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner() {
  }

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 附加属性描述
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner enumValue(Map<String, String> enumValue) {
    
    this.enumValue = enumValue;
    return this;
  }

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner putEnumValueItem(String key, String enumValueItem) {
    if (this.enumValue == null) {
      this.enumValue = new HashMap<>();
    }
    this.enumValue.put(key, enumValueItem);
    return this;
  }

   /**
   * 附加属性枚举值
   * @return enumValue
  **/
  @javax.annotation.Nullable
  public Map<String, String> getEnumValue() {
    return enumValue;
  }


  public void setEnumValue(Map<String, String> enumValue) {
    this.enumValue = enumValue;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner field(String field) {
    
    this.field = field;
    return this;
  }

   /**
   * 附加属性英文名称
   * @return field
  **/
  @javax.annotation.Nullable
  public String getField() {
    return field;
  }


  public void setField(String field) {
    this.field = field;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner fieldName(String fieldName) {
    
    this.fieldName = fieldName;
    return this;
  }

   /**
   * 附加属性中文名称
   * @return fieldName
  **/
  @javax.annotation.Nullable
  public String getFieldName() {
    return fieldName;
  }


  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner unit(String unit) {
    
    this.unit = unit;
    return this;
  }

   /**
   * 附加属性单位
   * @return unit
  **/
  @javax.annotation.Nullable
  public String getUnit() {
    return unit;
  }


  public void setUnit(String unit) {
    this.unit = unit;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner variableType(EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType variableType) {
    
    this.variableType = variableType;
    return this;
  }

   /**
   * Get variableType
   * @return variableType
  **/
  @javax.annotation.Nullable
  public EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType getVariableType() {
    return variableType;
  }


  public void setVariableType(EventManagerAvailableEventsGetV2DataEventConfigsPropertiesVariableType variableType) {
    this.variableType = variableType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner = (EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner) o;
    return Objects.equals(this.description, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.description) &&
        Objects.equals(this.enumValue, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.enumValue) &&
        Objects.equals(this.field, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.field) &&
        Objects.equals(this.fieldName, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.fieldName) &&
        Objects.equals(this.unit, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.unit) &&
        Objects.equals(this.variableType, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.variableType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, enumValue, field, fieldName, unit, variableType);
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
    sb.append("class EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enumValue: ").append(toIndentedString(enumValue)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    variableType: ").append(toIndentedString(variableType)).append("\n");
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
    openapiFields.add("enum_value");
    openapiFields.add("field");
    openapiFields.add("field_name");
    openapiFields.add("unit");
    openapiFields.add("variable_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner>() {
           @Override
           public void write(JsonWriter out, EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner
  */
  public static EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner.class);
  }

 /**
  * Convert an instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

