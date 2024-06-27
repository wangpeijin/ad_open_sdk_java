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
import com.bytedance.ads.model.ToolsAppManagementUploadTaskCreateV2AccountType;
import com.bytedance.ads.model.ToolsAppManagementUploadTaskCreateV2FileType;
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
 * ToolsAppManagementUploadTaskCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class ToolsAppManagementUploadTaskCreateV2Request {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private ToolsAppManagementUploadTaskCreateV2AccountType accountType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_FILE_TYPE = "file_type";
  @SerializedName(SERIALIZED_NAME_FILE_TYPE)
  private ToolsAppManagementUploadTaskCreateV2FileType fileType = null;

  public static final String SERIALIZED_NAME_MD5 = "md5";
  @SerializedName(SERIALIZED_NAME_MD5)
  private String md5 = null;

  public ToolsAppManagementUploadTaskCreateV2Request() {
  }

  public ToolsAppManagementUploadTaskCreateV2Request accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 账户id指可以接的账号体系如广告主id、巨量纵横组织id等
   * minimum: 1
   * @return accountId
  **/
  @javax.annotation.Nonnull
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public ToolsAppManagementUploadTaskCreateV2Request accountType(ToolsAppManagementUploadTaskCreateV2AccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementUploadTaskCreateV2AccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(ToolsAppManagementUploadTaskCreateV2AccountType accountType) {
    this.accountType = accountType;
  }


  public ToolsAppManagementUploadTaskCreateV2Request downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 上传文件下载链接，长度最长255
   * @return downloadUrl
  **/
  @javax.annotation.Nonnull
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsAppManagementUploadTaskCreateV2Request fileType(ToolsAppManagementUploadTaskCreateV2FileType fileType) {
    
    this.fileType = fileType;
    return this;
  }

   /**
   * Get fileType
   * @return fileType
  **/
  @javax.annotation.Nonnull
  public ToolsAppManagementUploadTaskCreateV2FileType getFileType() {
    return fileType;
  }


  public void setFileType(ToolsAppManagementUploadTaskCreateV2FileType fileType) {
    this.fileType = fileType;
  }


  public ToolsAppManagementUploadTaskCreateV2Request md5(String md5) {
    
    this.md5 = md5;
    return this;
  }

   /**
   * 文件md5，用于文件校验
   * @return md5
  **/
  @javax.annotation.Nonnull
  public String getMd5() {
    return md5;
  }


  public void setMd5(String md5) {
    this.md5 = md5;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppManagementUploadTaskCreateV2Request toolsAppManagementUploadTaskCreateV2Request = (ToolsAppManagementUploadTaskCreateV2Request) o;
    return Objects.equals(this.accountId, toolsAppManagementUploadTaskCreateV2Request.accountId) &&
        Objects.equals(this.accountType, toolsAppManagementUploadTaskCreateV2Request.accountType) &&
        Objects.equals(this.downloadUrl, toolsAppManagementUploadTaskCreateV2Request.downloadUrl) &&
        Objects.equals(this.fileType, toolsAppManagementUploadTaskCreateV2Request.fileType) &&
        Objects.equals(this.md5, toolsAppManagementUploadTaskCreateV2Request.md5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType, downloadUrl, fileType, md5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppManagementUploadTaskCreateV2Request {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    fileType: ").append(toIndentedString(fileType)).append("\n");
    sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");
    openapiFields.add("download_url");
    openapiFields.add("file_type");
    openapiFields.add("md5");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("account_id");
    openapiRequiredFields.add("account_type");
    openapiRequiredFields.add("download_url");
    openapiRequiredFields.add("file_type");
    openapiRequiredFields.add("md5");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppManagementUploadTaskCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppManagementUploadTaskCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppManagementUploadTaskCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppManagementUploadTaskCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppManagementUploadTaskCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsAppManagementUploadTaskCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppManagementUploadTaskCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppManagementUploadTaskCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppManagementUploadTaskCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsAppManagementUploadTaskCreateV2Request
  */
  public static ToolsAppManagementUploadTaskCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppManagementUploadTaskCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsAppManagementUploadTaskCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

