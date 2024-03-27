/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.0
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
 * ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-03-27T16:44:31.053125984+08:00[PRC]")
public class ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner {
  public static final String SERIALIZED_NAME_AD_CREATE_CLUE_DATE = "ad_create_clue_date";
  @SerializedName(SERIALIZED_NAME_AD_CREATE_CLUE_DATE)
  private String adCreateClueDate = null;

  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ADVERTISER_NAME = "advertiser_name";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_NAME)
  private String advertiserName = null;

  public static final String SERIALIZED_NAME_MONTH = "month";
  @SerializedName(SERIALIZED_NAME_MONTH)
  private String month = null;

  public static final String SERIALIZED_NAME_PARTICIPATE_REFUND_CLUE_CNT = "participate_refund_clue_cnt";
  @SerializedName(SERIALIZED_NAME_PARTICIPATE_REFUND_CLUE_CNT)
  private Long participateRefundClueCnt = null;

  public static final String SERIALIZED_NAME_PAY_REFUND_CLUE_CNT = "pay_refund_clue_cnt";
  @SerializedName(SERIALIZED_NAME_PAY_REFUND_CLUE_CNT)
  private Long payRefundClueCnt = null;

  public static final String SERIALIZED_NAME_REFUND_PAY_MONEY = "refund_pay_money";
  @SerializedName(SERIALIZED_NAME_REFUND_PAY_MONEY)
  private Double refundPayMoney = null;

  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner() {
  }

  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner adCreateClueDate(String adCreateClueDate) {
    
    this.adCreateClueDate = adCreateClueDate;
    return this;
  }

   /**
   * 广告计划产生线索的日期，格式yyyyMMdd
   * @return adCreateClueDate
  **/
  @javax.annotation.Nullable
  public String getAdCreateClueDate() {
    return adCreateClueDate;
  }


  public void setAdCreateClueDate(String adCreateClueDate) {
    this.adCreateClueDate = adCreateClueDate;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner adId(Long adId) {
    
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


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner advertiserName(String advertiserName) {
    
    this.advertiserName = advertiserName;
    return this;
  }

   /**
   * 广告主名称
   * @return advertiserName
  **/
  @javax.annotation.Nullable
  public String getAdvertiserName() {
    return advertiserName;
  }


  public void setAdvertiserName(String advertiserName) {
    this.advertiserName = advertiserName;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner month(String month) {
    
    this.month = month;
    return this;
  }

   /**
   * 查询账单月份，格式yyyyMM
   * @return month
  **/
  @javax.annotation.Nullable
  public String getMonth() {
    return month;
  }


  public void setMonth(String month) {
    this.month = month;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner participateRefundClueCnt(Long participateRefundClueCnt) {
    
    this.participateRefundClueCnt = participateRefundClueCnt;
    return this;
  }

   /**
   * 参与返款的线索数
   * @return participateRefundClueCnt
  **/
  @javax.annotation.Nullable
  public Long getParticipateRefundClueCnt() {
    return participateRefundClueCnt;
  }


  public void setParticipateRefundClueCnt(Long participateRefundClueCnt) {
    this.participateRefundClueCnt = participateRefundClueCnt;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner payRefundClueCnt(Long payRefundClueCnt) {
    
    this.payRefundClueCnt = payRefundClueCnt;
    return this;
  }

   /**
   * 支付赔付的线索数
   * @return payRefundClueCnt
  **/
  @javax.annotation.Nullable
  public Long getPayRefundClueCnt() {
    return payRefundClueCnt;
  }


  public void setPayRefundClueCnt(Long payRefundClueCnt) {
    this.payRefundClueCnt = payRefundClueCnt;
  }


  public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner refundPayMoney(Double refundPayMoney) {
    
    this.refundPayMoney = refundPayMoney;
    return this;
  }

   /**
   * 赔付金额
   * @return refundPayMoney
  **/
  @javax.annotation.Nullable
  public Double getRefundPayMoney() {
    return refundPayMoney;
  }


  public void setRefundPayMoney(Double refundPayMoney) {
    this.refundPayMoney = refundPayMoney;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner = (ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner) o;
    return Objects.equals(this.adCreateClueDate, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.adCreateClueDate) &&
        Objects.equals(this.adId, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.adId) &&
        Objects.equals(this.advertiserId, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.advertiserId) &&
        Objects.equals(this.advertiserName, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.advertiserName) &&
        Objects.equals(this.month, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.month) &&
        Objects.equals(this.participateRefundClueCnt, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.participateRefundClueCnt) &&
        Objects.equals(this.payRefundClueCnt, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.payRefundClueCnt) &&
        Objects.equals(this.refundPayMoney, toolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.refundPayMoney);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adCreateClueDate, adId, advertiserId, advertiserName, month, participateRefundClueCnt, payRefundClueCnt, refundPayMoney);
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
    sb.append("class ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner {\n");
    sb.append("    adCreateClueDate: ").append(toIndentedString(adCreateClueDate)).append("\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    advertiserName: ").append(toIndentedString(advertiserName)).append("\n");
    sb.append("    month: ").append(toIndentedString(month)).append("\n");
    sb.append("    participateRefundClueCnt: ").append(toIndentedString(participateRefundClueCnt)).append("\n");
    sb.append("    payRefundClueCnt: ").append(toIndentedString(payRefundClueCnt)).append("\n");
    sb.append("    refundPayMoney: ").append(toIndentedString(refundPayMoney)).append("\n");
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
    openapiFields.add("ad_create_clue_date");
    openapiFields.add("ad_id");
    openapiFields.add("advertiser_id");
    openapiFields.add("advertiser_name");
    openapiFields.add("month");
    openapiFields.add("participate_refund_clue_cnt");
    openapiFields.add("pay_refund_clue_cnt");
    openapiFields.add("refund_pay_money");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner>() {
           @Override
           public void write(JsonWriter out, ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner
  */
  public static ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner.class);
  }

 /**
  * Convert an instance of ToolsClueRefundDetailGetV2ResponseDataRefundDetailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
