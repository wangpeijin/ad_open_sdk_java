/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode;
import com.bytedance.ads.model.QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource;
import com.bytedance.ads.model.QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage;
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
 * 视频素材
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial {
  public static final String SERIALIZED_NAME_ANALYSIS_TYPE = "analysis_type";
  @SerializedName(SERIALIZED_NAME_ANALYSIS_TYPE)
  private List<String> analysisType = null;

  public static final String SERIALIZED_NAME_COVER_IMAGE = "cover_image";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE)
  private QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION = "video_duration";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION)
  private Long videoDuration = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial() {
  }

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial analysisType(List<String> analysisType) {
    
    this.analysisType = analysisType;
    return this;
  }

  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial addAnalysisTypeItem(String analysisTypeItem) {
    if (this.analysisType == null) {
      this.analysisType = new ArrayList<>();
    }
    this.analysisType.add(analysisTypeItem);
    return this;
  }

   /**
   * 素材建议
   * @return analysisType
  **/
  @javax.annotation.Nullable
  public List<String> getAnalysisType() {
    return analysisType;
  }


  public void setAnalysisType(List<String> analysisType) {
    this.analysisType = analysisType;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial coverImage(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage) {
    
    this.coverImage = coverImage;
    return this;
  }

   /**
   * Get coverImage
   * @return coverImage
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage getCoverImage() {
    return coverImage;
  }


  public void setCoverImage(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage) {
    this.coverImage = coverImage;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial imageMode(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 更新时需要传，创建时不需要传
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial source(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource getSource() {
    return source;
  }


  public void setSource(QianchuanMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source) {
    this.source = source;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial title(String title) {
    
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


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoDuration(Long videoDuration) {
    
    this.videoDuration = videoDuration;
    return this;
  }

   /**
   * 视频时长
   * @return videoDuration
  **/
  @javax.annotation.Nullable
  public Long getVideoDuration() {
    return videoDuration;
  }


  public void setVideoDuration(Long videoDuration) {
    this.videoDuration = videoDuration;
  }


  public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 视频 vid
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial = (QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial) o;
    return Objects.equals(this.analysisType, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.analysisType) &&
        Objects.equals(this.coverImage, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.coverImage) &&
        Objects.equals(this.imageMode, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.imageMode) &&
        Objects.equals(this.materialId, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.materialId) &&
        Objects.equals(this.source, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.source) &&
        Objects.equals(this.title, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.title) &&
        Objects.equals(this.videoDuration, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.videoDuration) &&
        Objects.equals(this.videoId, qianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisType, coverImage, imageMode, materialId, source, title, videoDuration, videoId);
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
    sb.append("class QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial {\n");
    sb.append("    analysisType: ").append(toIndentedString(analysisType)).append("\n");
    sb.append("    coverImage: ").append(toIndentedString(coverImage)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("cover_image");
    openapiFields.add("image_mode");
    openapiFields.add("material_id");
    openapiFields.add("source");
    openapiFields.add("title");
    openapiFields.add("video_duration");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial
  */
  public static QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class);
  }

 /**
  * Convert an instance of QianchuanMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

