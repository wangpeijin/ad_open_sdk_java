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
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidMode;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidType;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode;
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
 * 投放设置
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_BID_MODE = "bid_mode";
  @SerializedName(SERIALIZED_NAME_BID_MODE)
  private QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidMode bidMode = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidType bidType = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DELIVERY_TIME = "delivery_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME)
  private Double deliveryTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LIVEROOM_HEAT_MODE = "liveroom_heat_mode";
  @SerializedName(SERIALIZED_NAME_LIVEROOM_HEAT_MODE)
  private QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode liveroomHeatMode = null;

  public static final String SERIALIZED_NAME_PAYMENT_AMOUNT = "payment_amount";
  @SerializedName(SERIALIZED_NAME_PAYMENT_AMOUNT)
  private Double paymentAmount = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 投放金额
   * @return amount
  **/
  @javax.annotation.Nullable
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting bidMode(QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidMode bidMode) {
    
    this.bidMode = bidMode;
    return this;
  }

   /**
   * Get bidMode
   * @return bidMode
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidMode getBidMode() {
    return bidMode;
  }


  public void setBidMode(QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidMode bidMode) {
    this.bidMode = bidMode;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting bidType(QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidType getBidType() {
    return bidType;
  }


  public void setBidType(QianchuanAwemeOrderDetailGetV10DataDeliverySettingBidType bidType) {
    this.bidType = bidType;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 手动出价金额
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting deliveryTime(Double deliveryTime) {
    
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * 期望曝光时长
   * @return deliveryTime
  **/
  @javax.annotation.Nullable
  public Double getDeliveryTime() {
    return deliveryTime;
  }


  public void setDeliveryTime(Double deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting externalAction(QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAwemeOrderDetailGetV10DataDeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting liveroomHeatMode(QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode liveroomHeatMode) {
    
    this.liveroomHeatMode = liveroomHeatMode;
    return this;
  }

   /**
   * Get liveroomHeatMode
   * @return liveroomHeatMode
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode getLiveroomHeatMode() {
    return liveroomHeatMode;
  }


  public void setLiveroomHeatMode(QianchuanAwemeOrderDetailGetV10DataDeliverySettingLiveroomHeatMode liveroomHeatMode) {
    this.liveroomHeatMode = liveroomHeatMode;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting paymentAmount(Double paymentAmount) {
    
    this.paymentAmount = paymentAmount;
    return this;
  }

   /**
   * 实际支付金额
   * @return paymentAmount
  **/
  @javax.annotation.Nullable
  public Double getPaymentAmount() {
    return paymentAmount;
  }


  public void setPaymentAmount(Double paymentAmount) {
    this.paymentAmount = paymentAmount;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 支付ROI目标
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting = (QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting) o;
    return Objects.equals(this.amount, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.amount) &&
        Objects.equals(this.bidMode, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.bidMode) &&
        Objects.equals(this.bidType, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.bidType) &&
        Objects.equals(this.cpaBid, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.cpaBid) &&
        Objects.equals(this.deliveryTime, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.deliveryTime) &&
        Objects.equals(this.externalAction, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.externalAction) &&
        Objects.equals(this.liveroomHeatMode, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.liveroomHeatMode) &&
        Objects.equals(this.paymentAmount, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.paymentAmount) &&
        Objects.equals(this.roiGoal, qianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.roiGoal);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidMode, bidType, cpaBid, deliveryTime, externalAction, liveroomHeatMode, paymentAmount, roiGoal);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidMode: ").append(toIndentedString(bidMode)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    liveroomHeatMode: ").append(toIndentedString(liveroomHeatMode)).append("\n");
    sb.append("    paymentAmount: ").append(toIndentedString(paymentAmount)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("bid_mode");
    openapiFields.add("bid_type");
    openapiFields.add("cpa_bid");
    openapiFields.add("delivery_time");
    openapiFields.add("external_action");
    openapiFields.add("liveroom_heat_mode");
    openapiFields.add("payment_amount");
    openapiFields.add("roi_goal");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

