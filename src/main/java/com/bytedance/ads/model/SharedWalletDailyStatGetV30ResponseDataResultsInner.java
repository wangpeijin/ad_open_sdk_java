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
import com.bytedance.ads.model.SharedWalletDailyStatGetV30DataResultsWalletType;
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
 * SharedWalletDailyStatGetV30ResponseDataResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class SharedWalletDailyStatGetV30ResponseDataResultsInner {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Double balance = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Double cost = null;

  public static final String SERIALIZED_NAME_CREDIT_BALANCE = "credit_balance";
  @SerializedName(SERIALIZED_NAME_CREDIT_BALANCE)
  private Double creditBalance = null;

  public static final String SERIALIZED_NAME_EXPENSES = "expenses";
  @SerializedName(SERIALIZED_NAME_EXPENSES)
  private Double expenses = null;

  public static final String SERIALIZED_NAME_INCOMES = "incomes";
  @SerializedName(SERIALIZED_NAME_INCOMES)
  private Double incomes = null;

  public static final String SERIALIZED_NAME_PREPAY_BALANCE = "prepay_balance";
  @SerializedName(SERIALIZED_NAME_PREPAY_BALANCE)
  private Double prepayBalance = null;

  public static final String SERIALIZED_NAME_SHARED_WALLET_ID = "shared_wallet_id";
  @SerializedName(SERIALIZED_NAME_SHARED_WALLET_ID)
  private Long sharedWalletId = null;

  public static final String SERIALIZED_NAME_SHARED_WALLET_NAME = "shared_wallet_name";
  @SerializedName(SERIALIZED_NAME_SHARED_WALLET_NAME)
  private String sharedWalletName = null;

  public static final String SERIALIZED_NAME_TRANSACTION_DATE = "transaction_date";
  @SerializedName(SERIALIZED_NAME_TRANSACTION_DATE)
  private String transactionDate = null;

  public static final String SERIALIZED_NAME_WALLET_TYPE = "wallet_type";
  @SerializedName(SERIALIZED_NAME_WALLET_TYPE)
  private SharedWalletDailyStatGetV30DataResultsWalletType walletType = null;

  public SharedWalletDailyStatGetV30ResponseDataResultsInner() {
  }

  public SharedWalletDailyStatGetV30ResponseDataResultsInner balance(Double balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 日终结余(单位元）
   * @return balance
  **/
  @javax.annotation.Nullable
  public Double getBalance() {
    return balance;
  }


  public void setBalance(Double balance) {
    this.balance = balance;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner cost(Double cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 总消耗(单位元)
   * @return cost
  **/
  @javax.annotation.Nullable
  public Double getCost() {
    return cost;
  }


  public void setCost(Double cost) {
    this.cost = cost;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner creditBalance(Double creditBalance) {
    
    this.creditBalance = creditBalance;
    return this;
  }

   /**
   * 授信日终结余(单位元）
   * @return creditBalance
  **/
  @javax.annotation.Nullable
  public Double getCreditBalance() {
    return creditBalance;
  }


  public void setCreditBalance(Double creditBalance) {
    this.creditBalance = creditBalance;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner expenses(Double expenses) {
    
    this.expenses = expenses;
    return this;
  }

   /**
   * 总支出(单位元)
   * @return expenses
  **/
  @javax.annotation.Nullable
  public Double getExpenses() {
    return expenses;
  }


  public void setExpenses(Double expenses) {
    this.expenses = expenses;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner incomes(Double incomes) {
    
    this.incomes = incomes;
    return this;
  }

   /**
   * 总存入(单位元)
   * @return incomes
  **/
  @javax.annotation.Nullable
  public Double getIncomes() {
    return incomes;
  }


  public void setIncomes(Double incomes) {
    this.incomes = incomes;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner prepayBalance(Double prepayBalance) {
    
    this.prepayBalance = prepayBalance;
    return this;
  }

   /**
   * 预付日终结余(单位元）
   * @return prepayBalance
  **/
  @javax.annotation.Nullable
  public Double getPrepayBalance() {
    return prepayBalance;
  }


  public void setPrepayBalance(Double prepayBalance) {
    this.prepayBalance = prepayBalance;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner sharedWalletId(Long sharedWalletId) {
    
    this.sharedWalletId = sharedWalletId;
    return this;
  }

   /**
   * 共享钱包ID
   * @return sharedWalletId
  **/
  @javax.annotation.Nullable
  public Long getSharedWalletId() {
    return sharedWalletId;
  }


  public void setSharedWalletId(Long sharedWalletId) {
    this.sharedWalletId = sharedWalletId;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner sharedWalletName(String sharedWalletName) {
    
    this.sharedWalletName = sharedWalletName;
    return this;
  }

   /**
   * 共享钱包名称
   * @return sharedWalletName
  **/
  @javax.annotation.Nullable
  public String getSharedWalletName() {
    return sharedWalletName;
  }


  public void setSharedWalletName(String sharedWalletName) {
    this.sharedWalletName = sharedWalletName;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner transactionDate(String transactionDate) {
    
    this.transactionDate = transactionDate;
    return this;
  }

   /**
   * 日期,精确到天，格式YYYY-MM-DD
   * @return transactionDate
  **/
  @javax.annotation.Nullable
  public String getTransactionDate() {
    return transactionDate;
  }


  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }


  public SharedWalletDailyStatGetV30ResponseDataResultsInner walletType(SharedWalletDailyStatGetV30DataResultsWalletType walletType) {
    
    this.walletType = walletType;
    return this;
  }

   /**
   * Get walletType
   * @return walletType
  **/
  @javax.annotation.Nullable
  public SharedWalletDailyStatGetV30DataResultsWalletType getWalletType() {
    return walletType;
  }


  public void setWalletType(SharedWalletDailyStatGetV30DataResultsWalletType walletType) {
    this.walletType = walletType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SharedWalletDailyStatGetV30ResponseDataResultsInner sharedWalletDailyStatGetV30ResponseDataResultsInner = (SharedWalletDailyStatGetV30ResponseDataResultsInner) o;
    return Objects.equals(this.balance, sharedWalletDailyStatGetV30ResponseDataResultsInner.balance) &&
        Objects.equals(this.cost, sharedWalletDailyStatGetV30ResponseDataResultsInner.cost) &&
        Objects.equals(this.creditBalance, sharedWalletDailyStatGetV30ResponseDataResultsInner.creditBalance) &&
        Objects.equals(this.expenses, sharedWalletDailyStatGetV30ResponseDataResultsInner.expenses) &&
        Objects.equals(this.incomes, sharedWalletDailyStatGetV30ResponseDataResultsInner.incomes) &&
        Objects.equals(this.prepayBalance, sharedWalletDailyStatGetV30ResponseDataResultsInner.prepayBalance) &&
        Objects.equals(this.sharedWalletId, sharedWalletDailyStatGetV30ResponseDataResultsInner.sharedWalletId) &&
        Objects.equals(this.sharedWalletName, sharedWalletDailyStatGetV30ResponseDataResultsInner.sharedWalletName) &&
        Objects.equals(this.transactionDate, sharedWalletDailyStatGetV30ResponseDataResultsInner.transactionDate) &&
        Objects.equals(this.walletType, sharedWalletDailyStatGetV30ResponseDataResultsInner.walletType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, cost, creditBalance, expenses, incomes, prepayBalance, sharedWalletId, sharedWalletName, transactionDate, walletType);
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
    sb.append("class SharedWalletDailyStatGetV30ResponseDataResultsInner {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    creditBalance: ").append(toIndentedString(creditBalance)).append("\n");
    sb.append("    expenses: ").append(toIndentedString(expenses)).append("\n");
    sb.append("    incomes: ").append(toIndentedString(incomes)).append("\n");
    sb.append("    prepayBalance: ").append(toIndentedString(prepayBalance)).append("\n");
    sb.append("    sharedWalletId: ").append(toIndentedString(sharedWalletId)).append("\n");
    sb.append("    sharedWalletName: ").append(toIndentedString(sharedWalletName)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    walletType: ").append(toIndentedString(walletType)).append("\n");
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
    openapiFields.add("cost");
    openapiFields.add("credit_balance");
    openapiFields.add("expenses");
    openapiFields.add("incomes");
    openapiFields.add("prepay_balance");
    openapiFields.add("shared_wallet_id");
    openapiFields.add("shared_wallet_name");
    openapiFields.add("transaction_date");
    openapiFields.add("wallet_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SharedWalletDailyStatGetV30ResponseDataResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SharedWalletDailyStatGetV30ResponseDataResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SharedWalletDailyStatGetV30ResponseDataResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SharedWalletDailyStatGetV30ResponseDataResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SharedWalletDailyStatGetV30ResponseDataResultsInner>() {
           @Override
           public void write(JsonWriter out, SharedWalletDailyStatGetV30ResponseDataResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SharedWalletDailyStatGetV30ResponseDataResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SharedWalletDailyStatGetV30ResponseDataResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SharedWalletDailyStatGetV30ResponseDataResultsInner
  * @throws IOException if the JSON string is invalid with respect to SharedWalletDailyStatGetV30ResponseDataResultsInner
  */
  public static SharedWalletDailyStatGetV30ResponseDataResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SharedWalletDailyStatGetV30ResponseDataResultsInner.class);
  }

 /**
  * Convert an instance of SharedWalletDailyStatGetV30ResponseDataResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

