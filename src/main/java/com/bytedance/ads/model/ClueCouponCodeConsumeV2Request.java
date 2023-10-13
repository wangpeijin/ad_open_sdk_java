/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ClueCouponCodeConsumeV2RequestEmployee;
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
 * ClueCouponCodeConsumeV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ClueCouponCodeConsumeV2Request {
  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private Long activityId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_CODE_ID = "code_id";
  @SerializedName(SERIALIZED_NAME_CODE_ID)
  private String codeId = null;

  public static final String SERIALIZED_NAME_COUPON_ID = "coupon_id";
  @SerializedName(SERIALIZED_NAME_COUPON_ID)
  private Long couponId = null;

  public static final String SERIALIZED_NAME_EMPLOYEE = "employee";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE)
  private ClueCouponCodeConsumeV2RequestEmployee employee = null;

  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Object extra = null;

  public static final String SERIALIZED_NAME_RESOURCE_ID = "resource_id";
  @SerializedName(SERIALIZED_NAME_RESOURCE_ID)
  private Long resourceId = null;

  public ClueCouponCodeConsumeV2Request() {
  }

  public ClueCouponCodeConsumeV2Request activityId(Long activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return activityId
  **/
  @javax.annotation.Nullable
  public Long getActivityId() {
    return activityId;
  }


  public void setActivityId(Long activityId) {
    this.activityId = activityId;
  }


  public ClueCouponCodeConsumeV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ClueCouponCodeConsumeV2Request code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 
   * @return code
  **/
  @javax.annotation.Nullable
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ClueCouponCodeConsumeV2Request codeId(String codeId) {
    
    this.codeId = codeId;
    return this;
  }

   /**
   * 
   * @return codeId
  **/
  @javax.annotation.Nullable
  public String getCodeId() {
    return codeId;
  }


  public void setCodeId(String codeId) {
    this.codeId = codeId;
  }


  public ClueCouponCodeConsumeV2Request couponId(Long couponId) {
    
    this.couponId = couponId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return couponId
  **/
  @javax.annotation.Nullable
  public Long getCouponId() {
    return couponId;
  }


  public void setCouponId(Long couponId) {
    this.couponId = couponId;
  }


  public ClueCouponCodeConsumeV2Request employee(ClueCouponCodeConsumeV2RequestEmployee employee) {
    
    this.employee = employee;
    return this;
  }

   /**
   * Get employee
   * @return employee
  **/
  @javax.annotation.Nonnull
  public ClueCouponCodeConsumeV2RequestEmployee getEmployee() {
    return employee;
  }


  public void setEmployee(ClueCouponCodeConsumeV2RequestEmployee employee) {
    this.employee = employee;
  }


  public ClueCouponCodeConsumeV2Request extra(Object extra) {
    
    this.extra = extra;
    return this;
  }

   /**
   * 
   * @return extra
  **/
  @javax.annotation.Nullable
  public Object getExtra() {
    return extra;
  }


  public void setExtra(Object extra) {
    this.extra = extra;
  }


  public ClueCouponCodeConsumeV2Request resourceId(Long resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * 
   * minimum: 0
   * maximum: 9223372036854775807
   * @return resourceId
  **/
  @javax.annotation.Nullable
  public Long getResourceId() {
    return resourceId;
  }


  public void setResourceId(Long resourceId) {
    this.resourceId = resourceId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClueCouponCodeConsumeV2Request clueCouponCodeConsumeV2Request = (ClueCouponCodeConsumeV2Request) o;
    return Objects.equals(this.activityId, clueCouponCodeConsumeV2Request.activityId) &&
        Objects.equals(this.advertiserId, clueCouponCodeConsumeV2Request.advertiserId) &&
        Objects.equals(this.code, clueCouponCodeConsumeV2Request.code) &&
        Objects.equals(this.codeId, clueCouponCodeConsumeV2Request.codeId) &&
        Objects.equals(this.couponId, clueCouponCodeConsumeV2Request.couponId) &&
        Objects.equals(this.employee, clueCouponCodeConsumeV2Request.employee) &&
        Objects.equals(this.extra, clueCouponCodeConsumeV2Request.extra) &&
        Objects.equals(this.resourceId, clueCouponCodeConsumeV2Request.resourceId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityId, advertiserId, code, codeId, couponId, employee, extra, resourceId);
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
    sb.append("class ClueCouponCodeConsumeV2Request {\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    codeId: ").append(toIndentedString(codeId)).append("\n");
    sb.append("    couponId: ").append(toIndentedString(couponId)).append("\n");
    sb.append("    employee: ").append(toIndentedString(employee)).append("\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
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
    openapiFields.add("activity_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("code");
    openapiFields.add("code_id");
    openapiFields.add("coupon_id");
    openapiFields.add("employee");
    openapiFields.add("extra");
    openapiFields.add("resource_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("employee");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClueCouponCodeConsumeV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClueCouponCodeConsumeV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClueCouponCodeConsumeV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClueCouponCodeConsumeV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ClueCouponCodeConsumeV2Request>() {
           @Override
           public void write(JsonWriter out, ClueCouponCodeConsumeV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClueCouponCodeConsumeV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ClueCouponCodeConsumeV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ClueCouponCodeConsumeV2Request
  * @throws IOException if the JSON string is invalid with respect to ClueCouponCodeConsumeV2Request
  */
  public static ClueCouponCodeConsumeV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClueCouponCodeConsumeV2Request.class);
  }

 /**
  * Convert an instance of ClueCouponCodeConsumeV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

