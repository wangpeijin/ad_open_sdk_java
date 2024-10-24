/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class AnalyticsAttributionV30RequestContextAd {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_ATTRIBUTED = "attributed";
  @SerializedName(SERIALIZED_NAME_ATTRIBUTED)
  private Boolean attributed = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CLICK_TIME = "click_time";
  @SerializedName(SERIALIZED_NAME_CLICK_TIME)
  private Long clickTime = null;

  public static final String SERIALIZED_NAME_CUSTOMER_IDS = "customer_ids";
  @SerializedName(SERIALIZED_NAME_CUSTOMER_IDS)
  private List<Long> customerIds = null;

  public AnalyticsAttributionV30RequestContextAd() {
  }

  public AnalyticsAttributionV30RequestContextAd adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划id；若您可以确定当前订单来自对应广告计划id，则可以上报此字段获得更加精准的归因结果
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public AnalyticsAttributionV30RequestContextAd advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AnalyticsAttributionV30RequestContextAd addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 广告账户id；同上，若您可以确定当前订单来自对应广告账户id，则可以上报此字段获得更加精准的归因结果
   * @return advertiserIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AnalyticsAttributionV30RequestContextAd attributed(Boolean attributed) {
    
    this.attributed = attributed;
    return this;
  }

   /**
   * false: 客户未归因，上报为需要巨量引擎归因的事件
   * @return attributed
  **/
  @javax.annotation.Nullable
  public Boolean getAttributed() {
    return attributed;
  }


  public void setAttributed(Boolean attributed) {
    this.attributed = attributed;
  }


  public AnalyticsAttributionV30RequestContextAd campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 广告组id；同上，若您可以确定当前订单来自对应广告组id，则可以上报此字段获得更加精准的归因结果
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public AnalyticsAttributionV30RequestContextAd clickTime(Long clickTime) {
    
    this.clickTime = clickTime;
    return this;
  }

   /**
   * 点击时间，指用户点击页面跳转时间，上报秒级时间戳
   * @return clickTime
  **/
  @javax.annotation.Nullable
  public Long getClickTime() {
    return clickTime;
  }


  public void setClickTime(Long clickTime) {
    this.clickTime = clickTime;
  }


  public AnalyticsAttributionV30RequestContextAd customerIds(List<Long> customerIds) {
    
    this.customerIds = customerIds;
    return this;
  }

  public AnalyticsAttributionV30RequestContextAd addCustomerIdsItem(Long customerIdsItem) {
    if (this.customerIds == null) {
      this.customerIds = new ArrayList<>();
    }
    this.customerIds.add(customerIdsItem);
    return this;
  }

   /**
   * 客户id；若您可以确定当前订单来自对应客户id，则可以上报此字段获得更加精准的归因结果
   * @return customerIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCustomerIds() {
    return customerIds;
  }


  public void setCustomerIds(List<Long> customerIds) {
    this.customerIds = customerIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsAttributionV30RequestContextAd analyticsAttributionV30RequestContextAd = (AnalyticsAttributionV30RequestContextAd) o;
    return Objects.equals(this.adId, analyticsAttributionV30RequestContextAd.adId) &&
        Objects.equals(this.advertiserIds, analyticsAttributionV30RequestContextAd.advertiserIds) &&
        Objects.equals(this.attributed, analyticsAttributionV30RequestContextAd.attributed) &&
        Objects.equals(this.campaignId, analyticsAttributionV30RequestContextAd.campaignId) &&
        Objects.equals(this.clickTime, analyticsAttributionV30RequestContextAd.clickTime) &&
        Objects.equals(this.customerIds, analyticsAttributionV30RequestContextAd.customerIds);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserIds, attributed, campaignId, clickTime, customerIds);
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
    sb.append("class AnalyticsAttributionV30RequestContextAd {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    attributed: ").append(toIndentedString(attributed)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    clickTime: ").append(toIndentedString(clickTime)).append("\n");
    sb.append("    customerIds: ").append(toIndentedString(customerIds)).append("\n");
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
    openapiFields.add("advertiser_ids");
    openapiFields.add("attributed");
    openapiFields.add("campaign_id");
    openapiFields.add("click_time");
    openapiFields.add("customer_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnalyticsAttributionV30RequestContextAd.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnalyticsAttributionV30RequestContextAd' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnalyticsAttributionV30RequestContextAd> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnalyticsAttributionV30RequestContextAd.class));

       return (TypeAdapter<T>) new TypeAdapter<AnalyticsAttributionV30RequestContextAd>() {
           @Override
           public void write(JsonWriter out, AnalyticsAttributionV30RequestContextAd value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnalyticsAttributionV30RequestContextAd read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnalyticsAttributionV30RequestContextAd given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnalyticsAttributionV30RequestContextAd
  * @throws IOException if the JSON string is invalid with respect to AnalyticsAttributionV30RequestContextAd
  */
  public static AnalyticsAttributionV30RequestContextAd fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnalyticsAttributionV30RequestContextAd.class);
  }

 /**
  * Convert an instance of AnalyticsAttributionV30RequestContextAd to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

