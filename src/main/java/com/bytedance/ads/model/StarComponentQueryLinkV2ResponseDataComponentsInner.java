/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarComponentQueryLinkV2ResponseDataComponentsInnerLiveAttractComponent;
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
 * StarComponentQueryLinkV2ResponseDataComponentsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StarComponentQueryLinkV2ResponseDataComponentsInner {
  public static final String SERIALIZED_NAME_AUDIT_BAN_REASON = "audit_ban_reason";
  @SerializedName(SERIALIZED_NAME_AUDIT_BAN_REASON)
  private String auditBanReason = null;

  public static final String SERIALIZED_NAME_COMPONENT_ID = "component_id";
  @SerializedName(SERIALIZED_NAME_COMPONENT_ID)
  private Long componentId = null;

  public static final String SERIALIZED_NAME_LINK_ANDROID = "link_android";
  @SerializedName(SERIALIZED_NAME_LINK_ANDROID)
  private String linkAndroid = null;

  public static final String SERIALIZED_NAME_LINK_ANDROID_DOWNLOAD = "link_android_download";
  @SerializedName(SERIALIZED_NAME_LINK_ANDROID_DOWNLOAD)
  private String linkAndroidDownload = null;

  public static final String SERIALIZED_NAME_LINK_IOS = "link_ios";
  @SerializedName(SERIALIZED_NAME_LINK_IOS)
  private String linkIos = null;

  public static final String SERIALIZED_NAME_LINK_IOS_DOWNLOAD = "link_ios_download";
  @SerializedName(SERIALIZED_NAME_LINK_IOS_DOWNLOAD)
  private String linkIosDownload = null;

  public static final String SERIALIZED_NAME_LINK_NAME = "link_name";
  @SerializedName(SERIALIZED_NAME_LINK_NAME)
  private String linkName = null;

  public static final String SERIALIZED_NAME_LINK_PAGE_TARGET = "link_page_target";
  @SerializedName(SERIALIZED_NAME_LINK_PAGE_TARGET)
  private Long linkPageTarget = null;

  public static final String SERIALIZED_NAME_LINK_PLATFORM = "link_platform";
  @SerializedName(SERIALIZED_NAME_LINK_PLATFORM)
  private Long linkPlatform = null;

  public static final String SERIALIZED_NAME_LINK_PLATFORM_SOURCE = "link_platform_source";
  @SerializedName(SERIALIZED_NAME_LINK_PLATFORM_SOURCE)
  private Long linkPlatformSource = null;

  public static final String SERIALIZED_NAME_LINK_STATUS = "link_status";
  @SerializedName(SERIALIZED_NAME_LINK_STATUS)
  private Long linkStatus = null;

  public static final String SERIALIZED_NAME_LINK_TITLE = "link_title";
  @SerializedName(SERIALIZED_NAME_LINK_TITLE)
  private String linkTitle = null;

  public static final String SERIALIZED_NAME_LINK_TYPE = "link_type";
  @SerializedName(SERIALIZED_NAME_LINK_TYPE)
  private Integer linkType = null;

  public static final String SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT = "live_attract_component";
  @SerializedName(SERIALIZED_NAME_LIVE_ATTRACT_COMPONENT)
  private StarComponentQueryLinkV2ResponseDataComponentsInnerLiveAttractComponent liveAttractComponent = null;

  public StarComponentQueryLinkV2ResponseDataComponentsInner() {
  }

  public StarComponentQueryLinkV2ResponseDataComponentsInner auditBanReason(String auditBanReason) {
    
    this.auditBanReason = auditBanReason;
    return this;
  }

   /**
   * 
   * @return auditBanReason
  **/
  @javax.annotation.Nullable
  public String getAuditBanReason() {
    return auditBanReason;
  }


  public void setAuditBanReason(String auditBanReason) {
    this.auditBanReason = auditBanReason;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner componentId(Long componentId) {
    
    this.componentId = componentId;
    return this;
  }

   /**
   * 
   * @return componentId
  **/
  @javax.annotation.Nullable
  public Long getComponentId() {
    return componentId;
  }


  public void setComponentId(Long componentId) {
    this.componentId = componentId;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkAndroid(String linkAndroid) {
    
    this.linkAndroid = linkAndroid;
    return this;
  }

   /**
   * Android落地页链接 HTTPS URL
   * @return linkAndroid
  **/
  @javax.annotation.Nullable
  public String getLinkAndroid() {
    return linkAndroid;
  }


  public void setLinkAndroid(String linkAndroid) {
    this.linkAndroid = linkAndroid;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkAndroidDownload(String linkAndroidDownload) {
    
    this.linkAndroidDownload = linkAndroidDownload;
    return this;
  }

   /**
   * Android app 下载链接 HTTPS URL，Android下载时需要
   * @return linkAndroidDownload
  **/
  @javax.annotation.Nullable
  public String getLinkAndroidDownload() {
    return linkAndroidDownload;
  }


  public void setLinkAndroidDownload(String linkAndroidDownload) {
    this.linkAndroidDownload = linkAndroidDownload;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkIos(String linkIos) {
    
    this.linkIos = linkIos;
    return this;
  }

   /**
   * iOS落地页链接 HTTPS URL
   * @return linkIos
  **/
  @javax.annotation.Nullable
  public String getLinkIos() {
    return linkIos;
  }


  public void setLinkIos(String linkIos) {
    this.linkIos = linkIos;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkIosDownload(String linkIosDownload) {
    
    this.linkIosDownload = linkIosDownload;
    return this;
  }

   /**
   * iOS app 下载链接 App store 链接，iOS下载时需要
   * @return linkIosDownload
  **/
  @javax.annotation.Nullable
  public String getLinkIosDownload() {
    return linkIosDownload;
  }


  public void setLinkIosDownload(String linkIosDownload) {
    this.linkIosDownload = linkIosDownload;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkName(String linkName) {
    
    this.linkName = linkName;
    return this;
  }

   /**
   * 组件名称 10字内
   * @return linkName
  **/
  @javax.annotation.Nullable
  public String getLinkName() {
    return linkName;
  }


  public void setLinkName(String linkName) {
    this.linkName = linkName;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkPageTarget(Long linkPageTarget) {
    
    this.linkPageTarget = linkPageTarget;
    return this;
  }

   /**
   * 组件投放目标 (1)：应用下载； (2)：线索留资； (3)：其他目标
   * @return linkPageTarget
  **/
  @javax.annotation.Nullable
  public Long getLinkPageTarget() {
    return linkPageTarget;
  }


  public void setLinkPageTarget(Long linkPageTarget) {
    this.linkPageTarget = linkPageTarget;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkPlatform(Long linkPlatform) {
    
    this.linkPlatform = linkPlatform;
    return this;
  }

   /**
   * 适用平台 (0)：不限； (1)：Android； (2)：iOS
   * @return linkPlatform
  **/
  @javax.annotation.Nullable
  public Long getLinkPlatform() {
    return linkPlatform;
  }


  public void setLinkPlatform(Long linkPlatform) {
    this.linkPlatform = linkPlatform;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkPlatformSource(Long linkPlatformSource) {
    
    this.linkPlatformSource = linkPlatformSource;
    return this;
  }

   /**
   * 媒体渠道 仅限以下 (1)：抖音
   * @return linkPlatformSource
  **/
  @javax.annotation.Nullable
  public Long getLinkPlatformSource() {
    return linkPlatformSource;
  }


  public void setLinkPlatformSource(Long linkPlatformSource) {
    this.linkPlatformSource = linkPlatformSource;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkStatus(Long linkStatus) {
    
    this.linkStatus = linkStatus;
    return this;
  }

   /**
   * 
   * @return linkStatus
  **/
  @javax.annotation.Nullable
  public Long getLinkStatus() {
    return linkStatus;
  }


  public void setLinkStatus(Long linkStatus) {
    this.linkStatus = linkStatus;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkTitle(String linkTitle) {
    
    this.linkTitle = linkTitle;
    return this;
  }

   /**
   * 组件标题（介绍文案） 20字内
   * @return linkTitle
  **/
  @javax.annotation.Nullable
  public String getLinkTitle() {
    return linkTitle;
  }


  public void setLinkTitle(String linkTitle) {
    this.linkTitle = linkTitle;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner linkType(Integer linkType) {
    
    this.linkType = linkType;
    return this;
  }

   /**
   * 组件类型 仅限以下 (1)：落地页
   * @return linkType
  **/
  @javax.annotation.Nullable
  public Integer getLinkType() {
    return linkType;
  }


  public void setLinkType(Integer linkType) {
    this.linkType = linkType;
  }


  public StarComponentQueryLinkV2ResponseDataComponentsInner liveAttractComponent(StarComponentQueryLinkV2ResponseDataComponentsInnerLiveAttractComponent liveAttractComponent) {
    
    this.liveAttractComponent = liveAttractComponent;
    return this;
  }

   /**
   * Get liveAttractComponent
   * @return liveAttractComponent
  **/
  @javax.annotation.Nullable
  public StarComponentQueryLinkV2ResponseDataComponentsInnerLiveAttractComponent getLiveAttractComponent() {
    return liveAttractComponent;
  }


  public void setLiveAttractComponent(StarComponentQueryLinkV2ResponseDataComponentsInnerLiveAttractComponent liveAttractComponent) {
    this.liveAttractComponent = liveAttractComponent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarComponentQueryLinkV2ResponseDataComponentsInner starComponentQueryLinkV2ResponseDataComponentsInner = (StarComponentQueryLinkV2ResponseDataComponentsInner) o;
    return Objects.equals(this.auditBanReason, starComponentQueryLinkV2ResponseDataComponentsInner.auditBanReason) &&
        Objects.equals(this.componentId, starComponentQueryLinkV2ResponseDataComponentsInner.componentId) &&
        Objects.equals(this.linkAndroid, starComponentQueryLinkV2ResponseDataComponentsInner.linkAndroid) &&
        Objects.equals(this.linkAndroidDownload, starComponentQueryLinkV2ResponseDataComponentsInner.linkAndroidDownload) &&
        Objects.equals(this.linkIos, starComponentQueryLinkV2ResponseDataComponentsInner.linkIos) &&
        Objects.equals(this.linkIosDownload, starComponentQueryLinkV2ResponseDataComponentsInner.linkIosDownload) &&
        Objects.equals(this.linkName, starComponentQueryLinkV2ResponseDataComponentsInner.linkName) &&
        Objects.equals(this.linkPageTarget, starComponentQueryLinkV2ResponseDataComponentsInner.linkPageTarget) &&
        Objects.equals(this.linkPlatform, starComponentQueryLinkV2ResponseDataComponentsInner.linkPlatform) &&
        Objects.equals(this.linkPlatformSource, starComponentQueryLinkV2ResponseDataComponentsInner.linkPlatformSource) &&
        Objects.equals(this.linkStatus, starComponentQueryLinkV2ResponseDataComponentsInner.linkStatus) &&
        Objects.equals(this.linkTitle, starComponentQueryLinkV2ResponseDataComponentsInner.linkTitle) &&
        Objects.equals(this.linkType, starComponentQueryLinkV2ResponseDataComponentsInner.linkType) &&
        Objects.equals(this.liveAttractComponent, starComponentQueryLinkV2ResponseDataComponentsInner.liveAttractComponent);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditBanReason, componentId, linkAndroid, linkAndroidDownload, linkIos, linkIosDownload, linkName, linkPageTarget, linkPlatform, linkPlatformSource, linkStatus, linkTitle, linkType, liveAttractComponent);
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
    sb.append("class StarComponentQueryLinkV2ResponseDataComponentsInner {\n");
    sb.append("    auditBanReason: ").append(toIndentedString(auditBanReason)).append("\n");
    sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
    sb.append("    linkAndroid: ").append(toIndentedString(linkAndroid)).append("\n");
    sb.append("    linkAndroidDownload: ").append(toIndentedString(linkAndroidDownload)).append("\n");
    sb.append("    linkIos: ").append(toIndentedString(linkIos)).append("\n");
    sb.append("    linkIosDownload: ").append(toIndentedString(linkIosDownload)).append("\n");
    sb.append("    linkName: ").append(toIndentedString(linkName)).append("\n");
    sb.append("    linkPageTarget: ").append(toIndentedString(linkPageTarget)).append("\n");
    sb.append("    linkPlatform: ").append(toIndentedString(linkPlatform)).append("\n");
    sb.append("    linkPlatformSource: ").append(toIndentedString(linkPlatformSource)).append("\n");
    sb.append("    linkStatus: ").append(toIndentedString(linkStatus)).append("\n");
    sb.append("    linkTitle: ").append(toIndentedString(linkTitle)).append("\n");
    sb.append("    linkType: ").append(toIndentedString(linkType)).append("\n");
    sb.append("    liveAttractComponent: ").append(toIndentedString(liveAttractComponent)).append("\n");
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
    openapiFields.add("audit_ban_reason");
    openapiFields.add("component_id");
    openapiFields.add("link_android");
    openapiFields.add("link_android_download");
    openapiFields.add("link_ios");
    openapiFields.add("link_ios_download");
    openapiFields.add("link_name");
    openapiFields.add("link_page_target");
    openapiFields.add("link_platform");
    openapiFields.add("link_platform_source");
    openapiFields.add("link_status");
    openapiFields.add("link_title");
    openapiFields.add("link_type");
    openapiFields.add("live_attract_component");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarComponentQueryLinkV2ResponseDataComponentsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarComponentQueryLinkV2ResponseDataComponentsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarComponentQueryLinkV2ResponseDataComponentsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarComponentQueryLinkV2ResponseDataComponentsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StarComponentQueryLinkV2ResponseDataComponentsInner>() {
           @Override
           public void write(JsonWriter out, StarComponentQueryLinkV2ResponseDataComponentsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarComponentQueryLinkV2ResponseDataComponentsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarComponentQueryLinkV2ResponseDataComponentsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarComponentQueryLinkV2ResponseDataComponentsInner
  * @throws IOException if the JSON string is invalid with respect to StarComponentQueryLinkV2ResponseDataComponentsInner
  */
  public static StarComponentQueryLinkV2ResponseDataComponentsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarComponentQueryLinkV2ResponseDataComponentsInner.class);
  }

 /**
  * Convert an instance of StarComponentQueryLinkV2ResponseDataComponentsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

