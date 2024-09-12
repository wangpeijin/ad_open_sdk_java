/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorAppIcon;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorProductImage;
import com.bytedance.ads.model.NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo;
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
 * 电商下载锚点，当anchor_type&#x3D;APP_SHOP: 应用下载-电商锚点时必填
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-12T20:16:46.266280315+08:00[Asia/Shanghai]")
public class NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor {
  public static final String SERIALIZED_NAME_ACTIVITY_INFO = "activity_info";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_INFO)
  private String activityInfo = null;

  public static final String SERIALIZED_NAME_ANDROID_ANCHOR_TITLE = "android_anchor_title";
  @SerializedName(SERIALIZED_NAME_ANDROID_ANCHOR_TITLE)
  private String androidAnchorTitle = null;

  public static final String SERIALIZED_NAME_ANDROID_PKG_NAME = "android_pkg_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_PKG_NAME)
  private String androidPkgName = null;

  public static final String SERIALIZED_NAME_APP_ICON = "app_icon";
  @SerializedName(SERIALIZED_NAME_APP_ICON)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon = null;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = null;

  public static final String SERIALIZED_NAME_APP_OPEN_URL = "app_open_url";
  @SerializedName(SERIALIZED_NAME_APP_OPEN_URL)
  private String appOpenUrl = null;

  public static final String SERIALIZED_NAME_DETAIL_INFO = "detail_info";
  @SerializedName(SERIALIZED_NAME_DETAIL_INFO)
  private String detailInfo = null;

  public static final String SERIALIZED_NAME_DOWNLOAD_GUIDE_TEXT = "download_guide_text";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_GUIDE_TEXT)
  private String downloadGuideText = null;

  public static final String SERIALIZED_NAME_EXTERNAL_TYPE = "external_type";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_TYPE)
  private Long externalType = null;

  public static final String SERIALIZED_NAME_IOS_ANCHOR_TITLE = "ios_anchor_title";
  @SerializedName(SERIALIZED_NAME_IOS_ANCHOR_TITLE)
  private String iosAnchorTitle = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ACTI_BANNER_IMAGE = "official_acti_banner_image";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ACTI_BANNER_IMAGE)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage = null;

  public static final String SERIALIZED_NAME_OFFICIAL_ACTI_TEXT = "official_acti_text";
  @SerializedName(SERIALIZED_NAME_OFFICIAL_ACTI_TEXT)
  private String officialActiText = null;

  public static final String SERIALIZED_NAME_ORANGE_SITE_INFO = "orange_site_info";
  @SerializedName(SERIALIZED_NAME_ORANGE_SITE_INFO)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo = null;

  public static final String SERIALIZED_NAME_PRODUCT_IMAGE = "product_image";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IMAGE)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PRODUCT_PRICE = "product_price";
  @SerializedName(SERIALIZED_NAME_PRODUCT_PRICE)
  private Double productPrice = null;

  public static final String SERIALIZED_NAME_PRODUCT_TAGS = "product_tags";
  @SerializedName(SERIALIZED_NAME_PRODUCT_TAGS)
  private List<String> productTags = null;

  public static final String SERIALIZED_NAME_SERVICE_INFO = "service_info";
  @SerializedName(SERIALIZED_NAME_SERVICE_INFO)
  private String serviceInfo = null;

  public static final String SERIALIZED_NAME_THIRD_SITE_INFO = "third_site_info";
  @SerializedName(SERIALIZED_NAME_THIRD_SITE_INFO)
  private NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo = null;

  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor() {
  }

  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor activityInfo(String activityInfo) {
    
    this.activityInfo = activityInfo;
    return this;
  }

   /**
   * 活动信息文案，长度：1～20
   * @return activityInfo
  **/
  @javax.annotation.Nullable
  public String getActivityInfo() {
    return activityInfo;
  }


  public void setActivityInfo(String activityInfo) {
    this.activityInfo = activityInfo;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor androidAnchorTitle(String androidAnchorTitle) {
    
    this.androidAnchorTitle = androidAnchorTitle;
    return this;
  }

   /**
   * 安卓锚点入口标题字段，长度：1～12
   * @return androidAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getAndroidAnchorTitle() {
    return androidAnchorTitle;
  }


  public void setAndroidAnchorTitle(String androidAnchorTitle) {
    this.androidAnchorTitle = androidAnchorTitle;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor androidPkgName(String androidPkgName) {
    
    this.androidPkgName = androidPkgName;
    return this;
  }

   /**
   * 安卓包名
   * @return androidPkgName
  **/
  @javax.annotation.Nullable
  public String getAndroidPkgName() {
    return androidPkgName;
  }


  public void setAndroidPkgName(String androidPkgName) {
    this.androidPkgName = androidPkgName;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appIcon(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon) {
    
    this.appIcon = appIcon;
    return this;
  }

   /**
   * Get appIcon
   * @return appIcon
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorAppIcon getAppIcon() {
    return appIcon;
  }


  public void setAppIcon(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorAppIcon appIcon) {
    this.appIcon = appIcon;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称，长度：1～6
   * @return appName
  **/
  @javax.annotation.Nullable
  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor appOpenUrl(String appOpenUrl) {
    
    this.appOpenUrl = appOpenUrl;
    return this;
  }

   /**
   * 应用吊起链接
   * @return appOpenUrl
  **/
  @javax.annotation.Nullable
  public String getAppOpenUrl() {
    return appOpenUrl;
  }


  public void setAppOpenUrl(String appOpenUrl) {
    this.appOpenUrl = appOpenUrl;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor detailInfo(String detailInfo) {
    
    this.detailInfo = detailInfo;
    return this;
  }

   /**
   * 详情信息文案，长度：1～20
   * @return detailInfo
  **/
  @javax.annotation.Nullable
  public String getDetailInfo() {
    return detailInfo;
  }


  public void setDetailInfo(String detailInfo) {
    this.detailInfo = detailInfo;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor downloadGuideText(String downloadGuideText) {
    
    this.downloadGuideText = downloadGuideText;
    return this;
  }

   /**
   * APP下载引导文案，长度：1～12
   * @return downloadGuideText
  **/
  @javax.annotation.Nullable
  public String getDownloadGuideText() {
    return downloadGuideText;
  }


  public void setDownloadGuideText(String downloadGuideText) {
    this.downloadGuideText = downloadGuideText;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor externalType(Long externalType) {
    
    this.externalType = externalType;
    return this;
  }

   /**
   * 跳转链接类型枚举，1：橙子建站，橙子建站落地页设置字段必填；2：第三方落地页，第三方落地页设置字段必填
   * @return externalType
  **/
  @javax.annotation.Nullable
  public Long getExternalType() {
    return externalType;
  }


  public void setExternalType(Long externalType) {
    this.externalType = externalType;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor iosAnchorTitle(String iosAnchorTitle) {
    
    this.iosAnchorTitle = iosAnchorTitle;
    return this;
  }

   /**
   * ios 锚点入口标题字段，长度：1～12
   * @return iosAnchorTitle
  **/
  @javax.annotation.Nullable
  public String getIosAnchorTitle() {
    return iosAnchorTitle;
  }


  public void setIosAnchorTitle(String iosAnchorTitle) {
    this.iosAnchorTitle = iosAnchorTitle;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor officialActiBannerImage(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    
    this.officialActiBannerImage = officialActiBannerImage;
    return this;
  }

   /**
   * Get officialActiBannerImage
   * @return officialActiBannerImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage getOfficialActiBannerImage() {
    return officialActiBannerImage;
  }


  public void setOfficialActiBannerImage(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOfficialActiBannerImage officialActiBannerImage) {
    this.officialActiBannerImage = officialActiBannerImage;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor officialActiText(String officialActiText) {
    
    this.officialActiText = officialActiText;
    return this;
  }

   /**
   * 官方活动描述详情，长度：1～15
   * @return officialActiText
  **/
  @javax.annotation.Nullable
  public String getOfficialActiText() {
    return officialActiText;
  }


  public void setOfficialActiText(String officialActiText) {
    this.officialActiText = officialActiText;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor orangeSiteInfo(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    
    this.orangeSiteInfo = orangeSiteInfo;
    return this;
  }

   /**
   * Get orangeSiteInfo
   * @return orangeSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo getOrangeSiteInfo() {
    return orangeSiteInfo;
  }


  public void setOrangeSiteInfo(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorOrangeSiteInfo orangeSiteInfo) {
    this.orangeSiteInfo = orangeSiteInfo;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor productImage(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage) {
    
    this.productImage = productImage;
    return this;
  }

   /**
   * Get productImage
   * @return productImage
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorProductImage getProductImage() {
    return productImage;
  }


  public void setProductImage(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorProductImage productImage) {
    this.productImage = productImage;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 商品名称，长度1～10
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor productPrice(Double productPrice) {
    
    this.productPrice = productPrice;
    return this;
  }

   /**
   * 商品价格（整数，且单位：元）
   * @return productPrice
  **/
  @javax.annotation.Nullable
  public Double getProductPrice() {
    return productPrice;
  }


  public void setProductPrice(Double productPrice) {
    this.productPrice = productPrice;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor productTags(List<String> productTags) {
    
    this.productTags = productTags;
    return this;
  }

  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor addProductTagsItem(String productTagsItem) {
    if (this.productTags == null) {
      this.productTags = new ArrayList<>();
    }
    this.productTags.add(productTagsItem);
    return this;
  }

   /**
   * 商品标签列表，每个标签长度：1～4，标签个数：1～3
   * @return productTags
  **/
  @javax.annotation.Nullable
  public List<String> getProductTags() {
    return productTags;
  }


  public void setProductTags(List<String> productTags) {
    this.productTags = productTags;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor serviceInfo(String serviceInfo) {
    
    this.serviceInfo = serviceInfo;
    return this;
  }

   /**
   * 服务信息文案，长度：1～20
   * @return serviceInfo
  **/
  @javax.annotation.Nullable
  public String getServiceInfo() {
    return serviceInfo;
  }


  public void setServiceInfo(String serviceInfo) {
    this.serviceInfo = serviceInfo;
  }


  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor thirdSiteInfo(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
    
    this.thirdSiteInfo = thirdSiteInfo;
    return this;
  }

   /**
   * Get thirdSiteInfo
   * @return thirdSiteInfo
  **/
  @javax.annotation.Nullable
  public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo getThirdSiteInfo() {
    return thirdSiteInfo;
  }


  public void setThirdSiteInfo(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchorThirdSiteInfo thirdSiteInfo) {
    this.thirdSiteInfo = thirdSiteInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor = (NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor) o;
    return Objects.equals(this.activityInfo, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.activityInfo) &&
        Objects.equals(this.androidAnchorTitle, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.androidAnchorTitle) &&
        Objects.equals(this.androidPkgName, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.androidPkgName) &&
        Objects.equals(this.appIcon, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.appIcon) &&
        Objects.equals(this.appName, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.appName) &&
        Objects.equals(this.appOpenUrl, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.appOpenUrl) &&
        Objects.equals(this.detailInfo, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.detailInfo) &&
        Objects.equals(this.downloadGuideText, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.downloadGuideText) &&
        Objects.equals(this.externalType, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.externalType) &&
        Objects.equals(this.iosAnchorTitle, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.iosAnchorTitle) &&
        Objects.equals(this.officialActiBannerImage, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.officialActiBannerImage) &&
        Objects.equals(this.officialActiText, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.officialActiText) &&
        Objects.equals(this.orangeSiteInfo, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.orangeSiteInfo) &&
        Objects.equals(this.productImage, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.productImage) &&
        Objects.equals(this.productName, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.productName) &&
        Objects.equals(this.productPrice, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.productPrice) &&
        Objects.equals(this.productTags, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.productTags) &&
        Objects.equals(this.serviceInfo, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.serviceInfo) &&
        Objects.equals(this.thirdSiteInfo, nativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.thirdSiteInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityInfo, androidAnchorTitle, androidPkgName, appIcon, appName, appOpenUrl, detailInfo, downloadGuideText, externalType, iosAnchorTitle, officialActiBannerImage, officialActiText, orangeSiteInfo, productImage, productName, productPrice, productTags, serviceInfo, thirdSiteInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor {\n");
    sb.append("    activityInfo: ").append(toIndentedString(activityInfo)).append("\n");
    sb.append("    androidAnchorTitle: ").append(toIndentedString(androidAnchorTitle)).append("\n");
    sb.append("    androidPkgName: ").append(toIndentedString(androidPkgName)).append("\n");
    sb.append("    appIcon: ").append(toIndentedString(appIcon)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appOpenUrl: ").append(toIndentedString(appOpenUrl)).append("\n");
    sb.append("    detailInfo: ").append(toIndentedString(detailInfo)).append("\n");
    sb.append("    downloadGuideText: ").append(toIndentedString(downloadGuideText)).append("\n");
    sb.append("    externalType: ").append(toIndentedString(externalType)).append("\n");
    sb.append("    iosAnchorTitle: ").append(toIndentedString(iosAnchorTitle)).append("\n");
    sb.append("    officialActiBannerImage: ").append(toIndentedString(officialActiBannerImage)).append("\n");
    sb.append("    officialActiText: ").append(toIndentedString(officialActiText)).append("\n");
    sb.append("    orangeSiteInfo: ").append(toIndentedString(orangeSiteInfo)).append("\n");
    sb.append("    productImage: ").append(toIndentedString(productImage)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    productPrice: ").append(toIndentedString(productPrice)).append("\n");
    sb.append("    productTags: ").append(toIndentedString(productTags)).append("\n");
    sb.append("    serviceInfo: ").append(toIndentedString(serviceInfo)).append("\n");
    sb.append("    thirdSiteInfo: ").append(toIndentedString(thirdSiteInfo)).append("\n");
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
    openapiFields.add("activity_info");
    openapiFields.add("android_anchor_title");
    openapiFields.add("android_pkg_name");
    openapiFields.add("app_icon");
    openapiFields.add("app_name");
    openapiFields.add("app_open_url");
    openapiFields.add("detail_info");
    openapiFields.add("download_guide_text");
    openapiFields.add("external_type");
    openapiFields.add("ios_anchor_title");
    openapiFields.add("official_acti_banner_image");
    openapiFields.add("official_acti_text");
    openapiFields.add("orange_site_info");
    openapiFields.add("product_image");
    openapiFields.add("product_name");
    openapiFields.add("product_price");
    openapiFields.add("product_tags");
    openapiFields.add("service_info");
    openapiFields.add("third_site_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.class));

       return (TypeAdapter<T>) new TypeAdapter<NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor>() {
           @Override
           public void write(JsonWriter out, NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor
  * @throws IOException if the JSON string is invalid with respect to NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor
  */
  public static NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor.class);
  }

 /**
  * Convert an instance of NativeAnchorUpdateV30RequestAnchorInfoAppEcommerceAnchor to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

