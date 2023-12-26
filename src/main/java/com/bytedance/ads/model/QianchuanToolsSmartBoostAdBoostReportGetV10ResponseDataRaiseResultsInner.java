/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
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
 * QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CLICK_CNT = "click_cnt";
  @SerializedName(SERIALIZED_NAME_CLICK_CNT)
  private Double clickCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_CNT = "convert_cnt";
  @SerializedName(SERIALIZED_NAME_CONVERT_CNT)
  private Double convertCnt = null;

  public static final String SERIALIZED_NAME_CONVERT_RATE = "convert_rate";
  @SerializedName(SERIALIZED_NAME_CONVERT_RATE)
  private Double convertRate = null;

  public static final String SERIALIZED_NAME_CTR = "ctr";
  @SerializedName(SERIALIZED_NAME_CTR)
  private Double ctr = null;

  public static final String SERIALIZED_NAME_PAY_ORDER_AMOUNT_GMV = "pay_order_amount_gmv";
  @SerializedName(SERIALIZED_NAME_PAY_ORDER_AMOUNT_GMV)
  private Double payOrderAmountGmv = null;

  public static final String SERIALIZED_NAME_PREPAY_AND_PAY_ORDER_ROI = "prepay_and_pay_order_roi";
  @SerializedName(SERIALIZED_NAME_PREPAY_AND_PAY_ORDER_ROI)
  private Double prepayAndPayOrderRoi = null;

  public static final String SERIALIZED_NAME_SHOW_CNT = "show_cnt";
  @SerializedName(SERIALIZED_NAME_SHOW_CNT)
  private Double showCnt = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public static final String SERIALIZED_NAME_STAT_DATETIME = "stat_datetime";
  @SerializedName(SERIALIZED_NAME_STAT_DATETIME)
  private String statDatetime = null;

  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner() {
  }

  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 广告计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 千川广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner clickCnt(Double clickCnt) {
    
    this.clickCnt = clickCnt;
    return this;
  }

   /**
   * 起量点击次数
   * @return clickCnt
  **/
  @javax.annotation.Nullable
  public Double getClickCnt() {
    return clickCnt;
  }


  public void setClickCnt(Double clickCnt) {
    this.clickCnt = clickCnt;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner convertCnt(Double convertCnt) {
    
    this.convertCnt = convertCnt;
    return this;
  }

   /**
   * 起量转化数
   * @return convertCnt
  **/
  @javax.annotation.Nullable
  public Double getConvertCnt() {
    return convertCnt;
  }


  public void setConvertCnt(Double convertCnt) {
    this.convertCnt = convertCnt;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner convertRate(Double convertRate) {
    
    this.convertRate = convertRate;
    return this;
  }

   /**
   * 起量转化率
   * @return convertRate
  **/
  @javax.annotation.Nullable
  public Double getConvertRate() {
    return convertRate;
  }


  public void setConvertRate(Double convertRate) {
    this.convertRate = convertRate;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner ctr(Double ctr) {
    
    this.ctr = ctr;
    return this;
  }

   /**
   * 起量点击率
   * @return ctr
  **/
  @javax.annotation.Nullable
  public Double getCtr() {
    return ctr;
  }


  public void setCtr(Double ctr) {
    this.ctr = ctr;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner payOrderAmountGmv(Double payOrderAmountGmv) {
    
    this.payOrderAmountGmv = payOrderAmountGmv;
    return this;
  }

   /**
   * 起量直接成交金额，单位元，小数点后两位
   * @return payOrderAmountGmv
  **/
  @javax.annotation.Nullable
  public Double getPayOrderAmountGmv() {
    return payOrderAmountGmv;
  }


  public void setPayOrderAmountGmv(Double payOrderAmountGmv) {
    this.payOrderAmountGmv = payOrderAmountGmv;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner prepayAndPayOrderRoi(Double prepayAndPayOrderRoi) {
    
    this.prepayAndPayOrderRoi = prepayAndPayOrderRoi;
    return this;
  }

   /**
   * 起量直接支付ROI
   * @return prepayAndPayOrderRoi
  **/
  @javax.annotation.Nullable
  public Double getPrepayAndPayOrderRoi() {
    return prepayAndPayOrderRoi;
  }


  public void setPrepayAndPayOrderRoi(Double prepayAndPayOrderRoi) {
    this.prepayAndPayOrderRoi = prepayAndPayOrderRoi;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner showCnt(Double showCnt) {
    
    this.showCnt = showCnt;
    return this;
  }

   /**
   * 起量展示次数
   * @return showCnt
  **/
  @javax.annotation.Nullable
  public Double getShowCnt() {
    return showCnt;
  }


  public void setShowCnt(Double showCnt) {
    this.showCnt = showCnt;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 起量消耗，单位元，小数点后两位
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }


  public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner statDatetime(String statDatetime) {
    
    this.statDatetime = statDatetime;
    return this;
  }

   /**
   * 数据起始时间，格式为：yyyy-MM-dd HH:mm:ss
   * @return statDatetime
  **/
  @javax.annotation.Nullable
  public String getStatDatetime() {
    return statDatetime;
  }


  public void setStatDatetime(String statDatetime) {
    this.statDatetime = statDatetime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner = (QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner) o;
    return Objects.equals(this.adId, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.adId) &&
        Objects.equals(this.advertiserId, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.advertiserId) &&
        Objects.equals(this.clickCnt, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.clickCnt) &&
        Objects.equals(this.convertCnt, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.convertCnt) &&
        Objects.equals(this.convertRate, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.convertRate) &&
        Objects.equals(this.ctr, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.ctr) &&
        Objects.equals(this.payOrderAmountGmv, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.payOrderAmountGmv) &&
        Objects.equals(this.prepayAndPayOrderRoi, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.prepayAndPayOrderRoi) &&
        Objects.equals(this.showCnt, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.showCnt) &&
        Objects.equals(this.statCost, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.statCost) &&
        Objects.equals(this.statDatetime, qianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.statDatetime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, advertiserId, clickCnt, convertCnt, convertRate, ctr, payOrderAmountGmv, prepayAndPayOrderRoi, showCnt, statCost, statDatetime);
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
    sb.append("class QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    clickCnt: ").append(toIndentedString(clickCnt)).append("\n");
    sb.append("    convertCnt: ").append(toIndentedString(convertCnt)).append("\n");
    sb.append("    convertRate: ").append(toIndentedString(convertRate)).append("\n");
    sb.append("    ctr: ").append(toIndentedString(ctr)).append("\n");
    sb.append("    payOrderAmountGmv: ").append(toIndentedString(payOrderAmountGmv)).append("\n");
    sb.append("    prepayAndPayOrderRoi: ").append(toIndentedString(prepayAndPayOrderRoi)).append("\n");
    sb.append("    showCnt: ").append(toIndentedString(showCnt)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
    sb.append("    statDatetime: ").append(toIndentedString(statDatetime)).append("\n");
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
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("click_cnt");
    openapiFields.add("convert_cnt");
    openapiFields.add("convert_rate");
    openapiFields.add("ctr");
    openapiFields.add("pay_order_amount_gmv");
    openapiFields.add("prepay_and_pay_order_roi");
    openapiFields.add("show_cnt");
    openapiFields.add("stat_cost");
    openapiFields.add("stat_datetime");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner>() {
           @Override
           public void write(JsonWriter out, QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner
  */
  public static QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner.class);
  }

 /**
  * Convert an instance of QianchuanToolsSmartBoostAdBoostReportGetV10ResponseDataRaiseResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

