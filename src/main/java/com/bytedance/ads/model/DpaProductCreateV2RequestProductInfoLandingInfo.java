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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-27T14:13:14.270404670+08:00[PRC]")
public class DpaProductCreateV2RequestProductInfoLandingInfo {
  public static final String SERIALIZED_NAME_TARGET_URL = "target_url";
  @SerializedName(SERIALIZED_NAME_TARGET_URL)
  private String targetUrl = null;

  public static final String SERIALIZED_NAME_TARGET_URL_ANDROID_APP = "target_url_android_app";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_ANDROID_APP)
  private String targetUrlAndroidApp = null;

  public static final String SERIALIZED_NAME_TARGET_URL_IOS_APP = "target_url_ios_app";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_IOS_APP)
  private String targetUrlIosApp = null;

  public static final String SERIALIZED_NAME_TARGET_URL_MOBILE = "target_url_mobile";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_MOBILE)
  private String targetUrlMobile = null;

  public static final String SERIALIZED_NAME_TARGET_URL_UNIVERSAL_LINK = "target_url_universal_link";
  @SerializedName(SERIALIZED_NAME_TARGET_URL_UNIVERSAL_LINK)
  private String targetUrlUniversalLink = null;

  public DpaProductCreateV2RequestProductInfoLandingInfo() {
  }

  public DpaProductCreateV2RequestProductInfoLandingInfo targetUrl(String targetUrl) {
    
    this.targetUrl = targetUrl;
    return this;
  }

   /**
   * 
   * @return targetUrl
  **/
  @javax.annotation.Nullable
  public String getTargetUrl() {
    return targetUrl;
  }


  public void setTargetUrl(String targetUrl) {
    this.targetUrl = targetUrl;
  }


  public DpaProductCreateV2RequestProductInfoLandingInfo targetUrlAndroidApp(String targetUrlAndroidApp) {
    
    this.targetUrlAndroidApp = targetUrlAndroidApp;
    return this;
  }

   /**
   * 
   * @return targetUrlAndroidApp
  **/
  @javax.annotation.Nullable
  public String getTargetUrlAndroidApp() {
    return targetUrlAndroidApp;
  }


  public void setTargetUrlAndroidApp(String targetUrlAndroidApp) {
    this.targetUrlAndroidApp = targetUrlAndroidApp;
  }


  public DpaProductCreateV2RequestProductInfoLandingInfo targetUrlIosApp(String targetUrlIosApp) {
    
    this.targetUrlIosApp = targetUrlIosApp;
    return this;
  }

   /**
   * 
   * @return targetUrlIosApp
  **/
  @javax.annotation.Nullable
  public String getTargetUrlIosApp() {
    return targetUrlIosApp;
  }


  public void setTargetUrlIosApp(String targetUrlIosApp) {
    this.targetUrlIosApp = targetUrlIosApp;
  }


  public DpaProductCreateV2RequestProductInfoLandingInfo targetUrlMobile(String targetUrlMobile) {
    
    this.targetUrlMobile = targetUrlMobile;
    return this;
  }

   /**
   * 
   * @return targetUrlMobile
  **/
  @javax.annotation.Nullable
  public String getTargetUrlMobile() {
    return targetUrlMobile;
  }


  public void setTargetUrlMobile(String targetUrlMobile) {
    this.targetUrlMobile = targetUrlMobile;
  }


  public DpaProductCreateV2RequestProductInfoLandingInfo targetUrlUniversalLink(String targetUrlUniversalLink) {
    
    this.targetUrlUniversalLink = targetUrlUniversalLink;
    return this;
  }

   /**
   * 
   * @return targetUrlUniversalLink
  **/
  @javax.annotation.Nullable
  public String getTargetUrlUniversalLink() {
    return targetUrlUniversalLink;
  }


  public void setTargetUrlUniversalLink(String targetUrlUniversalLink) {
    this.targetUrlUniversalLink = targetUrlUniversalLink;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DpaProductCreateV2RequestProductInfoLandingInfo dpaProductCreateV2RequestProductInfoLandingInfo = (DpaProductCreateV2RequestProductInfoLandingInfo) o;
    return Objects.equals(this.targetUrl, dpaProductCreateV2RequestProductInfoLandingInfo.targetUrl) &&
        Objects.equals(this.targetUrlAndroidApp, dpaProductCreateV2RequestProductInfoLandingInfo.targetUrlAndroidApp) &&
        Objects.equals(this.targetUrlIosApp, dpaProductCreateV2RequestProductInfoLandingInfo.targetUrlIosApp) &&
        Objects.equals(this.targetUrlMobile, dpaProductCreateV2RequestProductInfoLandingInfo.targetUrlMobile) &&
        Objects.equals(this.targetUrlUniversalLink, dpaProductCreateV2RequestProductInfoLandingInfo.targetUrlUniversalLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUrl, targetUrlAndroidApp, targetUrlIosApp, targetUrlMobile, targetUrlUniversalLink);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DpaProductCreateV2RequestProductInfoLandingInfo {\n");
    sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
    sb.append("    targetUrlAndroidApp: ").append(toIndentedString(targetUrlAndroidApp)).append("\n");
    sb.append("    targetUrlIosApp: ").append(toIndentedString(targetUrlIosApp)).append("\n");
    sb.append("    targetUrlMobile: ").append(toIndentedString(targetUrlMobile)).append("\n");
    sb.append("    targetUrlUniversalLink: ").append(toIndentedString(targetUrlUniversalLink)).append("\n");
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
    openapiFields.add("target_url");
    openapiFields.add("target_url_android_app");
    openapiFields.add("target_url_ios_app");
    openapiFields.add("target_url_mobile");
    openapiFields.add("target_url_universal_link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DpaProductCreateV2RequestProductInfoLandingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaProductCreateV2RequestProductInfoLandingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaProductCreateV2RequestProductInfoLandingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaProductCreateV2RequestProductInfoLandingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaProductCreateV2RequestProductInfoLandingInfo>() {
           @Override
           public void write(JsonWriter out, DpaProductCreateV2RequestProductInfoLandingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaProductCreateV2RequestProductInfoLandingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaProductCreateV2RequestProductInfoLandingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaProductCreateV2RequestProductInfoLandingInfo
  * @throws IOException if the JSON string is invalid with respect to DpaProductCreateV2RequestProductInfoLandingInfo
  */
  public static DpaProductCreateV2RequestProductInfoLandingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaProductCreateV2RequestProductInfoLandingInfo.class);
  }

 /**
  * Convert an instance of DpaProductCreateV2RequestProductInfoLandingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

