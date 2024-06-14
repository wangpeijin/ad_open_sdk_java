/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaFeedQuotaInfo;
import com.bytedance.ads.model.QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo;
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
 * 通投广告在投计划限额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class QianchuanAdQuotaGetV10ResponseDataQuotaFeed {
  public static final String SERIALIZED_NAME_DELIVERY_INFO = "delivery_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo deliveryInfo = null;

  public static final String SERIALIZED_NAME_MONTH_COST = "month_cost";
  @SerializedName(SERIALIZED_NAME_MONTH_COST)
  private Double monthCost = null;

  public static final String SERIALIZED_NAME_QUOTA_GEAR = "quota_gear";
  @SerializedName(SERIALIZED_NAME_QUOTA_GEAR)
  private Long quotaGear = null;

  public static final String SERIALIZED_NAME_QUOTA_INFO = "quota_info";
  @SerializedName(SERIALIZED_NAME_QUOTA_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaFeedQuotaInfo quotaInfo = null;

  public static final String SERIALIZED_NAME_STAGE_INFO = "stage_info";
  @SerializedName(SERIALIZED_NAME_STAGE_INFO)
  private QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo stageInfo = null;

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed() {
  }

  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed deliveryInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo deliveryInfo) {
    
    this.deliveryInfo = deliveryInfo;
    return this;
  }

   /**
   * Get deliveryInfo
   * @return deliveryInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo getDeliveryInfo() {
    return deliveryInfo;
  }


  public void setDeliveryInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedDeliveryInfo deliveryInfo) {
    this.deliveryInfo = deliveryInfo;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed monthCost(Double monthCost) {
    
    this.monthCost = monthCost;
    return this;
  }

   /**
   * 当前最高月消耗
   * @return monthCost
  **/
  @javax.annotation.Nullable
  public Double getMonthCost() {
    return monthCost;
  }


  public void setMonthCost(Double monthCost) {
    this.monthCost = monthCost;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed quotaGear(Long quotaGear) {
    
    this.quotaGear = quotaGear;
    return this;
  }

   /**
   * 当前所在限额档位：1,2,3,4,5,6,7,8,9
   * @return quotaGear
  **/
  @javax.annotation.Nullable
  public Long getQuotaGear() {
    return quotaGear;
  }


  public void setQuotaGear(Long quotaGear) {
    this.quotaGear = quotaGear;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed quotaInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedQuotaInfo quotaInfo) {
    
    this.quotaInfo = quotaInfo;
    return this;
  }

   /**
   * Get quotaInfo
   * @return quotaInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedQuotaInfo getQuotaInfo() {
    return quotaInfo;
  }


  public void setQuotaInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedQuotaInfo quotaInfo) {
    this.quotaInfo = quotaInfo;
  }


  public QianchuanAdQuotaGetV10ResponseDataQuotaFeed stageInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo stageInfo) {
    
    this.stageInfo = stageInfo;
    return this;
  }

   /**
   * Get stageInfo
   * @return stageInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo getStageInfo() {
    return stageInfo;
  }


  public void setStageInfo(QianchuanAdQuotaGetV10ResponseDataQuotaFeedStageInfo stageInfo) {
    this.stageInfo = stageInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdQuotaGetV10ResponseDataQuotaFeed qianchuanAdQuotaGetV10ResponseDataQuotaFeed = (QianchuanAdQuotaGetV10ResponseDataQuotaFeed) o;
    return Objects.equals(this.deliveryInfo, qianchuanAdQuotaGetV10ResponseDataQuotaFeed.deliveryInfo) &&
        Objects.equals(this.monthCost, qianchuanAdQuotaGetV10ResponseDataQuotaFeed.monthCost) &&
        Objects.equals(this.quotaGear, qianchuanAdQuotaGetV10ResponseDataQuotaFeed.quotaGear) &&
        Objects.equals(this.quotaInfo, qianchuanAdQuotaGetV10ResponseDataQuotaFeed.quotaInfo) &&
        Objects.equals(this.stageInfo, qianchuanAdQuotaGetV10ResponseDataQuotaFeed.stageInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryInfo, monthCost, quotaGear, quotaInfo, stageInfo);
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
    sb.append("class QianchuanAdQuotaGetV10ResponseDataQuotaFeed {\n");
    sb.append("    deliveryInfo: ").append(toIndentedString(deliveryInfo)).append("\n");
    sb.append("    monthCost: ").append(toIndentedString(monthCost)).append("\n");
    sb.append("    quotaGear: ").append(toIndentedString(quotaGear)).append("\n");
    sb.append("    quotaInfo: ").append(toIndentedString(quotaInfo)).append("\n");
    sb.append("    stageInfo: ").append(toIndentedString(stageInfo)).append("\n");
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
    openapiFields.add("delivery_info");
    openapiFields.add("month_cost");
    openapiFields.add("quota_gear");
    openapiFields.add("quota_info");
    openapiFields.add("stage_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdQuotaGetV10ResponseDataQuotaFeed.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdQuotaGetV10ResponseDataQuotaFeed' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeed> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdQuotaGetV10ResponseDataQuotaFeed.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdQuotaGetV10ResponseDataQuotaFeed>() {
           @Override
           public void write(JsonWriter out, QianchuanAdQuotaGetV10ResponseDataQuotaFeed value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdQuotaGetV10ResponseDataQuotaFeed read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeed given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeed
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdQuotaGetV10ResponseDataQuotaFeed
  */
  public static QianchuanAdQuotaGetV10ResponseDataQuotaFeed fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdQuotaGetV10ResponseDataQuotaFeed.class);
  }

 /**
  * Convert an instance of QianchuanAdQuotaGetV10ResponseDataQuotaFeed to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

