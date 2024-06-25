/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
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
 * 常用余额信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo {
  public static final String SERIALIZED_NAME_NON_GRANT_BALANCE = "non_grant_balance";
  @SerializedName(SERIALIZED_NAME_NON_GRANT_BALANCE)
  private Double nonGrantBalance = null;

  public static final String SERIALIZED_NAME_NON_GRANT_TRANSFERABLE_BALANCE = "non_grant_transferable_balance";
  @SerializedName(SERIALIZED_NAME_NON_GRANT_TRANSFERABLE_BALANCE)
  private Double nonGrantTransferableBalance = null;

  public static final String SERIALIZED_NAME_NON_GRANT_VALID_BALANCE = "non_grant_valid_balance";
  @SerializedName(SERIALIZED_NAME_NON_GRANT_VALID_BALANCE)
  private Double nonGrantValidBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "total_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private Double totalBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_TRANSFERABLE_BALANCE = "total_transferable_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_TRANSFERABLE_BALANCE)
  private Double totalTransferableBalance = null;

  public static final String SERIALIZED_NAME_TOTAL_VALID_BALANCE = "total_valid_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_VALID_BALANCE)
  private Double totalValidBalance = null;

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo() {
  }

  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo nonGrantBalance(Double nonGrantBalance) {
    
    this.nonGrantBalance = nonGrantBalance;
    return this;
  }

   /**
   * 非赠款总余额(单位元)
   * @return nonGrantBalance
  **/
  @javax.annotation.Nullable
  public Double getNonGrantBalance() {
    return nonGrantBalance;
  }


  public void setNonGrantBalance(Double nonGrantBalance) {
    this.nonGrantBalance = nonGrantBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo nonGrantTransferableBalance(Double nonGrantTransferableBalance) {
    
    this.nonGrantTransferableBalance = nonGrantTransferableBalance;
    return this;
  }

   /**
   * 非赠款可转余额(单位元)
   * @return nonGrantTransferableBalance
  **/
  @javax.annotation.Nullable
  public Double getNonGrantTransferableBalance() {
    return nonGrantTransferableBalance;
  }


  public void setNonGrantTransferableBalance(Double nonGrantTransferableBalance) {
    this.nonGrantTransferableBalance = nonGrantTransferableBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo nonGrantValidBalance(Double nonGrantValidBalance) {
    
    this.nonGrantValidBalance = nonGrantValidBalance;
    return this;
  }

   /**
   * 非赠款可用余额(单位元)
   * @return nonGrantValidBalance
  **/
  @javax.annotation.Nullable
  public Double getNonGrantValidBalance() {
    return nonGrantValidBalance;
  }


  public void setNonGrantValidBalance(Double nonGrantValidBalance) {
    this.nonGrantValidBalance = nonGrantValidBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo totalBalance(Double totalBalance) {
    
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


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo totalTransferableBalance(Double totalTransferableBalance) {
    
    this.totalTransferableBalance = totalTransferableBalance;
    return this;
  }

   /**
   * 总可转余额(单位元)
   * @return totalTransferableBalance
  **/
  @javax.annotation.Nullable
  public Double getTotalTransferableBalance() {
    return totalTransferableBalance;
  }


  public void setTotalTransferableBalance(Double totalTransferableBalance) {
    this.totalTransferableBalance = totalTransferableBalance;
  }


  public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo totalValidBalance(Double totalValidBalance) {
    
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
    SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo = (SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo) o;
    return Objects.equals(this.nonGrantBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.nonGrantBalance) &&
        Objects.equals(this.nonGrantTransferableBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.nonGrantTransferableBalance) &&
        Objects.equals(this.nonGrantValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.nonGrantValidBalance) &&
        Objects.equals(this.totalBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.totalBalance) &&
        Objects.equals(this.totalTransferableBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.totalTransferableBalance) &&
        Objects.equals(this.totalValidBalance, sharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.totalValidBalance);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(nonGrantBalance, nonGrantTransferableBalance, nonGrantValidBalance, totalBalance, totalTransferableBalance, totalValidBalance);
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
    sb.append("class SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo {\n");
    sb.append("    nonGrantBalance: ").append(toIndentedString(nonGrantBalance)).append("\n");
    sb.append("    nonGrantTransferableBalance: ").append(toIndentedString(nonGrantTransferableBalance)).append("\n");
    sb.append("    nonGrantValidBalance: ").append(toIndentedString(nonGrantValidBalance)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    totalTransferableBalance: ").append(toIndentedString(totalTransferableBalance)).append("\n");
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
    openapiFields.add("non_grant_balance");
    openapiFields.add("non_grant_transferable_balance");
    openapiFields.add("non_grant_valid_balance");
    openapiFields.add("total_balance");
    openapiFields.add("total_transferable_balance");
    openapiFields.add("total_valid_balance");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo>() {
           @Override
           public void write(JsonWriter out, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo
  * @throws IOException if the JSON string is invalid with respect to SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo
  */
  public static SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo.class);
  }

 /**
  * Convert an instance of SharedWalletWalletBalanceGetV30ResponseDataSharedWalletBalanceInfoValueBasicBalanceInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

