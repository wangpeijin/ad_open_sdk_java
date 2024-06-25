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
 * AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner {
  public static final String SERIALIZED_NAME_ATTACHMENT_ID = "attachment_id";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_ID)
  private Long attachmentId = null;

  public static final String SERIALIZED_NAME_IMAGE_DOWNLOAD_URL = "image_download_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_DOWNLOAD_URL)
  private String imageDownloadUrl = null;

  public static final String SERIALIZED_NAME_IMAGE_PREVIEW_URL = "image_preview_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_PREVIEW_URL)
  private String imagePreviewUrl = null;

  public AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner() {
  }

  public AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner attachmentId(Long attachmentId) {
    
    this.attachmentId = attachmentId;
    return this;
  }

   /**
   * 
   * @return attachmentId
  **/
  @javax.annotation.Nullable
  public Long getAttachmentId() {
    return attachmentId;
  }


  public void setAttachmentId(Long attachmentId) {
    this.attachmentId = attachmentId;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner imageDownloadUrl(String imageDownloadUrl) {
    
    this.imageDownloadUrl = imageDownloadUrl;
    return this;
  }

   /**
   * 
   * @return imageDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getImageDownloadUrl() {
    return imageDownloadUrl;
  }


  public void setImageDownloadUrl(String imageDownloadUrl) {
    this.imageDownloadUrl = imageDownloadUrl;
  }


  public AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner imagePreviewUrl(String imagePreviewUrl) {
    
    this.imagePreviewUrl = imagePreviewUrl;
    return this;
  }

   /**
   * 
   * @return imagePreviewUrl
  **/
  @javax.annotation.Nullable
  public String getImagePreviewUrl() {
    return imagePreviewUrl;
  }


  public void setImagePreviewUrl(String imagePreviewUrl) {
    this.imagePreviewUrl = imagePreviewUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner advertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner = (AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner) o;
    return Objects.equals(this.attachmentId, advertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.attachmentId) &&
        Objects.equals(this.imageDownloadUrl, advertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.imageDownloadUrl) &&
        Objects.equals(this.imagePreviewUrl, advertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.imagePreviewUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachmentId, imageDownloadUrl, imagePreviewUrl);
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
    sb.append("class AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner {\n");
    sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
    sb.append("    imageDownloadUrl: ").append(toIndentedString(imageDownloadUrl)).append("\n");
    sb.append("    imagePreviewUrl: ").append(toIndentedString(imagePreviewUrl)).append("\n");
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
    openapiFields.add("attachment_id");
    openapiFields.add("image_download_url");
    openapiFields.add("image_preview_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("attachment_id");
    openapiRequiredFields.add("image_download_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner>() {
           @Override
           public void write(JsonWriter out, AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner
  * @throws IOException if the JSON string is invalid with respect to AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner
  */
  public static AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner.class);
  }

 /**
  * Convert an instance of AdvertiserDeliveryQualificationListV30ResponseDataListInnerImagesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

