/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalReportProjectGetV30FilteringCampaignType;
import com.bytedance.ads.model.LocalReportProjectGetV30FilteringExternalAction;
import com.bytedance.ads.model.LocalReportProjectGetV30FilteringLocalDeliveryScene;
import com.bytedance.ads.model.LocalReportProjectGetV30FilteringMarketingGoal;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class LocalReportProjectGetV30Filtering {
  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private LocalReportProjectGetV30FilteringCampaignType campaignType = null;

  public static final String SERIALIZED_NAME_CDP_PROJECT_IDS = "cdp_project_ids";
  @SerializedName(SERIALIZED_NAME_CDP_PROJECT_IDS)
  private List<Long> cdpProjectIds = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private List<LocalReportProjectGetV30FilteringExternalAction> externalAction = null;

  public static final String SERIALIZED_NAME_LOCAL_DELIVERY_SCENE = "local_delivery_scene";
  @SerializedName(SERIALIZED_NAME_LOCAL_DELIVERY_SCENE)
  private LocalReportProjectGetV30FilteringLocalDeliveryScene localDeliveryScene = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private LocalReportProjectGetV30FilteringMarketingGoal marketingGoal = null;

  public LocalReportProjectGetV30Filtering() {
  }

  public LocalReportProjectGetV30Filtering campaignType(LocalReportProjectGetV30FilteringCampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public LocalReportProjectGetV30FilteringCampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(LocalReportProjectGetV30FilteringCampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public LocalReportProjectGetV30Filtering cdpProjectIds(List<Long> cdpProjectIds) {
    
    this.cdpProjectIds = cdpProjectIds;
    return this;
  }

  public LocalReportProjectGetV30Filtering addCdpProjectIdsItem(Long cdpProjectIdsItem) {
    if (this.cdpProjectIds == null) {
      this.cdpProjectIds = new ArrayList<>();
    }
    this.cdpProjectIds.add(cdpProjectIdsItem);
    return this;
  }

   /**
   * 项目ID，查询项目id。 注意：project_id是个维度条件，如果不传，查询的是本地推广告账户ID全部聚合后数据；如果仅传入字符串project_ids，查询的是维度明细是项目维度数据；如果传入数值，查询的是具体项目id数据
   * @return cdpProjectIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCdpProjectIds() {
    return cdpProjectIds;
  }


  public void setCdpProjectIds(List<Long> cdpProjectIds) {
    this.cdpProjectIds = cdpProjectIds;
  }


  public LocalReportProjectGetV30Filtering externalAction(List<LocalReportProjectGetV30FilteringExternalAction> externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

  public LocalReportProjectGetV30Filtering addExternalActionItem(LocalReportProjectGetV30FilteringExternalAction externalActionItem) {
    if (this.externalAction == null) {
      this.externalAction = new ArrayList<>();
    }
    this.externalAction.add(externalActionItem);
    return this;
  }

   /**
   * 优化目标
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public List<LocalReportProjectGetV30FilteringExternalAction> getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(List<LocalReportProjectGetV30FilteringExternalAction> externalAction) {
    this.externalAction = externalAction;
  }


  public LocalReportProjectGetV30Filtering localDeliveryScene(LocalReportProjectGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    
    this.localDeliveryScene = localDeliveryScene;
    return this;
  }

   /**
   * Get localDeliveryScene
   * @return localDeliveryScene
  **/
  @javax.annotation.Nullable
  public LocalReportProjectGetV30FilteringLocalDeliveryScene getLocalDeliveryScene() {
    return localDeliveryScene;
  }


  public void setLocalDeliveryScene(LocalReportProjectGetV30FilteringLocalDeliveryScene localDeliveryScene) {
    this.localDeliveryScene = localDeliveryScene;
  }


  public LocalReportProjectGetV30Filtering marketingGoal(LocalReportProjectGetV30FilteringMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public LocalReportProjectGetV30FilteringMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(LocalReportProjectGetV30FilteringMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalReportProjectGetV30Filtering localReportProjectGetV30Filtering = (LocalReportProjectGetV30Filtering) o;
    return Objects.equals(this.campaignType, localReportProjectGetV30Filtering.campaignType) &&
        Objects.equals(this.cdpProjectIds, localReportProjectGetV30Filtering.cdpProjectIds) &&
        Objects.equals(this.externalAction, localReportProjectGetV30Filtering.externalAction) &&
        Objects.equals(this.localDeliveryScene, localReportProjectGetV30Filtering.localDeliveryScene) &&
        Objects.equals(this.marketingGoal, localReportProjectGetV30Filtering.marketingGoal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignType, cdpProjectIds, externalAction, localDeliveryScene, marketingGoal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalReportProjectGetV30Filtering {\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    cdpProjectIds: ").append(toIndentedString(cdpProjectIds)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    localDeliveryScene: ").append(toIndentedString(localDeliveryScene)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
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
    openapiFields.add("campaign_type");
    openapiFields.add("cdp_project_ids");
    openapiFields.add("external_action");
    openapiFields.add("local_delivery_scene");
    openapiFields.add("marketing_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalReportProjectGetV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalReportProjectGetV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalReportProjectGetV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalReportProjectGetV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalReportProjectGetV30Filtering>() {
           @Override
           public void write(JsonWriter out, LocalReportProjectGetV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalReportProjectGetV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalReportProjectGetV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalReportProjectGetV30Filtering
  * @throws IOException if the JSON string is invalid with respect to LocalReportProjectGetV30Filtering
  */
  public static LocalReportProjectGetV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalReportProjectGetV30Filtering.class);
  }

 /**
  * Convert an instance of LocalReportProjectGetV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

