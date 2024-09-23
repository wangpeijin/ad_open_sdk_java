/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.21
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-23T20:22:05.728466681+08:00[Asia/Shanghai]")
public class LocalFileVideoUploadV30ResponseData {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SIZE = "size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private Long size = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_SIGNATURE = "video_signature";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIGNATURE)
  private String videoSignature = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public LocalFileVideoUploadV30ResponseData() {
  }

  public LocalFileVideoUploadV30ResponseData duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 视频时长 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public LocalFileVideoUploadV30ResponseData height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 视频高度 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public LocalFileVideoUploadV30ResponseData materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 素材id，即多合一报表中的素材id，一个素材唯一对应一个素材id 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public LocalFileVideoUploadV30ResponseData size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 视频大小 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public LocalFileVideoUploadV30ResponseData videoId(String videoId) {
    
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


  public LocalFileVideoUploadV30ResponseData videoSignature(String videoSignature) {
    
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * 视频md5值
   * @return videoSignature
  **/
  @javax.annotation.Nullable
  public String getVideoSignature() {
    return videoSignature;
  }


  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }


  public LocalFileVideoUploadV30ResponseData videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频地址 
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public LocalFileVideoUploadV30ResponseData width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 视频宽度
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
    LocalFileVideoUploadV30ResponseData localFileVideoUploadV30ResponseData = (LocalFileVideoUploadV30ResponseData) o;
    return Objects.equals(this.duration, localFileVideoUploadV30ResponseData.duration) &&
        Objects.equals(this.height, localFileVideoUploadV30ResponseData.height) &&
        Objects.equals(this.materialId, localFileVideoUploadV30ResponseData.materialId) &&
        Objects.equals(this.size, localFileVideoUploadV30ResponseData.size) &&
        Objects.equals(this.videoId, localFileVideoUploadV30ResponseData.videoId) &&
        Objects.equals(this.videoSignature, localFileVideoUploadV30ResponseData.videoSignature) &&
        Objects.equals(this.videoUrl, localFileVideoUploadV30ResponseData.videoUrl) &&
        Objects.equals(this.width, localFileVideoUploadV30ResponseData.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, height, materialId, size, videoId, videoSignature, videoUrl, width);
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
    sb.append("class LocalFileVideoUploadV30ResponseData {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoSignature: ").append(toIndentedString(videoSignature)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("material_id");
    openapiFields.add("size");
    openapiFields.add("video_id");
    openapiFields.add("video_signature");
    openapiFields.add("video_url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoUploadV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoUploadV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoUploadV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoUploadV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoUploadV30ResponseData>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoUploadV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoUploadV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoUploadV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoUploadV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoUploadV30ResponseData
  */
  public static LocalFileVideoUploadV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoUploadV30ResponseData.class);
  }

 /**
  * Convert an instance of LocalFileVideoUploadV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
