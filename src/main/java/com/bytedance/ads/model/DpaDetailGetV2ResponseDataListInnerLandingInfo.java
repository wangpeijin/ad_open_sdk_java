/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class DpaDetailGetV2ResponseDataListInnerLandingInfo {
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

  public DpaDetailGetV2ResponseDataListInnerLandingInfo() {
  }

  public DpaDetailGetV2ResponseDataListInnerLandingInfo targetUrl(String targetUrl) {
    
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


  public DpaDetailGetV2ResponseDataListInnerLandingInfo targetUrlAndroidApp(String targetUrlAndroidApp) {
    
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


  public DpaDetailGetV2ResponseDataListInnerLandingInfo targetUrlIosApp(String targetUrlIosApp) {
    
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


  public DpaDetailGetV2ResponseDataListInnerLandingInfo targetUrlMobile(String targetUrlMobile) {
    
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


  public DpaDetailGetV2ResponseDataListInnerLandingInfo targetUrlUniversalLink(String targetUrlUniversalLink) {
    
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
    DpaDetailGetV2ResponseDataListInnerLandingInfo dpaDetailGetV2ResponseDataListInnerLandingInfo = (DpaDetailGetV2ResponseDataListInnerLandingInfo) o;
    return Objects.equals(this.targetUrl, dpaDetailGetV2ResponseDataListInnerLandingInfo.targetUrl) &&
        Objects.equals(this.targetUrlAndroidApp, dpaDetailGetV2ResponseDataListInnerLandingInfo.targetUrlAndroidApp) &&
        Objects.equals(this.targetUrlIosApp, dpaDetailGetV2ResponseDataListInnerLandingInfo.targetUrlIosApp) &&
        Objects.equals(this.targetUrlMobile, dpaDetailGetV2ResponseDataListInnerLandingInfo.targetUrlMobile) &&
        Objects.equals(this.targetUrlUniversalLink, dpaDetailGetV2ResponseDataListInnerLandingInfo.targetUrlUniversalLink);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(targetUrl, targetUrlAndroidApp, targetUrlIosApp, targetUrlMobile, targetUrlUniversalLink);
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
    sb.append("class DpaDetailGetV2ResponseDataListInnerLandingInfo {\n");
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
       if (!DpaDetailGetV2ResponseDataListInnerLandingInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DpaDetailGetV2ResponseDataListInnerLandingInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DpaDetailGetV2ResponseDataListInnerLandingInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DpaDetailGetV2ResponseDataListInnerLandingInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<DpaDetailGetV2ResponseDataListInnerLandingInfo>() {
           @Override
           public void write(JsonWriter out, DpaDetailGetV2ResponseDataListInnerLandingInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DpaDetailGetV2ResponseDataListInnerLandingInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DpaDetailGetV2ResponseDataListInnerLandingInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DpaDetailGetV2ResponseDataListInnerLandingInfo
  * @throws IOException if the JSON string is invalid with respect to DpaDetailGetV2ResponseDataListInnerLandingInfo
  */
  public static DpaDetailGetV2ResponseDataListInnerLandingInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DpaDetailGetV2ResponseDataListInnerLandingInfo.class);
  }

 /**
  * Convert an instance of DpaDetailGetV2ResponseDataListInnerLandingInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

