/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * BudgetGroupUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class BudgetGroupUpdateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_BUDGET = "budget_group_budget";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_BUDGET)
  private Double budgetGroupBudget = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_ID = "budget_group_id";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_ID)
  private Long budgetGroupId = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_NAME = "budget_group_name";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_NAME)
  private String budgetGroupName = null;

  public BudgetGroupUpdateV30Request() {
  }

  public BudgetGroupUpdateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public BudgetGroupUpdateV30Request budgetGroupBudget(Double budgetGroupBudget) {
    
    this.budgetGroupBudget = budgetGroupBudget;
    return this;
  }

   /**
   * 更新后的预算组日预算
   * @return budgetGroupBudget
  **/
  @javax.annotation.Nullable
  public Double getBudgetGroupBudget() {
    return budgetGroupBudget;
  }


  public void setBudgetGroupBudget(Double budgetGroupBudget) {
    this.budgetGroupBudget = budgetGroupBudget;
  }


  public BudgetGroupUpdateV30Request budgetGroupId(Long budgetGroupId) {
    
    this.budgetGroupId = budgetGroupId;
    return this;
  }

   /**
   * 需要更新的预算组id
   * @return budgetGroupId
  **/
  @javax.annotation.Nonnull
  public Long getBudgetGroupId() {
    return budgetGroupId;
  }


  public void setBudgetGroupId(Long budgetGroupId) {
    this.budgetGroupId = budgetGroupId;
  }


  public BudgetGroupUpdateV30Request budgetGroupName(String budgetGroupName) {
    
    this.budgetGroupName = budgetGroupName;
    return this;
  }

   /**
   * 更新后的预算组名称
   * @return budgetGroupName
  **/
  @javax.annotation.Nullable
  public String getBudgetGroupName() {
    return budgetGroupName;
  }


  public void setBudgetGroupName(String budgetGroupName) {
    this.budgetGroupName = budgetGroupName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetGroupUpdateV30Request budgetGroupUpdateV30Request = (BudgetGroupUpdateV30Request) o;
    return Objects.equals(this.advertiserId, budgetGroupUpdateV30Request.advertiserId) &&
        Objects.equals(this.budgetGroupBudget, budgetGroupUpdateV30Request.budgetGroupBudget) &&
        Objects.equals(this.budgetGroupId, budgetGroupUpdateV30Request.budgetGroupId) &&
        Objects.equals(this.budgetGroupName, budgetGroupUpdateV30Request.budgetGroupName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budgetGroupBudget, budgetGroupId, budgetGroupName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupUpdateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetGroupBudget: ").append(toIndentedString(budgetGroupBudget)).append("\n");
    sb.append("    budgetGroupId: ").append(toIndentedString(budgetGroupId)).append("\n");
    sb.append("    budgetGroupName: ").append(toIndentedString(budgetGroupName)).append("\n");
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
    openapiFields.add("budget_group_id");
    openapiFields.add("budget_group_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget_group_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetGroupUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, BudgetGroupUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupUpdateV30Request
  */
  public static BudgetGroupUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupUpdateV30Request.class);
  }

 /**
  * Convert an instance of BudgetGroupUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

