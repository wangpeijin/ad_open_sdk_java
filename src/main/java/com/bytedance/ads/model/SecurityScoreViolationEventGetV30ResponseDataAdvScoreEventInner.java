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
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType;
import com.bytedance.ads.model.SecurityScoreViolationEventGetV30DataAdvScoreEventStatus;
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
 * SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId = null;

  public static final String SERIALIZED_NAME_ILLEGAL_TYPE = "illegal_type";
  @SerializedName(SERIALIZED_NAME_ILLEGAL_TYPE)
  private SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType illegalType = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private String materialId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_SCORE = "score";
  @SerializedName(SERIALIZED_NAME_SCORE)
  private Long score = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SecurityScoreViolationEventGetV30DataAdvScoreEventStatus status = null;

  public static final String SERIALIZED_NAME_VIOLATION_EVIDENCE_IMG = "violation_evidence_img";
  @SerializedName(SERIALIZED_NAME_VIOLATION_EVIDENCE_IMG)
  private String violationEvidenceImg = null;

  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner() {
  }

  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id（AD2.0为广告id）
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner eventId(Long eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * 违规单id
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }


  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner illegalType(SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType illegalType) {
    
    this.illegalType = illegalType;
    return this;
  }

   /**
   * Get illegalType
   * @return illegalType
  **/
  @javax.annotation.Nullable
  public SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType getIllegalType() {
    return illegalType;
  }


  public void setIllegalType(SecurityScoreViolationEventGetV30DataAdvScoreEventIllegalType illegalType) {
    this.illegalType = illegalType;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner materialId(String materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id
   * @return materialId
  **/
  @javax.annotation.Nullable
  public String getMaterialId() {
    return materialId;
  }


  public void setMaterialId(String materialId) {
    this.materialId = materialId;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 拒绝理由
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner score(Long score) {
    
    this.score = score;
    return this;
  }

   /**
   * 扣罚分值
   * @return score
  **/
  @javax.annotation.Nullable
  public Long getScore() {
    return score;
  }


  public void setScore(Long score) {
    this.score = score;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner status(SecurityScoreViolationEventGetV30DataAdvScoreEventStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public SecurityScoreViolationEventGetV30DataAdvScoreEventStatus getStatus() {
    return status;
  }


  public void setStatus(SecurityScoreViolationEventGetV30DataAdvScoreEventStatus status) {
    this.status = status;
  }


  public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner violationEvidenceImg(String violationEvidenceImg) {
    
    this.violationEvidenceImg = violationEvidenceImg;
    return this;
  }

   /**
   * 违规证据截图
   * @return violationEvidenceImg
  **/
  @javax.annotation.Nullable
  public String getViolationEvidenceImg() {
    return violationEvidenceImg;
  }


  public void setViolationEvidenceImg(String violationEvidenceImg) {
    this.violationEvidenceImg = violationEvidenceImg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner = (SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner) o;
    return Objects.equals(this.adId, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.adId) &&
        Objects.equals(this.advertiserId, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.advertiserId) &&
        Objects.equals(this.createTime, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.createTime) &&
        Objects.equals(this.eventId, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.eventId) &&
        Objects.equals(this.illegalType, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.illegalType) &&
        Objects.equals(this.materialId, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.materialId) &&
        Objects.equals(this.rejectReason, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.rejectReason) &&
        Objects.equals(this.score, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.score) &&
        Objects.equals(this.status, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.status) &&
        Objects.equals(this.violationEvidenceImg, securityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.violationEvidenceImg);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, createTime, eventId, illegalType, materialId, rejectReason, score, status, violationEvidenceImg);
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
    sb.append("class SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    illegalType: ").append(toIndentedString(illegalType)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    violationEvidenceImg: ").append(toIndentedString(violationEvidenceImg)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("create_time");
    openapiFields.add("event_id");
    openapiFields.add("illegal_type");
    openapiFields.add("material_id");
    openapiFields.add("reject_reason");
    openapiFields.add("score");
    openapiFields.add("status");
    openapiFields.add("violation_evidence_img");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner>() {
           @Override
           public void write(JsonWriter out, SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner
  * @throws IOException if the JSON string is invalid with respect to SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner
  */
  public static SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner.class);
  }

 /**
  * Convert an instance of SecurityScoreViolationEventGetV30ResponseDataAdvScoreEventInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

