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
 * ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner {
  public static final String SERIALIZED_NAME_SECOND_MATERIAL_NAME = "second_material_name";
  @SerializedName(SERIALIZED_NAME_SECOND_MATERIAL_NAME)
  private String secondMaterialName = null;

  public static final String SERIALIZED_NAME_SECOND_MATERIAL_TYPE = "second_material_type";
  @SerializedName(SERIALIZED_NAME_SECOND_MATERIAL_TYPE)
  private Long secondMaterialType = null;

  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner() {
  }

  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner secondMaterialName(String secondMaterialName) {
    
    this.secondMaterialName = secondMaterialName;
    return this;
  }

   /**
   * 
   * @return secondMaterialName
  **/
  @javax.annotation.Nullable
  public String getSecondMaterialName() {
    return secondMaterialName;
  }


  public void setSecondMaterialName(String secondMaterialName) {
    this.secondMaterialName = secondMaterialName;
  }


  public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner secondMaterialType(Long secondMaterialType) {
    
    this.secondMaterialType = secondMaterialType;
    return this;
  }

   /**
   * 
   * @return secondMaterialType
  **/
  @javax.annotation.Nullable
  public Long getSecondMaterialType() {
    return secondMaterialType;
  }


  public void setSecondMaterialType(Long secondMaterialType) {
    this.secondMaterialType = secondMaterialType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner toolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner = (ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner) o;
    return Objects.equals(this.secondMaterialName, toolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner.secondMaterialName) &&
        Objects.equals(this.secondMaterialType, toolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner.secondMaterialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secondMaterialName, secondMaterialType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner {\n");
    sb.append("    secondMaterialName: ").append(toIndentedString(secondMaterialName)).append("\n");
    sb.append("    secondMaterialType: ").append(toIndentedString(secondMaterialType)).append("\n");
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
    openapiFields.add("second_material_name");
    openapiFields.add("second_material_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("second_material_name");
    openapiRequiredFields.add("second_material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner>() {
           @Override
           public void write(JsonWriter out, ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner
  * @throws IOException if the JSON string is invalid with respect to ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner
  */
  public static ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner.class);
  }

 /**
  * Convert an instance of ToolsStarTaskMaterialTypeV2ResponseDataMaterialListInnerChildrenInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

