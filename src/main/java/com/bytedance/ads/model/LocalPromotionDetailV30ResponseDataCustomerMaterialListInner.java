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
import com.bytedance.ads.model.LocalPromotionDetailV30DataCustomerMaterialListImageMode;
import com.bytedance.ads.model.LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial;
import com.bytedance.ads.model.LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerVideoMaterial;
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
 * LocalPromotionDetailV30ResponseDataCustomerMaterialListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class LocalPromotionDetailV30ResponseDataCustomerMaterialListInner {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private LocalPromotionDetailV30DataCustomerMaterialListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerVideoMaterial videoMaterial = null;

  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInner() {
  }

  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInner imageMode(LocalPromotionDetailV30DataCustomerMaterialListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public LocalPromotionDetailV30DataCustomerMaterialListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(LocalPromotionDetailV30DataCustomerMaterialListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInner titleMaterial(LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInner videoMaterial(LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(LocalPromotionDetailV30ResponseDataCustomerMaterialListInnerVideoMaterial videoMaterial) {
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
    LocalPromotionDetailV30ResponseDataCustomerMaterialListInner localPromotionDetailV30ResponseDataCustomerMaterialListInner = (LocalPromotionDetailV30ResponseDataCustomerMaterialListInner) o;
    return Objects.equals(this.imageMode, localPromotionDetailV30ResponseDataCustomerMaterialListInner.imageMode) &&
        Objects.equals(this.titleMaterial, localPromotionDetailV30ResponseDataCustomerMaterialListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, localPromotionDetailV30ResponseDataCustomerMaterialListInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, titleMaterial, videoMaterial);
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
    sb.append("class LocalPromotionDetailV30ResponseDataCustomerMaterialListInner {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalPromotionDetailV30ResponseDataCustomerMaterialListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalPromotionDetailV30ResponseDataCustomerMaterialListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalPromotionDetailV30ResponseDataCustomerMaterialListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalPromotionDetailV30ResponseDataCustomerMaterialListInner>() {
           @Override
           public void write(JsonWriter out, LocalPromotionDetailV30ResponseDataCustomerMaterialListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalPromotionDetailV30ResponseDataCustomerMaterialListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInner
  * @throws IOException if the JSON string is invalid with respect to LocalPromotionDetailV30ResponseDataCustomerMaterialListInner
  */
  public static LocalPromotionDetailV30ResponseDataCustomerMaterialListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalPromotionDetailV30ResponseDataCustomerMaterialListInner.class);
  }

 /**
  * Convert an instance of LocalPromotionDetailV30ResponseDataCustomerMaterialListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

