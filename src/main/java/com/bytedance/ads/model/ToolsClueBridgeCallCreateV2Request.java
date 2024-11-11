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
 * ToolsClueBridgeCallCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsClueBridgeCallCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CALLEE_NUMBER = "callee_number";
  @SerializedName(SERIALIZED_NAME_CALLEE_NUMBER)
  private String calleeNumber = null;

  public static final String SERIALIZED_NAME_CALLER_NUMBER = "caller_number";
  @SerializedName(SERIALIZED_NAME_CALLER_NUMBER)
  private String callerNumber = null;

  public static final String SERIALIZED_NAME_CLUE_ID = "clue_id";
  @SerializedName(SERIALIZED_NAME_CLUE_ID)
  private Long clueId = null;

  public ToolsClueBridgeCallCreateV2Request() {
  }

  public ToolsClueBridgeCallCreateV2Request advertiserId(Long advertiserId) {
    
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


  public ToolsClueBridgeCallCreateV2Request calleeNumber(String calleeNumber) {
    
    this.calleeNumber = calleeNumber;
    return this;
  }

   /**
   * 被叫号码，即线索号码
   * @return calleeNumber
  **/
  @javax.annotation.Nonnull
  public String getCalleeNumber() {
    return calleeNumber;
  }


  public void setCalleeNumber(String calleeNumber) {
    this.calleeNumber = calleeNumber;
  }


  public ToolsClueBridgeCallCreateV2Request callerNumber(String callerNumber) {
    
    this.callerNumber = callerNumber;
    return this;
  }

   /**
   * 主叫号码，必须为11位手机号码，否则呼叫失败。
   * @return callerNumber
  **/
  @javax.annotation.Nonnull
  public String getCallerNumber() {
    return callerNumber;
  }


  public void setCallerNumber(String callerNumber) {
    this.callerNumber = callerNumber;
  }


  public ToolsClueBridgeCallCreateV2Request clueId(Long clueId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsClueBridgeCallCreateV2Request toolsClueBridgeCallCreateV2Request = (ToolsClueBridgeCallCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsClueBridgeCallCreateV2Request.advertiserId) &&
        Objects.equals(this.calleeNumber, toolsClueBridgeCallCreateV2Request.calleeNumber) &&
        Objects.equals(this.callerNumber, toolsClueBridgeCallCreateV2Request.callerNumber) &&
        Objects.equals(this.clueId, toolsClueBridgeCallCreateV2Request.clueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, calleeNumber, callerNumber, clueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsClueBridgeCallCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    calleeNumber: ").append(toIndentedString(calleeNumber)).append("\n");
    sb.append("    callerNumber: ").append(toIndentedString(callerNumber)).append("\n");
    sb.append("    clueId: ").append(toIndentedString(clueId)).append("\n");
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
    openapiFields.add("callee_number");
    openapiFields.add("caller_number");
    openapiFields.add("clue_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("callee_number");
    openapiRequiredFields.add("caller_number");
    openapiRequiredFields.add("clue_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsClueBridgeCallCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsClueBridgeCallCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsClueBridgeCallCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsClueBridgeCallCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsClueBridgeCallCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsClueBridgeCallCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsClueBridgeCallCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsClueBridgeCallCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsClueBridgeCallCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsClueBridgeCallCreateV2Request
  */
  public static ToolsClueBridgeCallCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsClueBridgeCallCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsClueBridgeCallCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

