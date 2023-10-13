/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode;
import com.bytedance.ads.model.PromotionUpdateV30PromotionMaterialsVideoMaterialListVideoTemplateType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
 * PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_TASK_IDS = "video_task_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_TASK_IDS)
  private List<String> videoTaskIds = null;

  public static final String SERIALIZED_NAME_VIDEO_TEMPLATE_TYPE = "video_template_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TEMPLATE_TYPE)
  private PromotionUpdateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType = null;

  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner imageMode(PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionUpdateV30PromotionMaterialsVideoMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner itemId(Long itemId) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner videoCoverId(String videoCoverId) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner videoId(String videoId) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner videoTaskIds(List<String> videoTaskIds) {
    
    this.videoTaskIds = videoTaskIds;
    return this;
  }

  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner addVideoTaskIdsItem(String videoTaskIdsItem) {
    if (this.videoTaskIds == null) {
      this.videoTaskIds = new ArrayList<>();
    }
    this.videoTaskIds.add(videoTaskIdsItem);
    return this;
  }

   /**
   * 
   * @return videoTaskIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoTaskIds() {
    return videoTaskIds;
  }


  public void setVideoTaskIds(List<String> videoTaskIds) {
    this.videoTaskIds = videoTaskIds;
  }


  public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner videoTemplateType(PromotionUpdateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
    
    this.videoTemplateType = videoTemplateType;
    return this;
  }

   /**
   * Get videoTemplateType
   * @return videoTemplateType
  **/
  @javax.annotation.Nullable
  public PromotionUpdateV30PromotionMaterialsVideoMaterialListVideoTemplateType getVideoTemplateType() {
    return videoTemplateType;
  }


  public void setVideoTemplateType(PromotionUpdateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
    this.videoTemplateType = videoTemplateType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner = (PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner) o;
    return Objects.equals(this.imageMode, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.imageMode) &&
        Objects.equals(this.itemId, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.itemId) &&
        Objects.equals(this.videoCoverId, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.videoCoverId) &&
        Objects.equals(this.videoId, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.videoId) &&
        Objects.equals(this.videoTaskIds, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.videoTaskIds) &&
        Objects.equals(this.videoTemplateType, promotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.videoTemplateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, itemId, videoCoverId, videoId, videoTaskIds, videoTemplateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoTaskIds: ").append(toIndentedString(videoTaskIds)).append("\n");
    sb.append("    videoTemplateType: ").append(toIndentedString(videoTemplateType)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("item_id");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_id");
    openapiFields.add("video_task_ids");
    openapiFields.add("video_template_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("image_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner
  */
  public static PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsVideoMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

