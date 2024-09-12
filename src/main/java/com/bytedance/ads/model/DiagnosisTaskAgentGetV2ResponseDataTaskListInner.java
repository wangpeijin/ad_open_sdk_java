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
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2DataTaskListIsAdHighQualityMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2DataTaskListIsFirstPublishMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial;
import com.bytedance.ads.model.DiagnosisTaskAgentGetV2DataTaskListStatus;
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
 * DiagnosisTaskAgentGetV2ResponseDataTaskListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class DiagnosisTaskAgentGetV2ResponseDataTaskListInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL = "is_ad_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_AD_HIGH_QUALITY_MATERIAL)
  private DiagnosisTaskAgentGetV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL = "is_ecp_high_quality_material";
  @SerializedName(SERIALIZED_NAME_IS_ECP_HIGH_QUALITY_MATERIAL)
  private DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial = null;

  public static final String SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL = "is_first_publish_material";
  @SerializedName(SERIALIZED_NAME_IS_FIRST_PUBLISH_MATERIAL)
  private DiagnosisTaskAgentGetV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial = null;

  public static final String SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL = "is_inefficient_material";
  @SerializedName(SERIALIZED_NAME_IS_INEFFICIENT_MATERIAL)
  private DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial isInefficientMaterial = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private DiagnosisTaskAgentGetV2DataTaskListStatus status = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner() {
  }

  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner advertiserId(Long advertiserId) {
    
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


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner isAdHighQualityMaterial(DiagnosisTaskAgentGetV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial) {
    
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
    return this;
  }

   /**
   * Get isAdHighQualityMaterial
   * @return isAdHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentGetV2DataTaskListIsAdHighQualityMaterial getIsAdHighQualityMaterial() {
    return isAdHighQualityMaterial;
  }


  public void setIsAdHighQualityMaterial(DiagnosisTaskAgentGetV2DataTaskListIsAdHighQualityMaterial isAdHighQualityMaterial) {
    this.isAdHighQualityMaterial = isAdHighQualityMaterial;
  }


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner isEcpHighQualityMaterial(DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial) {
    
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
    return this;
  }

   /**
   * Get isEcpHighQualityMaterial
   * @return isEcpHighQualityMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial getIsEcpHighQualityMaterial() {
    return isEcpHighQualityMaterial;
  }


  public void setIsEcpHighQualityMaterial(DiagnosisTaskAgentGetV2DataTaskListIsEcpHighQualityMaterial isEcpHighQualityMaterial) {
    this.isEcpHighQualityMaterial = isEcpHighQualityMaterial;
  }


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner isFirstPublishMaterial(DiagnosisTaskAgentGetV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial) {
    
    this.isFirstPublishMaterial = isFirstPublishMaterial;
    return this;
  }

   /**
   * Get isFirstPublishMaterial
   * @return isFirstPublishMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentGetV2DataTaskListIsFirstPublishMaterial getIsFirstPublishMaterial() {
    return isFirstPublishMaterial;
  }


  public void setIsFirstPublishMaterial(DiagnosisTaskAgentGetV2DataTaskListIsFirstPublishMaterial isFirstPublishMaterial) {
    this.isFirstPublishMaterial = isFirstPublishMaterial;
  }


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner isInefficientMaterial(DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial isInefficientMaterial) {
    
    this.isInefficientMaterial = isInefficientMaterial;
    return this;
  }

   /**
   * Get isInefficientMaterial
   * @return isInefficientMaterial
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial getIsInefficientMaterial() {
    return isInefficientMaterial;
  }


  public void setIsInefficientMaterial(DiagnosisTaskAgentGetV2DataTaskListIsInefficientMaterial isInefficientMaterial) {
    this.isInefficientMaterial = isInefficientMaterial;
  }


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner materialId(Long materialId) {
    
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


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner status(DiagnosisTaskAgentGetV2DataTaskListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public DiagnosisTaskAgentGetV2DataTaskListStatus getStatus() {
    return status;
  }


  public void setStatus(DiagnosisTaskAgentGetV2DataTaskListStatus status) {
    this.status = status;
  }


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner taskId(Long taskId) {
    
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


  public DiagnosisTaskAgentGetV2ResponseDataTaskListInner videoId(String videoId) {
    
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
    DiagnosisTaskAgentGetV2ResponseDataTaskListInner diagnosisTaskAgentGetV2ResponseDataTaskListInner = (DiagnosisTaskAgentGetV2ResponseDataTaskListInner) o;
    return Objects.equals(this.advertiserId, diagnosisTaskAgentGetV2ResponseDataTaskListInner.advertiserId) &&
        Objects.equals(this.isAdHighQualityMaterial, diagnosisTaskAgentGetV2ResponseDataTaskListInner.isAdHighQualityMaterial) &&
        Objects.equals(this.isEcpHighQualityMaterial, diagnosisTaskAgentGetV2ResponseDataTaskListInner.isEcpHighQualityMaterial) &&
        Objects.equals(this.isFirstPublishMaterial, diagnosisTaskAgentGetV2ResponseDataTaskListInner.isFirstPublishMaterial) &&
        Objects.equals(this.isInefficientMaterial, diagnosisTaskAgentGetV2ResponseDataTaskListInner.isInefficientMaterial) &&
        Objects.equals(this.materialId, diagnosisTaskAgentGetV2ResponseDataTaskListInner.materialId) &&
        Objects.equals(this.status, diagnosisTaskAgentGetV2ResponseDataTaskListInner.status) &&
        Objects.equals(this.taskId, diagnosisTaskAgentGetV2ResponseDataTaskListInner.taskId) &&
        Objects.equals(this.videoId, diagnosisTaskAgentGetV2ResponseDataTaskListInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, isAdHighQualityMaterial, isEcpHighQualityMaterial, isFirstPublishMaterial, isInefficientMaterial, materialId, status, taskId, videoId);
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
    sb.append("class DiagnosisTaskAgentGetV2ResponseDataTaskListInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    isAdHighQualityMaterial: ").append(toIndentedString(isAdHighQualityMaterial)).append("\n");
    sb.append("    isEcpHighQualityMaterial: ").append(toIndentedString(isEcpHighQualityMaterial)).append("\n");
    sb.append("    isFirstPublishMaterial: ").append(toIndentedString(isFirstPublishMaterial)).append("\n");
    sb.append("    isInefficientMaterial: ").append(toIndentedString(isInefficientMaterial)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
       if (!DiagnosisTaskAgentGetV2ResponseDataTaskListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiagnosisTaskAgentGetV2ResponseDataTaskListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiagnosisTaskAgentGetV2ResponseDataTaskListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiagnosisTaskAgentGetV2ResponseDataTaskListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DiagnosisTaskAgentGetV2ResponseDataTaskListInner>() {
           @Override
           public void write(JsonWriter out, DiagnosisTaskAgentGetV2ResponseDataTaskListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiagnosisTaskAgentGetV2ResponseDataTaskListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiagnosisTaskAgentGetV2ResponseDataTaskListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiagnosisTaskAgentGetV2ResponseDataTaskListInner
  * @throws IOException if the JSON string is invalid with respect to DiagnosisTaskAgentGetV2ResponseDataTaskListInner
  */
  public static DiagnosisTaskAgentGetV2ResponseDataTaskListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiagnosisTaskAgentGetV2ResponseDataTaskListInner.class);
  }

 /**
  * Convert an instance of DiagnosisTaskAgentGetV2ResponseDataTaskListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

