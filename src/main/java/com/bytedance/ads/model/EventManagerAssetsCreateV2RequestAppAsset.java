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
import com.bytedance.ads.model.EventManagerAssetsCreateV2AppAssetAppCreateType;
import com.bytedance.ads.model.EventManagerAssetsCreateV2AppAssetAppType;
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
 * 应用信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class EventManagerAssetsCreateV2RequestAppAsset {
  public static final String SERIALIZED_NAME_APP_CREATE_TYPE = "app_create_type";
  @SerializedName(SERIALIZED_NAME_APP_CREATE_TYPE)
  private EventManagerAssetsCreateV2AppAssetAppCreateType appCreateType = null;

  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private Long appId = null;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private EventManagerAssetsCreateV2AppAssetAppType appType = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_URL = "download_url";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URL)
  private String downloadUrl = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PACKAGE_ID = "package_id";
  @SerializedName(SERIALIZED_NAME_PACKAGE_ID)
  private String packageId = null;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName = null;

  public EventManagerAssetsCreateV2RequestAppAsset() {
  }

  public EventManagerAssetsCreateV2RequestAppAsset appCreateType(EventManagerAssetsCreateV2AppAssetAppCreateType appCreateType) {
    
    this.appCreateType = appCreateType;
    return this;
  }

   /**
   * Get appCreateType
   * @return appCreateType
  **/
  @javax.annotation.Nullable
  public EventManagerAssetsCreateV2AppAssetAppCreateType getAppCreateType() {
    return appCreateType;
  }


  public void setAppCreateType(EventManagerAssetsCreateV2AppAssetAppCreateType appCreateType) {
    this.appCreateType = appCreateType;
  }


  public EventManagerAssetsCreateV2RequestAppAsset appId(Long appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 应用ID，Android应用必填
   * @return appId
  **/
  @javax.annotation.Nullable
  public Long getAppId() {
    return appId;
  }


  public void setAppId(Long appId) {
    this.appId = appId;
  }


  public EventManagerAssetsCreateV2RequestAppAsset appType(EventManagerAssetsCreateV2AppAssetAppType appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * Get appType
   * @return appType
  **/
  @javax.annotation.Nonnull
  public EventManagerAssetsCreateV2AppAssetAppType getAppType() {
    return appType;
  }


  public void setAppType(EventManagerAssetsCreateV2AppAssetAppType appType) {
    this.appType = appType;
  }


  public EventManagerAssetsCreateV2RequestAppAsset downloadUrl(String downloadUrl) {
    
    this.downloadUrl = downloadUrl;
    return this;
  }

   /**
   * 应用下载链接，IOS、Android应用必填
   * @return downloadUrl
  **/
  @javax.annotation.Nonnull
  public String getDownloadUrl() {
    return downloadUrl;
  }


  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  public EventManagerAssetsCreateV2RequestAppAsset name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 应用名称，长度限制为125，一个字符长度为1，IOS、Android应用必填
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public EventManagerAssetsCreateV2RequestAppAsset packageId(String packageId) {
    
    this.packageId = packageId;
    return this;
  }

   /**
   * 母包ID，Android应用必填
   * @return packageId
  **/
  @javax.annotation.Nullable
  public String getPackageId() {
    return packageId;
  }


  public void setPackageId(String packageId) {
    this.packageId = packageId;
  }


  public EventManagerAssetsCreateV2RequestAppAsset packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 应用包名，长度限制为140，IOS、Android应用必填
   * @return packageName
  **/
  @javax.annotation.Nonnull
  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAssetsCreateV2RequestAppAsset eventManagerAssetsCreateV2RequestAppAsset = (EventManagerAssetsCreateV2RequestAppAsset) o;
    return Objects.equals(this.appCreateType, eventManagerAssetsCreateV2RequestAppAsset.appCreateType) &&
        Objects.equals(this.appId, eventManagerAssetsCreateV2RequestAppAsset.appId) &&
        Objects.equals(this.appType, eventManagerAssetsCreateV2RequestAppAsset.appType) &&
        Objects.equals(this.downloadUrl, eventManagerAssetsCreateV2RequestAppAsset.downloadUrl) &&
        Objects.equals(this.name, eventManagerAssetsCreateV2RequestAppAsset.name) &&
        Objects.equals(this.packageId, eventManagerAssetsCreateV2RequestAppAsset.packageId) &&
        Objects.equals(this.packageName, eventManagerAssetsCreateV2RequestAppAsset.packageName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appCreateType, appId, appType, downloadUrl, name, packageId, packageName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerAssetsCreateV2RequestAppAsset {\n");
    sb.append("    appCreateType: ").append(toIndentedString(appCreateType)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    packageId: ").append(toIndentedString(packageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
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
    openapiFields.add("app_create_type");
    openapiFields.add("app_id");
    openapiFields.add("app_type");
    openapiFields.add("download_url");
    openapiFields.add("name");
    openapiFields.add("package_id");
    openapiFields.add("package_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("app_type");
    openapiRequiredFields.add("download_url");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("package_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAssetsCreateV2RequestAppAsset.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAssetsCreateV2RequestAppAsset' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAssetsCreateV2RequestAppAsset> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAssetsCreateV2RequestAppAsset.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAssetsCreateV2RequestAppAsset>() {
           @Override
           public void write(JsonWriter out, EventManagerAssetsCreateV2RequestAppAsset value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAssetsCreateV2RequestAppAsset read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAssetsCreateV2RequestAppAsset given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAssetsCreateV2RequestAppAsset
  * @throws IOException if the JSON string is invalid with respect to EventManagerAssetsCreateV2RequestAppAsset
  */
  public static EventManagerAssetsCreateV2RequestAppAsset fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAssetsCreateV2RequestAppAsset.class);
  }

 /**
  * Convert an instance of EventManagerAssetsCreateV2RequestAppAsset to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

