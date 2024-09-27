/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
 * QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner {
  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private Long height = null;

  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIAL_ID = "image_material_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIAL_ID)
  private Long imageMaterialId = null;

  public static final String SERIALIZED_NAME_RATIO = "ratio";
  @SerializedName(SERIALIZED_NAME_RATIO)
  private Double ratio = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private Long width = null;

  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner() {
  }

  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner height(Long height) {
    
    this.height = height;
    return this;
  }

   /**
   * 
   * @return height
  **/
  @javax.annotation.Nullable
  public Long getHeight() {
    return height;
  }


  public void setHeight(Long height) {
    this.height = height;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner imageMaterialId(Long imageMaterialId) {
    
    this.imageMaterialId = imageMaterialId;
    return this;
  }

   /**
   * 
   * @return imageMaterialId
  **/
  @javax.annotation.Nullable
  public Long getImageMaterialId() {
    return imageMaterialId;
  }


  public void setImageMaterialId(Long imageMaterialId) {
    this.imageMaterialId = imageMaterialId;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner ratio(Double ratio) {
    
    this.ratio = ratio;
    return this;
  }

   /**
   * 
   * @return ratio
  **/
  @javax.annotation.Nullable
  public Double getRatio() {
    return ratio;
  }


  public void setRatio(Double ratio) {
    this.ratio = ratio;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner width(Long width) {
    
    this.width = width;
    return this;
  }

   /**
   * 
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
    QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner = (QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner) o;
    return Objects.equals(this.height, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.height) &&
        Objects.equals(this.imageId, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.imageId) &&
        Objects.equals(this.imageMaterialId, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.imageMaterialId) &&
        Objects.equals(this.ratio, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.ratio) &&
        Objects.equals(this.url, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.url) &&
        Objects.equals(this.width, qianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.width);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(height, imageId, imageMaterialId, ratio, url, width);
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
    sb.append("class QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner {\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    imageMaterialId: ").append(toIndentedString(imageMaterialId)).append("\n");
    sb.append("    ratio: ").append(toIndentedString(ratio)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("height");
    openapiFields.add("image_id");
    openapiFields.add("image_material_id");
    openapiFields.add("ratio");
    openapiFields.add("url");
    openapiFields.add("width");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner
  */
  public static QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner.class);
  }

 /**
  * Convert an instance of QianchuanCarouselGetV10ResponseDataCarouselsInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

