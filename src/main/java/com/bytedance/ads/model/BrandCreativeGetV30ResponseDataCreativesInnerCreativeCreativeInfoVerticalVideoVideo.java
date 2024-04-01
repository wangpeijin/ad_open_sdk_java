/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
 * 视频素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_FILE_NAME = "file_name";
  @SerializedName(SERIALIZED_NAME_FILE_NAME)
  private String fileName = null;

  public static final String SERIALIZED_NAME_FILE_SIZE = "file_size";
  @SerializedName(SERIALIZED_NAME_FILE_SIZE)
  private Long fileSize = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_ORIGIN_PLAY_URL = "origin_play_url";
  @SerializedName(SERIALIZED_NAME_ORIGIN_PLAY_URL)
  private String originPlayUrl = null;

  public static final String SERIALIZED_NAME_THUMB_HEIGHT = "thumb_height";
  @SerializedName(SERIALIZED_NAME_THUMB_HEIGHT)
  private Long thumbHeight = null;

  public static final String SERIALIZED_NAME_THUMB_URI = "thumb_uri";
  @SerializedName(SERIALIZED_NAME_THUMB_URI)
  private String thumbUri = null;

  public static final String SERIALIZED_NAME_THUMB_WIDTH = "thumb_width";
  @SerializedName(SERIALIZED_NAME_THUMB_WIDTH)
  private Long thumbWidth = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo() {
  }

  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 视频时长,单位秒
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo fileName(String fileName) {
    
    this.fileName = fileName;
    return this;
  }

   /**
   * 文件名称
   * @return fileName
  **/
  @javax.annotation.Nullable
  public String getFileName() {
    return fileName;
  }


  public void setFileName(String fileName) {
    this.fileName = fileName;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo fileSize(Long fileSize) {
    
    this.fileSize = fileSize;
    return this;
  }

   /**
   * 文件大小，单位字节
   * @return fileSize
  **/
  @javax.annotation.Nullable
  public Long getFileSize() {
    return fileSize;
  }


  public void setFileSize(Long fileSize) {
    this.fileSize = fileSize;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 视频高,单位px
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo originPlayUrl(String originPlayUrl) {
    
    this.originPlayUrl = originPlayUrl;
    return this;
  }

   /**
   * 原播放地址
   * @return originPlayUrl
  **/
  @javax.annotation.Nullable
  public String getOriginPlayUrl() {
    return originPlayUrl;
  }


  public void setOriginPlayUrl(String originPlayUrl) {
    this.originPlayUrl = originPlayUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo thumbHeight(Long thumbHeight) {
    
    this.thumbHeight = thumbHeight;
    return this;
  }

   /**
   * 封面图高度
   * @return thumbHeight
  **/
  @javax.annotation.Nullable
  public Long getThumbHeight() {
    return thumbHeight;
  }


  public void setThumbHeight(Long thumbHeight) {
    this.thumbHeight = thumbHeight;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo thumbUri(String thumbUri) {
    
    this.thumbUri = thumbUri;
    return this;
  }

   /**
   * 封面图uri
   * @return thumbUri
  **/
  @javax.annotation.Nullable
  public String getThumbUri() {
    return thumbUri;
  }


  public void setThumbUri(String thumbUri) {
    this.thumbUri = thumbUri;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo thumbWidth(Long thumbWidth) {
    
    this.thumbWidth = thumbWidth;
    return this;
  }

   /**
   * 封面图宽度
   * @return thumbWidth
  **/
  @javax.annotation.Nullable
  public Long getThumbWidth() {
    return thumbWidth;
  }


  public void setThumbWidth(Long thumbWidth) {
    this.thumbWidth = thumbWidth;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频url
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 视频宽,单位px
   * @return width
  **/
  @javax.annotation.Nullable
  public Long getWidth() {
    return width;
  }


  public void setWidth(Long width) {
    this.width = width;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo = (BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo) o;
    return Objects.equals(this.duration, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.duration) &&
        Objects.equals(this.fileName, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.fileName) &&
        Objects.equals(this.fileSize, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.fileSize) &&
        Objects.equals(this.height, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.height) &&
        Objects.equals(this.originPlayUrl, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.originPlayUrl) &&
        Objects.equals(this.thumbHeight, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.thumbHeight) &&
        Objects.equals(this.thumbUri, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.thumbUri) &&
        Objects.equals(this.thumbWidth, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.thumbWidth) &&
        Objects.equals(this.videoId, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.videoId) &&
        Objects.equals(this.videoUrl, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.videoUrl) &&
        Objects.equals(this.width, brandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, fileName, fileSize, height, originPlayUrl, thumbHeight, thumbUri, thumbWidth, videoId, videoUrl, width);
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
    sb.append("class BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
    sb.append("    fileSize: ").append(toIndentedString(fileSize)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    originPlayUrl: ").append(toIndentedString(originPlayUrl)).append("\n");
    sb.append("    thumbHeight: ").append(toIndentedString(thumbHeight)).append("\n");
    sb.append("    thumbUri: ").append(toIndentedString(thumbUri)).append("\n");
    sb.append("    thumbWidth: ").append(toIndentedString(thumbWidth)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
    openapiFields.add("duration");
    openapiFields.add("file_name");
    openapiFields.add("file_size");
    openapiFields.add("height");
    openapiFields.add("origin_play_url");
    openapiFields.add("thumb_height");
    openapiFields.add("thumb_uri");
    openapiFields.add("thumb_width");
    openapiFields.add("video_id");
    openapiFields.add("video_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo>() {
           @Override
           public void write(JsonWriter out, BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo
  * @throws IOException if the JSON string is invalid with respect to BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo
  */
  public static BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo.class);
  }

 /**
  * Convert an instance of BrandCreativeGetV30ResponseDataCreativesInnerCreativeCreativeInfoVerticalVideoVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

