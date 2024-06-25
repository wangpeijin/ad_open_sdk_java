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
import com.bytedance.ads.model.CampaignUpdateV2BudgetMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.openapitools.jackson.nullable.JsonNullable;

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
 * CampaignUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class CampaignUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private CampaignUpdateV2BudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaign_id";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private Long campaignId = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_NAME = "campaign_name";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_NAME)
  private String campaignName = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public CampaignUpdateV2Request() {
  }

  public CampaignUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public CampaignUpdateV2Request budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * minimum: 0.0
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public CampaignUpdateV2Request budgetMode(CampaignUpdateV2BudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public CampaignUpdateV2BudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(CampaignUpdateV2BudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public CampaignUpdateV2Request campaignId(Long campaignId) {
    
    this.campaignId = campaignId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return campaignId
  **/
  @javax.annotation.Nonnull
  public Long getCampaignId() {
    return campaignId;
  }


  public void setCampaignId(Long campaignId) {
    this.campaignId = campaignId;
  }


  public CampaignUpdateV2Request campaignName(String campaignName) {
    
    this.campaignName = campaignName;
    return this;
  }

   /**
   * 
   * @return campaignName
  **/
  @javax.annotation.Nullable
  public String getCampaignName() {
    return campaignName;
  }


  public void setCampaignName(String campaignName) {
    this.campaignName = campaignName;
  }


  public CampaignUpdateV2Request modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignUpdateV2Request campaignUpdateV2Request = (CampaignUpdateV2Request) o;
    return Objects.equals(this.advertiserId, campaignUpdateV2Request.advertiserId) &&
        Objects.equals(this.budget, campaignUpdateV2Request.budget) &&
        Objects.equals(this.budgetMode, campaignUpdateV2Request.budgetMode) &&
        Objects.equals(this.campaignId, campaignUpdateV2Request.campaignId) &&
        Objects.equals(this.campaignName, campaignUpdateV2Request.campaignName) &&
        Objects.equals(this.modifyTime, campaignUpdateV2Request.modifyTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budget, budgetMode, campaignId, campaignName, modifyTime);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    campaignName: ").append(toIndentedString(campaignName)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("campaign_id");
    openapiFields.add("campaign_name");
    openapiFields.add("modify_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("campaign_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CampaignUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CampaignUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CampaignUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CampaignUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<CampaignUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, CampaignUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CampaignUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CampaignUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CampaignUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to CampaignUpdateV2Request
  */
  public static CampaignUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CampaignUpdateV2Request.class);
  }

 /**
  * Convert an instance of CampaignUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

