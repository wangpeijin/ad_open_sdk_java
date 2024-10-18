/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo {
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

  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo() {
  }

  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo duration(Double duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Double getDuration() {
    return duration;
  }


  public void setDuration(Double duration) {
    this.duration = duration;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo size(Long size) {
    
    this.size = size;
    return this;
  }

   /**
   * 
   * @return size
  **/
  @javax.annotation.Nullable
  public Long getSize() {
    return size;
  }


  public void setSize(Long size) {
    this.size = size;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo videoId(String videoId) {
    
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


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo videoSignature(String videoSignature) {
    
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * 
   * @return videoSignature
  **/
  @javax.annotation.Nullable
  public String getVideoSignature() {
    return videoSignature;
  }


  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
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
    FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo = (FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo) o;
    return Objects.equals(this.duration, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.duration) &&
        Objects.equals(this.height, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.height) &&
        Objects.equals(this.materialId, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.materialId) &&
        Objects.equals(this.size, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.size) &&
        Objects.equals(this.videoId, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.videoId) &&
        Objects.equals(this.videoSignature, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.videoSignature) &&
        Objects.equals(this.videoUrl, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.videoUrl) &&
        Objects.equals(this.width, fileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.width);
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
    sb.append("class FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo {\n");
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
       if (!FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo>() {
           @Override
           public void write(JsonWriter out, FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo
  * @throws IOException if the JSON string is invalid with respect to FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo
  */
  public static FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo.class);
  }

 /**
  * Convert an instance of FileVideoUploadTaskListV2ResponseDataListInnerVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

