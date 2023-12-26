/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListAuthStatus;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListAuthType;
import com.bytedance.ads.model.ToolsAwemeAuthListV2DataListSubStatus;
import com.bytedance.ads.model.ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo;
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
 * ToolsAwemeAuthListV2ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-12-26T11:52:44.116511995+08:00[PRC]")
public class ToolsAwemeAuthListV2ResponseDataListInner {
  public static final String SERIALIZED_NAME_AUTH_STATUS = "auth_status";
  @SerializedName(SERIALIZED_NAME_AUTH_STATUS)
  private ToolsAwemeAuthListV2DataListAuthStatus authStatus = null;

  public static final String SERIALIZED_NAME_AUTH_TYPE = "auth_type";
  @SerializedName(SERIALIZED_NAME_AUTH_TYPE)
  private ToolsAwemeAuthListV2DataListAuthType authType = null;

  public static final String SERIALIZED_NAME_AWEME_ID = "aweme_id";
  @SerializedName(SERIALIZED_NAME_AWEME_ID)
  private String awemeId = null;

  public static final String SERIALIZED_NAME_AWEME_NAME = "aweme_name";
  @SerializedName(SERIALIZED_NAME_AWEME_NAME)
  private String awemeName = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_SUB_STATUS = "sub_status";
  @SerializedName(SERIALIZED_NAME_SUB_STATUS)
  private ToolsAwemeAuthListV2DataListSubStatus subStatus = null;

  public static final String SERIALIZED_NAME_VIDEO_INFO = "video_info";
  @SerializedName(SERIALIZED_NAME_VIDEO_INFO)
  private ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo = null;

  public ToolsAwemeAuthListV2ResponseDataListInner() {
  }

  public ToolsAwemeAuthListV2ResponseDataListInner authStatus(ToolsAwemeAuthListV2DataListAuthStatus authStatus) {
    
    this.authStatus = authStatus;
    return this;
  }

   /**
   * Get authStatus
   * @return authStatus
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListAuthStatus getAuthStatus() {
    return authStatus;
  }


  public void setAuthStatus(ToolsAwemeAuthListV2DataListAuthStatus authStatus) {
    this.authStatus = authStatus;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner authType(ToolsAwemeAuthListV2DataListAuthType authType) {
    
    this.authType = authType;
    return this;
  }

   /**
   * Get authType
   * @return authType
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListAuthType getAuthType() {
    return authType;
  }


  public void setAuthType(ToolsAwemeAuthListV2DataListAuthType authType) {
    this.authType = authType;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeId(String awemeId) {
    
    this.awemeId = awemeId;
    return this;
  }

   /**
   * 抖音号
   * @return awemeId
  **/
  @javax.annotation.Nullable
  public String getAwemeId() {
    return awemeId;
  }


  public void setAwemeId(String awemeId) {
    this.awemeId = awemeId;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner awemeName(String awemeName) {
    
    this.awemeName = awemeName;
    return this;
  }

   /**
   * 抖音账号名称
   * @return awemeName
  **/
  @javax.annotation.Nullable
  public String getAwemeName() {
    return awemeName;
  }


  public void setAwemeName(String awemeName) {
    this.awemeName = awemeName;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 授权结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 授权开始时间
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner subStatus(ToolsAwemeAuthListV2DataListSubStatus subStatus) {
    
    this.subStatus = subStatus;
    return this;
  }

   /**
   * Get subStatus
   * @return subStatus
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2DataListSubStatus getSubStatus() {
    return subStatus;
  }


  public void setSubStatus(ToolsAwemeAuthListV2DataListSubStatus subStatus) {
    this.subStatus = subStatus;
  }


  public ToolsAwemeAuthListV2ResponseDataListInner videoInfo(ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo) {
    
    this.videoInfo = videoInfo;
    return this;
  }

   /**
   * Get videoInfo
   * @return videoInfo
  **/
  @javax.annotation.Nullable
  public ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo getVideoInfo() {
    return videoInfo;
  }


  public void setVideoInfo(ToolsAwemeAuthListV2ResponseDataListInnerVideoInfo videoInfo) {
    this.videoInfo = videoInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsAwemeAuthListV2ResponseDataListInner toolsAwemeAuthListV2ResponseDataListInner = (ToolsAwemeAuthListV2ResponseDataListInner) o;
    return Objects.equals(this.authStatus, toolsAwemeAuthListV2ResponseDataListInner.authStatus) &&
        Objects.equals(this.authType, toolsAwemeAuthListV2ResponseDataListInner.authType) &&
        Objects.equals(this.awemeId, toolsAwemeAuthListV2ResponseDataListInner.awemeId) &&
        Objects.equals(this.awemeName, toolsAwemeAuthListV2ResponseDataListInner.awemeName) &&
        Objects.equals(this.endTime, toolsAwemeAuthListV2ResponseDataListInner.endTime) &&
        Objects.equals(this.startTime, toolsAwemeAuthListV2ResponseDataListInner.startTime) &&
        Objects.equals(this.subStatus, toolsAwemeAuthListV2ResponseDataListInner.subStatus) &&
        Objects.equals(this.videoInfo, toolsAwemeAuthListV2ResponseDataListInner.videoInfo);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(authStatus, authType, awemeId, awemeName, endTime, startTime, subStatus, videoInfo);
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
    sb.append("class ToolsAwemeAuthListV2ResponseDataListInner {\n");
    sb.append("    authStatus: ").append(toIndentedString(authStatus)).append("\n");
    sb.append("    authType: ").append(toIndentedString(authType)).append("\n");
    sb.append("    awemeId: ").append(toIndentedString(awemeId)).append("\n");
    sb.append("    awemeName: ").append(toIndentedString(awemeName)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    subStatus: ").append(toIndentedString(subStatus)).append("\n");
    sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
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
    openapiFields.add("auth_status");
    openapiFields.add("auth_type");
    openapiFields.add("aweme_id");
    openapiFields.add("aweme_name");
    openapiFields.add("end_time");
    openapiFields.add("start_time");
    openapiFields.add("sub_status");
    openapiFields.add("video_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsAwemeAuthListV2ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsAwemeAuthListV2ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsAwemeAuthListV2ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsAwemeAuthListV2ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ToolsAwemeAuthListV2ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsAwemeAuthListV2ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsAwemeAuthListV2ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsAwemeAuthListV2ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ToolsAwemeAuthListV2ResponseDataListInner
  */
  public static ToolsAwemeAuthListV2ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsAwemeAuthListV2ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ToolsAwemeAuthListV2ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

