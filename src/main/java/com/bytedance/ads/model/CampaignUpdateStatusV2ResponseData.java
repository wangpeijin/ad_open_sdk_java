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
import com.bytedance.ads.model.CampaignUpdateStatusV2ResponseDataErrorsInner;
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
public class CampaignUpdateStatusV2ResponseData {
  public static final String SERIALIZED_NAME_CAMPAIGN_IDS = "campaign_ids";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_IDS)
  private List<Long> campaignIds = null;

  public static final String SERIALIZED_NAME_ERRORS = "errors";
  @SerializedName(SERIALIZED_NAME_ERRORS)
  private List<CampaignUpdateStatusV2ResponseDataErrorsInner> errors = null;

  public CampaignUpdateStatusV2ResponseData() {
  }

  public CampaignUpdateStatusV2ResponseData campaignIds(List<Long> campaignIds) {
    
    this.campaignIds = campaignIds;
    return this;
  }

  public CampaignUpdateStatusV2ResponseData addCampaignIdsItem(Long campaignIdsItem) {
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


  public CampaignUpdateStatusV2ResponseData errors(List<CampaignUpdateStatusV2ResponseDataErrorsInner> errors) {
    
    this.errors = errors;
    return this;
  }

  public CampaignUpdateStatusV2ResponseData addErrorsItem(CampaignUpdateStatusV2ResponseDataErrorsInner errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * 
   * @return errors
  **/
  @javax.annotation.Nullable
  public List<CampaignUpdateStatusV2ResponseDataErrorsInner> getErrors() {
    return errors;
  }


  public void setErrors(List<CampaignUpdateStatusV2ResponseDataErrorsInner> errors) {
    this.errors = errors;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateStatusV2ResponseData campaignUpdateStatusV2ResponseData = (CampaignUpdateStatusV2ResponseData) o;
    return Objects.equals(this.campaignIds, campaignUpdateStatusV2ResponseData.campaignIds) &&
        Objects.equals(this.errors, campaignUpdateStatusV2ResponseData.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignIds, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateStatusV2ResponseData {\n");
    sb.append("    campaignIds: ").append(toIndentedString(campaignIds)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
    openapiFields.add("campaign_ids");
    openapiFields.add("errors");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignUpdateStatusV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignUpdateStatusV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignUpdateStatusV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignUpdateStatusV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignUpdateStatusV2ResponseData>() {
           @Override
           public void write(JsonWriter out, CampaignUpdateStatusV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignUpdateStatusV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignUpdateStatusV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignUpdateStatusV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to CampaignUpdateStatusV2ResponseData
  */
  public static CampaignUpdateStatusV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignUpdateStatusV2ResponseData.class);
  }

 /**
  * Convert an instance of CampaignUpdateStatusV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

