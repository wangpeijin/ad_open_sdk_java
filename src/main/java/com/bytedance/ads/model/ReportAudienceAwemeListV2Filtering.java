/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportAudienceAwemeListV2FilteringAudienceLevel;
import com.bytedance.ads.model.ReportAudienceAwemeListV2FilteringBehaviors;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class ReportAudienceAwemeListV2Filtering {
  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AUDIENCE_LEVEL = "audience_level";
  @SerializedName(SERIALIZED_NAME_AUDIENCE_LEVEL)
  private ReportAudienceAwemeListV2FilteringAudienceLevel audienceLevel = null;

  public static final String SERIALIZED_NAME_BEHAVIORS = "behaviors";
  @SerializedName(SERIALIZED_NAME_BEHAVIORS)
  private List<ReportAudienceAwemeListV2FilteringBehaviors> behaviors = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public ReportAudienceAwemeListV2Filtering() {
  }

  public ReportAudienceAwemeListV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportAudienceAwemeListV2Filtering addAdIdsItem(Long adIdsItem) {
    if (this.adIds == null) {
      this.adIds = new ArrayList<>();
    }
    this.adIds.add(adIdsItem);
    return this;
  }

   /**
   * 
   * @return adIds
  **/
  @javax.annotation.Nullable
  public List<Long> getAdIds() {
    return adIds;
  }


  public void setAdIds(List<Long> adIds) {
    this.adIds = adIds;
  }


  public ReportAudienceAwemeListV2Filtering audienceLevel(ReportAudienceAwemeListV2FilteringAudienceLevel audienceLevel) {
    
    this.audienceLevel = audienceLevel;
    return this;
  }

   /**
   * Get audienceLevel
   * @return audienceLevel
  **/
  @javax.annotation.Nullable
  public ReportAudienceAwemeListV2FilteringAudienceLevel getAudienceLevel() {
    return audienceLevel;
  }


  public void setAudienceLevel(ReportAudienceAwemeListV2FilteringAudienceLevel audienceLevel) {
    this.audienceLevel = audienceLevel;
  }


  public ReportAudienceAwemeListV2Filtering behaviors(List<ReportAudienceAwemeListV2FilteringBehaviors> behaviors) {
    
    this.behaviors = behaviors;
    return this;
  }

  public ReportAudienceAwemeListV2Filtering addBehaviorsItem(ReportAudienceAwemeListV2FilteringBehaviors behaviorsItem) {
    if (this.behaviors == null) {
      this.behaviors = new ArrayList<>(Arrays.asList(ReportAudienceAwemeListV2FilteringBehaviors.FOLLOWED_USER, ReportAudienceAwemeListV2FilteringBehaviors.COMMENTED_USER, ReportAudienceAwemeListV2FilteringBehaviors.LIKED_USER, ReportAudienceAwemeListV2FilteringBehaviors.SHARED_USER, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_WATCH, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_EFFECTIVE_WATCH, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_COMMENT, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_EXCEPTIONAL, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_GOODS_CLICK, ReportAudienceAwemeListV2FilteringBehaviors.LIVE_GOODS_ORDER, ReportAudienceAwemeListV2FilteringBehaviors.GOODS_CARTS_CLICK, ReportAudienceAwemeListV2FilteringBehaviors.GOODS_CARTS_ORDER));
    }
    this.behaviors.add(behaviorsItem);
    return this;
  }

   /**
   * 
   * @return behaviors
  **/
  @javax.annotation.Nullable
  public List<ReportAudienceAwemeListV2FilteringBehaviors> getBehaviors() {
    return behaviors;
  }


  public void setBehaviors(List<ReportAudienceAwemeListV2FilteringBehaviors> behaviors) {
    this.behaviors = behaviors;
  }


  public ReportAudienceAwemeListV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportAudienceAwemeListV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
    if (this.campaignIds == null) {
      this.campaignIds = new ArrayList<>();
    }
    this.campaignIds.add(campaignIdsItem);
    return this;
  }

   /**
   * 
   * @return campaignIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignIds() {
    return campaignIds;
  }


  public void setCampaignIds(List<Long> campaignIds) {
    this.campaignIds = campaignIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportAudienceAwemeListV2Filtering reportAudienceAwemeListV2Filtering = (ReportAudienceAwemeListV2Filtering) o;
    return Objects.equals(this.adIds, reportAudienceAwemeListV2Filtering.adIds) &&
        Objects.equals(this.audienceLevel, reportAudienceAwemeListV2Filtering.audienceLevel) &&
        Objects.equals(this.behaviors, reportAudienceAwemeListV2Filtering.behaviors) &&
        Objects.equals(this.campaignIds, reportAudienceAwemeListV2Filtering.campaignIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adIds, audienceLevel, behaviors, campaignIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportAudienceAwemeListV2Filtering {\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    audienceLevel: ").append(toIndentedString(audienceLevel)).append("\n");
    sb.append("    behaviors: ").append(toIndentedString(behaviors)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("audience_level");
    openapiFields.add("behaviors");
    openapiFields.add("campaign_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportAudienceAwemeListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportAudienceAwemeListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportAudienceAwemeListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportAudienceAwemeListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportAudienceAwemeListV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportAudienceAwemeListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportAudienceAwemeListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportAudienceAwemeListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportAudienceAwemeListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportAudienceAwemeListV2Filtering
  */
  public static ReportAudienceAwemeListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportAudienceAwemeListV2Filtering.class);
  }

 /**
  * Convert an instance of ReportAudienceAwemeListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

