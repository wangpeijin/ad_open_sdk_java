/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag;
import com.bytedance.ads.model.ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileType;
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
 * ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner {
  public static final String SERIALIZED_NAME_FILE_TAG = "file_tag";
  @SerializedName(SERIALIZED_NAME_FILE_TAG)
  private ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag fileTag = null;

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileType fileType = null;

  public static final String SERIALIZED_NAME_UPLOAD_ID = "upload_id";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ID)
  private Long uploadId = null;

  public ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner() {
  }

  public ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner fileTag(ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag fileTag) {
    
    this.fileTag = fileTag;
    return this;
  }

   /**
   * Get fileTag
   * @return fileTag
  **/
  @javax.annotation.Nullable
  public ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag getFileTag() {
    return fileTag;
  }


  public void setFileTag(ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileTag fileTag) {
    this.fileTag = fileTag;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner fileType(ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileType getFileType() {
    return fileType;
  }


  public void setFileType(ToolsAppManagementAndroidBasicPackageUpdateV2FilesFileType fileType) {
    this.fileType = fileType;
  }


  public ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner uploadId(Long uploadId) {
    
    this.uploadId = uploadId;
    return this;
  }

   /**
   * 文件上传id
   * @return uploadId
  **/
  @javax.annotation.Nonnull
  public Long getUploadId() {
    return uploadId;
  }


  public void setUploadId(Long uploadId) {
    this.uploadId = uploadId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner toolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner = (ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner) o;
    return Objects.equals(this.fileTag, toolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.fileTag) &&
        Objects.equals(this.fileType, toolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.fileType) &&
        Objects.equals(this.uploadId, toolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.uploadId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileTag, fileType, uploadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner {\n");
    sb.append("    fileTag: ").append(toIndentedString(fileTag)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
    openapiFields.add("file_tag");
    openapiFields.add("file_type");
    openapiFields.add("upload_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("file_type");
    openapiRequiredFields.add("upload_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner
  */
  public static ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner.class);
  }

 /**
  * Convert an instance of ToolsAppManagementAndroidBasicPackageUpdateV2RequestFilesInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

