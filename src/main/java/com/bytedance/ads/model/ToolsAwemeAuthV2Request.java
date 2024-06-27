/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeAuthV2AuthType;
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
 * ToolsAwemeAuthV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsAwemeAuthV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private ToolsAwemeAuthV2AuthType authType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private String code = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_ITEM_URL = "item_url";
  @SerializedName(SERIALIZED_NAME_ITEM_URL)
  private String itemUrl = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ToolsAwemeAuthV2Request() {
  }

  public ToolsAwemeAuthV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsAwemeAuthV2Request authType(ToolsAwemeAuthV2AuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nonnull
  public ToolsAwemeAuthV2AuthType getAuthType() {
    return authType;
  }


  public void setAuthType(ToolsAwemeAuthV2AuthType authType) {
    this.authType = authType;
  }


  public ToolsAwemeAuthV2Request awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号
   * @return awemeId
  **/
  @javax.annotation.Nonnull
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsAwemeAuthV2Request code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * 授权码
   * @return code
  **/
  @javax.annotation.Nonnull
  public String getCode() {
    return code;
  }


  public void setCode(String code) {
    this.code = code;
  }


  public ToolsAwemeAuthV2Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 授权结束时间
   * @return endTime
  **/
  @javax.annotation.Nonnull
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsAwemeAuthV2Request itemUrl(String itemUrl) {
    
    this.itemUrl = itemUrl;
    return this;
  }

   /**
   * 抖音短视频链接
   * @return itemUrl
  **/
  @javax.annotation.Nullable
  public String getItemUrl() {
    return itemUrl;
  }


  public void setItemUrl(String itemUrl) {
    this.itemUrl = itemUrl;
  }


  public ToolsAwemeAuthV2Request startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 授权开始时间
   * @return startTime
  **/
  @javax.annotation.Nonnull
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthV2Request toolsAwemeAuthV2Request = (ToolsAwemeAuthV2Request) o;
    return Objects.equals(this.advertiserId, toolsAwemeAuthV2Request.advertiserId) &&
        Objects.equals(this.authType, toolsAwemeAuthV2Request.authType) &&
        Objects.equals(this.awemeId, toolsAwemeAuthV2Request.awemeId) &&
        Objects.equals(this.code, toolsAwemeAuthV2Request.code) &&
        Objects.equals(this.endTime, toolsAwemeAuthV2Request.endTime) &&
        Objects.equals(this.itemUrl, toolsAwemeAuthV2Request.itemUrl) &&
        Objects.equals(this.startTime, toolsAwemeAuthV2Request.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, authType, awemeId, code, endTime, itemUrl, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAwemeAuthV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("auth_type");
    openapiFields.add("aweme_id");
    openapiFields.add("code");
    openapiFields.add("end_time");
    openapiFields.add("item_url");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("auth_type");
    openapiRequiredFields.add("aweme_id");
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("end_time");
    openapiRequiredFields.add("start_time");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthV2Request
  */
  public static ToolsAwemeAuthV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthV2Request.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

