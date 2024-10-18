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
 * AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-18T16:52:21.736905407+08:00[Asia/Shanghai]")
public class AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner {
  public static final String SERIALIZED_NAME_IMAGE_ID = "image_id";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private List<String> imageId = null;

  public static final String SERIALIZED_NAME_REJECT_REASON = "reject_reason";
  @SerializedName(SERIALIZED_NAME_REJECT_REASON)
  private String rejectReason = null;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner() {
  }

  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner imageId(List<String> imageId) {
    
    this.imageId = imageId;
    return this;
  }

  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner addImageIdItem(String imageIdItem) {
    if (this.imageId == null) {
      this.imageId = new ArrayList<>();
    }
    this.imageId.add(imageIdItem);
    return this;
  }

   /**
   * 
   * @return imageId
  **/
  @javax.annotation.Nullable
  public List<String> getImageId() {
    return imageId;
  }


  public void setImageId(List<String> imageId) {
    this.imageId = imageId;
  }


  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner rejectReason(String rejectReason) {
    
    this.rejectReason = rejectReason;
    return this;
  }

   /**
   * 
   * @return rejectReason
  **/
  @javax.annotation.Nullable
  public String getRejectReason() {
    return rejectReason;
  }


  public void setRejectReason(String rejectReason) {
    this.rejectReason = rejectReason;
  }


  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner title(String title) {
    
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


  public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner videoId(String videoId) {
    
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
    AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner adRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner = (AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner) o;
    return Objects.equals(this.imageId, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.imageId) &&
        Objects.equals(this.rejectReason, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.rejectReason) &&
        Objects.equals(this.title, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.title) &&
        Objects.equals(this.videoId, adRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.videoId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageId, rejectReason, title, videoId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner {\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("image_id");
    openapiFields.add("reject_reason");
    openapiFields.add("title");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner>() {
           @Override
           public void write(JsonWriter out, AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner
  * @throws IOException if the JSON string is invalid with respect to AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner
  */
  public static AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner.class);
  }

 /**
  * Convert an instance of AdRejectReasonV2ResponseDataListInnerCreativeRejectInnerMaterialRejectInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

