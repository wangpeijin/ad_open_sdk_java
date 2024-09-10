/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class AdvertiserTransferableFundGetV2ResponseData {
  public static final String SERIALIZED_NAME_BID_CREDIT_VALID = "bid_credit_valid";
  @SerializedName(SERIALIZED_NAME_BID_CREDIT_VALID)
  private Double bidCreditValid = null;

  public static final String SERIALIZED_NAME_BID_PREPAY_VALID = "bid_prepay_valid";
  @SerializedName(SERIALIZED_NAME_BID_PREPAY_VALID)
  private Double bidPrepayValid = null;

  public static final String SERIALIZED_NAME_BRAND_CREDIT_VALID = "brand_credit_valid";
  @SerializedName(SERIALIZED_NAME_BRAND_CREDIT_VALID)
  private Double brandCreditValid = null;

  public static final String SERIALIZED_NAME_BRAND_PREPAY_VALID = "brand_prepay_valid";
  @SerializedName(SERIALIZED_NAME_BRAND_PREPAY_VALID)
  private Double brandPrepayValid = null;

  public static final String SERIALIZED_NAME_CASH_TRANSFER_BALANCE = "cash_transfer_balance";
  @SerializedName(SERIALIZED_NAME_CASH_TRANSFER_BALANCE)
  private Double cashTransferBalance = null;

  public static final String SERIALIZED_NAME_DEPOSIT_AMOUNT = "deposit_amount";
  @SerializedName(SERIALIZED_NAME_DEPOSIT_AMOUNT)
  private Double depositAmount = null;

  public static final String SERIALIZED_NAME_GRANT_VALID = "grant_valid";
  @SerializedName(SERIALIZED_NAME_GRANT_VALID)
  private Double grantValid = null;

  public static final String SERIALIZED_NAME_TOTAL_TRANSFER_BALANCE = "total_transfer_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFER_BALANCE)
  private Double totalTransferBalance = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_CREDIT_VALID = "universal_credit_valid";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_CREDIT_VALID)
  private Double universalCreditValid = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_PREPAY_VALID = "universal_prepay_valid";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_PREPAY_VALID)
  private Double universalPrepayValid = null;

  public AdvertiserTransferableFundGetV2ResponseData() {
  }

  public AdvertiserTransferableFundGetV2ResponseData bidCreditValid(Double bidCreditValid) {
    
    this.bidCreditValid = bidCreditValid;
    return this;
  }

   /**
   * 
   * @return bidCreditValid
  **/
  @javax.annotation.Nullable
  public Double getBidCreditValid() {
    return bidCreditValid;
  }


  public void setBidCreditValid(Double bidCreditValid) {
    this.bidCreditValid = bidCreditValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData bidPrepayValid(Double bidPrepayValid) {
    
    this.bidPrepayValid = bidPrepayValid;
    return this;
  }

   /**
   * 
   * @return bidPrepayValid
  **/
  @javax.annotation.Nullable
  public Double getBidPrepayValid() {
    return bidPrepayValid;
  }


  public void setBidPrepayValid(Double bidPrepayValid) {
    this.bidPrepayValid = bidPrepayValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData brandCreditValid(Double brandCreditValid) {
    
    this.brandCreditValid = brandCreditValid;
    return this;
  }

   /**
   * 
   * @return brandCreditValid
  **/
  @javax.annotation.Nullable
  public Double getBrandCreditValid() {
    return brandCreditValid;
  }


  public void setBrandCreditValid(Double brandCreditValid) {
    this.brandCreditValid = brandCreditValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData brandPrepayValid(Double brandPrepayValid) {
    
    this.brandPrepayValid = brandPrepayValid;
    return this;
  }

   /**
   * 
   * @return brandPrepayValid
  **/
  @javax.annotation.Nullable
  public Double getBrandPrepayValid() {
    return brandPrepayValid;
  }


  public void setBrandPrepayValid(Double brandPrepayValid) {
    this.brandPrepayValid = brandPrepayValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData cashTransferBalance(Double cashTransferBalance) {
    
    this.cashTransferBalance = cashTransferBalance;
    return this;
  }

   /**
   * 
   * @return cashTransferBalance
  **/
  @javax.annotation.Nullable
  public Double getCashTransferBalance() {
    return cashTransferBalance;
  }


  public void setCashTransferBalance(Double cashTransferBalance) {
    this.cashTransferBalance = cashTransferBalance;
  }


  public AdvertiserTransferableFundGetV2ResponseData depositAmount(Double depositAmount) {
    
    this.depositAmount = depositAmount;
    return this;
  }

   /**
   * 
   * @return depositAmount
  **/
  @javax.annotation.Nullable
  public Double getDepositAmount() {
    return depositAmount;
  }


  public void setDepositAmount(Double depositAmount) {
    this.depositAmount = depositAmount;
  }


  public AdvertiserTransferableFundGetV2ResponseData grantValid(Double grantValid) {
    
    this.grantValid = grantValid;
    return this;
  }

   /**
   * 
   * @return grantValid
  **/
  @javax.annotation.Nullable
  public Double getGrantValid() {
    return grantValid;
  }


  public void setGrantValid(Double grantValid) {
    this.grantValid = grantValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData totalTransferBalance(Double totalTransferBalance) {
    
    this.totalTransferBalance = totalTransferBalance;
    return this;
  }

   /**
   * 
   * @return totalTransferBalance
  **/
  @javax.annotation.Nullable
  public Double getTotalTransferBalance() {
    return totalTransferBalance;
  }


  public void setTotalTransferBalance(Double totalTransferBalance) {
    this.totalTransferBalance = totalTransferBalance;
  }


  public AdvertiserTransferableFundGetV2ResponseData universalCreditValid(Double universalCreditValid) {
    
    this.universalCreditValid = universalCreditValid;
    return this;
  }

   /**
   * 
   * @return universalCreditValid
  **/
  @javax.annotation.Nullable
  public Double getUniversalCreditValid() {
    return universalCreditValid;
  }


  public void setUniversalCreditValid(Double universalCreditValid) {
    this.universalCreditValid = universalCreditValid;
  }


  public AdvertiserTransferableFundGetV2ResponseData universalPrepayValid(Double universalPrepayValid) {
    
    this.universalPrepayValid = universalPrepayValid;
    return this;
  }

   /**
   * 
   * @return universalPrepayValid
  **/
  @javax.annotation.Nullable
  public Double getUniversalPrepayValid() {
    return universalPrepayValid;
  }


  public void setUniversalPrepayValid(Double universalPrepayValid) {
    this.universalPrepayValid = universalPrepayValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserTransferableFundGetV2ResponseData advertiserTransferableFundGetV2ResponseData = (AdvertiserTransferableFundGetV2ResponseData) o;
    return Objects.equals(this.bidCreditValid, advertiserTransferableFundGetV2ResponseData.bidCreditValid) &&
        Objects.equals(this.bidPrepayValid, advertiserTransferableFundGetV2ResponseData.bidPrepayValid) &&
        Objects.equals(this.brandCreditValid, advertiserTransferableFundGetV2ResponseData.brandCreditValid) &&
        Objects.equals(this.brandPrepayValid, advertiserTransferableFundGetV2ResponseData.brandPrepayValid) &&
        Objects.equals(this.cashTransferBalance, advertiserTransferableFundGetV2ResponseData.cashTransferBalance) &&
        Objects.equals(this.depositAmount, advertiserTransferableFundGetV2ResponseData.depositAmount) &&
        Objects.equals(this.grantValid, advertiserTransferableFundGetV2ResponseData.grantValid) &&
        Objects.equals(this.totalTransferBalance, advertiserTransferableFundGetV2ResponseData.totalTransferBalance) &&
        Objects.equals(this.universalCreditValid, advertiserTransferableFundGetV2ResponseData.universalCreditValid) &&
        Objects.equals(this.universalPrepayValid, advertiserTransferableFundGetV2ResponseData.universalPrepayValid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidCreditValid, bidPrepayValid, brandCreditValid, brandPrepayValid, cashTransferBalance, depositAmount, grantValid, totalTransferBalance, universalCreditValid, universalPrepayValid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserTransferableFundGetV2ResponseData {\n");
    sb.append("    bidCreditValid: ").append(toIndentedString(bidCreditValid)).append("\n");
    sb.append("    bidPrepayValid: ").append(toIndentedString(bidPrepayValid)).append("\n");
    sb.append("    brandCreditValid: ").append(toIndentedString(brandCreditValid)).append("\n");
    sb.append("    brandPrepayValid: ").append(toIndentedString(brandPrepayValid)).append("\n");
    sb.append("    cashTransferBalance: ").append(toIndentedString(cashTransferBalance)).append("\n");
    sb.append("    depositAmount: ").append(toIndentedString(depositAmount)).append("\n");
    sb.append("    grantValid: ").append(toIndentedString(grantValid)).append("\n");
    sb.append("    totalTransferBalance: ").append(toIndentedString(totalTransferBalance)).append("\n");
    sb.append("    universalCreditValid: ").append(toIndentedString(universalCreditValid)).append("\n");
    sb.append("    universalPrepayValid: ").append(toIndentedString(universalPrepayValid)).append("\n");
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
    openapiFields.add("bid_credit_valid");
    openapiFields.add("bid_prepay_valid");
    openapiFields.add("brand_credit_valid");
    openapiFields.add("brand_prepay_valid");
    openapiFields.add("cash_transfer_balance");
    openapiFields.add("deposit_amount");
    openapiFields.add("grant_valid");
    openapiFields.add("total_transfer_balance");
    openapiFields.add("universal_credit_valid");
    openapiFields.add("universal_prepay_valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserTransferableFundGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserTransferableFundGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserTransferableFundGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserTransferableFundGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserTransferableFundGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserTransferableFundGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserTransferableFundGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserTransferableFundGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserTransferableFundGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserTransferableFundGetV2ResponseData
  */
  public static AdvertiserTransferableFundGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserTransferableFundGetV2ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserTransferableFundGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

