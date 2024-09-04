/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileAutoGenerateSourceGetV2MaterialsMaterialType;
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
 * FileAutoGenerateSourceGetV2MaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class FileAutoGenerateSourceGetV2MaterialsInner {
  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FileAutoGenerateSourceGetV2MaterialsMaterialType materialType = null;

  public FileAutoGenerateSourceGetV2MaterialsInner() {
  }

  public FileAutoGenerateSourceGetV2MaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nonnull
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileAutoGenerateSourceGetV2MaterialsInner materialType(FileAutoGenerateSourceGetV2MaterialsMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public FileAutoGenerateSourceGetV2MaterialsMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FileAutoGenerateSourceGetV2MaterialsMaterialType materialType) {
    this.materialType = materialType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAutoGenerateSourceGetV2MaterialsInner fileAutoGenerateSourceGetV2MaterialsInner = (FileAutoGenerateSourceGetV2MaterialsInner) o;
    return Objects.equals(this.materialId, fileAutoGenerateSourceGetV2MaterialsInner.materialId) &&
        Objects.equals(this.materialType, fileAutoGenerateSourceGetV2MaterialsInner.materialType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(materialId, materialType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAutoGenerateSourceGetV2MaterialsInner {\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
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
    openapiFields.add("material_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_id");
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAutoGenerateSourceGetV2MaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAutoGenerateSourceGetV2MaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAutoGenerateSourceGetV2MaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAutoGenerateSourceGetV2MaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAutoGenerateSourceGetV2MaterialsInner>() {
           @Override
           public void write(JsonWriter out, FileAutoGenerateSourceGetV2MaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAutoGenerateSourceGetV2MaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAutoGenerateSourceGetV2MaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAutoGenerateSourceGetV2MaterialsInner
  * @throws IOException if the JSON string is invalid with respect to FileAutoGenerateSourceGetV2MaterialsInner
  */
  public static FileAutoGenerateSourceGetV2MaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAutoGenerateSourceGetV2MaterialsInner.class);
  }

 /**
  * Convert an instance of FileAutoGenerateSourceGetV2MaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

