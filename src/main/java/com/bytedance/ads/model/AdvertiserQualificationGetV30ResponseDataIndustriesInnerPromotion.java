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
import com.bytedance.ads.model.AdvertiserQualificationGetV30DataIndustriesPromotionStatus;
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
 * 推广资质，相关字段见下 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content = null;

  public static final String SERIALIZED_NAME_QUALIFICATION_ID = "qualification_id";
  @SerializedName(SERIALIZED_NAME_QUALIFICATION_ID)
  private Long qualificationId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdvertiserQualificationGetV30DataIndustriesPromotionStatus status = null;

  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion() {
  }

  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 推广内容
   * @return content
  **/
  @javax.annotation.Nullable
  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion qualificationId(Long qualificationId) {
    
    this.qualificationId = qualificationId;
    return this;
  }

   /**
   * 资质id 
   * @return qualificationId
  **/
  @javax.annotation.Nullable
  public Long getQualificationId() {
    return qualificationId;
  }


  public void setQualificationId(Long qualificationId) {
    this.qualificationId = qualificationId;
  }


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion rejectReason(String rejectReason) {
    
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


  public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion status(AdvertiserQualificationGetV30DataIndustriesPromotionStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdvertiserQualificationGetV30DataIndustriesPromotionStatus getStatus() {
    return status;
  }


  public void setStatus(AdvertiserQualificationGetV30DataIndustriesPromotionStatus status) {
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
    AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion advertiserQualificationGetV30ResponseDataIndustriesInnerPromotion = (AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion) o;
    return Objects.equals(this.content, advertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.content) &&
        Objects.equals(this.qualificationId, advertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.qualificationId) &&
        Objects.equals(this.rejectReason, advertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.rejectReason) &&
        Objects.equals(this.status, advertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, qualificationId, rejectReason, status);
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
    sb.append("class AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    qualificationId: ").append(toIndentedString(qualificationId)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("qualification_id");
    openapiFields.add("reject_reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion>() {
           @Override
           public void write(JsonWriter out, AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion
  * @throws IOException if the JSON string is invalid with respect to AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion
  */
  public static AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion.class);
  }

 /**
  * Convert an instance of AdvertiserQualificationGetV30ResponseDataIndustriesInnerPromotion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

