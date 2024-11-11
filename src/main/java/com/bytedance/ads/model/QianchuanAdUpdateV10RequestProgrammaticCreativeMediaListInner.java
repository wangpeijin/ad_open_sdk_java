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
import com.bytedance.ads.model.QianchuanAdUpdateV10ProgrammaticCreativeMediaListImageMode;
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
 * QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner {
  public static final String SERIALIZED_NAME_AWEME_CAROUSEL_ID = "aweme_carousel_id";
  @SerializedName(SERIALIZED_NAME_AWEME_CAROUSEL_ID)
  private Long awemeCarouselId = null;

  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_CAROUSEL_ID = "carousel_id";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_ID)
  private Long carouselId = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdUpdateV10ProgrammaticCreativeMediaListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner() {
  }

  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner awemeCarouselId(Long awemeCarouselId) {
    
    this.awemeCarouselId = awemeCarouselId;
    return this;
  }

   /**
   * 
   * @return awemeCarouselId
  **/
  @javax.annotation.Nullable
  public Long getAwemeCarouselId() {
    return awemeCarouselId;
  }


  public void setAwemeCarouselId(Long awemeCarouselId) {
    this.awemeCarouselId = awemeCarouselId;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner carouselId(Long carouselId) {
    
    this.carouselId = carouselId;
    return this;
  }

   /**
   * 
   * @return carouselId
  **/
  @javax.annotation.Nullable
  public Long getCarouselId() {
    return carouselId;
  }


  public void setCarouselId(Long carouselId) {
    this.carouselId = carouselId;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner imageMode(QianchuanAdUpdateV10ProgrammaticCreativeMediaListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdUpdateV10ProgrammaticCreativeMediaListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdUpdateV10ProgrammaticCreativeMediaListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner videoCoverId(String videoCoverId) {
    
    this.videoCoverId = videoCoverId;
    return this;
  }

   /**
   * 
   * @return videoCoverId
  **/
  @javax.annotation.Nullable
  public String getVideoCoverId() {
    return videoCoverId;
  }


  public void setVideoCoverId(String videoCoverId) {
    this.videoCoverId = videoCoverId;
  }


  public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 
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
    QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner = (QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner) o;
    return Objects.equals(this.awemeCarouselId, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.awemeCarouselId) &&
        Objects.equals(this.awemeItemId, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.awemeItemId) &&
        Objects.equals(this.carouselId, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.carouselId) &&
        Objects.equals(this.imageIds, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.imageIds) &&
        Objects.equals(this.imageMode, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.imageMode) &&
        Objects.equals(this.title, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.title) &&
        Objects.equals(this.videoCoverId, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.videoCoverId) &&
        Objects.equals(this.videoId, qianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeCarouselId, awemeItemId, carouselId, imageIds, imageMode, title, videoCoverId, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner {\n");
    sb.append("    awemeCarouselId: ").append(toIndentedString(awemeCarouselId)).append("\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    carouselId: ").append(toIndentedString(carouselId)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
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
    openapiFields.add("aweme_carousel_id");
    openapiFields.add("aweme_item_id");
    openapiFields.add("carousel_id");
    openapiFields.add("image_ids");
    openapiFields.add("image_mode");
    openapiFields.add("title");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner
  */
  public static QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdUpdateV10RequestProgrammaticCreativeMediaListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

