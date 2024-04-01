/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus;
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
 * QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_RAISE_DURATION = "raise_duration";
  @SerializedName(SERIALIZED_NAME_RAISE_DURATION)
  private Double raiseDuration = null;

  public static final String SERIALIZED_NAME_RAISE_TIME = "raise_time";
  @SerializedName(SERIALIZED_NAME_RAISE_TIME)
  private String raiseTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus status = null;

  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner() {
  }

  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划ID。
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算。
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner raiseDuration(Double raiseDuration) {
    
    this.raiseDuration = raiseDuration;
    return this;
  }

   /**
   * 起量时长。
   * @return raiseDuration
  **/
  @javax.annotation.Nullable
  public Double getRaiseDuration() {
    return raiseDuration;
  }


  public void setRaiseDuration(Double raiseDuration) {
    this.raiseDuration = raiseDuration;
  }


  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner raiseTime(String raiseTime) {
    
    this.raiseTime = raiseTime;
    return this;
  }

   /**
   * 起量时间。
   * @return raiseTime
  **/
  @javax.annotation.Nullable
  public String getRaiseTime() {
    return raiseTime;
  }


  public void setRaiseTime(String raiseTime) {
    this.raiseTime = raiseTime;
  }


  public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner status(QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanToolsSmartBoostAdBoostStatusGetV10DataRaiseDetailsStatus status) {
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
    QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner = (QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner) o;
    return Objects.equals(this.adId, qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.adId) &&
        Objects.equals(this.budget, qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.budget) &&
        Objects.equals(this.raiseDuration, qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.raiseDuration) &&
        Objects.equals(this.raiseTime, qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.raiseTime) &&
        Objects.equals(this.status, qianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, budget, raiseDuration, raiseTime, status);
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
    sb.append("class QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    raiseDuration: ").append(toIndentedString(raiseDuration)).append("\n");
    sb.append("    raiseTime: ").append(toIndentedString(raiseTime)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("budget");
    openapiFields.add("raise_duration");
    openapiFields.add("raise_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner
  */
  public static QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostStatusGetV10ResponseDataRaiseDetailsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

