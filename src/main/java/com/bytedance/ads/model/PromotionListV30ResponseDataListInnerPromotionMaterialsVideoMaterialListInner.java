/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListIsCarryMaterial;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialOptStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialStatus;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoHpVisibility;
import com.bytedance.ads.model.PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoTemplateType;
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
 * PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner {
  public static final String SERIALIZED_NAME_GUIDE_VIDEO_ID = "guide_video_id";
  @SerializedName(SERIALIZED_NAME_GUIDE_VIDEO_ID)
  private String guideVideoId = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_IS_CARRY_MATERIAL = "is_carry_material";
  @SerializedName(SERIALIZED_NAME_IS_CARRY_MATERIAL)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListIsCarryMaterial isCarryMaterial = null;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private Long itemId = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_OPT_STATUS = "material_opt_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_OPT_STATUS)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialOptStatus materialOptStatus = null;

  public static final String SERIALIZED_NAME_MATERIAL_STATUS = "material_status";
  @SerializedName(SERIALIZED_NAME_MATERIAL_STATUS)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialStatus materialStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_COVER_ID = "video_cover_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_COVER_ID)
  private String videoCoverId = null;

  public static final String SERIALIZED_NAME_VIDEO_HP_VISIBILITY = "video_hp_visibility";
  @SerializedName(SERIALIZED_NAME_VIDEO_HP_VISIBILITY)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoHpVisibility videoHpVisibility = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public static final String SERIALIZED_NAME_VIDEO_TASK_IDS = "video_task_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_TASK_IDS)
  private List<String> videoTaskIds = null;

  public static final String SERIALIZED_NAME_VIDEO_TEMPLATE_TYPE = "video_template_type";
  @SerializedName(SERIALIZED_NAME_VIDEO_TEMPLATE_TYPE)
  private PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType = null;

  public static final String SERIALIZED_NAME_VISIBLE_END_DATE = "visible_end_date";
  @SerializedName(SERIALIZED_NAME_VISIBLE_END_DATE)
  private String visibleEndDate = null;

  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner() {
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner guideVideoId(String guideVideoId) {
    
    this.guideVideoId = guideVideoId;
    return this;
  }

   /**
   * 引导视频id
   * @return guideVideoId
  **/
  @javax.annotation.Nullable
  public String getGuideVideoId() {
    return guideVideoId;
  }


  public void setGuideVideoId(String guideVideoId) {
    this.guideVideoId = guideVideoId;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner imageMode(PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionListV30DataListPromotionMaterialsVideoMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner isCarryMaterial(PromotionListV30DataListPromotionMaterialsVideoMaterialListIsCarryMaterial isCarryMaterial) {
    
    this.isCarryMaterial = isCarryMaterial;
    return this;
  }

   /**
   * Get isCarryMaterial
   * @return isCarryMaterial
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListIsCarryMaterial getIsCarryMaterial() {
    return isCarryMaterial;
  }


  public void setIsCarryMaterial(PromotionListV30DataListPromotionMaterialsVideoMaterialListIsCarryMaterial isCarryMaterial) {
    this.isCarryMaterial = isCarryMaterial;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner itemId(Long itemId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner materialId(Long materialId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner materialOptStatus(PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialOptStatus materialOptStatus) {
    
    this.materialOptStatus = materialOptStatus;
    return this;
  }

   /**
   * Get materialOptStatus
   * @return materialOptStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialOptStatus getMaterialOptStatus() {
    return materialOptStatus;
  }


  public void setMaterialOptStatus(PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialOptStatus materialOptStatus) {
    this.materialOptStatus = materialOptStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner materialStatus(PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialStatus materialStatus) {
    
    this.materialStatus = materialStatus;
    return this;
  }

   /**
   * Get materialStatus
   * @return materialStatus
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialStatus getMaterialStatus() {
    return materialStatus;
  }


  public void setMaterialStatus(PromotionListV30DataListPromotionMaterialsVideoMaterialListMaterialStatus materialStatus) {
    this.materialStatus = materialStatus;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoCoverId(String videoCoverId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoHpVisibility(PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoHpVisibility videoHpVisibility) {
    
    this.videoHpVisibility = videoHpVisibility;
    return this;
  }

   /**
   * Get videoHpVisibility
   * @return videoHpVisibility
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoHpVisibility getVideoHpVisibility() {
    return videoHpVisibility;
  }


  public void setVideoHpVisibility(PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoHpVisibility videoHpVisibility) {
    this.videoHpVisibility = videoHpVisibility;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoId(String videoId) {
    
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoTaskIds(List<String> videoTaskIds) {
    
    this.videoTaskIds = videoTaskIds;
    return this;
  }

  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner addVideoTaskIdsItem(String videoTaskIdsItem) {
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


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner videoTemplateType(PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
    
    this.videoTemplateType = videoTemplateType;
    return this;
  }

   /**
   * Get videoTemplateType
   * @return videoTemplateType
  **/
  @javax.annotation.Nullable
  public PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoTemplateType getVideoTemplateType() {
    return videoTemplateType;
  }


  public void setVideoTemplateType(PromotionListV30DataListPromotionMaterialsVideoMaterialListVideoTemplateType videoTemplateType) {
    this.videoTemplateType = videoTemplateType;
  }


  public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner visibleEndDate(String visibleEndDate) {
    
    this.visibleEndDate = visibleEndDate;
    return this;
  }

   /**
   * 
   * @return visibleEndDate
  **/
  @javax.annotation.Nullable
  public String getVisibleEndDate() {
    return visibleEndDate;
  }


  public void setVisibleEndDate(String visibleEndDate) {
    this.visibleEndDate = visibleEndDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner = (PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner) o;
    return Objects.equals(this.guideVideoId, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.guideVideoId) &&
        Objects.equals(this.imageMode, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.imageMode) &&
        Objects.equals(this.isCarryMaterial, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.isCarryMaterial) &&
        Objects.equals(this.itemId, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.itemId) &&
        Objects.equals(this.materialId, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.materialId) &&
        Objects.equals(this.materialOptStatus, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.materialOptStatus) &&
        Objects.equals(this.materialStatus, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.materialStatus) &&
        Objects.equals(this.videoCoverId, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.videoCoverId) &&
        Objects.equals(this.videoHpVisibility, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.videoHpVisibility) &&
        Objects.equals(this.videoId, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.videoId) &&
        Objects.equals(this.videoTaskIds, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.videoTaskIds) &&
        Objects.equals(this.videoTemplateType, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.videoTemplateType) &&
        Objects.equals(this.visibleEndDate, promotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.visibleEndDate);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(guideVideoId, imageMode, isCarryMaterial, itemId, materialId, materialOptStatus, materialStatus, videoCoverId, videoHpVisibility, videoId, videoTaskIds, videoTemplateType, visibleEndDate);
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
    sb.append("class PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner {\n");
    sb.append("    guideVideoId: ").append(toIndentedString(guideVideoId)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    isCarryMaterial: ").append(toIndentedString(isCarryMaterial)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialOptStatus: ").append(toIndentedString(materialOptStatus)).append("\n");
    sb.append("    materialStatus: ").append(toIndentedString(materialStatus)).append("\n");
    sb.append("    videoCoverId: ").append(toIndentedString(videoCoverId)).append("\n");
    sb.append("    videoHpVisibility: ").append(toIndentedString(videoHpVisibility)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
    sb.append("    videoTaskIds: ").append(toIndentedString(videoTaskIds)).append("\n");
    sb.append("    videoTemplateType: ").append(toIndentedString(videoTemplateType)).append("\n");
    sb.append("    visibleEndDate: ").append(toIndentedString(visibleEndDate)).append("\n");
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
    openapiFields.add("guide_video_id");
    openapiFields.add("image_mode");
    openapiFields.add("is_carry_material");
    openapiFields.add("item_id");
    openapiFields.add("material_id");
    openapiFields.add("material_opt_status");
    openapiFields.add("material_status");
    openapiFields.add("video_cover_id");
    openapiFields.add("video_hp_visibility");
    openapiFields.add("video_id");
    openapiFields.add("video_task_ids");
    openapiFields.add("video_template_type");
    openapiFields.add("visible_end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner>() {
           @Override
           public void write(JsonWriter out, PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner
  */
  public static PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner.class);
  }

 /**
  * Convert an instance of PromotionListV30ResponseDataListInnerPromotionMaterialsVideoMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

