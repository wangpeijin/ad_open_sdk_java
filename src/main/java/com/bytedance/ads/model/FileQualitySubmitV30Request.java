/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileQualitySubmitV30MaterialChannel;
import com.bytedance.ads.model.FileQualitySubmitV30MaterialType;
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
 * FileQualitySubmitV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class FileQualitySubmitV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_MATERIAL_CHANNEL = "material_channel";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CHANNEL)
  private FileQualitySubmitV30MaterialChannel materialChannel = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FileQualitySubmitV30MaterialType materialType = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FileQualitySubmitV30Request() {
  }

  public FileQualitySubmitV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileQualitySubmitV30Request materialChannel(FileQualitySubmitV30MaterialChannel materialChannel) {
    
    this.materialChannel = materialChannel;
    return this;
  }

   /**
   * Get materialChannel
   * @return materialChannel
  **/
  @javax.annotation.Nonnull
  public FileQualitySubmitV30MaterialChannel getMaterialChannel() {
    return materialChannel;
  }


  public void setMaterialChannel(FileQualitySubmitV30MaterialChannel materialChannel) {
    this.materialChannel = materialChannel;
  }


  public FileQualitySubmitV30Request materialType(FileQualitySubmitV30MaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public FileQualitySubmitV30MaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FileQualitySubmitV30MaterialType materialType) {
    this.materialType = materialType;
  }


  public FileQualitySubmitV30Request videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 
   * @return videoUrl
  **/
  @javax.annotation.Nonnull
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
    FileQualitySubmitV30Request fileQualitySubmitV30Request = (FileQualitySubmitV30Request) o;
    return Objects.equals(this.advertiserId, fileQualitySubmitV30Request.advertiserId) &&
        Objects.equals(this.materialChannel, fileQualitySubmitV30Request.materialChannel) &&
        Objects.equals(this.materialType, fileQualitySubmitV30Request.materialType) &&
        Objects.equals(this.videoUrl, fileQualitySubmitV30Request.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, materialChannel, materialType, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileQualitySubmitV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    materialChannel: ").append(toIndentedString(materialChannel)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
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
    openapiFields.add("material_channel");
    openapiFields.add("material_type");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("material_channel");
    openapiRequiredFields.add("material_type");
    openapiRequiredFields.add("video_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileQualitySubmitV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileQualitySubmitV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileQualitySubmitV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileQualitySubmitV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileQualitySubmitV30Request>() {
           @Override
           public void write(JsonWriter out, FileQualitySubmitV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileQualitySubmitV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileQualitySubmitV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileQualitySubmitV30Request
  * @throws IOException if the JSON string is invalid with respect to FileQualitySubmitV30Request
  */
  public static FileQualitySubmitV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileQualitySubmitV30Request.class);
  }

 /**
  * Convert an instance of FileQualitySubmitV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

