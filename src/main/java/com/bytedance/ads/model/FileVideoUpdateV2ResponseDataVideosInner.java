/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileVideoUpdateV2DataVideosStatusCode;
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
 * FileVideoUpdateV2ResponseDataVideosInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class FileVideoUpdateV2ResponseDataVideosInner {
  public static final String SERIALIZED_NAME_STATUS_CODE = "status_code";
  @SerializedName(SERIALIZED_NAME_STATUS_CODE)
  private FileVideoUpdateV2DataVideosStatusCode statusCode = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public FileVideoUpdateV2ResponseDataVideosInner() {
  }

  public FileVideoUpdateV2ResponseDataVideosInner statusCode(FileVideoUpdateV2DataVideosStatusCode statusCode) {
    
    this.statusCode = statusCode;
    return this;
  }

   /**
   * Get statusCode
   * @return statusCode
  **/
  @javax.annotation.Nullable
  public FileVideoUpdateV2DataVideosStatusCode getStatusCode() {
    return statusCode;
  }


  public void setStatusCode(FileVideoUpdateV2DataVideosStatusCode statusCode) {
    this.statusCode = statusCode;
  }


  public FileVideoUpdateV2ResponseDataVideosInner videoId(String videoId) {
    
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
    FileVideoUpdateV2ResponseDataVideosInner fileVideoUpdateV2ResponseDataVideosInner = (FileVideoUpdateV2ResponseDataVideosInner) o;
    return Objects.equals(this.statusCode, fileVideoUpdateV2ResponseDataVideosInner.statusCode) &&
        Objects.equals(this.videoId, fileVideoUpdateV2ResponseDataVideosInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statusCode, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoUpdateV2ResponseDataVideosInner {\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
    openapiFields.add("status_code");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoUpdateV2ResponseDataVideosInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoUpdateV2ResponseDataVideosInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoUpdateV2ResponseDataVideosInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoUpdateV2ResponseDataVideosInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoUpdateV2ResponseDataVideosInner>() {
           @Override
           public void write(JsonWriter out, FileVideoUpdateV2ResponseDataVideosInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoUpdateV2ResponseDataVideosInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoUpdateV2ResponseDataVideosInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoUpdateV2ResponseDataVideosInner
  * @throws IOException if the JSON string is invalid with respect to FileVideoUpdateV2ResponseDataVideosInner
  */
  public static FileVideoUpdateV2ResponseDataVideosInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoUpdateV2ResponseDataVideosInner.class);
  }

 /**
  * Convert an instance of FileVideoUpdateV2ResponseDataVideosInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

