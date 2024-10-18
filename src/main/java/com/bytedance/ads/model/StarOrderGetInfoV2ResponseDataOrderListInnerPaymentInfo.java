/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
 * 资金信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo {
  public static final String SERIALIZED_NAME_DEDUCT_AMOUNT = "deduct_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AMOUNT)
  private Long deductAmount = null;

  public static final String SERIALIZED_NAME_PLATFORM_FEE = "platform_fee";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE)
  private Long platformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_DEDUCT_AMOUNT = "precise_deduct_amount";
  @SerializedName(SERIALIZED_NAME_PRECISE_DEDUCT_AMOUNT)
  private Double preciseDeductAmount = null;

  public static final String SERIALIZED_NAME_PRECISE_PLATFORM_FEE = "precise_platform_fee";
  @SerializedName(SERIALIZED_NAME_PRECISE_PLATFORM_FEE)
  private Double precisePlatformFee = null;

  public static final String SERIALIZED_NAME_PRECISE_REFUND_AMOUNT = "precise_refund_amount";
  @SerializedName(SERIALIZED_NAME_PRECISE_REFUND_AMOUNT)
  private Double preciseRefundAmount = null;

  public static final String SERIALIZED_NAME_PRECISE_TASK_COST = "precise_task_cost";
  @SerializedName(SERIALIZED_NAME_PRECISE_TASK_COST)
  private Double preciseTaskCost = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL = "precise_total";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL)
  private Double preciseTotal = null;

  public static final String SERIALIZED_NAME_PRECISE_TOTAL_PAID = "precise_total_paid";
  @SerializedName(SERIALIZED_NAME_PRECISE_TOTAL_PAID)
  private Double preciseTotalPaid = null;

  public static final String SERIALIZED_NAME_REFUND_AMOUNT = "refund_amount";
  @SerializedName(SERIALIZED_NAME_REFUND_AMOUNT)
  private Long refundAmount = null;

  public static final String SERIALIZED_NAME_TASK_COST = "task_cost";
  @SerializedName(SERIALIZED_NAME_TASK_COST)
  private Long taskCost = null;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Long total = null;

  public static final String SERIALIZED_NAME_TOTAL_PAID = "total_paid";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAID)
  private Long totalPaid = null;

  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo() {
  }

  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo deductAmount(Long deductAmount) {
    
    this.deductAmount = deductAmount;
    return this;
  }

   /**
   * 已扣除金额
   * @return deductAmount
  **/
  @javax.annotation.Nullable
  public Long getDeductAmount() {
    return deductAmount;
  }


  public void setDeductAmount(Long deductAmount) {
    this.deductAmount = deductAmount;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo platformFee(Long platformFee) {
    
    this.platformFee = platformFee;
    return this;
  }

   /**
   * 服务费
   * @return platformFee
  **/
  @javax.annotation.Nullable
  public Long getPlatformFee() {
    return platformFee;
  }


  public void setPlatformFee(Long platformFee) {
    this.platformFee = platformFee;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo preciseDeductAmount(Double preciseDeductAmount) {
    
    this.preciseDeductAmount = preciseDeductAmount;
    return this;
  }

   /**
   * 精确已扣除金额
   * @return preciseDeductAmount
  **/
  @javax.annotation.Nullable
  public Double getPreciseDeductAmount() {
    return preciseDeductAmount;
  }


  public void setPreciseDeductAmount(Double preciseDeductAmount) {
    this.preciseDeductAmount = preciseDeductAmount;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo precisePlatformFee(Double precisePlatformFee) {
    
    this.precisePlatformFee = precisePlatformFee;
    return this;
  }

   /**
   * 精确服务费
   * @return precisePlatformFee
  **/
  @javax.annotation.Nullable
  public Double getPrecisePlatformFee() {
    return precisePlatformFee;
  }


  public void setPrecisePlatformFee(Double precisePlatformFee) {
    this.precisePlatformFee = precisePlatformFee;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo preciseRefundAmount(Double preciseRefundAmount) {
    
    this.preciseRefundAmount = preciseRefundAmount;
    return this;
  }

   /**
   * 精确已退还金额
   * @return preciseRefundAmount
  **/
  @javax.annotation.Nullable
  public Double getPreciseRefundAmount() {
    return preciseRefundAmount;
  }


  public void setPreciseRefundAmount(Double preciseRefundAmount) {
    this.preciseRefundAmount = preciseRefundAmount;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo preciseTaskCost(Double preciseTaskCost) {
    
    this.preciseTaskCost = preciseTaskCost;
    return this;
  }

   /**
   * 精确任务金额
   * @return preciseTaskCost
  **/
  @javax.annotation.Nullable
  public Double getPreciseTaskCost() {
    return preciseTaskCost;
  }


  public void setPreciseTaskCost(Double preciseTaskCost) {
    this.preciseTaskCost = preciseTaskCost;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo preciseTotal(Double preciseTotal) {
    
    this.preciseTotal = preciseTotal;
    return this;
  }

   /**
   * 精确任务总金额
   * @return preciseTotal
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotal() {
    return preciseTotal;
  }


  public void setPreciseTotal(Double preciseTotal) {
    this.preciseTotal = preciseTotal;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo preciseTotalPaid(Double preciseTotalPaid) {
    
    this.preciseTotalPaid = preciseTotalPaid;
    return this;
  }

   /**
   * 精确已付金额（元，下同）
   * @return preciseTotalPaid
  **/
  @javax.annotation.Nullable
  public Double getPreciseTotalPaid() {
    return preciseTotalPaid;
  }


  public void setPreciseTotalPaid(Double preciseTotalPaid) {
    this.preciseTotalPaid = preciseTotalPaid;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo refundAmount(Long refundAmount) {
    
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * 已退还金额
   * @return refundAmount
  **/
  @javax.annotation.Nullable
  public Long getRefundAmount() {
    return refundAmount;
  }


  public void setRefundAmount(Long refundAmount) {
    this.refundAmount = refundAmount;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo taskCost(Long taskCost) {
    
    this.taskCost = taskCost;
    return this;
  }

   /**
   * 任务金额
   * @return taskCost
  **/
  @javax.annotation.Nullable
  public Long getTaskCost() {
    return taskCost;
  }


  public void setTaskCost(Long taskCost) {
    this.taskCost = taskCost;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo total(Long total) {
    
    this.total = total;
    return this;
  }

   /**
   * 任务总金额
   * @return total
  **/
  @javax.annotation.Nullable
  public Long getTotal() {
    return total;
  }


  public void setTotal(Long total) {
    this.total = total;
  }


  public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo totalPaid(Long totalPaid) {
    
    this.totalPaid = totalPaid;
    return this;
  }

   /**
   * 已付金额（元，下同）
   * @return totalPaid
  **/
  @javax.annotation.Nullable
  public Long getTotalPaid() {
    return totalPaid;
  }


  public void setTotalPaid(Long totalPaid) {
    this.totalPaid = totalPaid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo = (StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo) o;
    return Objects.equals(this.deductAmount, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.deductAmount) &&
        Objects.equals(this.platformFee, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.platformFee) &&
        Objects.equals(this.preciseDeductAmount, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.preciseDeductAmount) &&
        Objects.equals(this.precisePlatformFee, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.precisePlatformFee) &&
        Objects.equals(this.preciseRefundAmount, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.preciseRefundAmount) &&
        Objects.equals(this.preciseTaskCost, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.preciseTaskCost) &&
        Objects.equals(this.preciseTotal, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.preciseTotal) &&
        Objects.equals(this.preciseTotalPaid, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.preciseTotalPaid) &&
        Objects.equals(this.refundAmount, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.refundAmount) &&
        Objects.equals(this.taskCost, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.taskCost) &&
        Objects.equals(this.total, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.total) &&
        Objects.equals(this.totalPaid, starOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.totalPaid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductAmount, platformFee, preciseDeductAmount, precisePlatformFee, preciseRefundAmount, preciseTaskCost, preciseTotal, preciseTotalPaid, refundAmount, taskCost, total, totalPaid);
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
    sb.append("class StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo {\n");
    sb.append("    deductAmount: ").append(toIndentedString(deductAmount)).append("\n");
    sb.append("    platformFee: ").append(toIndentedString(platformFee)).append("\n");
    sb.append("    preciseDeductAmount: ").append(toIndentedString(preciseDeductAmount)).append("\n");
    sb.append("    precisePlatformFee: ").append(toIndentedString(precisePlatformFee)).append("\n");
    sb.append("    preciseRefundAmount: ").append(toIndentedString(preciseRefundAmount)).append("\n");
    sb.append("    preciseTaskCost: ").append(toIndentedString(preciseTaskCost)).append("\n");
    sb.append("    preciseTotal: ").append(toIndentedString(preciseTotal)).append("\n");
    sb.append("    preciseTotalPaid: ").append(toIndentedString(preciseTotalPaid)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    taskCost: ").append(toIndentedString(taskCost)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalPaid: ").append(toIndentedString(totalPaid)).append("\n");
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
    openapiFields.add("deduct_amount");
    openapiFields.add("platform_fee");
    openapiFields.add("precise_deduct_amount");
    openapiFields.add("precise_platform_fee");
    openapiFields.add("precise_refund_amount");
    openapiFields.add("precise_task_cost");
    openapiFields.add("precise_total");
    openapiFields.add("precise_total_paid");
    openapiFields.add("refund_amount");
    openapiFields.add("task_cost");
    openapiFields.add("total");
    openapiFields.add("total_paid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo
  */
  public static StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo.class);
  }

 /**
  * Convert an instance of StarOrderGetInfoV2ResponseDataOrderListInnerPaymentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

