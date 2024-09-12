/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FileImageAdV2UploadType;
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
 * FileImageAdV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class FileImageAdV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_FILENAME = "filename";
  @SerializedName(SERIALIZED_NAME_FILENAME)
  private String filename = null;

  public static final String SERIALIZED_NAME_IMAGE_FILE = "image_file";
  @SerializedName(SERIALIZED_NAME_IMAGE_FILE)
  private File imageFile = null;

  public static final String SERIALIZED_NAME_IMAGE_SIGNATURE = "image_signature";
  @SerializedName(SERIALIZED_NAME_IMAGE_SIGNATURE)
  private String imageSignature = null;

  public static final String SERIALIZED_NAME_IMAGE_URL = "image_url";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl = null;

  public static final String SERIALIZED_NAME_IS_AIGC = "is_aigc";
  @SerializedName(SERIALIZED_NAME_IS_AIGC)
  private Boolean isAigc = null;

  public static final String SERIALIZED_NAME_UPLOAD_TYPE = "upload_type";
  @SerializedName(SERIALIZED_NAME_UPLOAD_TYPE)
  private FileImageAdV2UploadType uploadType = null;

  public FileImageAdV2Request() {
  }

  public FileImageAdV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID 
   * @return advertiserId
  **/
  @javax.annotation.Nonnull
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public FileImageAdV2Request filename(String filename) {
    
    this.filename = filename;
    return this;
  }

   /**
   * 素材的文件名，可自定义素材名，不传则默认取文件名，最长255个字符 注：若同一素材已进行上传，重新上传不会改名
   * @return filename
  **/
  @javax.annotation.Nullable
  public String getFilename() {
    return filename;
  }


  public void setFilename(String filename) {
    this.filename = filename;
  }


  public FileImageAdV2Request imageFile(File imageFile) {
    
    this.imageFile = imageFile;
    return this;
  }

   /**
   * 图片文件 upload_type为UPLOAD_BY_FILE必填 格式: jpg、jpeg、png、bmp、gif, 大小1.5M内
   * @return imageFile
  **/
  @javax.annotation.Nullable
  public File getImageFile() {
    return imageFile;
  }


  public void setImageFile(File imageFile) {
    this.imageFile = imageFile;
  }


  public FileImageAdV2Request imageSignature(String imageSignature) {
    
    this.imageSignature = imageSignature;
    return this;
  }

   /**
   * 图片的md5值(用于服务端校验) upload_type为UPLOAD_BY_FILE
   * @return imageSignature
  **/
  @javax.annotation.Nullable
  public String getImageSignature() {
    return imageSignature;
  }


  public void setImageSignature(String imageSignature) {
    this.imageSignature = imageSignature;
  }


  public FileImageAdV2Request imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * 图片url地址，如http://xxx.xxx upload_type为UPLOAD_BY_URL必填
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public FileImageAdV2Request isAigc(Boolean isAigc) {
    
    this.isAigc = isAigc;
    return this;
  }

   /**
   * 图片素材是否为AIGC生成
   * @return isAigc
  **/
  @javax.annotation.Nullable
  public Boolean getIsAigc() {
    return isAigc;
  }


  public void setIsAigc(Boolean isAigc) {
    this.isAigc = isAigc;
  }


  public FileImageAdV2Request uploadType(FileImageAdV2UploadType uploadType) {
    
    this.uploadType = uploadType;
    return this;
  }

   /**
   * Get uploadType
   * @return uploadType
  **/
  @javax.annotation.Nullable
  public FileImageAdV2UploadType getUploadType() {
    return uploadType;
  }


  public void setUploadType(FileImageAdV2UploadType uploadType) {
    this.uploadType = uploadType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FileImageAdV2Request fileImageAdV2Request = (FileImageAdV2Request) o;
    return Objects.equals(this.advertiserId, fileImageAdV2Request.advertiserId) &&
        Objects.equals(this.filename, fileImageAdV2Request.filename) &&
        Objects.equals(this.imageFile, fileImageAdV2Request.imageFile) &&
        Objects.equals(this.imageSignature, fileImageAdV2Request.imageSignature) &&
        Objects.equals(this.imageUrl, fileImageAdV2Request.imageUrl) &&
        Objects.equals(this.isAigc, fileImageAdV2Request.isAigc) &&
        Objects.equals(this.uploadType, fileImageAdV2Request.uploadType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, filename, imageFile, imageSignature, imageUrl, isAigc, uploadType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FileImageAdV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    filename: ").append(toIndentedString(filename)).append("\n");
    sb.append("    imageFile: ").append(toIndentedString(imageFile)).append("\n");
    sb.append("    imageSignature: ").append(toIndentedString(imageSignature)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    isAigc: ").append(toIndentedString(isAigc)).append("\n");
    sb.append("    uploadType: ").append(toIndentedString(uploadType)).append("\n");
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
    openapiFields.add("filename");
    openapiFields.add("image_file");
    openapiFields.add("image_signature");
    openapiFields.add("image_url");
    openapiFields.add("is_aigc");
    openapiFields.add("upload_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FileImageAdV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FileImageAdV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FileImageAdV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FileImageAdV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<FileImageAdV2Request>() {
           @Override
           public void write(JsonWriter out, FileImageAdV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FileImageAdV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FileImageAdV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FileImageAdV2Request
  * @throws IOException if the JSON string is invalid with respect to FileImageAdV2Request
  */
  public static FileImageAdV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FileImageAdV2Request.class);
  }

 /**
  * Convert an instance of FileImageAdV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

