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
import com.bytedance.ads.model.ReportRtaGetV2ResponseDataListInnerMetrics;
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
 * ReportRtaGetV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class ReportRtaGetV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_IS_RTA_BID = "is_rta_bid";
  @SerializedName(SERIALIZED_NAME_IS_RTA_BID)
  private Long isRtaBid = null;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private ReportRtaGetV2ResponseDataListInnerMetrics metrics = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform = null;

  public static final String SERIALIZED_NAME_STAT_TIME_DAY = "stat_time_day";
  @SerializedName(SERIALIZED_NAME_STAT_TIME_DAY)
  private String statTimeDay = null;

  public ReportRtaGetV2ResponseDataListInner() {
  }

  public ReportRtaGetV2ResponseDataListInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ReportRtaGetV2ResponseDataListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ReportRtaGetV2ResponseDataListInner campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ReportRtaGetV2ResponseDataListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public ReportRtaGetV2ResponseDataListInner isRtaBid(Long isRtaBid) {
    
    this.isRtaBid = isRtaBid;
    return this;
  }

   /**
   * 
   * @return isRtaBid
  **/
  @javax.annotation.Nullable
  public Long getIsRtaBid() {
    return isRtaBid;
  }


  public void setIsRtaBid(Long isRtaBid) {
    this.isRtaBid = isRtaBid;
  }


  public ReportRtaGetV2ResponseDataListInner metrics(ReportRtaGetV2ResponseDataListInnerMetrics metrics) {
    
    this.metrics = metrics;
    return this;
  }

   /**
   * Get metrics
   * @return metrics
  **/
  @javax.annotation.Nullable
  public ReportRtaGetV2ResponseDataListInnerMetrics getMetrics() {
    return metrics;
  }


  public void setMetrics(ReportRtaGetV2ResponseDataListInnerMetrics metrics) {
    this.metrics = metrics;
  }


  public ReportRtaGetV2ResponseDataListInner platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public ReportRtaGetV2ResponseDataListInner statTimeDay(String statTimeDay) {
    
    this.statTimeDay = statTimeDay;
    return this;
  }

   /**
   * 
   * @return statTimeDay
  **/
  @javax.annotation.Nullable
  public String getStatTimeDay() {
    return statTimeDay;
  }


  public void setStatTimeDay(String statTimeDay) {
    this.statTimeDay = statTimeDay;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportRtaGetV2ResponseDataListInner reportRtaGetV2ResponseDataListInner = (ReportRtaGetV2ResponseDataListInner) o;
    return Objects.equals(this.adId, reportRtaGetV2ResponseDataListInner.adId) &&
        Objects.equals(this.advertiserId, reportRtaGetV2ResponseDataListInner.advertiserId) &&
        Objects.equals(this.campaignId, reportRtaGetV2ResponseDataListInner.campaignId) &&
        Objects.equals(this.creativeId, reportRtaGetV2ResponseDataListInner.creativeId) &&
        Objects.equals(this.isRtaBid, reportRtaGetV2ResponseDataListInner.isRtaBid) &&
        Objects.equals(this.metrics, reportRtaGetV2ResponseDataListInner.metrics) &&
        Objects.equals(this.platform, reportRtaGetV2ResponseDataListInner.platform) &&
        Objects.equals(this.statTimeDay, reportRtaGetV2ResponseDataListInner.statTimeDay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, campaignId, creativeId, isRtaBid, metrics, platform, statTimeDay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportRtaGetV2ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    isRtaBid: ").append(toIndentedString(isRtaBid)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    statTimeDay: ").append(toIndentedString(statTimeDay)).append("\n");
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
    openapiFields.add("campaign_id");
    openapiFields.add("creative_id");
    openapiFields.add("is_rta_bid");
    openapiFields.add("metrics");
    openapiFields.add("platform");
    openapiFields.add("stat_time_day");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportRtaGetV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportRtaGetV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportRtaGetV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportRtaGetV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportRtaGetV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportRtaGetV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportRtaGetV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportRtaGetV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportRtaGetV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportRtaGetV2ResponseDataListInner
  */
  public static ReportRtaGetV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportRtaGetV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportRtaGetV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

