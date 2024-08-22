/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringCampaignScene;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringMarketingScene;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringOrderPlatform;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringSmartBidType;
import com.bytedance.ads.model.QianchuanReportAdvertiserGetV10FilteringStatus;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class QianchuanReportAdvertiserGetV10Filtering {
  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<Long> awemeIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private QianchuanReportAdvertiserGetV10FilteringCampaignScene campaignScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanReportAdvertiserGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanReportAdvertiserGetV10FilteringMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_ORDER_PLATFORM = "order_platform";
  @SerializedName(SERIALIZED_NAME_ORDER_PLATFORM)
  private QianchuanReportAdvertiserGetV10FilteringOrderPlatform orderPlatform = null;

  public static final String SERIALIZED_NAME_SMART_BID_TYPE = "smart_bid_type";
  @SerializedName(SERIALIZED_NAME_SMART_BID_TYPE)
  private QianchuanReportAdvertiserGetV10FilteringSmartBidType smartBidType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanReportAdvertiserGetV10FilteringStatus status = null;

  public QianchuanReportAdvertiserGetV10Filtering() {
  }

  public QianchuanReportAdvertiserGetV10Filtering awemeIds(List<Long> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public QianchuanReportAdvertiserGetV10Filtering addAwemeIdsItem(Long awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<Long> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public QianchuanReportAdvertiserGetV10Filtering campaignScene(QianchuanReportAdvertiserGetV10FilteringCampaignScene campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

   /**
   * Get campaignScene
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdvertiserGetV10FilteringCampaignScene getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(QianchuanReportAdvertiserGetV10FilteringCampaignScene campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanReportAdvertiserGetV10Filtering marketingGoal(QianchuanReportAdvertiserGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanReportAdvertiserGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanReportAdvertiserGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanReportAdvertiserGetV10Filtering marketingScene(QianchuanReportAdvertiserGetV10FilteringMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdvertiserGetV10FilteringMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanReportAdvertiserGetV10FilteringMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanReportAdvertiserGetV10Filtering orderPlatform(QianchuanReportAdvertiserGetV10FilteringOrderPlatform orderPlatform) {
    
    this.orderPlatform = orderPlatform;
    return this;
  }

   /**
   * Get orderPlatform
   * @return orderPlatform
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdvertiserGetV10FilteringOrderPlatform getOrderPlatform() {
    return orderPlatform;
  }


  public void setOrderPlatform(QianchuanReportAdvertiserGetV10FilteringOrderPlatform orderPlatform) {
    this.orderPlatform = orderPlatform;
  }


  public QianchuanReportAdvertiserGetV10Filtering smartBidType(QianchuanReportAdvertiserGetV10FilteringSmartBidType smartBidType) {
    
    this.smartBidType = smartBidType;
    return this;
  }

   /**
   * Get smartBidType
   * @return smartBidType
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdvertiserGetV10FilteringSmartBidType getSmartBidType() {
    return smartBidType;
  }


  public void setSmartBidType(QianchuanReportAdvertiserGetV10FilteringSmartBidType smartBidType) {
    this.smartBidType = smartBidType;
  }


  public QianchuanReportAdvertiserGetV10Filtering status(QianchuanReportAdvertiserGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanReportAdvertiserGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanReportAdvertiserGetV10FilteringStatus status) {
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
    QianchuanReportAdvertiserGetV10Filtering qianchuanReportAdvertiserGetV10Filtering = (QianchuanReportAdvertiserGetV10Filtering) o;
    return Objects.equals(this.awemeIds, qianchuanReportAdvertiserGetV10Filtering.awemeIds) &&
        Objects.equals(this.campaignScene, qianchuanReportAdvertiserGetV10Filtering.campaignScene) &&
        Objects.equals(this.marketingGoal, qianchuanReportAdvertiserGetV10Filtering.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanReportAdvertiserGetV10Filtering.marketingScene) &&
        Objects.equals(this.orderPlatform, qianchuanReportAdvertiserGetV10Filtering.orderPlatform) &&
        Objects.equals(this.smartBidType, qianchuanReportAdvertiserGetV10Filtering.smartBidType) &&
        Objects.equals(this.status, qianchuanReportAdvertiserGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeIds, campaignScene, marketingGoal, marketingScene, orderPlatform, smartBidType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportAdvertiserGetV10Filtering {\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
    sb.append("    orderPlatform: ").append(toIndentedString(orderPlatform)).append("\n");
    sb.append("    smartBidType: ").append(toIndentedString(smartBidType)).append("\n");
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
    openapiFields.add("aweme_ids");
    openapiFields.add("campaign_scene");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("order_platform");
    openapiFields.add("smart_bid_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportAdvertiserGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportAdvertiserGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportAdvertiserGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportAdvertiserGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportAdvertiserGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanReportAdvertiserGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportAdvertiserGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportAdvertiserGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportAdvertiserGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportAdvertiserGetV10Filtering
  */
  public static QianchuanReportAdvertiserGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportAdvertiserGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanReportAdvertiserGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

