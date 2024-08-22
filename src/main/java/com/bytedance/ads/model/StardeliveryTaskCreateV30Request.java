/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.16
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskCreateV30RequestStarTaskAssetInfo;
import com.bytedance.ads.model.StardeliveryTaskCreateV30RequestStarTaskMaterialsRequirements;
import com.bytedance.ads.model.StardeliveryTaskCreateV30RequestTaskContactInfo;
import com.bytedance.ads.model.StardeliveryTaskCreateV30StarTaskAnchorType;
import com.bytedance.ads.model.StardeliveryTaskCreateV30StarTaskExternalAction;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

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
 * StardeliveryTaskCreateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-22T17:23:28.366128396+08:00[PRC]")
public class StardeliveryTaskCreateV30Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_AUTHOR_SUBMIT_FREQUENCY = "author_submit_frequency";
  @SerializedName(SERIALIZED_NAME_AUTHOR_SUBMIT_FREQUENCY)
  private Integer authorSubmitFrequency = null;

  public static final String SERIALIZED_NAME_AUTHOR_TASK_NAME = "author_task_name";
  @SerializedName(SERIALIZED_NAME_AUTHOR_TASK_NAME)
  private String authorTaskName = null;

  public static final String SERIALIZED_NAME_FIRST_INDUSTRY_ID = "first_industry_id";
  @SerializedName(SERIALIZED_NAME_FIRST_INDUSTRY_ID)
  private Integer firstIndustryId = null;

  public static final String SERIALIZED_NAME_SECOND_INDUSTRY_ID = "second_industry_id";
  @SerializedName(SERIALIZED_NAME_SECOND_INDUSTRY_ID)
  private Integer secondIndustryId = null;

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
  private StardeliveryTaskCreateV30StarTaskAnchorType starTaskAnchorType = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ASSET_INFO = "star_task_asset_info";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ASSET_INFO)
  private StardeliveryTaskCreateV30RequestStarTaskAssetInfo starTaskAssetInfo = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BID = "star_task_bid";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BID)
  private Double starTaskBid = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BUDGET = "star_task_budget";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BUDGET)
  private Double starTaskBudget = null;

  public static final String SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION = "star_task_external_action";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION)
  private StardeliveryTaskCreateV30StarTaskExternalAction starTaskExternalAction = null;

  public static final String SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS = "star_task_materials_requirements";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_MATERIALS_REQUIREMENTS)
  private StardeliveryTaskCreateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_POST_END_TIME = "star_task_post_end_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_POST_END_TIME)
  private String starTaskPostEndTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_START_TIME = "star_task_start_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_START_TIME)
  private String starTaskStartTime = null;

  public static final String SERIALIZED_NAME_TASK_AVATAR_ID = "task_avatar_id";
  @SerializedName(SERIALIZED_NAME_TASK_AVATAR_ID)
  private String taskAvatarId = null;

  public static final String SERIALIZED_NAME_TASK_CONTACT_INFO = "task_contact_info";
  @SerializedName(SERIALIZED_NAME_TASK_CONTACT_INFO)
  private StardeliveryTaskCreateV30RequestTaskContactInfo taskContactInfo = null;

  public static final String SERIALIZED_NAME_TASK_HEAD_IMAGE_ID = "task_head_image_id";
  @SerializedName(SERIALIZED_NAME_TASK_HEAD_IMAGE_ID)
  private String taskHeadImageId = null;

  public static final String SERIALIZED_NAME_TASK_PRODUCT_INTRODUCTION = "task_product_introduction";
  @SerializedName(SERIALIZED_NAME_TASK_PRODUCT_INTRODUCTION)
  private String taskProductIntroduction = null;

  public static final String SERIALIZED_NAME_TASK_PRODUCT_NAME = "task_product_name";
  @SerializedName(SERIALIZED_NAME_TASK_PRODUCT_NAME)
  private String taskProductName = null;

  public StardeliveryTaskCreateV30Request() {
  }

  public StardeliveryTaskCreateV30Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主账户ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public StardeliveryTaskCreateV30Request authorSubmitFrequency(Integer authorSubmitFrequency) {
    
    this.authorSubmitFrequency = authorSubmitFrequency;
    return this;
  }

   /**
   * 
   * @return authorSubmitFrequency
  **/
  @javax.annotation.Nullable
  public Integer getAuthorSubmitFrequency() {
    return authorSubmitFrequency;
  }


  public void setAuthorSubmitFrequency(Integer authorSubmitFrequency) {
    this.authorSubmitFrequency = authorSubmitFrequency;
  }


  public StardeliveryTaskCreateV30Request authorTaskName(String authorTaskName) {
    
    this.authorTaskName = authorTaskName;
    return this;
  }

   /**
   * 达人侧任务名称，1-50个字符，达人浏览任务时会看到此名称,建议言简意赅、清晰易懂
   * @return authorTaskName
  **/
  @javax.annotation.Nonnull
  public String getAuthorTaskName() {
    return authorTaskName;
  }


  public void setAuthorTaskName(String authorTaskName) {
    this.authorTaskName = authorTaskName;
  }


  public StardeliveryTaskCreateV30Request firstIndustryId(Integer firstIndustryId) {
    
    this.firstIndustryId = firstIndustryId;
    return this;
  }

   /**
   * 请传入一级行业分类ID，请先调用「获取行业列表」接口获取行业ID 当前支持： - 游戏（一级行业id &#x3D; 1913） - 零售（一级行业id &#x3D; 1914） - 文体娱乐（一级行业id &#x3D; 1921） - 传媒资讯（一级行业id &#x3D; 1922） - 工具类软件（一级行业id &#x3D; 1928） - 社交通讯（一级行业id&#x3D; 1935）
   * @return firstIndustryId
  **/
  @javax.annotation.Nonnull
  public Integer getFirstIndustryId() {
    return firstIndustryId;
  }


  public void setFirstIndustryId(Integer firstIndustryId) {
    this.firstIndustryId = firstIndustryId;
  }


  public StardeliveryTaskCreateV30Request secondIndustryId(Integer secondIndustryId) {
    
    this.secondIndustryId = secondIndustryId;
    return this;
  }

   /**
   * 请传入二级行业分类ID，请先调用「获取行业列表」接口获取行业ID 必须传入以下一级行业类目中的二级行业类目ID - 游戏（一级行业id &#x3D; 1913） - 零售（一级行业id &#x3D; 1914） - 文体娱乐（一级行业id &#x3D; 1921） - 传媒资讯（一级行业id &#x3D; 1922） - 工具类软件（一级行业id &#x3D; 1928） - 社交通讯（一级行业id&#x3D; 1935）
   * @return secondIndustryId
  **/
  @javax.annotation.Nonnull
  public Integer getSecondIndustryId() {
    return secondIndustryId;
  }


  public void setSecondIndustryId(Integer secondIndustryId) {
    this.secondIndustryId = secondIndustryId;
  }


  public StardeliveryTaskCreateV30Request starMaterialBid(Double starMaterialBid) {
    
    this.starMaterialBid = starMaterialBid;
    return this;
  }

   /**
   * 素材出价，只允许整数，每条视频最低需要付给达人的底价价格，该出价影响达人接单的积极性 不同素材类型组合下的出价要求不同，最小可出价金额请调用「获取星广任务金额配置条件」接口查询，最高10000元
   * @return starMaterialBid
  **/
  @javax.annotation.Nonnull
  public Double getStarMaterialBid() {
    return starMaterialBid;
  }


  public void setStarMaterialBid(Double starMaterialBid) {
    this.starMaterialBid = starMaterialBid;
  }


  public StardeliveryTaskCreateV30Request starMaterialFirstType(Integer starMaterialFirstType) {
    
    this.starMaterialFirstType = starMaterialFirstType;
    return this;
  }

   /**
   * 素材一级类目，字段类型是number【特别注意】 任务创建后不允许修改，请前往「获取星广任务可选素材类型」接口获取star_material_first_type（本质是一个id，而不是name）
   * @return starMaterialFirstType
  **/
  @javax.annotation.Nonnull
  public Integer getStarMaterialFirstType() {
    return starMaterialFirstType;
  }


  public void setStarMaterialFirstType(Integer starMaterialFirstType) {
    this.starMaterialFirstType = starMaterialFirstType;
  }


  public StardeliveryTaskCreateV30Request starMaterialSecondType(Integer starMaterialSecondType) {
    
    this.starMaterialSecondType = starMaterialSecondType;
    return this;
  }

   /**
   * 素材二级类目，任务创建后不允许修改，需调用「获取星广任务可选素材类型」接口查询一级分类下可选的二级分类名称
   * @return starMaterialSecondType
  **/
  @javax.annotation.Nonnull
  public Integer getStarMaterialSecondType() {
    return starMaterialSecondType;
  }


  public void setStarMaterialSecondType(Integer starMaterialSecondType) {
    this.starMaterialSecondType = starMaterialSecondType;
  }


  public StardeliveryTaskCreateV30Request starTaskAnchorId(Long starTaskAnchorId) {
    
    this.starTaskAnchorId = starTaskAnchorId;
    return this;
  }

   /**
   * 原生锚点id，选择锚点后用于生成组件，并用于达人流量分发，锚点的后续更改不影响组件设置。 - 请先调用「获取原生锚点列表」接口查询审核已通过的锚点，仅支持游戏、网服、电商3类锚点 - 不符合要求接口会报错，传入要求：   1. 仅支持游戏、电商、网服3类锚点   2. 仅支持传入通过审核的锚点素材（status &#x3D; AUDIT_SUCCESS审核通过）
   * @return starTaskAnchorId
  **/
  @javax.annotation.Nonnull
  public Long getStarTaskAnchorId() {
    return starTaskAnchorId;
  }


  public void setStarTaskAnchorId(Long starTaskAnchorId) {
    this.starTaskAnchorId = starTaskAnchorId;
  }


  public StardeliveryTaskCreateV30Request starTaskAnchorType(StardeliveryTaskCreateV30StarTaskAnchorType starTaskAnchorType) {
    
    this.starTaskAnchorType = starTaskAnchorType;
    return this;
  }

   /**
   * Get starTaskAnchorType
   * @return starTaskAnchorType
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskCreateV30StarTaskAnchorType getStarTaskAnchorType() {
    return starTaskAnchorType;
  }


  public void setStarTaskAnchorType(StardeliveryTaskCreateV30StarTaskAnchorType starTaskAnchorType) {
    this.starTaskAnchorType = starTaskAnchorType;
  }


  public StardeliveryTaskCreateV30Request starTaskAssetInfo(StardeliveryTaskCreateV30RequestStarTaskAssetInfo starTaskAssetInfo) {
    
    this.starTaskAssetInfo = starTaskAssetInfo;
    return this;
  }

   /**
   * Get starTaskAssetInfo
   * @return starTaskAssetInfo
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskCreateV30RequestStarTaskAssetInfo getStarTaskAssetInfo() {
    return starTaskAssetInfo;
  }


  public void setStarTaskAssetInfo(StardeliveryTaskCreateV30RequestStarTaskAssetInfo starTaskAssetInfo) {
    this.starTaskAssetInfo = starTaskAssetInfo;
  }


  public StardeliveryTaskCreateV30Request starTaskBid(Double starTaskBid) {
    
    this.starTaskBid = starTaskBid;
    return this;
  }

   /**
   * 任务出价（元），最多允许2位小数，用于CPA达人流量计费，设置后不支持修改
   * @return starTaskBid
  **/
  @javax.annotation.Nonnull
  public Double getStarTaskBid() {
    return starTaskBid;
  }


  public void setStarTaskBid(Double starTaskBid) {
    this.starTaskBid = starTaskBid;
  }


  public StardeliveryTaskCreateV30Request starTaskBudget(Double starTaskBudget) {
    
    this.starTaskBudget = starTaskBudget;
    return this;
  }

   /**
   * 任务预算（元），必须是整数。您只能使用广告账户内非赠款下单。最低现金10000，最高1000000元。任务提交后预算可增加、不可减少，任务预算金额影响达人派单总量。
   * @return starTaskBudget
  **/
  @javax.annotation.Nonnull
  public Double getStarTaskBudget() {
    return starTaskBudget;
  }


  public void setStarTaskBudget(Double starTaskBudget) {
    this.starTaskBudget = starTaskBudget;
  }


  public StardeliveryTaskCreateV30Request starTaskExternalAction(StardeliveryTaskCreateV30StarTaskExternalAction starTaskExternalAction) {
    
    this.starTaskExternalAction = starTaskExternalAction;
    return this;
  }

   /**
   * Get starTaskExternalAction
   * @return starTaskExternalAction
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskCreateV30StarTaskExternalAction getStarTaskExternalAction() {
    return starTaskExternalAction;
  }


  public void setStarTaskExternalAction(StardeliveryTaskCreateV30StarTaskExternalAction starTaskExternalAction) {
    this.starTaskExternalAction = starTaskExternalAction;
  }


  public StardeliveryTaskCreateV30Request starTaskMaterialsRequirements(StardeliveryTaskCreateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
    return this;
  }

   /**
   * Get starTaskMaterialsRequirements
   * @return starTaskMaterialsRequirements
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskCreateV30RequestStarTaskMaterialsRequirements getStarTaskMaterialsRequirements() {
    return starTaskMaterialsRequirements;
  }


  public void setStarTaskMaterialsRequirements(StardeliveryTaskCreateV30RequestStarTaskMaterialsRequirements starTaskMaterialsRequirements) {
    this.starTaskMaterialsRequirements = starTaskMaterialsRequirements;
  }


  public StardeliveryTaskCreateV30Request starTaskName(String starTaskName) {
    
    this.starTaskName = starTaskName;
    return this;
  }

   /**
   * 任务名称，1-50个字符，本名称仅用于方便自主快速查找和定位任务
   * @return starTaskName
  **/
  @javax.annotation.Nonnull
  public String getStarTaskName() {
    return starTaskName;
  }


  public void setStarTaskName(String starTaskName) {
    this.starTaskName = starTaskName;
  }


  public StardeliveryTaskCreateV30Request starTaskPostEndTime(String starTaskPostEndTime) {
    
    this.starTaskPostEndTime = starTaskPostEndTime;
    return this;
  }

   /**
   * 任务结束时间为投稿截止时间。  - 格式：2024-01-01 精确到天，任务结束时间可调用更新任务接口延长 - 传参要求：   - 任务开始日期与任务结束日期间隔时长≥7天且≤365天，否则报错   - 若任务投稿截止时间+14天不在客户合同有效期内，则不可提交任务
   * @return starTaskPostEndTime
  **/
  @javax.annotation.Nonnull
  public String getStarTaskPostEndTime() {
    return starTaskPostEndTime;
  }


  public void setStarTaskPostEndTime(String starTaskPostEndTime) {
    this.starTaskPostEndTime = starTaskPostEndTime;
  }


  public StardeliveryTaskCreateV30Request starTaskStartTime(String starTaskStartTime) {
    
    this.starTaskStartTime = starTaskStartTime;
    return this;
  }

   /**
   * 任务开始时间，必须填写今天及以后的日期，格式：2024-01-01 精确到天，任务起始时间不允许修改
   * @return starTaskStartTime
  **/
  @javax.annotation.Nonnull
  public String getStarTaskStartTime() {
    return starTaskStartTime;
  }


  public void setStarTaskStartTime(String starTaskStartTime) {
    this.starTaskStartTime = starTaskStartTime;
  }


  public StardeliveryTaskCreateV30Request taskAvatarId(String taskAvatarId) {
    
    this.taskAvatarId = taskAvatarId;
    return this;
  }

   /**
   * 任务图标uri，将作为任务头像,展示在达人任务卡片上 上传要求：长宽比为1:1、格式为JPG或JPEG且文件大小小于1M的图片,要求像素为108*108 可先通过「上传广告图片」接口获取图片的uri（即该接口中的id）
   * @return taskAvatarId
  **/
  @javax.annotation.Nonnull
  public String getTaskAvatarId() {
    return taskAvatarId;
  }


  public void setTaskAvatarId(String taskAvatarId) {
    this.taskAvatarId = taskAvatarId;
  }


  public StardeliveryTaskCreateV30Request taskContactInfo(StardeliveryTaskCreateV30RequestTaskContactInfo taskContactInfo) {
    
    this.taskContactInfo = taskContactInfo;
    return this;
  }

   /**
   * Get taskContactInfo
   * @return taskContactInfo
  **/
  @javax.annotation.Nonnull
  public StardeliveryTaskCreateV30RequestTaskContactInfo getTaskContactInfo() {
    return taskContactInfo;
  }


  public void setTaskContactInfo(StardeliveryTaskCreateV30RequestTaskContactInfo taskContactInfo) {
    this.taskContactInfo = taskContactInfo;
  }


  public StardeliveryTaskCreateV30Request taskHeadImageId(String taskHeadImageId) {
    
    this.taskHeadImageId = taskHeadImageId;
    return this;
  }

   /**
   * 任务头图uri，将作为任务头像,展示在达人任务卡片上 长宽比为2:1、格式为JPG或JPEG且文件大小小于5M的图片,建议像素为1125*563 可先通过「上传广告图片」接口获取图片的uri（即该接口中的id）
   * @return taskHeadImageId
  **/
  @javax.annotation.Nullable
  public String getTaskHeadImageId() {
    return taskHeadImageId;
  }


  public void setTaskHeadImageId(String taskHeadImageId) {
    this.taskHeadImageId = taskHeadImageId;
  }


  public StardeliveryTaskCreateV30Request taskProductIntroduction(String taskProductIntroduction) {
    
    this.taskProductIntroduction = taskProductIntroduction;
    return this;
  }

   /**
   * 产品介绍，1-1000个字符，推广对象的介绍,比如游戏行业,可以简述游戏亮点,游戏属于什么类型,玩法、场景、角色介绍
   * @return taskProductIntroduction
  **/
  @javax.annotation.Nonnull
  public String getTaskProductIntroduction() {
    return taskProductIntroduction;
  }


  public void setTaskProductIntroduction(String taskProductIntroduction) {
    this.taskProductIntroduction = taskProductIntroduction;
  }


  public StardeliveryTaskCreateV30Request taskProductName(String taskProductName) {
    
    this.taskProductName = taskProductName;
    return this;
  }

   /**
   * 产品名称，1-40个字符，任务推广的产品名称,将展示在达人任务卡片上
   * @return taskProductName
  **/
  @javax.annotation.Nonnull
  public String getTaskProductName() {
    return taskProductName;
  }


  public void setTaskProductName(String taskProductName) {
    this.taskProductName = taskProductName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskCreateV30Request stardeliveryTaskCreateV30Request = (StardeliveryTaskCreateV30Request) o;
    return Objects.equals(this.advertiserId, stardeliveryTaskCreateV30Request.advertiserId) &&
        Objects.equals(this.authorSubmitFrequency, stardeliveryTaskCreateV30Request.authorSubmitFrequency) &&
        Objects.equals(this.authorTaskName, stardeliveryTaskCreateV30Request.authorTaskName) &&
        Objects.equals(this.firstIndustryId, stardeliveryTaskCreateV30Request.firstIndustryId) &&
        Objects.equals(this.secondIndustryId, stardeliveryTaskCreateV30Request.secondIndustryId) &&
        Objects.equals(this.starMaterialBid, stardeliveryTaskCreateV30Request.starMaterialBid) &&
        Objects.equals(this.starMaterialFirstType, stardeliveryTaskCreateV30Request.starMaterialFirstType) &&
        Objects.equals(this.starMaterialSecondType, stardeliveryTaskCreateV30Request.starMaterialSecondType) &&
        Objects.equals(this.starTaskAnchorId, stardeliveryTaskCreateV30Request.starTaskAnchorId) &&
        Objects.equals(this.starTaskAnchorType, stardeliveryTaskCreateV30Request.starTaskAnchorType) &&
        Objects.equals(this.starTaskAssetInfo, stardeliveryTaskCreateV30Request.starTaskAssetInfo) &&
        Objects.equals(this.starTaskBid, stardeliveryTaskCreateV30Request.starTaskBid) &&
        Objects.equals(this.starTaskBudget, stardeliveryTaskCreateV30Request.starTaskBudget) &&
        Objects.equals(this.starTaskExternalAction, stardeliveryTaskCreateV30Request.starTaskExternalAction) &&
        Objects.equals(this.starTaskMaterialsRequirements, stardeliveryTaskCreateV30Request.starTaskMaterialsRequirements) &&
        Objects.equals(this.starTaskName, stardeliveryTaskCreateV30Request.starTaskName) &&
        Objects.equals(this.starTaskPostEndTime, stardeliveryTaskCreateV30Request.starTaskPostEndTime) &&
        Objects.equals(this.starTaskStartTime, stardeliveryTaskCreateV30Request.starTaskStartTime) &&
        Objects.equals(this.taskAvatarId, stardeliveryTaskCreateV30Request.taskAvatarId) &&
        Objects.equals(this.taskContactInfo, stardeliveryTaskCreateV30Request.taskContactInfo) &&
        Objects.equals(this.taskHeadImageId, stardeliveryTaskCreateV30Request.taskHeadImageId) &&
        Objects.equals(this.taskProductIntroduction, stardeliveryTaskCreateV30Request.taskProductIntroduction) &&
        Objects.equals(this.taskProductName, stardeliveryTaskCreateV30Request.taskProductName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, authorSubmitFrequency, authorTaskName, firstIndustryId, secondIndustryId, starMaterialBid, starMaterialFirstType, starMaterialSecondType, starTaskAnchorId, starTaskAnchorType, starTaskAssetInfo, starTaskBid, starTaskBudget, starTaskExternalAction, starTaskMaterialsRequirements, starTaskName, starTaskPostEndTime, starTaskStartTime, taskAvatarId, taskContactInfo, taskHeadImageId, taskProductIntroduction, taskProductName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StardeliveryTaskCreateV30Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    authorSubmitFrequency: ").append(toIndentedString(authorSubmitFrequency)).append("\n");
    sb.append("    authorTaskName: ").append(toIndentedString(authorTaskName)).append("\n");
    sb.append("    firstIndustryId: ").append(toIndentedString(firstIndustryId)).append("\n");
    sb.append("    secondIndustryId: ").append(toIndentedString(secondIndustryId)).append("\n");
    sb.append("    starMaterialBid: ").append(toIndentedString(starMaterialBid)).append("\n");
    sb.append("    starMaterialFirstType: ").append(toIndentedString(starMaterialFirstType)).append("\n");
    sb.append("    starMaterialSecondType: ").append(toIndentedString(starMaterialSecondType)).append("\n");
    sb.append("    starTaskAnchorId: ").append(toIndentedString(starTaskAnchorId)).append("\n");
    sb.append("    starTaskAnchorType: ").append(toIndentedString(starTaskAnchorType)).append("\n");
    sb.append("    starTaskAssetInfo: ").append(toIndentedString(starTaskAssetInfo)).append("\n");
    sb.append("    starTaskBid: ").append(toIndentedString(starTaskBid)).append("\n");
    sb.append("    starTaskBudget: ").append(toIndentedString(starTaskBudget)).append("\n");
    sb.append("    starTaskExternalAction: ").append(toIndentedString(starTaskExternalAction)).append("\n");
    sb.append("    starTaskMaterialsRequirements: ").append(toIndentedString(starTaskMaterialsRequirements)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    starTaskPostEndTime: ").append(toIndentedString(starTaskPostEndTime)).append("\n");
    sb.append("    starTaskStartTime: ").append(toIndentedString(starTaskStartTime)).append("\n");
    sb.append("    taskAvatarId: ").append(toIndentedString(taskAvatarId)).append("\n");
    sb.append("    taskContactInfo: ").append(toIndentedString(taskContactInfo)).append("\n");
    sb.append("    taskHeadImageId: ").append(toIndentedString(taskHeadImageId)).append("\n");
    sb.append("    taskProductIntroduction: ").append(toIndentedString(taskProductIntroduction)).append("\n");
    sb.append("    taskProductName: ").append(toIndentedString(taskProductName)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("author_submit_frequency");
    openapiFields.add("author_task_name");
    openapiFields.add("first_industry_id");
    openapiFields.add("second_industry_id");
    openapiFields.add("star_material_bid");
    openapiFields.add("star_material_first_type");
    openapiFields.add("star_material_second_type");
    openapiFields.add("star_task_anchor_id");
    openapiFields.add("star_task_anchor_type");
    openapiFields.add("star_task_asset_info");
    openapiFields.add("star_task_bid");
    openapiFields.add("star_task_budget");
    openapiFields.add("star_task_external_action");
    openapiFields.add("star_task_materials_requirements");
    openapiFields.add("star_task_name");
    openapiFields.add("star_task_post_end_time");
    openapiFields.add("star_task_start_time");
    openapiFields.add("task_avatar_id");
    openapiFields.add("task_contact_info");
    openapiFields.add("task_head_image_id");
    openapiFields.add("task_product_introduction");
    openapiFields.add("task_product_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("author_task_name");
    openapiRequiredFields.add("first_industry_id");
    openapiRequiredFields.add("second_industry_id");
    openapiRequiredFields.add("star_material_bid");
    openapiRequiredFields.add("star_material_first_type");
    openapiRequiredFields.add("star_material_second_type");
    openapiRequiredFields.add("star_task_anchor_id");
    openapiRequiredFields.add("star_task_anchor_type");
    openapiRequiredFields.add("star_task_asset_info");
    openapiRequiredFields.add("star_task_bid");
    openapiRequiredFields.add("star_task_budget");
    openapiRequiredFields.add("star_task_external_action");
    openapiRequiredFields.add("star_task_materials_requirements");
    openapiRequiredFields.add("star_task_name");
    openapiRequiredFields.add("star_task_post_end_time");
    openapiRequiredFields.add("star_task_start_time");
    openapiRequiredFields.add("task_avatar_id");
    openapiRequiredFields.add("task_contact_info");
    openapiRequiredFields.add("task_product_introduction");
    openapiRequiredFields.add("task_product_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskCreateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskCreateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskCreateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskCreateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskCreateV30Request>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskCreateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskCreateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskCreateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskCreateV30Request
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskCreateV30Request
  */
  public static StardeliveryTaskCreateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskCreateV30Request.class);
  }

 /**
  * Convert an instance of StardeliveryTaskCreateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

