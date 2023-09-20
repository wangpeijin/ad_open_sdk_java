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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue {
  public static final String SERIALIZED_NAME_BOOLEAN_PARAM = "boolean_param";
  @SerializedName(SERIALIZED_NAME_BOOLEAN_PARAM)
  private Boolean booleanParam = null;

  public static final String SERIALIZED_NAME_LIST_PARAM = "list_param";
  @SerializedName(SERIALIZED_NAME_LIST_PARAM)
  private List<String> listParam = null;

  public static final String SERIALIZED_NAME_OBJECT_LIST_PARAM = "object_list_param";
  @SerializedName(SERIALIZED_NAME_OBJECT_LIST_PARAM)
  private List<Map<String, String>> objectListParam = null;

  public static final String SERIALIZED_NAME_STRING_PARAM = "string_param";
  @SerializedName(SERIALIZED_NAME_STRING_PARAM)
  private String stringParam = null;

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue() {
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue booleanParam(Boolean booleanParam) {
    
    this.booleanParam = booleanParam;
    return this;
  }

   /**
   * 
   * @return booleanParam
  **/
  @javax.annotation.Nullable
  public Boolean getBooleanParam() {
    return booleanParam;
  }


  public void setBooleanParam(Boolean booleanParam) {
    this.booleanParam = booleanParam;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue listParam(List<String> listParam) {
    
    this.listParam = listParam;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue addListParamItem(String listParamItem) {
    if (this.listParam == null) {
      this.listParam = new ArrayList<>();
    }
    this.listParam.add(listParamItem);
    return this;
  }

   /**
   * 
   * @return listParam
  **/
  @javax.annotation.Nullable
  public List<String> getListParam() {
    return listParam;
  }


  public void setListParam(List<String> listParam) {
    this.listParam = listParam;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue objectListParam(List<Map<String, String>> objectListParam) {
    
    this.objectListParam = objectListParam;
    return this;
  }

  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue addObjectListParamItem(Map<String, String> objectListParamItem) {
    if (this.objectListParam == null) {
      this.objectListParam = new ArrayList<>();
    }
    this.objectListParam.add(objectListParamItem);
    return this;
  }

   /**
   * 
   * @return objectListParam
  **/
  @javax.annotation.Nullable
  public List<Map<String, String>> getObjectListParam() {
    return objectListParam;
  }


  public void setObjectListParam(List<Map<String, String>> objectListParam) {
    this.objectListParam = objectListParam;
  }


  public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue stringParam(String stringParam) {
    
    this.stringParam = stringParam;
    return this;
  }

   /**
   * 
   * @return stringParam
  **/
  @javax.annotation.Nullable
  public String getStringParam() {
    return stringParam;
  }


  public void setStringParam(String stringParam) {
    this.stringParam = stringParam;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue = (ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue) o;
    return Objects.equals(this.booleanParam, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.booleanParam) &&
        Objects.equals(this.listParam, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.listParam) &&
        Objects.equals(this.objectListParam, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.objectListParam) &&
        Objects.equals(this.stringParam, toolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.stringParam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanParam, listParam, objectListParam, stringParam);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue {\n");
    sb.append("    booleanParam: ").append(toIndentedString(booleanParam)).append("\n");
    sb.append("    listParam: ").append(toIndentedString(listParam)).append("\n");
    sb.append("    objectListParam: ").append(toIndentedString(objectListParam)).append("\n");
    sb.append("    stringParam: ").append(toIndentedString(stringParam)).append("\n");
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
    openapiFields.add("boolean_param");
    openapiFields.add("list_param");
    openapiFields.add("object_list_param");
    openapiFields.add("string_param");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue>() {
           @Override
           public void write(JsonWriter out, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue
  * @throws IOException if the JSON string is invalid with respect to ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue
  */
  public static ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue.class);
  }

 /**
  * Convert an instance of ToolsPromotionDiagnosisSuggestionAcceptV30RequestToolsInnerParamsInnerParamValue to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

