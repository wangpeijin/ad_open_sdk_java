/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10DeliverySettingBidMode;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10DeliverySettingBidType;
import com.bytedance.ads.model.QianchuanAwemeEstimateProfitV10DeliverySettingExternalAction;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class QianchuanAwemeEstimateProfitV10DeliverySetting {
  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Long amount = null;

  public static final String SERIALIZED_NAME_BID_MODE = "bid_mode";
  @SerializedName(SERIALIZED_NAME_BID_MODE)
  private QianchuanAwemeEstimateProfitV10DeliverySettingBidMode bidMode = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private QianchuanAwemeEstimateProfitV10DeliverySettingBidType bidType = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private QianchuanAwemeEstimateProfitV10DeliverySettingExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_PAY_ROI = "pay_roi";
  @SerializedName(SERIALIZED_NAME_PAY_ROI)
  private Double payRoi = null;

  public QianchuanAwemeEstimateProfitV10DeliverySetting() {
  }

  public QianchuanAwemeEstimateProfitV10DeliverySetting amount(Long amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 
   * @return amount
  **/
  @javax.annotation.Nonnull
  public Long getAmount() {
    return amount;
  }


  public void setAmount(Long amount) {
    this.amount = amount;
  }


  public QianchuanAwemeEstimateProfitV10DeliverySetting bidMode(QianchuanAwemeEstimateProfitV10DeliverySettingBidMode bidMode) {
    
    this.bidMode = bidMode;
    return this;
  }

   /**
   * Get bidMode
   * @return bidMode
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeEstimateProfitV10DeliverySettingBidMode getBidMode() {
    return bidMode;
  }


  public void setBidMode(QianchuanAwemeEstimateProfitV10DeliverySettingBidMode bidMode) {
    this.bidMode = bidMode;
  }


  public QianchuanAwemeEstimateProfitV10DeliverySetting bidType(QianchuanAwemeEstimateProfitV10DeliverySettingBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeEstimateProfitV10DeliverySettingBidType getBidType() {
    return bidType;
  }


  public void setBidType(QianchuanAwemeEstimateProfitV10DeliverySettingBidType bidType) {
    this.bidType = bidType;
  }


  public QianchuanAwemeEstimateProfitV10DeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public QianchuanAwemeEstimateProfitV10DeliverySetting externalAction(QianchuanAwemeEstimateProfitV10DeliverySettingExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public QianchuanAwemeEstimateProfitV10DeliverySettingExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(QianchuanAwemeEstimateProfitV10DeliverySettingExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public QianchuanAwemeEstimateProfitV10DeliverySetting payRoi(Double payRoi) {
    
    this.payRoi = payRoi;
    return this;
  }

   /**
   * 当ea为326时需要传
   * @return payRoi
  **/
  @javax.annotation.Nullable
  public Double getPayRoi() {
    return payRoi;
  }


  public void setPayRoi(Double payRoi) {
    this.payRoi = payRoi;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeEstimateProfitV10DeliverySetting qianchuanAwemeEstimateProfitV10DeliverySetting = (QianchuanAwemeEstimateProfitV10DeliverySetting) o;
    return Objects.equals(this.amount, qianchuanAwemeEstimateProfitV10DeliverySetting.amount) &&
        Objects.equals(this.bidMode, qianchuanAwemeEstimateProfitV10DeliverySetting.bidMode) &&
        Objects.equals(this.bidType, qianchuanAwemeEstimateProfitV10DeliverySetting.bidType) &&
        Objects.equals(this.cpaBid, qianchuanAwemeEstimateProfitV10DeliverySetting.cpaBid) &&
        Objects.equals(this.externalAction, qianchuanAwemeEstimateProfitV10DeliverySetting.externalAction) &&
        Objects.equals(this.payRoi, qianchuanAwemeEstimateProfitV10DeliverySetting.payRoi);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, bidMode, bidType, cpaBid, externalAction, payRoi);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAwemeEstimateProfitV10DeliverySetting {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    bidMode: ").append(toIndentedString(bidMode)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    payRoi: ").append(toIndentedString(payRoi)).append("\n");
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
    openapiFields.add("external_action");
    openapiFields.add("pay_roi");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("amount");
    openapiRequiredFields.add("bid_mode");
    openapiRequiredFields.add("external_action");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeEstimateProfitV10DeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeEstimateProfitV10DeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeEstimateProfitV10DeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeEstimateProfitV10DeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeEstimateProfitV10DeliverySetting>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeEstimateProfitV10DeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeEstimateProfitV10DeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeEstimateProfitV10DeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeEstimateProfitV10DeliverySetting
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeEstimateProfitV10DeliverySetting
  */
  public static QianchuanAwemeEstimateProfitV10DeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeEstimateProfitV10DeliverySetting.class);
  }

 /**
  * Convert an instance of QianchuanAwemeEstimateProfitV10DeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

