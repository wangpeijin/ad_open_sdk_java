/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
 * AicMaterialPushV30ResponseDataFailResultsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class AicMaterialPushV30ResponseDataFailResultsInner {
  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_TARGET_ADVERTISER_ID = "target_advertiser_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ADVERTISER_ID)
  private Long targetAdvertiserId = null;

  public static final String SERIALIZED_NAME_VIDEO_ID = "video_id";
  @SerializedName(SERIALIZED_NAME_VIDEO_ID)
  private String videoId = null;

  public AicMaterialPushV30ResponseDataFailResultsInner() {
  }

  public AicMaterialPushV30ResponseDataFailResultsInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 推送失败的原因
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public AicMaterialPushV30ResponseDataFailResultsInner targetAdvertiserId(Long targetAdvertiserId) {
    
    this.targetAdvertiserId = targetAdvertiserId;
    return this;
  }

   /**
   * 目标推送广告主id
   * @return targetAdvertiserId
  **/
  @javax.annotation.Nullable
  public Long getTargetAdvertiserId() {
    return targetAdvertiserId;
  }


  public void setTargetAdvertiserId(Long targetAdvertiserId) {
    this.targetAdvertiserId = targetAdvertiserId;
  }


  public AicMaterialPushV30ResponseDataFailResultsInner videoId(String videoId) {
    
    this.videoId = videoId;
    return this;
  }

   /**
   * 推送失败的视频id
   * @return videoId
  **/
  @javax.annotation.Nullable
  public String getVideoId() {
    return videoId;
  }


  public void setVideoId(String videoId) {
    this.videoId = videoId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AicMaterialPushV30ResponseDataFailResultsInner aicMaterialPushV30ResponseDataFailResultsInner = (AicMaterialPushV30ResponseDataFailResultsInner) o;
    return Objects.equals(this.reason, aicMaterialPushV30ResponseDataFailResultsInner.reason) &&
        Objects.equals(this.targetAdvertiserId, aicMaterialPushV30ResponseDataFailResultsInner.targetAdvertiserId) &&
        Objects.equals(this.videoId, aicMaterialPushV30ResponseDataFailResultsInner.videoId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, targetAdvertiserId, videoId);
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
    sb.append("class AicMaterialPushV30ResponseDataFailResultsInner {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    targetAdvertiserId: ").append(toIndentedString(targetAdvertiserId)).append("\n");
    sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
    openapiFields.add("reason");
    openapiFields.add("target_advertiser_id");
    openapiFields.add("video_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AicMaterialPushV30ResponseDataFailResultsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AicMaterialPushV30ResponseDataFailResultsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AicMaterialPushV30ResponseDataFailResultsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AicMaterialPushV30ResponseDataFailResultsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<AicMaterialPushV30ResponseDataFailResultsInner>() {
           @Override
           public void write(JsonWriter out, AicMaterialPushV30ResponseDataFailResultsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AicMaterialPushV30ResponseDataFailResultsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AicMaterialPushV30ResponseDataFailResultsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AicMaterialPushV30ResponseDataFailResultsInner
  * @throws IOException if the JSON string is invalid with respect to AicMaterialPushV30ResponseDataFailResultsInner
  */
  public static AicMaterialPushV30ResponseDataFailResultsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AicMaterialPushV30ResponseDataFailResultsInner.class);
  }

 /**
  * Convert an instance of AicMaterialPushV30ResponseDataFailResultsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

