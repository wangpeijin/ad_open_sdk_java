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
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner;
import com.bytedance.ads.model.AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner;
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
 * 创意维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class AdlabGroupCreateV30RequestCreativeInfo {
  public static final String SERIALIZED_NAME_AD_KEYWORDS = "ad_keywords";
  @SerializedName(SERIALIZED_NAME_AD_KEYWORDS)
  private List<String> adKeywords = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_AUTO_STOP = "auto_stop";
  @SerializedName(SERIALIZED_NAME_AUTO_STOP)
  private Long autoStop = null;

  public static final String SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH = "creative_auto_generate_switch";
  @SerializedName(SERIALIZED_NAME_CREATIVE_AUTO_GENERATE_SWITCH)
  private Long creativeAutoGenerateSwitch = null;

  public static final String SERIALIZED_NAME_EXTERNAL_URL = "external_url";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_URL)
  private String externalUrl = null;

  public static final String SERIALIZED_NAME_IMAGE_MATERIALS = "image_materials";
  @SerializedName(SERIALIZED_NAME_IMAGE_MATERIALS)
  private List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner> imageMaterials = null;

  public static final String SERIALIZED_NAME_INDUSTRY_V3 = "industry_v3";
  @SerializedName(SERIALIZED_NAME_INDUSTRY_V3)
  private Long industryV3 = null;

  public static final String SERIALIZED_NAME_IS_COMMENT_DISABLE = "is_comment_disable";
  @SerializedName(SERIALIZED_NAME_IS_COMMENT_DISABLE)
  private Long isCommentDisable = null;

  public static final String SERIALIZED_NAME_IS_FOLLOW_MATERIAL = "is_follow_material";
  @SerializedName(SERIALIZED_NAME_IS_FOLLOW_MATERIAL)
  private Long isFollowMaterial = null;

  public static final String SERIALIZED_NAME_PLAYABLE_URL = "playable_url";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_URL)
  private String playableUrl = null;

  public static final String SERIALIZED_NAME_SOURCE = "source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source = null;

  public static final String SERIALIZED_NAME_TITLE_MATERIALS = "title_materials";
  @SerializedName(SERIALIZED_NAME_TITLE_MATERIALS)
  private List<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIALS = "video_materials";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIALS)
  private List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public AdlabGroupCreateV30RequestCreativeInfo() {
  }

  public AdlabGroupCreateV30RequestCreativeInfo adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfo addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 创意标签（最多20个标签,且每个标签长度不超过10个字符）
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public AdlabGroupCreateV30RequestCreativeInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名，当ad_type&#x3D; ANDROID或者IOS时必填 ，且必须与计划维度传入的应用名称一致
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AdlabGroupCreateV30RequestCreativeInfo autoStop(Long autoStop) {
    
    this.autoStop = autoStop;
    return this;
  }

   /**
   * 是否启用自动暂停规则
   * @return autoStop
  **/
  @javax.annotation.Nullable
  public Long getAutoStop() {
    return autoStop;
  }


  public void setAutoStop(Long autoStop) {
    this.autoStop = autoStop;
  }


  public AdlabGroupCreateV30RequestCreativeInfo creativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
    return this;
  }

   /**
   * 是否开启自动派生创意
   * @return creativeAutoGenerateSwitch
  **/
  @javax.annotation.Nullable
  public Long getCreativeAutoGenerateSwitch() {
    return creativeAutoGenerateSwitch;
  }


  public void setCreativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    this.creativeAutoGenerateSwitch = creativeAutoGenerateSwitch;
  }


  public AdlabGroupCreateV30RequestCreativeInfo externalUrl(String externalUrl) {
    
    this.externalUrl = externalUrl;
    return this;
  }

   /**
   * 落地页链接
   * @return externalUrl
  **/
  @javax.annotation.Nullable
  public String getExternalUrl() {
    return externalUrl;
  }


  public void setExternalUrl(String externalUrl) {
    this.externalUrl = externalUrl;
  }


  public AdlabGroupCreateV30RequestCreativeInfo imageMaterials(List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfo addImageMaterialsItem(AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner imageMaterialsItem) {
    if (this.imageMaterials == null) {
      this.imageMaterials = new ArrayList<>();
    }
    this.imageMaterials.add(imageMaterialsItem);
    return this;
  }

   /**
   * 图片素材 最多使用50张图片，当通投场景下只选择图片不选择视频时至少选择5张图片，如果视频和图片都选择则要保证一个横版视频+一个竖版视频+一张大图横图。非通投场景至少传入1张图片或1个视频
   * @return imageMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<AdlabGroupCreateV30RequestCreativeInfoImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public AdlabGroupCreateV30RequestCreativeInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 创意分类-三级行业，填写三级行业ID
   * @return industryV3
  **/
  @javax.annotation.Nullable
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public AdlabGroupCreateV30RequestCreativeInfo isCommentDisable(Long isCommentDisable) {
    
    this.isCommentDisable = isCommentDisable;
    return this;
  }

   /**
   * 是否开启评论
   * @return isCommentDisable
  **/
  @javax.annotation.Nullable
  public Long getIsCommentDisable() {
    return isCommentDisable;
  }


  public void setIsCommentDisable(Long isCommentDisable) {
    this.isCommentDisable = isCommentDisable;
  }


  public AdlabGroupCreateV30RequestCreativeInfo isFollowMaterial(Long isFollowMaterial) {
    
    this.isFollowMaterial = isFollowMaterial;
    return this;
  }

   /**
   * 是否跟随素材
   * @return isFollowMaterial
  **/
  @javax.annotation.Nullable
  public Long getIsFollowMaterial() {
    return isFollowMaterial;
  }


  public void setIsFollowMaterial(Long isFollowMaterial) {
    this.isFollowMaterial = isFollowMaterial;
  }


  public AdlabGroupCreateV30RequestCreativeInfo playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 搭配试玩素材url 可使用搭配试玩场景： 推广目的（landing_type）为APP，投放范围（delivery_range）为UNION穿山甲，且union_video_type &#x3D; REWARDED_VIDEO激励视频
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public AdlabGroupCreateV30RequestCreativeInfo source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 广告来源，2-10个字符，当推广目的为APP时字符限制为1-20，当推广目的为应用下载且download_type为EXTERNAL_URL时必填
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AdlabGroupCreateV30RequestCreativeInfo titleMaterials(List<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials) {
    
    this.titleMaterials = titleMaterials;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfo addTitleMaterialsItem(AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner titleMaterialsItem) {
    if (this.titleMaterials == null) {
      this.titleMaterials = new ArrayList<>();
    }
    this.titleMaterials.add(titleMaterialsItem);
    return this;
  }

   /**
   * 标题素材 最多50个，当广告位选择通投智选时最少3个，其余场景下最少1个
   * @return titleMaterials
  **/
  @javax.annotation.Nonnull
  public List<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner> getTitleMaterials() {
    return titleMaterials;
  }


  public void setTitleMaterials(List<AdlabGroupCreateV30RequestCreativeInfoTitleMaterialsInner> titleMaterials) {
    this.titleMaterials = titleMaterials;
  }


  public AdlabGroupCreateV30RequestCreativeInfo videoMaterials(List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials) {
    
    this.videoMaterials = videoMaterials;
    return this;
  }

  public AdlabGroupCreateV30RequestCreativeInfo addVideoMaterialsItem(AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner videoMaterialsItem) {
    if (this.videoMaterials == null) {
      this.videoMaterials = new ArrayList<>();
    }
    this.videoMaterials.add(videoMaterialsItem);
    return this;
  }

   /**
   * 视频素材 最多使用50个视频，当通投场景下只选择视频不选择图片时至少选择3个视频，如果视频和图片都选择则要保证一个横版视频+一个竖版视频+一张大图横图。非通投场景至少传入1张图片或1个视频
   * @return videoMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner> getVideoMaterials() {
    return videoMaterials;
  }


  public void setVideoMaterials(List<AdlabGroupCreateV30RequestCreativeInfoVideoMaterialsInner> videoMaterials) {
    this.videoMaterials = videoMaterials;
  }


  public AdlabGroupCreateV30RequestCreativeInfo webUrl(String webUrl) {
    
    this.webUrl = webUrl;
    return this;
  }

   /**
   * 应用下载详情页
   * @return webUrl
  **/
  @javax.annotation.Nullable
  public String getWebUrl() {
    return webUrl;
  }


  public void setWebUrl(String webUrl) {
    this.webUrl = webUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdlabGroupCreateV30RequestCreativeInfo adlabGroupCreateV30RequestCreativeInfo = (AdlabGroupCreateV30RequestCreativeInfo) o;
    return Objects.equals(this.adKeywords, adlabGroupCreateV30RequestCreativeInfo.adKeywords) &&
        Objects.equals(this.appName, adlabGroupCreateV30RequestCreativeInfo.appName) &&
        Objects.equals(this.autoStop, adlabGroupCreateV30RequestCreativeInfo.autoStop) &&
        Objects.equals(this.creativeAutoGenerateSwitch, adlabGroupCreateV30RequestCreativeInfo.creativeAutoGenerateSwitch) &&
        Objects.equals(this.externalUrl, adlabGroupCreateV30RequestCreativeInfo.externalUrl) &&
        Objects.equals(this.imageMaterials, adlabGroupCreateV30RequestCreativeInfo.imageMaterials) &&
        Objects.equals(this.industryV3, adlabGroupCreateV30RequestCreativeInfo.industryV3) &&
        Objects.equals(this.isCommentDisable, adlabGroupCreateV30RequestCreativeInfo.isCommentDisable) &&
        Objects.equals(this.isFollowMaterial, adlabGroupCreateV30RequestCreativeInfo.isFollowMaterial) &&
        Objects.equals(this.playableUrl, adlabGroupCreateV30RequestCreativeInfo.playableUrl) &&
        Objects.equals(this.source, adlabGroupCreateV30RequestCreativeInfo.source) &&
        Objects.equals(this.titleMaterials, adlabGroupCreateV30RequestCreativeInfo.titleMaterials) &&
        Objects.equals(this.videoMaterials, adlabGroupCreateV30RequestCreativeInfo.videoMaterials) &&
        Objects.equals(this.webUrl, adlabGroupCreateV30RequestCreativeInfo.webUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, appName, autoStop, creativeAutoGenerateSwitch, externalUrl, imageMaterials, industryV3, isCommentDisable, isFollowMaterial, playableUrl, source, titleMaterials, videoMaterials, webUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdlabGroupCreateV30RequestCreativeInfo {\n");
    sb.append("    adKeywords: ").append(toIndentedString(adKeywords)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    autoStop: ").append(toIndentedString(autoStop)).append("\n");
    sb.append("    creativeAutoGenerateSwitch: ").append(toIndentedString(creativeAutoGenerateSwitch)).append("\n");
    sb.append("    externalUrl: ").append(toIndentedString(externalUrl)).append("\n");
    sb.append("    imageMaterials: ").append(toIndentedString(imageMaterials)).append("\n");
    sb.append("    industryV3: ").append(toIndentedString(industryV3)).append("\n");
    sb.append("    isCommentDisable: ").append(toIndentedString(isCommentDisable)).append("\n");
    sb.append("    isFollowMaterial: ").append(toIndentedString(isFollowMaterial)).append("\n");
    sb.append("    playableUrl: ").append(toIndentedString(playableUrl)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    titleMaterials: ").append(toIndentedString(titleMaterials)).append("\n");
    sb.append("    videoMaterials: ").append(toIndentedString(videoMaterials)).append("\n");
    sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
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
    openapiFields.add("ad_keywords");
    openapiFields.add("app_name");
    openapiFields.add("auto_stop");
    openapiFields.add("creative_auto_generate_switch");
    openapiFields.add("external_url");
    openapiFields.add("image_materials");
    openapiFields.add("industry_v3");
    openapiFields.add("is_comment_disable");
    openapiFields.add("is_follow_material");
    openapiFields.add("playable_url");
    openapiFields.add("source");
    openapiFields.add("title_materials");
    openapiFields.add("video_materials");
    openapiFields.add("web_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("title_materials");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupCreateV30RequestCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupCreateV30RequestCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupCreateV30RequestCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupCreateV30RequestCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupCreateV30RequestCreativeInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupCreateV30RequestCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupCreateV30RequestCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupCreateV30RequestCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupCreateV30RequestCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupCreateV30RequestCreativeInfo
  */
  public static AdlabGroupCreateV30RequestCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupCreateV30RequestCreativeInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupCreateV30RequestCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

