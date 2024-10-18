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
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2CreativeListImageMaterialsImageMode;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerImageInfo;
import com.bytedance.ads.model.CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeCustomCreativeCreateV2CreativeListImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMAGE = "template_image";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMAGE)
  private CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage = null;

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner() {
  }

  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner imageInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

   /**
   * Get imageInfo
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerImageInfo getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerImageInfo imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner imageMode(CreativeCustomCreativeCreateV2CreativeListImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2CreativeListImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeCustomCreativeCreateV2CreativeListImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner templateImage(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage) {
    
    this.templateImage = templateImage;
    return this;
  }

   /**
   * Get templateImage
   * @return templateImage
  **/
  @javax.annotation.Nullable
  public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage getTemplateImage() {
    return templateImage;
  }


  public void setTemplateImage(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInnerTemplateImage templateImage) {
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
    CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner = (CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.imageMode) &&
        Objects.equals(this.templateImage, creativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.templateImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, templateImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
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
    openapiFields.add("template_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner
  */
  public static CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeCustomCreativeCreateV2RequestCreativeListInnerImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

