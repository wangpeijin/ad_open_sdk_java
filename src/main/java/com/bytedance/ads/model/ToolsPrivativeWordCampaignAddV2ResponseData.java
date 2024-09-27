/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class ToolsPrivativeWordCampaignAddV2ResponseData {
  public static final String SERIALIZED_NAME_CAMPAIGN_ERROR_LIST = "campaign_error_list";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ERROR_LIST)
  private List<Long> campaignErrorList = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_LIST = "campaign_list";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_LIST)
  private List<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner> campaignList = null;

  public ToolsPrivativeWordCampaignAddV2ResponseData() {
  }

  public ToolsPrivativeWordCampaignAddV2ResponseData campaignErrorList(List<Long> campaignErrorList) {
    
    this.campaignErrorList = campaignErrorList;
    return this;
  }

  public ToolsPrivativeWordCampaignAddV2ResponseData addCampaignErrorListItem(Long campaignErrorListItem) {
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


  public ToolsPrivativeWordCampaignAddV2ResponseData campaignList(List<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner> campaignList) {
    
    this.campaignList = campaignList;
    return this;
  }

  public ToolsPrivativeWordCampaignAddV2ResponseData addCampaignListItem(ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner campaignListItem) {
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
  @javax.annotation.Nullable
  public List<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner> getCampaignList() {
    return campaignList;
  }


  public void setCampaignList(List<ToolsPrivativeWordCampaignAddV2ResponseDataCampaignListInner> campaignList) {
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
    ToolsPrivativeWordCampaignAddV2ResponseData toolsPrivativeWordCampaignAddV2ResponseData = (ToolsPrivativeWordCampaignAddV2ResponseData) o;
    return Objects.equals(this.campaignErrorList, toolsPrivativeWordCampaignAddV2ResponseData.campaignErrorList) &&
        Objects.equals(this.campaignList, toolsPrivativeWordCampaignAddV2ResponseData.campaignList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignErrorList, campaignList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsPrivativeWordCampaignAddV2ResponseData {\n");
    sb.append("    campaignErrorList: ").append(toIndentedString(campaignErrorList)).append("\n");
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
    openapiFields.add("campaign_error_list");
    openapiFields.add("campaign_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsPrivativeWordCampaignAddV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsPrivativeWordCampaignAddV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsPrivativeWordCampaignAddV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsPrivativeWordCampaignAddV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsPrivativeWordCampaignAddV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsPrivativeWordCampaignAddV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsPrivativeWordCampaignAddV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsPrivativeWordCampaignAddV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsPrivativeWordCampaignAddV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsPrivativeWordCampaignAddV2ResponseData
  */
  public static ToolsPrivativeWordCampaignAddV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsPrivativeWordCampaignAddV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsPrivativeWordCampaignAddV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

