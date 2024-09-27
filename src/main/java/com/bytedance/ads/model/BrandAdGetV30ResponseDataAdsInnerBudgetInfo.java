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
import com.bytedance.ads.model.BrandAdGetV30DataAdsBudgetInfoGdSendType;
import com.bytedance.ads.model.BrandAdGetV30DataAdsBudgetInfoPricingType;
import com.bytedance.ads.model.BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * 预算信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class BrandAdGetV30ResponseDataAdsInnerBudgetInfo {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_DAILY_QUANTITY = "daily_quantity";
  @SerializedName(SERIALIZED_NAME_DAILY_QUANTITY)
  private Map<String, Long> dailyQuantity = null;

  public static final String SERIALIZED_NAME_GD_SEND_TYPE = "gd_send_type";
  @SerializedName(SERIALIZED_NAME_GD_SEND_TYPE)
  private BrandAdGetV30DataAdsBudgetInfoGdSendType gdSendType = null;

  public static final String SERIALIZED_NAME_PRICING_TYPE = "pricing_type";
  @SerializedName(SERIALIZED_NAME_PRICING_TYPE)
  private BrandAdGetV30DataAdsBudgetInfoPricingType pricingType = null;

  public static final String SERIALIZED_NAME_QUANTITY_INFO = "quantity_info";
  @SerializedName(SERIALIZED_NAME_QUANTITY_INFO)
  private List<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner> quantityInfo = null;

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo() {
  }

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 出价
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo dailyQuantity(Map<String, Long> dailyQuantity) {
    
    this.dailyQuantity = dailyQuantity;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo putDailyQuantityItem(String key, Long dailyQuantityItem) {
    if (this.dailyQuantity == null) {
      this.dailyQuantity = new HashMap<>();
    }
    this.dailyQuantity.put(key, dailyQuantityItem);
    return this;
  }

   /**
   * 
   * @return dailyQuantity
  **/
  @javax.annotation.Nullable
  public Map<String, Long> getDailyQuantity() {
    return dailyQuantity;
  }


  public void setDailyQuantity(Map<String, Long> dailyQuantity) {
    this.dailyQuantity = dailyQuantity;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo gdSendType(BrandAdGetV30DataAdsBudgetInfoGdSendType gdSendType) {
    
    this.gdSendType = gdSendType;
    return this;
  }

   /**
   * Get gdSendType
   * @return gdSendType
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsBudgetInfoGdSendType getGdSendType() {
    return gdSendType;
  }


  public void setGdSendType(BrandAdGetV30DataAdsBudgetInfoGdSendType gdSendType) {
    this.gdSendType = gdSendType;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo pricingType(BrandAdGetV30DataAdsBudgetInfoPricingType pricingType) {
    
    this.pricingType = pricingType;
    return this;
  }

   /**
   * Get pricingType
   * @return pricingType
  **/
  @javax.annotation.Nullable
  public BrandAdGetV30DataAdsBudgetInfoPricingType getPricingType() {
    return pricingType;
  }


  public void setPricingType(BrandAdGetV30DataAdsBudgetInfoPricingType pricingType) {
    this.pricingType = pricingType;
  }


  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo quantityInfo(List<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner> quantityInfo) {
    
    this.quantityInfo = quantityInfo;
    return this;
  }

  public BrandAdGetV30ResponseDataAdsInnerBudgetInfo addQuantityInfoItem(BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner quantityInfoItem) {
    if (this.quantityInfo == null) {
      this.quantityInfo = new ArrayList<>();
    }
    this.quantityInfo.add(quantityInfoItem);
    return this;
  }

   /**
   * 投放量
   * @return quantityInfo
  **/
  @javax.annotation.Nullable
  public List<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner> getQuantityInfo() {
    return quantityInfo;
  }


  public void setQuantityInfo(List<BrandAdGetV30ResponseDataAdsInnerBudgetInfoQuantityInfoInner> quantityInfo) {
    this.quantityInfo = quantityInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdGetV30ResponseDataAdsInnerBudgetInfo brandAdGetV30ResponseDataAdsInnerBudgetInfo = (BrandAdGetV30ResponseDataAdsInnerBudgetInfo) o;
    return Objects.equals(this.bid, brandAdGetV30ResponseDataAdsInnerBudgetInfo.bid) &&
        Objects.equals(this.budget, brandAdGetV30ResponseDataAdsInnerBudgetInfo.budget) &&
        Objects.equals(this.dailyQuantity, brandAdGetV30ResponseDataAdsInnerBudgetInfo.dailyQuantity) &&
        Objects.equals(this.gdSendType, brandAdGetV30ResponseDataAdsInnerBudgetInfo.gdSendType) &&
        Objects.equals(this.pricingType, brandAdGetV30ResponseDataAdsInnerBudgetInfo.pricingType) &&
        Objects.equals(this.quantityInfo, brandAdGetV30ResponseDataAdsInnerBudgetInfo.quantityInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, budget, dailyQuantity, gdSendType, pricingType, quantityInfo);
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
    sb.append("class BrandAdGetV30ResponseDataAdsInnerBudgetInfo {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    dailyQuantity: ").append(toIndentedString(dailyQuantity)).append("\n");
    sb.append("    gdSendType: ").append(toIndentedString(gdSendType)).append("\n");
    sb.append("    pricingType: ").append(toIndentedString(pricingType)).append("\n");
    sb.append("    quantityInfo: ").append(toIndentedString(quantityInfo)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("budget");
    openapiFields.add("daily_quantity");
    openapiFields.add("gd_send_type");
    openapiFields.add("pricing_type");
    openapiFields.add("quantity_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("quantity_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdGetV30ResponseDataAdsInnerBudgetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdGetV30ResponseDataAdsInnerBudgetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdGetV30ResponseDataAdsInnerBudgetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdGetV30ResponseDataAdsInnerBudgetInfo>() {
           @Override
           public void write(JsonWriter out, BrandAdGetV30ResponseDataAdsInnerBudgetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdGetV30ResponseDataAdsInnerBudgetInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfo
  * @throws IOException if the JSON string is invalid with respect to BrandAdGetV30ResponseDataAdsInnerBudgetInfo
  */
  public static BrandAdGetV30ResponseDataAdsInnerBudgetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdGetV30ResponseDataAdsInnerBudgetInfo.class);
  }

 /**
  * Convert an instance of BrandAdGetV30ResponseDataAdsInnerBudgetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

