/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Long id = null;

  public static final String SERIALIZED_NAME_IS_AUTO_GENERATE = "is_auto_generate";
  @SerializedName(SERIALIZED_NAME_IS_AUTO_GENERATE)
  private Long isAutoGenerate = null;

  public static final String SERIALIZED_NAME_POSTER_URL = "poster_url";
  @SerializedName(SERIALIZED_NAME_POSTER_URL)
  private String posterUrl = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial() {
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial id(Long id) {
    
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @javax.annotation.Nullable
  public Long getId() {
    return id;
  }


  public void setId(Long id) {
    this.id = id;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial isAutoGenerate(Long isAutoGenerate) {
    
    this.isAutoGenerate = isAutoGenerate;
    return this;
  }

   /**
   * 
   * @return isAutoGenerate
  **/
  @javax.annotation.Nullable
  public Long getIsAutoGenerate() {
    return isAutoGenerate;
  }


  public void setIsAutoGenerate(Long isAutoGenerate) {
    this.isAutoGenerate = isAutoGenerate;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial posterUrl(String posterUrl) {
    
    this.posterUrl = posterUrl;
    return this;
  }

   /**
   * 
   * @return posterUrl
  **/
  @javax.annotation.Nullable
  public String getPosterUrl() {
    return posterUrl;
  }


  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial videoCoverId(String videoCoverId) {
    
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


  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial videoId(String videoId) {
    
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
    QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial = (QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial) o;
    return Objects.equals(this.awemeItemId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.awemeItemId) &&
        Objects.equals(this.id, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.id) &&
        Objects.equals(this.isAutoGenerate, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.isAutoGenerate) &&
        Objects.equals(this.posterUrl, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.posterUrl) &&
        Objects.equals(this.url, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.url) &&
        Objects.equals(this.videoCoverId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.videoCoverId) &&
        Objects.equals(this.videoId, qianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, id, isAutoGenerate, posterUrl, url, videoCoverId, videoId);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isAutoGenerate: ").append(toIndentedString(isAutoGenerate)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("is_auto_generate");
    openapiFields.add("poster_url");
    openapiFields.add("url");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial
  */
  public static QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

