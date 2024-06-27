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
import com.bytedance.ads.model.ReportCreativeGetV2FilteringCampaignTypes;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringCreativeMaterialModes;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringDeliveryMode;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringImageMode;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringImageModes;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringInventoryTypes;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringLandingType;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringLandingTypes;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringPricing;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringPricingCategories;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringPricings;
import com.bytedance.ads.model.ReportCreativeGetV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ReportCreativeGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AD_IDS = "ad_ids";
  @SerializedName(SERIALIZED_NAME_AD_IDS)
  private List<Long> adIds = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPES = "campaign_types";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPES)
  private List<ReportCreativeGetV2FilteringCampaignTypes> campaignTypes = null;

  public static final String SERIALIZED_NAME_CREATIVE_IDS = "creative_ids";
  @SerializedName(SERIALIZED_NAME_CREATIVE_IDS)
  private List<Long> creativeIds = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODES = "creative_material_modes";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODES)
  private List<ReportCreativeGetV2FilteringCreativeMaterialModes> creativeMaterialModes = null;

  public static final String SERIALIZED_NAME_CREATIVE_TITLE = "creative_title";
  @SerializedName(SERIALIZED_NAME_CREATIVE_TITLE)
  private String creativeTitle = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private List<ReportCreativeGetV2FilteringDeliveryMode> deliveryMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private ReportCreativeGetV2FilteringImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODES = "image_modes";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODES)
  private List<ReportCreativeGetV2FilteringImageModes> imageModes = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPES = "inventory_types";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPES)
  private List<ReportCreativeGetV2FilteringInventoryTypes> inventoryTypes = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private ReportCreativeGetV2FilteringLandingType landingType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPES = "landing_types";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPES)
  private List<ReportCreativeGetV2FilteringLandingTypes> landingTypes = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private ReportCreativeGetV2FilteringPricing pricing = null;

  public static final String SERIALIZED_NAME_PRICING_CATEGORIES = "pricing_categories";
  @SerializedName(SERIALIZED_NAME_PRICING_CATEGORIES)
  private List<ReportCreativeGetV2FilteringPricingCategories> pricingCategories = null;

  public static final String SERIALIZED_NAME_PRICINGS = "pricings";
  @SerializedName(SERIALIZED_NAME_PRICINGS)
  private List<ReportCreativeGetV2FilteringPricings> pricings = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ReportCreativeGetV2FilteringStatus status = null;

  public ReportCreativeGetV2Filtering() {
  }

  public ReportCreativeGetV2Filtering adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public ReportCreativeGetV2Filtering adIds(List<Long> adIds) {
    
    this.adIds = adIds;
    return this;
  }

  public ReportCreativeGetV2Filtering addAdIdsItem(Long adIdsItem) {
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


  public ReportCreativeGetV2Filtering adName(String adName) {
    
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


  public ReportCreativeGetV2Filtering campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public ReportCreativeGetV2Filtering campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public ReportCreativeGetV2Filtering addCampaignIdsItem(Long campaignIdsItem) {
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


  public ReportCreativeGetV2Filtering campaignTypes(List<ReportCreativeGetV2FilteringCampaignTypes> campaignTypes) {
    
    this.campaignTypes = campaignTypes;
    return this;
  }

  public ReportCreativeGetV2Filtering addCampaignTypesItem(ReportCreativeGetV2FilteringCampaignTypes campaignTypesItem) {
    if (this.campaignTypes == null) {
      this.campaignTypes = new ArrayList<>();
    }
    this.campaignTypes.add(campaignTypesItem);
    return this;
  }

   /**
   * 
   * @return campaignTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringCampaignTypes> getCampaignTypes() {
    return campaignTypes;
  }


  public void setCampaignTypes(List<ReportCreativeGetV2FilteringCampaignTypes> campaignTypes) {
    this.campaignTypes = campaignTypes;
  }


  public ReportCreativeGetV2Filtering creativeIds(List<Long> creativeIds) {
    
    this.creativeIds = creativeIds;
    return this;
  }

  public ReportCreativeGetV2Filtering addCreativeIdsItem(Long creativeIdsItem) {
    if (this.creativeIds == null) {
      this.creativeIds = new ArrayList<>();
    }
    this.creativeIds.add(creativeIdsItem);
    return this;
  }

   /**
   * 
   * @return creativeIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeIds() {
    return creativeIds;
  }


  public void setCreativeIds(List<Long> creativeIds) {
    this.creativeIds = creativeIds;
  }


  public ReportCreativeGetV2Filtering creativeMaterialModes(List<ReportCreativeGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    
    this.creativeMaterialModes = creativeMaterialModes;
    return this;
  }

  public ReportCreativeGetV2Filtering addCreativeMaterialModesItem(ReportCreativeGetV2FilteringCreativeMaterialModes creativeMaterialModesItem) {
    if (this.creativeMaterialModes == null) {
      this.creativeMaterialModes = new ArrayList<>();
    }
    this.creativeMaterialModes.add(creativeMaterialModesItem);
    return this;
  }

   /**
   * 
   * @return creativeMaterialModes
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringCreativeMaterialModes> getCreativeMaterialModes() {
    return creativeMaterialModes;
  }


  public void setCreativeMaterialModes(List<ReportCreativeGetV2FilteringCreativeMaterialModes> creativeMaterialModes) {
    this.creativeMaterialModes = creativeMaterialModes;
  }


  public ReportCreativeGetV2Filtering creativeTitle(String creativeTitle) {
    
    this.creativeTitle = creativeTitle;
    return this;
  }

   /**
   * 
   * @return creativeTitle
  **/
  @javax.annotation.Nullable
  public String getCreativeTitle() {
    return creativeTitle;
  }


  public void setCreativeTitle(String creativeTitle) {
    this.creativeTitle = creativeTitle;
  }


  public ReportCreativeGetV2Filtering deliveryMode(List<ReportCreativeGetV2FilteringDeliveryMode> deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

  public ReportCreativeGetV2Filtering addDeliveryModeItem(ReportCreativeGetV2FilteringDeliveryMode deliveryModeItem) {
    if (this.deliveryMode == null) {
      this.deliveryMode = new ArrayList<>();
    }
    this.deliveryMode.add(deliveryModeItem);
    return this;
  }

   /**
   * 
   * @return deliveryMode
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringDeliveryMode> getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(List<ReportCreativeGetV2FilteringDeliveryMode> deliveryMode) {
    this.deliveryMode = deliveryMode;
  }


  public ReportCreativeGetV2Filtering imageMode(ReportCreativeGetV2FilteringImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public ReportCreativeGetV2FilteringImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(ReportCreativeGetV2FilteringImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public ReportCreativeGetV2Filtering imageModes(List<ReportCreativeGetV2FilteringImageModes> imageModes) {
    
    this.imageModes = imageModes;
    return this;
  }

  public ReportCreativeGetV2Filtering addImageModesItem(ReportCreativeGetV2FilteringImageModes imageModesItem) {
    if (this.imageModes == null) {
      this.imageModes = new ArrayList<>();
    }
    this.imageModes.add(imageModesItem);
    return this;
  }

   /**
   * 
   * @return imageModes
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringImageModes> getImageModes() {
    return imageModes;
  }


  public void setImageModes(List<ReportCreativeGetV2FilteringImageModes> imageModes) {
    this.imageModes = imageModes;
  }


  public ReportCreativeGetV2Filtering inventoryTypes(List<ReportCreativeGetV2FilteringInventoryTypes> inventoryTypes) {
    
    this.inventoryTypes = inventoryTypes;
    return this;
  }

  public ReportCreativeGetV2Filtering addInventoryTypesItem(ReportCreativeGetV2FilteringInventoryTypes inventoryTypesItem) {
    if (this.inventoryTypes == null) {
      this.inventoryTypes = new ArrayList<>();
    }
    this.inventoryTypes.add(inventoryTypesItem);
    return this;
  }

   /**
   * 
   * @return inventoryTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringInventoryTypes> getInventoryTypes() {
    return inventoryTypes;
  }


  public void setInventoryTypes(List<ReportCreativeGetV2FilteringInventoryTypes> inventoryTypes) {
    this.inventoryTypes = inventoryTypes;
  }


  public ReportCreativeGetV2Filtering landingType(ReportCreativeGetV2FilteringLandingType landingType) {
    
    this.landingType = landingType;
    return this;
  }

   /**
   * Get landingType
   * @return landingType
  **/
  @javax.annotation.Nullable
  public ReportCreativeGetV2FilteringLandingType getLandingType() {
    return landingType;
  }


  public void setLandingType(ReportCreativeGetV2FilteringLandingType landingType) {
    this.landingType = landingType;
  }


  public ReportCreativeGetV2Filtering landingTypes(List<ReportCreativeGetV2FilteringLandingTypes> landingTypes) {
    
    this.landingTypes = landingTypes;
    return this;
  }

  public ReportCreativeGetV2Filtering addLandingTypesItem(ReportCreativeGetV2FilteringLandingTypes landingTypesItem) {
    if (this.landingTypes == null) {
      this.landingTypes = new ArrayList<>();
    }
    this.landingTypes.add(landingTypesItem);
    return this;
  }

   /**
   * 
   * @return landingTypes
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringLandingTypes> getLandingTypes() {
    return landingTypes;
  }


  public void setLandingTypes(List<ReportCreativeGetV2FilteringLandingTypes> landingTypes) {
    this.landingTypes = landingTypes;
  }


  public ReportCreativeGetV2Filtering pricing(ReportCreativeGetV2FilteringPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public ReportCreativeGetV2FilteringPricing getPricing() {
    return pricing;
  }


  public void setPricing(ReportCreativeGetV2FilteringPricing pricing) {
    this.pricing = pricing;
  }


  public ReportCreativeGetV2Filtering pricingCategories(List<ReportCreativeGetV2FilteringPricingCategories> pricingCategories) {
    
    this.pricingCategories = pricingCategories;
    return this;
  }

  public ReportCreativeGetV2Filtering addPricingCategoriesItem(ReportCreativeGetV2FilteringPricingCategories pricingCategoriesItem) {
    if (this.pricingCategories == null) {
      this.pricingCategories = new ArrayList<>();
    }
    this.pricingCategories.add(pricingCategoriesItem);
    return this;
  }

   /**
   * 
   * @return pricingCategories
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringPricingCategories> getPricingCategories() {
    return pricingCategories;
  }


  public void setPricingCategories(List<ReportCreativeGetV2FilteringPricingCategories> pricingCategories) {
    this.pricingCategories = pricingCategories;
  }


  public ReportCreativeGetV2Filtering pricings(List<ReportCreativeGetV2FilteringPricings> pricings) {
    
    this.pricings = pricings;
    return this;
  }

  public ReportCreativeGetV2Filtering addPricingsItem(ReportCreativeGetV2FilteringPricings pricingsItem) {
    if (this.pricings == null) {
      this.pricings = new ArrayList<>();
    }
    this.pricings.add(pricingsItem);
    return this;
  }

   /**
   * 
   * @return pricings
  **/
  @javax.annotation.Nullable
  public List<ReportCreativeGetV2FilteringPricings> getPricings() {
    return pricings;
  }


  public void setPricings(List<ReportCreativeGetV2FilteringPricings> pricings) {
    this.pricings = pricings;
  }


  public ReportCreativeGetV2Filtering status(ReportCreativeGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ReportCreativeGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(ReportCreativeGetV2FilteringStatus status) {
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
    ReportCreativeGetV2Filtering reportCreativeGetV2Filtering = (ReportCreativeGetV2Filtering) o;
    return Objects.equals(this.adId, reportCreativeGetV2Filtering.adId) &&
        Objects.equals(this.adIds, reportCreativeGetV2Filtering.adIds) &&
        Objects.equals(this.adName, reportCreativeGetV2Filtering.adName) &&
        Objects.equals(this.campaignId, reportCreativeGetV2Filtering.campaignId) &&
        Objects.equals(this.campaignIds, reportCreativeGetV2Filtering.campaignIds) &&
        Objects.equals(this.campaignTypes, reportCreativeGetV2Filtering.campaignTypes) &&
        Objects.equals(this.creativeIds, reportCreativeGetV2Filtering.creativeIds) &&
        Objects.equals(this.creativeMaterialModes, reportCreativeGetV2Filtering.creativeMaterialModes) &&
        Objects.equals(this.creativeTitle, reportCreativeGetV2Filtering.creativeTitle) &&
        Objects.equals(this.deliveryMode, reportCreativeGetV2Filtering.deliveryMode) &&
        Objects.equals(this.imageMode, reportCreativeGetV2Filtering.imageMode) &&
        Objects.equals(this.imageModes, reportCreativeGetV2Filtering.imageModes) &&
        Objects.equals(this.inventoryTypes, reportCreativeGetV2Filtering.inventoryTypes) &&
        Objects.equals(this.landingType, reportCreativeGetV2Filtering.landingType) &&
        Objects.equals(this.landingTypes, reportCreativeGetV2Filtering.landingTypes) &&
        Objects.equals(this.pricing, reportCreativeGetV2Filtering.pricing) &&
        Objects.equals(this.pricingCategories, reportCreativeGetV2Filtering.pricingCategories) &&
        Objects.equals(this.pricings, reportCreativeGetV2Filtering.pricings) &&
        Objects.equals(this.status, reportCreativeGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, adIds, adName, campaignId, campaignIds, campaignTypes, creativeIds, creativeMaterialModes, creativeTitle, deliveryMode, imageMode, imageModes, inventoryTypes, landingType, landingTypes, pricing, pricingCategories, pricings, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportCreativeGetV2Filtering {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    adIds: ").append(toIndentedString(adIds)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    campaignTypes: ").append(toIndentedString(campaignTypes)).append("\n");
    sb.append("    creativeIds: ").append(toIndentedString(creativeIds)).append("\n");
    sb.append("    creativeMaterialModes: ").append(toIndentedString(creativeMaterialModes)).append("\n");
    sb.append("    creativeTitle: ").append(toIndentedString(creativeTitle)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    imageModes: ").append(toIndentedString(imageModes)).append("\n");
    sb.append("    inventoryTypes: ").append(toIndentedString(inventoryTypes)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    landingTypes: ").append(toIndentedString(landingTypes)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    pricingCategories: ").append(toIndentedString(pricingCategories)).append("\n");
    sb.append("    pricings: ").append(toIndentedString(pricings)).append("\n");
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
    openapiFields.add("ad_ids");
    openapiFields.add("ad_name");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_ids");
    openapiFields.add("campaign_types");
    openapiFields.add("creative_ids");
    openapiFields.add("creative_material_modes");
    openapiFields.add("creative_title");
    openapiFields.add("delivery_mode");
    openapiFields.add("image_mode");
    openapiFields.add("image_modes");
    openapiFields.add("inventory_types");
    openapiFields.add("landing_type");
    openapiFields.add("landing_types");
    openapiFields.add("pricing");
    openapiFields.add("pricing_categories");
    openapiFields.add("pricings");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportCreativeGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportCreativeGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportCreativeGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportCreativeGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportCreativeGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportCreativeGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportCreativeGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportCreativeGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportCreativeGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportCreativeGetV2Filtering
  */
  public static ReportCreativeGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportCreativeGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportCreativeGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

