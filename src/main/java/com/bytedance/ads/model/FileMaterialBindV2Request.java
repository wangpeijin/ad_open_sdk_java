/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
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
 * FileMaterialBindV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class FileMaterialBindV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_IDS = "carousel_ids";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_IDS)
  private List<Long> carouselIds = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_IDS = "target_advertiser_ids";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_IDS)
  private List<Long> targetAdvertiserIds = null;

  public static final String SERIALIZED_NAME_VIDEO_IDS = "video_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_IDS)
  private List<String> videoIds = null;

  public FileMaterialBindV2Request() {
  }

  public FileMaterialBindV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 素材归属广告主
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileMaterialBindV2Request carouselIds(List<Long> carouselIds) {
    
    this.carouselIds = carouselIds;
    return this;
  }

  public FileMaterialBindV2Request addCarouselIdsItem(Long carouselIdsItem) {
    if (this.carouselIds == null) {
      this.carouselIds = new ArrayList<>();
    }
    this.carouselIds.add(carouselIdsItem);
    return this;
  }

   /**
   * 图集ID，数量限制：&lt;&#x3D;50 注意：跟video_ids必须三选一
   * @return carouselIds
  **/
  @javax.annotation.Nullable
  public List<Long> getCarouselIds() {
    return carouselIds;
  }


  public void setCarouselIds(List<Long> carouselIds) {
    this.carouselIds = carouselIds;
  }


  public FileMaterialBindV2Request imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public FileMaterialBindV2Request addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 图片ID，数量限制：&lt;&#x3D;50 注意：跟video_ids必须三选一
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public FileMaterialBindV2Request targetAdvertiserIds(List<Long> targetAdvertiserIds) {
    
    this.targetAdvertiserIds = targetAdvertiserIds;
    return this;
  }

  public FileMaterialBindV2Request addTargetAdvertiserIdsItem(Long targetAdvertiserIdsItem) {
    if (this.targetAdvertiserIds == null) {
      this.targetAdvertiserIds = new ArrayList<>();
    }
    this.targetAdvertiserIds.add(targetAdvertiserIdsItem);
    return this;
  }

   /**
   * 待推送的广告主，数量限制：&lt;&#x3D;50
   * @return targetAdvertiserIds
  **/
  @javax.annotation.Nonnull
  public List<Long> getTargetAdvertiserIds() {
    return targetAdvertiserIds;
  }


  public void setTargetAdvertiserIds(List<Long> targetAdvertiserIds) {
    this.targetAdvertiserIds = targetAdvertiserIds;
  }


  public FileMaterialBindV2Request videoIds(List<String> videoIds) {
    
    this.videoIds = videoIds;
    return this;
  }

  public FileMaterialBindV2Request addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * 视频ID，数量限制：&lt;&#x3D;50 注意：跟image_ids必须三选一、组织共享视频不可推送
   * @return videoIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoIds() {
    return videoIds;
  }


  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialBindV2Request fileMaterialBindV2Request = (FileMaterialBindV2Request) o;
    return Objects.equals(this.advertiserId, fileMaterialBindV2Request.advertiserId) &&
        Objects.equals(this.carouselIds, fileMaterialBindV2Request.carouselIds) &&
        Objects.equals(this.imageIds, fileMaterialBindV2Request.imageIds) &&
        Objects.equals(this.targetAdvertiserIds, fileMaterialBindV2Request.targetAdvertiserIds) &&
        Objects.equals(this.videoIds, fileMaterialBindV2Request.videoIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, carouselIds, imageIds, targetAdvertiserIds, videoIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileMaterialBindV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    carouselIds: ").append(toIndentedString(carouselIds)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    targetAdvertiserIds: ").append(toIndentedString(targetAdvertiserIds)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
    openapiFields.add("carousel_ids");
    openapiFields.add("image_ids");
    openapiFields.add("target_advertiser_ids");
    openapiFields.add("video_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("target_advertiser_ids");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialBindV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialBindV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialBindV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialBindV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialBindV2Request>() {
           @Override
           public void write(JsonWriter out, FileMaterialBindV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialBindV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialBindV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialBindV2Request
  * @throws IOException if the JSON string is invalid with respect to FileMaterialBindV2Request
  */
  public static FileMaterialBindV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialBindV2Request.class);
  }

 /**
  * Convert an instance of FileMaterialBindV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

