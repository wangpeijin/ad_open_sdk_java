/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsClueExtInfoCallbackV2ClueEvent;
import com.bytedance.ads.model.ToolsClueExtInfoCallbackV2ExtKey;
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
 * ToolsClueExtInfoCallbackV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsClueExtInfoCallbackV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CALLBACK_TIME = "callback_time";
  @SerializedName(SERIALIZED_NAME_CALLBACK_TIME)
  private Long callbackTime = null;

  public static final String SERIALIZED_NAME_CLUE_EVENT = "clue_event";
  @SerializedName(SERIALIZED_NAME_CLUE_EVENT)
  private ToolsClueExtInfoCallbackV2ClueEvent clueEvent = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public static final String SERIALIZED_NAME_EXT_KEY = "ext_key";
  @SerializedName(SERIALIZED_NAME_EXT_KEY)
  private ToolsClueExtInfoCallbackV2ExtKey extKey = null;

  public static final String SERIALIZED_NAME_EXT_VALUE = "ext_value";
  @SerializedName(SERIALIZED_NAME_EXT_VALUE)
  private String extValue = null;

  public static final String SERIALIZED_NAME_EXT_VALUE_DETAIL = "ext_value_detail";
  @SerializedName(SERIALIZED_NAME_EXT_VALUE_DETAIL)
  private List<String> extValueDetail = null;

  public ToolsClueExtInfoCallbackV2Request() {
  }

  public ToolsClueExtInfoCallbackV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主id
   * minimum: 1
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsClueExtInfoCallbackV2Request callbackTime(Long callbackTime) {
    
    this.callbackTime = callbackTime;
    return this;
  }

   /**
   * 回传时间，秒级时间戳
   * minimum: 1
   * @return callbackTime
  **/
  @javax.annotation.Nonnull
  public Long getCallbackTime() {
    return callbackTime;
  }


  public void setCallbackTime(Long callbackTime) {
    this.callbackTime = callbackTime;
  }


  public ToolsClueExtInfoCallbackV2Request clueEvent(ToolsClueExtInfoCallbackV2ClueEvent clueEvent) {
    
    this.clueEvent = clueEvent;
    return this;
  }

   /**
   * Get clueEvent
   * @return clueEvent
  **/
  @javax.annotation.Nullable
  public ToolsClueExtInfoCallbackV2ClueEvent getClueEvent() {
    return clueEvent;
  }


  public void setClueEvent(ToolsClueExtInfoCallbackV2ClueEvent clueEvent) {
    this.clueEvent = clueEvent;
  }


  public ToolsClueExtInfoCallbackV2Request clueId(Long clueId) {
    
    this.clueId = clueId;
    return this;
  }

   /**
   * 线索id
   * minimum: 1
   * @return clueId
  **/
  @javax.annotation.Nonnull
  public Long getClueId() {
    return clueId;
  }


  public void setClueId(Long clueId) {
    this.clueId = clueId;
  }


  public ToolsClueExtInfoCallbackV2Request extKey(ToolsClueExtInfoCallbackV2ExtKey extKey) {
    
    this.extKey = extKey;
    return this;
  }

   /**
   * Get extKey
   * @return extKey
  **/
  @javax.annotation.Nonnull
  public ToolsClueExtInfoCallbackV2ExtKey getExtKey() {
    return extKey;
  }


  public void setExtKey(ToolsClueExtInfoCallbackV2ExtKey extKey) {
    this.extKey = extKey;
  }


  public ToolsClueExtInfoCallbackV2Request extValue(String extValue) {
    
    this.extValue = extValue;
    return this;
  }

   /**
   * 扩展信息value
   * @return extValue
  **/
  @javax.annotation.Nonnull
  public String getExtValue() {
    return extValue;
  }


  public void setExtValue(String extValue) {
    this.extValue = extValue;
  }


  public ToolsClueExtInfoCallbackV2Request extValueDetail(List<String> extValueDetail) {
    
    this.extValueDetail = extValueDetail;
    return this;
  }

  public ToolsClueExtInfoCallbackV2Request addExtValueDetailItem(String extValueDetailItem) {
    if (this.extValueDetail == null) {
      this.extValueDetail = new ArrayList<>();
    }
    this.extValueDetail.add(extValueDetailItem);
    return this;
  }

   /**
   * 完整阶段描述（严格有序）&lt;br&gt;当扩展信息中传【客户阶段】或【订单状态】时，将完整的客户阶段和订单状态传入该字段&lt;br&gt;例：客户完整阶段【未联系-产生意向-可跟进客户-邀约上门-成交】
   * @return extValueDetail
  **/
  @javax.annotation.Nullable
  public List<String> getExtValueDetail() {
    return extValueDetail;
  }


  public void setExtValueDetail(List<String> extValueDetail) {
    this.extValueDetail = extValueDetail;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueExtInfoCallbackV2Request toolsClueExtInfoCallbackV2Request = (ToolsClueExtInfoCallbackV2Request) o;
    return Objects.equals(this.advertiserId, toolsClueExtInfoCallbackV2Request.advertiserId) &&
        Objects.equals(this.callbackTime, toolsClueExtInfoCallbackV2Request.callbackTime) &&
        Objects.equals(this.clueEvent, toolsClueExtInfoCallbackV2Request.clueEvent) &&
        Objects.equals(this.clueId, toolsClueExtInfoCallbackV2Request.clueId) &&
        Objects.equals(this.extKey, toolsClueExtInfoCallbackV2Request.extKey) &&
        Objects.equals(this.extValue, toolsClueExtInfoCallbackV2Request.extValue) &&
        Objects.equals(this.extValueDetail, toolsClueExtInfoCallbackV2Request.extValueDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, callbackTime, clueEvent, clueId, extKey, extValue, extValueDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueExtInfoCallbackV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    callbackTime: ").append(toIndentedString(callbackTime)).append("\n");
    sb.append("    clueEvent: ").append(toIndentedString(clueEvent)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
    sb.append("    extKey: ").append(toIndentedString(extKey)).append("\n");
    sb.append("    extValue: ").append(toIndentedString(extValue)).append("\n");
    sb.append("    extValueDetail: ").append(toIndentedString(extValueDetail)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("callback_time");
    openapiFields.add("clue_event");
    openapiFields.add("clue_id");
    openapiFields.add("ext_key");
    openapiFields.add("ext_value");
    openapiFields.add("ext_value_detail");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("callback_time");
    openapiRequiredFields.add("clue_id");
    openapiRequiredFields.add("ext_key");
    openapiRequiredFields.add("ext_value");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueExtInfoCallbackV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueExtInfoCallbackV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueExtInfoCallbackV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueExtInfoCallbackV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueExtInfoCallbackV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueExtInfoCallbackV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueExtInfoCallbackV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueExtInfoCallbackV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueExtInfoCallbackV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueExtInfoCallbackV2Request
  */
  public static ToolsClueExtInfoCallbackV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueExtInfoCallbackV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueExtInfoCallbackV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

