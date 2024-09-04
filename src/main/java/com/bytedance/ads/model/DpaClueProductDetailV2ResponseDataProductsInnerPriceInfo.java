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
 * 价格信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo {
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

  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo() {
  }

  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo dailyMortgage(String dailyMortgage) {
    
    this.dailyMortgage = dailyMortgage;
    return this;
  }

   /**
   * 日付
   * @return dailyMortgage
  **/
  @javax.annotation.Nullable
  public String getDailyMortgage() {
    return dailyMortgage;
  }


  public void setDailyMortgage(String dailyMortgage) {
    this.dailyMortgage = dailyMortgage;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo discount(Double discount) {
    
    this.discount = discount;
    return this;
  }

   /**
   * 折扣
   * @return discount
  **/
  @javax.annotation.Nullable
  public Double getDiscount() {
    return discount;
  }


  public void setDiscount(Double discount) {
    this.discount = discount;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo downPayment(String downPayment) {
    
    this.downPayment = downPayment;
    return this;
  }

   /**
   * 月付
   * @return downPayment
  **/
  @javax.annotation.Nullable
  public String getDownPayment() {
    return downPayment;
  }


  public void setDownPayment(String downPayment) {
    this.downPayment = downPayment;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo mortgage(String mortgage) {
    
    this.mortgage = mortgage;
    return this;
  }

   /**
   * 首付
   * @return mortgage
  **/
  @javax.annotation.Nullable
  public String getMortgage() {
    return mortgage;
  }


  public void setMortgage(String mortgage) {
    this.mortgage = mortgage;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo price(Double price) {
    
    this.price = price;
    return this;
  }

   /**
   * 商品现价
   * @return price
  **/
  @javax.annotation.Nullable
  public Double getPrice() {
    return price;
  }


  public void setPrice(Double price) {
    this.price = price;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo priceUnit(String priceUnit) {
    
    this.priceUnit = priceUnit;
    return this;
  }

   /**
   * 价格单位
   * @return priceUnit
  **/
  @javax.annotation.Nullable
  public String getPriceUnit() {
    return priceUnit;
  }


  public void setPriceUnit(String priceUnit) {
    this.priceUnit = priceUnit;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo salesPromotion(String salesPromotion) {
    
    this.salesPromotion = salesPromotion;
    return this;
  }

   /**
   * 促销活动
   * @return salesPromotion
  **/
  @javax.annotation.Nullable
  public String getSalesPromotion() {
    return salesPromotion;
  }


  public void setSalesPromotion(String salesPromotion) {
    this.salesPromotion = salesPromotion;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo saving(Double saving) {
    
    this.saving = saving;
    return this;
  }

   /**
   * 减价
   * @return saving
  **/
  @javax.annotation.Nullable
  public Double getSaving() {
    return saving;
  }


  public void setSaving(Double saving) {
    this.saving = saving;
  }


  public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo value(Double value) {
    
    this.value = value;
    return this;
  }

   /**
   * 商品原价
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
    DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo = (DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo) o;
    return Objects.equals(this.dailyMortgage, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.dailyMortgage) &&
        Objects.equals(this.discount, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.discount) &&
        Objects.equals(this.downPayment, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.downPayment) &&
        Objects.equals(this.mortgage, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.mortgage) &&
        Objects.equals(this.price, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.price) &&
        Objects.equals(this.priceUnit, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.priceUnit) &&
        Objects.equals(this.salesPromotion, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.salesPromotion) &&
        Objects.equals(this.saving, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.saving) &&
        Objects.equals(this.value, dpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.value);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(dailyMortgage, discount, downPayment, mortgage, price, priceUnit, salesPromotion, saving, value);
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
    sb.append("class DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo {\n");
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
       if (!DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo>() {
           @Override
           public void write(JsonWriter out, DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo
  * @throws IOException if the JSON string is invalid with respect to DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo
  */
  public static DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo.class);
  }

 /**
  * Convert an instance of DpaClueProductDetailV2ResponseDataProductsInnerPriceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

