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
import com.bytedance.ads.model.LocalFileVideoAwemeGetV30DataVideoListImageMode;
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
 * LocalFileVideoAwemeGetV30ResponseDataVideoListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class LocalFileVideoAwemeGetV30ResponseDataVideoListInner {
  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_VIDEO_URL = "aweme_video_url";
  @SerializedName(SERIALIZED_NAME_AWEME_VIDEO_URL)
  private String awemeVideoUrl = null;

  public static final String SERIALIZED_NAME_CAN_DELIVERY = "can_delivery";
  @SerializedName(SERIALIZED_NAME_CAN_DELIVERY)
  private Boolean canDelivery = null;

  public static final String SERIALIZED_NAME_COVER_IMAGE_URL = "cover_image_url";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE_URL)
  private String coverImageUrl = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private String duration = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private LocalFileVideoAwemeGetV30DataVideoListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId = null;

  public static final String SERIALIZED_NAME_LEGO_MATERIAL_ID = "lego_material_id";
  @SerializedName(SERIALIZED_NAME_LEGO_MATERIAL_ID)
  private Long legoMaterialId = null;

  public static final String SERIALIZED_NAME_NOT_DELIVERY_REASON = "not_delivery_reason";
  @SerializedName(SERIALIZED_NAME_NOT_DELIVERY_REASON)
  private List<String> notDeliveryReason = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_HEIGH = "video_heigh";
  @SerializedName(SERIALIZED_NAME_VIDEO_HEIGH)
  private Long videoHeigh = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_WIDTH = "video_width";
  @SerializedName(SERIALIZED_NAME_VIDEO_WIDTH)
  private Long videoWidth = null;

  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner() {
  }

  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号id
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner awemeVideoUrl(String awemeVideoUrl) {
    
    this.awemeVideoUrl = awemeVideoUrl;
    return this;
  }

   /**
   * 视频播放地址
   * @return awemeVideoUrl
  **/
  @javax.annotation.Nullable
  public String getAwemeVideoUrl() {
    return awemeVideoUrl;
  }


  public void setAwemeVideoUrl(String awemeVideoUrl) {
    this.awemeVideoUrl = awemeVideoUrl;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner canDelivery(Boolean canDelivery) {
    
    this.canDelivery = canDelivery;
    return this;
  }

   /**
   * 是否可投放
   * @return canDelivery
  **/
  @javax.annotation.Nullable
  public Boolean getCanDelivery() {
    return canDelivery;
  }


  public void setCanDelivery(Boolean canDelivery) {
    this.canDelivery = canDelivery;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner coverImageUrl(String coverImageUrl) {
    
    this.coverImageUrl = coverImageUrl;
    return this;
  }

   /**
   * 视频封面图片地址
   * @return coverImageUrl
  **/
  @javax.annotation.Nullable
  public String getCoverImageUrl() {
    return coverImageUrl;
  }


  public void setCoverImageUrl(String coverImageUrl) {
    this.coverImageUrl = coverImageUrl;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner duration(String duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 时长
   * @return duration
  **/
  @javax.annotation.Nullable
  public String getDuration() {
    return duration;
  }


  public void setDuration(String duration) {
    this.duration = duration;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner imageMode(LocalFileVideoAwemeGetV30DataVideoListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public LocalFileVideoAwemeGetV30DataVideoListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(LocalFileVideoAwemeGetV30DataVideoListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 抖音视频ID
   * @return itemId
  **/
  @javax.annotation.Nullable
  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner legoMaterialId(Long legoMaterialId) {
    
    this.legoMaterialId = legoMaterialId;
    return this;
  }

   /**
   * 
   * @return legoMaterialId
  **/
  @javax.annotation.Nullable
  public Long getLegoMaterialId() {
    return legoMaterialId;
  }


  public void setLegoMaterialId(Long legoMaterialId) {
    this.legoMaterialId = legoMaterialId;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner notDeliveryReason(List<String> notDeliveryReason) {
    
    this.notDeliveryReason = notDeliveryReason;
    return this;
  }

  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner addNotDeliveryReasonItem(String notDeliveryReasonItem) {
    if (this.notDeliveryReason == null) {
      this.notDeliveryReason = new ArrayList<>();
    }
    this.notDeliveryReason.add(notDeliveryReasonItem);
    return this;
  }

   /**
   * 不可投放原因
   * @return notDeliveryReason
  **/
  @javax.annotation.Nullable
  public List<String> getNotDeliveryReason() {
    return notDeliveryReason;
  }


  public void setNotDeliveryReason(List<String> notDeliveryReason) {
    this.notDeliveryReason = notDeliveryReason;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 视频标题
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner videoHeigh(Long videoHeigh) {
    
    this.videoHeigh = videoHeigh;
    return this;
  }

   /**
   * 
   * @return videoHeigh
  **/
  @javax.annotation.Nullable
  public Long getVideoHeigh() {
    return videoHeigh;
  }


  public void setVideoHeigh(Long videoHeigh) {
    this.videoHeigh = videoHeigh;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频ID
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }


  public LocalFileVideoAwemeGetV30ResponseDataVideoListInner videoWidth(Long videoWidth) {
    
    this.videoWidth = videoWidth;
    return this;
  }

   /**
   * 
   * @return videoWidth
  **/
  @javax.annotation.Nullable
  public Long getVideoWidth() {
    return videoWidth;
  }


  public void setVideoWidth(Long videoWidth) {
    this.videoWidth = videoWidth;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalFileVideoAwemeGetV30ResponseDataVideoListInner localFileVideoAwemeGetV30ResponseDataVideoListInner = (LocalFileVideoAwemeGetV30ResponseDataVideoListInner) o;
    return Objects.equals(this.awemeId, localFileVideoAwemeGetV30ResponseDataVideoListInner.awemeId) &&
        Objects.equals(this.awemeVideoUrl, localFileVideoAwemeGetV30ResponseDataVideoListInner.awemeVideoUrl) &&
        Objects.equals(this.canDelivery, localFileVideoAwemeGetV30ResponseDataVideoListInner.canDelivery) &&
        Objects.equals(this.coverImageUrl, localFileVideoAwemeGetV30ResponseDataVideoListInner.coverImageUrl) &&
        Objects.equals(this.duration, localFileVideoAwemeGetV30ResponseDataVideoListInner.duration) &&
        Objects.equals(this.imageMode, localFileVideoAwemeGetV30ResponseDataVideoListInner.imageMode) &&
        Objects.equals(this.itemId, localFileVideoAwemeGetV30ResponseDataVideoListInner.itemId) &&
        Objects.equals(this.legoMaterialId, localFileVideoAwemeGetV30ResponseDataVideoListInner.legoMaterialId) &&
        Objects.equals(this.notDeliveryReason, localFileVideoAwemeGetV30ResponseDataVideoListInner.notDeliveryReason) &&
        Objects.equals(this.title, localFileVideoAwemeGetV30ResponseDataVideoListInner.title) &&
        Objects.equals(this.videoHeigh, localFileVideoAwemeGetV30ResponseDataVideoListInner.videoHeigh) &&
        Objects.equals(this.videoId, localFileVideoAwemeGetV30ResponseDataVideoListInner.videoId) &&
        Objects.equals(this.videoWidth, localFileVideoAwemeGetV30ResponseDataVideoListInner.videoWidth);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeId, awemeVideoUrl, canDelivery, coverImageUrl, duration, imageMode, itemId, legoMaterialId, notDeliveryReason, title, videoHeigh, videoId, videoWidth);
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
    sb.append("class LocalFileVideoAwemeGetV30ResponseDataVideoListInner {\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeVideoUrl: ").append(toIndentedString(awemeVideoUrl)).append("\n");
    sb.append("    canDelivery: ").append(toIndentedString(canDelivery)).append("\n");
    sb.append("    coverImageUrl: ").append(toIndentedString(coverImageUrl)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    legoMaterialId: ").append(toIndentedString(legoMaterialId)).append("\n");
    sb.append("    notDeliveryReason: ").append(toIndentedString(notDeliveryReason)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoHeigh: ").append(toIndentedString(videoHeigh)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoWidth: ").append(toIndentedString(videoWidth)).append("\n");
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
    openapiFields.add("aweme_video_url");
    openapiFields.add("can_delivery");
    openapiFields.add("cover_image_url");
    openapiFields.add("duration");
    openapiFields.add("image_mode");
    openapiFields.add("item_id");
    openapiFields.add("lego_material_id");
    openapiFields.add("not_delivery_reason");
    openapiFields.add("title");
    openapiFields.add("video_heigh");
    openapiFields.add("video_id");
    openapiFields.add("video_width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("duration");
    openapiRequiredFields.add("image_mode");
    openapiRequiredFields.add("item_id");
    openapiRequiredFields.add("title");
    openapiRequiredFields.add("video_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalFileVideoAwemeGetV30ResponseDataVideoListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalFileVideoAwemeGetV30ResponseDataVideoListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalFileVideoAwemeGetV30ResponseDataVideoListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalFileVideoAwemeGetV30ResponseDataVideoListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalFileVideoAwemeGetV30ResponseDataVideoListInner>() {
           @Override
           public void write(JsonWriter out, LocalFileVideoAwemeGetV30ResponseDataVideoListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalFileVideoAwemeGetV30ResponseDataVideoListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalFileVideoAwemeGetV30ResponseDataVideoListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalFileVideoAwemeGetV30ResponseDataVideoListInner
  * @throws IOException if the JSON string is invalid with respect to LocalFileVideoAwemeGetV30ResponseDataVideoListInner
  */
  public static LocalFileVideoAwemeGetV30ResponseDataVideoListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalFileVideoAwemeGetV30ResponseDataVideoListInner.class);
  }

 /**
  * Convert an instance of LocalFileVideoAwemeGetV30ResponseDataVideoListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

