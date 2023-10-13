/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.CreativeDetailGetV30DataCreativeImageMaterialsImageMode;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner;
import com.bytedance.ads.model.CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerTemplateImage;
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
 * CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private CreativeDetailGetV30DataCreativeImageMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_TEMPLATE_IMAGE = "template_image";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_IMAGE)
  private CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerTemplateImage templateImage = null;

  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner() {
  }

  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner imageInfo(List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner addImageInfoItem(CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner imageInfoItem) {
    if (this.imageInfo == null) {
      this.imageInfo = new ArrayList<>();
    }
    this.imageInfo.add(imageInfoItem);
    return this;
  }

   /**
   * 图片素材信息
   * @return imageInfo
  **/
  @javax.annotation.Nullable
  public List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner imageMode(CreativeDetailGetV30DataCreativeImageMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30DataCreativeImageMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(CreativeDetailGetV30DataCreativeImageMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner templateImage(CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerTemplateImage templateImage) {
    
    this.templateImage = templateImage;
    return this;
  }

   /**
   * Get templateImage
   * @return templateImage
  **/
  @javax.annotation.Nullable
  public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerTemplateImage getTemplateImage() {
    return templateImage;
  }


  public void setTemplateImage(CreativeDetailGetV30ResponseDataCreativeImageMaterialsInnerTemplateImage templateImage) {
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
    CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner creativeDetailGetV30ResponseDataCreativeImageMaterialsInner = (CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner) o;
    return Objects.equals(this.imageInfo, creativeDetailGetV30ResponseDataCreativeImageMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, creativeDetailGetV30ResponseDataCreativeImageMaterialsInner.imageMode) &&
        Objects.equals(this.templateImage, creativeDetailGetV30ResponseDataCreativeImageMaterialsInner.templateImage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, templateImage);
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
    sb.append("class CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner {\n");
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
       if (!CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner>() {
           @Override
           public void write(JsonWriter out, CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner
  */
  public static CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner.class);
  }

 /**
  * Convert an instance of CreativeDetailGetV30ResponseDataCreativeImageMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

