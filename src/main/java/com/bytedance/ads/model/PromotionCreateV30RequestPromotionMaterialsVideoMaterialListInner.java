/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 0.0.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsVideoMaterialListImageMode;
import com.bytedance.ads.model.PromotionCreateV30PromotionMaterialsVideoMaterialListVideoTemplateType;
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
 * PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-08-01T18:09:26.254+08:00[Asia/Shanghai]")
public class PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionCreateV30PromotionMaterialsVideoMaterialListImageMode imageMode = null;

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
  private PromotionCreateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType = null;

  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner() {
  }

  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner imageMode(PromotionCreateV30PromotionMaterialsVideoMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nonnull
  public PromotionCreateV30PromotionMaterialsVideoMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionCreateV30PromotionMaterialsVideoMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner itemId(Long itemId) {
    
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


  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner videoCoverId(String videoCoverId) {
    
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


  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner videoId(String videoId) {
    
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


  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner videoTaskIds(List<String> videoTaskIds) {
    
    this.videoTaskIds = videoTaskIds;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner addVideoTaskIdsItem(String videoTaskIdsItem) {
    if (this.videoTaskIds == null) {
      this.videoTaskIds = new ArrayList<>();
    }
    this.videoTaskIds.add(videoTaskIdsItem);
    return this;
  }

   /**
   * 自定义商品库视频模板ID，创建DPA创意时可传入，传入后该素材下image_info与video_info不生效，长度限制1，从【获取 DPA 商品库视频模板】接口中获取
   * @return videoTaskIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoTaskIds() {
    return videoTaskIds;
  }


  public void setVideoTaskIds(List<String> videoTaskIds) {
    this.videoTaskIds = videoTaskIds;
  }


  public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner videoTemplateType(PromotionCreateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
    
    this.videoTemplateType = videoTemplateType;
    return this;
  }

   /**
   * Get videoTemplateType
   * @return videoTemplateType
  **/
  @javax.annotation.Nullable
  public PromotionCreateV30PromotionMaterialsVideoMaterialListVideoTemplateType getVideoTemplateType() {
    return videoTemplateType;
  }


  public void setVideoTemplateType(PromotionCreateV30PromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
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
    PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner = (PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner) o;
    return Objects.equals(this.imageMode, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.imageMode) &&
        Objects.equals(this.itemId, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.itemId) &&
        Objects.equals(this.videoCoverId, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.videoCoverId) &&
        Objects.equals(this.videoId, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.videoId) &&
        Objects.equals(this.videoTaskIds, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.videoTaskIds) &&
        Objects.equals(this.videoTemplateType, promotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.videoTemplateType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, itemId, videoCoverId, videoId, videoTaskIds, videoTemplateType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner {\n");
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
       if (!PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner
  */
  public static PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestPromotionMaterialsVideoMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

