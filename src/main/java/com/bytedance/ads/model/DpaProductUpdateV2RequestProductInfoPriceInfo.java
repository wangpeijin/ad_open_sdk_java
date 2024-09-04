/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class DpaProductUpdateV2RequestProductInfoPriceInfo {
  public static final String SERIALIZED_NAME_DAILY_MORTGAGE = "daily_mortgage";
  @SerializedName(SERIALIZED_NAME_DAILY_MORTGAGE)
  private String dailyMortgage = null;

  public static final String SERIALIZED_NAME_DISCOUNT = "discount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT)
  private Double discount = null;

  public static final String SERIALIZED_NAME_DOWN_PAYMENT = "down_payment";
  @SerializedName(SERIALIZED_NAME_DOWN_PAYMENT)
  private String downPayment = null;

  public static final String SERIALIZED_NAME_MORTGAGE = "mortgage";
  @SerializedName(SERIALIZED_NAME_MORTGAGE)
  private String mortgage = null;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Double price = null;

  public static final String SERIALIZED_NAME_PRICE_UNIT = "price_unit";
  @SerializedName(SERIALIZED_NAME_PRICE_UNIT)
  private String priceUnit = null;

  public static final String SERIALIZED_NAME_SALES_PROMOTION = "sales_promotion";
  @SerializedName(SERIALIZED_NAME_SALES_PROMOTION)
  private String salesPromotion = null;

  public static final String SERIALIZED_NAME_SAVING = "saving";
  @SerializedName(SERIALIZED_NAME_SAVING)
  private Double saving = null;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private Double value = null;

  public DpaProductUpdateV2RequestProductInfoPriceInfo() {
  }

  public DpaProductUpdateV2RequestProductInfoPriceInfo dailyMortgage(String dailyMortgage) {
    
    this.dailyMortgage = dailyMortgage;
    return this;
  }

   /**
   * 
   * @return dailyMortgage
  **/
  @javax.annotation.Nullable
  public String getDailyMortgage() {
    return dailyMortgage;
  }


  public void setDailyMortgage(String dailyMortgage) {
    this.dailyMortgage = dailyMortgage;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo discount(Double discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 
   * @return discount
  **/
  @javax.annotation.Nullable
  public Double getDiscount() {
    return discount;
  }


  public void setDiscount(Double discount) {
    this.discount = discount;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo downPayment(String downPayment) {
    
    this.downPayment = downPayment;
    return this;
  }

   /**
   * 
   * @return downPayment
  **/
  @javax.annotation.Nullable
  public String getDownPayment() {
    return downPayment;
  }


  public void setDownPayment(String downPayment) {
    this.downPayment = downPayment;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo mortgage(String mortgage) {
    
    this.mortgage = mortgage;
    return this;
  }

   /**
   * 
   * @return mortgage
  **/
  @javax.annotation.Nullable
  public String getMortgage() {
    return mortgage;
  }


  public void setMortgage(String mortgage) {
    this.mortgage = mortgage;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * 
   * @return price
  **/
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo priceUnit(String priceUnit) {
    
    this.priceUnit = priceUnit;
    return this;
  }

   /**
   * 
   * @return priceUnit
  **/
  @javax.annotation.Nullable
  public String getPriceUnit() {
    return priceUnit;
  }


  public void setPriceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo salesPromotion(String salesPromotion) {
    
    this.salesPromotion = salesPromotion;
    return this;
  }

   /**
   * 
   * @return salesPromotion
  **/
  @javax.annotation.Nullable
  public String getSalesPromotion() {
    return salesPromotion;
  }


  public void setSalesPromotion(String salesPromotion) {
    this.salesPromotion = salesPromotion;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo saving(Double saving) {
    
    this.saving = saving;
    return this;
  }

   /**
   * 
   * @return saving
  **/
  @javax.annotation.Nullable
  public Double getSaving() {
    return saving;
  }


  public void setSaving(Double saving) {
    this.saving = saving;
  }


  public DpaProductUpdateV2RequestProductInfoPriceInfo value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 
   * @return value
  **/
  @javax.annotation.Nullable
  public Double getValue() {
    return value;
  }


  public void setValue(Double value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductUpdateV2RequestProductInfoPriceInfo dpaProductUpdateV2RequestProductInfoPriceInfo = (DpaProductUpdateV2RequestProductInfoPriceInfo) o;
    return Objects.equals(this.dailyMortgage, dpaProductUpdateV2RequestProductInfoPriceInfo.dailyMortgage) &&
        Objects.equals(this.discount, dpaProductUpdateV2RequestProductInfoPriceInfo.discount) &&
        Objects.equals(this.downPayment, dpaProductUpdateV2RequestProductInfoPriceInfo.downPayment) &&
        Objects.equals(this.mortgage, dpaProductUpdateV2RequestProductInfoPriceInfo.mortgage) &&
        Objects.equals(this.price, dpaProductUpdateV2RequestProductInfoPriceInfo.price) &&
        Objects.equals(this.priceUnit, dpaProductUpdateV2RequestProductInfoPriceInfo.priceUnit) &&
        Objects.equals(this.salesPromotion, dpaProductUpdateV2RequestProductInfoPriceInfo.salesPromotion) &&
        Objects.equals(this.saving, dpaProductUpdateV2RequestProductInfoPriceInfo.saving) &&
        Objects.equals(this.value, dpaProductUpdateV2RequestProductInfoPriceInfo.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMortgage, discount, downPayment, mortgage, price, priceUnit, salesPromotion, saving, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductUpdateV2RequestProductInfoPriceInfo {\n");
    sb.append("    dailyMortgage: ").append(toIndentedString(dailyMortgage)).append("\n");
    sb.append("    discount: ").append(toIndentedString(discount)).append("\n");
    sb.append("    downPayment: ").append(toIndentedString(downPayment)).append("\n");
    sb.append("    mortgage: ").append(toIndentedString(mortgage)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    priceUnit: ").append(toIndentedString(priceUnit)).append("\n");
    sb.append("    salesPromotion: ").append(toIndentedString(salesPromotion)).append("\n");
    sb.append("    saving: ").append(toIndentedString(saving)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("daily_mortgage");
    openapiFields.add("discount");
    openapiFields.add("down_payment");
    openapiFields.add("mortgage");
    openapiFields.add("price");
    openapiFields.add("price_unit");
    openapiFields.add("sales_promotion");
    openapiFields.add("saving");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductUpdateV2RequestProductInfoPriceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductUpdateV2RequestProductInfoPriceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductUpdateV2RequestProductInfoPriceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductUpdateV2RequestProductInfoPriceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductUpdateV2RequestProductInfoPriceInfo>() {
           @Override
           public void write(JsonWriter out, DpaProductUpdateV2RequestProductInfoPriceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductUpdateV2RequestProductInfoPriceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductUpdateV2RequestProductInfoPriceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductUpdateV2RequestProductInfoPriceInfo
  * @throws IOException if the JSON string is invalid with respect to DpaProductUpdateV2RequestProductInfoPriceInfo
  */
  public static DpaProductUpdateV2RequestProductInfoPriceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductUpdateV2RequestProductInfoPriceInfo.class);
  }

 /**
  * Convert an instance of DpaProductUpdateV2RequestProductInfoPriceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

