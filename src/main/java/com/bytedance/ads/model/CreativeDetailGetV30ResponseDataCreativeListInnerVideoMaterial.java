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
import com.bytedance.ads.model.CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialVideoInfo;
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
 * 视频素材信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial {
  public static final String SERIALIZED_NAME_AWEME_ITEM_ID = "aweme_item_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ITEM_ID)
  private Long awemeItemId = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TASK_IDS = "dpa_video_task_ids";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TASK_IDS)
  private List<String> dpaVideoTaskIds = null;

  public static final String SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE = "dpa_video_template_type";
  @SerializedName(SERIALIZED_NAME_DPA_VIDEO_TEMPLATE_TYPE)
  private CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType = null;

  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialVideoInfo videoInfo = null;

  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial() {
  }

  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial awemeItemId(Long awemeItemId) {
    
    this.awemeItemId = awemeItemId;
    return this;
  }

   /**
   * 抖音短视频ID
   * @return awemeItemId
  **/
  @javax.annotation.Nullable
  public Long getAwemeItemId() {
    return awemeItemId;
  }


  public void setAwemeItemId(Long awemeItemId) {
    this.awemeItemId = awemeItemId;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial dpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    
    this.dpaVideoTaskIds = dpaVideoTaskIds;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial addDpaVideoTaskIdsItem(String dpaVideoTaskIdsItem) {
    if (this.dpaVideoTaskIds == null) {
      this.dpaVideoTaskIds = new ArrayList<>();
    }
    this.dpaVideoTaskIds.add(dpaVideoTaskIdsItem);
    return this;
  }

   /**
   * 自定义商品库视频模板ID
   * @return dpaVideoTaskIds
  **/
  @javax.annotation.Nullable
  public List<String> getDpaVideoTaskIds() {
    return dpaVideoTaskIds;
  }


  public void setDpaVideoTaskIds(List<String> dpaVideoTaskIds) {
    this.dpaVideoTaskIds = dpaVideoTaskIds;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial dpaVideoTemplateType(CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType) {
    
    this.dpaVideoTemplateType = dpaVideoTemplateType;
    return this;
  }

   /**
   * Get dpaVideoTemplateType
   * @return dpaVideoTemplateType
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType getDpaVideoTemplateType() {
    return dpaVideoTemplateType;
  }


  public void setDpaVideoTemplateType(CreativeDetailGetV30DataCreativeListVideoMaterialDpaVideoTemplateType dpaVideoTemplateType) {
    this.dpaVideoTemplateType = dpaVideoTemplateType;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial imageInfo(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial videoInfo(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterialVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial = (CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial) o;
    return Objects.equals(this.awemeItemId, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.awemeItemId) &&
        Objects.equals(this.dpaVideoTaskIds, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.dpaVideoTaskIds) &&
        Objects.equals(this.dpaVideoTemplateType, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.dpaVideoTemplateType) &&
        Objects.equals(this.imageInfo, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.imageInfo) &&
        Objects.equals(this.videoInfo, creativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeItemId, dpaVideoTaskIds, dpaVideoTemplateType, imageInfo, videoInfo);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial {\n");
    sb.append("    awemeItemId: ").append(toIndentedString(awemeItemId)).append("\n");
    sb.append("    dpaVideoTaskIds: ").append(toIndentedString(dpaVideoTaskIds)).append("\n");
    sb.append("    dpaVideoTemplateType: ").append(toIndentedString(dpaVideoTemplateType)).append("\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("dpa_video_task_ids");
    openapiFields.add("dpa_video_template_type");
    openapiFields.add("image_info");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial
  */
  public static CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

