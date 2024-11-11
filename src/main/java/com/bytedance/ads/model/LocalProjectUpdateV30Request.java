/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.LocalProjectUpdateV30PeakHolidays;
import com.bytedance.ads.model.LocalProjectUpdateV30PeakWeekDays;
import com.bytedance.ads.model.LocalProjectUpdateV30RequestAudience;
import com.bytedance.ads.model.LocalProjectUpdateV30ScheduleType;
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
 * LocalProjectUpdateV30Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class LocalProjectUpdateV30Request {
  public static final String SERIALIZED_NAME_AUDIENCE = "audience";
  @SerializedName(SERIALIZED_NAME_AUDIENCE)
  private LocalProjectUpdateV30RequestAudience audience = null;

  public static final String SERIALIZED_NAME_BID = "bid";
  @SerializedName(SERIALIZED_NAME_BID)
  private Long bid = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_HIGH_BUDGET_RATE = "high_budget_rate";
  @SerializedName(SERIALIZED_NAME_HIGH_BUDGET_RATE)
  private Long highBudgetRate = null;

  public static final String SERIALIZED_NAME_IS_SET_PEAK_BUDGET = "is_set_peak_budget";
  @SerializedName(SERIALIZED_NAME_IS_SET_PEAK_BUDGET)
  private Boolean isSetPeakBudget = null;

  public static final String SERIALIZED_NAME_LOCAL_ACCOUNT_ID = "local_account_id";
  @SerializedName(SERIALIZED_NAME_LOCAL_ACCOUNT_ID)
  private Long localAccountId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PEAK_HOLIDAYS = "peak_holidays";
  @SerializedName(SERIALIZED_NAME_PEAK_HOLIDAYS)
  private List<LocalProjectUpdateV30PeakHolidays> peakHolidays = null;

  public static final String SERIALIZED_NAME_PEAK_WEEK_DAYS = "peak_week_days";
  @SerializedName(SERIALIZED_NAME_PEAK_WEEK_DAYS)
  private List<LocalProjectUpdateV30PeakWeekDays> peakWeekDays = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private Long projectId = null;

  public static final String SERIALIZED_NAME_SCHEDULE_FIXED_SECONDS = "schedule_fixed_seconds";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_FIXED_SECONDS)
  private Long scheduleFixedSeconds = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TIME = "schedule_time";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TIME)
  private String scheduleTime = null;

  public static final String SERIALIZED_NAME_SCHEDULE_TYPE = "schedule_type";
  @SerializedName(SERIALIZED_NAME_SCHEDULE_TYPE)
  private LocalProjectUpdateV30ScheduleType scheduleType = null;

  public LocalProjectUpdateV30Request() {
  }

  public LocalProjectUpdateV30Request audience(LocalProjectUpdateV30RequestAudience audience) {
    
    this.audience = audience;
    return this;
  }

   /**
   * Get audience
   * @return audience
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30RequestAudience getAudience() {
    return audience;
  }


  public void setAudience(LocalProjectUpdateV30RequestAudience audience) {
    this.audience = audience;
  }


  public LocalProjectUpdateV30Request bid(Long bid) {
    
    this.bid = bid;
    return this;
  }

   /**
   * 
   * @return bid
  **/
  @javax.annotation.Nullable
  public Long getBid() {
    return bid;
  }


  public void setBid(Long bid) {
    this.bid = bid;
  }


  public LocalProjectUpdateV30Request budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 预算
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public LocalProjectUpdateV30Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 结束投放时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public LocalProjectUpdateV30Request highBudgetRate(Long highBudgetRate) {
    
    this.highBudgetRate = highBudgetRate;
    return this;
  }

   /**
   * 高峰日-预算上调比例（40表示上调40%）
   * minimum: 20
   * maximum: 200
   * @return highBudgetRate
  **/
  @javax.annotation.Nullable
  public Long getHighBudgetRate() {
    return highBudgetRate;
  }


  public void setHighBudgetRate(Long highBudgetRate) {
    this.highBudgetRate = highBudgetRate;
  }


  public LocalProjectUpdateV30Request isSetPeakBudget(Boolean isSetPeakBudget) {
    
    this.isSetPeakBudget = isSetPeakBudget;
    return this;
  }

   /**
   * 是否设置高峰日预算
   * @return isSetPeakBudget
  **/
  @javax.annotation.Nullable
  public Boolean getIsSetPeakBudget() {
    return isSetPeakBudget;
  }


  public void setIsSetPeakBudget(Boolean isSetPeakBudget) {
    this.isSetPeakBudget = isSetPeakBudget;
  }


  public LocalProjectUpdateV30Request localAccountId(Long localAccountId) {
    
    this.localAccountId = localAccountId;
    return this;
  }

   /**
   * 
   * @return localAccountId
  **/
  @javax.annotation.Nonnull
  public Long getLocalAccountId() {
    return localAccountId;
  }


  public void setLocalAccountId(Long localAccountId) {
    this.localAccountId = localAccountId;
  }


  public LocalProjectUpdateV30Request name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 项目名称
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public LocalProjectUpdateV30Request peakHolidays(List<LocalProjectUpdateV30PeakHolidays> peakHolidays) {
    
    this.peakHolidays = peakHolidays;
    return this;
  }

  public LocalProjectUpdateV30Request addPeakHolidaysItem(LocalProjectUpdateV30PeakHolidays peakHolidaysItem) {
    if (this.peakHolidays == null) {
      this.peakHolidays = new ArrayList<>();
    }
    this.peakHolidays.add(peakHolidaysItem);
    return this;
  }

   /**
   * 高峰日-节假日
   * @return peakHolidays
  **/
  @javax.annotation.Nullable
  public List<LocalProjectUpdateV30PeakHolidays> getPeakHolidays() {
    return peakHolidays;
  }


  public void setPeakHolidays(List<LocalProjectUpdateV30PeakHolidays> peakHolidays) {
    this.peakHolidays = peakHolidays;
  }


  public LocalProjectUpdateV30Request peakWeekDays(List<LocalProjectUpdateV30PeakWeekDays> peakWeekDays) {
    
    this.peakWeekDays = peakWeekDays;
    return this;
  }

  public LocalProjectUpdateV30Request addPeakWeekDaysItem(LocalProjectUpdateV30PeakWeekDays peakWeekDaysItem) {
    if (this.peakWeekDays == null) {
      this.peakWeekDays = new ArrayList<>();
    }
    this.peakWeekDays.add(peakWeekDaysItem);
    return this;
  }

   /**
   * 高峰日-自然周
   * @return peakWeekDays
  **/
  @javax.annotation.Nullable
  public List<LocalProjectUpdateV30PeakWeekDays> getPeakWeekDays() {
    return peakWeekDays;
  }


  public void setPeakWeekDays(List<LocalProjectUpdateV30PeakWeekDays> peakWeekDays) {
    this.peakWeekDays = peakWeekDays;
  }


  public LocalProjectUpdateV30Request projectId(Long projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目ID
   * @return projectId
  **/
  @javax.annotation.Nonnull
  public Long getProjectId() {
    return projectId;
  }


  public void setProjectId(Long projectId) {
    this.projectId = projectId;
  }


  public LocalProjectUpdateV30Request scheduleFixedSeconds(Long scheduleFixedSeconds) {
    
    this.scheduleFixedSeconds = scheduleFixedSeconds;
    return this;
  }

   /**
   * 固定投放时长
   * @return scheduleFixedSeconds
  **/
  @javax.annotation.Nullable
  public Long getScheduleFixedSeconds() {
    return scheduleFixedSeconds;
  }


  public void setScheduleFixedSeconds(Long scheduleFixedSeconds) {
    this.scheduleFixedSeconds = scheduleFixedSeconds;
  }


  public LocalProjectUpdateV30Request scheduleTime(String scheduleTime) {
    
    this.scheduleTime = scheduleTime;
    return this;
  }

   /**
   * 投放时段
   * @return scheduleTime
  **/
  @javax.annotation.Nullable
  public String getScheduleTime() {
    return scheduleTime;
  }


  public void setScheduleTime(String scheduleTime) {
    this.scheduleTime = scheduleTime;
  }


  public LocalProjectUpdateV30Request scheduleType(LocalProjectUpdateV30ScheduleType scheduleType) {
    
    this.scheduleType = scheduleType;
    return this;
  }

   /**
   * Get scheduleType
   * @return scheduleType
  **/
  @javax.annotation.Nullable
  public LocalProjectUpdateV30ScheduleType getScheduleType() {
    return scheduleType;
  }


  public void setScheduleType(LocalProjectUpdateV30ScheduleType scheduleType) {
    this.scheduleType = scheduleType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocalProjectUpdateV30Request localProjectUpdateV30Request = (LocalProjectUpdateV30Request) o;
    return Objects.equals(this.audience, localProjectUpdateV30Request.audience) &&
        Objects.equals(this.bid, localProjectUpdateV30Request.bid) &&
        Objects.equals(this.budget, localProjectUpdateV30Request.budget) &&
        Objects.equals(this.endTime, localProjectUpdateV30Request.endTime) &&
        Objects.equals(this.highBudgetRate, localProjectUpdateV30Request.highBudgetRate) &&
        Objects.equals(this.isSetPeakBudget, localProjectUpdateV30Request.isSetPeakBudget) &&
        Objects.equals(this.localAccountId, localProjectUpdateV30Request.localAccountId) &&
        Objects.equals(this.name, localProjectUpdateV30Request.name) &&
        Objects.equals(this.peakHolidays, localProjectUpdateV30Request.peakHolidays) &&
        Objects.equals(this.peakWeekDays, localProjectUpdateV30Request.peakWeekDays) &&
        Objects.equals(this.projectId, localProjectUpdateV30Request.projectId) &&
        Objects.equals(this.scheduleFixedSeconds, localProjectUpdateV30Request.scheduleFixedSeconds) &&
        Objects.equals(this.scheduleTime, localProjectUpdateV30Request.scheduleTime) &&
        Objects.equals(this.scheduleType, localProjectUpdateV30Request.scheduleType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(audience, bid, budget, endTime, highBudgetRate, isSetPeakBudget, localAccountId, name, peakHolidays, peakWeekDays, projectId, scheduleFixedSeconds, scheduleTime, scheduleType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocalProjectUpdateV30Request {\n");
    sb.append("    audience: ").append(toIndentedString(audience)).append("\n");
    sb.append("    bid: ").append(toIndentedString(bid)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    highBudgetRate: ").append(toIndentedString(highBudgetRate)).append("\n");
    sb.append("    isSetPeakBudget: ").append(toIndentedString(isSetPeakBudget)).append("\n");
    sb.append("    localAccountId: ").append(toIndentedString(localAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    peakHolidays: ").append(toIndentedString(peakHolidays)).append("\n");
    sb.append("    peakWeekDays: ").append(toIndentedString(peakWeekDays)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    scheduleFixedSeconds: ").append(toIndentedString(scheduleFixedSeconds)).append("\n");
    sb.append("    scheduleTime: ").append(toIndentedString(scheduleTime)).append("\n");
    sb.append("    scheduleType: ").append(toIndentedString(scheduleType)).append("\n");
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
    openapiFields.add("audience");
    openapiFields.add("bid");
    openapiFields.add("budget");
    openapiFields.add("end_time");
    openapiFields.add("high_budget_rate");
    openapiFields.add("is_set_peak_budget");
    openapiFields.add("local_account_id");
    openapiFields.add("name");
    openapiFields.add("peak_holidays");
    openapiFields.add("peak_week_days");
    openapiFields.add("project_id");
    openapiFields.add("schedule_fixed_seconds");
    openapiFields.add("schedule_time");
    openapiFields.add("schedule_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("local_account_id");
    openapiRequiredFields.add("project_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!LocalProjectUpdateV30Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'LocalProjectUpdateV30Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<LocalProjectUpdateV30Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(LocalProjectUpdateV30Request.class));

       return (TypeAdapter<T>) new TypeAdapter<LocalProjectUpdateV30Request>() {
           @Override
           public void write(JsonWriter out, LocalProjectUpdateV30Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public LocalProjectUpdateV30Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of LocalProjectUpdateV30Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of LocalProjectUpdateV30Request
  * @throws IOException if the JSON string is invalid with respect to LocalProjectUpdateV30Request
  */
  public static LocalProjectUpdateV30Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, LocalProjectUpdateV30Request.class);
  }

 /**
  * Convert an instance of LocalProjectUpdateV30Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

