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
public class FileImageGetV2Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Double height = null;

  public static final String SERIALIZED_NAME_IMAGE_IDS = "image_ids";
  @SerializedName(SERIALIZED_NAME_IMAGE_IDS)
  private List<String> imageIds = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private List<Double> ratio = null;

  public static final String SERIALIZED_NAME_SIGNATURES = "signatures";
  @SerializedName(SERIALIZED_NAME_SIGNATURES)
  private List<String> signatures = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Double width = null;

  public FileImageGetV2Filtering() {
  }

  public FileImageGetV2Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据图片上传时间进行过滤的截止时间，与start_time搭配使用，格式：yyyy-mm-dd 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public FileImageGetV2Filtering height(Double height) {
    
    this.height = height;
    return this;
  }

   /**
   * 图片高度 
   * @return height
  **/
  @javax.annotation.Nullable
  public Double getHeight() {
    return height;
  }


  public void setHeight(Double height) {
    this.height = height;
  }


  public FileImageGetV2Filtering imageIds(List<String> imageIds) {
    
    this.imageIds = imageIds;
    return this;
  }

  public FileImageGetV2Filtering addImageIdsItem(String imageIdsItem) {
    if (this.imageIds == null) {
      this.imageIds = new ArrayList<>();
    }
    this.imageIds.add(imageIdsItem);
    return this;
  }

   /**
   * 图片ids，可以根据图片ids（创意中使用的图片key，存在一张图片对应多个image_ids的情况）进行过滤 数量限制：&lt;&#x3D;100 注意：image_ids、material_ids、signatures只能选择一个进行过滤
   * @return imageIds
  **/
  @javax.annotation.Nullable
  public List<String> getImageIds() {
    return imageIds;
  }


  public void setImageIds(List<String> imageIds) {
    this.imageIds = imageIds;
  }


  public FileImageGetV2Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public FileImageGetV2Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤 数量限制：&lt;&#x3D;100 注意：image_ids、material_ids、signatures只能选择一个进行过滤
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public FileImageGetV2Filtering ratio(List<Double> ratio) {
    
    this.ratio = ratio;
    return this;
  }

  public FileImageGetV2Filtering addRatioItem(Double ratioItem) {
    if (this.ratio == null) {
      this.ratio = new ArrayList<>();
    }
    this.ratio.add(ratioItem);
    return this;
  }

   /**
   * 图片宽高比，eg: [1.7, 2.5]，输入1.7则搜索满足宽高比介于1.65-1.75之间的图片，即精度上下浮动0.05 
   * @return ratio
  **/
  @javax.annotation.Nullable
  public List<Double> getRatio() {
    return ratio;
  }


  public void setRatio(List<Double> ratio) {
    this.ratio = ratio;
  }


  public FileImageGetV2Filtering signatures(List<String> signatures) {
    
    this.signatures = signatures;
    return this;
  }

  public FileImageGetV2Filtering addSignaturesItem(String signaturesItem) {
    if (this.signatures == null) {
      this.signatures = new ArrayList<>();
    }
    this.signatures.add(signaturesItem);
    return this;
  }

   /**
   * md5值列表，可以根据素材的md5进行过滤 数量限制：&lt;&#x3D;100 注意：image_ids、material_ids、signatures只能选择一个进行过滤
   * @return signatures
  **/
  @javax.annotation.Nullable
  public List<String> getSignatures() {
    return signatures;
  }


  public void setSignatures(List<String> signatures) {
    this.signatures = signatures;
  }


  public FileImageGetV2Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据图片上传时间进行过滤的起始时间，与end_time搭配使用，格式：yyyy-mm-dd 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public FileImageGetV2Filtering width(Double width) {
    
    this.width = width;
    return this;
  }

   /**
   * 图片宽度 
   * @return width
  **/
  @javax.annotation.Nullable
  public Double getWidth() {
    return width;
  }


  public void setWidth(Double width) {
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
    FileImageGetV2Filtering fileImageGetV2Filtering = (FileImageGetV2Filtering) o;
    return Objects.equals(this.endTime, fileImageGetV2Filtering.endTime) &&
        Objects.equals(this.height, fileImageGetV2Filtering.height) &&
        Objects.equals(this.imageIds, fileImageGetV2Filtering.imageIds) &&
        Objects.equals(this.materialIds, fileImageGetV2Filtering.materialIds) &&
        Objects.equals(this.ratio, fileImageGetV2Filtering.ratio) &&
        Objects.equals(this.signatures, fileImageGetV2Filtering.signatures) &&
        Objects.equals(this.startTime, fileImageGetV2Filtering.startTime) &&
        Objects.equals(this.width, fileImageGetV2Filtering.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, height, imageIds, materialIds, ratio, signatures, startTime, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImageGetV2Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageIds: ").append(toIndentedString(imageIds)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    signatures: ").append(toIndentedString(signatures)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("image_ids");
    openapiFields.add("material_ids");
    openapiFields.add("ratio");
    openapiFields.add("signatures");
    openapiFields.add("start_time");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileImageGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileImageGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileImageGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileImageGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<FileImageGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, FileImageGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileImageGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileImageGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileImageGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to FileImageGetV2Filtering
  */
  public static FileImageGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileImageGetV2Filtering.class);
  }

 /**
  * Convert an instance of FileImageGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

