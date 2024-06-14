/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
 * PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner {
  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value = null;

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner() {
  }

  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 填充内容的键
   * @return key
  **/
  @javax.annotation.Nullable
  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 填充内容的值
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
    PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner promotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner = (PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner) o;
    return Objects.equals(this.key, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner.key) &&
        Objects.equals(this.value, promotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value);
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
    sb.append("class PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("key");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner>() {
           @Override
           public void write(JsonWriter out, PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner
  * @throws IOException if the JSON string is invalid with respect to PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner
  */
  public static PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner.class);
  }

 /**
  * Convert an instance of PromotionAutoGenerateConfigGetV30ResponseDataTemplatesInnerTemplateTextSchemaInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

