/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30DataDataCreativeInfoVideoMaterialsImageMode;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerVideoInfo;
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
 * AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner {
  public static final String SERIALIZED_NAME_IMAGE_INFO = "image_info";
  @SerializedName(SERIALIZED_NAME_IMAGE_INFO)
  private List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo = null;

  public static final String SERIALIZED_NAME_IMAGE_MODE = "image_mode";
  @SerializedName(SERIALIZED_NAME_IMAGE_MODE)
  private AdlabGroupDetailV30DataDataCreativeInfoVideoMaterialsImageMode imageMode = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerVideoInfo videoInfo = null;

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner() {
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner imageInfo(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo) {
    
    this.imageInfo = imageInfo;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner addImageInfoItem(AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner imageInfoItem) {
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
  public List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner> getImageInfo() {
    return imageInfo;
  }


  public void setImageInfo(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerImageInfoInner> imageInfo) {
    this.imageInfo = imageInfo;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner imageMode(AdlabGroupDetailV30DataDataCreativeInfoVideoMaterialsImageMode imageMode) {
    
    this.imageMode = imageMode;
    return this;
  }

   /**
   * Get imageMode
   * @return imageMode
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30DataDataCreativeInfoVideoMaterialsImageMode getImageMode() {
    return imageMode;
  }


  public void setImageMode(AdlabGroupDetailV30DataDataCreativeInfoVideoMaterialsImageMode imageMode) {
    this.imageMode = imageMode;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner videoInfo(AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner adlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner = (AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner) o;
    return Objects.equals(this.imageInfo, adlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.imageInfo) &&
        Objects.equals(this.imageMode, adlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.imageMode) &&
        Objects.equals(this.videoInfo, adlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageInfo, imageMode, videoInfo);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner {\n");
    sb.append("    imageInfo: ").append(toIndentedString(imageInfo)).append("\n");
    sb.append("    imageMode: ").append(toIndentedString(imageMode)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner
  */
  public static AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

