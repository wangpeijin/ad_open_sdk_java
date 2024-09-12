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
import com.bytedance.ads.model.BrandAdCreateV30DateQuantityStockIncreasePackageType;
import com.bytedance.ads.model.BrandAdCreateV30RequestDateQuantityDailyQuantityInner;
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
 * 预订量
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class BrandAdCreateV30RequestDateQuantity {
  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_DAILY_QUANTITY = "daily_quantity";
  @SerializedName(SERIALIZED_NAME_DAILY_QUANTITY)
  private List<BrandAdCreateV30RequestDateQuantityDailyQuantityInner> dailyQuantity = null;

  public static final String SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE = "stock_increase_package_type";
  @SerializedName(SERIALIZED_NAME_STOCK_INCREASE_PACKAGE_TYPE)
  private BrandAdCreateV30DateQuantityStockIncreasePackageType stockIncreasePackageType = null;

  public BrandAdCreateV30RequestDateQuantity() {
  }

  public BrandAdCreateV30RequestDateQuantity budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public BrandAdCreateV30RequestDateQuantity dailyQuantity(List<BrandAdCreateV30RequestDateQuantityDailyQuantityInner> dailyQuantity) {
    
    this.dailyQuantity = dailyQuantity;
    return this;
  }

  public BrandAdCreateV30RequestDateQuantity addDailyQuantityItem(BrandAdCreateV30RequestDateQuantityDailyQuantityInner dailyQuantityItem) {
    if (this.dailyQuantity == null) {
      this.dailyQuantity = new ArrayList<>();
    }
    this.dailyQuantity.add(dailyQuantityItem);
    return this;
  }

   /**
   * 每天的预订量
   * @return dailyQuantity
  **/
  @javax.annotation.Nonnull
  public List<BrandAdCreateV30RequestDateQuantityDailyQuantityInner> getDailyQuantity() {
    return dailyQuantity;
  }


  public void setDailyQuantity(List<BrandAdCreateV30RequestDateQuantityDailyQuantityInner> dailyQuantity) {
    this.dailyQuantity = dailyQuantity;
  }


  public BrandAdCreateV30RequestDateQuantity stockIncreasePackageType(BrandAdCreateV30DateQuantityStockIncreasePackageType stockIncreasePackageType) {
    
    this.stockIncreasePackageType = stockIncreasePackageType;
    return this;
  }

   /**
   * Get stockIncreasePackageType
   * @return stockIncreasePackageType
  **/
  @javax.annotation.Nullable
  public BrandAdCreateV30DateQuantityStockIncreasePackageType getStockIncreasePackageType() {
    return stockIncreasePackageType;
  }


  public void setStockIncreasePackageType(BrandAdCreateV30DateQuantityStockIncreasePackageType stockIncreasePackageType) {
    this.stockIncreasePackageType = stockIncreasePackageType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandAdCreateV30RequestDateQuantity brandAdCreateV30RequestDateQuantity = (BrandAdCreateV30RequestDateQuantity) o;
    return Objects.equals(this.budget, brandAdCreateV30RequestDateQuantity.budget) &&
        Objects.equals(this.dailyQuantity, brandAdCreateV30RequestDateQuantity.dailyQuantity) &&
        Objects.equals(this.stockIncreasePackageType, brandAdCreateV30RequestDateQuantity.stockIncreasePackageType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budget, dailyQuantity, stockIncreasePackageType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandAdCreateV30RequestDateQuantity {\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    dailyQuantity: ").append(toIndentedString(dailyQuantity)).append("\n");
    sb.append("    stockIncreasePackageType: ").append(toIndentedString(stockIncreasePackageType)).append("\n");
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
    openapiFields.add("daily_quantity");
    openapiFields.add("stock_increase_package_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("daily_quantity");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandAdCreateV30RequestDateQuantity.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandAdCreateV30RequestDateQuantity' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandAdCreateV30RequestDateQuantity> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandAdCreateV30RequestDateQuantity.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandAdCreateV30RequestDateQuantity>() {
           @Override
           public void write(JsonWriter out, BrandAdCreateV30RequestDateQuantity value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandAdCreateV30RequestDateQuantity read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandAdCreateV30RequestDateQuantity given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandAdCreateV30RequestDateQuantity
  * @throws IOException if the JSON string is invalid with respect to BrandAdCreateV30RequestDateQuantity
  */
  public static BrandAdCreateV30RequestDateQuantity fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandAdCreateV30RequestDateQuantity.class);
  }

 /**
  * Convert an instance of BrandAdCreateV30RequestDateQuantity to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

