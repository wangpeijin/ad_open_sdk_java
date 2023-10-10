/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner;
import com.bytedance.ads.model.NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner;
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
 * 网服下载锚点
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor {
  public static final String SERIALIZED_NAME_ANCHOR_IMAGE_MODE = "anchor_image_mode";
  @SerializedName(SERIALIZED_NAME_ANCHOR_IMAGE_MODE)
  private Long anchorImageMode = null;

  public static final String SERIALIZED_NAME_ANDROID_ANCHOR_TITLE = "android_anchor_title";
  @SerializedName(SERIALIZED_NAME_ANDROID_ANCHOR_TITLE)
  private String androidAnchorTitle = null;

  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_APP_DESCRIPTION = "app_description";
  @SerializedName(SERIALIZED_NAME_APP_DESCRIPTION)
  private String appDescription = null;

  public static final String SERIALIZED_NAME_APP_IMAGES = "app_images";
  @SerializedName(SERIALIZED_NAME_APP_IMAGES)
  private List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner> appImages = null;

  public static final String SERIALIZED_NAME_APP_OPEN_URL = "app_open_url";
  @SerializedName(SERIALIZED_NAME_APP_OPEN_URL)
  private String appOpenUrl = null;

  public static final String SERIALIZED_NAME_APP_TAGS = "app_tags";
  @SerializedName(SERIALIZED_NAME_APP_TAGS)
  private List<String> appTags = null;

  public static final String SERIALIZED_NAME_GUIDE_TEXT = "guide_text";
  @SerializedName(SERIALIZED_NAME_GUIDE_TEXT)
  private String guideText = null;

  public static final String SERIALIZED_NAME_HEAD_IMAGE_LIST = "head_image_list";
  @SerializedName(SERIALIZED_NAME_HEAD_IMAGE_LIST)
  private List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner> headImageList = null;

  public static final String SERIALIZED_NAME_ICON_IMAGES = "icon_images";
  @SerializedName(SERIALIZED_NAME_ICON_IMAGES)
  private List<NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_IOS_ANCHOR_TITLE = "ios_anchor_title";
  @SerializedName(SERIALIZED_NAME_IOS_ANCHOR_TITLE)
  private String iosAnchorTitle = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public static final String SERIALIZED_NAME_NET_SERVICE_TYPE = "net_service_type";
  @SerializedName(SERIALIZED_NAME_NET_SERVICE_TYPE)
  private NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType netServiceType = null;

  public static final String SERIALIZED_NAME_NOVEL_CHAPTER = "novel_chapter";
  @SerializedName(SERIALIZED_NAME_NOVEL_CHAPTER)
  private String novelChapter = null;

  public static final String SERIALIZED_NAME_PATH_PARAM = "path_param";
  @SerializedName(SERIALIZED_NAME_PATH_PARAM)
  private String pathParam = null;

  public static final String SERIALIZED_NAME_PLATFORM_TYPE = "platform_type";
  @SerializedName(SERIALIZED_NAME_PLATFORM_TYPE)
  private Long platformType = null;

  public static final String SERIALIZED_NAME_QUICK_APP_ID = "quick_app_id";
  @SerializedName(SERIALIZED_NAME_QUICK_APP_ID)
  private Long quickAppId = null;

  public static final String SERIALIZED_NAME_WECHAT_PACKAGE_ID = "wechat_package_id";
  @SerializedName(SERIALIZED_NAME_WECHAT_PACKAGE_ID)
  private Long wechatPackageId = null;

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor() {
  }

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor anchorImageMode(Long anchorImageMode) {
    
    this.anchorImageMode = anchorImageMode;
    return this;
  }

   /**
   * APP图片比例，100：尺寸为2：1的横图，200：尺寸为3：5的竖图
   * @return anchorImageMode
  **/
  @javax.annotation.Nullable
  public Long getAnchorImageMode() {
    return anchorImageMode;
  }


  public void setAnchorImageMode(Long anchorImageMode) {
    this.anchorImageMode = anchorImageMode;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor androidAnchorTitle(String androidAnchorTitle) {
    
    this.androidAnchorTitle = androidAnchorTitle;
    return this;
  }

   /**
   * 安卓锚点入口标题字段
   * @return androidAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getAndroidAnchorTitle() {
    return androidAnchorTitle;
  }


  public void setAndroidAnchorTitle(String androidAnchorTitle) {
    this.androidAnchorTitle = androidAnchorTitle;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   * 安卓下载链接
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor appDescription(String appDescription) {
    
    this.appDescription = appDescription;
    return this;
  }

   /**
   * APP详情，1～100
   * @return appDescription
  **/
  @javax.annotation.Nullable
  public String getAppDescription() {
    return appDescription;
  }


  public void setAppDescription(String appDescription) {
    this.appDescription = appDescription;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor appImages(List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner> appImages) {
    
    this.appImages = appImages;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor addAppImagesItem(NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner appImagesItem) {
    if (this.appImages == null) {
      this.appImages = new ArrayList<>();
    }
    this.appImages.add(appImagesItem);
    return this;
  }

   /**
   * APP图片，图片个数 3～8
   * @return appImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner> getAppImages() {
    return appImages;
  }


  public void setAppImages(List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorAppImagesInner> appImages) {
    this.appImages = appImages;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor appOpenUrl(String appOpenUrl) {
    
    this.appOpenUrl = appOpenUrl;
    return this;
  }

   /**
   * app调起链接
   * @return appOpenUrl
  **/
  @javax.annotation.Nullable
  public String getAppOpenUrl() {
    return appOpenUrl;
  }


  public void setAppOpenUrl(String appOpenUrl) {
    this.appOpenUrl = appOpenUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor appTags(List<String> appTags) {
    
    this.appTags = appTags;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor addAppTagsItem(String appTagsItem) {
    if (this.appTags == null) {
      this.appTags = new ArrayList<>();
    }
    this.appTags.add(appTagsItem);
    return this;
  }

   /**
   * APP标签列表，每个标签长度：1～4；标签个数：1～3
   * @return appTags
  **/
  @javax.annotation.Nullable
  public List<String> getAppTags() {
    return appTags;
  }


  public void setAppTags(List<String> appTags) {
    this.appTags = appTags;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor guideText(String guideText) {
    
    this.guideText = guideText;
    return this;
  }

   /**
   * 引导文案，长度：1～15
   * @return guideText
  **/
  @javax.annotation.Nullable
  public String getGuideText() {
    return guideText;
  }


  public void setGuideText(String guideText) {
    this.guideText = guideText;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor headImageList(List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner> headImageList) {
    
    this.headImageList = headImageList;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor addHeadImageListItem(NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner headImageListItem) {
    if (this.headImageList == null) {
      this.headImageList = new ArrayList<>();
    }
    this.headImageList.add(headImageListItem);
    return this;
  }

   /**
   * 锚点头部图片list，推荐尺寸为2：1的横图
   * @return headImageList
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner> getHeadImageList() {
    return headImageList;
  }


  public void setHeadImageList(List<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchorHeadImageListInner> headImageList) {
    this.headImageList = headImageList;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor iconImages(List<NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages) {
    
    this.iconImages = iconImages;
    return this;
  }

  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor addIconImagesItem(NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner iconImagesItem) {
    if (this.iconImages == null) {
      this.iconImages = new ArrayList<>();
    }
    this.iconImages.add(iconImagesItem);
    return this;
  }

   /**
   * 应用icon图片，比例1:1，大小不超过1M，图片个数为1。
   * @return iconImages
  **/
  @javax.annotation.Nullable
  public List<NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner> getIconImages() {
    return iconImages;
  }


  public void setIconImages(List<NativeAnchorCreateV30RequestAnchorInfoGameAnchorIconImagesInner> iconImages) {
    this.iconImages = iconImages;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 微信小程序资产id
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor iosAnchorTitle(String iosAnchorTitle) {
    
    this.iosAnchorTitle = iosAnchorTitle;
    return this;
  }

   /**
   * iOS 锚点入口标题字段
   * @return iosAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getIosAnchorTitle() {
    return iosAnchorTitle;
  }


  public void setIosAnchorTitle(String iosAnchorTitle) {
    this.iosAnchorTitle = iosAnchorTitle;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * iOS下载链接
   * @return iosDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getIosDownloadUrl() {
    return iosDownloadUrl;
  }


  public void setIosDownloadUrl(String iosDownloadUrl) {
    this.iosDownloadUrl = iosDownloadUrl;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor netServiceType(NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType netServiceType) {
    
    this.netServiceType = netServiceType;
    return this;
  }

   /**
   * Get netServiceType
   * @return netServiceType
  **/
  @javax.annotation.Nullable
  public NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType getNetServiceType() {
    return netServiceType;
  }


  public void setNetServiceType(NativeAnchorCreateV30AnchorInfoNetServiceAnchorNetServiceType netServiceType) {
    this.netServiceType = netServiceType;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor novelChapter(String novelChapter) {
    
    this.novelChapter = novelChapter;
    return this;
  }

   /**
   * 小说章节
   * @return novelChapter
  **/
  @javax.annotation.Nullable
  public String getNovelChapter() {
    return novelChapter;
  }


  public void setNovelChapter(String novelChapter) {
    this.novelChapter = novelChapter;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor pathParam(String pathParam) {
    
    this.pathParam = pathParam;
    return this;
  }

   /**
   * 路径参数，可选填。如要跳转指定页面，需填写
   * @return pathParam
  **/
  @javax.annotation.Nullable
  public String getPathParam() {
    return pathParam;
  }


  public void setPathParam(String pathParam) {
    this.pathParam = pathParam;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor platformType(Long platformType) {
    
    this.platformType = platformType;
    return this;
  }

   /**
   * 配置平台（1:不限,2:安卓,3:iOS）不限：安卓下载链接和iOS下载链接必填；安卓：安卓下载链接必填，iOS下载链接不填写；iOS：iOS下载链接必填
   * @return platformType
  **/
  @javax.annotation.Nullable
  public Long getPlatformType() {
    return platformType;
  }


  public void setPlatformType(Long platformType) {
    this.platformType = platformType;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor quickAppId(Long quickAppId) {
    
    this.quickAppId = quickAppId;
    return this;
  }

   /**
   * 快应用资产id
   * @return quickAppId
  **/
  @javax.annotation.Nullable
  public Long getQuickAppId() {
    return quickAppId;
  }


  public void setQuickAppId(Long quickAppId) {
    this.quickAppId = quickAppId;
  }


  public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor wechatPackageId(Long wechatPackageId) {
    
    this.wechatPackageId = wechatPackageId;
    return this;
  }

   /**
   * 微信号码包id或者企业微信号码包id
   * @return wechatPackageId
  **/
  @javax.annotation.Nullable
  public Long getWechatPackageId() {
    return wechatPackageId;
  }


  public void setWechatPackageId(Long wechatPackageId) {
    this.wechatPackageId = wechatPackageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor = (NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor) o;
    return Objects.equals(this.anchorImageMode, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.anchorImageMode) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidDownloadUrl, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.androidDownloadUrl) &&
        Objects.equals(this.appDescription, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.appDescription) &&
        Objects.equals(this.appImages, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.appImages) &&
        Objects.equals(this.appOpenUrl, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.appOpenUrl) &&
        Objects.equals(this.appTags, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.appTags) &&
        Objects.equals(this.guideText, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.guideText) &&
        Objects.equals(this.headImageList, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.headImageList) &&
        Objects.equals(this.iconImages, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.iconImages) &&
        Objects.equals(this.instanceId, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.instanceId) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.iosAnchorTitle) &&
        Objects.equals(this.iosDownloadUrl, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.iosDownloadUrl) &&
        Objects.equals(this.netServiceType, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.netServiceType) &&
        Objects.equals(this.novelChapter, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.novelChapter) &&
        Objects.equals(this.pathParam, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.pathParam) &&
        Objects.equals(this.platformType, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.platformType) &&
        Objects.equals(this.quickAppId, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.quickAppId) &&
        Objects.equals(this.wechatPackageId, nativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.wechatPackageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(anchorImageMode, androidAnchorTitle, androidDownloadUrl, appDescription, appImages, appOpenUrl, appTags, guideText, headImageList, iconImages, instanceId, iosAnchorTitle, iosDownloadUrl, netServiceType, novelChapter, pathParam, platformType, quickAppId, wechatPackageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor {\n");
    sb.append("    anchorImageMode: ").append(toIndentedString(anchorImageMode)).append("\n");
    sb.append("    androidAnchorTitle: ").append(toIndentedString(androidAnchorTitle)).append("\n");
    sb.append("    androidDownloadUrl: ").append(toIndentedString(androidDownloadUrl)).append("\n");
    sb.append("    appDescription: ").append(toIndentedString(appDescription)).append("\n");
    sb.append("    appImages: ").append(toIndentedString(appImages)).append("\n");
    sb.append("    appOpenUrl: ").append(toIndentedString(appOpenUrl)).append("\n");
    sb.append("    appTags: ").append(toIndentedString(appTags)).append("\n");
    sb.append("    guideText: ").append(toIndentedString(guideText)).append("\n");
    sb.append("    headImageList: ").append(toIndentedString(headImageList)).append("\n");
    sb.append("    iconImages: ").append(toIndentedString(iconImages)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
    sb.append("    netServiceType: ").append(toIndentedString(netServiceType)).append("\n");
    sb.append("    novelChapter: ").append(toIndentedString(novelChapter)).append("\n");
    sb.append("    pathParam: ").append(toIndentedString(pathParam)).append("\n");
    sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
    sb.append("    quickAppId: ").append(toIndentedString(quickAppId)).append("\n");
    sb.append("    wechatPackageId: ").append(toIndentedString(wechatPackageId)).append("\n");
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
    openapiFields.add("anchor_image_mode");
    openapiFields.add("android_anchor_title");
    openapiFields.add("android_download_url");
    openapiFields.add("app_description");
    openapiFields.add("app_images");
    openapiFields.add("app_open_url");
    openapiFields.add("app_tags");
    openapiFields.add("guide_text");
    openapiFields.add("head_image_list");
    openapiFields.add("icon_images");
    openapiFields.add("instance_id");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("ios_download_url");
    openapiFields.add("net_service_type");
    openapiFields.add("novel_chapter");
    openapiFields.add("path_param");
    openapiFields.add("platform_type");
    openapiFields.add("quick_app_id");
    openapiFields.add("wechat_package_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor
  */
  public static NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorCreateV30RequestAnchorInfoNetServiceAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

