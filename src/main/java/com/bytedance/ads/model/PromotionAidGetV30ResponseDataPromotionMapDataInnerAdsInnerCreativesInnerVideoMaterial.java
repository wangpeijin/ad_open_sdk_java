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
import com.bytedance.ads.model.PromotionAidGetV30DataPromotionMapDataAdsCreativesVideoMaterialImageMode;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial {
  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private PromotionAidGetV30DataPromotionMapDataAdsCreativesVideoMaterialImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial() {
  }

  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial imageMode(PromotionAidGetV30DataPromotionMapDataAdsCreativesVideoMaterialImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public PromotionAidGetV30DataPromotionMapDataAdsCreativesVideoMaterialImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(PromotionAidGetV30DataPromotionMapDataAdsCreativesVideoMaterialImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial materialId(Long materialId) {
    
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


  public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial videoId(String videoId) {
    
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
    PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial = (PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial) o;
    return Objects.equals(this.imageMode, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.imageMode) &&
        Objects.equals(this.materialId, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.materialId) &&
        Objects.equals(this.videoId, promotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageMode, materialId, videoId);
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
    sb.append("class PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial {\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
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
    openapiFields.add("image_mode");
    openapiFields.add("material_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial>() {
           @Override
           public void write(JsonWriter out, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial
  * @throws IOException if the JSON string is invalid with respect to PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial
  */
  public static PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial.class);
  }

 /**
  * Convert an instance of PromotionAidGetV30ResponseDataPromotionMapDataInnerAdsInnerCreativesInnerVideoMaterial to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

