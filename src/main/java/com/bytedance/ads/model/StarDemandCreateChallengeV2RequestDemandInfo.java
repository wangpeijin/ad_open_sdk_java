/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestDemandInfoAdSyncConf;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement;
import com.bytedance.ads.model.StarDemandCreateChallengeV2RequestDemandInfoComponentInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-10T15:29:00.246104612+08:00[Asia/Shanghai]")
public class StarDemandCreateChallengeV2RequestDemandInfo {
  public static final String SERIALIZED_NAME_AD_SYNC_CONF = "ad_sync_conf";
  @SerializedName(SERIALIZED_NAME_AD_SYNC_CONF)
  private StarDemandCreateChallengeV2RequestDemandInfoAdSyncConf adSyncConf = null;

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
  private StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement challengeRequirement = null;

  public static final String SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL = "component_click_monitor_url";
  @SerializedName(SERIALIZED_NAME_COMPONENT_CLICK_MONITOR_URL)
  private String componentClickMonitorUrl = null;

  public static final String SERIALIZED_NAME_COMPONENT_INFO = "component_info";
  @SerializedName(SERIALIZED_NAME_COMPONENT_INFO)
  private StarDemandCreateChallengeV2RequestDemandInfoComponentInfo componentInfo = null;

  public static final String SERIALIZED_NAME_CONTACT_NAME = "contact_name";
  @SerializedName(SERIALIZED_NAME_CONTACT_NAME)
  private String contactName = null;

  public static final String SERIALIZED_NAME_CONTACT_PHONE = "contact_phone";
  @SerializedName(SERIALIZED_NAME_CONTACT_PHONE)
  private String contactPhone = null;

