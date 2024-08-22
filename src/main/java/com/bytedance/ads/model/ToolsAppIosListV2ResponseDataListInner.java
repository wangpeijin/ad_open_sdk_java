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
import com.bytedance.ads.model.ToolsAppIosListV2DataListStatus;
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
 * ToolsAppIosListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class ToolsAppIosListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_ICON_URL = "icon_url";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl = null;

  public static final String SERIALIZED_NAME_ITUNES_ID = "itunes_id";
  @SerializedName(SERIALIZED_NAME_ITUNES_ID)
  private Long itunesId = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private Long packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsAppIosListV2DataListStatus status = null;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version = null;

  public ToolsAppIosListV2ResponseDataListInner() {
  }

  public ToolsAppIosListV2ResponseDataListInner appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public ToolsAppIosListV2ResponseDataListInner downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 
   * @return downloadUrl
  **/
  @javax.annotation.Nullable
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public ToolsAppIosListV2ResponseDataListInner iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * 
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }


  public ToolsAppIosListV2ResponseDataListInner itunesId(Long itunesId) {
    
    this.itunesId = itunesId;
    return this;
  }

   /**
   * 
   * @return itunesId
  **/
  @javax.annotation.Nullable
  public Long getItunesId() {
    return itunesId;
  }


  public void setItunesId(Long itunesId) {
    this.itunesId = itunesId;
  }


  public ToolsAppIosListV2ResponseDataListInner packageId(Long packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 
   * @return packageId
  **/
  @javax.annotation.Nullable
  public Long getPackageId() {
    return packageId;
  }


  public void setPackageId(Long packageId) {
    this.packageId = packageId;
  }


  public ToolsAppIosListV2ResponseDataListInner packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 
   * @return packageName
  **/
  @javax.annotation.Nullable
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public ToolsAppIosListV2ResponseDataListInner status(ToolsAppIosListV2DataListStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsAppIosListV2DataListStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsAppIosListV2DataListStatus status) {
    this.status = status;
  }


  public ToolsAppIosListV2ResponseDataListInner version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * 
   * @return version
  **/
  @javax.annotation.Nullable
  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAppIosListV2ResponseDataListInner toolsAppIosListV2ResponseDataListInner = (ToolsAppIosListV2ResponseDataListInner) o;
    return Objects.equals(this.appName, toolsAppIosListV2ResponseDataListInner.appName) &&
        Objects.equals(this.downloadUrl, toolsAppIosListV2ResponseDataListInner.downloadUrl) &&
        Objects.equals(this.iconUrl, toolsAppIosListV2ResponseDataListInner.iconUrl) &&
        Objects.equals(this.itunesId, toolsAppIosListV2ResponseDataListInner.itunesId) &&
        Objects.equals(this.packageId, toolsAppIosListV2ResponseDataListInner.packageId) &&
        Objects.equals(this.packageName, toolsAppIosListV2ResponseDataListInner.packageName) &&
        Objects.equals(this.status, toolsAppIosListV2ResponseDataListInner.status) &&
        Objects.equals(this.version, toolsAppIosListV2ResponseDataListInner.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, downloadUrl, iconUrl, itunesId, packageId, packageName, status, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsAppIosListV2ResponseDataListInner {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
    sb.append("    itunesId: ").append(toIndentedString(itunesId)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("download_url");
    openapiFields.add("icon_url");
    openapiFields.add("itunes_id");
    openapiFields.add("package_id");
    openapiFields.add("package_name");
    openapiFields.add("status");
    openapiFields.add("version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAppIosListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAppIosListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAppIosListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAppIosListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAppIosListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAppIosListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAppIosListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAppIosListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAppIosListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAppIosListV2ResponseDataListInner
  */
  public static ToolsAppIosListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAppIosListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAppIosListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

