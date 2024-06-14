/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StardeliveryTaskListV30DataListStarTaskAnchorType;
import com.bytedance.ads.model.StardeliveryTaskListV30DataListStarTaskExternalAction;
import com.bytedance.ads.model.StardeliveryTaskListV30DataListStarTaskSource;
import com.bytedance.ads.model.StardeliveryTaskListV30DataListStarTaskStatus;
import com.bytedance.ads.model.StardeliveryTaskListV30DataListStarTaskSubStatus;
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
 * StardeliveryTaskListV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-14T16:48:32.970984024+08:00[PRC]")
public class StardeliveryTaskListV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO = "star_ad_cost_divide_ratio";
  @SerializedName(SERIALIZED_NAME_STAR_AD_COST_DIVIDE_RATIO)
  private Double starAdCostDivideRatio = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_BID = "star_material_bid";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_BID)
  private Double starMaterialBid = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_FIRST_NAME = "star_material_first_name";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_FIRST_NAME)
  private String starMaterialFirstName = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE = "star_material_first_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_FIRST_TYPE)
  private Long starMaterialFirstType = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_SECOND_NAME = "star_material_second_name";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_SECOND_NAME)
  private String starMaterialSecondName = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE = "star_material_second_type";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_SECOND_TYPE)
  private Long starMaterialSecondType = null;

  public static final String SERIALIZED_NAME_STAR_SALE_COST_END_TIME = "star_sale_cost_end_time";
  @SerializedName(SERIALIZED_NAME_STAR_SALE_COST_END_TIME)
  private String starSaleCostEndTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE = "star_task_anchor_type";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE)
  private StardeliveryTaskListV30DataListStarTaskAnchorType starTaskAnchorType = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BID = "star_task_bid";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BID)
  private Double starTaskBid = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BUDGET = "star_task_budget";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BUDGET)
  private Double starTaskBudget = null;

  public static final String SERIALIZED_NAME_STAR_TASK_CAN_DELIVERY_ITEM_COUNT = "star_task_can_delivery_item_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_CAN_DELIVERY_ITEM_COUNT)
  private Long starTaskCanDeliveryItemCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_CREATE_TIME = "star_task_create_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_CREATE_TIME)
  private String starTaskCreateTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION = "star_task_external_action";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION)
  private StardeliveryTaskListV30DataListStarTaskExternalAction starTaskExternalAction = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_MODIFY_TIME = "star_task_modify_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_MODIFY_TIME)
  private String starTaskModifyTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_POST_END_TIME = "star_task_post_end_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_POST_END_TIME)
  private String starTaskPostEndTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_POST_ITEM_COUNT = "star_task_post_item_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_POST_ITEM_COUNT)
  private Long starTaskPostItemCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_RELATE_PROJECT_COUNT = "star_task_relate_project_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_RELATE_PROJECT_COUNT)
  private Long starTaskRelateProjectCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SOURCE = "star_task_source";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SOURCE)
  private StardeliveryTaskListV30DataListStarTaskSource starTaskSource = null;

  public static final String SERIALIZED_NAME_STAR_TASK_START_TIME = "star_task_start_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_START_TIME)
  private String starTaskStartTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_STATUS = "star_task_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_STATUS)
  private StardeliveryTaskListV30DataListStarTaskStatus starTaskStatus = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SUB_STATUS = "star_task_sub_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SUB_STATUS)
  private StardeliveryTaskListV30DataListStarTaskSubStatus starTaskSubStatus = null;

  public static final String SERIALIZED_NAME_STAR_TIME_COST_END_TIME = "star_time_cost_end_time";
  @SerializedName(SERIALIZED_NAME_STAR_TIME_COST_END_TIME)
  private String starTimeCostEndTime = null;

  public StardeliveryTaskListV30ResponseDataListInner() {
  }

  public StardeliveryTaskListV30ResponseDataListInner starAdCostDivideRatio(Double starAdCostDivideRatio) {
    
    this.starAdCostDivideRatio = starAdCostDivideRatio;
    return this;
  }

   /**
   * 
   * @return starAdCostDivideRatio
  **/
  @javax.annotation.Nullable
  public Double getStarAdCostDivideRatio() {
    return starAdCostDivideRatio;
  }


  public void setStarAdCostDivideRatio(Double starAdCostDivideRatio) {
    this.starAdCostDivideRatio = starAdCostDivideRatio;
  }


  public StardeliveryTaskListV30ResponseDataListInner starMaterialBid(Double starMaterialBid) {
    
    this.starMaterialBid = starMaterialBid;
    return this;
  }

   /**
   * 
   * @return starMaterialBid
  **/
  @javax.annotation.Nullable
  public Double getStarMaterialBid() {
    return starMaterialBid;
  }


  public void setStarMaterialBid(Double starMaterialBid) {
    this.starMaterialBid = starMaterialBid;
  }


  public StardeliveryTaskListV30ResponseDataListInner starMaterialFirstName(String starMaterialFirstName) {
    
    this.starMaterialFirstName = starMaterialFirstName;
    return this;
  }

   /**
   * 
   * @return starMaterialFirstName
  **/
  @javax.annotation.Nullable
  public String getStarMaterialFirstName() {
    return starMaterialFirstName;
  }


  public void setStarMaterialFirstName(String starMaterialFirstName) {
    this.starMaterialFirstName = starMaterialFirstName;
  }


  public StardeliveryTaskListV30ResponseDataListInner starMaterialFirstType(Long starMaterialFirstType) {
    
    this.starMaterialFirstType = starMaterialFirstType;
    return this;
  }

   /**
   * 
   * @return starMaterialFirstType
  **/
  @javax.annotation.Nullable
  public Long getStarMaterialFirstType() {
    return starMaterialFirstType;
  }


  public void setStarMaterialFirstType(Long starMaterialFirstType) {
    this.starMaterialFirstType = starMaterialFirstType;
  }


  public StardeliveryTaskListV30ResponseDataListInner starMaterialSecondName(String starMaterialSecondName) {
    
    this.starMaterialSecondName = starMaterialSecondName;
    return this;
  }

   /**
   * 
   * @return starMaterialSecondName
  **/
  @javax.annotation.Nullable
  public String getStarMaterialSecondName() {
    return starMaterialSecondName;
  }


  public void setStarMaterialSecondName(String starMaterialSecondName) {
    this.starMaterialSecondName = starMaterialSecondName;
  }


  public StardeliveryTaskListV30ResponseDataListInner starMaterialSecondType(Long starMaterialSecondType) {
    
    this.starMaterialSecondType = starMaterialSecondType;
    return this;
  }

   /**
   * 
   * @return starMaterialSecondType
  **/
  @javax.annotation.Nullable
  public Long getStarMaterialSecondType() {
    return starMaterialSecondType;
  }


  public void setStarMaterialSecondType(Long starMaterialSecondType) {
    this.starMaterialSecondType = starMaterialSecondType;
  }


  public StardeliveryTaskListV30ResponseDataListInner starSaleCostEndTime(String starSaleCostEndTime) {
    
    this.starSaleCostEndTime = starSaleCostEndTime;
    return this;
  }

   /**
   * 
   * @return starSaleCostEndTime
  **/
  @javax.annotation.Nullable
  public String getStarSaleCostEndTime() {
    return starSaleCostEndTime;
  }


  public void setStarSaleCostEndTime(String starSaleCostEndTime) {
    this.starSaleCostEndTime = starSaleCostEndTime;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskAnchorType(StardeliveryTaskListV30DataListStarTaskAnchorType starTaskAnchorType) {
    
    this.starTaskAnchorType = starTaskAnchorType;
    return this;
  }

   /**
   * Get starTaskAnchorType
   * @return starTaskAnchorType
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30DataListStarTaskAnchorType getStarTaskAnchorType() {
    return starTaskAnchorType;
  }


  public void setStarTaskAnchorType(StardeliveryTaskListV30DataListStarTaskAnchorType starTaskAnchorType) {
    this.starTaskAnchorType = starTaskAnchorType;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskBid(Double starTaskBid) {
    
    this.starTaskBid = starTaskBid;
    return this;
  }

   /**
   * 
   * @return starTaskBid
  **/
  @javax.annotation.Nullable
  public Double getStarTaskBid() {
    return starTaskBid;
  }


  public void setStarTaskBid(Double starTaskBid) {
    this.starTaskBid = starTaskBid;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskBudget(Double starTaskBudget) {
    
    this.starTaskBudget = starTaskBudget;
    return this;
  }

   /**
   * 
   * @return starTaskBudget
  **/
  @javax.annotation.Nullable
  public Double getStarTaskBudget() {
    return starTaskBudget;
  }


  public void setStarTaskBudget(Double starTaskBudget) {
    this.starTaskBudget = starTaskBudget;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskCanDeliveryItemCount(Long starTaskCanDeliveryItemCount) {
    
    this.starTaskCanDeliveryItemCount = starTaskCanDeliveryItemCount;
    return this;
  }

   /**
   * 
   * @return starTaskCanDeliveryItemCount
  **/
  @javax.annotation.Nullable
  public Long getStarTaskCanDeliveryItemCount() {
    return starTaskCanDeliveryItemCount;
  }


  public void setStarTaskCanDeliveryItemCount(Long starTaskCanDeliveryItemCount) {
    this.starTaskCanDeliveryItemCount = starTaskCanDeliveryItemCount;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskCreateTime(String starTaskCreateTime) {
    
    this.starTaskCreateTime = starTaskCreateTime;
    return this;
  }

   /**
   * 
   * @return starTaskCreateTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskCreateTime() {
    return starTaskCreateTime;
  }


  public void setStarTaskCreateTime(String starTaskCreateTime) {
    this.starTaskCreateTime = starTaskCreateTime;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskExternalAction(StardeliveryTaskListV30DataListStarTaskExternalAction starTaskExternalAction) {
    
    this.starTaskExternalAction = starTaskExternalAction;
    return this;
  }

   /**
   * Get starTaskExternalAction
   * @return starTaskExternalAction
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30DataListStarTaskExternalAction getStarTaskExternalAction() {
    return starTaskExternalAction;
  }


  public void setStarTaskExternalAction(StardeliveryTaskListV30DataListStarTaskExternalAction starTaskExternalAction) {
    this.starTaskExternalAction = starTaskExternalAction;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskId(Long starTaskId) {
    
    this.starTaskId = starTaskId;
    return this;
  }

   /**
   * 
   * @return starTaskId
  **/
  @javax.annotation.Nullable
  public Long getStarTaskId() {
    return starTaskId;
  }


  public void setStarTaskId(Long starTaskId) {
    this.starTaskId = starTaskId;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskModifyTime(String starTaskModifyTime) {
    
    this.starTaskModifyTime = starTaskModifyTime;
    return this;
  }

   /**
   * 
   * @return starTaskModifyTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskModifyTime() {
    return starTaskModifyTime;
  }


  public void setStarTaskModifyTime(String starTaskModifyTime) {
    this.starTaskModifyTime = starTaskModifyTime;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskName(String starTaskName) {
    
    this.starTaskName = starTaskName;
    return this;
  }

   /**
   * 
   * @return starTaskName
  **/
  @javax.annotation.Nullable
  public String getStarTaskName() {
    return starTaskName;
  }


  public void setStarTaskName(String starTaskName) {
    this.starTaskName = starTaskName;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskPostEndTime(String starTaskPostEndTime) {
    
    this.starTaskPostEndTime = starTaskPostEndTime;
    return this;
  }

   /**
   * 
   * @return starTaskPostEndTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskPostEndTime() {
    return starTaskPostEndTime;
  }


  public void setStarTaskPostEndTime(String starTaskPostEndTime) {
    this.starTaskPostEndTime = starTaskPostEndTime;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskPostItemCount(Long starTaskPostItemCount) {
    
    this.starTaskPostItemCount = starTaskPostItemCount;
    return this;
  }

   /**
   * 
   * @return starTaskPostItemCount
  **/
  @javax.annotation.Nullable
  public Long getStarTaskPostItemCount() {
    return starTaskPostItemCount;
  }


  public void setStarTaskPostItemCount(Long starTaskPostItemCount) {
    this.starTaskPostItemCount = starTaskPostItemCount;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskRelateProjectCount(Long starTaskRelateProjectCount) {
    
    this.starTaskRelateProjectCount = starTaskRelateProjectCount;
    return this;
  }

   /**
   * 
   * @return starTaskRelateProjectCount
  **/
  @javax.annotation.Nullable
  public Long getStarTaskRelateProjectCount() {
    return starTaskRelateProjectCount;
  }


  public void setStarTaskRelateProjectCount(Long starTaskRelateProjectCount) {
    this.starTaskRelateProjectCount = starTaskRelateProjectCount;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskSource(StardeliveryTaskListV30DataListStarTaskSource starTaskSource) {
    
    this.starTaskSource = starTaskSource;
    return this;
  }

   /**
   * Get starTaskSource
   * @return starTaskSource
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30DataListStarTaskSource getStarTaskSource() {
    return starTaskSource;
  }


  public void setStarTaskSource(StardeliveryTaskListV30DataListStarTaskSource starTaskSource) {
    this.starTaskSource = starTaskSource;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskStartTime(String starTaskStartTime) {
    
    this.starTaskStartTime = starTaskStartTime;
    return this;
  }

   /**
   * 
   * @return starTaskStartTime
  **/
  @javax.annotation.Nullable
  public String getStarTaskStartTime() {
    return starTaskStartTime;
  }


  public void setStarTaskStartTime(String starTaskStartTime) {
    this.starTaskStartTime = starTaskStartTime;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskStatus(StardeliveryTaskListV30DataListStarTaskStatus starTaskStatus) {
    
    this.starTaskStatus = starTaskStatus;
    return this;
  }

   /**
   * Get starTaskStatus
   * @return starTaskStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30DataListStarTaskStatus getStarTaskStatus() {
    return starTaskStatus;
  }


  public void setStarTaskStatus(StardeliveryTaskListV30DataListStarTaskStatus starTaskStatus) {
    this.starTaskStatus = starTaskStatus;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTaskSubStatus(StardeliveryTaskListV30DataListStarTaskSubStatus starTaskSubStatus) {
    
    this.starTaskSubStatus = starTaskSubStatus;
    return this;
  }

   /**
   * Get starTaskSubStatus
   * @return starTaskSubStatus
  **/
  @javax.annotation.Nullable
  public StardeliveryTaskListV30DataListStarTaskSubStatus getStarTaskSubStatus() {
    return starTaskSubStatus;
  }


  public void setStarTaskSubStatus(StardeliveryTaskListV30DataListStarTaskSubStatus starTaskSubStatus) {
    this.starTaskSubStatus = starTaskSubStatus;
  }


  public StardeliveryTaskListV30ResponseDataListInner starTimeCostEndTime(String starTimeCostEndTime) {
    
    this.starTimeCostEndTime = starTimeCostEndTime;
    return this;
  }

   /**
   * 
   * @return starTimeCostEndTime
  **/
  @javax.annotation.Nullable
  public String getStarTimeCostEndTime() {
    return starTimeCostEndTime;
  }


  public void setStarTimeCostEndTime(String starTimeCostEndTime) {
    this.starTimeCostEndTime = starTimeCostEndTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StardeliveryTaskListV30ResponseDataListInner stardeliveryTaskListV30ResponseDataListInner = (StardeliveryTaskListV30ResponseDataListInner) o;
    return Objects.equals(this.starAdCostDivideRatio, stardeliveryTaskListV30ResponseDataListInner.starAdCostDivideRatio) &&
        Objects.equals(this.starMaterialBid, stardeliveryTaskListV30ResponseDataListInner.starMaterialBid) &&
        Objects.equals(this.starMaterialFirstName, stardeliveryTaskListV30ResponseDataListInner.starMaterialFirstName) &&
        Objects.equals(this.starMaterialFirstType, stardeliveryTaskListV30ResponseDataListInner.starMaterialFirstType) &&
        Objects.equals(this.starMaterialSecondName, stardeliveryTaskListV30ResponseDataListInner.starMaterialSecondName) &&
        Objects.equals(this.starMaterialSecondType, stardeliveryTaskListV30ResponseDataListInner.starMaterialSecondType) &&
        Objects.equals(this.starSaleCostEndTime, stardeliveryTaskListV30ResponseDataListInner.starSaleCostEndTime) &&
        Objects.equals(this.starTaskAnchorType, stardeliveryTaskListV30ResponseDataListInner.starTaskAnchorType) &&
        Objects.equals(this.starTaskBid, stardeliveryTaskListV30ResponseDataListInner.starTaskBid) &&
        Objects.equals(this.starTaskBudget, stardeliveryTaskListV30ResponseDataListInner.starTaskBudget) &&
        Objects.equals(this.starTaskCanDeliveryItemCount, stardeliveryTaskListV30ResponseDataListInner.starTaskCanDeliveryItemCount) &&
        Objects.equals(this.starTaskCreateTime, stardeliveryTaskListV30ResponseDataListInner.starTaskCreateTime) &&
        Objects.equals(this.starTaskExternalAction, stardeliveryTaskListV30ResponseDataListInner.starTaskExternalAction) &&
        Objects.equals(this.starTaskId, stardeliveryTaskListV30ResponseDataListInner.starTaskId) &&
        Objects.equals(this.starTaskModifyTime, stardeliveryTaskListV30ResponseDataListInner.starTaskModifyTime) &&
        Objects.equals(this.starTaskName, stardeliveryTaskListV30ResponseDataListInner.starTaskName) &&
        Objects.equals(this.starTaskPostEndTime, stardeliveryTaskListV30ResponseDataListInner.starTaskPostEndTime) &&
        Objects.equals(this.starTaskPostItemCount, stardeliveryTaskListV30ResponseDataListInner.starTaskPostItemCount) &&
        Objects.equals(this.starTaskRelateProjectCount, stardeliveryTaskListV30ResponseDataListInner.starTaskRelateProjectCount) &&
        Objects.equals(this.starTaskSource, stardeliveryTaskListV30ResponseDataListInner.starTaskSource) &&
        Objects.equals(this.starTaskStartTime, stardeliveryTaskListV30ResponseDataListInner.starTaskStartTime) &&
        Objects.equals(this.starTaskStatus, stardeliveryTaskListV30ResponseDataListInner.starTaskStatus) &&
        Objects.equals(this.starTaskSubStatus, stardeliveryTaskListV30ResponseDataListInner.starTaskSubStatus) &&
        Objects.equals(this.starTimeCostEndTime, stardeliveryTaskListV30ResponseDataListInner.starTimeCostEndTime);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(starAdCostDivideRatio, starMaterialBid, starMaterialFirstName, starMaterialFirstType, starMaterialSecondName, starMaterialSecondType, starSaleCostEndTime, starTaskAnchorType, starTaskBid, starTaskBudget, starTaskCanDeliveryItemCount, starTaskCreateTime, starTaskExternalAction, starTaskId, starTaskModifyTime, starTaskName, starTaskPostEndTime, starTaskPostItemCount, starTaskRelateProjectCount, starTaskSource, starTaskStartTime, starTaskStatus, starTaskSubStatus, starTimeCostEndTime);
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
    sb.append("class StardeliveryTaskListV30ResponseDataListInner {\n");
    sb.append("    starAdCostDivideRatio: ").append(toIndentedString(starAdCostDivideRatio)).append("\n");
    sb.append("    starMaterialBid: ").append(toIndentedString(starMaterialBid)).append("\n");
    sb.append("    starMaterialFirstName: ").append(toIndentedString(starMaterialFirstName)).append("\n");
    sb.append("    starMaterialFirstType: ").append(toIndentedString(starMaterialFirstType)).append("\n");
    sb.append("    starMaterialSecondName: ").append(toIndentedString(starMaterialSecondName)).append("\n");
    sb.append("    starMaterialSecondType: ").append(toIndentedString(starMaterialSecondType)).append("\n");
    sb.append("    starSaleCostEndTime: ").append(toIndentedString(starSaleCostEndTime)).append("\n");
    sb.append("    starTaskAnchorType: ").append(toIndentedString(starTaskAnchorType)).append("\n");
    sb.append("    starTaskBid: ").append(toIndentedString(starTaskBid)).append("\n");
    sb.append("    starTaskBudget: ").append(toIndentedString(starTaskBudget)).append("\n");
    sb.append("    starTaskCanDeliveryItemCount: ").append(toIndentedString(starTaskCanDeliveryItemCount)).append("\n");
    sb.append("    starTaskCreateTime: ").append(toIndentedString(starTaskCreateTime)).append("\n");
    sb.append("    starTaskExternalAction: ").append(toIndentedString(starTaskExternalAction)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
    sb.append("    starTaskModifyTime: ").append(toIndentedString(starTaskModifyTime)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    starTaskPostEndTime: ").append(toIndentedString(starTaskPostEndTime)).append("\n");
    sb.append("    starTaskPostItemCount: ").append(toIndentedString(starTaskPostItemCount)).append("\n");
    sb.append("    starTaskRelateProjectCount: ").append(toIndentedString(starTaskRelateProjectCount)).append("\n");
    sb.append("    starTaskSource: ").append(toIndentedString(starTaskSource)).append("\n");
    sb.append("    starTaskStartTime: ").append(toIndentedString(starTaskStartTime)).append("\n");
    sb.append("    starTaskStatus: ").append(toIndentedString(starTaskStatus)).append("\n");
    sb.append("    starTaskSubStatus: ").append(toIndentedString(starTaskSubStatus)).append("\n");
    sb.append("    starTimeCostEndTime: ").append(toIndentedString(starTimeCostEndTime)).append("\n");
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
    openapiFields.add("star_ad_cost_divide_ratio");
    openapiFields.add("star_material_bid");
    openapiFields.add("star_material_first_name");
    openapiFields.add("star_material_first_type");
    openapiFields.add("star_material_second_name");
    openapiFields.add("star_material_second_type");
    openapiFields.add("star_sale_cost_end_time");
    openapiFields.add("star_task_anchor_type");
    openapiFields.add("star_task_bid");
    openapiFields.add("star_task_budget");
    openapiFields.add("star_task_can_delivery_item_count");
    openapiFields.add("star_task_create_time");
    openapiFields.add("star_task_external_action");
    openapiFields.add("star_task_id");
    openapiFields.add("star_task_modify_time");
    openapiFields.add("star_task_name");
    openapiFields.add("star_task_post_end_time");
    openapiFields.add("star_task_post_item_count");
    openapiFields.add("star_task_relate_project_count");
    openapiFields.add("star_task_source");
    openapiFields.add("star_task_start_time");
    openapiFields.add("star_task_status");
    openapiFields.add("star_task_sub_status");
    openapiFields.add("star_time_cost_end_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StardeliveryTaskListV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StardeliveryTaskListV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StardeliveryTaskListV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StardeliveryTaskListV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<StardeliveryTaskListV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, StardeliveryTaskListV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StardeliveryTaskListV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StardeliveryTaskListV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StardeliveryTaskListV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to StardeliveryTaskListV30ResponseDataListInner
  */
  public static StardeliveryTaskListV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StardeliveryTaskListV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of StardeliveryTaskListV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

