/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class StarOrderDetailV2ResponseDataPaymentInfo {
  public static final String SERIALIZED_NAME_DEDUCT_AMOUNT = "deduct_amount";
  @SerializedName(SERIALIZED_NAME_DEDUCT_AMOUNT)
  private Long deductAmount = null;

  public static final String SERIALIZED_NAME_PLATFORM_FEE = "platform_fee";
  @SerializedName(SERIALIZED_NAME_PLATFORM_FEE)
  private Long platformFee = null;

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

  public StarOrderDetailV2ResponseDataPaymentInfo() {
  }

  public StarOrderDetailV2ResponseDataPaymentInfo deductAmount(Long deductAmount) {
    
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


  public StarOrderDetailV2ResponseDataPaymentInfo platformFee(Long platformFee) {
    
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


  public StarOrderDetailV2ResponseDataPaymentInfo refundAmount(Long refundAmount) {
    
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


  public StarOrderDetailV2ResponseDataPaymentInfo taskCost(Long taskCost) {
    
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


  public StarOrderDetailV2ResponseDataPaymentInfo total(Long total) {
    
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


  public StarOrderDetailV2ResponseDataPaymentInfo totalPaid(Long totalPaid) {
    
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
    StarOrderDetailV2ResponseDataPaymentInfo starOrderDetailV2ResponseDataPaymentInfo = (StarOrderDetailV2ResponseDataPaymentInfo) o;
    return Objects.equals(this.deductAmount, starOrderDetailV2ResponseDataPaymentInfo.deductAmount) &&
        Objects.equals(this.platformFee, starOrderDetailV2ResponseDataPaymentInfo.platformFee) &&
        Objects.equals(this.refundAmount, starOrderDetailV2ResponseDataPaymentInfo.refundAmount) &&
        Objects.equals(this.taskCost, starOrderDetailV2ResponseDataPaymentInfo.taskCost) &&
        Objects.equals(this.total, starOrderDetailV2ResponseDataPaymentInfo.total) &&
        Objects.equals(this.totalPaid, starOrderDetailV2ResponseDataPaymentInfo.totalPaid);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(deductAmount, platformFee, refundAmount, taskCost, total, totalPaid);
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
    sb.append("class StarOrderDetailV2ResponseDataPaymentInfo {\n");
    sb.append("    deductAmount: ").append(toIndentedString(deductAmount)).append("\n");
    sb.append("    platformFee: ").append(toIndentedString(platformFee)).append("\n");
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
       if (!StarOrderDetailV2ResponseDataPaymentInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarOrderDetailV2ResponseDataPaymentInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarOrderDetailV2ResponseDataPaymentInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarOrderDetailV2ResponseDataPaymentInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarOrderDetailV2ResponseDataPaymentInfo>() {
           @Override
           public void write(JsonWriter out, StarOrderDetailV2ResponseDataPaymentInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarOrderDetailV2ResponseDataPaymentInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarOrderDetailV2ResponseDataPaymentInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarOrderDetailV2ResponseDataPaymentInfo
  * @throws IOException if the JSON string is invalid with respect to StarOrderDetailV2ResponseDataPaymentInfo
  */
  public static StarOrderDetailV2ResponseDataPaymentInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarOrderDetailV2ResponseDataPaymentInfo.class);
  }

 /**
  * Convert an instance of StarOrderDetailV2ResponseDataPaymentInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

