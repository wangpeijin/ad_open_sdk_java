/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataMarketingGoal;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataOptStatus;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10DataStatus;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList;
import com.bytedance.ads.model.QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class QianchuanUniPromotionAdDetailV10ResponseData {
  public static final String SERIALIZED_NAME_AD_ID = "ad_id";
  @SerializedName(SERIALIZED_NAME_AD_ID)
  private Long adId = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private String createTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_SETTING = "creative_setting";
  @SerializedName(SERIALIZED_NAME_CREATIVE_SETTING)
  private QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting creativeSetting = null;

  public static final String SERIALIZED_NAME_DELIVERY_SETTING = "delivery_setting";
  @SerializedName(SERIALIZED_NAME_DELIVERY_SETTING)
  private QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting deliverySetting = null;

  public static final String SERIALIZED_NAME_MARKETING_GOAL = "marketing_goal";
  @SerializedName(SERIALIZED_NAME_MARKETING_GOAL)
  private QianchuanUniPromotionAdDetailV10DataMarketingGoal marketingGoal = null;

  public static final String SERIALIZED_NAME_MODIFY_TIME = "modify_time";
  @SerializedName(SERIALIZED_NAME_MODIFY_TIME)
  private String modifyTime = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_OPT_STATUS = "opt_status";
  @SerializedName(SERIALIZED_NAME_OPT_STATUS)
  private QianchuanUniPromotionAdDetailV10DataOptStatus optStatus = null;

  public static final String SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST = "programmatic_creative_media_list";
  @SerializedName(SERIALIZED_NAME_PROGRAMMATIC_CREATIVE_MEDIA_LIST)
  private QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList programmaticCreativeMediaList = null;

  public static final String SERIALIZED_NAME_ROOM_INFO = "room_info";
  @SerializedName(SERIALIZED_NAME_ROOM_INFO)
  private List<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner> roomInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private QianchuanUniPromotionAdDetailV10DataStatus status = null;

  public QianchuanUniPromotionAdDetailV10ResponseData() {
  }

  public QianchuanUniPromotionAdDetailV10ResponseData adId(Long adId) {
    
    this.adId = adId;
    return this;
  }

   /**
   * 
   * @return adId
  **/
  @javax.annotation.Nullable
  public Long getAdId() {
    return adId;
  }


  public void setAdId(Long adId) {
    this.adId = adId;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData createTime(String createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 
   * @return createTime
  **/
  @javax.annotation.Nullable
  public String getCreateTime() {
    return createTime;
  }


  public void setCreateTime(String createTime) {
    this.createTime = createTime;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData creativeSetting(QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting creativeSetting) {
    
    this.creativeSetting = creativeSetting;
    return this;
  }

   /**
   * Get creativeSetting
   * @return creativeSetting
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting getCreativeSetting() {
    return creativeSetting;
  }


  public void setCreativeSetting(QianchuanUniPromotionAdDetailV10ResponseDataCreativeSetting creativeSetting) {
    this.creativeSetting = creativeSetting;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData deliverySetting(QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting deliverySetting) {
    
    this.deliverySetting = deliverySetting;
    return this;
  }

   /**
   * Get deliverySetting
   * @return deliverySetting
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting getDeliverySetting() {
    return deliverySetting;
  }


  public void setDeliverySetting(QianchuanUniPromotionAdDetailV10ResponseDataDeliverySetting deliverySetting) {
    this.deliverySetting = deliverySetting;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData marketingGoal(QianchuanUniPromotionAdDetailV10DataMarketingGoal marketingGoal) {
    
    this.marketingGoal = marketingGoal;
    return this;
  }

   /**
   * Get marketingGoal
   * @return marketingGoal
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataMarketingGoal getMarketingGoal() {
    return marketingGoal;
  }


  public void setMarketingGoal(QianchuanUniPromotionAdDetailV10DataMarketingGoal marketingGoal) {
    this.marketingGoal = marketingGoal;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData modifyTime(String modifyTime) {
    
    this.modifyTime = modifyTime;
    return this;
  }

   /**
   * 
   * @return modifyTime
  **/
  @javax.annotation.Nullable
  public String getModifyTime() {
    return modifyTime;
  }


  public void setModifyTime(String modifyTime) {
    this.modifyTime = modifyTime;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData optStatus(QianchuanUniPromotionAdDetailV10DataOptStatus optStatus) {
    
    this.optStatus = optStatus;
    return this;
  }

   /**
   * Get optStatus
   * @return optStatus
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataOptStatus getOptStatus() {
    return optStatus;
  }


  public void setOptStatus(QianchuanUniPromotionAdDetailV10DataOptStatus optStatus) {
    this.optStatus = optStatus;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData programmaticCreativeMediaList(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
    return this;
  }

   /**
   * Get programmaticCreativeMediaList
   * @return programmaticCreativeMediaList
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList getProgrammaticCreativeMediaList() {
    return programmaticCreativeMediaList;
  }


  public void setProgrammaticCreativeMediaList(QianchuanUniPromotionAdDetailV10ResponseDataProgrammaticCreativeMediaList programmaticCreativeMediaList) {
    this.programmaticCreativeMediaList = programmaticCreativeMediaList;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData roomInfo(List<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner> roomInfo) {
    
    this.roomInfo = roomInfo;
    return this;
  }

  public QianchuanUniPromotionAdDetailV10ResponseData addRoomInfoItem(QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner roomInfoItem) {
    if (this.roomInfo == null) {
      this.roomInfo = new ArrayList<>();
    }
    this.roomInfo.add(roomInfoItem);
    return this;
  }

   /**
   * 
   * @return roomInfo
  **/
  @javax.annotation.Nullable
  public List<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner> getRoomInfo() {
    return roomInfo;
  }


  public void setRoomInfo(List<QianchuanUniPromotionAdDetailV10ResponseDataRoomInfoInner> roomInfo) {
    this.roomInfo = roomInfo;
  }


  public QianchuanUniPromotionAdDetailV10ResponseData status(QianchuanUniPromotionAdDetailV10DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdDetailV10DataStatus getStatus() {
    return status;
  }


  public void setStatus(QianchuanUniPromotionAdDetailV10DataStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdDetailV10ResponseData qianchuanUniPromotionAdDetailV10ResponseData = (QianchuanUniPromotionAdDetailV10ResponseData) o;
    return Objects.equals(this.adId, qianchuanUniPromotionAdDetailV10ResponseData.adId) &&
        Objects.equals(this.createTime, qianchuanUniPromotionAdDetailV10ResponseData.createTime) &&
        Objects.equals(this.creativeSetting, qianchuanUniPromotionAdDetailV10ResponseData.creativeSetting) &&
        Objects.equals(this.deliverySetting, qianchuanUniPromotionAdDetailV10ResponseData.deliverySetting) &&
        Objects.equals(this.marketingGoal, qianchuanUniPromotionAdDetailV10ResponseData.marketingGoal) &&
        Objects.equals(this.modifyTime, qianchuanUniPromotionAdDetailV10ResponseData.modifyTime) &&
        Objects.equals(this.name, qianchuanUniPromotionAdDetailV10ResponseData.name) &&
        Objects.equals(this.optStatus, qianchuanUniPromotionAdDetailV10ResponseData.optStatus) &&
        Objects.equals(this.programmaticCreativeMediaList, qianchuanUniPromotionAdDetailV10ResponseData.programmaticCreativeMediaList) &&
        Objects.equals(this.roomInfo, qianchuanUniPromotionAdDetailV10ResponseData.roomInfo) &&
        Objects.equals(this.status, qianchuanUniPromotionAdDetailV10ResponseData.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adId, createTime, creativeSetting, deliverySetting, marketingGoal, modifyTime, name, optStatus, programmaticCreativeMediaList, roomInfo, status);
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
    sb.append("class QianchuanUniPromotionAdDetailV10ResponseData {\n");
    sb.append("    adId: ").append(toIndentedString(adId)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    creativeSetting: ").append(toIndentedString(creativeSetting)).append("\n");
    sb.append("    deliverySetting: ").append(toIndentedString(deliverySetting)).append("\n");
    sb.append("    marketingGoal: ").append(toIndentedString(marketingGoal)).append("\n");
    sb.append("    modifyTime: ").append(toIndentedString(modifyTime)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optStatus: ").append(toIndentedString(optStatus)).append("\n");
    sb.append("    programmaticCreativeMediaList: ").append(toIndentedString(programmaticCreativeMediaList)).append("\n");
    sb.append("    roomInfo: ").append(toIndentedString(roomInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("create_time");
    openapiFields.add("creative_setting");
    openapiFields.add("delivery_setting");
    openapiFields.add("marketing_goal");
    openapiFields.add("modify_time");
    openapiFields.add("name");
    openapiFields.add("opt_status");
    openapiFields.add("programmatic_creative_media_list");
    openapiFields.add("room_info");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniPromotionAdDetailV10ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdDetailV10ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdDetailV10ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdDetailV10ResponseData>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdDetailV10ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdDetailV10ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdDetailV10ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdDetailV10ResponseData
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdDetailV10ResponseData
  */
  public static QianchuanUniPromotionAdDetailV10ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdDetailV10ResponseData.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdDetailV10ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

