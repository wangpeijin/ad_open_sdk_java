/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AssetsCreativeComponentUpdateV2ComponentInfoComponentType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class AssetsCreativeComponentUpdateV2RequestComponentInfo {
  public static final String SERIALIZED_NAME_COMPONENT_DATA = "component_data";
  @SerializedName(SERIALIZED_NAME_COMPONENT_DATA)
  private Object componentData = null;

  public static final String SERIALIZED_NAME_COMPONENT_NAME = "component_name";
  @SerializedName(SERIALIZED_NAME_COMPONENT_NAME)
  private String componentName = null;

  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private AssetsCreativeComponentUpdateV2ComponentInfoComponentType componentType = null;

  public AssetsCreativeComponentUpdateV2RequestComponentInfo() {
  }

  public AssetsCreativeComponentUpdateV2RequestComponentInfo componentData(Object componentData) {
    
    this.componentData = componentData;
    return this;
  }

   /**
   * 
   * @return componentData
  **/
  @javax.annotation.Nonnull
  public Object getComponentData() {
    return componentData;
  }


  public void setComponentData(Object componentData) {
    this.componentData = componentData;
  }


  public AssetsCreativeComponentUpdateV2RequestComponentInfo componentName(String componentName) {
    
    this.componentName = componentName;
    return this;
  }

   /**
   * 
   * @return componentName
  **/
  @javax.annotation.Nonnull
  public String getComponentName() {
    return componentName;
  }


  public void setComponentName(String componentName) {
    this.componentName = componentName;
  }


  public AssetsCreativeComponentUpdateV2RequestComponentInfo componentType(AssetsCreativeComponentUpdateV2ComponentInfoComponentType componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nonnull
  public AssetsCreativeComponentUpdateV2ComponentInfoComponentType getComponentType() {
    return componentType;
  }


  public void setComponentType(AssetsCreativeComponentUpdateV2ComponentInfoComponentType componentType) {
    this.componentType = componentType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetsCreativeComponentUpdateV2RequestComponentInfo assetsCreativeComponentUpdateV2RequestComponentInfo = (AssetsCreativeComponentUpdateV2RequestComponentInfo) o;
    return Objects.equals(this.componentData, assetsCreativeComponentUpdateV2RequestComponentInfo.componentData) &&
        Objects.equals(this.componentName, assetsCreativeComponentUpdateV2RequestComponentInfo.componentName) &&
        Objects.equals(this.componentType, assetsCreativeComponentUpdateV2RequestComponentInfo.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentData, componentName, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetsCreativeComponentUpdateV2RequestComponentInfo {\n");
    sb.append("    componentData: ").append(toIndentedString(componentData)).append("\n");
    sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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
    openapiFields.add("component_data");
    openapiFields.add("component_name");
    openapiFields.add("component_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("component_data");
    openapiRequiredFields.add("component_name");
    openapiRequiredFields.add("component_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AssetsCreativeComponentUpdateV2RequestComponentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AssetsCreativeComponentUpdateV2RequestComponentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AssetsCreativeComponentUpdateV2RequestComponentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AssetsCreativeComponentUpdateV2RequestComponentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AssetsCreativeComponentUpdateV2RequestComponentInfo>() {
           @Override
           public void write(JsonWriter out, AssetsCreativeComponentUpdateV2RequestComponentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AssetsCreativeComponentUpdateV2RequestComponentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AssetsCreativeComponentUpdateV2RequestComponentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AssetsCreativeComponentUpdateV2RequestComponentInfo
  * @throws IOException if the JSON string is invalid with respect to AssetsCreativeComponentUpdateV2RequestComponentInfo
  */
  public static AssetsCreativeComponentUpdateV2RequestComponentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AssetsCreativeComponentUpdateV2RequestComponentInfo.class);
  }

 /**
  * Convert an instance of AssetsCreativeComponentUpdateV2RequestComponentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

