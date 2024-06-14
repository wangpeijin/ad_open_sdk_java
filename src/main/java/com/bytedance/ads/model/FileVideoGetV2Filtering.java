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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class FileVideoGetV2Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private List<String> labels = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private List<Double> ratio = null;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<String> signatures = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private List<String> source = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_VIDEO_IDS = "video_ids";
  @SerializedName(SERIALIZED_NAME_VIDEO_IDS)
  private List<String> videoIds = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public FileVideoGetV2Filtering() {
  }

  public FileVideoGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据视频上传时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileVideoGetV2Filtering height(Long height) {
    
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


  public FileVideoGetV2Filtering labels(List<String> labels) {
    
    this.labels = labels;
    return this;
  }

  public FileVideoGetV2Filtering addLabelsItem(String labelsItem) {
    if (this.labels == null) {
      this.labels = new ArrayList<>();
    }
    this.labels.add(labelsItem);
    return this;
  }

   /**
   * 
   * @return labels
  **/
  @javax.annotation.Nullable
  public List<String> getLabels() {
    return labels;
  }


  public void setLabels(List<String> labels) {
    this.labels = labels;
  }


  public FileVideoGetV2Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileVideoGetV2Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileVideoGetV2Filtering ratio(List<Double> ratio) {
    
    this.ratio = ratio;
    return this;
  }

  public FileVideoGetV2Filtering addRatioItem(Double ratioItem) {
    if (this.ratio == null) {
      this.ratio = new ArrayList<>();
    }
    this.ratio.add(ratioItem);
    return this;
  }

   /**
   * 视频宽高比，示例: [1.7, 2.5] 输入1.7则搜索满足宽高比介于1.65-1.75之间的视频，即精度上下浮动0.05
   * @return ratio
  **/
  @javax.annotation.Nullable
  public List<Double> getRatio() {
    return ratio;
  }


  public void setRatio(List<Double> ratio) {
    this.ratio = ratio;
  }


  public FileVideoGetV2Filtering signatures(List<String> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public FileVideoGetV2Filtering addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * md5值列表，可以根据素材的md5进行过滤 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return signatures
  **/
  @javax.annotation.Nullable
  public List<String> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }


  public FileVideoGetV2Filtering source(List<String> source) {
    
    this.source = source;
    return this;
  }

  public FileVideoGetV2Filtering addSourceItem(String sourceItem) {
    if (this.source == null) {
      this.source = new ArrayList<>();
    }
    this.source.add(sourceItem);
    return this;
  }

   /**
   * 素材来源枚举 https://open.oceanengine.com/labels/7/docs/1696710760171535
   * @return source
  **/
  @javax.annotation.Nullable
  public List<String> getSource() {
    return source;
  }


  public void setSource(List<String> source) {
    this.source = source;
  }


  public FileVideoGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据视频上传时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public FileVideoGetV2Filtering videoIds(List<String> videoIds) {
    
    this.videoIds = videoIds;
    return this;
  }

  public FileVideoGetV2Filtering addVideoIdsItem(String videoIdsItem) {
    if (this.videoIds == null) {
      this.videoIds = new ArrayList<>();
    }
    this.videoIds.add(videoIdsItem);
    return this;
  }

   /**
   * 视频ids，示例: [\&quot;86adb23eaa21229fc04ef932b5089bb8\&quot;] 数量限制：&lt;&#x3D;100 注意：video_ids、material_ids、signatures只能选择一个进行过滤
   * @return videoIds
  **/
  @javax.annotation.Nullable
  public List<String> getVideoIds() {
    return videoIds;
  }


  public void setVideoIds(List<String> videoIds) {
    this.videoIds = videoIds;
  }


  public FileVideoGetV2Filtering width(Long width) {
    
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
    FileVideoGetV2Filtering fileVideoGetV2Filtering = (FileVideoGetV2Filtering) o;
    return Objects.equals(this.endTime, fileVideoGetV2Filtering.endTime) &&
        Objects.equals(this.height, fileVideoGetV2Filtering.height) &&
        Objects.equals(this.labels, fileVideoGetV2Filtering.labels) &&
        Objects.equals(this.materialIds, fileVideoGetV2Filtering.materialIds) &&
        Objects.equals(this.ratio, fileVideoGetV2Filtering.ratio) &&
        Objects.equals(this.signatures, fileVideoGetV2Filtering.signatures) &&
        Objects.equals(this.source, fileVideoGetV2Filtering.source) &&
        Objects.equals(this.startTime, fileVideoGetV2Filtering.startTime) &&
        Objects.equals(this.videoIds, fileVideoGetV2Filtering.videoIds) &&
        Objects.equals(this.width, fileVideoGetV2Filtering.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, height, labels, materialIds, ratio, signatures, source, startTime, videoIds, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileVideoGetV2Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    videoIds: ").append(toIndentedString(videoIds)).append("\n");
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
    openapiFields.add("end_time");
    openapiFields.add("height");
    openapiFields.add("labels");
    openapiFields.add("material_ids");
    openapiFields.add("ratio");
    openapiFields.add("signatures");
    openapiFields.add("source");
    openapiFields.add("start_time");
    openapiFields.add("video_ids");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileVideoGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileVideoGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileVideoGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileVideoGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileVideoGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileVideoGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileVideoGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileVideoGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileVideoGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileVideoGetV2Filtering
  */
  public static FileVideoGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileVideoGetV2Filtering.class);
  }

 /**
  * Convert an instance of FileVideoGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

