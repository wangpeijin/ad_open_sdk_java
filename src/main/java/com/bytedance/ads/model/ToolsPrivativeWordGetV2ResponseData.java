/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner;
import com.bytedance.ads.model.ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordGetV2ResponseData {
  public static final String SERIALIZED_NAME_AD_ERROR_LIST = "ad_error_list";
  @SerializedName(SERIALIZED_NAME_AD_ERROR_LIST)
  private List<Long> adErrorList = null;

  public static final String SERIALIZED_NAME_ADS_PRIVATIVE = "ads_privative";
  @SerializedName(SERIALIZED_NAME_ADS_PRIVATIVE)
  private List<ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner> adsPrivative = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ERROR_LIST = "campaign_error_list";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ERROR_LIST)
  private List<Long> campaignErrorList = null;

  public static final String SERIALIZED_NAME_CAMPAIGNS_PRIVATIVE = "campaigns_privative";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS_PRIVATIVE)
  private List<ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner> campaignsPrivative = null;

  public ToolsPrivativeWordGetV2ResponseData() {
  }

  public ToolsPrivativeWordGetV2ResponseData adErrorList(List<Long> adErrorList) {
    
    this.adErrorList = adErrorList;
    return this;
  }

  public ToolsPrivativeWordGetV2ResponseData addAdErrorListItem(Long adErrorListItem) {
    if (this.adErrorList == null) {
      this.adErrorList = new ArrayList<>();
    }
    this.adErrorList.add(adErrorListItem);
    return this;
  }

   /**
   * 
   * @return adErrorList
  **/
  @javax.annotation.Nullable
  public List<Long> getAdErrorList() {
    return adErrorList;
  }


  public void setAdErrorList(List<Long> adErrorList) {
    this.adErrorList = adErrorList;
  }


  public ToolsPrivativeWordGetV2ResponseData adsPrivative(List<ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner> adsPrivative) {
    
    this.adsPrivative = adsPrivative;
    return this;
  }

  public ToolsPrivativeWordGetV2ResponseData addAdsPrivativeItem(ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner adsPrivativeItem) {
    if (this.adsPrivative == null) {
      this.adsPrivative = new ArrayList<>();
    }
    this.adsPrivative.add(adsPrivativeItem);
    return this;
  }

   /**
   * 
   * @return adsPrivative
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner> getAdsPrivative() {
    return adsPrivative;
  }


  public void setAdsPrivative(List<ToolsPrivativeWordGetV2ResponseDataAdsPrivativeInner> adsPrivative) {
    this.adsPrivative = adsPrivative;
  }


  public ToolsPrivativeWordGetV2ResponseData campaignErrorList(List<Long> campaignErrorList) {
    
    this.campaignErrorList = campaignErrorList;
    return this;
  }

  public ToolsPrivativeWordGetV2ResponseData addCampaignErrorListItem(Long campaignErrorListItem) {
    if (this.campaignErrorList == null) {
      this.campaignErrorList = new ArrayList<>();
    }
    this.campaignErrorList.add(campaignErrorListItem);
    return this;
  }

   /**
   * 
   * @return campaignErrorList
  **/
  @javax.annotation.Nullable
  public List<Long> getCampaignErrorList() {
    return campaignErrorList;
  }


  public void setCampaignErrorList(List<Long> campaignErrorList) {
    this.campaignErrorList = campaignErrorList;
  }


  public ToolsPrivativeWordGetV2ResponseData campaignsPrivative(List<ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner> campaignsPrivative) {
    
    this.campaignsPrivative = campaignsPrivative;
    return this;
  }

  public ToolsPrivativeWordGetV2ResponseData addCampaignsPrivativeItem(ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner campaignsPrivativeItem) {
    if (this.campaignsPrivative == null) {
      this.campaignsPrivative = new ArrayList<>();
    }
    this.campaignsPrivative.add(campaignsPrivativeItem);
    return this;
  }

   /**
   * 
   * @return campaignsPrivative
  **/
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner> getCampaignsPrivative() {
    return campaignsPrivative;
  }


  public void setCampaignsPrivative(List<ToolsPrivativeWordGetV2ResponseDataCampaignsPrivativeInner> campaignsPrivative) {
    this.campaignsPrivative = campaignsPrivative;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordGetV2ResponseData toolsPrivativeWordGetV2ResponseData = (ToolsPrivativeWordGetV2ResponseData) o;
    return Objects.equals(this.adErrorList, toolsPrivativeWordGetV2ResponseData.adErrorList) &&
        Objects.equals(this.adsPrivative, toolsPrivativeWordGetV2ResponseData.adsPrivative) &&
        Objects.equals(this.campaignErrorList, toolsPrivativeWordGetV2ResponseData.campaignErrorList) &&
        Objects.equals(this.campaignsPrivative, toolsPrivativeWordGetV2ResponseData.campaignsPrivative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adErrorList, adsPrivative, campaignErrorList, campaignsPrivative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordGetV2ResponseData {\n");
    sb.append("    adErrorList: ").append(toIndentedString(adErrorList)).append("\n");
    sb.append("    adsPrivative: ").append(toIndentedString(adsPrivative)).append("\n");
    sb.append("    campaignErrorList: ").append(toIndentedString(campaignErrorList)).append("\n");
    sb.append("    campaignsPrivative: ").append(toIndentedString(campaignsPrivative)).append("\n");
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
    openapiFields.add("ad_error_list");
    openapiFields.add("ads_privative");
    openapiFields.add("campaign_error_list");
    openapiFields.add("campaigns_privative");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordGetV2ResponseData
  */
  public static ToolsPrivativeWordGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordGetV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

