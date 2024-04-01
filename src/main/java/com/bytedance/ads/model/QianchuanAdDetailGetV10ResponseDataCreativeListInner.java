/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.QianchuanAdDetailGetV10DataCreativeListImageMode;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerImageMaterial;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial;
import com.bytedance.ads.model.QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial;
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
 * QianchuanAdDetailGetV10ResponseDataCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class QianchuanAdDetailGetV10ResponseDataCreativeListInner {
  public static final String SERIALIZED_NAME_CAROUSEL_MATERIAL = "carousel_material";
  @SerializedName(SERIALIZED_NAME_CAROUSEL_MATERIAL)
  private QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial carouselMaterial = null;

  public static final String SERIALIZED_NAME_CREATIVE_CREATE_TIME = "creative_create_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_CREATE_TIME)
  private String creativeCreateTime = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_CREATIVE_MODIFY_TIME = "creative_modify_time";
  @SerializedName(SERIALIZED_NAME_CREATIVE_MODIFY_TIME)
  private String creativeModifyTime = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL = "image_material";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL)
  private QianchuanAdDetailGetV10ResponseDataCreativeListInnerImageMaterial imageMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private QianchuanAdDetailGetV10DataCreativeListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_PROMOTION_CARD_MATERIAL = "promotion_card_material";
  @SerializedName(SERIALIZED_NAME_PROMOTION_CARD_MATERIAL)
  private QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial promotionCardMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial videoMaterial = null;

  public QianchuanAdDetailGetV10ResponseDataCreativeListInner() {
  }

  public QianchuanAdDetailGetV10ResponseDataCreativeListInner carouselMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial carouselMaterial) {
    
    this.carouselMaterial = carouselMaterial;
    return this;
  }

   /**
   * Get carouselMaterial
   * @return carouselMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial getCarouselMaterial() {
    return carouselMaterial;
  }


  public void setCarouselMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerCarouselMaterial carouselMaterial) {
    this.carouselMaterial = carouselMaterial;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner creativeCreateTime(String creativeCreateTime) {
    
    this.creativeCreateTime = creativeCreateTime;
    return this;
  }

   /**
   * 
   * @return creativeCreateTime
  **/
  @javax.annotation.Nullable
  public String getCreativeCreateTime() {
    return creativeCreateTime;
  }


  public void setCreativeCreateTime(String creativeCreateTime) {
    this.creativeCreateTime = creativeCreateTime;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner creativeModifyTime(String creativeModifyTime) {
    
    this.creativeModifyTime = creativeModifyTime;
    return this;
  }

   /**
   * 
   * @return creativeModifyTime
  **/
  @javax.annotation.Nullable
  public String getCreativeModifyTime() {
    return creativeModifyTime;
  }


  public void setCreativeModifyTime(String creativeModifyTime) {
    this.creativeModifyTime = creativeModifyTime;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner imageMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerImageMaterial imageMaterial) {
    
    this.imageMaterial = imageMaterial;
    return this;
  }

   /**
   * Get imageMaterial
   * @return imageMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerImageMaterial getImageMaterial() {
    return imageMaterial;
  }


  public void setImageMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerImageMaterial imageMaterial) {
    this.imageMaterial = imageMaterial;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner imageMode(QianchuanAdDetailGetV10DataCreativeListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10DataCreativeListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(QianchuanAdDetailGetV10DataCreativeListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner promotionCardMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    
    this.promotionCardMaterial = promotionCardMaterial;
    return this;
  }

   /**
   * Get promotionCardMaterial
   * @return promotionCardMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial getPromotionCardMaterial() {
    return promotionCardMaterial;
  }


  public void setPromotionCardMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerPromotionCardMaterial promotionCardMaterial) {
    this.promotionCardMaterial = promotionCardMaterial;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner titleMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public QianchuanAdDetailGetV10ResponseDataCreativeListInner videoMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(QianchuanAdDetailGetV10ResponseDataCreativeListInnerVideoMaterial videoMaterial) {
    this.videoMaterial = videoMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QianchuanAdDetailGetV10ResponseDataCreativeListInner qianchuanAdDetailGetV10ResponseDataCreativeListInner = (QianchuanAdDetailGetV10ResponseDataCreativeListInner) o;
    return Objects.equals(this.carouselMaterial, qianchuanAdDetailGetV10ResponseDataCreativeListInner.carouselMaterial) &&
        Objects.equals(this.creativeCreateTime, qianchuanAdDetailGetV10ResponseDataCreativeListInner.creativeCreateTime) &&
        Objects.equals(this.creativeId, qianchuanAdDetailGetV10ResponseDataCreativeListInner.creativeId) &&
        Objects.equals(this.creativeModifyTime, qianchuanAdDetailGetV10ResponseDataCreativeListInner.creativeModifyTime) &&
        Objects.equals(this.imageMaterial, qianchuanAdDetailGetV10ResponseDataCreativeListInner.imageMaterial) &&
        Objects.equals(this.imageMode, qianchuanAdDetailGetV10ResponseDataCreativeListInner.imageMode) &&
        Objects.equals(this.promotionCardMaterial, qianchuanAdDetailGetV10ResponseDataCreativeListInner.promotionCardMaterial) &&
        Objects.equals(this.titleMaterial, qianchuanAdDetailGetV10ResponseDataCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, qianchuanAdDetailGetV10ResponseDataCreativeListInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(carouselMaterial, creativeCreateTime, creativeId, creativeModifyTime, imageMaterial, imageMode, promotionCardMaterial, titleMaterial, videoMaterial);
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
    sb.append("class QianchuanAdDetailGetV10ResponseDataCreativeListInner {\n");
    sb.append("    carouselMaterial: ").append(toIndentedString(carouselMaterial)).append("\n");
    sb.append("    creativeCreateTime: ").append(toIndentedString(creativeCreateTime)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    creativeModifyTime: ").append(toIndentedString(creativeModifyTime)).append("\n");
    sb.append("    imageMaterial: ").append(toIndentedString(imageMaterial)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    promotionCardMaterial: ").append(toIndentedString(promotionCardMaterial)).append("\n");
    sb.append("    titleMaterial: ").append(toIndentedString(titleMaterial)).append("\n");
    sb.append("    videoMaterial: ").append(toIndentedString(videoMaterial)).append("\n");
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
    openapiFields.add("carousel_material");
    openapiFields.add("creative_create_time");
    openapiFields.add("creative_id");
    openapiFields.add("creative_modify_time");
    openapiFields.add("image_material");
    openapiFields.add("image_mode");
    openapiFields.add("promotion_card_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanAdDetailGetV10ResponseDataCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanAdDetailGetV10ResponseDataCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanAdDetailGetV10ResponseDataCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanAdDetailGetV10ResponseDataCreativeListInner>() {
           @Override
           public void write(JsonWriter out, QianchuanAdDetailGetV10ResponseDataCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanAdDetailGetV10ResponseDataCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanAdDetailGetV10ResponseDataCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanAdDetailGetV10ResponseDataCreativeListInner
  */
  public static QianchuanAdDetailGetV10ResponseDataCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanAdDetailGetV10ResponseDataCreativeListInner.class);
  }

 /**
  * Convert an instance of QianchuanAdDetailGetV10ResponseDataCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

