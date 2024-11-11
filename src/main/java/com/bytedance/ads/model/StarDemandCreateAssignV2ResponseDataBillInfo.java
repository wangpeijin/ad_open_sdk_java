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
import com.bytedance.ads.model.StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 账单明细
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class StarDemandCreateAssignV2ResponseDataBillInfo {
  public static final String SERIALIZED_NAME_BALANCE = "balance";
  @SerializedName(SERIALIZED_NAME_BALANCE)
  private Long balance = null;

  public static final String SERIALIZED_NAME_ORDER_BILL_LIST = "order_bill_list";
  @SerializedName(SERIALIZED_NAME_ORDER_BILL_LIST)
  private List<StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner> orderBillList = null;

  public static final String SERIALIZED_NAME_PRECISE_BALANCE = "precise_balance";
  @SerializedName(SERIALIZED_NAME_PRECISE_BALANCE)
  private Double preciseBalance = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_AMOUNT = "precise_total_amount";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_AMOUNT)
  private Double preciseTotalAmount = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_PLATFORM_FEE = "precise_total_platform_fee";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_PLATFORM_FEE)
  private Double preciseTotalPlatformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_REMAINING = "precise_total_remaining";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_REMAINING)
  private Double preciseTotalRemaining = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_TASK_COST = "precise_total_task_cost";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_TASK_COST)
  private Double preciseTotalTaskCost = null;

  public static final String SERIALIZED_NAME_TOTAL_AMOUNT = "total_amount";
  @SerializedName(SERIALIZED_NAME_TOTAL_AMOUNT)
  private Long totalAmount = null;

  public static final String SERIALIZED_NAME_TOTAL_PLATFORM_FEE = "total_platform_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_PLATFORM_FEE)
  private Long totalPlatformFee = null;

  public static final String SERIALIZED_NAME_TOTAL_REMAINING = "total_remaining";
  @SerializedName(SERIALIZED_NAME_TOTAL_REMAINING)
  private Long totalRemaining = null;

  public static final String SERIALIZED_NAME_TOTAL_TASK_COST = "total_task_cost";
  @SerializedName(SERIALIZED_NAME_TOTAL_TASK_COST)
  private Long totalTaskCost = null;

  public StarDemandCreateAssignV2ResponseDataBillInfo() {
  }

  public StarDemandCreateAssignV2ResponseDataBillInfo balance(Long balance) {
    
    this.balance = balance;
    return this;
  }

   /**
   * 可用余额（单位元，下同）
   * @return balance
  **/
  @javax.annotation.Nullable
  public Long getBalance() {
    return balance;
  }


  public void setBalance(Long balance) {
    this.balance = balance;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo orderBillList(List<StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner> orderBillList) {
    
    this.orderBillList = orderBillList;
    return this;
  }

  public StarDemandCreateAssignV2ResponseDataBillInfo addOrderBillListItem(StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner orderBillListItem) {
    if (this.orderBillList == null) {
      this.orderBillList = new ArrayList<>();
    }
    this.orderBillList.add(orderBillListItem);
    return this;
  }

   /**
   * 每个任务金额明细
   * @return orderBillList
  **/
  @javax.annotation.Nullable
  public List<StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner> getOrderBillList() {
    return orderBillList;
  }


  public void setOrderBillList(List<StarDemandCreateAssignV2ResponseDataBillInfoOrderBillListInner> orderBillList) {
    this.orderBillList = orderBillList;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo preciseBalance(Double preciseBalance) {
    
    this.preciseBalance = preciseBalance;
    return this;
  }

   /**
   * 精确可用余额（单位元，下同）
   * @return preciseBalance
  **/
  @javax.annotation.Nullable
  public Double getPreciseBalance() {
    return preciseBalance;
  }


  public void setPreciseBalance(Double preciseBalance) {
    this.preciseBalance = preciseBalance;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo preciseTotalAmount(Double preciseTotalAmount) {
    
    this.preciseTotalAmount = preciseTotalAmount;
    return this;
  }

   /**
   * 精确总金额
   * @return preciseTotalAmount
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalAmount() {
    return preciseTotalAmount;
  }


  public void setPreciseTotalAmount(Double preciseTotalAmount) {
    this.preciseTotalAmount = preciseTotalAmount;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo preciseTotalPlatformFee(Double preciseTotalPlatformFee) {
    
    this.preciseTotalPlatformFee = preciseTotalPlatformFee;
    return this;
  }

   /**
   * 精确总服务费
   * @return preciseTotalPlatformFee
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalPlatformFee() {
    return preciseTotalPlatformFee;
  }


  public void setPreciseTotalPlatformFee(Double preciseTotalPlatformFee) {
    this.preciseTotalPlatformFee = preciseTotalPlatformFee;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo preciseTotalRemaining(Double preciseTotalRemaining) {
    
    this.preciseTotalRemaining = preciseTotalRemaining;
    return this;
  }

   /**
   * 精确待付金额
   * @return preciseTotalRemaining
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalRemaining() {
    return preciseTotalRemaining;
  }


  public void setPreciseTotalRemaining(Double preciseTotalRemaining) {
    this.preciseTotalRemaining = preciseTotalRemaining;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo preciseTotalTaskCost(Double preciseTotalTaskCost) {
    
    this.preciseTotalTaskCost = preciseTotalTaskCost;
    return this;
  }

   /**
   * 精确任务总金额
   * @return preciseTotalTaskCost
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalTaskCost() {
    return preciseTotalTaskCost;
  }


  public void setPreciseTotalTaskCost(Double preciseTotalTaskCost) {
    this.preciseTotalTaskCost = preciseTotalTaskCost;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo totalAmount(Long totalAmount) {
    
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * 总金额
   * @return totalAmount
  **/
  @javax.annotation.Nullable
  public Long getTotalAmount() {
    return totalAmount;
  }


  public void setTotalAmount(Long totalAmount) {
    this.totalAmount = totalAmount;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo totalPlatformFee(Long totalPlatformFee) {
    
    this.totalPlatformFee = totalPlatformFee;
    return this;
  }

   /**
   * 总服务费
   * @return totalPlatformFee
  **/
  @javax.annotation.Nullable
  public Long getTotalPlatformFee() {
    return totalPlatformFee;
  }


  public void setTotalPlatformFee(Long totalPlatformFee) {
    this.totalPlatformFee = totalPlatformFee;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo totalRemaining(Long totalRemaining) {
    
    this.totalRemaining = totalRemaining;
    return this;
  }

   /**
   * 待付金额
   * @return totalRemaining
  **/
  @javax.annotation.Nullable
  public Long getTotalRemaining() {
    return totalRemaining;
  }


  public void setTotalRemaining(Long totalRemaining) {
    this.totalRemaining = totalRemaining;
  }


  public StarDemandCreateAssignV2ResponseDataBillInfo totalTaskCost(Long totalTaskCost) {
    
    this.totalTaskCost = totalTaskCost;
    return this;
  }

   /**
   * 任务总金额
   * @return totalTaskCost
  **/
  @javax.annotation.Nullable
  public Long getTotalTaskCost() {
    return totalTaskCost;
  }


  public void setTotalTaskCost(Long totalTaskCost) {
    this.totalTaskCost = totalTaskCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandCreateAssignV2ResponseDataBillInfo starDemandCreateAssignV2ResponseDataBillInfo = (StarDemandCreateAssignV2ResponseDataBillInfo) o;
    return Objects.equals(this.balance, starDemandCreateAssignV2ResponseDataBillInfo.balance) &&
        Objects.equals(this.orderBillList, starDemandCreateAssignV2ResponseDataBillInfo.orderBillList) &&
        Objects.equals(this.preciseBalance, starDemandCreateAssignV2ResponseDataBillInfo.preciseBalance) &&
        Objects.equals(this.preciseTotalAmount, starDemandCreateAssignV2ResponseDataBillInfo.preciseTotalAmount) &&
        Objects.equals(this.preciseTotalPlatformFee, starDemandCreateAssignV2ResponseDataBillInfo.preciseTotalPlatformFee) &&
        Objects.equals(this.preciseTotalRemaining, starDemandCreateAssignV2ResponseDataBillInfo.preciseTotalRemaining) &&
        Objects.equals(this.preciseTotalTaskCost, starDemandCreateAssignV2ResponseDataBillInfo.preciseTotalTaskCost) &&
        Objects.equals(this.totalAmount, starDemandCreateAssignV2ResponseDataBillInfo.totalAmount) &&
        Objects.equals(this.totalPlatformFee, starDemandCreateAssignV2ResponseDataBillInfo.totalPlatformFee) &&
        Objects.equals(this.totalRemaining, starDemandCreateAssignV2ResponseDataBillInfo.totalRemaining) &&
        Objects.equals(this.totalTaskCost, starDemandCreateAssignV2ResponseDataBillInfo.totalTaskCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, orderBillList, preciseBalance, preciseTotalAmount, preciseTotalPlatformFee, preciseTotalRemaining, preciseTotalTaskCost, totalAmount, totalPlatformFee, totalRemaining, totalTaskCost);
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
    sb.append("class StarDemandCreateAssignV2ResponseDataBillInfo {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    orderBillList: ").append(toIndentedString(orderBillList)).append("\n");
    sb.append("    preciseBalance: ").append(toIndentedString(preciseBalance)).append("\n");
    sb.append("    preciseTotalAmount: ").append(toIndentedString(preciseTotalAmount)).append("\n");
    sb.append("    preciseTotalPlatformFee: ").append(toIndentedString(preciseTotalPlatformFee)).append("\n");
    sb.append("    preciseTotalRemaining: ").append(toIndentedString(preciseTotalRemaining)).append("\n");
    sb.append("    preciseTotalTaskCost: ").append(toIndentedString(preciseTotalTaskCost)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    totalPlatformFee: ").append(toIndentedString(totalPlatformFee)).append("\n");
    sb.append("    totalRemaining: ").append(toIndentedString(totalRemaining)).append("\n");
    sb.append("    totalTaskCost: ").append(toIndentedString(totalTaskCost)).append("\n");
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
    openapiFields.add("order_bill_list");
    openapiFields.add("precise_balance");
    openapiFields.add("precise_total_amount");
    openapiFields.add("precise_total_platform_fee");
    openapiFields.add("precise_total_remaining");
    openapiFields.add("precise_total_task_cost");
    openapiFields.add("total_amount");
    openapiFields.add("total_platform_fee");
    openapiFields.add("total_remaining");
    openapiFields.add("total_task_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateAssignV2ResponseDataBillInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateAssignV2ResponseDataBillInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateAssignV2ResponseDataBillInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateAssignV2ResponseDataBillInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateAssignV2ResponseDataBillInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateAssignV2ResponseDataBillInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateAssignV2ResponseDataBillInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateAssignV2ResponseDataBillInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateAssignV2ResponseDataBillInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateAssignV2ResponseDataBillInfo
  */
  public static StarDemandCreateAssignV2ResponseDataBillInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateAssignV2ResponseDataBillInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateAssignV2ResponseDataBillInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

