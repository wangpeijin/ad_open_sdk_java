/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * FileAutoGenerateSourceGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class FileAutoGenerateSourceGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SOURCE_MATERIAL_IDS = "source_material_ids";
  @SerializedName(SERIALIZED_NAME_SOURCE_MATERIAL_IDS)
  private List<Long> sourceMaterialIds = null;

  public FileAutoGenerateSourceGetV2ResponseDataListInner() {
  }

  public FileAutoGenerateSourceGetV2ResponseDataListInner isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }


  public FileAutoGenerateSourceGetV2ResponseDataListInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileAutoGenerateSourceGetV2ResponseDataListInner sourceMaterialIds(List<Long> sourceMaterialIds) {
    
    this.sourceMaterialIds = sourceMaterialIds;
    return this;
  }

  public FileAutoGenerateSourceGetV2ResponseDataListInner addSourceMaterialIdsItem(Long sourceMaterialIdsItem) {
    if (this.sourceMaterialIds == null) {
      this.sourceMaterialIds = new ArrayList<>();
    }
    this.sourceMaterialIds.add(sourceMaterialIdsItem);
    return this;
  }

   /**
   * 
   * @return sourceMaterialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getSourceMaterialIds() {
    return sourceMaterialIds;
  }


  public void setSourceMaterialIds(List<Long> sourceMaterialIds) {
    this.sourceMaterialIds = sourceMaterialIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileAutoGenerateSourceGetV2ResponseDataListInner fileAutoGenerateSourceGetV2ResponseDataListInner = (FileAutoGenerateSourceGetV2ResponseDataListInner) o;
    return Objects.equals(this.isAutoGenerate, fileAutoGenerateSourceGetV2ResponseDataListInner.isAutoGenerate) &&
        Objects.equals(this.materialId, fileAutoGenerateSourceGetV2ResponseDataListInner.materialId) &&
        Objects.equals(this.sourceMaterialIds, fileAutoGenerateSourceGetV2ResponseDataListInner.sourceMaterialIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAutoGenerate, materialId, sourceMaterialIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileAutoGenerateSourceGetV2ResponseDataListInner {\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    sourceMaterialIds: ").append(toIndentedString(sourceMaterialIds)).append("\n");
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
    openapiFields.add("is_auto_generate");
    openapiFields.add("material_id");
    openapiFields.add("source_material_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileAutoGenerateSourceGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileAutoGenerateSourceGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileAutoGenerateSourceGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileAutoGenerateSourceGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileAutoGenerateSourceGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileAutoGenerateSourceGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileAutoGenerateSourceGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileAutoGenerateSourceGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileAutoGenerateSourceGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileAutoGenerateSourceGetV2ResponseDataListInner
  */
  public static FileAutoGenerateSourceGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileAutoGenerateSourceGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileAutoGenerateSourceGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

