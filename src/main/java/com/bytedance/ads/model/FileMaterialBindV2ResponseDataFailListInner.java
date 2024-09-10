/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * FileMaterialBindV2ResponseDataFailListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class FileMaterialBindV2ResponseDataFailListInner {
  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_FAIL_REASON = "fail_reason";
  @SerializedName(SERIALIZED_NAME_FAIL_REASON)
  private String failReason = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_ID = "target_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_ID)
  private Long targetAdvertiserId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public FileMaterialBindV2ResponseDataFailListInner() {
  }

  public FileMaterialBindV2ResponseDataFailListInner carouselId(Long carouselId) {
    
    this.carouselId = carouselId;
    return this;
  }

   /**
   * 推送失败的图集id
   * @return carouselId
  **/
  @javax.annotation.Nullable
  public Long getCarouselId() {
    return carouselId;
  }


  public void setCarouselId(Long carouselId) {
    this.carouselId = carouselId;
  }


  public FileMaterialBindV2ResponseDataFailListInner failReason(String failReason) {
    
    this.failReason = failReason;
    return this;
  }

   /**
   * 推送失败原因
   * @return failReason
  **/
  @javax.annotation.Nullable
  public String getFailReason() {
    return failReason;
  }


  public void setFailReason(String failReason) {
    this.failReason = failReason;
  }


  public FileMaterialBindV2ResponseDataFailListInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 推送失败的图片id
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public FileMaterialBindV2ResponseDataFailListInner targetAdvertiserId(Long targetAdvertiserId) {
    
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

   /**
   * 目标推送广告主id
   * @return targetAdvertiserId
  **/
  @javax.annotation.Nullable
  public Long getTargetAdvertiserId() {
    return targetAdvertiserId;
  }


  public void setTargetAdvertiserId(Long targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
  }


  public FileMaterialBindV2ResponseDataFailListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 推送失败的视频id
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileMaterialBindV2ResponseDataFailListInner fileMaterialBindV2ResponseDataFailListInner = (FileMaterialBindV2ResponseDataFailListInner) o;
    return Objects.equals(this.carouselId, fileMaterialBindV2ResponseDataFailListInner.carouselId) &&
        Objects.equals(this.failReason, fileMaterialBindV2ResponseDataFailListInner.failReason) &&
        Objects.equals(this.imageId, fileMaterialBindV2ResponseDataFailListInner.imageId) &&
        Objects.equals(this.targetAdvertiserId, fileMaterialBindV2ResponseDataFailListInner.targetAdvertiserId) &&
        Objects.equals(this.videoId, fileMaterialBindV2ResponseDataFailListInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselId, failReason, imageId, targetAdvertiserId, videoId);
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
    sb.append("class FileMaterialBindV2ResponseDataFailListInner {\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    targetAdvertiserId: ").append(toIndentedString(targetAdvertiserId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("carousel_id");
    openapiFields.add("fail_reason");
    openapiFields.add("image_id");
    openapiFields.add("target_advertiser_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileMaterialBindV2ResponseDataFailListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileMaterialBindV2ResponseDataFailListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileMaterialBindV2ResponseDataFailListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileMaterialBindV2ResponseDataFailListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileMaterialBindV2ResponseDataFailListInner>() {
           @Override
           public void write(JsonWriter out, FileMaterialBindV2ResponseDataFailListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileMaterialBindV2ResponseDataFailListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileMaterialBindV2ResponseDataFailListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileMaterialBindV2ResponseDataFailListInner
  * @throws IOException if the JSON string is invalid with respect to FileMaterialBindV2ResponseDataFailListInner
  */
  public static FileMaterialBindV2ResponseDataFailListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileMaterialBindV2ResponseDataFailListInner.class);
  }

 /**
  * Convert an instance of FileMaterialBindV2ResponseDataFailListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

