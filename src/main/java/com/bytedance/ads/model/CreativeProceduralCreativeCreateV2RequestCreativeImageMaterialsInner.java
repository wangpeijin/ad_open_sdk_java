/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2CreativeImageMaterialsImageMode;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner;
import com.bytedance.ads.model.CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerTemplateImage;
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
 * CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeProceduralCreativeCreateV2CreativeImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_MATERIAL_ID = "material_id";
  @SerializedName(SERIALIZED_NAME_MATERIAL_ID)
  private Long materialId = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMAGE = "template_image";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMAGE)
  private CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage = null;

  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner() {
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner imageInfo(List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner addImageInfoItem(CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * 
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner imageMode(CreativeProceduralCreativeCreateV2CreativeImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2CreativeImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeProceduralCreativeCreateV2CreativeImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner materialId(Long materialId) {
    
    this.materialId = materialId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return materialId
  **/
  @javax.annotation.Nullable
  public Long getMaterialId() {
    return materialId;
  }


  public void setMaterialId(Long materialId) {
    this.materialId = materialId;
  }


  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner templateImage(CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage) {
    
    this.templateImage = templateImage;
    return this;
  }

   /**
   * Get templateImage
   * @return templateImage
  **/
  @javax.annotation.Nullable
  public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerTemplateImage getTemplateImage() {
    return templateImage;
  }


  public void setTemplateImage(CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInnerTemplateImage templateImage) {
    this.templateImage = templateImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner creativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner = (CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, creativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.imageMode) &&
        Objects.equals(this.materialId, creativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.materialId) &&
        Objects.equals(this.templateImage, creativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.templateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, materialId, templateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    materialId: ").append(toIndentedString(materialId)).append("\n");
    sb.append("    templateImage: ").append(toIndentedString(templateImage)).append("\n");
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
    openapiFields.add("image_info");
    openapiFields.add("image_mode");
    openapiFields.add("material_id");
    openapiFields.add("template_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner
  */
  public static CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeProceduralCreativeCreateV2RequestCreativeImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

