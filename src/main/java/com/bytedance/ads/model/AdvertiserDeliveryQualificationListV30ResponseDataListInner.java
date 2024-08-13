/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30DataListQualificationType;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30DataListStatus;
import com.bytedance.ads.model.AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner;
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
 * AdvertiserDeliveryQualificationListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class AdvertiserDeliveryQualificationListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUDIT_TIME = "audit_time";
  @SerializedName(SERIALIZED_NAME_AUDIT_TIME)
  private String auditTime = null;

  public static final String SERIALIZED_NAME_IMAGES = "images";
  @SerializedName(SERIALIZED_NAME_IMAGES)
  private List<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner> images = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_TYPE = "qualification_type";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_TYPE)
  private AdvertiserDeliveryQualificationListV30DataListQualificationType qualificationType = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserDeliveryQualificationListV30DataListStatus status = null;

  public AdvertiserDeliveryQualificationListV30ResponseDataListInner() {
  }

  public AdvertiserDeliveryQualificationListV30ResponseDataListInner auditTime(String auditTime) {
    
    this.auditTime = auditTime;
    return this;
  }

   /**
   * 
   * @return auditTime
  **/
  @javax.annotation.Nullable
  public String getAuditTime() {
    return auditTime;
  }


  public void setAuditTime(String auditTime) {
    this.auditTime = auditTime;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInner images(List<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner> images) {
    
    this.images = images;
    return this;
  }

  public AdvertiserDeliveryQualificationListV30ResponseDataListInner addImagesItem(AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner imagesItem) {
    if (this.images == null) {
      this.images = new ArrayList<>();
    }
    this.images.add(imagesItem);
    return this;
  }

   /**
   * 
   * @return images
  **/
  @javax.annotation.Nullable
  public List<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner> getImages() {
    return images;
  }


  public void setImages(List<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner> images) {
    this.images = images;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInner qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInner qualificationType(AdvertiserDeliveryQualificationListV30DataListQualificationType qualificationType) {
    
    this.qualificationType = qualificationType;
    return this;
  }

   /**
   * Get qualificationType
   * @return qualificationType
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryQualificationListV30DataListQualificationType getQualificationType() {
    return qualificationType;
  }


  public void setQualificationType(AdvertiserDeliveryQualificationListV30DataListQualificationType qualificationType) {
    this.qualificationType = qualificationType;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInner status(AdvertiserDeliveryQualificationListV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserDeliveryQualificationListV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserDeliveryQualificationListV30DataListStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryQualificationListV30ResponseDataListInner advertiserDeliveryQualificationListV30ResponseDataListInner = (AdvertiserDeliveryQualificationListV30ResponseDataListInner) o;
    return Objects.equals(this.auditTime, advertiserDeliveryQualificationListV30ResponseDataListInner.auditTime) &&
        Objects.equals(this.images, advertiserDeliveryQualificationListV30ResponseDataListInner.images) &&
        Objects.equals(this.qualificationId, advertiserDeliveryQualificationListV30ResponseDataListInner.qualificationId) &&
        Objects.equals(this.qualificationType, advertiserDeliveryQualificationListV30ResponseDataListInner.qualificationType) &&
        Objects.equals(this.rejectReason, advertiserDeliveryQualificationListV30ResponseDataListInner.rejectReason) &&
        Objects.equals(this.status, advertiserDeliveryQualificationListV30ResponseDataListInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditTime, images, qualificationId, qualificationType, rejectReason, status);
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
    sb.append("class AdvertiserDeliveryQualificationListV30ResponseDataListInner {\n");
    sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
    sb.append("    images: ").append(toIndentedString(images)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
    sb.append("    qualificationType: ").append(toIndentedString(qualificationType)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("audit_time");
    openapiFields.add("images");
    openapiFields.add("qualification_id");
    openapiFields.add("qualification_type");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audit_time");
    openapiRequiredFields.add("qualification_id");
    openapiRequiredFields.add("qualification_type");
    openapiRequiredFields.add("reject_reason");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryQualificationListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryQualificationListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryQualificationListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryQualificationListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryQualificationListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryQualificationListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryQualificationListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryQualificationListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryQualificationListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryQualificationListV30ResponseDataListInner
  */
  public static AdvertiserDeliveryQualificationListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryQualificationListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryQualificationListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

