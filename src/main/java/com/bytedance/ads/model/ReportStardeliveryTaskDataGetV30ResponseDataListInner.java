/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30DataListStarTaskSource;
import com.bytedance.ads.model.ReportStardeliveryTaskDataGetV30DataListStarTaskStatus;
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
 * ReportStardeliveryTaskDataGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class ReportStardeliveryTaskDataGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private Long active = null;

  public static final String SERIALIZED_NAME_ACTIVE_PAY = "active_pay";
  @SerializedName(SERIALIZED_NAME_ACTIVE_PAY)
  private Long activePay = null;

  public static final String SERIALIZED_NAME_ACTIVE_REGISTER = "active_register";
  @SerializedName(SERIALIZED_NAME_ACTIVE_REGISTER)
  private Long activeRegister = null;

  public static final String SERIALIZED_NAME_GAME_PAY_COUNT = "game_pay_count";
  @SerializedName(SERIALIZED_NAME_GAME_PAY_COUNT)
  private Long gamePayCount = null;

  public static final String SERIALIZED_NAME_INSTALL_FINISH_CNT = "install_finish_cnt";
  @SerializedName(SERIALIZED_NAME_INSTALL_FINISH_CNT)
  private Long installFinishCnt = null;

  public static final String SERIALIZED_NAME_NON_AD_STAT_COST = "non_ad_stat_cost";
  @SerializedName(SERIALIZED_NAME_NON_AD_STAT_COST)
  private Double nonAdStatCost = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_COUNT = "star_active_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_COUNT)
  private Long starActiveCount = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_PAY_COUNT = "star_active_pay_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_PAY_COUNT)
  private Long starActivePayCount = null;

  public static final String SERIALIZED_NAME_STAR_ACTIVE_REGISTER_COUNT = "star_active_register_count";
  @SerializedName(SERIALIZED_NAME_STAR_ACTIVE_REGISTER_COUNT)
  private Long starActiveRegisterCount = null;

  public static final String SERIALIZED_NAME_STAR_CONVERT_CNT = "star_convert_cnt";
  @SerializedName(SERIALIZED_NAME_STAR_CONVERT_CNT)
  private Long starConvertCnt = null;

  public static final String SERIALIZED_NAME_STAR_DEEP_PURCHASE_COUNT = "star_deep_purchase_count";
  @SerializedName(SERIALIZED_NAME_STAR_DEEP_PURCHASE_COUNT)
  private Long starDeepPurchaseCount = null;

  public static final String SERIALIZED_NAME_STAR_INSTALL_FINISH_COUNT = "star_install_finish_count";
  @SerializedName(SERIALIZED_NAME_STAR_INSTALL_FINISH_COUNT)
  private Long starInstallFinishCount = null;

  public static final String SERIALIZED_NAME_STAR_MATERIAL_STAT_COST = "star_material_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_MATERIAL_STAT_COST)
  private Double starMaterialStatCost = null;

  public static final String SERIALIZED_NAME_STAR_SALE_MATERIAL_STAT_COST = "star_sale_material_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_SALE_MATERIAL_STAT_COST)
  private Double starSaleMaterialStatCost = null;

  public static final String SERIALIZED_NAME_STAR_STAT_COST = "star_stat_cost";
  @SerializedName(SERIALIZED_NAME_STAR_STAT_COST)
  private Double starStatCost = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE = "star_task_anchor_type";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ANCHOR_TYPE)
  private ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType starTaskAnchorType = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BUDGET = "star_task_budget";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BUDGET)
  private Double starTaskBudget = null;

  public static final String SERIALIZED_NAME_STAR_TASK_BUDGET_COST_RATE = "star_task_budget_cost_rate";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_BUDGET_COST_RATE)
  private Double starTaskBudgetCostRate = null;

  public static final String SERIALIZED_NAME_STAR_TASK_CAN_DELIVERY_ITEM_COUNT = "star_task_can_delivery_item_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_CAN_DELIVERY_ITEM_COUNT)
  private Long starTaskCanDeliveryItemCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION = "star_task_external_action";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_EXTERNAL_ACTION)
  private ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction starTaskExternalAction = null;

  public static final String SERIALIZED_NAME_STAR_TASK_ID = "star_task_id";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_ID)
  private Long starTaskId = null;

  public static final String SERIALIZED_NAME_STAR_TASK_NAME = "star_task_name";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_NAME)
  private String starTaskName = null;

  public static final String SERIALIZED_NAME_STAR_TASK_POST_ITEM_COUNT = "star_task_post_item_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_POST_ITEM_COUNT)
  private Long starTaskPostItemCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_RELATE_PROJECT_COUNT = "star_task_relate_project_count";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_RELATE_PROJECT_COUNT)
  private Long starTaskRelateProjectCount = null;

  public static final String SERIALIZED_NAME_STAR_TASK_SOURCE = "star_task_source";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_SOURCE)
  private ReportStardeliveryTaskDataGetV30DataListStarTaskSource starTaskSource = null;

  public static final String SERIALIZED_NAME_STAR_TASK_START_TIME = "star_task_start_time";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_START_TIME)
  private String starTaskStartTime = null;

  public static final String SERIALIZED_NAME_STAR_TASK_STATUS = "star_task_status";
  @SerializedName(SERIALIZED_NAME_STAR_TASK_STATUS)
  private ReportStardeliveryTaskDataGetV30DataListStarTaskStatus starTaskStatus = null;

  public static final String SERIALIZED_NAME_STAT_COST = "stat_cost";
  @SerializedName(SERIALIZED_NAME_STAT_COST)
  private Double statCost = null;

  public ReportStardeliveryTaskDataGetV30ResponseDataListInner() {
  }

  public ReportStardeliveryTaskDataGetV30ResponseDataListInner active(Long active) {
    
    this.active = active;
    return this;
  }

   /**
   * 
   * @return active
  **/
  @javax.annotation.Nullable
  public Long getActive() {
    return active;
  }


  public void setActive(Long active) {
    this.active = active;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner activePay(Long activePay) {
    
    this.activePay = activePay;
    return this;
  }

   /**
   * 
   * @return activePay
  **/
  @javax.annotation.Nullable
  public Long getActivePay() {
    return activePay;
  }


  public void setActivePay(Long activePay) {
    this.activePay = activePay;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner activeRegister(Long activeRegister) {
    
    this.activeRegister = activeRegister;
    return this;
  }

   /**
   * 
   * @return activeRegister
  **/
  @javax.annotation.Nullable
  public Long getActiveRegister() {
    return activeRegister;
  }


  public void setActiveRegister(Long activeRegister) {
    this.activeRegister = activeRegister;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner gamePayCount(Long gamePayCount) {
    
    this.gamePayCount = gamePayCount;
    return this;
  }

   /**
   * 
   * @return gamePayCount
  **/
  @javax.annotation.Nullable
  public Long getGamePayCount() {
    return gamePayCount;
  }


  public void setGamePayCount(Long gamePayCount) {
    this.gamePayCount = gamePayCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner installFinishCnt(Long installFinishCnt) {
    
    this.installFinishCnt = installFinishCnt;
    return this;
  }

   /**
   * 
   * @return installFinishCnt
  **/
  @javax.annotation.Nullable
  public Long getInstallFinishCnt() {
    return installFinishCnt;
  }


  public void setInstallFinishCnt(Long installFinishCnt) {
    this.installFinishCnt = installFinishCnt;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner nonAdStatCost(Double nonAdStatCost) {
    
    this.nonAdStatCost = nonAdStatCost;
    return this;
  }

   /**
   * 
   * @return nonAdStatCost
  **/
  @javax.annotation.Nullable
  public Double getNonAdStatCost() {
    return nonAdStatCost;
  }


  public void setNonAdStatCost(Double nonAdStatCost) {
    this.nonAdStatCost = nonAdStatCost;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starActiveCount(Long starActiveCount) {
    
    this.starActiveCount = starActiveCount;
    return this;
  }

   /**
   * 
   * @return starActiveCount
  **/
  @javax.annotation.Nullable
  public Long getStarActiveCount() {
    return starActiveCount;
  }


  public void setStarActiveCount(Long starActiveCount) {
    this.starActiveCount = starActiveCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starActivePayCount(Long starActivePayCount) {
    
    this.starActivePayCount = starActivePayCount;
    return this;
  }

   /**
   * 
   * @return starActivePayCount
  **/
  @javax.annotation.Nullable
  public Long getStarActivePayCount() {
    return starActivePayCount;
  }


  public void setStarActivePayCount(Long starActivePayCount) {
    this.starActivePayCount = starActivePayCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starActiveRegisterCount(Long starActiveRegisterCount) {
    
    this.starActiveRegisterCount = starActiveRegisterCount;
    return this;
  }

   /**
   * 
   * @return starActiveRegisterCount
  **/
  @javax.annotation.Nullable
  public Long getStarActiveRegisterCount() {
    return starActiveRegisterCount;
  }


  public void setStarActiveRegisterCount(Long starActiveRegisterCount) {
    this.starActiveRegisterCount = starActiveRegisterCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starConvertCnt(Long starConvertCnt) {
    
    this.starConvertCnt = starConvertCnt;
    return this;
  }

   /**
   * 
   * @return starConvertCnt
  **/
  @javax.annotation.Nullable
  public Long getStarConvertCnt() {
    return starConvertCnt;
  }


  public void setStarConvertCnt(Long starConvertCnt) {
    this.starConvertCnt = starConvertCnt;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starDeepPurchaseCount(Long starDeepPurchaseCount) {
    
    this.starDeepPurchaseCount = starDeepPurchaseCount;
    return this;
  }

   /**
   * 
   * @return starDeepPurchaseCount
  **/
  @javax.annotation.Nullable
  public Long getStarDeepPurchaseCount() {
    return starDeepPurchaseCount;
  }


  public void setStarDeepPurchaseCount(Long starDeepPurchaseCount) {
    this.starDeepPurchaseCount = starDeepPurchaseCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starInstallFinishCount(Long starInstallFinishCount) {
    
    this.starInstallFinishCount = starInstallFinishCount;
    return this;
  }

   /**
   * 
   * @return starInstallFinishCount
  **/
  @javax.annotation.Nullable
  public Long getStarInstallFinishCount() {
    return starInstallFinishCount;
  }


  public void setStarInstallFinishCount(Long starInstallFinishCount) {
    this.starInstallFinishCount = starInstallFinishCount;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starMaterialStatCost(Double starMaterialStatCost) {
    
    this.starMaterialStatCost = starMaterialStatCost;
    return this;
  }

   /**
   * 
   * @return starMaterialStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarMaterialStatCost() {
    return starMaterialStatCost;
  }


  public void setStarMaterialStatCost(Double starMaterialStatCost) {
    this.starMaterialStatCost = starMaterialStatCost;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starSaleMaterialStatCost(Double starSaleMaterialStatCost) {
    
    this.starSaleMaterialStatCost = starSaleMaterialStatCost;
    return this;
  }

   /**
   * 
   * @return starSaleMaterialStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarSaleMaterialStatCost() {
    return starSaleMaterialStatCost;
  }


  public void setStarSaleMaterialStatCost(Double starSaleMaterialStatCost) {
    this.starSaleMaterialStatCost = starSaleMaterialStatCost;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starStatCost(Double starStatCost) {
    
    this.starStatCost = starStatCost;
    return this;
  }

   /**
   * 
   * @return starStatCost
  **/
  @javax.annotation.Nullable
  public Double getStarStatCost() {
    return starStatCost;
  }


  public void setStarStatCost(Double starStatCost) {
    this.starStatCost = starStatCost;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskAnchorType(ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType starTaskAnchorType) {
    
    this.starTaskAnchorType = starTaskAnchorType;
    return this;
  }

   /**
   * Get starTaskAnchorType
   * @return starTaskAnchorType
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType getStarTaskAnchorType() {
    return starTaskAnchorType;
  }


  public void setStarTaskAnchorType(ReportStardeliveryTaskDataGetV30DataListStarTaskAnchorType starTaskAnchorType) {
    this.starTaskAnchorType = starTaskAnchorType;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskBudget(Double starTaskBudget) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskBudgetCostRate(Double starTaskBudgetCostRate) {
    
    this.starTaskBudgetCostRate = starTaskBudgetCostRate;
    return this;
  }

   /**
   * 
   * @return starTaskBudgetCostRate
  **/
  @javax.annotation.Nullable
  public Double getStarTaskBudgetCostRate() {
    return starTaskBudgetCostRate;
  }


  public void setStarTaskBudgetCostRate(Double starTaskBudgetCostRate) {
    this.starTaskBudgetCostRate = starTaskBudgetCostRate;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskCanDeliveryItemCount(Long starTaskCanDeliveryItemCount) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskExternalAction(ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction starTaskExternalAction) {
    
    this.starTaskExternalAction = starTaskExternalAction;
    return this;
  }

   /**
   * Get starTaskExternalAction
   * @return starTaskExternalAction
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction getStarTaskExternalAction() {
    return starTaskExternalAction;
  }


  public void setStarTaskExternalAction(ReportStardeliveryTaskDataGetV30DataListStarTaskExternalAction starTaskExternalAction) {
    this.starTaskExternalAction = starTaskExternalAction;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskId(Long starTaskId) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskName(String starTaskName) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskPostItemCount(Long starTaskPostItemCount) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskRelateProjectCount(Long starTaskRelateProjectCount) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskSource(ReportStardeliveryTaskDataGetV30DataListStarTaskSource starTaskSource) {
    
    this.starTaskSource = starTaskSource;
    return this;
  }

   /**
   * Get starTaskSource
   * @return starTaskSource
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskDataGetV30DataListStarTaskSource getStarTaskSource() {
    return starTaskSource;
  }


  public void setStarTaskSource(ReportStardeliveryTaskDataGetV30DataListStarTaskSource starTaskSource) {
    this.starTaskSource = starTaskSource;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskStartTime(String starTaskStartTime) {
    
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


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner starTaskStatus(ReportStardeliveryTaskDataGetV30DataListStarTaskStatus starTaskStatus) {
    
    this.starTaskStatus = starTaskStatus;
    return this;
  }

   /**
   * Get starTaskStatus
   * @return starTaskStatus
  **/
  @javax.annotation.Nullable
  public ReportStardeliveryTaskDataGetV30DataListStarTaskStatus getStarTaskStatus() {
    return starTaskStatus;
  }


  public void setStarTaskStatus(ReportStardeliveryTaskDataGetV30DataListStarTaskStatus starTaskStatus) {
    this.starTaskStatus = starTaskStatus;
  }


  public ReportStardeliveryTaskDataGetV30ResponseDataListInner statCost(Double statCost) {
    
    this.statCost = statCost;
    return this;
  }

   /**
   * 
   * @return statCost
  **/
  @javax.annotation.Nullable
  public Double getStatCost() {
    return statCost;
  }


  public void setStatCost(Double statCost) {
    this.statCost = statCost;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportStardeliveryTaskDataGetV30ResponseDataListInner reportStardeliveryTaskDataGetV30ResponseDataListInner = (ReportStardeliveryTaskDataGetV30ResponseDataListInner) o;
    return Objects.equals(this.active, reportStardeliveryTaskDataGetV30ResponseDataListInner.active) &&
        Objects.equals(this.activePay, reportStardeliveryTaskDataGetV30ResponseDataListInner.activePay) &&
        Objects.equals(this.activeRegister, reportStardeliveryTaskDataGetV30ResponseDataListInner.activeRegister) &&
        Objects.equals(this.gamePayCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.gamePayCount) &&
        Objects.equals(this.installFinishCnt, reportStardeliveryTaskDataGetV30ResponseDataListInner.installFinishCnt) &&
        Objects.equals(this.nonAdStatCost, reportStardeliveryTaskDataGetV30ResponseDataListInner.nonAdStatCost) &&
        Objects.equals(this.starActiveCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starActiveCount) &&
        Objects.equals(this.starActivePayCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starActivePayCount) &&
        Objects.equals(this.starActiveRegisterCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starActiveRegisterCount) &&
        Objects.equals(this.starConvertCnt, reportStardeliveryTaskDataGetV30ResponseDataListInner.starConvertCnt) &&
        Objects.equals(this.starDeepPurchaseCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starDeepPurchaseCount) &&
        Objects.equals(this.starInstallFinishCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starInstallFinishCount) &&
        Objects.equals(this.starMaterialStatCost, reportStardeliveryTaskDataGetV30ResponseDataListInner.starMaterialStatCost) &&
        Objects.equals(this.starSaleMaterialStatCost, reportStardeliveryTaskDataGetV30ResponseDataListInner.starSaleMaterialStatCost) &&
        Objects.equals(this.starStatCost, reportStardeliveryTaskDataGetV30ResponseDataListInner.starStatCost) &&
        Objects.equals(this.starTaskAnchorType, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskAnchorType) &&
        Objects.equals(this.starTaskBudget, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskBudget) &&
        Objects.equals(this.starTaskBudgetCostRate, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskBudgetCostRate) &&
        Objects.equals(this.starTaskCanDeliveryItemCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskCanDeliveryItemCount) &&
        Objects.equals(this.starTaskExternalAction, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskExternalAction) &&
        Objects.equals(this.starTaskId, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskId) &&
        Objects.equals(this.starTaskName, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskName) &&
        Objects.equals(this.starTaskPostItemCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskPostItemCount) &&
        Objects.equals(this.starTaskRelateProjectCount, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskRelateProjectCount) &&
        Objects.equals(this.starTaskSource, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskSource) &&
        Objects.equals(this.starTaskStartTime, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskStartTime) &&
        Objects.equals(this.starTaskStatus, reportStardeliveryTaskDataGetV30ResponseDataListInner.starTaskStatus) &&
        Objects.equals(this.statCost, reportStardeliveryTaskDataGetV30ResponseDataListInner.statCost);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, activePay, activeRegister, gamePayCount, installFinishCnt, nonAdStatCost, starActiveCount, starActivePayCount, starActiveRegisterCount, starConvertCnt, starDeepPurchaseCount, starInstallFinishCount, starMaterialStatCost, starSaleMaterialStatCost, starStatCost, starTaskAnchorType, starTaskBudget, starTaskBudgetCostRate, starTaskCanDeliveryItemCount, starTaskExternalAction, starTaskId, starTaskName, starTaskPostItemCount, starTaskRelateProjectCount, starTaskSource, starTaskStartTime, starTaskStatus, statCost);
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
    sb.append("class ReportStardeliveryTaskDataGetV30ResponseDataListInner {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    activePay: ").append(toIndentedString(activePay)).append("\n");
    sb.append("    activeRegister: ").append(toIndentedString(activeRegister)).append("\n");
    sb.append("    gamePayCount: ").append(toIndentedString(gamePayCount)).append("\n");
    sb.append("    installFinishCnt: ").append(toIndentedString(installFinishCnt)).append("\n");
    sb.append("    nonAdStatCost: ").append(toIndentedString(nonAdStatCost)).append("\n");
    sb.append("    starActiveCount: ").append(toIndentedString(starActiveCount)).append("\n");
    sb.append("    starActivePayCount: ").append(toIndentedString(starActivePayCount)).append("\n");
    sb.append("    starActiveRegisterCount: ").append(toIndentedString(starActiveRegisterCount)).append("\n");
    sb.append("    starConvertCnt: ").append(toIndentedString(starConvertCnt)).append("\n");
    sb.append("    starDeepPurchaseCount: ").append(toIndentedString(starDeepPurchaseCount)).append("\n");
    sb.append("    starInstallFinishCount: ").append(toIndentedString(starInstallFinishCount)).append("\n");
    sb.append("    starMaterialStatCost: ").append(toIndentedString(starMaterialStatCost)).append("\n");
    sb.append("    starSaleMaterialStatCost: ").append(toIndentedString(starSaleMaterialStatCost)).append("\n");
    sb.append("    starStatCost: ").append(toIndentedString(starStatCost)).append("\n");
    sb.append("    starTaskAnchorType: ").append(toIndentedString(starTaskAnchorType)).append("\n");
    sb.append("    starTaskBudget: ").append(toIndentedString(starTaskBudget)).append("\n");
    sb.append("    starTaskBudgetCostRate: ").append(toIndentedString(starTaskBudgetCostRate)).append("\n");
    sb.append("    starTaskCanDeliveryItemCount: ").append(toIndentedString(starTaskCanDeliveryItemCount)).append("\n");
    sb.append("    starTaskExternalAction: ").append(toIndentedString(starTaskExternalAction)).append("\n");
    sb.append("    starTaskId: ").append(toIndentedString(starTaskId)).append("\n");
    sb.append("    starTaskName: ").append(toIndentedString(starTaskName)).append("\n");
    sb.append("    starTaskPostItemCount: ").append(toIndentedString(starTaskPostItemCount)).append("\n");
    sb.append("    starTaskRelateProjectCount: ").append(toIndentedString(starTaskRelateProjectCount)).append("\n");
    sb.append("    starTaskSource: ").append(toIndentedString(starTaskSource)).append("\n");
    sb.append("    starTaskStartTime: ").append(toIndentedString(starTaskStartTime)).append("\n");
    sb.append("    starTaskStatus: ").append(toIndentedString(starTaskStatus)).append("\n");
    sb.append("    statCost: ").append(toIndentedString(statCost)).append("\n");
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
    openapiFields.add("active");
    openapiFields.add("active_pay");
    openapiFields.add("active_register");
    openapiFields.add("game_pay_count");
    openapiFields.add("install_finish_cnt");
    openapiFields.add("non_ad_stat_cost");
    openapiFields.add("star_active_count");
    openapiFields.add("star_active_pay_count");
    openapiFields.add("star_active_register_count");
    openapiFields.add("star_convert_cnt");
    openapiFields.add("star_deep_purchase_count");
    openapiFields.add("star_install_finish_count");
    openapiFields.add("star_material_stat_cost");
    openapiFields.add("star_sale_material_stat_cost");
    openapiFields.add("star_stat_cost");
    openapiFields.add("star_task_anchor_type");
    openapiFields.add("star_task_budget");
    openapiFields.add("star_task_budget_cost_rate");
    openapiFields.add("star_task_can_delivery_item_count");
    openapiFields.add("star_task_external_action");
    openapiFields.add("star_task_id");
    openapiFields.add("star_task_name");
    openapiFields.add("star_task_post_item_count");
    openapiFields.add("star_task_relate_project_count");
    openapiFields.add("star_task_source");
    openapiFields.add("star_task_start_time");
    openapiFields.add("star_task_status");
    openapiFields.add("stat_cost");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportStardeliveryTaskDataGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportStardeliveryTaskDataGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportStardeliveryTaskDataGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportStardeliveryTaskDataGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportStardeliveryTaskDataGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, ReportStardeliveryTaskDataGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportStardeliveryTaskDataGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportStardeliveryTaskDataGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportStardeliveryTaskDataGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to ReportStardeliveryTaskDataGetV30ResponseDataListInner
  */
  public static ReportStardeliveryTaskDataGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportStardeliveryTaskDataGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of ReportStardeliveryTaskDataGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

