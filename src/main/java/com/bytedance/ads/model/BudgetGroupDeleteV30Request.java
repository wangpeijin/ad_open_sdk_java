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
 * BudgetGroupDeleteV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class BudgetGroupDeleteV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_BUDGET_GROUP_IDS = "budget_group_ids";
  @SerializedName(SERIALIZED_NAME_BUDGET_GROUP_IDS)
  private List<Long> budgetGroupIds = null;

  public BudgetGroupDeleteV30Request() {
  }

  public BudgetGroupDeleteV30Request advertiserId(Long advertiserId) {
    
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


  public BudgetGroupDeleteV30Request budgetGroupIds(List<Long> budgetGroupIds) {
    
    this.budgetGroupIds = budgetGroupIds;
    return this;
  }

  public BudgetGroupDeleteV30Request addBudgetGroupIdsItem(Long budgetGroupIdsItem) {
    if (this.budgetGroupIds == null) {
      this.budgetGroupIds = new ArrayList<>();
    }
    this.budgetGroupIds.add(budgetGroupIdsItem);
    return this;
  }

   /**
   * 要删除的预算组id列表
   * @return budgetGroupIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getBudgetGroupIds() {
    return budgetGroupIds;
  }


  public void setBudgetGroupIds(List<Long> budgetGroupIds) {
    this.budgetGroupIds = budgetGroupIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BudgetGroupDeleteV30Request budgetGroupDeleteV30Request = (BudgetGroupDeleteV30Request) o;
    return Objects.equals(this.advertiserId, budgetGroupDeleteV30Request.advertiserId) &&
        Objects.equals(this.budgetGroupIds, budgetGroupDeleteV30Request.budgetGroupIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, budgetGroupIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BudgetGroupDeleteV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    budgetGroupIds: ").append(toIndentedString(budgetGroupIds)).append("\n");
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
    openapiFields.add("budget_group_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget_group_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BudgetGroupDeleteV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BudgetGroupDeleteV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BudgetGroupDeleteV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BudgetGroupDeleteV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BudgetGroupDeleteV30Request>() {
           @Override
           public void write(JsonWriter out, BudgetGroupDeleteV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BudgetGroupDeleteV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BudgetGroupDeleteV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BudgetGroupDeleteV30Request
  * @throws IOException if the JSON string is invalid with respect to BudgetGroupDeleteV30Request
  */
  public static BudgetGroupDeleteV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BudgetGroupDeleteV30Request.class);
  }

 /**
  * Convert an instance of BudgetGroupDeleteV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

