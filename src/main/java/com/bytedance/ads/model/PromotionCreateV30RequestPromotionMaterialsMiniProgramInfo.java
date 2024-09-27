/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-27T11:41:26.016527974+08:00[Asia/Shanghai]")
public class PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_AUTO = "auto";
  @SerializedName(SERIALIZED_NAME_AUTO)
  private List<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner> auto = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params = null;

  public static final String SERIALIZED_NAME_START_PATH = "start_path";
  @SerializedName(SERIALIZED_NAME_START_PATH)
  private String startPath = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public static final String SERIALIZED_NAME_URLS = "urls";
  @SerializedName(SERIALIZED_NAME_URLS)
  private List<String> urls = null;

  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo() {
  }

  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo appId(String appId) {
    
    this.appId = appId;
    return this;
  }

   /**
   * 
   * @return appId
  **/
  @javax.annotation.Nullable
  public String getAppId() {
    return appId;
  }


  public void setAppId(String appId) {
    this.appId = appId;
  }


  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo auto(List<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner> auto) {
    
    this.auto = auto;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo addAutoItem(PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner autoItem) {
    if (this.auto == null) {
      this.auto = new ArrayList<>();
    }
    this.auto.add(autoItem);
    return this;
  }

   /**
   * 
   * @return auto
  **/
  @javax.annotation.Nullable
  public List<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner> getAuto() {
    return auto;
  }


  public void setAuto(List<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfoAutoInner> auto) {
    this.auto = auto;
  }


  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo params(String params) {
    
    this.params = params;
    return this;
  }

   /**
   * 
   * @return params
  **/
  @javax.annotation.Nullable
  public String getParams() {
    return params;
  }


  public void setParams(String params) {
    this.params = params;
  }


  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo startPath(String startPath) {
    
    this.startPath = startPath;
    return this;
  }

   /**
   * 
   * @return startPath
  **/
  @javax.annotation.Nullable
  public String getStartPath() {
    return startPath;
  }


  public void setStartPath(String startPath) {
    this.startPath = startPath;
  }


  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * 
   * @return url
  **/
  @javax.annotation.Nullable
  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo urls(List<String> urls) {
    
    this.urls = urls;
    return this;
  }

  public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo addUrlsItem(String urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * 字节小程序调起链接（多个），支持传入1条以上url，传输会检查url正确性
   * @return urls
  **/
  @javax.annotation.Nullable
  public List<String> getUrls() {
    return urls;
  }


  public void setUrls(List<String> urls) {
    this.urls = urls;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo promotionCreateV30RequestPromotionMaterialsMiniProgramInfo = (PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo) o;
    return Objects.equals(this.appId, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.appId) &&
        Objects.equals(this.auto, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.auto) &&
        Objects.equals(this.params, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.params) &&
        Objects.equals(this.startPath, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.startPath) &&
        Objects.equals(this.url, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.url) &&
        Objects.equals(this.urls, promotionCreateV30RequestPromotionMaterialsMiniProgramInfo.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, auto, params, startPath, url, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    auto: ").append(toIndentedString(auto)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    startPath: ").append(toIndentedString(startPath)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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
    openapiFields.add("app_id");
    openapiFields.add("auto");
    openapiFields.add("params");
    openapiFields.add("start_path");
    openapiFields.add("url");
    openapiFields.add("urls");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo>() {
           @Override
           public void write(JsonWriter out, PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo
  */
  public static PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo.class);
  }

 /**
  * Convert an instance of PromotionCreateV30RequestPromotionMaterialsMiniProgramInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

