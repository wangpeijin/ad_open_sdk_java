/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanFinanceDetailGetV10DataListViewDeliveryType;
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
 * QianchuanFinanceDetailGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class QianchuanFinanceDetailGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_CASH_BALANCE = "cash_balance";
  @SerializedName(SERIALIZED_NAME_CASH_BALANCE)
  private Long cashBalance = null;

  public static final String SERIALIZED_NAME_CASH_COST = "cash_cost";
  @SerializedName(SERIALIZED_NAME_CASH_COST)
  private Long cashCost = null;

  public static final String SERIALIZED_NAME_COST = "cost";
  @SerializedName(SERIALIZED_NAME_COST)
  private Long cost = null;

  public static final String SERIALIZED_NAME_DATE = "date";
  @SerializedName(SERIALIZED_NAME_DATE)
  private String date = null;

  public static final String SERIALIZED_NAME_DEDUCTION_COST = "deduction_cost";
  @SerializedName(SERIALIZED_NAME_DEDUCTION_COST)
  private Long deductionCost = null;

  public static final String SERIALIZED_NAME_GRANT_BALANCE = "grant_balance";
  @SerializedName(SERIALIZED_NAME_GRANT_BALANCE)
  private Long grantBalance = null;

  public static final String SERIALIZED_NAME_GRANT_COST = "grant_cost";
  @SerializedName(SERIALIZED_NAME_GRANT_COST)
  private Long grantCost = null;

  public static final String SERIALIZED_NAME_INCOME = "income";
  @SerializedName(SERIALIZED_NAME_INCOME)
  private Long income = null;

  public static final String SERIALIZED_NAME_QC_AWEME_CASH_COST = "qc_aweme_cash_cost";
  @SerializedName(SERIALIZED_NAME_QC_AWEME_CASH_COST)
  private Long qcAwemeCashCost = null;

  public static final String SERIALIZED_NAME_QC_AWEME_COST = "qc_aweme_cost";
  @SerializedName(SERIALIZED_NAME_QC_AWEME_COST)
  private Long qcAwemeCost = null;

  public static final String SERIALIZED_NAME_QC_AWEME_GRANT_COST = "qc_aweme_grant_cost";
  @SerializedName(SERIALIZED_NAME_QC_AWEME_GRANT_COST)
  private Long qcAwemeGrantCost = null;

  public static final String SERIALIZED_NAME_SHARE_COST = "share_cost";
  @SerializedName(SERIALIZED_NAME_SHARE_COST)
  private Long shareCost = null;

  public static final String SERIALIZED_NAME_SHARE_WALLET_COST = "share_wallet_cost";
  @SerializedName(SERIALIZED_NAME_SHARE_WALLET_COST)
  private Long shareWalletCost = null;

  public static final String SERIALIZED_NAME_TOTAL_BALANCE = "total_balance";
  @SerializedName(SERIALIZED_NAME_TOTAL_BALANCE)
  private Long totalBalance = null;

  public static final String SERIALIZED_NAME_TRANSFER_IN = "transfer_in";
  @SerializedName(SERIALIZED_NAME_TRANSFER_IN)
  private Long transferIn = null;

  public static final String SERIALIZED_NAME_TRANSFER_OUT = "transfer_out";
  @SerializedName(SERIALIZED_NAME_TRANSFER_OUT)
  private Long transferOut = null;

  public static final String SERIALIZED_NAME_VIEW_DELIVERY_TYPE = "view_delivery_type";
  @SerializedName(SERIALIZED_NAME_VIEW_DELIVERY_TYPE)
  private QianchuanFinanceDetailGetV10DataListViewDeliveryType viewDeliveryType = null;

  public QianchuanFinanceDetailGetV10ResponseDataListInner() {
  }

  public QianchuanFinanceDetailGetV10ResponseDataListInner cashBalance(Long cashBalance) {
    
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * 非赠款余额
   * @return cashBalance
  **/
  @javax.annotation.Nullable
  public Long getCashBalance() {
    return cashBalance;
  }


  public void setCashBalance(Long cashBalance) {
    this.cashBalance = cashBalance;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner cashCost(Long cashCost) {
    
    this.cashCost = cashCost;
    return this;
  }

   /**
   * 非赠款消耗
   * @return cashCost
  **/
  @javax.annotation.Nullable
  public Long getCashCost() {
    return cashCost;
  }


  public void setCashCost(Long cashCost) {
    this.cashCost = cashCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner cost(Long cost) {
    
    this.cost = cost;
    return this;
  }

   /**
   * 余额总消耗
   * @return cost
  **/
  @javax.annotation.Nullable
  public Long getCost() {
    return cost;
  }


  public void setCost(Long cost) {
    this.cost = cost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner date(String date) {
    
    this.date = date;
    return this;
  }

   /**
   * 日期，格式 2021-04-05
   * @return date
  **/
  @javax.annotation.Nullable
  public String getDate() {
    return date;
  }


  public void setDate(String date) {
    this.date = date;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner deductionCost(Long deductionCost) {
    
    this.deductionCost = deductionCost;
    return this;
  }

   /**
   * 消返红包消耗
   * @return deductionCost
  **/
  @javax.annotation.Nullable
  public Long getDeductionCost() {
    return deductionCost;
  }


  public void setDeductionCost(Long deductionCost) {
    this.deductionCost = deductionCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner grantBalance(Long grantBalance) {
    
    this.grantBalance = grantBalance;
    return this;
  }

   /**
   * 赠款余额
   * @return grantBalance
  **/
  @javax.annotation.Nullable
  public Long getGrantBalance() {
    return grantBalance;
  }


  public void setGrantBalance(Long grantBalance) {
    this.grantBalance = grantBalance;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner grantCost(Long grantCost) {
    
    this.grantCost = grantCost;
    return this;
  }

   /**
   * 赠款消耗
   * @return grantCost
  **/
  @javax.annotation.Nullable
  public Long getGrantCost() {
    return grantCost;
  }


  public void setGrantCost(Long grantCost) {
    this.grantCost = grantCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner income(Long income) {
    
    this.income = income;
    return this;
  }

   /**
   * 总存入
   * @return income
  **/
  @javax.annotation.Nullable
  public Long getIncome() {
    return income;
  }


  public void setIncome(Long income) {
    this.income = income;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner qcAwemeCashCost(Long qcAwemeCashCost) {
    
    this.qcAwemeCashCost = qcAwemeCashCost;
    return this;
  }

   /**
   * 随心推非赠款消耗
   * @return qcAwemeCashCost
  **/
  @javax.annotation.Nullable
  public Long getQcAwemeCashCost() {
    return qcAwemeCashCost;
  }


  public void setQcAwemeCashCost(Long qcAwemeCashCost) {
    this.qcAwemeCashCost = qcAwemeCashCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner qcAwemeCost(Long qcAwemeCost) {
    
    this.qcAwemeCost = qcAwemeCost;
    return this;
  }

   /**
   * 随心推消耗
   * @return qcAwemeCost
  **/
  @javax.annotation.Nullable
  public Long getQcAwemeCost() {
    return qcAwemeCost;
  }


  public void setQcAwemeCost(Long qcAwemeCost) {
    this.qcAwemeCost = qcAwemeCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner qcAwemeGrantCost(Long qcAwemeGrantCost) {
    
    this.qcAwemeGrantCost = qcAwemeGrantCost;
    return this;
  }

   /**
   * 随心推赠款消耗
   * @return qcAwemeGrantCost
  **/
  @javax.annotation.Nullable
  public Long getQcAwemeGrantCost() {
    return qcAwemeGrantCost;
  }


  public void setQcAwemeGrantCost(Long qcAwemeGrantCost) {
    this.qcAwemeGrantCost = qcAwemeGrantCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner shareCost(Long shareCost) {
    
    this.shareCost = shareCost;
    return this;
  }

   /**
   * 共享余额消耗
   * @return shareCost
  **/
  @javax.annotation.Nullable
  public Long getShareCost() {
    return shareCost;
  }


  public void setShareCost(Long shareCost) {
    this.shareCost = shareCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner shareWalletCost(Long shareWalletCost) {
    
    this.shareWalletCost = shareWalletCost;
    return this;
  }

   /**
   * 共享钱包消耗
   * @return shareWalletCost
  **/
  @javax.annotation.Nullable
  public Long getShareWalletCost() {
    return shareWalletCost;
  }


  public void setShareWalletCost(Long shareWalletCost) {
    this.shareWalletCost = shareWalletCost;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner totalBalance(Long totalBalance) {
    
    this.totalBalance = totalBalance;
    return this;
  }

   /**
   * 总余额
   * @return totalBalance
  **/
  @javax.annotation.Nullable
  public Long getTotalBalance() {
    return totalBalance;
  }


  public void setTotalBalance(Long totalBalance) {
    this.totalBalance = totalBalance;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner transferIn(Long transferIn) {
    
    this.transferIn = transferIn;
    return this;
  }

   /**
   * 总转入
   * @return transferIn
  **/
  @javax.annotation.Nullable
  public Long getTransferIn() {
    return transferIn;
  }


  public void setTransferIn(Long transferIn) {
    this.transferIn = transferIn;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner transferOut(Long transferOut) {
    
    this.transferOut = transferOut;
    return this;
  }

   /**
   * 总转出
   * @return transferOut
  **/
  @javax.annotation.Nullable
  public Long getTransferOut() {
    return transferOut;
  }


  public void setTransferOut(Long transferOut) {
    this.transferOut = transferOut;
  }


  public QianchuanFinanceDetailGetV10ResponseDataListInner viewDeliveryType(QianchuanFinanceDetailGetV10DataListViewDeliveryType viewDeliveryType) {
    
    this.viewDeliveryType = viewDeliveryType;
    return this;
  }

   /**
   * Get viewDeliveryType
   * @return viewDeliveryType
  **/
  @javax.annotation.Nullable
  public QianchuanFinanceDetailGetV10DataListViewDeliveryType getViewDeliveryType() {
    return viewDeliveryType;
  }


  public void setViewDeliveryType(QianchuanFinanceDetailGetV10DataListViewDeliveryType viewDeliveryType) {
    this.viewDeliveryType = viewDeliveryType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanFinanceDetailGetV10ResponseDataListInner qianchuanFinanceDetailGetV10ResponseDataListInner = (QianchuanFinanceDetailGetV10ResponseDataListInner) o;
    return Objects.equals(this.cashBalance, qianchuanFinanceDetailGetV10ResponseDataListInner.cashBalance) &&
        Objects.equals(this.cashCost, qianchuanFinanceDetailGetV10ResponseDataListInner.cashCost) &&
        Objects.equals(this.cost, qianchuanFinanceDetailGetV10ResponseDataListInner.cost) &&
        Objects.equals(this.date, qianchuanFinanceDetailGetV10ResponseDataListInner.date) &&
        Objects.equals(this.deductionCost, qianchuanFinanceDetailGetV10ResponseDataListInner.deductionCost) &&
        Objects.equals(this.grantBalance, qianchuanFinanceDetailGetV10ResponseDataListInner.grantBalance) &&
        Objects.equals(this.grantCost, qianchuanFinanceDetailGetV10ResponseDataListInner.grantCost) &&
        Objects.equals(this.income, qianchuanFinanceDetailGetV10ResponseDataListInner.income) &&
        Objects.equals(this.qcAwemeCashCost, qianchuanFinanceDetailGetV10ResponseDataListInner.qcAwemeCashCost) &&
        Objects.equals(this.qcAwemeCost, qianchuanFinanceDetailGetV10ResponseDataListInner.qcAwemeCost) &&
        Objects.equals(this.qcAwemeGrantCost, qianchuanFinanceDetailGetV10ResponseDataListInner.qcAwemeGrantCost) &&
        Objects.equals(this.shareCost, qianchuanFinanceDetailGetV10ResponseDataListInner.shareCost) &&
        Objects.equals(this.shareWalletCost, qianchuanFinanceDetailGetV10ResponseDataListInner.shareWalletCost) &&
        Objects.equals(this.totalBalance, qianchuanFinanceDetailGetV10ResponseDataListInner.totalBalance) &&
        Objects.equals(this.transferIn, qianchuanFinanceDetailGetV10ResponseDataListInner.transferIn) &&
        Objects.equals(this.transferOut, qianchuanFinanceDetailGetV10ResponseDataListInner.transferOut) &&
        Objects.equals(this.viewDeliveryType, qianchuanFinanceDetailGetV10ResponseDataListInner.viewDeliveryType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(cashBalance, cashCost, cost, date, deductionCost, grantBalance, grantCost, income, qcAwemeCashCost, qcAwemeCost, qcAwemeGrantCost, shareCost, shareWalletCost, totalBalance, transferIn, transferOut, viewDeliveryType);
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
    sb.append("class QianchuanFinanceDetailGetV10ResponseDataListInner {\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    cashCost: ").append(toIndentedString(cashCost)).append("\n");
    sb.append("    cost: ").append(toIndentedString(cost)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    deductionCost: ").append(toIndentedString(deductionCost)).append("\n");
    sb.append("    grantBalance: ").append(toIndentedString(grantBalance)).append("\n");
    sb.append("    grantCost: ").append(toIndentedString(grantCost)).append("\n");
    sb.append("    income: ").append(toIndentedString(income)).append("\n");
    sb.append("    qcAwemeCashCost: ").append(toIndentedString(qcAwemeCashCost)).append("\n");
    sb.append("    qcAwemeCost: ").append(toIndentedString(qcAwemeCost)).append("\n");
    sb.append("    qcAwemeGrantCost: ").append(toIndentedString(qcAwemeGrantCost)).append("\n");
    sb.append("    shareCost: ").append(toIndentedString(shareCost)).append("\n");
    sb.append("    shareWalletCost: ").append(toIndentedString(shareWalletCost)).append("\n");
    sb.append("    totalBalance: ").append(toIndentedString(totalBalance)).append("\n");
    sb.append("    transferIn: ").append(toIndentedString(transferIn)).append("\n");
    sb.append("    transferOut: ").append(toIndentedString(transferOut)).append("\n");
    sb.append("    viewDeliveryType: ").append(toIndentedString(viewDeliveryType)).append("\n");
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
    openapiFields.add("cash_balance");
    openapiFields.add("cash_cost");
    openapiFields.add("cost");
    openapiFields.add("date");
    openapiFields.add("deduction_cost");
    openapiFields.add("grant_balance");
    openapiFields.add("grant_cost");
    openapiFields.add("income");
    openapiFields.add("qc_aweme_cash_cost");
    openapiFields.add("qc_aweme_cost");
    openapiFields.add("qc_aweme_grant_cost");
    openapiFields.add("share_cost");
    openapiFields.add("share_wallet_cost");
    openapiFields.add("total_balance");
    openapiFields.add("transfer_in");
    openapiFields.add("transfer_out");
    openapiFields.add("view_delivery_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanFinanceDetailGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanFinanceDetailGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanFinanceDetailGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanFinanceDetailGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanFinanceDetailGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanFinanceDetailGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanFinanceDetailGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanFinanceDetailGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanFinanceDetailGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanFinanceDetailGetV10ResponseDataListInner
  */
  public static QianchuanFinanceDetailGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanFinanceDetailGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanFinanceDetailGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

