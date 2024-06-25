/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderCreateV30BidType;
import com.bytedance.ads.model.DouplusOrderCreateV30ExternalAction;
import com.bytedance.ads.model.DouplusOrderCreateV30LiveroomHeatMode;
import com.bytedance.ads.model.DouplusOrderCreateV30RequestObjectInfosInner;
import com.bytedance.ads.model.DouplusOrderCreateV30RequestTargeting;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * DouplusOrderCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class DouplusOrderCreateV30Request {
  public static final String SERIALIZED_NAME_AWEME_SEC_UID = "aweme_sec_uid";
  @SerializedName(SERIALIZED_NAME_AWEME_SEC_UID)
  private String awemeSecUid = null;

  public static final String SERIALIZED_NAME_BID_PRICE = "bid_price";
  @SerializedName(SERIALIZED_NAME_BID_PRICE)
  private Long bidPrice = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private DouplusOrderCreateV30BidType bidType = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_DELIVERY_TIME = "delivery_time";
  @SerializedName(SERIALIZED_NAME_DELIVERY_TIME)
  private Double deliveryTime = null;

  public static final String SERIALIZED_NAME_EXTERNAL_ACTION = "external_action";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_ACTION)
  private DouplusOrderCreateV30ExternalAction externalAction = null;

  public static final String SERIALIZED_NAME_LIVEROOM_HEAT_MODE = "liveroom_heat_mode";
  @SerializedName(SERIALIZED_NAME_LIVEROOM_HEAT_MODE)
  private List<DouplusOrderCreateV30LiveroomHeatMode> liveroomHeatMode = null;

  public static final String SERIALIZED_NAME_OBJECT_INFOS = "object_infos";
  @SerializedName(SERIALIZED_NAME_OBJECT_INFOS)
  private List<DouplusOrderCreateV30RequestObjectInfosInner> objectInfos = null;

  public static final String SERIALIZED_NAME_TARGETING = "targeting";
  @SerializedName(SERIALIZED_NAME_TARGETING)
  private DouplusOrderCreateV30RequestTargeting targeting = null;

  public DouplusOrderCreateV30Request() {
  }

  public DouplusOrderCreateV30Request awemeSecUid(String awemeSecUid) {
    
    this.awemeSecUid = awemeSecUid;
    return this;
  }

   /**
   * 
   * @return awemeSecUid
  **/
  @javax.annotation.Nonnull
  public String getAwemeSecUid() {
    return awemeSecUid;
  }


  public void setAwemeSecUid(String awemeSecUid) {
    this.awemeSecUid = awemeSecUid;
  }


  public DouplusOrderCreateV30Request bidPrice(Long bidPrice) {
    
    this.bidPrice = bidPrice;
    return this;
  }

   /**
   * 手动出价金额，10～1,000,000之间的10的倍数，不高于投放金额，单位：人民币（分） 注意：仅出价方式为“手动出价”时，必填
   * @return bidPrice
  **/
  @javax.annotation.Nullable
  public Long getBidPrice() {
    return bidPrice;
  }


  public void setBidPrice(Long bidPrice) {
    this.bidPrice = bidPrice;
  }


  public DouplusOrderCreateV30Request bidType(DouplusOrderCreateV30BidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public DouplusOrderCreateV30BidType getBidType() {
    return bidType;
  }


  public void setBidType(DouplusOrderCreateV30BidType bidType) {
    this.bidType = bidType;
  }


  public DouplusOrderCreateV30Request budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 投放预算 注意：数值需为10,000-500,000,000之间的10的倍数， 单位：人民币（分）
   * minimum: 10000
   * maximum: 500000000
   * @return budget
  **/
  @javax.annotation.Nonnull
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public DouplusOrderCreateV30Request deliveryTime(Double deliveryTime) {
    
    this.deliveryTime = deliveryTime;
    return this;
  }

   /**
   * 投放时长： 当marketing_goal&#x3D; VIDEO_PROM_GOODS时，支持2、6、12、24或12的倍数，最大720小时 当marketing_goal&#x3D; LIVE_PROM_GOODS &amp;liveroom_heat_mode&#x3D; BY_VIDEO 时，支持0.5、1、1.5、2、2.5、3、3.5、4、4.5、5、5.5、6、12、24 注：视频投放最短2小时
   * @return deliveryTime
  **/
  @javax.annotation.Nonnull
  public Double getDeliveryTime() {
    return deliveryTime;
  }


  public void setDeliveryTime(Double deliveryTime) {
    this.deliveryTime = deliveryTime;
  }


  public DouplusOrderCreateV30Request externalAction(DouplusOrderCreateV30ExternalAction externalAction) {
    
    this.externalAction = externalAction;
    return this;
  }

   /**
   * Get externalAction
   * @return externalAction
  **/
  @javax.annotation.Nonnull
  public DouplusOrderCreateV30ExternalAction getExternalAction() {
    return externalAction;
  }


  public void setExternalAction(DouplusOrderCreateV30ExternalAction externalAction) {
    this.externalAction = externalAction;
  }


  public DouplusOrderCreateV30Request liveroomHeatMode(List<DouplusOrderCreateV30LiveroomHeatMode> liveroomHeatMode) {
    
    this.liveroomHeatMode = liveroomHeatMode;
    return this;
  }

  public DouplusOrderCreateV30Request addLiveroomHeatModeItem(DouplusOrderCreateV30LiveroomHeatMode liveroomHeatModeItem) {
    if (this.liveroomHeatMode == null) {
      this.liveroomHeatMode = new ArrayList<>();
    }
    this.liveroomHeatMode.add(liveroomHeatModeItem);
    return this;
  }

   /**
   * 直播间加热方式，可选值: BY_ROOM: 直接加热直播间 BY_VIDEO: 选择视频加热直播间 注意：素材类型为LIVE_PROM_GOODS时，必填。可传多值。若传了BY_VIDEO，则必须有素材类型为VIDEO_PROM_GOODS 的object，同理，若传了BY_ROOM，则必须有素材类型为LIVE_PROM_GOODS 的object
   * @return liveroomHeatMode
  **/
  @javax.annotation.Nullable
  public List<DouplusOrderCreateV30LiveroomHeatMode> getLiveroomHeatMode() {
    return liveroomHeatMode;
  }


  public void setLiveroomHeatMode(List<DouplusOrderCreateV30LiveroomHeatMode> liveroomHeatMode) {
    this.liveroomHeatMode = liveroomHeatMode;
  }


  public DouplusOrderCreateV30Request objectInfos(List<DouplusOrderCreateV30RequestObjectInfosInner> objectInfos) {
    
    this.objectInfos = objectInfos;
    return this;
  }

  public DouplusOrderCreateV30Request addObjectInfosItem(DouplusOrderCreateV30RequestObjectInfosInner objectInfosItem) {
    if (this.objectInfos == null) {
      this.objectInfos = new ArrayList<>();
    }
    this.objectInfos.add(objectInfosItem);
    return this;
  }

   /**
   * 
   * @return objectInfos
  **/
  @javax.annotation.Nonnull
  public List<DouplusOrderCreateV30RequestObjectInfosInner> getObjectInfos() {
    return objectInfos;
  }


  public void setObjectInfos(List<DouplusOrderCreateV30RequestObjectInfosInner> objectInfos) {
    this.objectInfos = objectInfos;
  }


  public DouplusOrderCreateV30Request targeting(DouplusOrderCreateV30RequestTargeting targeting) {
    
    this.targeting = targeting;
    return this;
  }

   /**
   * Get targeting
   * @return targeting
  **/
  @javax.annotation.Nullable
  public DouplusOrderCreateV30RequestTargeting getTargeting() {
    return targeting;
  }


  public void setTargeting(DouplusOrderCreateV30RequestTargeting targeting) {
    this.targeting = targeting;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderCreateV30Request douplusOrderCreateV30Request = (DouplusOrderCreateV30Request) o;
    return Objects.equals(this.awemeSecUid, douplusOrderCreateV30Request.awemeSecUid) &&
        Objects.equals(this.bidPrice, douplusOrderCreateV30Request.bidPrice) &&
        Objects.equals(this.bidType, douplusOrderCreateV30Request.bidType) &&
        Objects.equals(this.budget, douplusOrderCreateV30Request.budget) &&
        Objects.equals(this.deliveryTime, douplusOrderCreateV30Request.deliveryTime) &&
        Objects.equals(this.externalAction, douplusOrderCreateV30Request.externalAction) &&
        Objects.equals(this.liveroomHeatMode, douplusOrderCreateV30Request.liveroomHeatMode) &&
        Objects.equals(this.objectInfos, douplusOrderCreateV30Request.objectInfos) &&
        Objects.equals(this.targeting, douplusOrderCreateV30Request.targeting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeSecUid, bidPrice, bidType, budget, deliveryTime, externalAction, liveroomHeatMode, objectInfos, targeting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderCreateV30Request {\n");
    sb.append("    awemeSecUid: ").append(toIndentedString(awemeSecUid)).append("\n");
    sb.append("    bidPrice: ").append(toIndentedString(bidPrice)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    deliveryTime: ").append(toIndentedString(deliveryTime)).append("\n");
    sb.append("    externalAction: ").append(toIndentedString(externalAction)).append("\n");
    sb.append("    liveroomHeatMode: ").append(toIndentedString(liveroomHeatMode)).append("\n");
    sb.append("    objectInfos: ").append(toIndentedString(objectInfos)).append("\n");
    sb.append("    targeting: ").append(toIndentedString(targeting)).append("\n");
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
    openapiFields.add("aweme_sec_uid");
    openapiFields.add("bid_price");
    openapiFields.add("bid_type");
    openapiFields.add("budget");
    openapiFields.add("delivery_time");
    openapiFields.add("external_action");
    openapiFields.add("liveroom_heat_mode");
    openapiFields.add("object_infos");
    openapiFields.add("targeting");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("aweme_sec_uid");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("delivery_time");
    openapiRequiredFields.add("external_action");
    openapiRequiredFields.add("object_infos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderCreateV30Request>() {
           @Override
           public void write(JsonWriter out, DouplusOrderCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderCreateV30Request
  */
  public static DouplusOrderCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderCreateV30Request.class);
  }

 /**
  * Convert an instance of DouplusOrderCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

