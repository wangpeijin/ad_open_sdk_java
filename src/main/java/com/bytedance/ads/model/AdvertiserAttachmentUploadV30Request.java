/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdvertiserAttachmentUploadV30AttachmentType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.File;
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
 * AdvertiserAttachmentUploadV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class AdvertiserAttachmentUploadV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_TYPE = "attachment_type";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TYPE)
  private AdvertiserAttachmentUploadV30AttachmentType attachmentType = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "image_data";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private File imageData = null;

  public AdvertiserAttachmentUploadV30Request() {
  }

  public AdvertiserAttachmentUploadV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public AdvertiserAttachmentUploadV30Request attachmentType(AdvertiserAttachmentUploadV30AttachmentType attachmentType) {
    
    this.attachmentType = attachmentType;
    return this;
  }

   /**
   * Get attachmentType
   * @return attachmentType
  **/
  @javax.annotation.Nonnull
  public AdvertiserAttachmentUploadV30AttachmentType getAttachmentType() {
    return attachmentType;
  }


  public void setAttachmentType(AdvertiserAttachmentUploadV30AttachmentType attachmentType) {
    this.attachmentType = attachmentType;
  }


  public AdvertiserAttachmentUploadV30Request filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 文件名 注意：不要包含文件路径，不要含有&#39;/&#39;等非法字符
   * @return filename
  **/
  @javax.annotation.Nonnull
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public AdvertiserAttachmentUploadV30Request imageData(File imageData) {
    
    this.imageData = imageData;
    return this;
  }

   /**
   * 图片数据
   * @return imageData
  **/
  @javax.annotation.Nonnull
  public File getImageData() {
    return imageData;
  }


  public void setImageData(File imageData) {
    this.imageData = imageData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdvertiserAttachmentUploadV30Request advertiserAttachmentUploadV30Request = (AdvertiserAttachmentUploadV30Request) o;
    return Objects.equals(this.advertiserId, advertiserAttachmentUploadV30Request.advertiserId) &&
        Objects.equals(this.attachmentType, advertiserAttachmentUploadV30Request.attachmentType) &&
        Objects.equals(this.filename, advertiserAttachmentUploadV30Request.filename) &&
        Objects.equals(this.imageData, advertiserAttachmentUploadV30Request.imageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, attachmentType, filename, imageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdvertiserAttachmentUploadV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    attachmentType: ").append(toIndentedString(attachmentType)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("attachment_type");
    openapiFields.add("filename");
    openapiFields.add("image_data");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("attachment_type");
    openapiRequiredFields.add("filename");
    openapiRequiredFields.add("image_data");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdvertiserAttachmentUploadV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdvertiserAttachmentUploadV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdvertiserAttachmentUploadV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdvertiserAttachmentUploadV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<AdvertiserAttachmentUploadV30Request>() {
           @Override
           public void write(JsonWriter out, AdvertiserAttachmentUploadV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdvertiserAttachmentUploadV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdvertiserAttachmentUploadV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdvertiserAttachmentUploadV30Request
  * @throws IOException if the JSON string is invalid with respect to AdvertiserAttachmentUploadV30Request
  */
  public static AdvertiserAttachmentUploadV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdvertiserAttachmentUploadV30Request.class);
  }

 /**
  * Convert an instance of AdvertiserAttachmentUploadV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

