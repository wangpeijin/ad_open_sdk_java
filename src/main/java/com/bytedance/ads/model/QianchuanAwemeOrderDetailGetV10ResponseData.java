/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataMarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10DataStatus;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataAudience;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataAwemeInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class QianchuanAwemeOrderDetailGetV10ResponseData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_ADD_AMOUNT_INFO = "add_amount_info";
  @SerializedName(SERIALIZED_NAME_ADD_AMOUNT_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addAmountInfo = null;

  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private QianchuanAwemeOrderDetailGetV10ResponseDataAudience audience = null;

  public static final String SERIALIZED_NAME_AUDIT_RECORD = "audit_record";
  @SerializedName(SERIALIZED_NAME_AUDIT_RECORD)
  private QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord auditRecord = null;

  public static final String SERIALIZED_NAME_AWEME_INFO = "aweme_info";
  @SerializedName(SERIALIZED_NAME_AWEME_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataAwemeInfo awemeInfo = null;

  public static final String SERIALIZED_NAME_COUPON_INFO = "coupon_info";
  @SerializedName(SERIALIZED_NAME_COUPON_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfo couponInfo = null;

  public static final String SERIALIZED_NAME_COUPON_INFOS = "coupon_infos";
  @SerializedName(SERIALIZED_NAME_COUPON_INFOS)
  private List<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner> couponInfos = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeOrderDetailGetV10DataMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_ORDER_CREATE_TIME = "order_create_time";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_TIME)
  private String orderCreateTime = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFO = "product_info";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo productInfo = null;

  public static final String SERIALIZED_NAME_ROOM_INFO = "room_info";
  @SerializedName(SERIALIZED_NAME_ROOM_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAwemeOrderDetailGetV10DataStatus status = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo videoInfo = null;

  public QianchuanAwemeOrderDetailGetV10ResponseData() {
  }

  public QianchuanAwemeOrderDetailGetV10ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 计划id，未支付的订单无计划id
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData addAmountInfo(QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addAmountInfo) {
    
    this.addAmountInfo = addAmountInfo;
    return this;
  }

   /**
   * Get addAmountInfo
   * @return addAmountInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo getAddAmountInfo() {
    return addAmountInfo;
  }


  public void setAddAmountInfo(QianchuanAwemeOrderDetailGetV10ResponseDataAddAmountInfo addAmountInfo) {
    this.addAmountInfo = addAmountInfo;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData audience(QianchuanAwemeOrderDetailGetV10ResponseDataAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataAudience getAudience() {
    return audience;
  }


  public void setAudience(QianchuanAwemeOrderDetailGetV10ResponseDataAudience audience) {
    this.audience = audience;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData auditRecord(QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord auditRecord) {
    
    this.auditRecord = auditRecord;
    return this;
  }

   /**
   * Get auditRecord
   * @return auditRecord
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord getAuditRecord() {
    return auditRecord;
  }


  public void setAuditRecord(QianchuanAwemeOrderDetailGetV10ResponseDataAuditRecord auditRecord) {
    this.auditRecord = auditRecord;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData awemeInfo(QianchuanAwemeOrderDetailGetV10ResponseDataAwemeInfo awemeInfo) {
    
    this.awemeInfo = awemeInfo;
    return this;
  }

   /**
   * Get awemeInfo
   * @return awemeInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataAwemeInfo getAwemeInfo() {
    return awemeInfo;
  }


  public void setAwemeInfo(QianchuanAwemeOrderDetailGetV10ResponseDataAwemeInfo awemeInfo) {
    this.awemeInfo = awemeInfo;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData couponInfo(QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfo couponInfo) {
    
    this.couponInfo = couponInfo;
    return this;
  }

   /**
   * Get couponInfo
   * @return couponInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfo getCouponInfo() {
    return couponInfo;
  }


  public void setCouponInfo(QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfo couponInfo) {
    this.couponInfo = couponInfo;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData couponInfos(List<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner> couponInfos) {
    
    this.couponInfos = couponInfos;
    return this;
  }

  public QianchuanAwemeOrderDetailGetV10ResponseData addCouponInfosItem(QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner couponInfosItem) {
    if (this.couponInfos == null) {
      this.couponInfos = new ArrayList<>();
    }
    this.couponInfos.add(couponInfosItem);
    return this;
  }

   /**
   * 批量优惠券信息
   * @return couponInfos
  **/
  @javax.annotation.Nullable
  public List<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner> getCouponInfos() {
    return couponInfos;
  }


  public void setCouponInfos(List<QianchuanAwemeOrderDetailGetV10ResponseDataCouponInfosInner> couponInfos) {
    this.couponInfos = couponInfos;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData deliverySetting(QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAwemeOrderDetailGetV10ResponseDataDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData marketingGoal(QianchuanAwemeOrderDetailGetV10DataMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeOrderDetailGetV10DataMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData orderCreateTime(String orderCreateTime) {
    
    this.orderCreateTime = orderCreateTime;
    return this;
  }

   /**
   * 订单创建时间
   * @return orderCreateTime
  **/
  @javax.annotation.Nullable
  public String getOrderCreateTime() {
    return orderCreateTime;
  }


  public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单ID
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData productInfo(QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo productInfo) {
    
    this.productInfo = productInfo;
    return this;
  }

   /**
   * Get productInfo
   * @return productInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo getProductInfo() {
    return productInfo;
  }


  public void setProductInfo(QianchuanAwemeOrderDetailGetV10ResponseDataProductInfo productInfo) {
    this.productInfo = productInfo;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData roomInfo(QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomInfo) {
    
    this.roomInfo = roomInfo;
    return this;
  }

   /**
   * Get roomInfo
   * @return roomInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo getRoomInfo() {
    return roomInfo;
  }


  public void setRoomInfo(QianchuanAwemeOrderDetailGetV10ResponseDataRoomInfo roomInfo) {
    this.roomInfo = roomInfo;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData status(QianchuanAwemeOrderDetailGetV10DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10DataStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAwemeOrderDetailGetV10DataStatus status) {
    this.status = status;
  }


  public QianchuanAwemeOrderDetailGetV10ResponseData videoInfo(QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(QianchuanAwemeOrderDetailGetV10ResponseDataVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAwemeOrderDetailGetV10ResponseData qianchuanAwemeOrderDetailGetV10ResponseData = (QianchuanAwemeOrderDetailGetV10ResponseData) o;
    return Objects.equals(this.adId, qianchuanAwemeOrderDetailGetV10ResponseData.adId) &&
        Objects.equals(this.addAmountInfo, qianchuanAwemeOrderDetailGetV10ResponseData.addAmountInfo) &&
        Objects.equals(this.audience, qianchuanAwemeOrderDetailGetV10ResponseData.audience) &&
        Objects.equals(this.auditRecord, qianchuanAwemeOrderDetailGetV10ResponseData.auditRecord) &&
        Objects.equals(this.awemeInfo, qianchuanAwemeOrderDetailGetV10ResponseData.awemeInfo) &&
        Objects.equals(this.couponInfo, qianchuanAwemeOrderDetailGetV10ResponseData.couponInfo) &&
        Objects.equals(this.couponInfos, qianchuanAwemeOrderDetailGetV10ResponseData.couponInfos) &&
        Objects.equals(this.deliverySetting, qianchuanAwemeOrderDetailGetV10ResponseData.deliverySetting) &&
        Objects.equals(this.marketingGoal, qianchuanAwemeOrderDetailGetV10ResponseData.marketingGoal) &&
        Objects.equals(this.orderCreateTime, qianchuanAwemeOrderDetailGetV10ResponseData.orderCreateTime) &&
        Objects.equals(this.orderId, qianchuanAwemeOrderDetailGetV10ResponseData.orderId) &&
        Objects.equals(this.productInfo, qianchuanAwemeOrderDetailGetV10ResponseData.productInfo) &&
        Objects.equals(this.roomInfo, qianchuanAwemeOrderDetailGetV10ResponseData.roomInfo) &&
        Objects.equals(this.status, qianchuanAwemeOrderDetailGetV10ResponseData.status) &&
        Objects.equals(this.videoInfo, qianchuanAwemeOrderDetailGetV10ResponseData.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, addAmountInfo, audience, auditRecord, awemeInfo, couponInfo, couponInfos, deliverySetting, marketingGoal, orderCreateTime, orderId, productInfo, roomInfo, status, videoInfo);
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
    sb.append("class QianchuanAwemeOrderDetailGetV10ResponseData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    addAmountInfo: ").append(toIndentedString(addAmountInfo)).append("\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    auditRecord: ").append(toIndentedString(auditRecord)).append("\n");
    sb.append("    awemeInfo: ").append(toIndentedString(awemeInfo)).append("\n");
    sb.append("    couponInfo: ").append(toIndentedString(couponInfo)).append("\n");
    sb.append("    couponInfos: ").append(toIndentedString(couponInfos)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    orderCreateTime: ").append(toIndentedString(orderCreateTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    productInfo: ").append(toIndentedString(productInfo)).append("\n");
    sb.append("    roomInfo: ").append(toIndentedString(roomInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("add_amount_info");
    openapiFields.add("audience");
    openapiFields.add("audit_record");
    openapiFields.add("aweme_info");
    openapiFields.add("coupon_info");
    openapiFields.add("coupon_infos");
    openapiFields.add("delivery_setting");
    openapiFields.add("marketing_goal");
    openapiFields.add("order_create_time");
    openapiFields.add("order_id");
    openapiFields.add("product_info");
    openapiFields.add("room_info");
    openapiFields.add("status");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAwemeOrderDetailGetV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderDetailGetV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderDetailGetV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderDetailGetV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderDetailGetV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderDetailGetV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderDetailGetV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderDetailGetV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderDetailGetV10ResponseData
  */
  public static QianchuanAwemeOrderDetailGetV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderDetailGetV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderDetailGetV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

