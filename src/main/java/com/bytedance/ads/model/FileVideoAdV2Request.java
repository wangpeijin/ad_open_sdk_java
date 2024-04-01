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
import com.bytedance.ads.model.FileVideoAdV2UploadType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * FileVideoAdV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class FileVideoAdV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_IS_AIGC = "is_aigc";
  @SerializedName(SERIALIZED_NAME_IS_AIGC)
  private Boolean isAigc = null;

  public static final String SERIALIZED_NAME_IS_GUIDE_VIDEO = "is_guide_video";
  @SerializedName(SERIALIZED_NAME_IS_GUIDE_VIDEO)
  private Boolean isGuideVideo = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "upload_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private FileVideoAdV2UploadType uploadType = null;

  public static final String SERIALIZED_NAME_VIDEO_FILE = "video_file";
  @SerializedName(SERIALIZED_NAME_VIDEO_FILE)
  private File videoFile = null;

  public static final String SERIALIZED_NAME_VIDEO_SIGNATURE = "video_signature";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIGNATURE)
  private String videoSignature = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FileVideoAdV2Request() {
  }

  public FileVideoAdV2Request advertiserId(Long advertiserId) {
    
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


  public FileVideoAdV2Request filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileVideoAdV2Request isAigc(Boolean isAigc) {
    
    this.isAigc = isAigc;
    return this;
  }

   /**
   * 视频素材是否为AIGC生成
   * @return isAigc
  **/
  @javax.annotation.Nullable
  public Boolean getIsAigc() {
    return isAigc;
  }


  public void setIsAigc(Boolean isAigc) {
    this.isAigc = isAigc;
  }


  public FileVideoAdV2Request isGuideVideo(Boolean isGuideVideo) {
    
    this.isGuideVideo = isGuideVideo;
    return this;
  }

   /**
   * 上传视频场景是否是引导视频
   * @return isGuideVideo
  **/
  @javax.annotation.Nullable
  public Boolean getIsGuideVideo() {
    return isGuideVideo;
  }


  public void setIsGuideVideo(Boolean isGuideVideo) {
    this.isGuideVideo = isGuideVideo;
  }


  public FileVideoAdV2Request labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public FileVideoAdV2Request addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public FileVideoAdV2Request uploadType(FileVideoAdV2UploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nullable
  public FileVideoAdV2UploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(FileVideoAdV2UploadType uploadType) {
    this.uploadType = uploadType;
  }


  public FileVideoAdV2Request videoFile(File videoFile) {
    
    this.videoFile = videoFile;
    return this;
  }

   /**
   * 视频文件 允许格式：mp4、mpeg、3gp、avi（10s超时限制） upload_type为UPLOAD_BY_File必填 
   * @return videoFile
  **/
  @javax.annotation.Nullable
  public File getVideoFile() {
    return videoFile;
  }


  public void setVideoFile(File videoFile) {
    this.videoFile = videoFile;
  }


  public FileVideoAdV2Request videoSignature(String videoSignature) {
    
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * 视频的md5值(用于服务端校验) upload_type为UPLOAD_BY_File必填 
   * @return videoSignature
  **/
  @javax.annotation.Nullable
  public String getVideoSignature() {
    return videoSignature;
  }


  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }


  public FileVideoAdV2Request videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频url地址，如http://xxx.xxx，upload_type为UPLOAD_BY_URL必填 
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileVideoAdV2Request fileVideoAdV2Request = (FileVideoAdV2Request) o;
    return Objects.equals(this.advertiserId, fileVideoAdV2Request.advertiserId) &&
        Objects.equals(this.filename, fileVideoAdV2Request.filename) &&
        Objects.equals(this.isAigc, fileVideoAdV2Request.isAigc) &&
        Objects.equals(this.isGuideVideo, fileVideoAdV2Request.isGuideVideo) &&
        Objects.equals(this.labels, fileVideoAdV2Request.labels) &&
        Objects.equals(this.uploadType, fileVideoAdV2Request.uploadType) &&
        Objects.equals(this.videoFile, fileVideoAdV2Request.videoFile) &&
        Objects.equals(this.videoSignature, fileVideoAdV2Request.videoSignature) &&
        Objects.equals(this.videoUrl, fileVideoAdV2Request.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, filename, isAigc, isGuideVideo, labels, uploadType, videoFile, videoSignature, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoAdV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    isAigc: ").append(toIndentedString(isAigc)).append("\n");
    sb.append("    isGuideVideo: ").append(toIndentedString(isGuideVideo)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
    sb.append("    videoFile: ").append(toIndentedString(videoFile)).append("\n");
    sb.append("    videoSignature: ").append(toIndentedString(videoSignature)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("is_aigc");
    openapiFields.add("is_guide_video");
    openapiFields.add("labels");
    openapiFields.add("upload_type");
    openapiFields.add("video_file");
    openapiFields.add("video_signature");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoAdV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoAdV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoAdV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoAdV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoAdV2Request>() {
           @Override
           public void write(JsonWriter out, FileVideoAdV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoAdV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoAdV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoAdV2Request
  * @throws IOException if the JSON string is invalid with respect to FileVideoAdV2Request
  */
  public static FileVideoAdV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoAdV2Request.class);
  }

 /**
  * Convert an instance of FileVideoAdV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

