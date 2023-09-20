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
 * FileMaterialDetailV2ResponseDataMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class FileMaterialDetailV2ResponseDataMaterialsInner {
  public static final String SERIALIZED_NAME_IS_AD_HIGH_QUALITY = "is_ad_high_quality";
  @SerializedName(SERIALIZED_NAME_IS_AD_HIGH_QUALITY)
  private Boolean isAdHighQuality = null;

  public static final String SERIALIZED_NAME_IS_ECP_HIGH_QUALITY = "is_ecp_high_quality";
  @SerializedName(SERIALIZED_NAME_IS_ECP_HIGH_QUALITY)
  private Boolean isEcpHighQuality = null;

  public static final String SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL = "is_first_publish_material";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL)
  private Boolean isFirstPublishMaterial = null;

  public static final String SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL = "is_inefficient_material";
  @SerializedName(SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL)
  private Boolean isInefficientMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL = "is_similar_expected_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_EXPECTED_QUEUE_MATERIAL)
  private Boolean isSimilarExpectedQueueMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_MATERIAL = "is_similar_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_MATERIAL)
  private Boolean isSimilarMaterial = null;

  public static final String SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL = "is_similar_queue_material";
  @SerializedName(SERIALIZED_NAME_IS_SIMILAR_QUEUE_MATERIAL)
  private Boolean isSimilarQueueMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId = null;

  public FileMaterialDetailV2ResponseDataMaterialsInner() {
  }

  public FileMaterialDetailV2ResponseDataMaterialsInner isAdHighQuality(Boolean isAdHighQuality) {
    
    this.isAdHighQuality = isAdHighQuality;
    return this;
  }

   /**
   * 
   * @return isAdHighQuality
  **/
  @javax.annotation.Nullable
  public Boolean getIsAdHighQuality() {
    return isAdHighQuality;
  }


  public void setIsAdHighQuality(Boolean isAdHighQuality) {
    this.isAdHighQuality = isAdHighQuality;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isEcpHighQuality(Boolean isEcpHighQuality) {
    
    this.isEcpHighQuality = isEcpHighQuality;
    return this;
  }

   /**
   * 
   * @return isEcpHighQuality
  **/
  @javax.annotation.Nullable
  public Boolean getIsEcpHighQuality() {
    return isEcpHighQuality;
  }


  public void setIsEcpHighQuality(Boolean isEcpHighQuality) {
    this.isEcpHighQuality = isEcpHighQuality;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    
    this.isFirstPublishMaterial = isFirstPublishMaterial;
    return this;
  }

   /**
   * 
   * @return isFirstPublishMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsFirstPublishMaterial() {
    return isFirstPublishMaterial;
  }


  public void setIsFirstPublishMaterial(Boolean isFirstPublishMaterial) {
    this.isFirstPublishMaterial = isFirstPublishMaterial;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isInefficientMaterial(Boolean isInefficientMaterial) {
    
    this.isInefficientMaterial = isInefficientMaterial;
    return this;
  }

   /**
   * 
   * @return isInefficientMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsInefficientMaterial() {
    return isInefficientMaterial;
  }


  public void setIsInefficientMaterial(Boolean isInefficientMaterial) {
    this.isInefficientMaterial = isInefficientMaterial;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
    return this;
  }

   /**
   * 
   * @return isSimilarExpectedQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarExpectedQueueMaterial() {
    return isSimilarExpectedQueueMaterial;
  }


  public void setIsSimilarExpectedQueueMaterial(Boolean isSimilarExpectedQueueMaterial) {
    this.isSimilarExpectedQueueMaterial = isSimilarExpectedQueueMaterial;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isSimilarMaterial(Boolean isSimilarMaterial) {
    
    this.isSimilarMaterial = isSimilarMaterial;
    return this;
  }

   /**
   * 
   * @return isSimilarMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarMaterial() {
    return isSimilarMaterial;
  }


  public void setIsSimilarMaterial(Boolean isSimilarMaterial) {
    this.isSimilarMaterial = isSimilarMaterial;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner isSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
    return this;
  }

   /**
   * 
   * @return isSimilarQueueMaterial
  **/
  @javax.annotation.Nullable
  public Boolean getIsSimilarQueueMaterial() {
    return isSimilarQueueMaterial;
  }


  public void setIsSimilarQueueMaterial(Boolean isSimilarQueueMaterial) {
    this.isSimilarQueueMaterial = isSimilarQueueMaterial;
  }


  public FileMaterialDetailV2ResponseDataMaterialsInner materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialDetailV2ResponseDataMaterialsInner fileMaterialDetailV2ResponseDataMaterialsInner = (FileMaterialDetailV2ResponseDataMaterialsInner) o;
    return Objects.equals(this.isAdHighQuality, fileMaterialDetailV2ResponseDataMaterialsInner.isAdHighQuality) &&
        Objects.equals(this.isEcpHighQuality, fileMaterialDetailV2ResponseDataMaterialsInner.isEcpHighQuality) &&
        Objects.equals(this.isFirstPublishMaterial, fileMaterialDetailV2ResponseDataMaterialsInner.isFirstPublishMaterial) &&
        Objects.equals(this.isInefficientMaterial, fileMaterialDetailV2ResponseDataMaterialsInner.isInefficientMaterial) &&
        Objects.equals(this.isSimilarExpectedQueueMaterial, fileMaterialDetailV2ResponseDataMaterialsInner.isSimilarExpectedQueueMaterial) &&
        Objects.equals(this.isSimilarMaterial, fileMaterialDetailV2ResponseDataMaterialsInner.isSimilarMaterial) &&
        Objects.equals(this.isSimilarQueueMaterial, fileMaterialDetailV2ResponseDataMaterialsInner.isSimilarQueueMaterial) &&
        Objects.equals(this.materialId, fileMaterialDetailV2ResponseDataMaterialsInner.materialId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(isAdHighQuality, isEcpHighQuality, isFirstPublishMaterial, isInefficientMaterial, isSimilarExpectedQueueMaterial, isSimilarMaterial, isSimilarQueueMaterial, materialId);
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
    sb.append("class FileMaterialDetailV2ResponseDataMaterialsInner {\n");
    sb.append("    isAdHighQuality: ").append(toIndentedString(isAdHighQuality)).append("\n");
    sb.append("    isEcpHighQuality: ").append(toIndentedString(isEcpHighQuality)).append("\n");
    sb.append("    isFirstPublishMaterial: ").append(toIndentedString(isFirstPublishMaterial)).append("\n");
    sb.append("    isInefficientMaterial: ").append(toIndentedString(isInefficientMaterial)).append("\n");
    sb.append("    isSimilarExpectedQueueMaterial: ").append(toIndentedString(isSimilarExpectedQueueMaterial)).append("\n");
    sb.append("    isSimilarMaterial: ").append(toIndentedString(isSimilarMaterial)).append("\n");
    sb.append("    isSimilarQueueMaterial: ").append(toIndentedString(isSimilarQueueMaterial)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("is_ad_high_quality");
    openapiFields.add("is_ecp_high_quality");
    openapiFields.add("is_first_publish_material");
    openapiFields.add("is_inefficient_material");
    openapiFields.add("is_similar_expected_queue_material");
    openapiFields.add("is_similar_material");
    openapiFields.add("is_similar_queue_material");
    openapiFields.add("material_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialDetailV2ResponseDataMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialDetailV2ResponseDataMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialDetailV2ResponseDataMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialDetailV2ResponseDataMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialDetailV2ResponseDataMaterialsInner>() {
           @Override
           public void write(JsonWriter out, FileMaterialDetailV2ResponseDataMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialDetailV2ResponseDataMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialDetailV2ResponseDataMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialDetailV2ResponseDataMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to FileMaterialDetailV2ResponseDataMaterialsInner
  */
  public static FileMaterialDetailV2ResponseDataMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialDetailV2ResponseDataMaterialsInner.class);
  }

 /**
  * Convert an instance of FileMaterialDetailV2ResponseDataMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

