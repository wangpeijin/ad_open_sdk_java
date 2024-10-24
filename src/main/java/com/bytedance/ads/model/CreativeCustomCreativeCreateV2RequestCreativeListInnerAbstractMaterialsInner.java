/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo;
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
 * CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner {
  public static final String SERIALIZED_NAME_STRUCT_ABSTRACT_INFO = "struct_abstract_info";
  @SerializedName(SERIALIZED_NAME_STRUCT_ABSTRACT_INFO)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_INFO = "text_abstract_info";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_INFO)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner structAbstractInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    
    this.structAbstractInfo = structAbstractInfo;
    return this;
  }

   /**
   * Get structAbstractInfo
   * @return structAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo getStructAbstractInfo() {
    return structAbstractInfo;
  }


  public void setStructAbstractInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    this.structAbstractInfo = structAbstractInfo;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner textAbstractInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    
    this.textAbstractInfo = textAbstractInfo;
    return this;
  }

   /**
   * Get textAbstractInfo
   * @return textAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo getTextAbstractInfo() {
    return textAbstractInfo;
  }


  public void setTextAbstractInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
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
    CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner = (CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner) o;
    return Objects.equals(this.structAbstractInfo, creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner.structAbstractInfo) &&
        Objects.equals(this.textAbstractInfo, creativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner.textAbstractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(structAbstractInfo, textAbstractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner {\n");
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
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerAbstractMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

