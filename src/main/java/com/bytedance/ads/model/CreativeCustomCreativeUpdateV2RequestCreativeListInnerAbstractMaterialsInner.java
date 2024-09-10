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
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo;
import com.bytedance.ads.model.CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo;
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
 * CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner {
  public static final String SERIALIZED_NAME_STRUCT_ABSTRACT_INFO = "struct_abstract_info";
  @SerializedName(SERIALIZED_NAME_STRUCT_ABSTRACT_INFO)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_INFO = "text_abstract_info";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_INFO)
  private CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo = null;

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner() {
  }

  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner structAbstractInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    
    this.structAbstractInfo = structAbstractInfo;
    return this;
  }

   /**
   * Get structAbstractInfo
   * @return structAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo getStructAbstractInfo() {
    return structAbstractInfo;
  }


  public void setStructAbstractInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    this.structAbstractInfo = structAbstractInfo;
  }


  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner textAbstractInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    
    this.textAbstractInfo = textAbstractInfo;
    return this;
  }

   /**
   * Get textAbstractInfo
   * @return textAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo getTextAbstractInfo() {
    return textAbstractInfo;
  }


  public void setTextAbstractInfo(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    this.textAbstractInfo = textAbstractInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner = (CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner) o;
    return Objects.equals(this.structAbstractInfo, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner.structAbstractInfo) &&
        Objects.equals(this.textAbstractInfo, creativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner.textAbstractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structAbstractInfo, textAbstractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner {\n");
    sb.append("    structAbstractInfo: ").append(toIndentedString(structAbstractInfo)).append("\n");
    sb.append("    textAbstractInfo: ").append(toIndentedString(textAbstractInfo)).append("\n");
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
    openapiFields.add("struct_abstract_info");
    openapiFields.add("text_abstract_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner
  */
  public static CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeUpdateV2RequestCreativeListInnerAbstractMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

