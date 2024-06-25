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
 * AccountFundGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AccountFundGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance = null;

  public static final String SERIALIZED_NAME_CASH = "cash";
  @SerializedName(SERIALIZED_NAME_CASH)
  private Long cash = null;

  public static final String SERIALIZED_NAME_COMMON_GRANT = "common_grant";
  @SerializedName(SERIALIZED_NAME_COMMON_GRANT)
  private Long commonGrant = null;

  public static final String SERIALIZED_NAME_COMPENSATION_GRANT = "compensation_grant";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_GRANT)
  private Long compensationGrant = null;

  public static final String SERIALIZED_NAME_COMPENSATION_VALID_GRANT = "compensation_valid_grant";
  @SerializedName(SERIALIZED_NAME_COMPENSATION_VALID_GRANT)
  private Long compensationValidGrant = null;

  public static final String SERIALIZED_NAME_DEFAULT_GRANT = "default_grant";
  @SerializedName(SERIALIZED_NAME_DEFAULT_GRANT)
  private Long defaultGrant = null;

  public static final String SERIALIZED_NAME_GRANT = "grant";
  @SerializedName(SERIALIZED_NAME_GRANT)
  private Long grant = null;

  public static final String SERIALIZED_NAME_RETURN_GOODS_ABS = "return_goods_abs";
  @SerializedName(SERIALIZED_NAME_RETURN_GOODS_ABS)
  private Long returnGoodsAbs = null;

  public static final String SERIALIZED_NAME_SEARCH_GRANT = "search_grant";
  @SerializedName(SERIALIZED_NAME_SEARCH_GRANT)
  private Long searchGrant = null;

  public static final String SERIALIZED_NAME_UNION_GRANT = "union_grant";
  @SerializedName(SERIALIZED_NAME_UNION_GRANT)
  private Long unionGrant = null;

  public static final String SERIALIZED_NAME_VALID_BALANCE = "valid_balance";
  @SerializedName(SERIALIZED_NAME_VALID_BALANCE)
  private Long validBalance = null;

  public static final String SERIALIZED_NAME_VALID_CASH = "valid_cash";
  @SerializedName(SERIALIZED_NAME_VALID_CASH)
  private Long validCash = null;

  public static final String SERIALIZED_NAME_VALID_GRANT = "valid_grant";
  @SerializedName(SERIALIZED_NAME_VALID_GRANT)
  private Long validGrant = null;

  public static final String SERIALIZED_NAME_VALID_RETURN_GOODS_ABS = "valid_return_goods_abs";
  @SerializedName(SERIALIZED_NAME_VALID_RETURN_GOODS_ABS)
  private Long validReturnGoodsAbs = null;

  public static final String SERIALIZED_NAME_WALLET_ID = "wallet_id";
  @SerializedName(SERIALIZED_NAME_WALLET_ID)
  private Long walletId = null;

  public static final String SERIALIZED_NAME_WALLET_TOTAL_BALANCE_VALID = "wallet_total_balance_valid";
  @SerializedName(SERIALIZED_NAME_WALLET_TOTAL_BALANCE_VALID)
  private Long walletTotalBalanceValid = null;

  public AccountFundGetV30ResponseDataListInner() {
  }

  public AccountFundGetV30ResponseDataListInner accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AccountFundGetV30ResponseDataListInner balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 
   * @return balance
  **/
  @javax.annotation.Nullable
  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public AccountFundGetV30ResponseDataListInner cash(Long cash) {
    
    this.cash = cash;
    return this;
  }

   /**
   * 
   * @return cash
  **/
  @javax.annotation.Nullable
  public Long getCash() {
    return cash;
  }


  public void setCash(Long cash) {
    this.cash = cash;
  }


  public AccountFundGetV30ResponseDataListInner commonGrant(Long commonGrant) {
    
    this.commonGrant = commonGrant;
    return this;
  }

   /**
   * 
   * @return commonGrant
  **/
  @javax.annotation.Nullable
  public Long getCommonGrant() {
    return commonGrant;
  }


  public void setCommonGrant(Long commonGrant) {
    this.commonGrant = commonGrant;
  }


  public AccountFundGetV30ResponseDataListInner compensationGrant(Long compensationGrant) {
    
    this.compensationGrant = compensationGrant;
    return this;
  }

   /**
   * 
   * @return compensationGrant
  **/
  @javax.annotation.Nullable
  public Long getCompensationGrant() {
    return compensationGrant;
  }


  public void setCompensationGrant(Long compensationGrant) {
    this.compensationGrant = compensationGrant;
  }


  public AccountFundGetV30ResponseDataListInner compensationValidGrant(Long compensationValidGrant) {
    
    this.compensationValidGrant = compensationValidGrant;
    return this;
  }

   /**
   * 
   * @return compensationValidGrant
  **/
  @javax.annotation.Nullable
  public Long getCompensationValidGrant() {
    return compensationValidGrant;
  }


  public void setCompensationValidGrant(Long compensationValidGrant) {
    this.compensationValidGrant = compensationValidGrant;
  }


  public AccountFundGetV30ResponseDataListInner defaultGrant(Long defaultGrant) {
    
    this.defaultGrant = defaultGrant;
    return this;
  }

   /**
   * 
   * @return defaultGrant
  **/
  @javax.annotation.Nullable
  public Long getDefaultGrant() {
    return defaultGrant;
  }


  public void setDefaultGrant(Long defaultGrant) {
    this.defaultGrant = defaultGrant;
  }


  public AccountFundGetV30ResponseDataListInner grant(Long grant) {
    
    this.grant = grant;
    return this;
  }

   /**
   * 
   * @return grant
  **/
  @javax.annotation.Nullable
  public Long getGrant() {
    return grant;
  }


  public void setGrant(Long grant) {
    this.grant = grant;
  }


  public AccountFundGetV30ResponseDataListInner returnGoodsAbs(Long returnGoodsAbs) {
    
    this.returnGoodsAbs = returnGoodsAbs;
    return this;
  }

   /**
   * 
   * @return returnGoodsAbs
  **/
  @javax.annotation.Nullable
  public Long getReturnGoodsAbs() {
    return returnGoodsAbs;
  }


  public void setReturnGoodsAbs(Long returnGoodsAbs) {
    this.returnGoodsAbs = returnGoodsAbs;
  }


  public AccountFundGetV30ResponseDataListInner searchGrant(Long searchGrant) {
    
    this.searchGrant = searchGrant;
    return this;
  }

   /**
   * 
   * @return searchGrant
  **/
  @javax.annotation.Nullable
  public Long getSearchGrant() {
    return searchGrant;
  }


  public void setSearchGrant(Long searchGrant) {
    this.searchGrant = searchGrant;
  }


  public AccountFundGetV30ResponseDataListInner unionGrant(Long unionGrant) {
    
    this.unionGrant = unionGrant;
    return this;
  }

   /**
   * 
   * @return unionGrant
  **/
  @javax.annotation.Nullable
  public Long getUnionGrant() {
    return unionGrant;
  }


  public void setUnionGrant(Long unionGrant) {
    this.unionGrant = unionGrant;
  }


  public AccountFundGetV30ResponseDataListInner validBalance(Long validBalance) {
    
    this.validBalance = validBalance;
    return this;
  }

   /**
   * 
   * @return validBalance
  **/
  @javax.annotation.Nullable
  public Long getValidBalance() {
    return validBalance;
  }


  public void setValidBalance(Long validBalance) {
    this.validBalance = validBalance;
  }


  public AccountFundGetV30ResponseDataListInner validCash(Long validCash) {
    
    this.validCash = validCash;
    return this;
  }

   /**
   * 
   * @return validCash
  **/
  @javax.annotation.Nullable
  public Long getValidCash() {
    return validCash;
  }


  public void setValidCash(Long validCash) {
    this.validCash = validCash;
  }


  public AccountFundGetV30ResponseDataListInner validGrant(Long validGrant) {
    
    this.validGrant = validGrant;
    return this;
  }

   /**
   * 
   * @return validGrant
  **/
  @javax.annotation.Nullable
  public Long getValidGrant() {
    return validGrant;
  }


  public void setValidGrant(Long validGrant) {
    this.validGrant = validGrant;
  }


  public AccountFundGetV30ResponseDataListInner validReturnGoodsAbs(Long validReturnGoodsAbs) {
    
    this.validReturnGoodsAbs = validReturnGoodsAbs;
    return this;
  }

   /**
   * 
   * @return validReturnGoodsAbs
  **/
  @javax.annotation.Nullable
  public Long getValidReturnGoodsAbs() {
    return validReturnGoodsAbs;
  }


  public void setValidReturnGoodsAbs(Long validReturnGoodsAbs) {
    this.validReturnGoodsAbs = validReturnGoodsAbs;
  }


  public AccountFundGetV30ResponseDataListInner walletId(Long walletId) {
    
    this.walletId = walletId;
    return this;
  }

   /**
   * 
   * @return walletId
  **/
  @javax.annotation.Nullable
  public Long getWalletId() {
    return walletId;
  }


  public void setWalletId(Long walletId) {
    this.walletId = walletId;
  }


  public AccountFundGetV30ResponseDataListInner walletTotalBalanceValid(Long walletTotalBalanceValid) {
    
    this.walletTotalBalanceValid = walletTotalBalanceValid;
    return this;
  }

   /**
   * 
   * @return walletTotalBalanceValid
  **/
  @javax.annotation.Nullable
  public Long getWalletTotalBalanceValid() {
    return walletTotalBalanceValid;
  }


  public void setWalletTotalBalanceValid(Long walletTotalBalanceValid) {
    this.walletTotalBalanceValid = walletTotalBalanceValid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountFundGetV30ResponseDataListInner accountFundGetV30ResponseDataListInner = (AccountFundGetV30ResponseDataListInner) o;
    return Objects.equals(this.accountId, accountFundGetV30ResponseDataListInner.accountId) &&
        Objects.equals(this.balance, accountFundGetV30ResponseDataListInner.balance) &&
        Objects.equals(this.cash, accountFundGetV30ResponseDataListInner.cash) &&
        Objects.equals(this.commonGrant, accountFundGetV30ResponseDataListInner.commonGrant) &&
        Objects.equals(this.compensationGrant, accountFundGetV30ResponseDataListInner.compensationGrant) &&
        Objects.equals(this.compensationValidGrant, accountFundGetV30ResponseDataListInner.compensationValidGrant) &&
        Objects.equals(this.defaultGrant, accountFundGetV30ResponseDataListInner.defaultGrant) &&
        Objects.equals(this.grant, accountFundGetV30ResponseDataListInner.grant) &&
        Objects.equals(this.returnGoodsAbs, accountFundGetV30ResponseDataListInner.returnGoodsAbs) &&
        Objects.equals(this.searchGrant, accountFundGetV30ResponseDataListInner.searchGrant) &&
        Objects.equals(this.unionGrant, accountFundGetV30ResponseDataListInner.unionGrant) &&
        Objects.equals(this.validBalance, accountFundGetV30ResponseDataListInner.validBalance) &&
        Objects.equals(this.validCash, accountFundGetV30ResponseDataListInner.validCash) &&
        Objects.equals(this.validGrant, accountFundGetV30ResponseDataListInner.validGrant) &&
        Objects.equals(this.validReturnGoodsAbs, accountFundGetV30ResponseDataListInner.validReturnGoodsAbs) &&
        Objects.equals(this.walletId, accountFundGetV30ResponseDataListInner.walletId) &&
        Objects.equals(this.walletTotalBalanceValid, accountFundGetV30ResponseDataListInner.walletTotalBalanceValid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, balance, cash, commonGrant, compensationGrant, compensationValidGrant, defaultGrant, grant, returnGoodsAbs, searchGrant, unionGrant, validBalance, validCash, validGrant, validReturnGoodsAbs, walletId, walletTotalBalanceValid);
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
    sb.append("class AccountFundGetV30ResponseDataListInner {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cash: ").append(toIndentedString(cash)).append("\n");
    sb.append("    commonGrant: ").append(toIndentedString(commonGrant)).append("\n");
    sb.append("    compensationGrant: ").append(toIndentedString(compensationGrant)).append("\n");
    sb.append("    compensationValidGrant: ").append(toIndentedString(compensationValidGrant)).append("\n");
    sb.append("    defaultGrant: ").append(toIndentedString(defaultGrant)).append("\n");
    sb.append("    grant: ").append(toIndentedString(grant)).append("\n");
    sb.append("    returnGoodsAbs: ").append(toIndentedString(returnGoodsAbs)).append("\n");
    sb.append("    searchGrant: ").append(toIndentedString(searchGrant)).append("\n");
    sb.append("    unionGrant: ").append(toIndentedString(unionGrant)).append("\n");
    sb.append("    validBalance: ").append(toIndentedString(validBalance)).append("\n");
    sb.append("    validCash: ").append(toIndentedString(validCash)).append("\n");
    sb.append("    validGrant: ").append(toIndentedString(validGrant)).append("\n");
    sb.append("    validReturnGoodsAbs: ").append(toIndentedString(validReturnGoodsAbs)).append("\n");
    sb.append("    walletId: ").append(toIndentedString(walletId)).append("\n");
    sb.append("    walletTotalBalanceValid: ").append(toIndentedString(walletTotalBalanceValid)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("balance");
    openapiFields.add("cash");
    openapiFields.add("common_grant");
    openapiFields.add("compensation_grant");
    openapiFields.add("compensation_valid_grant");
    openapiFields.add("default_grant");
    openapiFields.add("grant");
    openapiFields.add("return_goods_abs");
    openapiFields.add("search_grant");
    openapiFields.add("union_grant");
    openapiFields.add("valid_balance");
    openapiFields.add("valid_cash");
    openapiFields.add("valid_grant");
    openapiFields.add("valid_return_goods_abs");
    openapiFields.add("wallet_id");
    openapiFields.add("wallet_total_balance_valid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AccountFundGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AccountFundGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AccountFundGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AccountFundGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AccountFundGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, AccountFundGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AccountFundGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AccountFundGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AccountFundGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to AccountFundGetV30ResponseDataListInner
  */
  public static AccountFundGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AccountFundGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of AccountFundGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

