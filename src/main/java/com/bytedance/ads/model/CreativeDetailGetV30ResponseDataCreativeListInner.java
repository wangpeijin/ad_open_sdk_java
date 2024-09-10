/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30DataCreativeListImageMode;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerDecorationMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerInteractiveMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerPlayableMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterial;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial;
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
 * CreativeDetailGetV30ResponseDataCreativeListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class CreativeDetailGetV30ResponseDataCreativeListInner {
  public static final String SERIALIZED_NAME_ABSTRACT_MATERIALS = "abstract_materials";
  @SerializedName(SERIALIZED_NAME_ABSTRACT_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner> abstractMaterials = null;

  public static final String SERIALIZED_NAME_CREATIVE_ID = "creative_id";
  @SerializedName(SERIALIZED_NAME_CREATIVE_ID)
  private Long creativeId = null;

  public static final String SERIALIZED_NAME_DECORATION_MATERIAL = "decoration_material";
  @SerializedName(SERIALIZED_NAME_DECORATION_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeListInnerDecorationMaterial decorationMaterial = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeDetailGetV30DataCreativeListImageMode imageMode = null;

  public static final String SERIALIZED_NAME_INTERACTIVE_MATERIAL = "interactive_material";
  @SerializedName(SERIALIZED_NAME_INTERACTIVE_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeListInnerInteractiveMaterial interactiveMaterial = null;

  public static final String SERIALIZED_NAME_PLAYABLE_MATERIAL = "playable_material";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeListInnerPlayableMaterial playableMaterial = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIAL = "title_material";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterial titleMaterial = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIAL = "video_material";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIAL)
  private CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial videoMaterial = null;

  public CreativeDetailGetV30ResponseDataCreativeListInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeListInner abstractMaterials(List<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner> abstractMaterials) {
    
    this.abstractMaterials = abstractMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeListInner addAbstractMaterialsItem(CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner abstractMaterialsItem) {
    if (this.abstractMaterials == null) {
      this.abstractMaterials = new ArrayList<>();
    }
    this.abstractMaterials.add(abstractMaterialsItem);
    return this;
  }

   /**
   * 摘要素材
   * @return abstractMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner> getAbstractMaterials() {
    return abstractMaterials;
  }


  public void setAbstractMaterials(List<CreativeDetailGetV30ResponseDataCreativeListInnerAbstractMaterialsInner> abstractMaterials) {
    this.abstractMaterials = abstractMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner creativeId(Long creativeId) {
    
    this.creativeId = creativeId;
    return this;
  }

   /**
   * 创意id
   * @return creativeId
  **/
  @javax.annotation.Nullable
  public Long getCreativeId() {
    return creativeId;
  }


  public void setCreativeId(Long creativeId) {
    this.creativeId = creativeId;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner decorationMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerDecorationMaterial decorationMaterial) {
    
    this.decorationMaterial = decorationMaterial;
    return this;
  }

   /**
   * Get decorationMaterial
   * @return decorationMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerDecorationMaterial getDecorationMaterial() {
    return decorationMaterial;
  }


  public void setDecorationMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerDecorationMaterial decorationMaterial) {
    this.decorationMaterial = decorationMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner imageMaterials(List<CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeListInner addImageMaterialsItem(CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner imageMaterialsItem) {
    if (this.imageMaterials == null) {
      this.imageMaterials = new ArrayList<>();
    }
    this.imageMaterials.add(imageMaterialsItem);
    return this;
  }

   /**
   * 创意图片素材
   * @return imageMaterials
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<CreativeDetailGetV30ResponseDataCreativeListInnerImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner imageMode(CreativeDetailGetV30DataCreativeListImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataCreativeListImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeDetailGetV30DataCreativeListImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner interactiveMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerInteractiveMaterial interactiveMaterial) {
    
    this.interactiveMaterial = interactiveMaterial;
    return this;
  }

   /**
   * Get interactiveMaterial
   * @return interactiveMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerInteractiveMaterial getInteractiveMaterial() {
    return interactiveMaterial;
  }


  public void setInteractiveMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerInteractiveMaterial interactiveMaterial) {
    this.interactiveMaterial = interactiveMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner playableMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerPlayableMaterial playableMaterial) {
    
    this.playableMaterial = playableMaterial;
    return this;
  }

   /**
   * Get playableMaterial
   * @return playableMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerPlayableMaterial getPlayableMaterial() {
    return playableMaterial;
  }


  public void setPlayableMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerPlayableMaterial playableMaterial) {
    this.playableMaterial = playableMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner titleMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterial titleMaterial) {
    
    this.titleMaterial = titleMaterial;
    return this;
  }

   /**
   * Get titleMaterial
   * @return titleMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterial getTitleMaterial() {
    return titleMaterial;
  }


  public void setTitleMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerTitleMaterial titleMaterial) {
    this.titleMaterial = titleMaterial;
  }


  public CreativeDetailGetV30ResponseDataCreativeListInner videoMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial videoMaterial) {
    
    this.videoMaterial = videoMaterial;
    return this;
  }

   /**
   * Get videoMaterial
   * @return videoMaterial
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial getVideoMaterial() {
    return videoMaterial;
  }


  public void setVideoMaterial(CreativeDetailGetV30ResponseDataCreativeListInnerVideoMaterial videoMaterial) {
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
    CreativeDetailGetV30ResponseDataCreativeListInner creativeDetailGetV30ResponseDataCreativeListInner = (CreativeDetailGetV30ResponseDataCreativeListInner) o;
    return Objects.equals(this.abstractMaterials, creativeDetailGetV30ResponseDataCreativeListInner.abstractMaterials) &&
        Objects.equals(this.creativeId, creativeDetailGetV30ResponseDataCreativeListInner.creativeId) &&
        Objects.equals(this.decorationMaterial, creativeDetailGetV30ResponseDataCreativeListInner.decorationMaterial) &&
        Objects.equals(this.imageMaterials, creativeDetailGetV30ResponseDataCreativeListInner.imageMaterials) &&
        Objects.equals(this.imageMode, creativeDetailGetV30ResponseDataCreativeListInner.imageMode) &&
        Objects.equals(this.interactiveMaterial, creativeDetailGetV30ResponseDataCreativeListInner.interactiveMaterial) &&
        Objects.equals(this.playableMaterial, creativeDetailGetV30ResponseDataCreativeListInner.playableMaterial) &&
        Objects.equals(this.titleMaterial, creativeDetailGetV30ResponseDataCreativeListInner.titleMaterial) &&
        Objects.equals(this.videoMaterial, creativeDetailGetV30ResponseDataCreativeListInner.videoMaterial);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(abstractMaterials, creativeId, decorationMaterial, imageMaterials, imageMode, interactiveMaterial, playableMaterial, titleMaterial, videoMaterial);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeListInner {\n");
    sb.append("    abstractMaterials: ").append(toIndentedString(abstractMaterials)).append("\n");
    sb.append("    creativeId: ").append(toIndentedString(creativeId)).append("\n");
    sb.append("    decorationMaterial: ").append(toIndentedString(decorationMaterial)).append("\n");
    sb.append("    imageMaterials: ").append(toIndentedString(imageMaterials)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    interactiveMaterial: ").append(toIndentedString(interactiveMaterial)).append("\n");
    sb.append("    playableMaterial: ").append(toIndentedString(playableMaterial)).append("\n");
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
    openapiFields.add("abstract_materials");
    openapiFields.add("creative_id");
    openapiFields.add("decoration_material");
    openapiFields.add("image_materials");
    openapiFields.add("image_mode");
    openapiFields.add("interactive_material");
    openapiFields.add("playable_material");
    openapiFields.add("title_material");
    openapiFields.add("video_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeDetailGetV30ResponseDataCreativeListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeListInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeListInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeListInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeListInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

