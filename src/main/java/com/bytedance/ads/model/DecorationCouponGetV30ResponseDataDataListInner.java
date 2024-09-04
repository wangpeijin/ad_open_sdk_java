/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
 * DecorationCouponGetV30ResponseDataDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class DecorationCouponGetV30ResponseDataDataListInner {
  public static final String SERIALIZED_NAME_ACTIVITY_CREATE_TIME = "activity_create_time";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_CREATE_TIME)
  private String activityCreateTime = null;

  public static final String SERIALIZED_NAME_ACTIVITY_END_TIME = "activity_end_time";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_END_TIME)
  private String activityEndTime = null;

  public static final String SERIALIZED_NAME_ACTIVITY_ID = "activity_id";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_ID)
  private String activityId = null;

  public static final String SERIALIZED_NAME_ACTIVITY_NAME = "activity_name";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_NAME)
  private String activityName = null;

  public static final String SERIALIZED_NAME_ACTIVITY_START_TIME = "activity_start_time";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_START_TIME)
  private String activityStartTime = null;

  public static final String SERIALIZED_NAME_COUPON_END_TIME = "coupon_end_time";
  @SerializedName(SERIALIZED_NAME_COUPON_END_TIME)
  private String couponEndTime = null;

  public static final String SERIALIZED_NAME_COUPON_NAME = "coupon_name";
  @SerializedName(SERIALIZED_NAME_COUPON_NAME)
  private String couponName = null;

  public static final String SERIALIZED_NAME_COUPON_START_TIME = "coupon_start_time";
  @SerializedName(SERIALIZED_NAME_COUPON_START_TIME)
  private String couponStartTime = null;

  public DecorationCouponGetV30ResponseDataDataListInner() {
  }

  public DecorationCouponGetV30ResponseDataDataListInner activityCreateTime(String activityCreateTime) {
    
    this.activityCreateTime = activityCreateTime;
    return this;
  }

   /**
   * 
   * @return activityCreateTime
  **/
  @javax.annotation.Nullable
  public String getActivityCreateTime() {
    return activityCreateTime;
  }


  public void setActivityCreateTime(String activityCreateTime) {
    this.activityCreateTime = activityCreateTime;
  }


  public DecorationCouponGetV30ResponseDataDataListInner activityEndTime(String activityEndTime) {
    
    this.activityEndTime = activityEndTime;
    return this;
  }

   /**
   * 
   * @return activityEndTime
  **/
  @javax.annotation.Nullable
  public String getActivityEndTime() {
    return activityEndTime;
  }


  public void setActivityEndTime(String activityEndTime) {
    this.activityEndTime = activityEndTime;
  }


  public DecorationCouponGetV30ResponseDataDataListInner activityId(String activityId) {
    
    this.activityId = activityId;
    return this;
  }

   /**
   * 
   * @return activityId
  **/
  @javax.annotation.Nullable
  public String getActivityId() {
    return activityId;
  }


  public void setActivityId(String activityId) {
    this.activityId = activityId;
  }


  public DecorationCouponGetV30ResponseDataDataListInner activityName(String activityName) {
    
    this.activityName = activityName;
    return this;
  }

   /**
   * 
   * @return activityName
  **/
  @javax.annotation.Nullable
  public String getActivityName() {
    return activityName;
  }


  public void setActivityName(String activityName) {
    this.activityName = activityName;
  }


  public DecorationCouponGetV30ResponseDataDataListInner activityStartTime(String activityStartTime) {
    
    this.activityStartTime = activityStartTime;
    return this;
  }

   /**
   * 
   * @return activityStartTime
  **/
  @javax.annotation.Nullable
  public String getActivityStartTime() {
    return activityStartTime;
  }


  public void setActivityStartTime(String activityStartTime) {
    this.activityStartTime = activityStartTime;
  }


  public DecorationCouponGetV30ResponseDataDataListInner couponEndTime(String couponEndTime) {
    
    this.couponEndTime = couponEndTime;
    return this;
  }

   /**
   * 
   * @return couponEndTime
  **/
  @javax.annotation.Nullable
  public String getCouponEndTime() {
    return couponEndTime;
  }


  public void setCouponEndTime(String couponEndTime) {
    this.couponEndTime = couponEndTime;
  }


  public DecorationCouponGetV30ResponseDataDataListInner couponName(String couponName) {
    
    this.couponName = couponName;
    return this;
  }

   /**
   * 
   * @return couponName
  **/
  @javax.annotation.Nullable
  public String getCouponName() {
    return couponName;
  }


  public void setCouponName(String couponName) {
    this.couponName = couponName;
  }


  public DecorationCouponGetV30ResponseDataDataListInner couponStartTime(String couponStartTime) {
    
    this.couponStartTime = couponStartTime;
    return this;
  }

   /**
   * 
   * @return couponStartTime
  **/
  @javax.annotation.Nullable
  public String getCouponStartTime() {
    return couponStartTime;
  }


  public void setCouponStartTime(String couponStartTime) {
    this.couponStartTime = couponStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecorationCouponGetV30ResponseDataDataListInner decorationCouponGetV30ResponseDataDataListInner = (DecorationCouponGetV30ResponseDataDataListInner) o;
    return Objects.equals(this.activityCreateTime, decorationCouponGetV30ResponseDataDataListInner.activityCreateTime) &&
        Objects.equals(this.activityEndTime, decorationCouponGetV30ResponseDataDataListInner.activityEndTime) &&
        Objects.equals(this.activityId, decorationCouponGetV30ResponseDataDataListInner.activityId) &&
        Objects.equals(this.activityName, decorationCouponGetV30ResponseDataDataListInner.activityName) &&
        Objects.equals(this.activityStartTime, decorationCouponGetV30ResponseDataDataListInner.activityStartTime) &&
        Objects.equals(this.couponEndTime, decorationCouponGetV30ResponseDataDataListInner.couponEndTime) &&
        Objects.equals(this.couponName, decorationCouponGetV30ResponseDataDataListInner.couponName) &&
        Objects.equals(this.couponStartTime, decorationCouponGetV30ResponseDataDataListInner.couponStartTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCreateTime, activityEndTime, activityId, activityName, activityStartTime, couponEndTime, couponName, couponStartTime);
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
    sb.append("class DecorationCouponGetV30ResponseDataDataListInner {\n");
    sb.append("    activityCreateTime: ").append(toIndentedString(activityCreateTime)).append("\n");
    sb.append("    activityEndTime: ").append(toIndentedString(activityEndTime)).append("\n");
    sb.append("    activityId: ").append(toIndentedString(activityId)).append("\n");
    sb.append("    activityName: ").append(toIndentedString(activityName)).append("\n");
    sb.append("    activityStartTime: ").append(toIndentedString(activityStartTime)).append("\n");
    sb.append("    couponEndTime: ").append(toIndentedString(couponEndTime)).append("\n");
    sb.append("    couponName: ").append(toIndentedString(couponName)).append("\n");
    sb.append("    couponStartTime: ").append(toIndentedString(couponStartTime)).append("\n");
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
    openapiFields.add("activity_create_time");
    openapiFields.add("activity_end_time");
    openapiFields.add("activity_id");
    openapiFields.add("activity_name");
    openapiFields.add("activity_start_time");
    openapiFields.add("coupon_end_time");
    openapiFields.add("coupon_name");
    openapiFields.add("coupon_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DecorationCouponGetV30ResponseDataDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DecorationCouponGetV30ResponseDataDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DecorationCouponGetV30ResponseDataDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DecorationCouponGetV30ResponseDataDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<DecorationCouponGetV30ResponseDataDataListInner>() {
           @Override
           public void write(JsonWriter out, DecorationCouponGetV30ResponseDataDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DecorationCouponGetV30ResponseDataDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DecorationCouponGetV30ResponseDataDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DecorationCouponGetV30ResponseDataDataListInner
  * @throws IOException if the JSON string is invalid with respect to DecorationCouponGetV30ResponseDataDataListInner
  */
  public static DecorationCouponGetV30ResponseDataDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DecorationCouponGetV30ResponseDataDataListInner.class);
  }

 /**
  * Convert an instance of DecorationCouponGetV30ResponseDataDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

