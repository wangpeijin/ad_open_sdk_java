/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdGetV10FilteringAutoManageFilter;
import com.bytedance.ads.model.QianchuanAdGetV10FilteringCampaignScene;
import com.bytedance.ads.model.QianchuanAdGetV10FilteringMarketingGoal;
import com.bytedance.ads.model.QianchuanAdGetV10FilteringMarketingScene;
import com.bytedance.ads.model.QianchuanAdGetV10FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class QianchuanAdGetV10Filtering {
  public static final String SERIALIZED_NAME_AD_CREATE_END_DATE = "ad_create_end_date";
  @SerializedName(SERIALIZED_NAME_AD_CREATE_END_DATE)
  private String adCreateEndDate = null;

  public static final String SERIALIZED_NAME_AD_CREATE_START_DATE = "ad_create_start_date";
  @SerializedName(SERIALIZED_NAME_AD_CREATE_START_DATE)
  private String adCreateStartDate = null;

  public static final String SERIALIZED_NAME_AD_MODIFY_TIME = "ad_modify_time";
  @SerializedName(SERIALIZED_NAME_AD_MODIFY_TIME)
  private String adModifyTime = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_AUTO_MANAGE_FILTER = "auto_manage_filter";
  @SerializedName(SERIALIZED_NAME_AUTO_MANAGE_FILTER)
  private QianchuanAdGetV10FilteringAutoManageFilter autoManageFilter = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private Long awemeId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_SCENE = "campaign_scene";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_SCENE)
  private List<QianchuanAdGetV10FilteringCampaignScene> campaignScene = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAdGetV10FilteringMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MARKETING_SCENE = "marketing_scene";
  @SerializedName(SERIALIZED_NAME_MARKETING_SCENE)
  private QianchuanAdGetV10FilteringMarketingScene marketingScene = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAdGetV10FilteringStatus status = null;

  public QianchuanAdGetV10Filtering() {
  }

  public QianchuanAdGetV10Filtering adCreateEndDate(String adCreateEndDate) {
    
    this.adCreateEndDate = adCreateEndDate;
    return this;
  }

   /**
   * 
   * @return adCreateEndDate
  **/
  @javax.annotation.Nullable
  public String getAdCreateEndDate() {
    return adCreateEndDate;
  }


  public void setAdCreateEndDate(String adCreateEndDate) {
    this.adCreateEndDate = adCreateEndDate;
  }


  public QianchuanAdGetV10Filtering adCreateStartDate(String adCreateStartDate) {
    
    this.adCreateStartDate = adCreateStartDate;
    return this;
  }

   /**
   * 
   * @return adCreateStartDate
  **/
  @javax.annotation.Nullable
  public String getAdCreateStartDate() {
    return adCreateStartDate;
  }


  public void setAdCreateStartDate(String adCreateStartDate) {
    this.adCreateStartDate = adCreateStartDate;
  }


  public QianchuanAdGetV10Filtering adModifyTime(String adModifyTime) {
    
    this.adModifyTime = adModifyTime;
    return this;
  }

   /**
   * 
   * @return adModifyTime
  **/
  @javax.annotation.Nullable
  public String getAdModifyTime() {
    return adModifyTime;
  }


  public void setAdModifyTime(String adModifyTime) {
    this.adModifyTime = adModifyTime;
  }


  public QianchuanAdGetV10Filtering adName(String adName) {
    
    this.adName = adName;
    return this;
  }

   /**
   * 
   * @return adName
  **/
  @javax.annotation.Nullable
  public String getAdName() {
    return adName;
  }


  public void setAdName(String adName) {
    this.adName = adName;
  }


  public QianchuanAdGetV10Filtering autoManageFilter(QianchuanAdGetV10FilteringAutoManageFilter autoManageFilter) {
    
    this.autoManageFilter = autoManageFilter;
    return this;
  }

   /**
   * Get autoManageFilter
   * @return autoManageFilter
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10FilteringAutoManageFilter getAutoManageFilter() {
    return autoManageFilter;
  }


  public void setAutoManageFilter(QianchuanAdGetV10FilteringAutoManageFilter autoManageFilter) {
    this.autoManageFilter = autoManageFilter;
  }


  public QianchuanAdGetV10Filtering awemeId(Long awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public Long getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(Long awemeId) {
    this.awemeId = awemeId;
  }


  public QianchuanAdGetV10Filtering campaignId(Long campaignId) {
    
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


  public QianchuanAdGetV10Filtering campaignScene(List<QianchuanAdGetV10FilteringCampaignScene> campaignScene) {
    
    this.campaignScene = campaignScene;
    return this;
  }

  public QianchuanAdGetV10Filtering addCampaignSceneItem(QianchuanAdGetV10FilteringCampaignScene campaignSceneItem) {
    if (this.campaignScene == null) {
      this.campaignScene = new ArrayList<>();
    }
    this.campaignScene.add(campaignSceneItem);
    return this;
  }

   /**
   * 
   * @return campaignScene
  **/
  @javax.annotation.Nullable
  public List<QianchuanAdGetV10FilteringCampaignScene> getCampaignScene() {
    return campaignScene;
  }


  public void setCampaignScene(List<QianchuanAdGetV10FilteringCampaignScene> campaignScene) {
    this.campaignScene = campaignScene;
  }


  public QianchuanAdGetV10Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public QianchuanAdGetV10Filtering addIdsItem(Long idsItem) {
    if (this.ids == null) {
      this.ids = new ArrayList<>();
    }
    this.ids.add(idsItem);
    return this;
  }

   /**
   * 
   * @return ids
  **/
  @javax.annotation.Nullable
  public List<Long> getIds() {
    return ids;
  }


  public void setIds(List<Long> ids) {
    this.ids = ids;
  }


  public QianchuanAdGetV10Filtering marketingGoal(QianchuanAdGetV10FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nonnull
  public QianchuanAdGetV10FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAdGetV10FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAdGetV10Filtering marketingScene(QianchuanAdGetV10FilteringMarketingScene marketingScene) {
    
    this.marketingScene = marketingScene;
    return this;
  }

   /**
   * Get marketingScene
   * @return marketingScene
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10FilteringMarketingScene getMarketingScene() {
    return marketingScene;
  }


  public void setMarketingScene(QianchuanAdGetV10FilteringMarketingScene marketingScene) {
    this.marketingScene = marketingScene;
  }


  public QianchuanAdGetV10Filtering status(QianchuanAdGetV10FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAdGetV10FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAdGetV10FilteringStatus status) {
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
    QianchuanAdGetV10Filtering qianchuanAdGetV10Filtering = (QianchuanAdGetV10Filtering) o;
    return Objects.equals(this.adCreateEndDate, qianchuanAdGetV10Filtering.adCreateEndDate) &&
        Objects.equals(this.adCreateStartDate, qianchuanAdGetV10Filtering.adCreateStartDate) &&
        Objects.equals(this.adModifyTime, qianchuanAdGetV10Filtering.adModifyTime) &&
        Objects.equals(this.adName, qianchuanAdGetV10Filtering.adName) &&
        Objects.equals(this.autoManageFilter, qianchuanAdGetV10Filtering.autoManageFilter) &&
        Objects.equals(this.awemeId, qianchuanAdGetV10Filtering.awemeId) &&
        Objects.equals(this.campaignId, qianchuanAdGetV10Filtering.campaignId) &&
        Objects.equals(this.campaignScene, qianchuanAdGetV10Filtering.campaignScene) &&
        Objects.equals(this.ids, qianchuanAdGetV10Filtering.ids) &&
        Objects.equals(this.marketingGoal, qianchuanAdGetV10Filtering.marketingGoal) &&
        Objects.equals(this.marketingScene, qianchuanAdGetV10Filtering.marketingScene) &&
        Objects.equals(this.status, qianchuanAdGetV10Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCreateEndDate, adCreateStartDate, adModifyTime, adName, autoManageFilter, awemeId, campaignId, campaignScene, ids, marketingGoal, marketingScene, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdGetV10Filtering {\n");
    sb.append("    adCreateEndDate: ").append(toIndentedString(adCreateEndDate)).append("\n");
    sb.append("    adCreateStartDate: ").append(toIndentedString(adCreateStartDate)).append("\n");
    sb.append("    adModifyTime: ").append(toIndentedString(adModifyTime)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    autoManageFilter: ").append(toIndentedString(autoManageFilter)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignScene: ").append(toIndentedString(campaignScene)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    marketingScene: ").append(toIndentedString(marketingScene)).append("\n");
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
    openapiFields.add("ad_create_end_date");
    openapiFields.add("ad_create_start_date");
    openapiFields.add("ad_modify_time");
    openapiFields.add("ad_name");
    openapiFields.add("auto_manage_filter");
    openapiFields.add("aweme_id");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_scene");
    openapiFields.add("ids");
    openapiFields.add("marketing_goal");
    openapiFields.add("marketing_scene");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("marketing_goal");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanAdGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdGetV10Filtering
  */
  public static QianchuanAdGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanAdGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

