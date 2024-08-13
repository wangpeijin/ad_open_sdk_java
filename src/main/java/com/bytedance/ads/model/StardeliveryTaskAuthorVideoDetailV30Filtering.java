/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StardeliveryTaskAuthorVideoDetailV30Filtering {
  public static final String SERIALIZED_NAME_AWEME_IDS = "aweme_ids";
  @SerializedName(SERIALIZED_NAME_AWEME_IDS)
  private List<String> awemeIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_VIDEO_PUBLISH_END_TIME = "video_publish_end_time";
  @SerializedName(SERIALIZED_NAME_VIDEO_PUBLISH_END_TIME)
  private String videoPublishEndTime = null;

  public static final String SERIALIZED_NAME_VIDEO_PUBLISH_START_TIME = "video_publish_start_time";
  @SerializedName(SERIALIZED_NAME_VIDEO_PUBLISH_START_TIME)
  private String videoPublishStartTime = null;

  public StardeliveryTaskAuthorVideoDetailV30Filtering() {
  }

  public StardeliveryTaskAuthorVideoDetailV30Filtering awemeIds(List<String> awemeIds) {
    
    this.awemeIds = awemeIds;
    return this;
  }

  public StardeliveryTaskAuthorVideoDetailV30Filtering addAwemeIdsItem(String awemeIdsItem) {
    if (this.awemeIds == null) {
      this.awemeIds = new ArrayList<>();
    }
    this.awemeIds.add(awemeIdsItem);
    return this;
  }

   /**
   * 达人抖音号id列表
   * @return awemeIds
  **/
  @javax.annotation.Nullable
  public List<String> getAwemeIds() {
    return awemeIds;
  }


  public void setAwemeIds(List<String> awemeIds) {
    this.awemeIds = awemeIds;
  }


  public StardeliveryTaskAuthorVideoDetailV30Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public StardeliveryTaskAuthorVideoDetailV30Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 视频素材id列表
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public StardeliveryTaskAuthorVideoDetailV30Filtering videoPublishEndTime(String videoPublishEndTime) {
    
    this.videoPublishEndTime = videoPublishEndTime;
    return this;
  }

   /**
   * 视频发布时间筛选，结束时间
   * @return videoPublishEndTime
  **/
  @javax.annotation.Nullable
  public String getVideoPublishEndTime() {
    return videoPublishEndTime;
  }


  public void setVideoPublishEndTime(String videoPublishEndTime) {
    this.videoPublishEndTime = videoPublishEndTime;
  }


  public StardeliveryTaskAuthorVideoDetailV30Filtering videoPublishStartTime(String videoPublishStartTime) {
    
    this.videoPublishStartTime = videoPublishStartTime;
    return this;
  }

   /**
   * 视频发布时间筛选，开始时间
   * @return videoPublishStartTime
  **/
  @javax.annotation.Nullable
  public String getVideoPublishStartTime() {
    return videoPublishStartTime;
  }


  public void setVideoPublishStartTime(String videoPublishStartTime) {
    this.videoPublishStartTime = videoPublishStartTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskAuthorVideoDetailV30Filtering stardeliveryTaskAuthorVideoDetailV30Filtering = (StardeliveryTaskAuthorVideoDetailV30Filtering) o;
    return Objects.equals(this.awemeIds, stardeliveryTaskAuthorVideoDetailV30Filtering.awemeIds) &&
        Objects.equals(this.materialIds, stardeliveryTaskAuthorVideoDetailV30Filtering.materialIds) &&
        Objects.equals(this.videoPublishEndTime, stardeliveryTaskAuthorVideoDetailV30Filtering.videoPublishEndTime) &&
        Objects.equals(this.videoPublishStartTime, stardeliveryTaskAuthorVideoDetailV30Filtering.videoPublishStartTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awemeIds, materialIds, videoPublishEndTime, videoPublishStartTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskAuthorVideoDetailV30Filtering {\n");
    sb.append("    awemeIds: ").append(toIndentedString(awemeIds)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    videoPublishEndTime: ").append(toIndentedString(videoPublishEndTime)).append("\n");
    sb.append("    videoPublishStartTime: ").append(toIndentedString(videoPublishStartTime)).append("\n");
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
    openapiFields.add("aweme_ids");
    openapiFields.add("material_ids");
    openapiFields.add("video_publish_end_time");
    openapiFields.add("video_publish_start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskAuthorVideoDetailV30Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskAuthorVideoDetailV30Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskAuthorVideoDetailV30Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskAuthorVideoDetailV30Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskAuthorVideoDetailV30Filtering>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskAuthorVideoDetailV30Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskAuthorVideoDetailV30Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskAuthorVideoDetailV30Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskAuthorVideoDetailV30Filtering
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskAuthorVideoDetailV30Filtering
  */
  public static StardeliveryTaskAuthorVideoDetailV30Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskAuthorVideoDetailV30Filtering.class);
  }

 /**
  * Convert an instance of StardeliveryTaskAuthorVideoDetailV30Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