  public static final String SERIALIZED_NAME_DEMAND_NAME = "demand_name";
  @SerializedName(SERIALIZED_NAME_DEMAND_NAME)
  private String demandName = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME = "expiration_time";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME)
  private Long expirationTime = null;

  public static final String SERIALIZED_NAME_EXPIRATION_TIME_END = "expiration_time_end";
  @SerializedName(SERIALIZED_NAME_EXPIRATION_TIME_END)
  private Long expirationTimeEnd = null;

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

  public static final String SERIALIZED_NAME_PRODUCT_LINK = "product_link";
  @SerializedName(SERIALIZED_NAME_PRODUCT_LINK)
  private String productLink = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_PROMOTION_TARGET = "promotion_target";
  @SerializedName(SERIALIZED_NAME_PROMOTION_TARGET)
  private String promotionTarget = null;

  public StarDemandCreateChallengeV2RequestDemandInfo() {
  }

  public StarDemandCreateChallengeV2RequestDemandInfo adSyncConf(StarDemandCreateChallengeV2RequestDemandInfoAdSyncConf adSyncConf) {
    
    this.adSyncConf = adSyncConf;
    return this;
  }

   /**
   * Get adSyncConf
   * @return adSyncConf
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestDemandInfoAdSyncConf getAdSyncConf() {
    return adSyncConf;
  }


  public void setAdSyncConf(StarDemandCreateChallengeV2RequestDemandInfoAdSyncConf adSyncConf) {
    this.adSyncConf = adSyncConf;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo attachmentText(String attachmentText) {
    
    this.attachmentText = attachmentText;
    return this;
  }

   /**
   * 附件描述（补充说明，可包含网盘链接，建议用此项）
   * @return attachmentText
  **/
  @javax.annotation.Nullable
  public String getAttachmentText() {
    return attachmentText;
  }


  public void setAttachmentText(String attachmentText) {
    this.attachmentText = attachmentText;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo attachments(List<String> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfo addAttachmentsItem(String attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 附件（素材参考） 通过上传材料接口上传的文件名列表
   * @return attachments
  **/
  @javax.annotation.Nullable
  public List<String> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<String> attachments) {
    this.attachments = attachments;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo attatchmentsUrl(List<String> attatchmentsUrl) {
    
    this.attatchmentsUrl = attatchmentsUrl;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfo addAttatchmentsUrlItem(String attatchmentsUrlItem) {
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


  public StarDemandCreateChallengeV2RequestDemandInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 品牌名称 50字内。去品牌库中匹配，若无则返回错误。
   * @return brandName
  **/
  @javax.annotation.Nonnull
  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo challengeRequirement(StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement challengeRequirement) {
    
    this.challengeRequirement = challengeRequirement;
    return this;
  }

   /**
   * Get challengeRequirement
   * @return challengeRequirement
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement getChallengeRequirement() {
    return challengeRequirement;
  }


  public void setChallengeRequirement(StarDemandCreateChallengeV2RequestDemandInfoChallengeRequirement challengeRequirement) {
    this.challengeRequirement = challengeRequirement;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo componentClickMonitorUrl(String componentClickMonitorUrl) {
    
    this.componentClickMonitorUrl = componentClickMonitorUrl;
    return this;
  }

   /**
   * 组件点击监测链接 https开头的URL
   * @return componentClickMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getComponentClickMonitorUrl() {
    return componentClickMonitorUrl;
  }


  public void setComponentClickMonitorUrl(String componentClickMonitorUrl) {
    this.componentClickMonitorUrl = componentClickMonitorUrl;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo componentInfo(StarDemandCreateChallengeV2RequestDemandInfoComponentInfo componentInfo) {
    
    this.componentInfo = componentInfo;
    return this;
  }

   /**
   * Get componentInfo
   * @return componentInfo
  **/
  @javax.annotation.Nullable
  public StarDemandCreateChallengeV2RequestDemandInfoComponentInfo getComponentInfo() {
    return componentInfo;
  }


  public void setComponentInfo(StarDemandCreateChallengeV2RequestDemandInfoComponentInfo componentInfo) {
    this.componentInfo = componentInfo;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo contactName(String contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * 联系人电话 电话号码校验
   * @return contactName
  **/
  @javax.annotation.Nonnull
  public String getContactName() {
    return contactName;
  }


  public void setContactName(String contactName) {
    this.contactName = contactName;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo contactPhone(String contactPhone) {
    
    this.contactPhone = contactPhone;
    return this;
  }

   /**
   * 联系人姓名 20字内
   * @return contactPhone
  **/
  @javax.annotation.Nonnull
  public String getContactPhone() {
    return contactPhone;
  }


  public void setContactPhone(String contactPhone) {
    this.contactPhone = contactPhone;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo demandName(String demandName) {
    
    this.demandName = demandName;
    return this;
  }

   /**
   * 任务名称 60字内
   * @return demandName
  **/
  @javax.annotation.Nonnull
  public String getDemandName() {
    return demandName;
  }


  public void setDemandName(String demandName) {
    this.demandName = demandName;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo expirationTime(Long expirationTime) {
    
    this.expirationTime = expirationTime;
    return this;
  }

   /**
   * 
   * @return expirationTime
  **/
  @javax.annotation.Nullable
  public Long getExpirationTime() {
    return expirationTime;
  }


  public void setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo expirationTimeEnd(Long expirationTimeEnd) {
    
    this.expirationTimeEnd = expirationTimeEnd;
    return this;
  }

   /**
   * 
   * @return expirationTimeEnd
  **/
  @javax.annotation.Nullable
  public Long getExpirationTimeEnd() {
    return expirationTimeEnd;
  }


  public void setExpirationTimeEnd(Long expirationTimeEnd) {
    this.expirationTimeEnd = expirationTimeEnd;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo itemShowMonitorUrl(String itemShowMonitorUrl) {
    
    this.itemShowMonitorUrl = itemShowMonitorUrl;
    return this;
  }

   /**
   * 视频曝光监测链接 https开头的URL
   * @return itemShowMonitorUrl
  **/
  @javax.annotation.Nullable
  public String getItemShowMonitorUrl() {
    return itemShowMonitorUrl;
  }


  public void setItemShowMonitorUrl(String itemShowMonitorUrl) {
    this.itemShowMonitorUrl = itemShowMonitorUrl;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo productCategory(List<String> productCategory) {
    
    this.productCategory = productCategory;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfo addProductCategoryItem(String productCategoryItem) {
    if (this.productCategory == null) {
      this.productCategory = new ArrayList<>();
    }
    this.productCategory.add(productCategoryItem);
    return this;
  }

   /**
   * 所属类目 类目文本，特定品牌下需要
   * @return productCategory
  **/
  @javax.annotation.Nullable
  public List<String> getProductCategory() {
    return productCategory;
  }


  public void setProductCategory(List<String> productCategory) {
    this.productCategory = productCategory;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo productIndustry(List<String> productIndustry) {
    
    this.productIndustry = productIndustry;
    return this;
  }

  public StarDemandCreateChallengeV2RequestDemandInfo addProductIndustryItem(String productIndustryItem) {
    if (this.productIndustry == null) {
      this.productIndustry = new ArrayList<>();
    }
    this.productIndustry.add(productIndustryItem);
    return this;
  }

   /**
   * 产品所属行业 [一级行业, 二级行业]
   * @return productIndustry
  **/
  @javax.annotation.Nonnull
  public List<String> getProductIndustry() {
    return productIndustry;
  }


  public void setProductIndustry(List<String> productIndustry) {
    this.productIndustry = productIndustry;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo productInformation(String productInformation) {
    
    this.productInformation = productInformation;
    return this;
  }

   /**
   * 产品介绍 500字以内
   * @return productInformation
  **/
  @javax.annotation.Nonnull
  public String getProductInformation() {
    return productInformation;
  }


  public void setProductInformation(String productInformation) {
    this.productInformation = productInformation;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo productLink(String productLink) {
    
    this.productLink = productLink;
    return this;
  }

   /**
   * 商品链接
   * @return productLink
  **/
  @javax.annotation.Nullable
  public String getProductLink() {
    return productLink;
  }


  public void setProductLink(String productLink) {
    this.productLink = productLink;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品名称 40字内
   * @return productName
  **/
  @javax.annotation.Nonnull
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nullable
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public StarDemandCreateChallengeV2RequestDemandInfo promotionTarget(String promotionTarget) {
    
    this.promotionTarget = promotionTarget;
    return this;
  }

   /**
   * 营销目标 为以下之一 品牌传播 应用下载 电商卖货 影视宣传 门店推广 线索收集 破圈种草
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
    StarDemandCreateChallengeV2RequestDemandInfo starDemandCreateChallengeV2RequestDemandInfo = (StarDemandCreateChallengeV2RequestDemandInfo) o;
    return Objects.equals(this.adSyncConf, starDemandCreateChallengeV2RequestDemandInfo.adSyncConf) &&
        Objects.equals(this.attachmentText, starDemandCreateChallengeV2RequestDemandInfo.attachmentText) &&
        Objects.equals(this.attachments, starDemandCreateChallengeV2RequestDemandInfo.attachments) &&
        Objects.equals(this.attatchmentsUrl, starDemandCreateChallengeV2RequestDemandInfo.attatchmentsUrl) &&
        Objects.equals(this.brandName, starDemandCreateChallengeV2RequestDemandInfo.brandName) &&
        Objects.equals(this.challengeRequirement, starDemandCreateChallengeV2RequestDemandInfo.challengeRequirement) &&
        Objects.equals(this.componentClickMonitorUrl, starDemandCreateChallengeV2RequestDemandInfo.componentClickMonitorUrl) &&
        Objects.equals(this.componentInfo, starDemandCreateChallengeV2RequestDemandInfo.componentInfo) &&
        Objects.equals(this.contactName, starDemandCreateChallengeV2RequestDemandInfo.contactName) &&
        Objects.equals(this.contactPhone, starDemandCreateChallengeV2RequestDemandInfo.contactPhone) &&
        Objects.equals(this.demandName, starDemandCreateChallengeV2RequestDemandInfo.demandName) &&
        Objects.equals(this.expirationTime, starDemandCreateChallengeV2RequestDemandInfo.expirationTime) &&
        Objects.equals(this.expirationTimeEnd, starDemandCreateChallengeV2RequestDemandInfo.expirationTimeEnd) &&
        Objects.equals(this.itemShowMonitorUrl, starDemandCreateChallengeV2RequestDemandInfo.itemShowMonitorUrl) &&
        Objects.equals(this.productCategory, starDemandCreateChallengeV2RequestDemandInfo.productCategory) &&
        Objects.equals(this.productIndustry, starDemandCreateChallengeV2RequestDemandInfo.productIndustry) &&
        Objects.equals(this.productInformation, starDemandCreateChallengeV2RequestDemandInfo.productInformation) &&
        Objects.equals(this.productLink, starDemandCreateChallengeV2RequestDemandInfo.productLink) &&
        Objects.equals(this.productName, starDemandCreateChallengeV2RequestDemandInfo.productName) &&
        Objects.equals(this.projectId, starDemandCreateChallengeV2RequestDemandInfo.projectId) &&
        Objects.equals(this.promotionTarget, starDemandCreateChallengeV2RequestDemandInfo.promotionTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adSyncConf, attachmentText, attachments, attatchmentsUrl, brandName, challengeRequirement, componentClickMonitorUrl, componentInfo, contactName, contactPhone, demandName, expirationTime, expirationTimeEnd, itemShowMonitorUrl, productCategory, productIndustry, productInformation, productLink, productName, projectId, promotionTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandCreateChallengeV2RequestDemandInfo {\n");
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
    sb.append("    demandName: ").append(toIndentedString(demandName)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    expirationTimeEnd: ").append(toIndentedString(expirationTimeEnd)).append("\n");
    sb.append("    itemShowMonitorUrl: ").append(toIndentedString(itemShowMonitorUrl)).append("\n");
    sb.append("    productCategory: ").append(toIndentedString(productCategory)).append("\n");
    sb.append("    productIndustry: ").append(toIndentedString(productIndustry)).append("\n");
    sb.append("    productInformation: ").append(toIndentedString(productInformation)).append("\n");
    sb.append("    productLink: ").append(toIndentedString(productLink)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
    openapiFields.add("demand_name");
    openapiFields.add("expiration_time");
    openapiFields.add("expiration_time_end");
    openapiFields.add("item_show_monitor_url");
    openapiFields.add("product_category");
    openapiFields.add("product_industry");
    openapiFields.add("product_information");
    openapiFields.add("product_link");
    openapiFields.add("product_name");
    openapiFields.add("project_id");
    openapiFields.add("promotion_target");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("brand_name");
    openapiRequiredFields.add("contact_name");
    openapiRequiredFields.add("contact_phone");
    openapiRequiredFields.add("demand_name");
    openapiRequiredFields.add("product_industry");
    openapiRequiredFields.add("product_information");
    openapiRequiredFields.add("product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandCreateChallengeV2RequestDemandInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandCreateChallengeV2RequestDemandInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandCreateChallengeV2RequestDemandInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandCreateChallengeV2RequestDemandInfo>() {
           @Override
           public void write(JsonWriter out, StarDemandCreateChallengeV2RequestDemandInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandCreateChallengeV2RequestDemandInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandCreateChallengeV2RequestDemandInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandCreateChallengeV2RequestDemandInfo
  * @throws IOException if the JSON string is invalid with respect to StarDemandCreateChallengeV2RequestDemandInfo
  */
  public static StarDemandCreateChallengeV2RequestDemandInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandCreateChallengeV2RequestDemandInfo.class);
  }

 /**
  * Convert an instance of StarDemandCreateChallengeV2RequestDemandInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

