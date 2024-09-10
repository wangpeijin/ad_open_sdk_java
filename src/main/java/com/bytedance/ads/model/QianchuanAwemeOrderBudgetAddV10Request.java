/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * QianchuanAwemeOrderBudgetAddV10Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderBudgetAddV10Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_RENEWAL_BUDGET = "renewal_budget";
  @SerializedName(SERIALIZED_NAME_RENEWAL_BUDGET)
  private Long renewalBudget = null;

  public static final String SERIALIZED_NAME_RENEWAL_DELIVERY_SECONDS = "renewal_delivery_seconds";
  @SerializedName(SERIALIZED_NAME_RENEWAL_DELIVERY_SECONDS)
  private Double renewalDeliverySeconds = null;

  public QianchuanAwemeOrderBudgetAddV10Request() {
  }

  public QianchuanAwemeOrderBudgetAddV10Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanAwemeOrderBudgetAddV10Request orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 需要追加预算的订单id
   * @return orderId
  **/
  @javax.annotation.Nonnull
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public QianchuanAwemeOrderBudgetAddV10Request renewalBudget(Long renewalBudget) {
    
    this.renewalBudget = renewalBudget;
    return this;
  }

   /**
   * 追加的预算
   * @return renewalBudget
  **/
  @javax.annotation.Nonnull
  public Long getRenewalBudget() {
    return renewalBudget;
  }


  public void setRenewalBudget(Long renewalBudget) {
    this.renewalBudget = renewalBudget;
  }


  public QianchuanAwemeOrderBudgetAddV10Request renewalDeliverySeconds(Double renewalDeliverySeconds) {
    
    this.renewalDeliverySeconds = renewalDeliverySeconds;
    return this;
  }

   /**
   * 延长的投放时间 1. 短视频，0-7天（步进单位为1天） 2. 0-24小时（步进单位为0.5小时）
   * @return renewalDeliverySeconds
  **/
  @javax.annotation.Nonnull
  public Double getRenewalDeliverySeconds() {
    return renewalDeliverySeconds;
  }


  public void setRenewalDeliverySeconds(Double renewalDeliverySeconds) {
    this.renewalDeliverySeconds = renewalDeliverySeconds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderBudgetAddV10Request qianchuanAwemeOrderBudgetAddV10Request = (QianchuanAwemeOrderBudgetAddV10Request) o;
    return Objects.equals(this.advertiserId, qianchuanAwemeOrderBudgetAddV10Request.advertiserId) &&
        Objects.equals(this.orderId, qianchuanAwemeOrderBudgetAddV10Request.orderId) &&
        Objects.equals(this.renewalBudget, qianchuanAwemeOrderBudgetAddV10Request.renewalBudget) &&
        Objects.equals(this.renewalDeliverySeconds, qianchuanAwemeOrderBudgetAddV10Request.renewalDeliverySeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, orderId, renewalBudget, renewalDeliverySeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeOrderBudgetAddV10Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    renewalBudget: ").append(toIndentedString(renewalBudget)).append("\n");
    sb.append("    renewalDeliverySeconds: ").append(toIndentedString(renewalDeliverySeconds)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("renewal_budget");
    openapiFields.add("renewal_delivery_seconds");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("order_id");
    openapiRequiredFields.add("renewal_budget");
    openapiRequiredFields.add("renewal_delivery_seconds");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderBudgetAddV10Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderBudgetAddV10Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderBudgetAddV10Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderBudgetAddV10Request.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderBudgetAddV10Request>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderBudgetAddV10Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderBudgetAddV10Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderBudgetAddV10Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderBudgetAddV10Request
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderBudgetAddV10Request
  */
  public static QianchuanAwemeOrderBudgetAddV10Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderBudgetAddV10Request.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderBudgetAddV10Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

