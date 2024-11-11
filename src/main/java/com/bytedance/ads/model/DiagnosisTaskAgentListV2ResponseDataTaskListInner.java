/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2DataTaskListIsEcpHighQualityMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2DataTaskListIsInefficientMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentListV2DataTaskListStatus;
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
 * DiagnosisTaskAgentListV2ResponseDataTaskListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class DiagnosisTaskAgentListV2ResponseDataTaskListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL = "is_ad_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL)
  private DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL = "is_ecp_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL)
  private DiagnosisTaskAgentListV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL = "is_first_publish_material";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL)
  private DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial = null;

  public static final String SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL = "is_inefficient_material";
  @SerializedName(SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL)
  private DiagnosisTaskAgentListV2DataTaskListIsInefficientMaterial isInefficientMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_NOT_AD_HIGH_QUALITY_REASON = "not_ad_high_quality_reason";
  @SerializedName(SERIALIZED_NAME_NOT_AD_HIGH_QUALITY_REASON)
  private List<String> notAdHighQualityReason = null;

  public static final String SERIALIZED_NAME_NOT_ECP_HIGH_QUALITY_REASON = "not_ecp_high_quality_reason";
  @SerializedName(SERIALIZED_NAME_NOT_ECP_HIGH_QUALITY_REASON)
  private List<String> notEcpHighQualityReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DiagnosisTaskAgentListV2DataTaskListStatus status = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public DiagnosisTaskAgentListV2ResponseDataTaskListInner() {
  }

  public DiagnosisTaskAgentListV2ResponseDataTaskListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner isAdHighQualityMaterial(DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial) {
    
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
    return this;
  }

   /**
   * Get isAdHighQualityMaterial
   * @return isAdHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial getIsAdHighQualityMaterial() {
    return isAdHighQualityMaterial;
  }


  public void setIsAdHighQualityMaterial(DiagnosisTaskAgentListV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial) {
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner isEcpHighQualityMaterial(DiagnosisTaskAgentListV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial) {
    
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
    return this;
  }

   /**
   * Get isEcpHighQualityMaterial
   * @return isEcpHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentListV2DataTaskListIsEcpHighQualityMaterial getIsEcpHighQualityMaterial() {
    return isEcpHighQualityMaterial;
  }


  public void setIsEcpHighQualityMaterial(DiagnosisTaskAgentListV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial) {
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner isFirstPublishMaterial(DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial) {
    
    this.isFirstPublishMaterial = isFirstPublishMaterial;
    return this;
  }

   /**
   * Get isFirstPublishMaterial
   * @return isFirstPublishMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial getIsFirstPublishMaterial() {
    return isFirstPublishMaterial;
  }


  public void setIsFirstPublishMaterial(DiagnosisTaskAgentListV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial) {
    this.isFirstPublishMaterial = isFirstPublishMaterial;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner isInefficientMaterial(DiagnosisTaskAgentListV2DataTaskListIsInefficientMaterial isInefficientMaterial) {
    
    this.isInefficientMaterial = isInefficientMaterial;
    return this;
  }

   /**
   * Get isInefficientMaterial
   * @return isInefficientMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentListV2DataTaskListIsInefficientMaterial getIsInefficientMaterial() {
    return isInefficientMaterial;
  }


  public void setIsInefficientMaterial(DiagnosisTaskAgentListV2DataTaskListIsInefficientMaterial isInefficientMaterial) {
    this.isInefficientMaterial = isInefficientMaterial;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner materialId(Long materialId) {
    
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


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner notAdHighQualityReason(List<String> notAdHighQualityReason) {
    
    this.notAdHighQualityReason = notAdHighQualityReason;
    return this;
  }

  public DiagnosisTaskAgentListV2ResponseDataTaskListInner addNotAdHighQualityReasonItem(String notAdHighQualityReasonItem) {
    if (this.notAdHighQualityReason == null) {
      this.notAdHighQualityReason = new ArrayList<>();
    }
    this.notAdHighQualityReason.add(notAdHighQualityReasonItem);
    return this;
  }

   /**
   * 
   * @return notAdHighQualityReason
  **/
  @javax.annotation.Nullable
  public List<String> getNotAdHighQualityReason() {
    return notAdHighQualityReason;
  }


  public void setNotAdHighQualityReason(List<String> notAdHighQualityReason) {
    this.notAdHighQualityReason = notAdHighQualityReason;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner notEcpHighQualityReason(List<String> notEcpHighQualityReason) {
    
    this.notEcpHighQualityReason = notEcpHighQualityReason;
    return this;
  }

  public DiagnosisTaskAgentListV2ResponseDataTaskListInner addNotEcpHighQualityReasonItem(String notEcpHighQualityReasonItem) {
    if (this.notEcpHighQualityReason == null) {
      this.notEcpHighQualityReason = new ArrayList<>();
    }
    this.notEcpHighQualityReason.add(notEcpHighQualityReasonItem);
    return this;
  }

   /**
   * 
   * @return notEcpHighQualityReason
  **/
  @javax.annotation.Nullable
  public List<String> getNotEcpHighQualityReason() {
    return notEcpHighQualityReason;
  }


  public void setNotEcpHighQualityReason(List<String> notEcpHighQualityReason) {
    this.notEcpHighQualityReason = notEcpHighQualityReason;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner status(DiagnosisTaskAgentListV2DataTaskListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentListV2DataTaskListStatus getStatus() {
    return status;
  }


  public void setStatus(DiagnosisTaskAgentListV2DataTaskListStatus status) {
    this.status = status;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public DiagnosisTaskAgentListV2ResponseDataTaskListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiagnosisTaskAgentListV2ResponseDataTaskListInner diagnosisTaskAgentListV2ResponseDataTaskListInner = (DiagnosisTaskAgentListV2ResponseDataTaskListInner) o;
    return Objects.equals(this.advertiserId, diagnosisTaskAgentListV2ResponseDataTaskListInner.advertiserId) &&
        Objects.equals(this.isAdHighQualityMaterial, diagnosisTaskAgentListV2ResponseDataTaskListInner.isAdHighQualityMaterial) &&
        Objects.equals(this.isEcpHighQualityMaterial, diagnosisTaskAgentListV2ResponseDataTaskListInner.isEcpHighQualityMaterial) &&
        Objects.equals(this.isFirstPublishMaterial, diagnosisTaskAgentListV2ResponseDataTaskListInner.isFirstPublishMaterial) &&
        Objects.equals(this.isInefficientMaterial, diagnosisTaskAgentListV2ResponseDataTaskListInner.isInefficientMaterial) &&
        Objects.equals(this.materialId, diagnosisTaskAgentListV2ResponseDataTaskListInner.materialId) &&
        Objects.equals(this.notAdHighQualityReason, diagnosisTaskAgentListV2ResponseDataTaskListInner.notAdHighQualityReason) &&
        Objects.equals(this.notEcpHighQualityReason, diagnosisTaskAgentListV2ResponseDataTaskListInner.notEcpHighQualityReason) &&
        Objects.equals(this.status, diagnosisTaskAgentListV2ResponseDataTaskListInner.status) &&
        Objects.equals(this.taskId, diagnosisTaskAgentListV2ResponseDataTaskListInner.taskId) &&
        Objects.equals(this.videoId, diagnosisTaskAgentListV2ResponseDataTaskListInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, isAdHighQualityMaterial, isEcpHighQualityMaterial, isFirstPublishMaterial, isInefficientMaterial, materialId, notAdHighQualityReason, notEcpHighQualityReason, status, taskId, videoId);
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
    sb.append("class DiagnosisTaskAgentListV2ResponseDataTaskListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    isAdHighQualityMaterial: ").append(toIndentedString(isAdHighQualityMaterial)).append("\n");
    sb.append("    isEcpHighQualityMaterial: ").append(toIndentedString(isEcpHighQualityMaterial)).append("\n");
    sb.append("    isFirstPublishMaterial: ").append(toIndentedString(isFirstPublishMaterial)).append("\n");
    sb.append("    isInefficientMaterial: ").append(toIndentedString(isInefficientMaterial)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    notAdHighQualityReason: ").append(toIndentedString(notAdHighQualityReason)).append("\n");
    sb.append("    notEcpHighQualityReason: ").append(toIndentedString(notEcpHighQualityReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("is_ad_high_quality_material");
    openapiFields.add("is_ecp_high_quality_material");
    openapiFields.add("is_first_publish_material");
    openapiFields.add("is_inefficient_material");
    openapiFields.add("material_id");
    openapiFields.add("not_ad_high_quality_reason");
    openapiFields.add("not_ecp_high_quality_reason");
    openapiFields.add("status");
    openapiFields.add("task_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("task_id");
    openapiRequiredFields.add("video_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiagnosisTaskAgentListV2ResponseDataTaskListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosisTaskAgentListV2ResponseDataTaskListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosisTaskAgentListV2ResponseDataTaskListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosisTaskAgentListV2ResponseDataTaskListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosisTaskAgentListV2ResponseDataTaskListInner>() {
           @Override
           public void write(JsonWriter out, DiagnosisTaskAgentListV2ResponseDataTaskListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosisTaskAgentListV2ResponseDataTaskListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosisTaskAgentListV2ResponseDataTaskListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosisTaskAgentListV2ResponseDataTaskListInner
  * @throws IOException if the JSON string is invalid with respect to DiagnosisTaskAgentListV2ResponseDataTaskListInner
  */
  public static DiagnosisTaskAgentListV2ResponseDataTaskListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosisTaskAgentListV2ResponseDataTaskListInner.class);
  }

 /**
  * Convert an instance of DiagnosisTaskAgentListV2ResponseDataTaskListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

