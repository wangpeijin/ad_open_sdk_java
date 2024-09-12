/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.RecommendVideoListV30DataRecommendVideoListImageMode;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * RecommendVideoListV30ResponseDataRecommendVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class RecommendVideoListV30ResponseDataRecommendVideoListInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private List<String> awemeId = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private RecommendVideoListV30DataRecommendVideoListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_URL = "video_cover_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_URL)
  private String videoCoverUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_URL = "video_play_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_URL)
  private String videoPlayUrl = null;

  public RecommendVideoListV30ResponseDataRecommendVideoListInner() {
  }

  public RecommendVideoListV30ResponseDataRecommendVideoListInner awemeId(List<String> awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

  public RecommendVideoListV30ResponseDataRecommendVideoListInner addAwemeIdItem(String awemeIdItem) {
    if (this.awemeId == null) {
      this.awemeId = new ArrayList<>();
    }
    this.awemeId.add(awemeIdItem);
    return this;
  }

   /**
   * 
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(List<String> awemeId) {
    this.awemeId = awemeId;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner imageMode(RecommendVideoListV30DataRecommendVideoListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public RecommendVideoListV30DataRecommendVideoListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(RecommendVideoListV30DataRecommendVideoListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner itemId(Long itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 
   * @return itemId
  **/
  @javax.annotation.Nullable
  public Long getItemId() {
    return itemId;
  }


  public void setItemId(Long itemId) {
    this.itemId = itemId;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner materialId(Long materialId) {
    
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


  public RecommendVideoListV30ResponseDataRecommendVideoListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner videoCoverId(String videoCoverId) {
    
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


  public RecommendVideoListV30ResponseDataRecommendVideoListInner videoCoverUrl(String videoCoverUrl) {
    
    this.videoCoverUrl = videoCoverUrl;
    return this;
  }

   /**
   * 
   * @return videoCoverUrl
  **/
  @javax.annotation.Nullable
  public String getVideoCoverUrl() {
    return videoCoverUrl;
  }


  public void setVideoCoverUrl(String videoCoverUrl) {
    this.videoCoverUrl = videoCoverUrl;
  }


  public RecommendVideoListV30ResponseDataRecommendVideoListInner videoId(String videoId) {
    
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


  public RecommendVideoListV30ResponseDataRecommendVideoListInner videoPlayUrl(String videoPlayUrl) {
    
    this.videoPlayUrl = videoPlayUrl;
    return this;
  }

   /**
   * 
   * @return videoPlayUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayUrl() {
    return videoPlayUrl;
  }


  public void setVideoPlayUrl(String videoPlayUrl) {
    this.videoPlayUrl = videoPlayUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecommendVideoListV30ResponseDataRecommendVideoListInner recommendVideoListV30ResponseDataRecommendVideoListInner = (RecommendVideoListV30ResponseDataRecommendVideoListInner) o;
    return Objects.equals(this.awemeId, recommendVideoListV30ResponseDataRecommendVideoListInner.awemeId) &&
        Objects.equals(this.duration, recommendVideoListV30ResponseDataRecommendVideoListInner.duration) &&
        Objects.equals(this.imageMode, recommendVideoListV30ResponseDataRecommendVideoListInner.imageMode) &&
        Objects.equals(this.itemId, recommendVideoListV30ResponseDataRecommendVideoListInner.itemId) &&
        Objects.equals(this.materialId, recommendVideoListV30ResponseDataRecommendVideoListInner.materialId) &&
        Objects.equals(this.title, recommendVideoListV30ResponseDataRecommendVideoListInner.title) &&
        Objects.equals(this.videoCoverId, recommendVideoListV30ResponseDataRecommendVideoListInner.videoCoverId) &&
        Objects.equals(this.videoCoverUrl, recommendVideoListV30ResponseDataRecommendVideoListInner.videoCoverUrl) &&
        Objects.equals(this.videoId, recommendVideoListV30ResponseDataRecommendVideoListInner.videoId) &&
        Objects.equals(this.videoPlayUrl, recommendVideoListV30ResponseDataRecommendVideoListInner.videoPlayUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, duration, imageMode, itemId, materialId, title, videoCoverId, videoCoverUrl, videoId, videoPlayUrl);
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
    sb.append("class RecommendVideoListV30ResponseDataRecommendVideoListInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoPlayUrl: ").append(toIndentedString(videoPlayUrl)).append("\n");
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
    openapiFields.add("aweme_id");
    openapiFields.add("duration");
    openapiFields.add("image_mode");
    openapiFields.add("item_id");
    openapiFields.add("material_id");
    openapiFields.add("title");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_cover_url");
    openapiFields.add("video_id");
    openapiFields.add("video_play_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecommendVideoListV30ResponseDataRecommendVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecommendVideoListV30ResponseDataRecommendVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecommendVideoListV30ResponseDataRecommendVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecommendVideoListV30ResponseDataRecommendVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<RecommendVideoListV30ResponseDataRecommendVideoListInner>() {
           @Override
           public void write(JsonWriter out, RecommendVideoListV30ResponseDataRecommendVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecommendVideoListV30ResponseDataRecommendVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecommendVideoListV30ResponseDataRecommendVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecommendVideoListV30ResponseDataRecommendVideoListInner
  * @throws IOException if the JSON string is invalid with respect to RecommendVideoListV30ResponseDataRecommendVideoListInner
  */
  public static RecommendVideoListV30ResponseDataRecommendVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecommendVideoListV30ResponseDataRecommendVideoListInner.class);
  }

 /**
  * Convert an instance of RecommendVideoListV30ResponseDataRecommendVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

