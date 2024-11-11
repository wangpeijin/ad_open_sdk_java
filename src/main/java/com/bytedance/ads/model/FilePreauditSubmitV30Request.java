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
import com.bytedance.ads.model.FilePreauditSubmitV30MaterialChannel;
import com.bytedance.ads.model.FilePreauditSubmitV30MaterialType;
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
 * FilePreauditSubmitV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class FilePreauditSubmitV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_MATERIAL_CHANNEL = "material_channel";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CHANNEL)
  private FilePreauditSubmitV30MaterialChannel materialChannel = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FilePreauditSubmitV30MaterialType materialType = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FilePreauditSubmitV30Request() {
  }

  public FilePreauditSubmitV30Request advertiserId(Long advertiserId) {
    
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


  public FilePreauditSubmitV30Request materialChannel(FilePreauditSubmitV30MaterialChannel materialChannel) {
    
    this.materialChannel = materialChannel;
    return this;
  }

   /**
   * Get materialChannel
   * @return materialChannel
  **/
  @javax.annotation.Nonnull
  public FilePreauditSubmitV30MaterialChannel getMaterialChannel() {
    return materialChannel;
  }


  public void setMaterialChannel(FilePreauditSubmitV30MaterialChannel materialChannel) {
    this.materialChannel = materialChannel;
  }


  public FilePreauditSubmitV30Request materialType(FilePreauditSubmitV30MaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public FilePreauditSubmitV30MaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FilePreauditSubmitV30MaterialType materialType) {
    this.materialType = materialType;
  }


  public FilePreauditSubmitV30Request videoUrl(String videoUrl) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePreauditSubmitV30Request filePreauditSubmitV30Request = (FilePreauditSubmitV30Request) o;
    return Objects.equals(this.advertiserId, filePreauditSubmitV30Request.advertiserId) &&
        Objects.equals(this.materialChannel, filePreauditSubmitV30Request.materialChannel) &&
        Objects.equals(this.materialType, filePreauditSubmitV30Request.materialType) &&
        Objects.equals(this.videoUrl, filePreauditSubmitV30Request.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, materialChannel, materialType, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePreauditSubmitV30Request {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilePreauditSubmitV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilePreauditSubmitV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilePreauditSubmitV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilePreauditSubmitV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FilePreauditSubmitV30Request>() {
           @Override
           public void write(JsonWriter out, FilePreauditSubmitV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilePreauditSubmitV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilePreauditSubmitV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilePreauditSubmitV30Request
  * @throws IOException if the JSON string is invalid with respect to FilePreauditSubmitV30Request
  */
  public static FilePreauditSubmitV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilePreauditSubmitV30Request.class);
  }

 /**
  * Convert an instance of FilePreauditSubmitV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

