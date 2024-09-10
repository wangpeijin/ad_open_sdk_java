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
import java.io.File;
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
 * BrandFileVideoUploadV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class BrandFileVideoUploadV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_VIDEO_FILE = "video_file";
  @SerializedName(SERIALIZED_NAME_VIDEO_FILE)
  private File videoFile = null;

  public BrandFileVideoUploadV30Request() {
  }

  public BrandFileVideoUploadV30Request advertiserId(Long advertiserId) {
    
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


  public BrandFileVideoUploadV30Request videoFile(File videoFile) {
    
    this.videoFile = videoFile;
    return this;
  }

   /**
   * 视频文件
   * @return videoFile
  **/
  @javax.annotation.Nonnull
  public File getVideoFile() {
    return videoFile;
  }


  public void setVideoFile(File videoFile) {
    this.videoFile = videoFile;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BrandFileVideoUploadV30Request brandFileVideoUploadV30Request = (BrandFileVideoUploadV30Request) o;
    return Objects.equals(this.advertiserId, brandFileVideoUploadV30Request.advertiserId) &&
        Objects.equals(this.videoFile, brandFileVideoUploadV30Request.videoFile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, videoFile);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BrandFileVideoUploadV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    videoFile: ").append(toIndentedString(videoFile)).append("\n");
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
    openapiFields.add("video_file");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("video_file");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BrandFileVideoUploadV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BrandFileVideoUploadV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BrandFileVideoUploadV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BrandFileVideoUploadV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<BrandFileVideoUploadV30Request>() {
           @Override
           public void write(JsonWriter out, BrandFileVideoUploadV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BrandFileVideoUploadV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BrandFileVideoUploadV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BrandFileVideoUploadV30Request
  * @throws IOException if the JSON string is invalid with respect to BrandFileVideoUploadV30Request
  */
  public static BrandFileVideoUploadV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BrandFileVideoUploadV30Request.class);
  }

 /**
  * Convert an instance of BrandFileVideoUploadV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

