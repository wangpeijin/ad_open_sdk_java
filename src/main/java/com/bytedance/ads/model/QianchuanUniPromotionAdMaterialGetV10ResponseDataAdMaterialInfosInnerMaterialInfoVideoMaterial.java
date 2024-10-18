/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource;
import com.bytedance.ads.model.QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial {
  public static final String SERIALIZED_NAME_COVER_IMAGE = "cover_image";
  @SerializedName(SERIALIZED_NAME_COVER_IMAGE)
  private QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_DURATION = "video_duration";
  @SerializedName(SERIALIZED_NAME_VIDEO_DURATION)
  private Long videoDuration = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial() {
  }

  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial coverImage(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage) {
    
    this.coverImage = coverImage;
    return this;
  }

   /**
   * Get coverImage
   * @return coverImage
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage getCoverImage() {
    return coverImage;
  }


  public void setCoverImage(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterialCoverImage coverImage) {
    this.coverImage = coverImage;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial materialId(Long materialId) {
    
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


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial source(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source) {
    
    this.source = source;
    return this;
  }

   /**
   * Get source
   * @return source
  **/
  @javax.annotation.Nullable
  public QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource getSource() {
    return source;
  }


  public void setSource(QianchuanUniPromotionAdMaterialGetV10DataAdMaterialInfosMaterialInfoVideoMaterialSource source) {
    this.source = source;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 
   * @return title
  **/
  @javax.annotation.Nullable
  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoDuration(Long videoDuration) {
    
    this.videoDuration = videoDuration;
    return this;
  }

   /**
   * 
   * @return videoDuration
  **/
  @javax.annotation.Nullable
  public Long getVideoDuration() {
    return videoDuration;
  }


  public void setVideoDuration(Long videoDuration) {
    this.videoDuration = videoDuration;
  }


  public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial videoId(String videoId) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial = (QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial) o;
    return Objects.equals(this.coverImage, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.coverImage) &&
        Objects.equals(this.materialId, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.materialId) &&
        Objects.equals(this.source, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.source) &&
        Objects.equals(this.title, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.title) &&
        Objects.equals(this.videoDuration, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.videoDuration) &&
        Objects.equals(this.videoId, qianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(coverImage, materialId, source, title, videoDuration, videoId);
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
    sb.append("class QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial {\n");
    sb.append("    coverImage: ").append(toIndentedString(coverImage)).append("\n");
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
    openapiFields.add("cover_image");
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
       if (!QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial>() {
           @Override
           public void write(JsonWriter out, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial
  */
  public static QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial.class);
  }

 /**
  * Convert an instance of QianchuanUniPromotionAdMaterialGetV10ResponseDataAdMaterialInfosInnerMaterialInfoVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

