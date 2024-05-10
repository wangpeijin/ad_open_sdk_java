/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataStarTaskAnchorType;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataStarTaskExternalAction;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataStarTaskSource;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataStarTaskStatus;
import com.bytedance.ads.model.StardeliveryTaskDetailV30DataStarTaskSubStatus;
import com.bytedance.ads.model.StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo;
import com.bytedance.ads.model.StardeliveryTaskDetailV30ResponseDataStarTaskMaterialsRequirements;
import com.bytedance.ads.model.StardeliveryTaskDetailV30ResponseDataTaskContactInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class StardeliveryTaskDetailV30ResponseData {
  public static final String SERIALIZED_NAME_ANDROID_APP_PACKAGE_NAME = "android_app_package_name";
  @SerializedName(SERIALIZED_NAME_ANDROID_APP_PACKAGE_NAME)
  private String androidAppPackageName = null;

  public static final String SERIALIZED_NAME_ANDROID_DOWNLOAD_URL = "android_download_url";
  @SerializedName(SERIALIZED_NAME_ANDROID_DOWNLOAD_URL)
  private String androidDownloadUrl = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Long firstIndustryId = null;

  public static final String SERIALIZED_NAME_IOS_APP_PACKAGE_NAME = "ios_app_package_name";
  @SerializedName(SERIALIZED_NAME_IOS_APP_PACKAGE_NAME)
  private String iosAppPackageName = null;

  public static final String SERIALIZED_NAME_IOS_DOWNLOAD_URL = "ios_download_url";
  @SerializedName(SERIALIZED_NAME_IOS_DOWNLOAD_URL)
  private String iosDownloadUrl = null;

  public static final String SERIALIZED_NAME_PRODUCT_INTRODUCTION = "product_introduction";
  @SerializedName(SERIALIZED_NAME_PRODUCT_INTRODUCTION)
  private String productIntroduction = null;

  public static final String SERIALIZED_NAME_PRODUCT_NAME = "product_name";
  @SerializedName(SERIALIZED_NAME_PRODUCT_NAME)
  private String productName = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Long secondIndustryId = null;

  public static final String SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO = "star_ad_cost_divide_ratio";
  @SerializedName(SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO)
  private Double starAdCostDivideRatio = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_BID = "star_material_bid";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_BID)
  private Double starMaterialBid = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE = "star_material_first_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE)
  private Integer starMaterialFirstType = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE = "star_material_second_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE)
  private Integer starMaterialSecondType = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ANCHOR_ID = "star_task_anchor_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ANCHOR_ID)
  private Long starTaskAnchorId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE = "star_task_anchor_type";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE)
  private StardeliveryTaskDetailV30DataStarTaskAnchorType starTaskAnchorType = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ASSET_INFO = "star_task_asset_info";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ASSET_INFO)
  private StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo starTaskAssetInfo = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BAN_REASON_DETAIL = "star_task_ban_reason_detail";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BAN_REASON_DETAIL)
  private String starTaskBanReasonDetail = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BID = "star_task_bid";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BID)
  private Double starTaskBid = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BUDGET = "star_task_budget";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BUDGET)
  private Double starTaskBudget = null;

  public static final String SERIALIZED_NAME_STAR_TASK_CREATE_TIME = "star_task_create_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_CREATE_TIME)
  private String starTaskCreateTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION = "star_task_external_action";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION)
  private StardeliveryTaskDetailV30DataStarTaskExternalAction starTaskExternalAction = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS = "star_task_materials_requirements";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS)
  private StardeliveryTaskDetailV30ResponseDataStarTaskMaterialsRequirements starTaskMaterialsRequirements = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_POST_END_TIME = "star_task_post_end_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_POST_END_TIME)
  private String starTaskPostEndTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SOURCE = "star_task_source";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SOURCE)
  private StardeliveryTaskDetailV30DataStarTaskSource starTaskSource = null;

  public static final String SERIALIZED_NAME_STAR_TASK_START_TIME = "star_task_start_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_START_TIME)
  private String starTaskStartTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_STATUS = "star_task_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_STATUS)
  private StardeliveryTaskDetailV30DataStarTaskStatus starTaskStatus = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SUB_STATUS = "star_task_sub_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SUB_STATUS)
  private StardeliveryTaskDetailV30DataStarTaskSubStatus starTaskSubStatus = null;

  public static final String SERIALIZED_NAME_TASK_AVATAR_ID = "task_avatar_id";
  @SerializedName(SERIALIZED_NAME_TASK_AVATAR_ID)
  private String taskAvatarId = null;

  public static final String SERIALIZED_NAME_TASK_CONTACT_INFO = "task_contact_info";
  @SerializedName(SERIALIZED_NAME_TASK_CONTACT_INFO)
  private StardeliveryTaskDetailV30ResponseDataTaskContactInfo taskContactInfo = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE_ID = "task_head_image_id";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE_ID)
  private String taskHeadImageId = null;

  public StardeliveryTaskDetailV30ResponseData() {
  }

  public StardeliveryTaskDetailV30ResponseData androidAppPackageName(String androidAppPackageName) {
    
    this.androidAppPackageName = androidAppPackageName;
    return this;
  }

   /**
   * 任务内推广的Android应用包名
   * @return androidAppPackageName
  **/
  @javax.annotation.Nullable
  public String getAndroidAppPackageName() {
    return androidAppPackageName;
  }


  public void setAndroidAppPackageName(String androidAppPackageName) {
    this.androidAppPackageName = androidAppPackageName;
  }


  public StardeliveryTaskDetailV30ResponseData androidDownloadUrl(String androidDownloadUrl) {
    
    this.androidDownloadUrl = androidDownloadUrl;
    return this;
  }

   /**
   * 任务内推广的Android应用链接
   * @return androidDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getAndroidDownloadUrl() {
    return androidDownloadUrl;
  }


  public void setAndroidDownloadUrl(String androidDownloadUrl) {
    this.androidDownloadUrl = androidDownloadUrl;
  }


  public StardeliveryTaskDetailV30ResponseData authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称，1-50个字符，达人浏览任务时会看到此名称
   * @return authorTaskName
  **/
  @javax.annotation.Nullable
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StardeliveryTaskDetailV30ResponseData firstIndustryId(Long firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 一级行业分类ID
   * @return firstIndustryId
  **/
  @javax.annotation.Nullable
  public Long getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Long firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public StardeliveryTaskDetailV30ResponseData iosAppPackageName(String iosAppPackageName) {
    
    this.iosAppPackageName = iosAppPackageName;
    return this;
  }

   /**
   * 任务内推广的iOS应用包名
   * @return iosAppPackageName
  **/
  @javax.annotation.Nullable
  public String getIosAppPackageName() {
    return iosAppPackageName;
  }


  public void setIosAppPackageName(String iosAppPackageName) {
    this.iosAppPackageName = iosAppPackageName;
  }


  public StardeliveryTaskDetailV30ResponseData iosDownloadUrl(String iosDownloadUrl) {
    
    this.iosDownloadUrl = iosDownloadUrl;
    return this;
  }

   /**
   * 任务内推广的iOS应用链接
   * @return iosDownloadUrl
  **/
  @javax.annotation.Nullable
  public String getIosDownloadUrl() {
    return iosDownloadUrl;
  }


  public void setIosDownloadUrl(String iosDownloadUrl) {
    this.iosDownloadUrl = iosDownloadUrl;
  }


  public StardeliveryTaskDetailV30ResponseData productIntroduction(String productIntroduction) {
    
    this.productIntroduction = productIntroduction;
    return this;
  }

   /**
   * 产品介绍，1-1000个字符，介绍中出现数据、专利/奖项、影视片段、明星/网红、活动等信息
   * @return productIntroduction
  **/
  @javax.annotation.Nullable
  public String getProductIntroduction() {
    return productIntroduction;
  }


  public void setProductIntroduction(String productIntroduction) {
    this.productIntroduction = productIntroduction;
  }


  public StardeliveryTaskDetailV30ResponseData productName(String productName) {
    
    this.productName = productName;
    return this;
  }

   /**
   * 产品名称，1-40个字符，任务推广的产品名称
   * @return productName
  **/
  @javax.annotation.Nullable
  public String getProductName() {
    return productName;
  }


  public void setProductName(String productName) {
    this.productName = productName;
  }


  public StardeliveryTaskDetailV30ResponseData secondIndustryId(Long secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 二级行业分类ID
   * @return secondIndustryId
  **/
  @javax.annotation.Nullable
  public Long getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Long secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public StardeliveryTaskDetailV30ResponseData starAdCostDivideRatio(Double starAdCostDivideRatio) {
    
    this.starAdCostDivideRatio = starAdCostDivideRatio;
    return this;
  }

   /**
   * 广告消耗分成比例
   * @return starAdCostDivideRatio
  **/
  @javax.annotation.Nullable
  public Double getStarAdCostDivideRatio() {
    return starAdCostDivideRatio;
  }


  public void setStarAdCostDivideRatio(Double starAdCostDivideRatio) {
    this.starAdCostDivideRatio = starAdCostDivideRatio;
  }


  public StardeliveryTaskDetailV30ResponseData starMaterialBid(Double starMaterialBid) {
    
    this.starMaterialBid = starMaterialBid;
    return this;
  }

   /**
   * 素材出价（元），每条视频最低需要付给达人的底价价格
   * @return starMaterialBid
  **/
  @javax.annotation.Nullable
  public Double getStarMaterialBid() {
    return starMaterialBid;
  }


  public void setStarMaterialBid(Double starMaterialBid) {
    this.starMaterialBid = starMaterialBid;
  }


  public StardeliveryTaskDetailV30ResponseData starMaterialFirstType(Integer starMaterialFirstType) {
    
    this.starMaterialFirstType = starMaterialFirstType;
    return this;
  }

   /**
   * 素材一级类目id
   * @return starMaterialFirstType
  **/
  @javax.annotation.Nullable
  public Integer getStarMaterialFirstType() {
    return starMaterialFirstType;
  }


  public void setStarMaterialFirstType(Integer starMaterialFirstType) {
    this.starMaterialFirstType = starMaterialFirstType;
  }


  public StardeliveryTaskDetailV30ResponseData starMaterialSecondType(Integer starMaterialSecondType) {
    
    this.starMaterialSecondType = starMaterialSecondType;
    return this;
  }

   /**
   * 素材二级类目id
   * @return starMaterialSecondType
  **/
  @javax.annotation.Nullable
  public Integer getStarMaterialSecondType() {
    return starMaterialSecondType;
  }


  public void setStarMaterialSecondType(Integer starMaterialSecondType) {
    this.starMaterialSecondType = starMaterialSecondType;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskAnchorId(Long starTaskAnchorId) {
    
    this.starTaskAnchorId = starTaskAnchorId;
    return this;
  }

   /**
   * 原生锚点ID
   * @return starTaskAnchorId
  **/
  @javax.annotation.Nullable
  public Long getStarTaskAnchorId() {
    return starTaskAnchorId;
  }


  public void setStarTaskAnchorId(Long starTaskAnchorId) {
    this.starTaskAnchorId = starTaskAnchorId;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskAnchorType(StardeliveryTaskDetailV30DataStarTaskAnchorType starTaskAnchorType) {
    
    this.starTaskAnchorType = starTaskAnchorType;
    return this;
  }

   /**
   * Get starTaskAnchorType
   * @return starTaskAnchorType
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataStarTaskAnchorType getStarTaskAnchorType() {
    return starTaskAnchorType;
  }


  public void setStarTaskAnchorType(StardeliveryTaskDetailV30DataStarTaskAnchorType starTaskAnchorType) {
    this.starTaskAnchorType = starTaskAnchorType;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskAssetInfo(StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo starTaskAssetInfo) {
    
    this.starTaskAssetInfo = starTaskAssetInfo;
    return this;
  }

   /**
   * Get starTaskAssetInfo
   * @return starTaskAssetInfo
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo getStarTaskAssetInfo() {
    return starTaskAssetInfo;
  }


  public void setStarTaskAssetInfo(StardeliveryTaskDetailV30ResponseDataStarTaskAssetInfo starTaskAssetInfo) {
    this.starTaskAssetInfo = starTaskAssetInfo;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskBanReasonDetail(String starTaskBanReasonDetail) {
    
    this.starTaskBanReasonDetail = starTaskBanReasonDetail;
    return this;
  }

   /**
   * 任务审核拒绝原因和意见，没有则返回为空
   * @return starTaskBanReasonDetail
  **/
  @javax.annotation.Nullable
  public String getStarTaskBanReasonDetail() {
    return starTaskBanReasonDetail;
  }


  public void setStarTaskBanReasonDetail(String starTaskBanReasonDetail) {
    this.starTaskBanReasonDetail = starTaskBanReasonDetail;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskBid(Double starTaskBid) {
    
    this.starTaskBid = starTaskBid;
    return this;
  }

   /**
   * 任务出价（元）
   * @return starTaskBid
  **/
  @javax.annotation.Nullable
  public Double getStarTaskBid() {
    return starTaskBid;
  }


  public void setStarTaskBid(Double starTaskBid) {
    this.starTaskBid = starTaskBid;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskBudget(Double starTaskBudget) {
    
    this.starTaskBudget = starTaskBudget;
    return this;
  }

   /**
   * 任务预算（元），只能是10000-1000000元之间的整数
   * @return starTaskBudget
  **/
  @javax.annotation.Nullable
  public Double getStarTaskBudget() {
    return starTaskBudget;
  }


  public void setStarTaskBudget(Double starTaskBudget) {
    this.starTaskBudget = starTaskBudget;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskCreateTime(String starTaskCreateTime) {
    
    this.starTaskCreateTime = starTaskCreateTime;
    return this;
  }

   /**
   * 任务创建时间，格式YYYY-MM-DD 
   * @return starTaskCreateTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskCreateTime() {
    return starTaskCreateTime;
  }


  public void setStarTaskCreateTime(String starTaskCreateTime) {
    this.starTaskCreateTime = starTaskCreateTime;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskExternalAction(StardeliveryTaskDetailV30DataStarTaskExternalAction starTaskExternalAction) {
    
    this.starTaskExternalAction = starTaskExternalAction;
    return this;
  }

   /**
   * Get starTaskExternalAction
   * @return starTaskExternalAction
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataStarTaskExternalAction getStarTaskExternalAction() {
    return starTaskExternalAction;
  }


  public void setStarTaskExternalAction(StardeliveryTaskDetailV30DataStarTaskExternalAction starTaskExternalAction) {
    this.starTaskExternalAction = starTaskExternalAction;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 星广联投任务ID
   * @return starTaskId
  **/
  @javax.annotation.Nullable
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskMaterialsRequirements(StardeliveryTaskDetailV30ResponseDataStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
    return this;
  }

   /**
   * Get starTaskMaterialsRequirements
   * @return starTaskMaterialsRequirements
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30ResponseDataStarTaskMaterialsRequirements getStarTaskMaterialsRequirements() {
    return starTaskMaterialsRequirements;
  }


  public void setStarTaskMaterialsRequirements(StardeliveryTaskDetailV30ResponseDataStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskName(String starTaskName) {
    
    this.starTaskName = starTaskName;
    return this;
  }

   /**
   * 星广联投任务名称
   * @return starTaskName
  **/
  @javax.annotation.Nullable
  public String getStarTaskName() {
    return starTaskName;
  }


  public void setStarTaskName(String starTaskName) {
    this.starTaskName = starTaskName;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskPostEndTime(String starTaskPostEndTime) {
    
    this.starTaskPostEndTime = starTaskPostEndTime;
    return this;
  }

   /**
   * 任务结束时间为投稿截止时间,格式YYYY-MM-DD 
   * @return starTaskPostEndTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskPostEndTime() {
    return starTaskPostEndTime;
  }


  public void setStarTaskPostEndTime(String starTaskPostEndTime) {
    this.starTaskPostEndTime = starTaskPostEndTime;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskSource(StardeliveryTaskDetailV30DataStarTaskSource starTaskSource) {
    
    this.starTaskSource = starTaskSource;
    return this;
  }

   /**
   * Get starTaskSource
   * @return starTaskSource
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataStarTaskSource getStarTaskSource() {
    return starTaskSource;
  }


  public void setStarTaskSource(StardeliveryTaskDetailV30DataStarTaskSource starTaskSource) {
    this.starTaskSource = starTaskSource;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskStartTime(String starTaskStartTime) {
    
    this.starTaskStartTime = starTaskStartTime;
    return this;
  }

   /**
   * 任务开始时间，格式YYYY-MM-DD 
   * @return starTaskStartTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskStartTime() {
    return starTaskStartTime;
  }


  public void setStarTaskStartTime(String starTaskStartTime) {
    this.starTaskStartTime = starTaskStartTime;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskStatus(StardeliveryTaskDetailV30DataStarTaskStatus starTaskStatus) {
    
    this.starTaskStatus = starTaskStatus;
    return this;
  }

   /**
   * Get starTaskStatus
   * @return starTaskStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataStarTaskStatus getStarTaskStatus() {
    return starTaskStatus;
  }


  public void setStarTaskStatus(StardeliveryTaskDetailV30DataStarTaskStatus starTaskStatus) {
    this.starTaskStatus = starTaskStatus;
  }


  public StardeliveryTaskDetailV30ResponseData starTaskSubStatus(StardeliveryTaskDetailV30DataStarTaskSubStatus starTaskSubStatus) {
    
    this.starTaskSubStatus = starTaskSubStatus;
    return this;
  }

   /**
   * Get starTaskSubStatus
   * @return starTaskSubStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30DataStarTaskSubStatus getStarTaskSubStatus() {
    return starTaskSubStatus;
  }


  public void setStarTaskSubStatus(StardeliveryTaskDetailV30DataStarTaskSubStatus starTaskSubStatus) {
    this.starTaskSubStatus = starTaskSubStatus;
  }


  public StardeliveryTaskDetailV30ResponseData taskAvatarId(String taskAvatarId) {
    
    this.taskAvatarId = taskAvatarId;
    return this;
  }

   /**
   * 任务图标uri
   * @return taskAvatarId
  **/
  @javax.annotation.Nullable
  public String getTaskAvatarId() {
    return taskAvatarId;
  }


  public void setTaskAvatarId(String taskAvatarId) {
    this.taskAvatarId = taskAvatarId;
  }


  public StardeliveryTaskDetailV30ResponseData taskContactInfo(StardeliveryTaskDetailV30ResponseDataTaskContactInfo taskContactInfo) {
    
    this.taskContactInfo = taskContactInfo;
    return this;
  }

   /**
   * Get taskContactInfo
   * @return taskContactInfo
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskDetailV30ResponseDataTaskContactInfo getTaskContactInfo() {
    return taskContactInfo;
  }


  public void setTaskContactInfo(StardeliveryTaskDetailV30ResponseDataTaskContactInfo taskContactInfo) {
    this.taskContactInfo = taskContactInfo;
  }


  public StardeliveryTaskDetailV30ResponseData taskHeadImageId(String taskHeadImageId) {
    
    this.taskHeadImageId = taskHeadImageId;
    return this;
  }

   /**
   * 任务头图uri
   * @return taskHeadImageId
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImageId() {
    return taskHeadImageId;
  }


  public void setTaskHeadImageId(String taskHeadImageId) {
    this.taskHeadImageId = taskHeadImageId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskDetailV30ResponseData stardeliveryTaskDetailV30ResponseData = (StardeliveryTaskDetailV30ResponseData) o;
    return Objects.equals(this.androidAppPackageName, stardeliveryTaskDetailV30ResponseData.androidAppPackageName) &&
        Objects.equals(this.androidDownloadUrl, stardeliveryTaskDetailV30ResponseData.androidDownloadUrl) &&
        Objects.equals(this.authorTaskName, stardeliveryTaskDetailV30ResponseData.authorTaskName) &&
        Objects.equals(this.firstIndustryId, stardeliveryTaskDetailV30ResponseData.firstIndustryId) &&
        Objects.equals(this.iosAppPackageName, stardeliveryTaskDetailV30ResponseData.iosAppPackageName) &&
        Objects.equals(this.iosDownloadUrl, stardeliveryTaskDetailV30ResponseData.iosDownloadUrl) &&
        Objects.equals(this.productIntroduction, stardeliveryTaskDetailV30ResponseData.productIntroduction) &&
        Objects.equals(this.productName, stardeliveryTaskDetailV30ResponseData.productName) &&
        Objects.equals(this.secondIndustryId, stardeliveryTaskDetailV30ResponseData.secondIndustryId) &&
        Objects.equals(this.starAdCostDivideRatio, stardeliveryTaskDetailV30ResponseData.starAdCostDivideRatio) &&
        Objects.equals(this.starMaterialBid, stardeliveryTaskDetailV30ResponseData.starMaterialBid) &&
        Objects.equals(this.starMaterialFirstType, stardeliveryTaskDetailV30ResponseData.starMaterialFirstType) &&
        Objects.equals(this.starMaterialSecondType, stardeliveryTaskDetailV30ResponseData.starMaterialSecondType) &&
        Objects.equals(this.starTaskAnchorId, stardeliveryTaskDetailV30ResponseData.starTaskAnchorId) &&
        Objects.equals(this.starTaskAnchorType, stardeliveryTaskDetailV30ResponseData.starTaskAnchorType) &&
        Objects.equals(this.starTaskAssetInfo, stardeliveryTaskDetailV30ResponseData.starTaskAssetInfo) &&
        Objects.equals(this.starTaskBanReasonDetail, stardeliveryTaskDetailV30ResponseData.starTaskBanReasonDetail) &&
        Objects.equals(this.starTaskBid, stardeliveryTaskDetailV30ResponseData.starTaskBid) &&
        Objects.equals(this.starTaskBudget, stardeliveryTaskDetailV30ResponseData.starTaskBudget) &&
        Objects.equals(this.starTaskCreateTime, stardeliveryTaskDetailV30ResponseData.starTaskCreateTime) &&
        Objects.equals(this.starTaskExternalAction, stardeliveryTaskDetailV30ResponseData.starTaskExternalAction) &&
        Objects.equals(this.starTaskId, stardeliveryTaskDetailV30ResponseData.starTaskId) &&
        Objects.equals(this.starTaskMaterialsRequirements, stardeliveryTaskDetailV30ResponseData.starTaskMaterialsRequirements) &&
        Objects.equals(this.starTaskName, stardeliveryTaskDetailV30ResponseData.starTaskName) &&
        Objects.equals(this.starTaskPostEndTime, stardeliveryTaskDetailV30ResponseData.starTaskPostEndTime) &&
        Objects.equals(this.starTaskSource, stardeliveryTaskDetailV30ResponseData.starTaskSource) &&
        Objects.equals(this.starTaskStartTime, stardeliveryTaskDetailV30ResponseData.starTaskStartTime) &&
        Objects.equals(this.starTaskStatus, stardeliveryTaskDetailV30ResponseData.starTaskStatus) &&
        Objects.equals(this.starTaskSubStatus, stardeliveryTaskDetailV30ResponseData.starTaskSubStatus) &&
        Objects.equals(this.taskAvatarId, stardeliveryTaskDetailV30ResponseData.taskAvatarId) &&
        Objects.equals(this.taskContactInfo, stardeliveryTaskDetailV30ResponseData.taskContactInfo) &&
        Objects.equals(this.taskHeadImageId, stardeliveryTaskDetailV30ResponseData.taskHeadImageId);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(androidAppPackageName, androidDownloadUrl, authorTaskName, firstIndustryId, iosAppPackageName, iosDownloadUrl, productIntroduction, productName, secondIndustryId, starAdCostDivideRatio, starMaterialBid, starMaterialFirstType, starMaterialSecondType, starTaskAnchorId, starTaskAnchorType, starTaskAssetInfo, starTaskBanReasonDetail, starTaskBid, starTaskBudget, starTaskCreateTime, starTaskExternalAction, starTaskId, starTaskMaterialsRequirements, starTaskName, starTaskPostEndTime, starTaskSource, starTaskStartTime, starTaskStatus, starTaskSubStatus, taskAvatarId, taskContactInfo, taskHeadImageId);
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
    sb.append("class StardeliveryTaskDetailV30ResponseData {\n");
    sb.append("    androidAppPackageName: ").append(toIndentedString(androidAppPackageName)).append("\n");
    sb.append("    androidDownloadUrl: ").append(toIndentedString(androidDownloadUrl)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    iosAppPackageName: ").append(toIndentedString(iosAppPackageName)).append("\n");
    sb.append("    iosDownloadUrl: ").append(toIndentedString(iosDownloadUrl)).append("\n");
    sb.append("    productIntroduction: ").append(toIndentedString(productIntroduction)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    starAdCostDivideRatio: ").append(toIndentedString(starAdCostDivideRatio)).append("\n");
    sb.append("    starMaterialBid: ").append(toIndentedString(starMaterialBid)).append("\n");
    sb.append("    starMaterialFirstType: ").append(toIndentedString(starMaterialFirstType)).append("\n");
    sb.append("    starMaterialSecondType: ").append(toIndentedString(starMaterialSecondType)).append("\n");
    sb.append("    starTaskAnchorId: ").append(toIndentedString(starTaskAnchorId)).append("\n");
    sb.append("    starTaskAnchorType: ").append(toIndentedString(starTaskAnchorType)).append("\n");
    sb.append("    starTaskAssetInfo: ").append(toIndentedString(starTaskAssetInfo)).append("\n");
    sb.append("    starTaskBanReasonDetail: ").append(toIndentedString(starTaskBanReasonDetail)).append("\n");
    sb.append("    starTaskBid: ").append(toIndentedString(starTaskBid)).append("\n");
    sb.append("    starTaskBudget: ").append(toIndentedString(starTaskBudget)).append("\n");
    sb.append("    starTaskCreateTime: ").append(toIndentedString(starTaskCreateTime)).append("\n");
    sb.append("    starTaskExternalAction: ").append(toIndentedString(starTaskExternalAction)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
    sb.append("    starTaskMaterialsRequirements: ").append(toIndentedString(starTaskMaterialsRequirements)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    starTaskPostEndTime: ").append(toIndentedString(starTaskPostEndTime)).append("\n");
    sb.append("    starTaskSource: ").append(toIndentedString(starTaskSource)).append("\n");
    sb.append("    starTaskStartTime: ").append(toIndentedString(starTaskStartTime)).append("\n");
    sb.append("    starTaskStatus: ").append(toIndentedString(starTaskStatus)).append("\n");
    sb.append("    starTaskSubStatus: ").append(toIndentedString(starTaskSubStatus)).append("\n");
    sb.append("    taskAvatarId: ").append(toIndentedString(taskAvatarId)).append("\n");
    sb.append("    taskContactInfo: ").append(toIndentedString(taskContactInfo)).append("\n");
    sb.append("    taskHeadImageId: ").append(toIndentedString(taskHeadImageId)).append("\n");
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
    openapiFields.add("android_app_package_name");
    openapiFields.add("android_download_url");
    openapiFields.add("author_task_name");
    openapiFields.add("first_industry_id");
    openapiFields.add("ios_app_package_name");
    openapiFields.add("ios_download_url");
    openapiFields.add("product_introduction");
    openapiFields.add("product_name");
    openapiFields.add("second_industry_id");
    openapiFields.add("star_ad_cost_divide_ratio");
    openapiFields.add("star_material_bid");
    openapiFields.add("star_material_first_type");
    openapiFields.add("star_material_second_type");
    openapiFields.add("star_task_anchor_id");
    openapiFields.add("star_task_anchor_type");
    openapiFields.add("star_task_asset_info");
    openapiFields.add("star_task_ban_reason_detail");
    openapiFields.add("star_task_bid");
    openapiFields.add("star_task_budget");
    openapiFields.add("star_task_create_time");
    openapiFields.add("star_task_external_action");
    openapiFields.add("star_task_id");
    openapiFields.add("star_task_materials_requirements");
    openapiFields.add("star_task_name");
    openapiFields.add("star_task_post_end_time");
    openapiFields.add("star_task_source");
    openapiFields.add("star_task_start_time");
    openapiFields.add("star_task_status");
    openapiFields.add("star_task_sub_status");
    openapiFields.add("task_avatar_id");
    openapiFields.add("task_contact_info");
    openapiFields.add("task_head_image_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskDetailV30ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskDetailV30ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskDetailV30ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskDetailV30ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskDetailV30ResponseData>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskDetailV30ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskDetailV30ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskDetailV30ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskDetailV30ResponseData
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskDetailV30ResponseData
  */
  public static StardeliveryTaskDetailV30ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskDetailV30ResponseData.class);
  }

 /**
  * Convert an instance of StardeliveryTaskDetailV30ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

