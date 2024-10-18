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
import com.bytedance.ads.model.LocalFileVideoUploadV30RequestVideoFile;
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
 * LocalFileVideoUploadV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class LocalFileVideoUploadV30Request {
  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_VIDEO_FILE = "video_file";
  @SerializedName(SERIALIZED_NAME_VIDEO_FILE)
  private LocalFileVideoUploadV30RequestVideoFile videoFile = null;

  public static final String SERIALIZED_NAME_VIDEO_SIGNATURE = "video_signature";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIGNATURE)
  private String videoSignature = null;

  public LocalFileVideoUploadV30Request() {
  }

  public LocalFileVideoUploadV30Request filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 素材的文件名，可自定义素材名，不传择默认取文件名，最长255个字符
   * @return filename
  **/
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public LocalFileVideoUploadV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalFileVideoUploadV30Request videoFile(LocalFileVideoUploadV30RequestVideoFile videoFile) {
    
    this.videoFile = videoFile;
    return this;
  }

   /**
   * Get videoFile
   * @return videoFile
  **/
  @javax.annotation.Nonnull
  public LocalFileVideoUploadV30RequestVideoFile getVideoFile() {
    return videoFile;
  }


  public void setVideoFile(LocalFileVideoUploadV30RequestVideoFile videoFile) {
    this.videoFile = videoFile;
  }


  public LocalFileVideoUploadV30Request videoSignature(String videoSignature) {
    
    this.videoSignature = videoSignature;
    return this;
  }

   /**
   * 视频的md5值(用于服务端校验)
   * @return videoSignature
  **/
  @javax.annotation.Nonnull
  public String getVideoSignature() {
    return videoSignature;
  }


  public void setVideoSignature(String videoSignature) {
    this.videoSignature = videoSignature;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoUploadV30Request localFileVideoUploadV30Request = (LocalFileVideoUploadV30Request) o;
    return Objects.equals(this.filename, localFileVideoUploadV30Request.filename) &&
        Objects.equals(this.localAccountId, localFileVideoUploadV30Request.localAccountId) &&
        Objects.equals(this.videoFile, localFileVideoUploadV30Request.videoFile) &&
        Objects.equals(this.videoSignature, localFileVideoUploadV30Request.videoSignature);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filename, localAccountId, videoFile, videoSignature);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalFileVideoUploadV30Request {\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    videoFile: ").append(toIndentedString(videoFile)).append("\n");
    sb.append("    videoSignature: ").append(toIndentedString(videoSignature)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("local_account_id");
    openapiFields.add("video_file");
    openapiFields.add("video_signature");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("video_file");
    openapiRequiredFields.add("video_signature");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoUploadV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoUploadV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoUploadV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoUploadV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoUploadV30Request>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoUploadV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoUploadV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoUploadV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoUploadV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoUploadV30Request
  */
  public static LocalFileVideoUploadV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoUploadV30Request.class);
  }

 /**
  * Convert an instance of LocalFileVideoUploadV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

