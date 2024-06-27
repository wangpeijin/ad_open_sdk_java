/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
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
 * AdvConvertOleConvertV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class AdvConvertOleConvertV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_DATE_END_TIME = "date_end_time";
  @SerializedName(SERIALIZED_NAME_DATE_END_TIME)
  private String dateEndTime = null;

  public static final String SERIALIZED_NAME_DATE_START_TIME = "date_start_time";
  @SerializedName(SERIALIZED_NAME_DATE_START_TIME)
  private String dateStartTime = null;

  public static final String SERIALIZED_NAME_ORDER_END_TIME = "order_end_time";
  @SerializedName(SERIALIZED_NAME_ORDER_END_TIME)
  private String orderEndTime = null;

  public static final String SERIALIZED_NAME_ORDER_START_TIME = "order_start_time";
  @SerializedName(SERIALIZED_NAME_ORDER_START_TIME)
  private String orderStartTime = null;

  public AdvConvertOleConvertV2Request() {
  }

  public AdvConvertOleConvertV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * adv_id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvConvertOleConvertV2Request dateEndTime(String dateEndTime) {
    
    this.dateEndTime = dateEndTime;
    return this;
  }

   /**
   * 订单所在自然日范围 结束时间，格式 yyyy-MM-dd。假设获取8.16数据，则填写2023-08-16。获取8.16-8.17数据，则填写2023-08-17。
   * @return dateEndTime
  **/
  @javax.annotation.Nonnull
  public String getDateEndTime() {
    return dateEndTime;
  }


  public void setDateEndTime(String dateEndTime) {
    this.dateEndTime = dateEndTime;
  }


  public AdvConvertOleConvertV2Request dateStartTime(String dateStartTime) {
    
    this.dateStartTime = dateStartTime;
    return this;
  }

   /**
   * 订单所在自然日范围 开始时间，格式 yyyy-MM-dd。假设获取8.16数据，则填写2023-08-16。获取8.16-8.17数据，则填写2023-08-16。
   * @return dateStartTime
  **/
  @javax.annotation.Nonnull
  public String getDateStartTime() {
    return dateStartTime;
  }


  public void setDateStartTime(String dateStartTime) {
    this.dateStartTime = dateStartTime;
  }


  public AdvConvertOleConvertV2Request orderEndTime(String orderEndTime) {
    
    this.orderEndTime = orderEndTime;
    return this;
  }

   /**
   * 下单时间范围 结束时间，可精确到分钟。格式 yyyy-MM-dd HH:mm:ss，示例 2023-08-16 13:00:00
   * @return orderEndTime
  **/
  @javax.annotation.Nonnull
  public String getOrderEndTime() {
    return orderEndTime;
  }


  public void setOrderEndTime(String orderEndTime) {
    this.orderEndTime = orderEndTime;
  }


  public AdvConvertOleConvertV2Request orderStartTime(String orderStartTime) {
    
    this.orderStartTime = orderStartTime;
    return this;
  }

   /**
   * 下单时间范围 开始时间，可精确到分钟。格式 yyyy-MM-dd HH:mm:ss，示例 2023-08-16 12:00:00
   * @return orderStartTime
  **/
  @javax.annotation.Nonnull
  public String getOrderStartTime() {
    return orderStartTime;
  }


  public void setOrderStartTime(String orderStartTime) {
    this.orderStartTime = orderStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvConvertOleConvertV2Request advConvertOleConvertV2Request = (AdvConvertOleConvertV2Request) o;
    return Objects.equals(this.advertiserId, advConvertOleConvertV2Request.advertiserId) &&
        Objects.equals(this.dateEndTime, advConvertOleConvertV2Request.dateEndTime) &&
        Objects.equals(this.dateStartTime, advConvertOleConvertV2Request.dateStartTime) &&
        Objects.equals(this.orderEndTime, advConvertOleConvertV2Request.orderEndTime) &&
        Objects.equals(this.orderStartTime, advConvertOleConvertV2Request.orderStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, dateEndTime, dateStartTime, orderEndTime, orderStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvConvertOleConvertV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    dateEndTime: ").append(toIndentedString(dateEndTime)).append("\n");
    sb.append("    dateStartTime: ").append(toIndentedString(dateStartTime)).append("\n");
    sb.append("    orderEndTime: ").append(toIndentedString(orderEndTime)).append("\n");
    sb.append("    orderStartTime: ").append(toIndentedString(orderStartTime)).append("\n");
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
    openapiFields.add("date_end_time");
    openapiFields.add("date_start_time");
    openapiFields.add("order_end_time");
    openapiFields.add("order_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("date_end_time");
    openapiRequiredFields.add("date_start_time");
    openapiRequiredFields.add("order_end_time");
    openapiRequiredFields.add("order_start_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvConvertOleConvertV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvConvertOleConvertV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvConvertOleConvertV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvConvertOleConvertV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvConvertOleConvertV2Request>() {
           @Override
           public void write(JsonWriter out, AdvConvertOleConvertV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvConvertOleConvertV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvConvertOleConvertV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvConvertOleConvertV2Request
  * @throws IOException if the JSON string is invalid with respect to AdvConvertOleConvertV2Request
  */
  public static AdvConvertOleConvertV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvConvertOleConvertV2Request.class);
  }

 /**
  * Convert an instance of AdvConvertOleConvertV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

