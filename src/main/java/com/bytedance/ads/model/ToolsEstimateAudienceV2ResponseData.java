/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ResponseDataAweme;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ResponseDataTomatoNovelApp;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ResponseDataToutiao;
import com.bytedance.ads.model.ToolsEstimateAudienceV2ResponseDataVideoApp;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class ToolsEstimateAudienceV2ResponseData {
  public static final String SERIALIZED_NAME_AWEME = "aweme";
  @SerializedName(SERIALIZED_NAME_AWEME)
  private ToolsEstimateAudienceV2ResponseDataAweme aweme = null;

  public static final String SERIALIZED_NAME_TOMATO_NOVEL_APP = "tomato_novel_app";
  @SerializedName(SERIALIZED_NAME_TOMATO_NOVEL_APP)
  private ToolsEstimateAudienceV2ResponseDataTomatoNovelApp tomatoNovelApp = null;

  public static final String SERIALIZED_NAME_TOUTIAO = "toutiao";
  @SerializedName(SERIALIZED_NAME_TOUTIAO)
  private ToolsEstimateAudienceV2ResponseDataToutiao toutiao = null;

  public static final String SERIALIZED_NAME_VIDEO_APP = "video_app";
  @SerializedName(SERIALIZED_NAME_VIDEO_APP)
  private ToolsEstimateAudienceV2ResponseDataVideoApp videoApp = null;

  public ToolsEstimateAudienceV2ResponseData() {
  }

  public ToolsEstimateAudienceV2ResponseData aweme(ToolsEstimateAudienceV2ResponseDataAweme aweme) {
    
    this.aweme = aweme;
    return this;
  }

   /**
   * Get aweme
   * @return aweme
  **/
  @javax.annotation.Nullable
  public ToolsEstimateAudienceV2ResponseDataAweme getAweme() {
    return aweme;
  }


  public void setAweme(ToolsEstimateAudienceV2ResponseDataAweme aweme) {
    this.aweme = aweme;
  }


  public ToolsEstimateAudienceV2ResponseData tomatoNovelApp(ToolsEstimateAudienceV2ResponseDataTomatoNovelApp tomatoNovelApp) {
    
    this.tomatoNovelApp = tomatoNovelApp;
    return this;
  }

   /**
   * Get tomatoNovelApp
   * @return tomatoNovelApp
  **/
  @javax.annotation.Nullable
  public ToolsEstimateAudienceV2ResponseDataTomatoNovelApp getTomatoNovelApp() {
    return tomatoNovelApp;
  }


  public void setTomatoNovelApp(ToolsEstimateAudienceV2ResponseDataTomatoNovelApp tomatoNovelApp) {
    this.tomatoNovelApp = tomatoNovelApp;
  }


  public ToolsEstimateAudienceV2ResponseData toutiao(ToolsEstimateAudienceV2ResponseDataToutiao toutiao) {
    
    this.toutiao = toutiao;
    return this;
  }

   /**
   * Get toutiao
   * @return toutiao
  **/
  @javax.annotation.Nullable
  public ToolsEstimateAudienceV2ResponseDataToutiao getToutiao() {
    return toutiao;
  }


  public void setToutiao(ToolsEstimateAudienceV2ResponseDataToutiao toutiao) {
    this.toutiao = toutiao;
  }


  public ToolsEstimateAudienceV2ResponseData videoApp(ToolsEstimateAudienceV2ResponseDataVideoApp videoApp) {
    
    this.videoApp = videoApp;
    return this;
  }

   /**
   * Get videoApp
   * @return videoApp
  **/
  @javax.annotation.Nullable
  public ToolsEstimateAudienceV2ResponseDataVideoApp getVideoApp() {
    return videoApp;
  }


  public void setVideoApp(ToolsEstimateAudienceV2ResponseDataVideoApp videoApp) {
    this.videoApp = videoApp;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsEstimateAudienceV2ResponseData toolsEstimateAudienceV2ResponseData = (ToolsEstimateAudienceV2ResponseData) o;
    return Objects.equals(this.aweme, toolsEstimateAudienceV2ResponseData.aweme) &&
        Objects.equals(this.tomatoNovelApp, toolsEstimateAudienceV2ResponseData.tomatoNovelApp) &&
        Objects.equals(this.toutiao, toolsEstimateAudienceV2ResponseData.toutiao) &&
        Objects.equals(this.videoApp, toolsEstimateAudienceV2ResponseData.videoApp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aweme, tomatoNovelApp, toutiao, videoApp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsEstimateAudienceV2ResponseData {\n");
    sb.append("    aweme: ").append(toIndentedString(aweme)).append("\n");
    sb.append("    tomatoNovelApp: ").append(toIndentedString(tomatoNovelApp)).append("\n");
    sb.append("    toutiao: ").append(toIndentedString(toutiao)).append("\n");
    sb.append("    videoApp: ").append(toIndentedString(videoApp)).append("\n");
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
    openapiFields.add("aweme");
    openapiFields.add("tomato_novel_app");
    openapiFields.add("toutiao");
    openapiFields.add("video_app");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsEstimateAudienceV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsEstimateAudienceV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsEstimateAudienceV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsEstimateAudienceV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsEstimateAudienceV2ResponseData>() {
           @Override
           public void write(JsonWriter out, ToolsEstimateAudienceV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsEstimateAudienceV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsEstimateAudienceV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsEstimateAudienceV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to ToolsEstimateAudienceV2ResponseData
  */
  public static ToolsEstimateAudienceV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsEstimateAudienceV2ResponseData.class);
  }

 /**
  * Convert an instance of ToolsEstimateAudienceV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

