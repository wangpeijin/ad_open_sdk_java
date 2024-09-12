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
import com.bytedance.ads.model.QianchuanCarouselGetV10FilteringImageMode;
import com.bytedance.ads.model.QianchuanCarouselGetV10FilteringSources;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class QianchuanCarouselGetV10Filtering {
  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private List<QianchuanCarouselGetV10FilteringImageMode> imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_IDS = "material_ids";
  @SerializedName(SERIALIZED_NAME_MATERIAL_IDS)
  private List<Long> materialIds = null;

  public static final String SERIALIZED_NAME_QUERY_STRING = "query_string";
  @SerializedName(SERIALIZED_NAME_QUERY_STRING)
  private String queryString = null;

  public static final String SERIALIZED_NAME_SOURCES = "sources";
  @SerializedName(SERIALIZED_NAME_SOURCES)
  private List<QianchuanCarouselGetV10FilteringSources> sources = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public QianchuanCarouselGetV10Filtering() {
  }

  public QianchuanCarouselGetV10Filtering endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 根据图片上传时间进行过滤的截止时间，与start_time搭配使用，格式：\&quot;yyyy-mm-dd\&quot;
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public QianchuanCarouselGetV10Filtering imageMode(List<QianchuanCarouselGetV10FilteringImageMode> imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

  public QianchuanCarouselGetV10Filtering addImageModeItem(QianchuanCarouselGetV10FilteringImageMode imageModeItem) {
    if (this.imageMode == null) {
      this.imageMode = new ArrayList<>();
    }
    this.imageMode.add(imageModeItem);
    return this;
  }

   /**
   * 素材类型 CAROUSEL 图文
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public List<QianchuanCarouselGetV10FilteringImageMode> getImageMode() {
    return imageMode;
  }


  public void setImageMode(List<QianchuanCarouselGetV10FilteringImageMode> imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanCarouselGetV10Filtering materialIds(List<Long> materialIds) {
    
    this.materialIds = materialIds;
    return this;
  }

  public QianchuanCarouselGetV10Filtering addMaterialIdsItem(Long materialIdsItem) {
    if (this.materialIds == null) {
      this.materialIds = new ArrayList<>();
    }
    this.materialIds.add(materialIdsItem);
    return this;
  }

   /**
   * 素材id列表，可以根据material_ids（素材报表使用的id，一个素材唯一对应一个素材id）进行过滤 数量限制：&lt;&#x3D;100
   * @return materialIds
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialIds() {
    return materialIds;
  }


  public void setMaterialIds(List<Long> materialIds) {
    this.materialIds = materialIds;
  }


  public QianchuanCarouselGetV10Filtering queryString(String queryString) {
    
    this.queryString = queryString;
    return this;
  }

   /**
   * 支持根据图文名称/ID搜索
   * @return queryString
  **/
  @javax.annotation.Nullable
  public String getQueryString() {
    return queryString;
  }


  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  public QianchuanCarouselGetV10Filtering sources(List<QianchuanCarouselGetV10FilteringSources> sources) {
    
    this.sources = sources;
    return this;
  }

  public QianchuanCarouselGetV10Filtering addSourcesItem(QianchuanCarouselGetV10FilteringSources sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

   /**
   * 图文素材来源 JICHAUNG 即创
   * @return sources
  **/
  @javax.annotation.Nullable
  public List<QianchuanCarouselGetV10FilteringSources> getSources() {
    return sources;
  }


  public void setSources(List<QianchuanCarouselGetV10FilteringSources> sources) {
    this.sources = sources;
  }


  public QianchuanCarouselGetV10Filtering startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 根据图片上传时间进行过滤的起始时间，与end_time搭配使用，格式：\&quot;yyyy-mm-dd\&quot;
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanCarouselGetV10Filtering qianchuanCarouselGetV10Filtering = (QianchuanCarouselGetV10Filtering) o;
    return Objects.equals(this.endTime, qianchuanCarouselGetV10Filtering.endTime) &&
        Objects.equals(this.imageMode, qianchuanCarouselGetV10Filtering.imageMode) &&
        Objects.equals(this.materialIds, qianchuanCarouselGetV10Filtering.materialIds) &&
        Objects.equals(this.queryString, qianchuanCarouselGetV10Filtering.queryString) &&
        Objects.equals(this.sources, qianchuanCarouselGetV10Filtering.sources) &&
        Objects.equals(this.startTime, qianchuanCarouselGetV10Filtering.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endTime, imageMode, materialIds, queryString, sources, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanCarouselGetV10Filtering {\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialIds: ").append(toIndentedString(materialIds)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("material_ids");
    openapiFields.add("query_string");
    openapiFields.add("sources");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselGetV10Filtering
  */
  public static QianchuanCarouselGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanCarouselGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

