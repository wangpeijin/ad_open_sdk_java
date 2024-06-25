/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AsyncTaskCreateV2RequestTaskParamsFiltering {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private List<Long> adId = null;

  public static final String SERIALIZED_NAME_BIDWORD = "bidword";
  @SerializedName(SERIALIZED_NAME_BIDWORD)
  private List<String> bidword = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private List<Long> campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private List<String> campaignType = null;

  public static final String SERIALIZED_NAME_CONVERT_TYPE = "convert_type";
  @SerializedName(SERIALIZED_NAME_CONVERT_TYPE)
  private List<String> convertType = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private List<Long> creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_MATERIAL_MODE = "creative_material_mode";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MATERIAL_MODE)
  private List<String> creativeMaterialMode = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private List<String> imageMode = null;

  public static final String SERIALIZED_NAME_INVENTORY_TYPE = "inventory_type";
  @SerializedName(SERIALIZED_NAME_INVENTORY_TYPE)
  private List<String> inventoryType = null;

  public static final String SERIALIZED_NAME_LANDING_TYPE = "landing_type";
  @SerializedName(SERIALIZED_NAME_LANDING_TYPE)
  private List<String> landingType = null;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private List<String> platform = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private List<String> pricing = null;

  public static final String SERIALIZED_NAME_PRICING_CATEGORY = "pricing_category";
  @SerializedName(SERIALIZED_NAME_PRICING_CATEGORY)
  private List<String> pricingCategory = null;

  public static final String SERIALIZED_NAME_QUERY = "query";
  @SerializedName(SERIALIZED_NAME_QUERY)
  private List<String> query = null;

  public AsyncTaskCreateV2RequestTaskParamsFiltering() {
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering adId(List<Long> adId) {
    
    this.adId = adId;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addAdIdItem(Long adIdItem) {
    if (this.adId == null) {
      this.adId = new ArrayList<>();
    }
    this.adId.add(adIdItem);
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public List<Long> getAdId() {
    return adId;
  }


  public void setAdId(List<Long> adId) {
    this.adId = adId;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering bidword(List<String> bidword) {
    
    this.bidword = bidword;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addBidwordItem(String bidwordItem) {
    if (this.bidword == null) {
      this.bidword = new ArrayList<>();
    }
    this.bidword.add(bidwordItem);
    return this;
  }

   /**
   * 
   * @return bidword
  **/
  @javax.annotation.Nullable
  public List<String> getBidword() {
    return bidword;
  }


  public void setBidword(List<String> bidword) {
    this.bidword = bidword;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering campaignId(List<Long> campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addCampaignIdItem(Long campaignIdItem) {
    if (this.campaignId == null) {
      this.campaignId = new ArrayList<>();
    }
    this.campaignId.add(campaignIdItem);
    return this;
  }

   /**
   * 
   * @return campaignId
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(List<Long> campaignId) {
    this.campaignId = campaignId;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering campaignType(List<String> campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addCampaignTypeItem(String campaignTypeItem) {
    if (this.campaignType == null) {
      this.campaignType = new ArrayList<>();
    }
    this.campaignType.add(campaignTypeItem);
    return this;
  }

   /**
   * 
   * @return campaignType
  **/
  @javax.annotation.Nullable
  public List<String> getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(List<String> campaignType) {
    this.campaignType = campaignType;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering convertType(List<String> convertType) {
    
    this.convertType = convertType;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addConvertTypeItem(String convertTypeItem) {
    if (this.convertType == null) {
      this.convertType = new ArrayList<>();
    }
    this.convertType.add(convertTypeItem);
    return this;
  }

   /**
   * 
   * @return convertType
  **/
  @javax.annotation.Nullable
  public List<String> getConvertType() {
    return convertType;
  }


  public void setConvertType(List<String> convertType) {
    this.convertType = convertType;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering creativeId(List<Long> creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addCreativeIdItem(Long creativeIdItem) {
    if (this.creativeId == null) {
      this.creativeId = new ArrayList<>();
    }
    this.creativeId.add(creativeIdItem);
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public List<Long> getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(List<Long> creativeId) {
    this.creativeId = creativeId;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering creativeMaterialMode(List<String> creativeMaterialMode) {
    
    this.creativeMaterialMode = creativeMaterialMode;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addCreativeMaterialModeItem(String creativeMaterialModeItem) {
    if (this.creativeMaterialMode == null) {
      this.creativeMaterialMode = new ArrayList<>();
    }
    this.creativeMaterialMode.add(creativeMaterialModeItem);
    return this;
  }

   /**
   * 
   * @return creativeMaterialMode
  **/
  @javax.annotation.Nullable
  public List<String> getCreativeMaterialMode() {
    return creativeMaterialMode;
  }


  public void setCreativeMaterialMode(List<String> creativeMaterialMode) {
    this.creativeMaterialMode = creativeMaterialMode;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering imageMode(List<String> imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addImageModeItem(String imageModeItem) {
    if (this.imageMode == null) {
      this.imageMode = new ArrayList<>();
    }
    this.imageMode.add(imageModeItem);
    return this;
  }

   /**
   * 
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public List<String> getImageMode() {
    return imageMode;
  }


  public void setImageMode(List<String> imageMode) {
    this.imageMode = imageMode;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering inventoryType(List<String> inventoryType) {
    
    this.inventoryType = inventoryType;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addInventoryTypeItem(String inventoryTypeItem) {
    if (this.inventoryType == null) {
      this.inventoryType = new ArrayList<>();
    }
    this.inventoryType.add(inventoryTypeItem);
    return this;
  }

   /**
   * 
   * @return inventoryType
  **/
  @javax.annotation.Nullable
  public List<String> getInventoryType() {
    return inventoryType;
  }


  public void setInventoryType(List<String> inventoryType) {
    this.inventoryType = inventoryType;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering landingType(List<String> landingType) {
    
    this.landingType = landingType;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addLandingTypeItem(String landingTypeItem) {
    if (this.landingType == null) {
      this.landingType = new ArrayList<>();
    }
    this.landingType.add(landingTypeItem);
    return this;
  }

   /**
   * 
   * @return landingType
  **/
  @javax.annotation.Nullable
  public List<String> getLandingType() {
    return landingType;
  }


  public void setLandingType(List<String> landingType) {
    this.landingType = landingType;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering platform(List<String> platform) {
    
    this.platform = platform;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addPlatformItem(String platformItem) {
    if (this.platform == null) {
      this.platform = new ArrayList<>();
    }
    this.platform.add(platformItem);
    return this;
  }

   /**
   * 
   * @return platform
  **/
  @javax.annotation.Nullable
  public List<String> getPlatform() {
    return platform;
  }


  public void setPlatform(List<String> platform) {
    this.platform = platform;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering pricing(List<String> pricing) {
    
    this.pricing = pricing;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addPricingItem(String pricingItem) {
    if (this.pricing == null) {
      this.pricing = new ArrayList<>();
    }
    this.pricing.add(pricingItem);
    return this;
  }

   /**
   * 
   * @return pricing
  **/
  @javax.annotation.Nullable
  public List<String> getPricing() {
    return pricing;
  }


  public void setPricing(List<String> pricing) {
    this.pricing = pricing;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering pricingCategory(List<String> pricingCategory) {
    
    this.pricingCategory = pricingCategory;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addPricingCategoryItem(String pricingCategoryItem) {
    if (this.pricingCategory == null) {
      this.pricingCategory = new ArrayList<>();
    }
    this.pricingCategory.add(pricingCategoryItem);
    return this;
  }

   /**
   * 
   * @return pricingCategory
  **/
  @javax.annotation.Nullable
  public List<String> getPricingCategory() {
    return pricingCategory;
  }


  public void setPricingCategory(List<String> pricingCategory) {
    this.pricingCategory = pricingCategory;
  }


  public AsyncTaskCreateV2RequestTaskParamsFiltering query(List<String> query) {
    
    this.query = query;
    return this;
  }

  public AsyncTaskCreateV2RequestTaskParamsFiltering addQueryItem(String queryItem) {
    if (this.query == null) {
      this.query = new ArrayList<>();
    }
    this.query.add(queryItem);
    return this;
  }

   /**
   * 
   * @return query
  **/
  @javax.annotation.Nullable
  public List<String> getQuery() {
    return query;
  }


  public void setQuery(List<String> query) {
    this.query = query;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AsyncTaskCreateV2RequestTaskParamsFiltering asyncTaskCreateV2RequestTaskParamsFiltering = (AsyncTaskCreateV2RequestTaskParamsFiltering) o;
    return Objects.equals(this.adId, asyncTaskCreateV2RequestTaskParamsFiltering.adId) &&
        Objects.equals(this.bidword, asyncTaskCreateV2RequestTaskParamsFiltering.bidword) &&
        Objects.equals(this.campaignId, asyncTaskCreateV2RequestTaskParamsFiltering.campaignId) &&
        Objects.equals(this.campaignType, asyncTaskCreateV2RequestTaskParamsFiltering.campaignType) &&
        Objects.equals(this.convertType, asyncTaskCreateV2RequestTaskParamsFiltering.convertType) &&
        Objects.equals(this.creativeId, asyncTaskCreateV2RequestTaskParamsFiltering.creativeId) &&
        Objects.equals(this.creativeMaterialMode, asyncTaskCreateV2RequestTaskParamsFiltering.creativeMaterialMode) &&
        Objects.equals(this.imageMode, asyncTaskCreateV2RequestTaskParamsFiltering.imageMode) &&
        Objects.equals(this.inventoryType, asyncTaskCreateV2RequestTaskParamsFiltering.inventoryType) &&
        Objects.equals(this.landingType, asyncTaskCreateV2RequestTaskParamsFiltering.landingType) &&
        Objects.equals(this.platform, asyncTaskCreateV2RequestTaskParamsFiltering.platform) &&
        Objects.equals(this.pricing, asyncTaskCreateV2RequestTaskParamsFiltering.pricing) &&
        Objects.equals(this.pricingCategory, asyncTaskCreateV2RequestTaskParamsFiltering.pricingCategory) &&
        Objects.equals(this.query, asyncTaskCreateV2RequestTaskParamsFiltering.query);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, bidword, campaignId, campaignType, convertType, creativeId, creativeMaterialMode, imageMode, inventoryType, landingType, platform, pricing, pricingCategory, query);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AsyncTaskCreateV2RequestTaskParamsFiltering {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    bidword: ").append(toIndentedString(bidword)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    convertType: ").append(toIndentedString(convertType)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeMaterialMode: ").append(toIndentedString(creativeMaterialMode)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    inventoryType: ").append(toIndentedString(inventoryType)).append("\n");
    sb.append("    landingType: ").append(toIndentedString(landingType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    pricingCategory: ").append(toIndentedString(pricingCategory)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
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
    openapiFields.add("bidword");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_type");
    openapiFields.add("convert_type");
    openapiFields.add("creative_id");
    openapiFields.add("creative_material_mode");
    openapiFields.add("image_mode");
    openapiFields.add("inventory_type");
    openapiFields.add("landing_type");
    openapiFields.add("platform");
    openapiFields.add("pricing");
    openapiFields.add("pricing_category");
    openapiFields.add("query");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AsyncTaskCreateV2RequestTaskParamsFiltering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AsyncTaskCreateV2RequestTaskParamsFiltering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AsyncTaskCreateV2RequestTaskParamsFiltering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AsyncTaskCreateV2RequestTaskParamsFiltering.class));

       return (TypeAdapter<T>) new TypeAdapter<AsyncTaskCreateV2RequestTaskParamsFiltering>() {
           @Override
           public void write(JsonWriter out, AsyncTaskCreateV2RequestTaskParamsFiltering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AsyncTaskCreateV2RequestTaskParamsFiltering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AsyncTaskCreateV2RequestTaskParamsFiltering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AsyncTaskCreateV2RequestTaskParamsFiltering
  * @throws IOException if the JSON string is invalid with respect to AsyncTaskCreateV2RequestTaskParamsFiltering
  */
  public static AsyncTaskCreateV2RequestTaskParamsFiltering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AsyncTaskCreateV2RequestTaskParamsFiltering.class);
  }

 /**
  * Convert an instance of AsyncTaskCreateV2RequestTaskParamsFiltering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

