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
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerStructAbstractInfo;
import com.bytedance.ads.model.CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo;
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
 * CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_STRUCT_ABSTRACT_INFO = "struct_abstract_info";
  @SerializedName(SERIALIZED_NAME_STRUCT_ABSTRACT_INFO)
  private CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo = null;

  public static final String SERIALIZED_NAME_TEXT_ABSTRACT_INFO = "text_abstract_info";
  @SerializedName(SERIALIZED_NAME_TEXT_ABSTRACT_INFO)
  private CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo = null;

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner() {
  }

  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner structAbstractInfo(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    
    this.structAbstractInfo = structAbstractInfo;
    return this;
  }

   /**
   * Get structAbstractInfo
   * @return structAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerStructAbstractInfo getStructAbstractInfo() {
    return structAbstractInfo;
  }


  public void setStructAbstractInfo(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerStructAbstractInfo structAbstractInfo) {
    this.structAbstractInfo = structAbstractInfo;
  }


  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner textAbstractInfo(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
    
    this.textAbstractInfo = textAbstractInfo;
    return this;
  }

   /**
   * Get textAbstractInfo
   * @return textAbstractInfo
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo getTextAbstractInfo() {
    return textAbstractInfo;
  }


  public void setTextAbstractInfo(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInnerTextAbstractInfo textAbstractInfo) {
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
    CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner = (CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner) o;
    return Objects.equals(this.materialId, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.materialId) &&
        Objects.equals(this.structAbstractInfo, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.structAbstractInfo) &&
        Objects.equals(this.textAbstractInfo, creativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.textAbstractInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, structAbstractInfo, textAbstractInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("material_id");
    openapiFields.add("struct_abstract_info");
    openapiFields.add("text_abstract_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner
  */
  public static CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeUpdateV2RequestCreativeAbstractMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

