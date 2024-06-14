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
import com.bytedance.ads.model.AdGetV2FilteringStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class AdGetV2Filtering {
  public static final String SERIALIZED_NAME_AD_CREATE_TIME = "ad_create_time";
  @SerializedName(SERIALIZED_NAME_AD_CREATE_TIME)
  private String adCreateTime = null;

  public static final String SERIALIZED_NAME_AD_MODIFY_TIME = "ad_modify_time";
  @SerializedName(SERIALIZED_NAME_AD_MODIFY_TIME)
  private String adModifyTime = null;

  public static final String SERIALIZED_NAME_AD_NAME = "ad_name";
  @SerializedName(SERIALIZED_NAME_AD_NAME)
  private String adName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_IDS = "ids";
  @SerializedName(SERIALIZED_NAME_IDS)
  private List<Long> ids = null;

  public static final String SERIALIZED_NAME_PRICING_LIST = "pricing_list";
  @SerializedName(SERIALIZED_NAME_PRICING_LIST)
  private List<String> pricingList = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private AdGetV2FilteringStatus status = null;

  public AdGetV2Filtering() {
  }

  public AdGetV2Filtering adCreateTime(String adCreateTime) {
    
    this.adCreateTime = adCreateTime;
    return this;
  }

   /**
   * 
   * @return adCreateTime
  **/
  @javax.annotation.Nullable
  public String getAdCreateTime() {
    return adCreateTime;
  }


  public void setAdCreateTime(String adCreateTime) {
    this.adCreateTime = adCreateTime;
  }


  public AdGetV2Filtering adModifyTime(String adModifyTime) {
    
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


  public AdGetV2Filtering adName(String adName) {
    
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


  public AdGetV2Filtering campaignId(Long campaignId) {
    
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


  public AdGetV2Filtering ids(List<Long> ids) {
    
    this.ids = ids;
    return this;
  }

  public AdGetV2Filtering addIdsItem(Long idsItem) {
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


  public AdGetV2Filtering pricingList(List<String> pricingList) {
    
    this.pricingList = pricingList;
    return this;
  }

  public AdGetV2Filtering addPricingListItem(String pricingListItem) {
    if (this.pricingList == null) {
      this.pricingList = new ArrayList<>();
    }
    this.pricingList.add(pricingListItem);
    return this;
  }

   /**
   * 
   * @return pricingList
  **/
  @javax.annotation.Nullable
  public List<String> getPricingList() {
    return pricingList;
  }


  public void setPricingList(List<String> pricingList) {
    this.pricingList = pricingList;
  }


  public AdGetV2Filtering status(AdGetV2FilteringStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public AdGetV2FilteringStatus getStatus() {
    return status;
  }


  public void setStatus(AdGetV2FilteringStatus status) {
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
    AdGetV2Filtering adGetV2Filtering = (AdGetV2Filtering) o;
    return Objects.equals(this.adCreateTime, adGetV2Filtering.adCreateTime) &&
        Objects.equals(this.adModifyTime, adGetV2Filtering.adModifyTime) &&
        Objects.equals(this.adName, adGetV2Filtering.adName) &&
        Objects.equals(this.campaignId, adGetV2Filtering.campaignId) &&
        Objects.equals(this.ids, adGetV2Filtering.ids) &&
        Objects.equals(this.pricingList, adGetV2Filtering.pricingList) &&
        Objects.equals(this.status, adGetV2Filtering.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCreateTime, adModifyTime, adName, campaignId, ids, pricingList, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdGetV2Filtering {\n");
    sb.append("    adCreateTime: ").append(toIndentedString(adCreateTime)).append("\n");
    sb.append("    adModifyTime: ").append(toIndentedString(adModifyTime)).append("\n");
    sb.append("    adName: ").append(toIndentedString(adName)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
    sb.append("    pricingList: ").append(toIndentedString(pricingList)).append("\n");
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
    openapiFields.add("ad_create_time");
    openapiFields.add("ad_modify_time");
    openapiFields.add("ad_name");
    openapiFields.add("campaign_id");
    openapiFields.add("ids");
    openapiFields.add("pricing_list");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<AdGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, AdGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to AdGetV2Filtering
  */
  public static AdGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdGetV2Filtering.class);
  }

 /**
  * Convert an instance of AdGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

