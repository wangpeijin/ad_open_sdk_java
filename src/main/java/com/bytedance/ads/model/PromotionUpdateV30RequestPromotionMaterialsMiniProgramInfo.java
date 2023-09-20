/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo {
  public static final String SERIALIZED_NAME_APP_ID = "app_id";
  @SerializedName(SERIALIZED_NAME_APP_ID)
  private String appId = null;

  public static final String SERIALIZED_NAME_PARAMS = "params";
  @SerializedName(SERIALIZED_NAME_PARAMS)
  private String params = null;

  public static final String SERIALIZED_NAME_START_PATH = "start_path";
  @SerializedName(SERIALIZED_NAME_START_PATH)
  private String startPath = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url = null;

  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo() {
  }

  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo appId(String appId) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo params(String params) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo startPath(String startPath) {
    
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


  public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo url(String url) {
    
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo promotionUpdateV30RequestPromotionMaterialsMiniProgramInfo = (PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo) o;
    return Objects.equals(this.appId, promotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.appId) &&
        Objects.equals(this.params, promotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.params) &&
        Objects.equals(this.startPath, promotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.startPath) &&
        Objects.equals(this.url, promotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, params, startPath, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
    sb.append("    startPath: ").append(toIndentedString(startPath)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
    openapiFields.add("params");
    openapiFields.add("start_path");
    openapiFields.add("url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo>() {
           @Override
           public void write(JsonWriter out, PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo
  * @throws IOException if the JSON string is invalid with respect to PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo
  */
  public static PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo.class);
  }

 /**
  * Convert an instance of PromotionUpdateV30RequestPromotionMaterialsMiniProgramInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

