/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialDeliveryType;
import com.bytedance.ads.model.QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public static final String SERIALIZED_NAME_IS_DEL = "is_del";
  @SerializedName(SERIALIZED_NAME_IS_DEL)
  private Boolean isDel = null;

  public static final String SERIALIZED_NAME_MATERIAL_DELIVERY_TYPE = "material_delivery_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_DELIVERY_TYPE)
  private QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialDeliveryType materialDeliveryType = null;

  public static final String SERIALIZED_NAME_MATERIAL_INFO = "material_info";
  @SerializedName(SERIALIZED_NAME_MATERIAL_INFO)
  private QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo = null;

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner() {
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner auditStatus(QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(QianchuanAdMaterialGetV10DataAdMaterialInfosAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 是否派生
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner isDel(Boolean isDel) {
    
    this.isDel = isDel;
    return this;
  }

   /**
   * 是否删除
   * @return isDel
  **/
  @javax.annotation.Nullable
  public Boolean getIsDel() {
    return isDel;
  }


  public void setIsDel(Boolean isDel) {
    this.isDel = isDel;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner materialDeliveryType(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialDeliveryType materialDeliveryType) {
    
    this.materialDeliveryType = materialDeliveryType;
    return this;
  }

   /**
   * Get materialDeliveryType
   * @return materialDeliveryType
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialDeliveryType getMaterialDeliveryType() {
    return materialDeliveryType;
  }


  public void setMaterialDeliveryType(QianchuanAdMaterialGetV10DataAdMaterialInfosMaterialDeliveryType materialDeliveryType) {
    this.materialDeliveryType = materialDeliveryType;
  }


  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner materialInfo(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    
    this.materialInfo = materialInfo;
    return this;
  }

   /**
   * Get materialInfo
   * @return materialInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo getMaterialInfo() {
    return materialInfo;
  }


  public void setMaterialInfo(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfo materialInfo) {
    this.materialInfo = materialInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner = (QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner) o;
    return Objects.equals(this.auditStatus, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.auditStatus) &&
        Objects.equals(this.creativeIds, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.creativeIds) &&
        Objects.equals(this.isAutoGenerate, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.isAutoGenerate) &&
        Objects.equals(this.isDel, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.isDel) &&
        Objects.equals(this.materialDeliveryType, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.materialDeliveryType) &&
        Objects.equals(this.materialInfo, qianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.materialInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, creativeIds, isAutoGenerate, isDel, materialDeliveryType, materialInfo);
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
    sb.append("class QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
    sb.append("    isDel: ").append(toIndentedString(isDel)).append("\n");
    sb.append("    materialDeliveryType: ").append(toIndentedString(materialDeliveryType)).append("\n");
    sb.append("    materialInfo: ").append(toIndentedString(materialInfo)).append("\n");
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
    openapiFields.add("creative_ids");
    openapiFields.add("is_auto_generate");
    openapiFields.add("is_del");
    openapiFields.add("material_delivery_type");
    openapiFields.add("material_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("is_del");
    openapiRequiredFields.add("material_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner
  */
  public static QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner.class);
  }

 /**
  * Convert an instance of QianchuanAdMaterialGetV10ResponseDataAdMaterialInfosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

