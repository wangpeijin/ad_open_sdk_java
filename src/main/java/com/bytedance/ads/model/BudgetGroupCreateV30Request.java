/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.BudgetGroupCreateV30CampaignType;
import com.bytedance.ads.model.BudgetGroupCreateV30DeliveryMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * BudgetGroupCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class BudgetGroupCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_BUDGET = "budget_group_budget";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_BUDGET)
  private Double budgetGroupBudget = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_NAME = "budget_group_name";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_NAME)
  private String budgetGroupName = null;

  public static final String SERIALIZED_NAME_CAMPAIGN_TYPE = "campaign_type";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_TYPE)
  private BudgetGroupCreateV30CampaignType campaignType = null;

  public static final String SERIALIZED_NAME_DELIVERY_MODE = "delivery_mode";
  @SerializedName(SERIALIZED_NAME_DELIVERY_MODE)
  private BudgetGroupCreateV30DeliveryMode deliveryMode = null;

  public BudgetGroupCreateV30Request() {
  }

  public BudgetGroupCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主 ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BudgetGroupCreateV30Request budgetGroupBudget(Double budgetGroupBudget) {
    
    this.budgetGroupBudget = budgetGroupBudget;
    return this;
  }

   /**
   * 日预算，单位：元，范围：[300，9,999,999]，预算组中的每个项目在实际消耗时，以【项目、预算组】中较低预算为准
   * @return budgetGroupBudget
  **/
  @javax.annotation.Nonnull
  public Double getBudgetGroupBudget() {
    return budgetGroupBudget;
  }


  public void setBudgetGroupBudget(Double budgetGroupBudget) {
    this.budgetGroupBudget = budgetGroupBudget;
  }


  public BudgetGroupCreateV30Request budgetGroupName(String budgetGroupName) {
    
    this.budgetGroupName = budgetGroupName;
    return this;
  }

   /**
   * 预算组名称，50个字以内，预算组之间名称不可重复，不可为空
   * @return budgetGroupName
  **/
  @javax.annotation.Nonnull
  public String getBudgetGroupName() {
    return budgetGroupName;
  }


  public void setBudgetGroupName(String budgetGroupName) {
    this.budgetGroupName = budgetGroupName;
  }


  public BudgetGroupCreateV30Request campaignType(BudgetGroupCreateV30CampaignType campaignType) {
    
    this.campaignType = campaignType;
    return this;
  }

   /**
   * Get campaignType
   * @return campaignType
  **/
  @javax.annotation.Nonnull
  public BudgetGroupCreateV30CampaignType getCampaignType() {
    return campaignType;
  }


  public void setCampaignType(BudgetGroupCreateV30CampaignType campaignType) {
    this.campaignType = campaignType;
  }


  public BudgetGroupCreateV30Request deliveryMode(BudgetGroupCreateV30DeliveryMode deliveryMode) {
    
    this.deliveryMode = deliveryMode;
    return this;
  }

   /**
   * Get deliveryMode
   * @return deliveryMode
  **/
  @javax.annotation.Nonnull
  public BudgetGroupCreateV30DeliveryMode getDeliveryMode() {
    return deliveryMode;
  }


  public void setDeliveryMode(BudgetGroupCreateV30DeliveryMode deliveryMode) {
    this.deliveryMode = deliveryMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetGroupCreateV30Request budgetGroupCreateV30Request = (BudgetGroupCreateV30Request) o;
    return Objects.equals(this.advertiserId, budgetGroupCreateV30Request.advertiserId) &&
        Objects.equals(this.budgetGroupBudget, budgetGroupCreateV30Request.budgetGroupBudget) &&
        Objects.equals(this.budgetGroupName, budgetGroupCreateV30Request.budgetGroupName) &&
        Objects.equals(this.campaignType, budgetGroupCreateV30Request.campaignType) &&
        Objects.equals(this.deliveryMode, budgetGroupCreateV30Request.deliveryMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budgetGroupBudget, budgetGroupName, campaignType, deliveryMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetGroupBudget: ").append(toIndentedString(budgetGroupBudget)).append("\n");
    sb.append("    budgetGroupName: ").append(toIndentedString(budgetGroupName)).append("\n");
    sb.append("    campaignType: ").append(toIndentedString(campaignType)).append("\n");
    sb.append("    deliveryMode: ").append(toIndentedString(deliveryMode)).append("\n");
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
    openapiFields.add("budget_group_budget");
    openapiFields.add("budget_group_name");
    openapiFields.add("campaign_type");
    openapiFields.add("delivery_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget_group_budget");
    openapiRequiredFields.add("budget_group_name");
    openapiRequiredFields.add("campaign_type");
    openapiRequiredFields.add("delivery_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetGroupCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupCreateV30Request>() {
           @Override
           public void write(JsonWriter out, BudgetGroupCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupCreateV30Request
  */
  public static BudgetGroupCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupCreateV30Request.class);
  }

 /**
  * Convert an instance of BudgetGroupCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

