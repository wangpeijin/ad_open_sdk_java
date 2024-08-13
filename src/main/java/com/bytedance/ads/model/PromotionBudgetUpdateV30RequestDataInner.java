/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionBudgetUpdateV30DataBudgetMode;
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
 * PromotionBudgetUpdateV30RequestDataInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class PromotionBudgetUpdateV30RequestDataInner {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private PromotionBudgetUpdateV30DataBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_PROMOTION_ID = "promotion_id";
  @SerializedName(SERIALIZED_NAME_PROMOTION_ID)
  private Long promotionId = null;

  public PromotionBudgetUpdateV30RequestDataInner() {
  }

  public PromotionBudgetUpdateV30RequestDataInner budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算，单位元
   * minimum: 0
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public PromotionBudgetUpdateV30RequestDataInner budgetMode(PromotionBudgetUpdateV30DataBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public PromotionBudgetUpdateV30DataBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(PromotionBudgetUpdateV30DataBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public PromotionBudgetUpdateV30RequestDataInner promotionId(Long promotionId) {
    
    this.promotionId = promotionId;
    return this;
  }

   /**
   * 广告ID
   * minimum: 1
   * maximum: -9223372036854775616
   * @return promotionId
  **/
  @javax.annotation.Nonnull
  public Long getPromotionId() {
    return promotionId;
  }


  public void setPromotionId(Long promotionId) {
    this.promotionId = promotionId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionBudgetUpdateV30RequestDataInner promotionBudgetUpdateV30RequestDataInner = (PromotionBudgetUpdateV30RequestDataInner) o;
    return Objects.equals(this.budget, promotionBudgetUpdateV30RequestDataInner.budget) &&
        Objects.equals(this.budgetMode, promotionBudgetUpdateV30RequestDataInner.budgetMode) &&
        Objects.equals(this.promotionId, promotionBudgetUpdateV30RequestDataInner.promotionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, budgetMode, promotionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionBudgetUpdateV30RequestDataInner {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    promotionId: ").append(toIndentedString(promotionId)).append("\n");
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
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("promotion_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("promotion_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionBudgetUpdateV30RequestDataInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionBudgetUpdateV30RequestDataInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionBudgetUpdateV30RequestDataInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionBudgetUpdateV30RequestDataInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionBudgetUpdateV30RequestDataInner>() {
           @Override
           public void write(JsonWriter out, PromotionBudgetUpdateV30RequestDataInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionBudgetUpdateV30RequestDataInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionBudgetUpdateV30RequestDataInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionBudgetUpdateV30RequestDataInner
  * @throws IOException if the JSON string is invalid with respect to PromotionBudgetUpdateV30RequestDataInner
  */
  public static PromotionBudgetUpdateV30RequestDataInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionBudgetUpdateV30RequestDataInner.class);
  }

 /**
  * Convert an instance of PromotionBudgetUpdateV30RequestDataInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

