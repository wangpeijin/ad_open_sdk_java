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
import com.bytedance.ads.model.QianchuanUniAwemeAdUpdateV10ProgrammaticCreativeMediaListVideoMaterialImageMode;
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
 * QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanUniAwemeAdUpdateV10ProgrammaticCreativeMediaListVideoMaterialImageMode imageMode = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner() {
  }

  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner imageMode(QianchuanUniAwemeAdUpdateV10ProgrammaticCreativeMediaListVideoMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanUniAwemeAdUpdateV10ProgrammaticCreativeMediaListVideoMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanUniAwemeAdUpdateV10ProgrammaticCreativeMediaListVideoMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner videoCoverId(String videoCoverId) {
    
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


  public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner videoId(String videoId) {
    
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
    QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner = (QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner) o;
    return Objects.equals(this.awemeItemId, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.awemeItemId) &&
        Objects.equals(this.imageMode, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.imageMode) &&
        Objects.equals(this.videoCoverId, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.videoCoverId) &&
        Objects.equals(this.videoId, qianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, imageMode, videoCoverId, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("aweme_item_id");
    openapiFields.add("image_mode");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner>() {
           @Override
           public void write(JsonWriter out, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner
  */
  public static QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner.class);
  }

 /**
  * Convert an instance of QianchuanUniAwemeAdUpdateV10RequestProgrammaticCreativeMediaListVideoMaterialInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

