/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo;
import com.bytedance.ads.model.StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo {
  public static final String SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY = "accept_expiration_day";
  @SerializedName(SERIALIZED_NAME_ACCEPT_EXPIRATION_DAY)
  private Long acceptExpirationDay = null;

  public static final String SERIALIZED_NAME_AD_SYNC_CONF = "ad_sync_conf";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_CONF)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf adSyncConf = null;

  public static final String SERIALIZED_NAME_ATTACHMENT_TEXT = "attachment_text";
  @SerializedName(SERIALIZED_NAME_ATTACHMENT_TEXT)
  private String attachmentText = null;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<String> attachments = null;

  public static final String SERIALIZED_NAME_ATTATCHMENTS_URL = "attatchments_url";
  @SerializedName(SERIALIZED_NAME_ATTATCHMENTS_URL)
  private List<String> attatchmentsUrl = null;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName = null;

  public static final String SERIALIZED_NAME_CHALLENGE_REQUIREMENT = "challenge_requirement";
  @SerializedName(SERIALIZED_NAME_CHALLENGE_REQUIREMENT)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement challengeRequirement = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL = "component_click_monitor_url";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL)
  private String componentClickMonitorUrl = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo componentInfo = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public static final String SERIALIZED_NAME_CUSTOMIZE_INFO = "customize_info";
  @SerializedName(SERIALIZED_NAME_CUSTOMIZE_INFO)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo customizeInfo = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_DEMAND_REQUIREMENT = "demand_requirement";
  @SerializedName(SERIALIZED_NAME_DEMAND_REQUIREMENT)
  private StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement demandRequirement = null;

  public static final String SERIALIZED_NAME_EXPECT_REMAIN_TIME = "expect_remain_time";
  @SerializedName(SERIALIZED_NAME_EXPECT_REMAIN_TIME)
  private Long expectRemainTime = null;

  public static final String SERIALIZED_NAME_GOODS_LINK = "goods_link";
  @SerializedName(SERIALIZED_NAME_GOODS_LINK)
  private String goodsLink = null;

  public static final String SERIALIZED_NAME_IGNORE_SCRIPT = "ignore_script";
  @SerializedName(SERIALIZED_NAME_IGNORE_SCRIPT)
  private Long ignoreScript = null;

  public static final String SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL = "item_show_monitor_url";
  @SerializedName(SERIALIZED_NAME_ITEM_SHOW_MONITOR_URL)
  private String itemShowMonitorUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_CATEGORY = "product_category";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CATEGORY)
  private List<String> productCategory = null;

  public static final String SERIALIZED_NAME_PRODUCT_INDUSTRY = "product_industry";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INDUSTRY)
  private List<String> productIndustry = null;

  public static final String SERIALIZED_NAME_PRODUCT_INFORMATION = "product_information";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INFORMATION)
  private String productInformation = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PROMOTION_TARGET = "promotion_target";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TARGET)
  private String promotionTarget = null;

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo() {
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo acceptExpirationDay(Long acceptExpirationDay) {
    
    this.acceptExpirationDay = acceptExpirationDay;
    return this;
  }

   /**
   * 
   * @return acceptExpirationDay
  **/
  @javax.annotation.Nullable
  public Long getAcceptExpirationDay() {
    return acceptExpirationDay;
  }


  public void setAcceptExpirationDay(Long acceptExpirationDay) {
    this.acceptExpirationDay = acceptExpirationDay;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo adSyncConf(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf adSyncConf) {
    
    this.adSyncConf = adSyncConf;
    return this;
  }

   /**
   * Get adSyncConf
   * @return adSyncConf
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf getAdSyncConf() {
    return adSyncConf;
  }


  public void setAdSyncConf(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoAdSyncConf adSyncConf) {
    this.adSyncConf = adSyncConf;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo attachmentText(String attachmentText) {
    
    this.attachmentText = attachmentText;
    return this;
  }

   /**
   * 
   * @return attachmentText
  **/
  @javax.annotation.Nullable
  public String getAttachmentText() {
    return attachmentText;
  }


  public void setAttachmentText(String attachmentText) {
    this.attachmentText = attachmentText;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo attatchmentsUrl(List<String> attatchmentsUrl) {
    
    this.attatchmentsUrl = attatchmentsUrl;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo addAttatchmentsUrlItem(String attatchmentsUrlItem) {
    if (this.attatchmentsUrl == null) {
      this.attatchmentsUrl = new ArrayList<>();
    }
    this.attatchmentsUrl.add(attatchmentsUrlItem);
    return this;
  }

   /**
   * 
   * @return attatchmentsUrl
  **/
  @javax.annotation.Nullable
  public List<String> getAttatchmentsUrl() {
    return attatchmentsUrl;
  }


  public void setAttatchmentsUrl(List<String> attatchmentsUrl) {
    this.attatchmentsUrl = attatchmentsUrl;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 
   * @return brandName
  **/
  @javax.annotation.Nullable
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo challengeRequirement(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement challengeRequirement) {
    
    this.challengeRequirement = challengeRequirement;
    return this;
  }

   /**
   * Get challengeRequirement
   * @return challengeRequirement
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement getChallengeRequirement() {
    return challengeRequirement;
  }


  public void setChallengeRequirement(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoChallengeRequirement challengeRequirement) {
    this.challengeRequirement = challengeRequirement;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo componentClickMonitorUrl(String componentClickMonitorUrl) {
    
    this.componentClickMonitorUrl = componentClickMonitorUrl;
    return this;
  }

   /**
   * 
   * @return componentClickMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getComponentClickMonitorUrl() {
    return componentClickMonitorUrl;
  }


  public void setComponentClickMonitorUrl(String componentClickMonitorUrl) {
    this.componentClickMonitorUrl = componentClickMonitorUrl;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo componentInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

   /**
   * Get componentInfo
   * @return componentInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoComponentInfo componentInfo) {
    this.componentInfo = componentInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 
   * @return contactName
  **/
  @javax.annotation.Nullable
  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 
   * @return contactPhone
  **/
  @javax.annotation.Nullable
  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo customizeInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo customizeInfo) {
    
    this.customizeInfo = customizeInfo;
    return this;
  }

   /**
   * Get customizeInfo
   * @return customizeInfo
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo getCustomizeInfo() {
    return customizeInfo;
  }


  public void setCustomizeInfo(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoCustomizeInfo customizeInfo) {
    this.customizeInfo = customizeInfo;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 
   * @return demandName
  **/
  @javax.annotation.Nullable
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo demandRequirement(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement demandRequirement) {
    
    this.demandRequirement = demandRequirement;
    return this;
  }

   /**
   * Get demandRequirement
   * @return demandRequirement
  **/
  @javax.annotation.Nullable
  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement getDemandRequirement() {
    return demandRequirement;
  }


  public void setDemandRequirement(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfoDemandRequirement demandRequirement) {
    this.demandRequirement = demandRequirement;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo expectRemainTime(Long expectRemainTime) {
    
    this.expectRemainTime = expectRemainTime;
    return this;
  }

   /**
   * 
   * @return expectRemainTime
  **/
  @javax.annotation.Nullable
  public Long getExpectRemainTime() {
    return expectRemainTime;
  }


  public void setExpectRemainTime(Long expectRemainTime) {
    this.expectRemainTime = expectRemainTime;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo goodsLink(String goodsLink) {
    
    this.goodsLink = goodsLink;
    return this;
  }

   /**
   * 
   * @return goodsLink
  **/
  @javax.annotation.Nullable
  public String getGoodsLink() {
    return goodsLink;
  }


  public void setGoodsLink(String goodsLink) {
    this.goodsLink = goodsLink;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo ignoreScript(Long ignoreScript) {
    
    this.ignoreScript = ignoreScript;
    return this;
  }

   /**
   * 
   * @return ignoreScript
  **/
  @javax.annotation.Nullable
  public Long getIgnoreScript() {
    return ignoreScript;
  }


  public void setIgnoreScript(Long ignoreScript) {
    this.ignoreScript = ignoreScript;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo itemShowMonitorUrl(String itemShowMonitorUrl) {
    
    this.itemShowMonitorUrl = itemShowMonitorUrl;
    return this;
  }

   /**
   * 
   * @return itemShowMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getItemShowMonitorUrl() {
    return itemShowMonitorUrl;
  }


  public void setItemShowMonitorUrl(String itemShowMonitorUrl) {
    this.itemShowMonitorUrl = itemShowMonitorUrl;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo productCategory(List<String> productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo addProductCategoryItem(String productCategoryItem) {
    if (this.productCategory == null) {
      this.productCategory = new ArrayList<>();
    }
    this.productCategory.add(productCategoryItem);
    return this;
  }

   /**
   * 
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public List<String> getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(List<String> productCategory) {
    this.productCategory = productCategory;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo productIndustry(List<String> productIndustry) {
    
    this.productIndustry = productIndustry;
    return this;
  }

  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo addProductIndustryItem(String productIndustryItem) {
    if (this.productIndustry == null) {
      this.productIndustry = new ArrayList<>();
    }
    this.productIndustry.add(productIndustryItem);
    return this;
  }

   /**
   * 
   * @return productIndustry
  **/
  @javax.annotation.Nullable
  public List<String> getProductIndustry() {
    return productIndustry;
  }


  public void setProductIndustry(List<String> productIndustry) {
    this.productIndustry = productIndustry;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo productInformation(String productInformation) {
    
    this.productInformation = productInformation;
    return this;
  }

   /**
   * 
   * @return productInformation
  **/
  @javax.annotation.Nullable
  public String getProductInformation() {
    return productInformation;
  }


  public void setProductInformation(String productInformation) {
    this.productInformation = productInformation;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo promotionTarget(String promotionTarget) {
    
    this.promotionTarget = promotionTarget;
    return this;
  }

   /**
   * 
   * @return promotionTarget
  **/
  @javax.annotation.Nullable
  public String getPromotionTarget() {
    return promotionTarget;
  }


  public void setPromotionTarget(String promotionTarget) {
    this.promotionTarget = promotionTarget;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo = (StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo) o;
    return Objects.equals(this.acceptExpirationDay, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.acceptExpirationDay) &&
        Objects.equals(this.adSyncConf, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.adSyncConf) &&
        Objects.equals(this.attachmentText, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.attachmentText) &&
        Objects.equals(this.attachments, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.attachments) &&
        Objects.equals(this.attatchmentsUrl, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.attatchmentsUrl) &&
        Objects.equals(this.brandName, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.brandName) &&
        Objects.equals(this.challengeRequirement, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.challengeRequirement) &&
        Objects.equals(this.componentClickMonitorUrl, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.componentClickMonitorUrl) &&
        Objects.equals(this.componentInfo, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.componentInfo) &&
        Objects.equals(this.contactName, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.contactName) &&
        Objects.equals(this.contactPhone, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.contactPhone) &&
        Objects.equals(this.customizeInfo, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.customizeInfo) &&
        Objects.equals(this.demandName, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.demandName) &&
        Objects.equals(this.demandRequirement, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.demandRequirement) &&
        Objects.equals(this.expectRemainTime, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.expectRemainTime) &&
        Objects.equals(this.goodsLink, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.goodsLink) &&
        Objects.equals(this.ignoreScript, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.ignoreScript) &&
        Objects.equals(this.itemShowMonitorUrl, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.itemShowMonitorUrl) &&
        Objects.equals(this.productCategory, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.productCategory) &&
        Objects.equals(this.productIndustry, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.productIndustry) &&
        Objects.equals(this.productInformation, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.productInformation) &&
        Objects.equals(this.productName, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.productName) &&
        Objects.equals(this.promotionTarget, starChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.promotionTarget);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptExpirationDay, adSyncConf, attachmentText, attachments, attatchmentsUrl, brandName, challengeRequirement, componentClickMonitorUrl, componentInfo, contactName, contactPhone, customizeInfo, demandName, demandRequirement, expectRemainTime, goodsLink, ignoreScript, itemShowMonitorUrl, productCategory, productIndustry, productInformation, productName, promotionTarget);
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
    sb.append("class StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo {\n");
    sb.append("    acceptExpirationDay: ").append(toIndentedString(acceptExpirationDay)).append("\n");
    sb.append("    adSyncConf: ").append(toIndentedString(adSyncConf)).append("\n");
    sb.append("    attachmentText: ").append(toIndentedString(attachmentText)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    attatchmentsUrl: ").append(toIndentedString(attatchmentsUrl)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    challengeRequirement: ").append(toIndentedString(challengeRequirement)).append("\n");
    sb.append("    componentClickMonitorUrl: ").append(toIndentedString(componentClickMonitorUrl)).append("\n");
    sb.append("    componentInfo: ").append(toIndentedString(componentInfo)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    contactPhone: ").append(toIndentedString(contactPhone)).append("\n");
    sb.append("    customizeInfo: ").append(toIndentedString(customizeInfo)).append("\n");
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    demandRequirement: ").append(toIndentedString(demandRequirement)).append("\n");
    sb.append("    expectRemainTime: ").append(toIndentedString(expectRemainTime)).append("\n");
    sb.append("    goodsLink: ").append(toIndentedString(goodsLink)).append("\n");
    sb.append("    ignoreScript: ").append(toIndentedString(ignoreScript)).append("\n");
    sb.append("    itemShowMonitorUrl: ").append(toIndentedString(itemShowMonitorUrl)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productIndustry: ").append(toIndentedString(productIndustry)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    promotionTarget: ").append(toIndentedString(promotionTarget)).append("\n");
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
    openapiFields.add("accept_expiration_day");
    openapiFields.add("ad_sync_conf");
    openapiFields.add("attachment_text");
    openapiFields.add("attachments");
    openapiFields.add("attatchments_url");
    openapiFields.add("brand_name");
    openapiFields.add("challenge_requirement");
    openapiFields.add("component_click_monitor_url");
    openapiFields.add("component_info");
    openapiFields.add("contact_name");
    openapiFields.add("contact_phone");
    openapiFields.add("customize_info");
    openapiFields.add("demand_name");
    openapiFields.add("demand_requirement");
    openapiFields.add("expect_remain_time");
    openapiFields.add("goods_link");
    openapiFields.add("ignore_script");
    openapiFields.add("item_show_monitor_url");
    openapiFields.add("product_category");
    openapiFields.add("product_industry");
    openapiFields.add("product_information");
    openapiFields.add("product_name");
    openapiFields.add("promotion_target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo>() {
           @Override
           public void write(JsonWriter out, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo
  * @throws IOException if the JSON string is invalid with respect to StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo
  */
  public static StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo.class);
  }

 /**
  * Convert an instance of StarChallengeInfoV2ResponseDataTaskInfoListInnerDemandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

