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
import com.bytedance.ads.model.FileMaterialAuditResultGetV2DataListAuditStatus;
import com.bytedance.ads.model.FileMaterialAuditResultGetV2DataListMaterialType;
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
 * FileMaterialAuditResultGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class FileMaterialAuditResultGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private FileMaterialAuditResultGetV2DataListAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FileMaterialAuditResultGetV2DataListMaterialType materialType = null;

  public static final String SERIALIZED_NAME_REASONS = "reasons";
  @SerializedName(SERIALIZED_NAME_REASONS)
  private List<String> reasons = null;

  public FileMaterialAuditResultGetV2ResponseDataListInner() {
  }

  public FileMaterialAuditResultGetV2ResponseDataListInner auditStatus(FileMaterialAuditResultGetV2DataListAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public FileMaterialAuditResultGetV2DataListAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(FileMaterialAuditResultGetV2DataListAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public FileMaterialAuditResultGetV2ResponseDataListInner materialId(Long materialId) {
    
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


  public FileMaterialAuditResultGetV2ResponseDataListInner materialType(FileMaterialAuditResultGetV2DataListMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public FileMaterialAuditResultGetV2DataListMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FileMaterialAuditResultGetV2DataListMaterialType materialType) {
    this.materialType = materialType;
  }


  public FileMaterialAuditResultGetV2ResponseDataListInner reasons(List<String> reasons) {
    
    this.reasons = reasons;
    return this;
  }

  public FileMaterialAuditResultGetV2ResponseDataListInner addReasonsItem(String reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * 
   * @return reasons
  **/
  @javax.annotation.Nullable
  public List<String> getReasons() {
    return reasons;
  }


  public void setReasons(List<String> reasons) {
    this.reasons = reasons;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialAuditResultGetV2ResponseDataListInner fileMaterialAuditResultGetV2ResponseDataListInner = (FileMaterialAuditResultGetV2ResponseDataListInner) o;
    return Objects.equals(this.auditStatus, fileMaterialAuditResultGetV2ResponseDataListInner.auditStatus) &&
        Objects.equals(this.materialId, fileMaterialAuditResultGetV2ResponseDataListInner.materialId) &&
        Objects.equals(this.materialType, fileMaterialAuditResultGetV2ResponseDataListInner.materialType) &&
        Objects.equals(this.reasons, fileMaterialAuditResultGetV2ResponseDataListInner.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, materialId, materialType, reasons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMaterialAuditResultGetV2ResponseDataListInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("material_id");
    openapiFields.add("material_type");
    openapiFields.add("reasons");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialAuditResultGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialAuditResultGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialAuditResultGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialAuditResultGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialAuditResultGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FileMaterialAuditResultGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialAuditResultGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialAuditResultGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialAuditResultGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FileMaterialAuditResultGetV2ResponseDataListInner
  */
  public static FileMaterialAuditResultGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialAuditResultGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FileMaterialAuditResultGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

