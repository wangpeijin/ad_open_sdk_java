/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
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
 * 事件管理资产&amp;监测链接组信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StardeliveryTaskCreateV30RequestStarTaskAssetInfo {
  public static final String SERIALIZED_NAME_ANDROID_ASSET_ID = "android_asset_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_ASSET_ID)
  private Long androidAssetId = null;

  public static final String SERIALIZED_NAME_ANDROID_TRACK_URL_GROUP_ID = "android_track_url_group_id";
  @SerializedName(SERIALIZED_NAME_ANDROID_TRACK_URL_GROUP_ID)
  private Long androidTrackUrlGroupId = null;

  public static final String SERIALIZED_NAME_IOS_ASSET_ID = "ios_asset_id";
  @SerializedName(SERIALIZED_NAME_IOS_ASSET_ID)
  private Long iosAssetId = null;

  public static final String SERIALIZED_NAME_IOS_TRACK_URL_GROUP_ID = "ios_track_url_group_id";
  @SerializedName(SERIALIZED_NAME_IOS_TRACK_URL_GROUP_ID)
  private Long iosTrackUrlGroupId = null;

  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo() {
  }

  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo androidAssetId(Long androidAssetId) {
    
    this.androidAssetId = androidAssetId;
    return this;
  }

   /**
   * 安卓应用资产id，可通过「获取已创建资产列表」接口查询应用资产id，必须与star_task_android_track_url_group_id 同时传入，否则报错 
   * @return androidAssetId
  **/
  @javax.annotation.Nullable
  public Long getAndroidAssetId() {
    return androidAssetId;
  }


  public void setAndroidAssetId(Long androidAssetId) {
    this.androidAssetId = androidAssetId;
  }


  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo androidTrackUrlGroupId(Long androidTrackUrlGroupId) {
    
    this.androidTrackUrlGroupId = androidTrackUrlGroupId;
    return this;
  }

   /**
   * 安卓应用监测链接组ID，您可调用「获取事件资产下的监测链接组」接口查询资产下已创建的监测链接组ID(track_url_group_id) 
   * @return androidTrackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getAndroidTrackUrlGroupId() {
    return androidTrackUrlGroupId;
  }


  public void setAndroidTrackUrlGroupId(Long androidTrackUrlGroupId) {
    this.androidTrackUrlGroupId = androidTrackUrlGroupId;
  }


  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo iosAssetId(Long iosAssetId) {
    
    this.iosAssetId = iosAssetId;
    return this;
  }

   /**
   * iOS应用资产id，可通过「获取已创建资产列表」接口查询应用资产id，必须与star_task_ios_track_url_group_id 同时传入，否则报错
   * @return iosAssetId
  **/
  @javax.annotation.Nullable
  public Long getIosAssetId() {
    return iosAssetId;
  }


  public void setIosAssetId(Long iosAssetId) {
    this.iosAssetId = iosAssetId;
  }


  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo iosTrackUrlGroupId(Long iosTrackUrlGroupId) {
    
    this.iosTrackUrlGroupId = iosTrackUrlGroupId;
    return this;
  }

   /**
   * iOS应用监测链接组ID，您可调用「获取事件资产下的监测链接组」接口查询资产下已创建的监测链接组ID(track_url_group_id) 
   * @return iosTrackUrlGroupId
  **/
  @javax.annotation.Nullable
  public Long getIosTrackUrlGroupId() {
    return iosTrackUrlGroupId;
  }


  public void setIosTrackUrlGroupId(Long iosTrackUrlGroupId) {
    this.iosTrackUrlGroupId = iosTrackUrlGroupId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskCreateV30RequestStarTaskAssetInfo stardeliveryTaskCreateV30RequestStarTaskAssetInfo = (StardeliveryTaskCreateV30RequestStarTaskAssetInfo) o;
    return Objects.equals(this.androidAssetId, stardeliveryTaskCreateV30RequestStarTaskAssetInfo.androidAssetId) &&
        Objects.equals(this.androidTrackUrlGroupId, stardeliveryTaskCreateV30RequestStarTaskAssetInfo.androidTrackUrlGroupId) &&
        Objects.equals(this.iosAssetId, stardeliveryTaskCreateV30RequestStarTaskAssetInfo.iosAssetId) &&
        Objects.equals(this.iosTrackUrlGroupId, stardeliveryTaskCreateV30RequestStarTaskAssetInfo.iosTrackUrlGroupId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidAssetId, androidTrackUrlGroupId, iosAssetId, iosTrackUrlGroupId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskCreateV30RequestStarTaskAssetInfo {\n");
    sb.append("    androidAssetId: ").append(toIndentedString(androidAssetId)).append("\n");
    sb.append("    androidTrackUrlGroupId: ").append(toIndentedString(androidTrackUrlGroupId)).append("\n");
    sb.append("    iosAssetId: ").append(toIndentedString(iosAssetId)).append("\n");
    sb.append("    iosTrackUrlGroupId: ").append(toIndentedString(iosTrackUrlGroupId)).append("\n");
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
    openapiFields.add("android_asset_id");
    openapiFields.add("android_track_url_group_id");
    openapiFields.add("ios_asset_id");
    openapiFields.add("ios_track_url_group_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskCreateV30RequestStarTaskAssetInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskCreateV30RequestStarTaskAssetInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskCreateV30RequestStarTaskAssetInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskCreateV30RequestStarTaskAssetInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskCreateV30RequestStarTaskAssetInfo>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskCreateV30RequestStarTaskAssetInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskCreateV30RequestStarTaskAssetInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskCreateV30RequestStarTaskAssetInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskCreateV30RequestStarTaskAssetInfo
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskCreateV30RequestStarTaskAssetInfo
  */
  public static StardeliveryTaskCreateV30RequestStarTaskAssetInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskCreateV30RequestStarTaskAssetInfo.class);
  }

 /**
  * Convert an instance of StardeliveryTaskCreateV30RequestStarTaskAssetInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

