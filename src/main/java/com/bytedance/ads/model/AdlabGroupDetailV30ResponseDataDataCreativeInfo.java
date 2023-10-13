/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner;
import com.bytedance.ads.model.AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * 广告创意维度信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T15:22:35.223235852+08:00[PRC]")
public class AdlabGroupDetailV30ResponseDataDataCreativeInfo {
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
  private List<AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner> imageMaterials = null;

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
  private List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner> titleMaterials = null;

  public static final String SERIALIZED_NAME_VIDEO_MATERIALS = "video_materials";
  @SerializedName(SERIALIZED_NAME_VIDEO_MATERIALS)
  private List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner> videoMaterials = null;

  public static final String SERIALIZED_NAME_WEB_URL = "web_url";
  @SerializedName(SERIALIZED_NAME_WEB_URL)
  private String webUrl = null;

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo() {
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo adKeywords(List<String> adKeywords) {
    
    this.adKeywords = adKeywords;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo addAdKeywordsItem(String adKeywordsItem) {
    if (this.adKeywords == null) {
      this.adKeywords = new ArrayList<>();
    }
    this.adKeywords.add(adKeywordsItem);
    return this;
  }

   /**
   * 创意标签
   * @return adKeywords
  **/
  @javax.annotation.Nullable
  public List<String> getAdKeywords() {
    return adKeywords;
  }


  public void setAdKeywords(List<String> adKeywords) {
    this.adKeywords = adKeywords;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo autoStop(Long autoStop) {
    
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


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo creativeAutoGenerateSwitch(Long creativeAutoGenerateSwitch) {
    
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


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo externalUrl(String externalUrl) {
    
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


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo imageMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner> imageMaterials) {
    
    this.imageMaterials = imageMaterials;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo addImageMaterialsItem(AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner imageMaterialsItem) {
    if (this.imageMaterials == null) {
      this.imageMaterials = new ArrayList<>();
    }
    this.imageMaterials.add(imageMaterialsItem);
    return this;
  }

   /**
   * 图片素材 
   * @return imageMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner> getImageMaterials() {
    return imageMaterials;
  }


  public void setImageMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoImageMaterialsInner> imageMaterials) {
    this.imageMaterials = imageMaterials;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo industryV3(Long industryV3) {
    
    this.industryV3 = industryV3;
    return this;
  }

   /**
   * 创意分类-三级行业
   * @return industryV3
  **/
  @javax.annotation.Nullable
  public Long getIndustryV3() {
    return industryV3;
  }


  public void setIndustryV3(Long industryV3) {
    this.industryV3 = industryV3;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo isCommentDisable(Long isCommentDisable) {
    
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


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo isFollowMaterial(Long isFollowMaterial) {
    
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


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo playableUrl(String playableUrl) {
    
    this.playableUrl = playableUrl;
    return this;
  }

   /**
   * 搭配试玩素材url
   * @return playableUrl
  **/
  @javax.annotation.Nullable
  public String getPlayableUrl() {
    return playableUrl;
  }


  public void setPlayableUrl(String playableUrl) {
    this.playableUrl = playableUrl;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo source(String source) {
    
    this.source = source;
    return this;
  }

   /**
   * 广告来源
   * @return source
  **/
  @javax.annotation.Nullable
  public String getSource() {
    return source;
  }


  public void setSource(String source) {
    this.source = source;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo titleMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner> titleMaterials) {
    
    this.titleMaterials = titleMaterials;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo addTitleMaterialsItem(AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner titleMaterialsItem) {
    if (this.titleMaterials == null) {
      this.titleMaterials = new ArrayList<>();
    }
    this.titleMaterials.add(titleMaterialsItem);
    return this;
  }

   /**
   * 标题素材
   * @return titleMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner> getTitleMaterials() {
    return titleMaterials;
  }


  public void setTitleMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoTitleMaterialsInner> titleMaterials) {
    this.titleMaterials = titleMaterials;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo videoMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner> videoMaterials) {
    
    this.videoMaterials = videoMaterials;
    return this;
  }

  public AdlabGroupDetailV30ResponseDataDataCreativeInfo addVideoMaterialsItem(AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner videoMaterialsItem) {
    if (this.videoMaterials == null) {
      this.videoMaterials = new ArrayList<>();
    }
    this.videoMaterials.add(videoMaterialsItem);
    return this;
  }

   /**
   * 视频素材
   * @return videoMaterials
  **/
  @javax.annotation.Nullable
  public List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner> getVideoMaterials() {
    return videoMaterials;
  }


  public void setVideoMaterials(List<AdlabGroupDetailV30ResponseDataDataCreativeInfoVideoMaterialsInner> videoMaterials) {
    this.videoMaterials = videoMaterials;
  }


  public AdlabGroupDetailV30ResponseDataDataCreativeInfo webUrl(String webUrl) {
    
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
    AdlabGroupDetailV30ResponseDataDataCreativeInfo adlabGroupDetailV30ResponseDataDataCreativeInfo = (AdlabGroupDetailV30ResponseDataDataCreativeInfo) o;
    return Objects.equals(this.adKeywords, adlabGroupDetailV30ResponseDataDataCreativeInfo.adKeywords) &&
        Objects.equals(this.appName, adlabGroupDetailV30ResponseDataDataCreativeInfo.appName) &&
        Objects.equals(this.autoStop, adlabGroupDetailV30ResponseDataDataCreativeInfo.autoStop) &&
        Objects.equals(this.creativeAutoGenerateSwitch, adlabGroupDetailV30ResponseDataDataCreativeInfo.creativeAutoGenerateSwitch) &&
        Objects.equals(this.externalUrl, adlabGroupDetailV30ResponseDataDataCreativeInfo.externalUrl) &&
        Objects.equals(this.imageMaterials, adlabGroupDetailV30ResponseDataDataCreativeInfo.imageMaterials) &&
        Objects.equals(this.industryV3, adlabGroupDetailV30ResponseDataDataCreativeInfo.industryV3) &&
        Objects.equals(this.isCommentDisable, adlabGroupDetailV30ResponseDataDataCreativeInfo.isCommentDisable) &&
        Objects.equals(this.isFollowMaterial, adlabGroupDetailV30ResponseDataDataCreativeInfo.isFollowMaterial) &&
        Objects.equals(this.playableUrl, adlabGroupDetailV30ResponseDataDataCreativeInfo.playableUrl) &&
        Objects.equals(this.source, adlabGroupDetailV30ResponseDataDataCreativeInfo.source) &&
        Objects.equals(this.titleMaterials, adlabGroupDetailV30ResponseDataDataCreativeInfo.titleMaterials) &&
        Objects.equals(this.videoMaterials, adlabGroupDetailV30ResponseDataDataCreativeInfo.videoMaterials) &&
        Objects.equals(this.webUrl, adlabGroupDetailV30ResponseDataDataCreativeInfo.webUrl);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(adKeywords, appName, autoStop, creativeAutoGenerateSwitch, externalUrl, imageMaterials, industryV3, isCommentDisable, isFollowMaterial, playableUrl, source, titleMaterials, videoMaterials, webUrl);
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
    sb.append("class AdlabGroupDetailV30ResponseDataDataCreativeInfo {\n");
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
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AdlabGroupDetailV30ResponseDataDataCreativeInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AdlabGroupDetailV30ResponseDataDataCreativeInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AdlabGroupDetailV30ResponseDataDataCreativeInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<AdlabGroupDetailV30ResponseDataDataCreativeInfo>() {
           @Override
           public void write(JsonWriter out, AdlabGroupDetailV30ResponseDataDataCreativeInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AdlabGroupDetailV30ResponseDataDataCreativeInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AdlabGroupDetailV30ResponseDataDataCreativeInfo
  * @throws IOException if the JSON string is invalid with respect to AdlabGroupDetailV30ResponseDataDataCreativeInfo
  */
  public static AdlabGroupDetailV30ResponseDataDataCreativeInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AdlabGroupDetailV30ResponseDataDataCreativeInfo.class);
  }

 /**
  * Convert an instance of AdlabGroupDetailV30ResponseDataDataCreativeInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

