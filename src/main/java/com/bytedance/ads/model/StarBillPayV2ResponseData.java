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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StarBillPayV2ResponseData {
  public static final String SERIALIZED_NAME_ACTUAL_PAY = "actual_pay";
  @SerializedName(SERIALIZED_NAME_ACTUAL_PAY)
  private Long actualPay = null;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance = null;

  public static final String SERIALIZED_NAME_PRECISE_ACTUAL_PAY = "precise_actual_pay";
  @SerializedName(SERIALIZED_NAME_PRECISE_ACTUAL_PAY)
  private Double preciseActualPay = null;

  public static final String SERIALIZED_NAME_PRECISE_BALANCE = "precise_balance";
  @SerializedName(SERIALIZED_NAME_PRECISE_BALANCE)
  private Double preciseBalance = null;

  public StarBillPayV2ResponseData() {
  }

  public StarBillPayV2ResponseData actualPay(Long actualPay) {
    
    this.actualPay = actualPay;
    return this;
  }

   /**
   * 实付金额（单位元，下同）
   * @return actualPay
  **/
  @javax.annotation.Nullable
  public Long getActualPay() {
    return actualPay;
  }


  public void setActualPay(Long actualPay) {
    this.actualPay = actualPay;
  }


  public StarBillPayV2ResponseData balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 付款后账户余额
   * @return balance
  **/
  @javax.annotation.Nullable
  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public StarBillPayV2ResponseData preciseActualPay(Double preciseActualPay) {
    
    this.preciseActualPay = preciseActualPay;
    return this;
  }

   /**
   * 精确实付金额（单位元，下同）
   * @return preciseActualPay
  **/
  @javax.annotation.Nullable
  public Double getPreciseActualPay() {
    return preciseActualPay;
  }


  public void setPreciseActualPay(Double preciseActualPay) {
    this.preciseActualPay = preciseActualPay;
  }


  public StarBillPayV2ResponseData preciseBalance(Double preciseBalance) {
    
    this.preciseBalance = preciseBalance;
    return this;
  }

   /**
   * 精确付款后账户余额
   * @return preciseBalance
  **/
  @javax.annotation.Nullable
  public Double getPreciseBalance() {
    return preciseBalance;
  }


  public void setPreciseBalance(Double preciseBalance) {
    this.preciseBalance = preciseBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarBillPayV2ResponseData starBillPayV2ResponseData = (StarBillPayV2ResponseData) o;
    return Objects.equals(this.actualPay, starBillPayV2ResponseData.actualPay) &&
        Objects.equals(this.balance, starBillPayV2ResponseData.balance) &&
        Objects.equals(this.preciseActualPay, starBillPayV2ResponseData.preciseActualPay) &&
        Objects.equals(this.preciseBalance, starBillPayV2ResponseData.preciseBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualPay, balance, preciseActualPay, preciseBalance);
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
    sb.append("class StarBillPayV2ResponseData {\n");
    sb.append("    actualPay: ").append(toIndentedString(actualPay)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    preciseActualPay: ").append(toIndentedString(preciseActualPay)).append("\n");
    sb.append("    preciseBalance: ").append(toIndentedString(preciseBalance)).append("\n");
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
    openapiFields.add("actual_pay");
    openapiFields.add("balance");
    openapiFields.add("precise_actual_pay");
    openapiFields.add("precise_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarBillPayV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarBillPayV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarBillPayV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarBillPayV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarBillPayV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarBillPayV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarBillPayV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarBillPayV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarBillPayV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarBillPayV2ResponseData
  */
  public static StarBillPayV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarBillPayV2ResponseData.class);
  }

 /**
  * Convert an instance of StarBillPayV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

