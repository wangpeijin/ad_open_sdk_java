/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.26
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
 * 视频信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-21T12:43:29.972092701+08:00[Asia/Shanghai]")
public class AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo {
  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Double duration = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private Double ratio = null;

  public static final String SERIALIZED_NAME_SIGNATURE = "signature";
  @SerializedName(SERIALIZED_NAME_SIGNATURE)
  private String signature = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo() {
  }

  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo duration(Double duration) {
    
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


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo height(Long height) {
    
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


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo ratio(Double ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * 视频宽高比
   * @return ratio
  **/
  @javax.annotation.Nullable
  public Double getRatio() {
    return ratio;
  }


  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo signature(String signature) {
    
    this.signature = signature;
    return this;
  }

   /**
   * 视频md5值
   * @return signature
  **/
  @javax.annotation.Nullable
  public String getSignature() {
    return signature;
  }


  public void setSignature(String signature) {
    this.signature = signature;
  }


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID，可以调用推送的 MAPI 推送到对应的广告账号。
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 视频预览链接，可利用此链接下载视频
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }


  public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo width(Long width) {
    
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
    AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo = (AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo) o;
    return Objects.equals(this.duration, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.duration) &&
        Objects.equals(this.height, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.height) &&
        Objects.equals(this.ratio, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.ratio) &&
        Objects.equals(this.signature, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.signature) &&
        Objects.equals(this.videoId, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.videoId) &&
        Objects.equals(this.videoUrl, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.videoUrl) &&
        Objects.equals(this.width, aicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(duration, height, ratio, signature, videoId, videoUrl, width);
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
    sb.append("class AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo {\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("ratio");
    openapiFields.add("signature");
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
       if (!AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo>() {
           @Override
           public void write(JsonWriter out, AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo
  * @throws IOException if the JSON string is invalid with respect to AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo
  */
  public static AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo.class);
  }

 /**
  * Convert an instance of AicMaterialGetV30ResponseDataMaterialsInnerVideoInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
