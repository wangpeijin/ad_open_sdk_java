/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * 标签摘要信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {
  public static final String SERIALIZED_NAME_ABSTRACT_LABEL = "abstract_label";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_LABEL)
  private String abstractLabel = null;

  public static final String SERIALIZED_NAME_ABSTRACT_TEXT = "abstract_text";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_TEXT)
  private String abstractText = null;

  public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo() {
  }

  public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractLabel(String abstractLabel) {
    
    this.abstractLabel = abstractLabel;
    return this;
  }

   /**
   * 摘要标签
   * @return abstractLabel
  **/
  @javax.annotation.Nullable
  public String getAbstractLabel() {
    return abstractLabel;
  }


  public void setAbstractLabel(String abstractLabel) {
    this.abstractLabel = abstractLabel;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo abstractText(String abstractText) {
    
    this.abstractText = abstractText;
    return this;
  }

   /**
   * 摘要内容
   * @return abstractText
  **/
  @javax.annotation.Nullable
  public String getAbstractText() {
    return abstractText;
  }


  public void setAbstractText(String abstractText) {
    this.abstractText = abstractText;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo creativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo = (CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo) o;
    return Objects.equals(this.abstractLabel, creativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractLabel) &&
        Objects.equals(this.abstractText, creativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.abstractText);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractLabel, abstractText);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo {\n");
    sb.append("    abstractLabel: ").append(toIndentedString(abstractLabel)).append("\n");
    sb.append("    abstractText: ").append(toIndentedString(abstractText)).append("\n");
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
    openapiFields.add("abstract_label");
    openapiFields.add("abstract_text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo
  */
  public static CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInnerStructAbstractInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

