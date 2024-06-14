/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoLocalVideo;
import com.bytedance.ads.model.ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoOnlineVideo;
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
 * 视频组件描述
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo {
  public static final String SERIALIZED_NAME_LOCAL_VIDEO = "local_video";
  @SerializedName(SERIALIZED_NAME_LOCAL_VIDEO)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoLocalVideo localVideo = null;

  public static final String SERIALIZED_NAME_ONLINE_VIDEO = "online_video";
  @SerializedName(SERIALIZED_NAME_ONLINE_VIDEO)
  private ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoOnlineVideo onlineVideo = null;

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo() {
  }

  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo localVideo(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoLocalVideo localVideo) {
    
    this.localVideo = localVideo;
    return this;
  }

   /**
   * Get localVideo
   * @return localVideo
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoLocalVideo getLocalVideo() {
    return localVideo;
  }


  public void setLocalVideo(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoLocalVideo localVideo) {
    this.localVideo = localVideo;
  }


  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo onlineVideo(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoOnlineVideo onlineVideo) {
    
    this.onlineVideo = onlineVideo;
    return this;
  }

   /**
   * Get onlineVideo
   * @return onlineVideo
  **/
  @javax.annotation.Nullable
  public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoOnlineVideo getOnlineVideo() {
    return onlineVideo;
  }


  public void setOnlineVideo(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideoOnlineVideo onlineVideo) {
    this.onlineVideo = onlineVideo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo = (ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo) o;
    return Objects.equals(this.localVideo, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo.localVideo) &&
        Objects.equals(this.onlineVideo, toolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo.onlineVideo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(localVideo, onlineVideo);
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
    sb.append("class ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo {\n");
    sb.append("    localVideo: ").append(toIndentedString(localVideo)).append("\n");
    sb.append("    onlineVideo: ").append(toIndentedString(onlineVideo)).append("\n");
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
    openapiFields.add("local_video");
    openapiFields.add("online_video");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo>() {
           @Override
           public void write(JsonWriter out, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo
  */
  public static ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo.class);
  }

 /**
  * Convert an instance of ToolsSiteTemplateGetV2ResponseDataListInnerBricksInnerVideo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

