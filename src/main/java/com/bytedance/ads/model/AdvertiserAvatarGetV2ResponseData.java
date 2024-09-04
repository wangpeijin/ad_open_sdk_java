/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserAvatarGetV2ResponseDataAvatarInfo;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class AdvertiserAvatarGetV2ResponseData {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AVATAR_INFO = "avatar_info";
  @SerializedName(SERIALIZED_NAME_AVATAR_INFO)
  private AdvertiserAvatarGetV2ResponseDataAvatarInfo avatarInfo = null;

  public static final String SERIALIZED_NAME_AVATAR_REASON = "avatar_reason";
  @SerializedName(SERIALIZED_NAME_AVATAR_REASON)
  private String avatarReason = null;

  public static final String SERIALIZED_NAME_AVATAR_STATUS = "avatar_status";
  @SerializedName(SERIALIZED_NAME_AVATAR_STATUS)
  private String avatarStatus = null;

  public static final String SERIALIZED_NAME_SOURCE_INFO = "source_info";
  @SerializedName(SERIALIZED_NAME_SOURCE_INFO)
  private String sourceInfo = null;

  public static final String SERIALIZED_NAME_SOURCE_REASON = "source_reason";
  @SerializedName(SERIALIZED_NAME_SOURCE_REASON)
  private String sourceReason = null;

  public static final String SERIALIZED_NAME_SOURCE_STATUS = "source_status";
  @SerializedName(SERIALIZED_NAME_SOURCE_STATUS)
  private String sourceStatus = null;

  public AdvertiserAvatarGetV2ResponseData() {
  }

  public AdvertiserAvatarGetV2ResponseData advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserAvatarGetV2ResponseData avatarInfo(AdvertiserAvatarGetV2ResponseDataAvatarInfo avatarInfo) {
    
    this.avatarInfo = avatarInfo;
    return this;
  }

   /**
   * Get avatarInfo
   * @return avatarInfo
  **/
  @javax.annotation.Nullable
  public AdvertiserAvatarGetV2ResponseDataAvatarInfo getAvatarInfo() {
    return avatarInfo;
  }


  public void setAvatarInfo(AdvertiserAvatarGetV2ResponseDataAvatarInfo avatarInfo) {
    this.avatarInfo = avatarInfo;
  }


  public AdvertiserAvatarGetV2ResponseData avatarReason(String avatarReason) {
    
    this.avatarReason = avatarReason;
    return this;
  }

   /**
   * 
   * @return avatarReason
  **/
  @javax.annotation.Nullable
  public String getAvatarReason() {
    return avatarReason;
  }


  public void setAvatarReason(String avatarReason) {
    this.avatarReason = avatarReason;
  }


  public AdvertiserAvatarGetV2ResponseData avatarStatus(String avatarStatus) {
    
    this.avatarStatus = avatarStatus;
    return this;
  }

   /**
   * 
   * @return avatarStatus
  **/
  @javax.annotation.Nullable
  public String getAvatarStatus() {
    return avatarStatus;
  }


  public void setAvatarStatus(String avatarStatus) {
    this.avatarStatus = avatarStatus;
  }


  public AdvertiserAvatarGetV2ResponseData sourceInfo(String sourceInfo) {
    
    this.sourceInfo = sourceInfo;
    return this;
  }

   /**
   * 
   * @return sourceInfo
  **/
  @javax.annotation.Nullable
  public String getSourceInfo() {
    return sourceInfo;
  }


  public void setSourceInfo(String sourceInfo) {
    this.sourceInfo = sourceInfo;
  }


  public AdvertiserAvatarGetV2ResponseData sourceReason(String sourceReason) {
    
    this.sourceReason = sourceReason;
    return this;
  }

   /**
   * 
   * @return sourceReason
  **/
  @javax.annotation.Nullable
  public String getSourceReason() {
    return sourceReason;
  }


  public void setSourceReason(String sourceReason) {
    this.sourceReason = sourceReason;
  }


  public AdvertiserAvatarGetV2ResponseData sourceStatus(String sourceStatus) {
    
    this.sourceStatus = sourceStatus;
    return this;
  }

   /**
   * 
   * @return sourceStatus
  **/
  @javax.annotation.Nullable
  public String getSourceStatus() {
    return sourceStatus;
  }


  public void setSourceStatus(String sourceStatus) {
    this.sourceStatus = sourceStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserAvatarGetV2ResponseData advertiserAvatarGetV2ResponseData = (AdvertiserAvatarGetV2ResponseData) o;
    return Objects.equals(this.advertiserId, advertiserAvatarGetV2ResponseData.advertiserId) &&
        Objects.equals(this.avatarInfo, advertiserAvatarGetV2ResponseData.avatarInfo) &&
        Objects.equals(this.avatarReason, advertiserAvatarGetV2ResponseData.avatarReason) &&
        Objects.equals(this.avatarStatus, advertiserAvatarGetV2ResponseData.avatarStatus) &&
        Objects.equals(this.sourceInfo, advertiserAvatarGetV2ResponseData.sourceInfo) &&
        Objects.equals(this.sourceReason, advertiserAvatarGetV2ResponseData.sourceReason) &&
        Objects.equals(this.sourceStatus, advertiserAvatarGetV2ResponseData.sourceStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, avatarInfo, avatarReason, avatarStatus, sourceInfo, sourceReason, sourceStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserAvatarGetV2ResponseData {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    avatarInfo: ").append(toIndentedString(avatarInfo)).append("\n");
    sb.append("    avatarReason: ").append(toIndentedString(avatarReason)).append("\n");
    sb.append("    avatarStatus: ").append(toIndentedString(avatarStatus)).append("\n");
    sb.append("    sourceInfo: ").append(toIndentedString(sourceInfo)).append("\n");
    sb.append("    sourceReason: ").append(toIndentedString(sourceReason)).append("\n");
    sb.append("    sourceStatus: ").append(toIndentedString(sourceStatus)).append("\n");
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
    openapiFields.add("avatar_info");
    openapiFields.add("avatar_reason");
    openapiFields.add("avatar_status");
    openapiFields.add("source_info");
    openapiFields.add("source_reason");
    openapiFields.add("source_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserAvatarGetV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserAvatarGetV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserAvatarGetV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserAvatarGetV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserAvatarGetV2ResponseData>() {
           @Override
           public void write(JsonWriter out, AdvertiserAvatarGetV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserAvatarGetV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserAvatarGetV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserAvatarGetV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to AdvertiserAvatarGetV2ResponseData
  */
  public static AdvertiserAvatarGetV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserAvatarGetV2ResponseData.class);
  }

 /**
  * Convert an instance of AdvertiserAvatarGetV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

