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
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringAnalysisType;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringCarouselSource;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringImageSource;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringMaterialMode;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringMaterialType;
import com.bytedance.ads.model.QianchuanReportMaterialGetV10FilteringVideoSource;
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
public class QianchuanReportMaterialGetV10Filtering {
  public static final String SERIALIZED_NAME_ANALYSIS_TYPE = "analysis_type";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_TYPE)
  private List<QianchuanReportMaterialGetV10FilteringAnalysisType> analysisType = null;

  public static final String SERIALIZED_NAME_CAROUSEL_SOURCE = "carousel_source";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_SOURCE)
  private List<QianchuanReportMaterialGetV10FilteringCarouselSource> carouselSource = null;

  public static final String SERIALIZED_NAME_IMAGE_SOURCE = "image_source";
  @SerializedName(SERIALIZED_NAME_IMAGE_SOURCE)
  private List<QianchuanReportMaterialGetV10FilteringImageSource> imageSource = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private List<Long> materialId = null;

  public static final String SERIALIZED_NAME_MATERIAL_MODE = "material_mode";
  @SerializedName(SERIALIZED_NAME_MATERIAL_MODE)
  private List<QianchuanReportMaterialGetV10FilteringMaterialMode> materialMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private QianchuanReportMaterialGetV10FilteringMaterialType materialType = null;

  public static final String SERIALIZED_NAME_VIDEO_SOURCE = "video_source";
  @SerializedName(SERIALIZED_NAME_VIDEO_SOURCE)
  private List<QianchuanReportMaterialGetV10FilteringVideoSource> videoSource = null;

  public QianchuanReportMaterialGetV10Filtering() {
  }

  public QianchuanReportMaterialGetV10Filtering analysisType(List<QianchuanReportMaterialGetV10FilteringAnalysisType> analysisType) {
    
    this.analysisType = analysisType;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addAnalysisTypeItem(QianchuanReportMaterialGetV10FilteringAnalysisType analysisTypeItem) {
    if (this.analysisType == null) {
      this.analysisType = new ArrayList<>();
    }
    this.analysisType.add(analysisTypeItem);
    return this;
  }

   /**
   * 
   * @return analysisType
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportMaterialGetV10FilteringAnalysisType> getAnalysisType() {
    return analysisType;
  }


  public void setAnalysisType(List<QianchuanReportMaterialGetV10FilteringAnalysisType> analysisType) {
    this.analysisType = analysisType;
  }


  public QianchuanReportMaterialGetV10Filtering carouselSource(List<QianchuanReportMaterialGetV10FilteringCarouselSource> carouselSource) {
    
    this.carouselSource = carouselSource;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addCarouselSourceItem(QianchuanReportMaterialGetV10FilteringCarouselSource carouselSourceItem) {
    if (this.carouselSource == null) {
      this.carouselSource = new ArrayList<>();
    }
    this.carouselSource.add(carouselSourceItem);
    return this;
  }

   /**
   * 
   * @return carouselSource
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportMaterialGetV10FilteringCarouselSource> getCarouselSource() {
    return carouselSource;
  }


  public void setCarouselSource(List<QianchuanReportMaterialGetV10FilteringCarouselSource> carouselSource) {
    this.carouselSource = carouselSource;
  }


  public QianchuanReportMaterialGetV10Filtering imageSource(List<QianchuanReportMaterialGetV10FilteringImageSource> imageSource) {
    
    this.imageSource = imageSource;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addImageSourceItem(QianchuanReportMaterialGetV10FilteringImageSource imageSourceItem) {
    if (this.imageSource == null) {
      this.imageSource = new ArrayList<>();
    }
    this.imageSource.add(imageSourceItem);
    return this;
  }

   /**
   * 
   * @return imageSource
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportMaterialGetV10FilteringImageSource> getImageSource() {
    return imageSource;
  }


  public void setImageSource(List<QianchuanReportMaterialGetV10FilteringImageSource> imageSource) {
    this.imageSource = imageSource;
  }


  public QianchuanReportMaterialGetV10Filtering materialId(List<Long> materialId) {
    
    this.materialId = materialId;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addMaterialIdItem(Long materialIdItem) {
    if (this.materialId == null) {
      this.materialId = new ArrayList<>();
    }
    this.materialId.add(materialIdItem);
    return this;
  }

   /**
   * 
   * @return materialId
  **/
  @javax.annotation.Nullable
  public List<Long> getMaterialId() {
    return materialId;
  }


  public void setMaterialId(List<Long> materialId) {
    this.materialId = materialId;
  }


  public QianchuanReportMaterialGetV10Filtering materialMode(List<QianchuanReportMaterialGetV10FilteringMaterialMode> materialMode) {
    
    this.materialMode = materialMode;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addMaterialModeItem(QianchuanReportMaterialGetV10FilteringMaterialMode materialModeItem) {
    if (this.materialMode == null) {
      this.materialMode = new ArrayList<>();
    }
    this.materialMode.add(materialModeItem);
    return this;
  }

   /**
   * 
   * @return materialMode
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportMaterialGetV10FilteringMaterialMode> getMaterialMode() {
    return materialMode;
  }


  public void setMaterialMode(List<QianchuanReportMaterialGetV10FilteringMaterialMode> materialMode) {
    this.materialMode = materialMode;
  }


  public QianchuanReportMaterialGetV10Filtering materialType(QianchuanReportMaterialGetV10FilteringMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nonnull
  public QianchuanReportMaterialGetV10FilteringMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(QianchuanReportMaterialGetV10FilteringMaterialType materialType) {
    this.materialType = materialType;
  }


  public QianchuanReportMaterialGetV10Filtering videoSource(List<QianchuanReportMaterialGetV10FilteringVideoSource> videoSource) {
    
    this.videoSource = videoSource;
    return this;
  }

  public QianchuanReportMaterialGetV10Filtering addVideoSourceItem(QianchuanReportMaterialGetV10FilteringVideoSource videoSourceItem) {
    if (this.videoSource == null) {
      this.videoSource = new ArrayList<>();
    }
    this.videoSource.add(videoSourceItem);
    return this;
  }

   /**
   * 
   * @return videoSource
  **/
  @javax.annotation.Nullable
  public List<QianchuanReportMaterialGetV10FilteringVideoSource> getVideoSource() {
    return videoSource;
  }


  public void setVideoSource(List<QianchuanReportMaterialGetV10FilteringVideoSource> videoSource) {
    this.videoSource = videoSource;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanReportMaterialGetV10Filtering qianchuanReportMaterialGetV10Filtering = (QianchuanReportMaterialGetV10Filtering) o;
    return Objects.equals(this.analysisType, qianchuanReportMaterialGetV10Filtering.analysisType) &&
        Objects.equals(this.carouselSource, qianchuanReportMaterialGetV10Filtering.carouselSource) &&
        Objects.equals(this.imageSource, qianchuanReportMaterialGetV10Filtering.imageSource) &&
        Objects.equals(this.materialId, qianchuanReportMaterialGetV10Filtering.materialId) &&
        Objects.equals(this.materialMode, qianchuanReportMaterialGetV10Filtering.materialMode) &&
        Objects.equals(this.materialType, qianchuanReportMaterialGetV10Filtering.materialType) &&
        Objects.equals(this.videoSource, qianchuanReportMaterialGetV10Filtering.videoSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisType, carouselSource, imageSource, materialId, materialMode, materialType, videoSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QianchuanReportMaterialGetV10Filtering {\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    carouselSource: ").append(toIndentedString(carouselSource)).append("\n");
    sb.append("    imageSource: ").append(toIndentedString(imageSource)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    materialMode: ").append(toIndentedString(materialMode)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    videoSource: ").append(toIndentedString(videoSource)).append("\n");
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
    openapiFields.add("analysis_type");
    openapiFields.add("carousel_source");
    openapiFields.add("image_source");
    openapiFields.add("material_id");
    openapiFields.add("material_mode");
    openapiFields.add("material_type");
    openapiFields.add("video_source");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("material_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanReportMaterialGetV10Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanReportMaterialGetV10Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanReportMaterialGetV10Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanReportMaterialGetV10Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanReportMaterialGetV10Filtering>() {
           @Override
           public void write(JsonWriter out, QianchuanReportMaterialGetV10Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanReportMaterialGetV10Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanReportMaterialGetV10Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanReportMaterialGetV10Filtering
  * @throws IOException if the JSON string is invalid with respect to QianchuanReportMaterialGetV10Filtering
  */
  public static QianchuanReportMaterialGetV10Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanReportMaterialGetV10Filtering.class);
  }

 /**
  * Convert an instance of QianchuanReportMaterialGetV10Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

