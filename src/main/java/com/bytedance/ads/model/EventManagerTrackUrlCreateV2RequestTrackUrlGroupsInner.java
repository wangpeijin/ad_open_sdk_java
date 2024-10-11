/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
 * EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner {
  public static final String SERIALIZED_NAME_ACTION_TRACK_URL = "action_track_url";
  @SerializedName(SERIALIZED_NAME_ACTION_TRACK_URL)
  private String actionTrackUrl = null;

  public static final String SERIALIZED_NAME_ACTIVE_TRACK_URL = "active_track_url";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TRACK_URL)
  private String activeTrackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL = "track_url";
  @SerializedName(SERIALIZED_NAME_TRACK_URL)
  private String trackUrl = null;

  public static final String SERIALIZED_NAME_TRACK_URL_GROUP_NAME = "track_url_group_name";
  @SerializedName(SERIALIZED_NAME_TRACK_URL_GROUP_NAME)
  private String trackUrlGroupName = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL = "video_play_done_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_DONE_TRACK_URL)
  private String videoPlayDoneTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL = "video_play_effective_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_EFFECTIVE_TRACK_URL)
  private String videoPlayEffectiveTrackUrl = null;

  public static final String SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL = "video_play_track_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_PLAY_TRACK_URL)
  private String videoPlayTrackUrl = null;

  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner() {
  }

  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner actionTrackUrl(String actionTrackUrl) {
    
    this.actionTrackUrl = actionTrackUrl;
    return this;
  }

   /**
   * 点击（监测链接），只允许传入1个
   * @return actionTrackUrl
  **/
  @javax.annotation.Nonnull
  public String getActionTrackUrl() {
    return actionTrackUrl;
  }


  public void setActionTrackUrl(String actionTrackUrl) {
    this.actionTrackUrl = actionTrackUrl;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner activeTrackUrl(String activeTrackUrl) {
    
    this.activeTrackUrl = activeTrackUrl;
    return this;
  }

   /**
   * 激活监测
   * @return activeTrackUrl
  **/
  @javax.annotation.Nullable
  public String getActiveTrackUrl() {
    return activeTrackUrl;
  }


  public void setActiveTrackUrl(String activeTrackUrl) {
    this.activeTrackUrl = activeTrackUrl;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner trackUrl(String trackUrl) {
    
    this.trackUrl = trackUrl;
    return this;
  }

   /**
   * 展示（监测链接），只允许传入1个
   * @return trackUrl
  **/
  @javax.annotation.Nullable
  public String getTrackUrl() {
    return trackUrl;
  }


  public void setTrackUrl(String trackUrl) {
    this.trackUrl = trackUrl;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner trackUrlGroupName(String trackUrlGroupName) {
    
    this.trackUrlGroupName = trackUrlGroupName;
    return this;
  }

   /**
   * 监测链接组名称，应用型资产必填
   * @return trackUrlGroupName
  **/
  @javax.annotation.Nullable
  public String getTrackUrlGroupName() {
    return trackUrlGroupName;
  }


  public void setTrackUrlGroupName(String trackUrlGroupName) {
    this.trackUrlGroupName = trackUrlGroupName;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner videoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
    return this;
  }

   /**
   * 视频播完（监测链接），只允许传入1个
   * @return videoPlayDoneTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayDoneTrackUrl() {
    return videoPlayDoneTrackUrl;
  }


  public void setVideoPlayDoneTrackUrl(String videoPlayDoneTrackUrl) {
    this.videoPlayDoneTrackUrl = videoPlayDoneTrackUrl;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner videoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
    return this;
  }

   /**
   * 视频有效播放（监测链接），只允许传入1个
   * @return videoPlayEffectiveTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayEffectiveTrackUrl() {
    return videoPlayEffectiveTrackUrl;
  }


  public void setVideoPlayEffectiveTrackUrl(String videoPlayEffectiveTrackUrl) {
    this.videoPlayEffectiveTrackUrl = videoPlayEffectiveTrackUrl;
  }


  public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner videoPlayTrackUrl(String videoPlayTrackUrl) {
    
    this.videoPlayTrackUrl = videoPlayTrackUrl;
    return this;
  }

   /**
   * 视频播放（监测链接），只允许传入1个
   * @return videoPlayTrackUrl
  **/
  @javax.annotation.Nullable
  public String getVideoPlayTrackUrl() {
    return videoPlayTrackUrl;
  }


  public void setVideoPlayTrackUrl(String videoPlayTrackUrl) {
    this.videoPlayTrackUrl = videoPlayTrackUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner = (EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner) o;
    return Objects.equals(this.actionTrackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.actionTrackUrl) &&
        Objects.equals(this.activeTrackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.activeTrackUrl) &&
        Objects.equals(this.trackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.trackUrl) &&
        Objects.equals(this.trackUrlGroupName, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.trackUrlGroupName) &&
        Objects.equals(this.videoPlayDoneTrackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.videoPlayDoneTrackUrl) &&
        Objects.equals(this.videoPlayEffectiveTrackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.videoPlayEffectiveTrackUrl) &&
        Objects.equals(this.videoPlayTrackUrl, eventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.videoPlayTrackUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTrackUrl, activeTrackUrl, trackUrl, trackUrlGroupName, videoPlayDoneTrackUrl, videoPlayEffectiveTrackUrl, videoPlayTrackUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner {\n");
    sb.append("    actionTrackUrl: ").append(toIndentedString(actionTrackUrl)).append("\n");
    sb.append("    activeTrackUrl: ").append(toIndentedString(activeTrackUrl)).append("\n");
    sb.append("    trackUrl: ").append(toIndentedString(trackUrl)).append("\n");
    sb.append("    trackUrlGroupName: ").append(toIndentedString(trackUrlGroupName)).append("\n");
    sb.append("    videoPlayDoneTrackUrl: ").append(toIndentedString(videoPlayDoneTrackUrl)).append("\n");
    sb.append("    videoPlayEffectiveTrackUrl: ").append(toIndentedString(videoPlayEffectiveTrackUrl)).append("\n");
    sb.append("    videoPlayTrackUrl: ").append(toIndentedString(videoPlayTrackUrl)).append("\n");
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
    openapiFields.add("action_track_url");
    openapiFields.add("active_track_url");
    openapiFields.add("track_url");
    openapiFields.add("track_url_group_name");
    openapiFields.add("video_play_done_track_url");
    openapiFields.add("video_play_effective_track_url");
    openapiFields.add("video_play_track_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("action_track_url");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner
  */
  public static EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner.class);
  }

 /**
  * Convert an instance of EventManagerTrackUrlCreateV2RequestTrackUrlGroupsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

