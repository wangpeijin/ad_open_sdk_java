/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerTrackUrlUpdateV2RequestTrackUrlGroup;
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
 * EventManagerTrackUrlUpdateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class EventManagerTrackUrlUpdateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ASSET_ID = "asset_id";
  @SerializedName(SERIALIZED_NAME_ASSET_ID)
  private Long assetId = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP = "track_url_group";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP)
  private EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrlGroup = null;

  public EventManagerTrackUrlUpdateV2Request() {
  }

  public EventManagerTrackUrlUpdateV2Request advertiserId(Long advertiserId) {
    
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


  public EventManagerTrackUrlUpdateV2Request assetId(Long assetId) {
    
    this.assetId = assetId;
    return this;
  }

   /**
   * 资产ID
   * @return assetId
  **/
  @javax.annotation.Nonnull
  public Long getAssetId() {
    return assetId;
  }


  public void setAssetId(Long assetId) {
    this.assetId = assetId;
  }


  public EventManagerTrackUrlUpdateV2Request downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 应用下载链接，应用必填
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public EventManagerTrackUrlUpdateV2Request trackUrlGroup(EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrlGroup) {
    
    this.trackUrlGroup = trackUrlGroup;
    return this;
  }

   /**
   * Get trackUrlGroup
   * @return trackUrlGroup
  **/
  @javax.annotation.Nonnull
  public EventManagerTrackUrlUpdateV2RequestTrackUrlGroup getTrackUrlGroup() {
    return trackUrlGroup;
  }


  public void setTrackUrlGroup(EventManagerTrackUrlUpdateV2RequestTrackUrlGroup trackUrlGroup) {
    this.trackUrlGroup = trackUrlGroup;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerTrackUrlUpdateV2Request eventManagerTrackUrlUpdateV2Request = (EventManagerTrackUrlUpdateV2Request) o;
    return Objects.equals(this.advertiserId, eventManagerTrackUrlUpdateV2Request.advertiserId) &&
        Objects.equals(this.assetId, eventManagerTrackUrlUpdateV2Request.assetId) &&
        Objects.equals(this.downloadUrl, eventManagerTrackUrlUpdateV2Request.downloadUrl) &&
        Objects.equals(this.trackUrlGroup, eventManagerTrackUrlUpdateV2Request.trackUrlGroup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, assetId, downloadUrl, trackUrlGroup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerTrackUrlUpdateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    assetId: ").append(toIndentedString(assetId)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    trackUrlGroup: ").append(toIndentedString(trackUrlGroup)).append("\n");
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
    openapiFields.add("asset_id");
    openapiFields.add("download_url");
    openapiFields.add("track_url_group");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("asset_id");
    openapiRequiredFields.add("track_url_group");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlUpdateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlUpdateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlUpdateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlUpdateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlUpdateV2Request>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlUpdateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlUpdateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlUpdateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlUpdateV2Request
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlUpdateV2Request
  */
  public static EventManagerTrackUrlUpdateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlUpdateV2Request.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlUpdateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

