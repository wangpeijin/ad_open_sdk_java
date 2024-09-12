/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2RequestCampaignListInner;
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
 * ToolsPrivativeWordCampaignAddV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordCampaignAddV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_LIST = "campaign_list";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_LIST)
  private List<ToolsPrivativeWordCampaignAddV2RequestCampaignListInner> campaignList = null;

  public ToolsPrivativeWordCampaignAddV2Request() {
  }

  public ToolsPrivativeWordCampaignAddV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsPrivativeWordCampaignAddV2Request campaignList(List<ToolsPrivativeWordCampaignAddV2RequestCampaignListInner> campaignList) {
    
    this.campaignList = campaignList;
    return this;
  }

  public ToolsPrivativeWordCampaignAddV2Request addCampaignListItem(ToolsPrivativeWordCampaignAddV2RequestCampaignListInner campaignListItem) {
    if (this.campaignList == null) {
      this.campaignList = new ArrayList<>();
    }
    this.campaignList.add(campaignListItem);
    return this;
  }

   /**
   * 
   * @return campaignList
  **/
  @javax.annotation.Nonnull
  public List<ToolsPrivativeWordCampaignAddV2RequestCampaignListInner> getCampaignList() {
    return campaignList;
  }


  public void setCampaignList(List<ToolsPrivativeWordCampaignAddV2RequestCampaignListInner> campaignList) {
    this.campaignList = campaignList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsPrivativeWordCampaignAddV2Request toolsPrivativeWordCampaignAddV2Request = (ToolsPrivativeWordCampaignAddV2Request) o;
    return Objects.equals(this.advertiserId, toolsPrivativeWordCampaignAddV2Request.advertiserId) &&
        Objects.equals(this.campaignList, toolsPrivativeWordCampaignAddV2Request.campaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, campaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordCampaignAddV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    campaignList: ").append(toIndentedString(campaignList)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("campaign_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_list");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordCampaignAddV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordCampaignAddV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordCampaignAddV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordCampaignAddV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordCampaignAddV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordCampaignAddV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordCampaignAddV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordCampaignAddV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordCampaignAddV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordCampaignAddV2Request
  */
  public static ToolsPrivativeWordCampaignAddV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordCampaignAddV2Request.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordCampaignAddV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

