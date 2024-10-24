/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
 * 巨量广告业务线余额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo {
  public static final String SERIALIZED_NAME_CREDIT_BIDDING_VALID_BALANCE = "credit_bidding_valid_balance";
  @SerializedName(SERIALIZED_NAME_CREDIT_BIDDING_VALID_BALANCE)
  private Double creditBiddingValidBalance = null;

  public static final String SERIALIZED_NAME_CREDIT_BRAND_VALID_BALANCE = "credit_brand_valid_balance";
  @SerializedName(SERIALIZED_NAME_CREDIT_BRAND_VALID_BALANCE)
  private Double creditBrandValidBalance = null;

  public static final String SERIALIZED_NAME_CREDIT_GENERAL_VALID_BALANCE = "credit_general_valid_balance";
  @SerializedName(SERIALIZED_NAME_CREDIT_GENERAL_VALID_BALANCE)
  private Double creditGeneralValidBalance = null;

  public static final String SERIALIZED_NAME_PREPAY_BIDDING_VALID_BALANCE = "prepay_bidding_valid_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_BIDDING_VALID_BALANCE)
  private Double prepayBiddingValidBalance = null;

  public static final String SERIALIZED_NAME_PREPAY_BRAND_VALID_BALANCE = "prepay_brand_valid_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_BRAND_VALID_BALANCE)
  private Double prepayBrandValidBalance = null;

  public static final String SERIALIZED_NAME_PREPAY_GENERAL_VALID_BALANCE = "prepay_general_valid_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_GENERAL_VALID_BALANCE)
  private Double prepayGeneralValidBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "total_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private Double totalBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_VALID_BALANCE = "total_valid_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALID_BALANCE)
  private Double totalValidBalance = null;

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo() {
  }

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo creditBiddingValidBalance(Double creditBiddingValidBalance) {
    
    this.creditBiddingValidBalance = creditBiddingValidBalance;
    return this;
  }

   /**
   * 授信竞价可用余额(单位元)
   * @return creditBiddingValidBalance
  **/
  @javax.annotation.Nullable
  public Double getCreditBiddingValidBalance() {
    return creditBiddingValidBalance;
  }


  public void setCreditBiddingValidBalance(Double creditBiddingValidBalance) {
    this.creditBiddingValidBalance = creditBiddingValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo creditBrandValidBalance(Double creditBrandValidBalance) {
    
    this.creditBrandValidBalance = creditBrandValidBalance;
    return this;
  }

   /**
   * 授信品牌可用余额(单位元)
   * @return creditBrandValidBalance
  **/
  @javax.annotation.Nullable
  public Double getCreditBrandValidBalance() {
    return creditBrandValidBalance;
  }


  public void setCreditBrandValidBalance(Double creditBrandValidBalance) {
    this.creditBrandValidBalance = creditBrandValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo creditGeneralValidBalance(Double creditGeneralValidBalance) {
    
    this.creditGeneralValidBalance = creditGeneralValidBalance;
    return this;
  }

   /**
   * 授信通用可用余额(单位元)
   * @return creditGeneralValidBalance
  **/
  @javax.annotation.Nullable
  public Double getCreditGeneralValidBalance() {
    return creditGeneralValidBalance;
  }


  public void setCreditGeneralValidBalance(Double creditGeneralValidBalance) {
    this.creditGeneralValidBalance = creditGeneralValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo prepayBiddingValidBalance(Double prepayBiddingValidBalance) {
    
    this.prepayBiddingValidBalance = prepayBiddingValidBalance;
    return this;
  }

   /**
   * 预付竞价可用余额(单位元)
   * @return prepayBiddingValidBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayBiddingValidBalance() {
    return prepayBiddingValidBalance;
  }


  public void setPrepayBiddingValidBalance(Double prepayBiddingValidBalance) {
    this.prepayBiddingValidBalance = prepayBiddingValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo prepayBrandValidBalance(Double prepayBrandValidBalance) {
    
    this.prepayBrandValidBalance = prepayBrandValidBalance;
    return this;
  }

   /**
   * 预付品牌可用余额(单位元)
   * @return prepayBrandValidBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayBrandValidBalance() {
    return prepayBrandValidBalance;
  }


  public void setPrepayBrandValidBalance(Double prepayBrandValidBalance) {
    this.prepayBrandValidBalance = prepayBrandValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo prepayGeneralValidBalance(Double prepayGeneralValidBalance) {
    
    this.prepayGeneralValidBalance = prepayGeneralValidBalance;
    return this;
  }

   /**
   * 预付通用可用余额(单位元)
   * @return prepayGeneralValidBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayGeneralValidBalance() {
    return prepayGeneralValidBalance;
  }


  public void setPrepayGeneralValidBalance(Double prepayGeneralValidBalance) {
    this.prepayGeneralValidBalance = prepayGeneralValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo totalBalance(Double totalBalance) {
    
    this.totalBalance = totalBalance;
    return this;
  }

   /**
   * 总余额(单位元)
   * @return totalBalance
  **/
  @javax.annotation.Nullable
  public Double getTotalBalance() {
    return totalBalance;
  }


  public void setTotalBalance(Double totalBalance) {
    this.totalBalance = totalBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo totalValidBalance(Double totalValidBalance) {
    
    this.totalValidBalance = totalValidBalance;
    return this;
  }

   /**
   * 总可用余额(单位元)
   * @return totalValidBalance
  **/
  @javax.annotation.Nullable
  public Double getTotalValidBalance() {
    return totalValidBalance;
  }


  public void setTotalValidBalance(Double totalValidBalance) {
    this.totalValidBalance = totalValidBalance;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo = (SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo) o;
    return Objects.equals(this.creditBiddingValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.creditBiddingValidBalance) &&
        Objects.equals(this.creditBrandValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.creditBrandValidBalance) &&
        Objects.equals(this.creditGeneralValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.creditGeneralValidBalance) &&
        Objects.equals(this.prepayBiddingValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.prepayBiddingValidBalance) &&
        Objects.equals(this.prepayBrandValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.prepayBrandValidBalance) &&
        Objects.equals(this.prepayGeneralValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.prepayGeneralValidBalance) &&
        Objects.equals(this.totalBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.totalBalance) &&
        Objects.equals(this.totalValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.totalValidBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(creditBiddingValidBalance, creditBrandValidBalance, creditGeneralValidBalance, prepayBiddingValidBalance, prepayBrandValidBalance, prepayGeneralValidBalance, totalBalance, totalValidBalance);
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
    sb.append("class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo {\n");
    sb.append("    creditBiddingValidBalance: ").append(toIndentedString(creditBiddingValidBalance)).append("\n");
    sb.append("    creditBrandValidBalance: ").append(toIndentedString(creditBrandValidBalance)).append("\n");
    sb.append("    creditGeneralValidBalance: ").append(toIndentedString(creditGeneralValidBalance)).append("\n");
    sb.append("    prepayBiddingValidBalance: ").append(toIndentedString(prepayBiddingValidBalance)).append("\n");
    sb.append("    prepayBrandValidBalance: ").append(toIndentedString(prepayBrandValidBalance)).append("\n");
    sb.append("    prepayGeneralValidBalance: ").append(toIndentedString(prepayGeneralValidBalance)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    totalValidBalance: ").append(toIndentedString(totalValidBalance)).append("\n");
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
    openapiFields.add("credit_bidding_valid_balance");
    openapiFields.add("credit_brand_valid_balance");
    openapiFields.add("credit_general_valid_balance");
    openapiFields.add("prepay_bidding_valid_balance");
    openapiFields.add("prepay_brand_valid_balance");
    openapiFields.add("prepay_general_valid_balance");
    openapiFields.add("total_balance");
    openapiFields.add("total_valid_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo
  */
  public static SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueGeneralBalanceInfoAdOnlyBalanceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

