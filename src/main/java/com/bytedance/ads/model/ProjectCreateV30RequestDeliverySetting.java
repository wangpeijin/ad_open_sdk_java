/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingBidSpeed;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingBidType;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingBudgetMode;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingBudgetOptimizeSwitch;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingDeepBidType;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingFilterNightSwitch;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingPricing;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingProjectCustom;
import com.bytedance.ads.model.ProjectCreateV30DeliverySettingScheduleType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ProjectCreateV30RequestDeliverySetting {
  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Double bid = null;

  public static final String SERIALIZED_NAME_BID_SPEED = "bid_speed";
  @SerializedName(SERIALIZED_NAME_BID_SPEED)
  private ProjectCreateV30DeliverySettingBidSpeed bidSpeed = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private ProjectCreateV30DeliverySettingBidType bidType = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Double budget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ProjectCreateV30DeliverySettingBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_BUDGET_OPTIMIZE_SWITCH = "budget_optimize_switch";
  @SerializedName(SERIALIZED_NAME_BUDGET_OPTIMIZE_SWITCH)
  private ProjectCreateV30DeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch = null;

  public static final String SERIALIZED_NAME_CPA_BID = "cpa_bid";
  @SerializedName(SERIALIZED_NAME_CPA_BID)
  private Double cpaBid = null;

  public static final String SERIALIZED_NAME_DEEP_BID_TYPE = "deep_bid_type";
  @SerializedName(SERIALIZED_NAME_DEEP_BID_TYPE)
  private ProjectCreateV30DeliverySettingDeepBidType deepBidType = null;

  public static final String SERIALIZED_NAME_DEEP_CPABID = "deep_cpabid";
  @SerializedName(SERIALIZED_NAME_DEEP_CPABID)
  private Double deepCpabid = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_FILTER_NIGHT_SWITCH = "filter_night_switch";
  @SerializedName(SERIALIZED_NAME_FILTER_NIGHT_SWITCH)
  private ProjectCreateV30DeliverySettingFilterNightSwitch filterNightSwitch = null;

  public static final String SERIALIZED_NAME_FIRST_ROI_GOAL = "first_roi_goal";
  @SerializedName(SERIALIZED_NAME_FIRST_ROI_GOAL)
  private Double firstRoiGoal = null;

  public static final String SERIALIZED_NAME_PRICING = "pricing";
  @SerializedName(SERIALIZED_NAME_PRICING)
  private ProjectCreateV30DeliverySettingPricing pricing = null;

  public static final String SERIALIZED_NAME_PROJECT_CUSTOM = "project_custom";
  @SerializedName(SERIALIZED_NAME_PROJECT_CUSTOM)
  private ProjectCreateV30DeliverySettingProjectCustom projectCustom = null;

  public static final String SERIALIZED_NAME_ROI_GOAL = "roi_goal";
  @SerializedName(SERIALIZED_NAME_ROI_GOAL)
  private Double roiGoal = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private ProjectCreateV30DeliverySettingScheduleType scheduleType = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public ProjectCreateV30RequestDeliverySetting() {
  }

  public ProjectCreateV30RequestDeliverySetting bid(Double bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * cpc/cpm项目出价
   * @return bid
  **/
  @javax.annotation.Nullable
  public Double getBid() {
    return bid;
  }


  public void setBid(Double bid) {
    this.bid = bid;
  }


  public ProjectCreateV30RequestDeliverySetting bidSpeed(ProjectCreateV30DeliverySettingBidSpeed bidSpeed) {
    
    this.bidSpeed = bidSpeed;
    return this;
  }

   /**
   * Get bidSpeed
   * @return bidSpeed
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingBidSpeed getBidSpeed() {
    return bidSpeed;
  }


  public void setBidSpeed(ProjectCreateV30DeliverySettingBidSpeed bidSpeed) {
    this.bidSpeed = bidSpeed;
  }


  public ProjectCreateV30RequestDeliverySetting bidType(ProjectCreateV30DeliverySettingBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nonnull
  public ProjectCreateV30DeliverySettingBidType getBidType() {
    return bidType;
  }


  public void setBidType(ProjectCreateV30DeliverySettingBidType bidType) {
    this.bidType = bidType;
  }


  public ProjectCreateV30RequestDeliverySetting budget(Double budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 
   * @return budget
  **/
  @javax.annotation.Nullable
  public Double getBudget() {
    return budget;
  }


  public void setBudget(Double budget) {
    this.budget = budget;
  }


  public ProjectCreateV30RequestDeliverySetting budgetMode(ProjectCreateV30DeliverySettingBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nonnull
  public ProjectCreateV30DeliverySettingBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ProjectCreateV30DeliverySettingBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ProjectCreateV30RequestDeliverySetting budgetOptimizeSwitch(ProjectCreateV30DeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch) {
    
    this.budgetOptimizeSwitch = budgetOptimizeSwitch;
    return this;
  }

   /**
   * Get budgetOptimizeSwitch
   * @return budgetOptimizeSwitch
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingBudgetOptimizeSwitch getBudgetOptimizeSwitch() {
    return budgetOptimizeSwitch;
  }


  public void setBudgetOptimizeSwitch(ProjectCreateV30DeliverySettingBudgetOptimizeSwitch budgetOptimizeSwitch) {
    this.budgetOptimizeSwitch = budgetOptimizeSwitch;
  }


  public ProjectCreateV30RequestDeliverySetting cpaBid(Double cpaBid) {
    
    this.cpaBid = cpaBid;
    return this;
  }

   /**
   * 
   * @return cpaBid
  **/
  @javax.annotation.Nullable
  public Double getCpaBid() {
    return cpaBid;
  }


  public void setCpaBid(Double cpaBid) {
    this.cpaBid = cpaBid;
  }


  public ProjectCreateV30RequestDeliverySetting deepBidType(ProjectCreateV30DeliverySettingDeepBidType deepBidType) {
    
    this.deepBidType = deepBidType;
    return this;
  }

   /**
   * Get deepBidType
   * @return deepBidType
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingDeepBidType getDeepBidType() {
    return deepBidType;
  }


  public void setDeepBidType(ProjectCreateV30DeliverySettingDeepBidType deepBidType) {
    this.deepBidType = deepBidType;
  }


  public ProjectCreateV30RequestDeliverySetting deepCpabid(Double deepCpabid) {
    
    this.deepCpabid = deepCpabid;
    return this;
  }

   /**
   * 
   * @return deepCpabid
  **/
  @javax.annotation.Nullable
  public Double getDeepCpabid() {
    return deepCpabid;
  }


  public void setDeepCpabid(Double deepCpabid) {
    this.deepCpabid = deepCpabid;
  }


  public ProjectCreateV30RequestDeliverySetting endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ProjectCreateV30RequestDeliverySetting filterNightSwitch(ProjectCreateV30DeliverySettingFilterNightSwitch filterNightSwitch) {
    
    this.filterNightSwitch = filterNightSwitch;
    return this;
  }

   /**
   * Get filterNightSwitch
   * @return filterNightSwitch
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingFilterNightSwitch getFilterNightSwitch() {
    return filterNightSwitch;
  }


  public void setFilterNightSwitch(ProjectCreateV30DeliverySettingFilterNightSwitch filterNightSwitch) {
    this.filterNightSwitch = filterNightSwitch;
  }


  public ProjectCreateV30RequestDeliverySetting firstRoiGoal(Double firstRoiGoal) {
    
    this.firstRoiGoal = firstRoiGoal;
    return this;
  }

   /**
   * 
   * @return firstRoiGoal
  **/
  @javax.annotation.Nullable
  public Double getFirstRoiGoal() {
    return firstRoiGoal;
  }


  public void setFirstRoiGoal(Double firstRoiGoal) {
    this.firstRoiGoal = firstRoiGoal;
  }


  public ProjectCreateV30RequestDeliverySetting pricing(ProjectCreateV30DeliverySettingPricing pricing) {
    
    this.pricing = pricing;
    return this;
  }

   /**
   * Get pricing
   * @return pricing
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingPricing getPricing() {
    return pricing;
  }


  public void setPricing(ProjectCreateV30DeliverySettingPricing pricing) {
    this.pricing = pricing;
  }


  public ProjectCreateV30RequestDeliverySetting projectCustom(ProjectCreateV30DeliverySettingProjectCustom projectCustom) {
    
    this.projectCustom = projectCustom;
    return this;
  }

   /**
   * Get projectCustom
   * @return projectCustom
  **/
  @javax.annotation.Nullable
  public ProjectCreateV30DeliverySettingProjectCustom getProjectCustom() {
    return projectCustom;
  }


  public void setProjectCustom(ProjectCreateV30DeliverySettingProjectCustom projectCustom) {
    this.projectCustom = projectCustom;
  }


  public ProjectCreateV30RequestDeliverySetting roiGoal(Double roiGoal) {
    
    this.roiGoal = roiGoal;
    return this;
  }

   /**
   * 
   * @return roiGoal
  **/
  @javax.annotation.Nullable
  public Double getRoiGoal() {
    return roiGoal;
  }


  public void setRoiGoal(Double roiGoal) {
    this.roiGoal = roiGoal;
  }


  public ProjectCreateV30RequestDeliverySetting scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public ProjectCreateV30RequestDeliverySetting scheduleType(ProjectCreateV30DeliverySettingScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nonnull
  public ProjectCreateV30DeliverySettingScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(ProjectCreateV30DeliverySettingScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }


  public ProjectCreateV30RequestDeliverySetting startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 
   * @return startTime
  **/
  @javax.annotation.Nullable
  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectCreateV30RequestDeliverySetting projectCreateV30RequestDeliverySetting = (ProjectCreateV30RequestDeliverySetting) o;
    return Objects.equals(this.bid, projectCreateV30RequestDeliverySetting.bid) &&
        Objects.equals(this.bidSpeed, projectCreateV30RequestDeliverySetting.bidSpeed) &&
        Objects.equals(this.bidType, projectCreateV30RequestDeliverySetting.bidType) &&
        Objects.equals(this.budget, projectCreateV30RequestDeliverySetting.budget) &&
        Objects.equals(this.budgetMode, projectCreateV30RequestDeliverySetting.budgetMode) &&
        Objects.equals(this.budgetOptimizeSwitch, projectCreateV30RequestDeliverySetting.budgetOptimizeSwitch) &&
        Objects.equals(this.cpaBid, projectCreateV30RequestDeliverySetting.cpaBid) &&
        Objects.equals(this.deepBidType, projectCreateV30RequestDeliverySetting.deepBidType) &&
        Objects.equals(this.deepCpabid, projectCreateV30RequestDeliverySetting.deepCpabid) &&
        Objects.equals(this.endTime, projectCreateV30RequestDeliverySetting.endTime) &&
        Objects.equals(this.filterNightSwitch, projectCreateV30RequestDeliverySetting.filterNightSwitch) &&
        Objects.equals(this.firstRoiGoal, projectCreateV30RequestDeliverySetting.firstRoiGoal) &&
        Objects.equals(this.pricing, projectCreateV30RequestDeliverySetting.pricing) &&
        Objects.equals(this.projectCustom, projectCreateV30RequestDeliverySetting.projectCustom) &&
        Objects.equals(this.roiGoal, projectCreateV30RequestDeliverySetting.roiGoal) &&
        Objects.equals(this.scheduleTime, projectCreateV30RequestDeliverySetting.scheduleTime) &&
        Objects.equals(this.scheduleType, projectCreateV30RequestDeliverySetting.scheduleType) &&
        Objects.equals(this.startTime, projectCreateV30RequestDeliverySetting.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bid, bidSpeed, bidType, budget, budgetMode, budgetOptimizeSwitch, cpaBid, deepBidType, deepCpabid, endTime, filterNightSwitch, firstRoiGoal, pricing, projectCustom, roiGoal, scheduleTime, scheduleType, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectCreateV30RequestDeliverySetting {\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    bidSpeed: ").append(toIndentedString(bidSpeed)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    budgetOptimizeSwitch: ").append(toIndentedString(budgetOptimizeSwitch)).append("\n");
    sb.append("    cpaBid: ").append(toIndentedString(cpaBid)).append("\n");
    sb.append("    deepBidType: ").append(toIndentedString(deepBidType)).append("\n");
    sb.append("    deepCpabid: ").append(toIndentedString(deepCpabid)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    filterNightSwitch: ").append(toIndentedString(filterNightSwitch)).append("\n");
    sb.append("    firstRoiGoal: ").append(toIndentedString(firstRoiGoal)).append("\n");
    sb.append("    pricing: ").append(toIndentedString(pricing)).append("\n");
    sb.append("    projectCustom: ").append(toIndentedString(projectCustom)).append("\n");
    sb.append("    roiGoal: ").append(toIndentedString(roiGoal)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
    openapiFields.add("bid");
    openapiFields.add("bid_speed");
    openapiFields.add("bid_type");
    openapiFields.add("budget");
    openapiFields.add("budget_mode");
    openapiFields.add("budget_optimize_switch");
    openapiFields.add("cpa_bid");
    openapiFields.add("deep_bid_type");
    openapiFields.add("deep_cpabid");
    openapiFields.add("end_time");
    openapiFields.add("filter_night_switch");
    openapiFields.add("first_roi_goal");
    openapiFields.add("pricing");
    openapiFields.add("project_custom");
    openapiFields.add("roi_goal");
    openapiFields.add("schedule_time");
    openapiFields.add("schedule_type");
    openapiFields.add("start_time");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("bid_type");
    openapiRequiredFields.add("budget_mode");
    openapiRequiredFields.add("schedule_type");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectCreateV30RequestDeliverySetting.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectCreateV30RequestDeliverySetting' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectCreateV30RequestDeliverySetting> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectCreateV30RequestDeliverySetting.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectCreateV30RequestDeliverySetting>() {
           @Override
           public void write(JsonWriter out, ProjectCreateV30RequestDeliverySetting value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectCreateV30RequestDeliverySetting read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectCreateV30RequestDeliverySetting given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectCreateV30RequestDeliverySetting
  * @throws IOException if the JSON string is invalid with respect to ProjectCreateV30RequestDeliverySetting
  */
  public static ProjectCreateV30RequestDeliverySetting fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectCreateV30RequestDeliverySetting.class);
  }

 /**
  * Convert an instance of ProjectCreateV30RequestDeliverySetting to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

