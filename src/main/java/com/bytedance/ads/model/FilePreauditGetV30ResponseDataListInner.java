/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.FilePreauditGetV30DataListMaterialChannel;
import com.bytedance.ads.model.FilePreauditGetV30DataListMaterialType;
import com.bytedance.ads.model.FilePreauditGetV30DataListStatus;
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
 * FilePreauditGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class FilePreauditGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ERRMSG = "errmsg";
  @SerializedName(SERIALIZED_NAME_ERRMSG)
  private String errmsg = null;

  public static final String SERIALIZED_NAME_MATERIAL_CHANNEL = "material_channel";
  @SerializedName(SERIALIZED_NAME_MATERIAL_CHANNEL)
  private FilePreauditGetV30DataListMaterialChannel materialChannel = null;

  public static final String SERIALIZED_NAME_MATERIAL_TYPE = "material_type";
  @SerializedName(SERIALIZED_NAME_MATERIAL_TYPE)
  private FilePreauditGetV30DataListMaterialType materialType = null;

  public static final String SERIALIZED_NAME_PREAUDIT_ID = "preaudit_id";
  @SerializedName(SERIALIZED_NAME_PREAUDIT_ID)
  private Long preauditId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private FilePreauditGetV30DataListStatus status = null;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl = null;

  public FilePreauditGetV30ResponseDataListInner() {
  }

  public FilePreauditGetV30ResponseDataListInner errmsg(String errmsg) {
    
    this.errmsg = errmsg;
    return this;
  }

   /**
   * 
   * @return errmsg
  **/
  @javax.annotation.Nullable
  public String getErrmsg() {
    return errmsg;
  }


  public void setErrmsg(String errmsg) {
    this.errmsg = errmsg;
  }


  public FilePreauditGetV30ResponseDataListInner materialChannel(FilePreauditGetV30DataListMaterialChannel materialChannel) {
    
    this.materialChannel = materialChannel;
    return this;
  }

   /**
   * Get materialChannel
   * @return materialChannel
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30DataListMaterialChannel getMaterialChannel() {
    return materialChannel;
  }


  public void setMaterialChannel(FilePreauditGetV30DataListMaterialChannel materialChannel) {
    this.materialChannel = materialChannel;
  }


  public FilePreauditGetV30ResponseDataListInner materialType(FilePreauditGetV30DataListMaterialType materialType) {
    
    this.materialType = materialType;
    return this;
  }

   /**
   * Get materialType
   * @return materialType
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30DataListMaterialType getMaterialType() {
    return materialType;
  }


  public void setMaterialType(FilePreauditGetV30DataListMaterialType materialType) {
    this.materialType = materialType;
  }


  public FilePreauditGetV30ResponseDataListInner preauditId(Long preauditId) {
    
    this.preauditId = preauditId;
    return this;
  }

   /**
   * 
   * @return preauditId
  **/
  @javax.annotation.Nullable
  public Long getPreauditId() {
    return preauditId;
  }


  public void setPreauditId(Long preauditId) {
    this.preauditId = preauditId;
  }


  public FilePreauditGetV30ResponseDataListInner status(FilePreauditGetV30DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public FilePreauditGetV30DataListStatus getStatus() {
    return status;
  }


  public void setStatus(FilePreauditGetV30DataListStatus status) {
    this.status = status;
  }


  public FilePreauditGetV30ResponseDataListInner videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FilePreauditGetV30ResponseDataListInner filePreauditGetV30ResponseDataListInner = (FilePreauditGetV30ResponseDataListInner) o;
    return Objects.equals(this.errmsg, filePreauditGetV30ResponseDataListInner.errmsg) &&
        Objects.equals(this.materialChannel, filePreauditGetV30ResponseDataListInner.materialChannel) &&
        Objects.equals(this.materialType, filePreauditGetV30ResponseDataListInner.materialType) &&
        Objects.equals(this.preauditId, filePreauditGetV30ResponseDataListInner.preauditId) &&
        Objects.equals(this.status, filePreauditGetV30ResponseDataListInner.status) &&
        Objects.equals(this.videoUrl, filePreauditGetV30ResponseDataListInner.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errmsg, materialChannel, materialType, preauditId, status, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FilePreauditGetV30ResponseDataListInner {\n");
    sb.append("    errmsg: ").append(toIndentedString(errmsg)).append("\n");
    sb.append("    materialChannel: ").append(toIndentedString(materialChannel)).append("\n");
    sb.append("    materialType: ").append(toIndentedString(materialType)).append("\n");
    sb.append("    preauditId: ").append(toIndentedString(preauditId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("errmsg");
    openapiFields.add("material_channel");
    openapiFields.add("material_type");
    openapiFields.add("preaudit_id");
    openapiFields.add("status");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("errmsg");
    openapiRequiredFields.add("material_channel");
    openapiRequiredFields.add("material_type");
    openapiRequiredFields.add("preaudit_id");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("video_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!FilePreauditGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'FilePreauditGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<FilePreauditGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(FilePreauditGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<FilePreauditGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, FilePreauditGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public FilePreauditGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of FilePreauditGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of FilePreauditGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to FilePreauditGetV30ResponseDataListInner
  */
  public static FilePreauditGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, FilePreauditGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of FilePreauditGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

