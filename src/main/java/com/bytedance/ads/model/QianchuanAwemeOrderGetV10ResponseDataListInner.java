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
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10DataListMarketingGoal;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10DataListStatus;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataListInnerAwemeInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataListInnerRoomInfo;
import com.bytedance.ads.model.QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo;
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
 * QianchuanAwemeOrderGetV10ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanAwemeOrderGetV10ResponseDataListInner {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_AWEME_INFO = "aweme_info";
  @SerializedName(SERIALIZED_NAME_AWEME_INFO)
  private QianchuanAwemeOrderGetV10ResponseDataListInnerAwemeInfo awemeInfo = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanAwemeOrderGetV10DataListMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_ORDER_CREATE_TIME = "order_create_time";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_TIME)
  private String orderCreateTime = null;

  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private Long orderId = null;

  public static final String SERIALIZED_NAME_ROOM_INFO = "room_info";
  @SerializedName(SERIALIZED_NAME_ROOM_INFO)
  private QianchuanAwemeOrderGetV10ResponseDataListInnerRoomInfo roomInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanAwemeOrderGetV10DataListStatus status = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo videoInfo = null;

  public QianchuanAwemeOrderGetV10ResponseDataListInner() {
  }

  public QianchuanAwemeOrderGetV10ResponseDataListInner adId(Long adId) {
    
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


  public QianchuanAwemeOrderGetV10ResponseDataListInner awemeInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerAwemeInfo awemeInfo) {
    
    this.awemeInfo = awemeInfo;
    return this;
  }

   /**
   * Get awemeInfo
   * @return awemeInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10ResponseDataListInnerAwemeInfo getAwemeInfo() {
    return awemeInfo;
  }


  public void setAwemeInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerAwemeInfo awemeInfo) {
    this.awemeInfo = awemeInfo;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner deliverySetting(QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanAwemeOrderGetV10ResponseDataListInnerDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner marketingGoal(QianchuanAwemeOrderGetV10DataListMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10DataListMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanAwemeOrderGetV10DataListMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner orderCreateTime(String orderCreateTime) {
    
    this.orderCreateTime = orderCreateTime;
    return this;
  }

   /**
   * 订单创建时间（下单时间）
   * @return orderCreateTime
  **/
  @javax.annotation.Nullable
  public String getOrderCreateTime() {
    return orderCreateTime;
  }


  public void setOrderCreateTime(String orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner orderId(Long orderId) {
    
    this.orderId = orderId;
    return this;
  }

   /**
   * 订单id
   * @return orderId
  **/
  @javax.annotation.Nullable
  public Long getOrderId() {
    return orderId;
  }


  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner roomInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerRoomInfo roomInfo) {
    
    this.roomInfo = roomInfo;
    return this;
  }

   /**
   * Get roomInfo
   * @return roomInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10ResponseDataListInnerRoomInfo getRoomInfo() {
    return roomInfo;
  }


  public void setRoomInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerRoomInfo roomInfo) {
    this.roomInfo = roomInfo;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner status(QianchuanAwemeOrderGetV10DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10DataListStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanAwemeOrderGetV10DataListStatus status) {
    this.status = status;
  }


  public QianchuanAwemeOrderGetV10ResponseDataListInner videoInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(QianchuanAwemeOrderGetV10ResponseDataListInnerVideoInfo videoInfo) {
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
    QianchuanAwemeOrderGetV10ResponseDataListInner qianchuanAwemeOrderGetV10ResponseDataListInner = (QianchuanAwemeOrderGetV10ResponseDataListInner) o;
    return Objects.equals(this.adId, qianchuanAwemeOrderGetV10ResponseDataListInner.adId) &&
        Objects.equals(this.awemeInfo, qianchuanAwemeOrderGetV10ResponseDataListInner.awemeInfo) &&
        Objects.equals(this.deliverySetting, qianchuanAwemeOrderGetV10ResponseDataListInner.deliverySetting) &&
        Objects.equals(this.marketingGoal, qianchuanAwemeOrderGetV10ResponseDataListInner.marketingGoal) &&
        Objects.equals(this.orderCreateTime, qianchuanAwemeOrderGetV10ResponseDataListInner.orderCreateTime) &&
        Objects.equals(this.orderId, qianchuanAwemeOrderGetV10ResponseDataListInner.orderId) &&
        Objects.equals(this.roomInfo, qianchuanAwemeOrderGetV10ResponseDataListInner.roomInfo) &&
        Objects.equals(this.status, qianchuanAwemeOrderGetV10ResponseDataListInner.status) &&
        Objects.equals(this.videoInfo, qianchuanAwemeOrderGetV10ResponseDataListInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, awemeInfo, deliverySetting, marketingGoal, orderCreateTime, orderId, roomInfo, status, videoInfo);
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
    sb.append("class QianchuanAwemeOrderGetV10ResponseDataListInner {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    awemeInfo: ").append(toIndentedString(awemeInfo)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    orderCreateTime: ").append(toIndentedString(orderCreateTime)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
    openapiFields.add("aweme_info");
    openapiFields.add("delivery_setting");
    openapiFields.add("marketing_goal");
    openapiFields.add("order_create_time");
    openapiFields.add("order_id");
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
       if (!QianchuanAwemeOrderGetV10ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAwemeOrderGetV10ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAwemeOrderGetV10ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAwemeOrderGetV10ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAwemeOrderGetV10ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAwemeOrderGetV10ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAwemeOrderGetV10ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAwemeOrderGetV10ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAwemeOrderGetV10ResponseDataListInner
  */
  public static QianchuanAwemeOrderGetV10ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAwemeOrderGetV10ResponseDataListInner.class);
  }

 /**
  * Convert an instance of QianchuanAwemeOrderGetV10ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

