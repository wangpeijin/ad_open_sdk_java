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
import com.bytedance.ads.model.AicMaterialPushV30AccountType;
import com.bytedance.ads.model.AicMaterialPushV30BussinessType;
import com.bytedance.ads.model.AicMaterialPushV30RequestVideosInner;
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
 * AicMaterialPushV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class AicMaterialPushV30Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private AicMaterialPushV30AccountType accountType = null;

  public static final String SERIALIZED_NAME_ADVERTISER_IDS = "advertiser_ids";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_IDS)
  private List<Long> advertiserIds = null;

  public static final String SERIALIZED_NAME_BUSSINESS_TYPE = "bussiness_type";
  @SerializedName(SERIALIZED_NAME_BUSSINESS_TYPE)
  private AicMaterialPushV30BussinessType bussinessType = null;

  public static final String SERIALIZED_NAME_VIDEOS = "videos";
  @SerializedName(SERIALIZED_NAME_VIDEOS)
  private List<AicMaterialPushV30RequestVideosInner> videos = null;

  public AicMaterialPushV30Request() {
  }

  public AicMaterialPushV30Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * BP账户体系:组织id，Agent账户体系:代理商id
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public AicMaterialPushV30Request accountType(AicMaterialPushV30AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public AicMaterialPushV30AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(AicMaterialPushV30AccountType accountType) {
    this.accountType = accountType;
  }


  public AicMaterialPushV30Request advertiserIds(List<Long> advertiserIds) {
    
    this.advertiserIds = advertiserIds;
    return this;
  }

  public AicMaterialPushV30Request addAdvertiserIdsItem(Long advertiserIdsItem) {
    if (this.advertiserIds == null) {
      this.advertiserIds = new ArrayList<>();
    }
    this.advertiserIds.add(advertiserIdsItem);
    return this;
  }

   /**
   * 待推送的广告主，数量限制：50，必须是推送广告主所属平台的广告主
   * @return advertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getAdvertiserIds() {
    return advertiserIds;
  }


  public void setAdvertiserIds(List<Long> advertiserIds) {
    this.advertiserIds = advertiserIds;
  }


  public AicMaterialPushV30Request bussinessType(AicMaterialPushV30BussinessType bussinessType) {
    
    this.bussinessType = bussinessType;
    return this;
  }

   /**
   * Get bussinessType
   * @return bussinessType
  **/
  @javax.annotation.Nonnull
  public AicMaterialPushV30BussinessType getBussinessType() {
    return bussinessType;
  }


  public void setBussinessType(AicMaterialPushV30BussinessType bussinessType) {
    this.bussinessType = bussinessType;
  }


  public AicMaterialPushV30Request videos(List<AicMaterialPushV30RequestVideosInner> videos) {
    
    this.videos = videos;
    return this;
  }

  public AicMaterialPushV30Request addVideosItem(AicMaterialPushV30RequestVideosInner videosItem) {
    if (this.videos == null) {
      this.videos = new ArrayList<>();
    }
    this.videos.add(videosItem);
    return this;
  }

   /**
   * 需要推送的视频，数量限制50
   * @return videos
  **/
  @javax.annotation.Nonnull
  public List<AicMaterialPushV30RequestVideosInner> getVideos() {
    return videos;
  }


  public void setVideos(List<AicMaterialPushV30RequestVideosInner> videos) {
    this.videos = videos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMaterialPushV30Request aicMaterialPushV30Request = (AicMaterialPushV30Request) o;
    return Objects.equals(this.accountId, aicMaterialPushV30Request.accountId) &&
        Objects.equals(this.accountType, aicMaterialPushV30Request.accountType) &&
        Objects.equals(this.advertiserIds, aicMaterialPushV30Request.advertiserIds) &&
        Objects.equals(this.bussinessType, aicMaterialPushV30Request.bussinessType) &&
        Objects.equals(this.videos, aicMaterialPushV30Request.videos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, advertiserIds, bussinessType, videos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AicMaterialPushV30Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    advertiserIds: ").append(toIndentedString(advertiserIds)).append("\n");
    sb.append("    bussinessType: ").append(toIndentedString(bussinessType)).append("\n");
    sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("advertiser_ids");
    openapiFields.add("bussiness_type");
    openapiFields.add("videos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("advertiser_ids");
    openapiRequiredFields.add("bussiness_type");
    openapiRequiredFields.add("videos");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMaterialPushV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialPushV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialPushV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialPushV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialPushV30Request>() {
           @Override
           public void write(JsonWriter out, AicMaterialPushV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialPushV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialPushV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialPushV30Request
  * @throws IOException if the JSON string is invalid with respect to AicMaterialPushV30Request
  */
  public static AicMaterialPushV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialPushV30Request.class);
  }

 /**
  * Convert an instance of AicMaterialPushV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

