/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance = null;

  public static final String SERIALIZED_NAME_BILLING_INVENTORY = "billing_inventory";
  @SerializedName(SERIALIZED_NAME_BILLING_INVENTORY)
  private String billingInventory = null;

  public FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner() {
  }

  public FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 
   * @return balance
  **/
  @javax.annotation.Nullable
  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner billingInventory(String billingInventory) {
    
    this.billingInventory = billingInventory;
    return this;
  }

   /**
   * 
   * @return billingInventory
  **/
  @javax.annotation.Nullable
  public String getBillingInventory() {
    return billingInventory;
  }


  public void setBillingInventory(String billingInventory) {
    this.billingInventory = billingInventory;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner fundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner = (FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner) o;
    return Objects.equals(this.balance, fundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner.balance) &&
        Objects.equals(this.billingInventory, fundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner.billingInventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, billingInventory);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    billingInventory: ").append(toIndentedString(billingInventory)).append("\n");
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
    openapiFields.add("balance");
    openapiFields.add("billing_inventory");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner>() {
           @Override
           public void write(JsonWriter out, FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner
  * @throws IOException if the JSON string is invalid with respect to FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner
  */
  public static FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner.class);
  }

 /**
  * Convert an instance of FundSharedWalletBalanceGetV2ResponseDataListInnerBalanceDetailInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

