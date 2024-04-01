/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.ToolsTaskRaiseGetV2DataReportsBudgetMode;
import com.bytedance.ads.model.ToolsTaskRaiseGetV2DataReportsRaiseMode;
import com.bytedance.ads.model.ToolsTaskRaiseGetV2DataReportsStatus;
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
 * ToolsTaskRaiseGetV2ResponseDataReportsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-04-01T11:02:49.949526702+08:00[PRC]")
public class ToolsTaskRaiseGetV2ResponseDataReportsInner {
  public static final String SERIALIZED_NAME_ALLOCATED_BUDGET = "allocated_budget";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_BUDGET)
  private Double allocatedBudget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ToolsTaskRaiseGetV2DataReportsBudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_DURATION = "duration";
  @SerializedName(SERIALIZED_NAME_DURATION)
  private Long duration = null;

  public static final String SERIALIZED_NAME_INCREASED_COST = "increased_cost";
  @SerializedName(SERIALIZED_NAME_INCREASED_COST)
  private Double increasedCost = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_RAISE_MODE = "raise_mode";
  @SerializedName(SERIALIZED_NAME_RAISE_MODE)
  private ToolsTaskRaiseGetV2DataReportsRaiseMode raiseMode = null;

  public static final String SERIALIZED_NAME_REPORT_ID = "report_id";
  @SerializedName(SERIALIZED_NAME_REPORT_ID)
  private Long reportId = null;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private ToolsTaskRaiseGetV2DataReportsStatus status = null;

  public ToolsTaskRaiseGetV2ResponseDataReportsInner() {
  }

  public ToolsTaskRaiseGetV2ResponseDataReportsInner allocatedBudget(Double allocatedBudget) {
    
    this.allocatedBudget = allocatedBudget;
    return this;
  }

   /**
   * 
   * @return allocatedBudget
  **/
  @javax.annotation.Nullable
  public Double getAllocatedBudget() {
    return allocatedBudget;
  }


  public void setAllocatedBudget(Double allocatedBudget) {
    this.allocatedBudget = allocatedBudget;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner budgetMode(ToolsTaskRaiseGetV2DataReportsBudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseGetV2DataReportsBudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ToolsTaskRaiseGetV2DataReportsBudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner duration(Long duration) {
    
    this.duration = duration;
    return this;
  }

   /**
   * 
   * @return duration
  **/
  @javax.annotation.Nullable
  public Long getDuration() {
    return duration;
  }


  public void setDuration(Long duration) {
    this.duration = duration;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner increasedCost(Double increasedCost) {
    
    this.increasedCost = increasedCost;
    return this;
  }

   /**
   * 
   * @return increasedCost
  **/
  @javax.annotation.Nullable
  public Double getIncreasedCost() {
    return increasedCost;
  }


  public void setIncreasedCost(Double increasedCost) {
    this.increasedCost = increasedCost;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 
   * @return name
  **/
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner raiseMode(ToolsTaskRaiseGetV2DataReportsRaiseMode raiseMode) {
    
    this.raiseMode = raiseMode;
    return this;
  }

   /**
   * Get raiseMode
   * @return raiseMode
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseGetV2DataReportsRaiseMode getRaiseMode() {
    return raiseMode;
  }


  public void setRaiseMode(ToolsTaskRaiseGetV2DataReportsRaiseMode raiseMode) {
    this.raiseMode = raiseMode;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner reportId(Long reportId) {
    
    this.reportId = reportId;
    return this;
  }

   /**
   * 
   * @return reportId
  **/
  @javax.annotation.Nullable
  public Long getReportId() {
    return reportId;
  }


  public void setReportId(Long reportId) {
    this.reportId = reportId;
  }


  public ToolsTaskRaiseGetV2ResponseDataReportsInner startTime(String startTime) {
    
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


  public ToolsTaskRaiseGetV2ResponseDataReportsInner status(ToolsTaskRaiseGetV2DataReportsStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseGetV2DataReportsStatus getStatus() {
    return status;
  }


  public void setStatus(ToolsTaskRaiseGetV2DataReportsStatus status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsTaskRaiseGetV2ResponseDataReportsInner toolsTaskRaiseGetV2ResponseDataReportsInner = (ToolsTaskRaiseGetV2ResponseDataReportsInner) o;
    return Objects.equals(this.allocatedBudget, toolsTaskRaiseGetV2ResponseDataReportsInner.allocatedBudget) &&
        Objects.equals(this.budgetMode, toolsTaskRaiseGetV2ResponseDataReportsInner.budgetMode) &&
        Objects.equals(this.duration, toolsTaskRaiseGetV2ResponseDataReportsInner.duration) &&
        Objects.equals(this.increasedCost, toolsTaskRaiseGetV2ResponseDataReportsInner.increasedCost) &&
        Objects.equals(this.name, toolsTaskRaiseGetV2ResponseDataReportsInner.name) &&
        Objects.equals(this.raiseMode, toolsTaskRaiseGetV2ResponseDataReportsInner.raiseMode) &&
        Objects.equals(this.reportId, toolsTaskRaiseGetV2ResponseDataReportsInner.reportId) &&
        Objects.equals(this.startTime, toolsTaskRaiseGetV2ResponseDataReportsInner.startTime) &&
        Objects.equals(this.status, toolsTaskRaiseGetV2ResponseDataReportsInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(allocatedBudget, budgetMode, duration, increasedCost, name, raiseMode, reportId, startTime, status);
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
    sb.append("class ToolsTaskRaiseGetV2ResponseDataReportsInner {\n");
    sb.append("    allocatedBudget: ").append(toIndentedString(allocatedBudget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    increasedCost: ").append(toIndentedString(increasedCost)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    raiseMode: ").append(toIndentedString(raiseMode)).append("\n");
    sb.append("    reportId: ").append(toIndentedString(reportId)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("allocated_budget");
    openapiFields.add("budget_mode");
    openapiFields.add("duration");
    openapiFields.add("increased_cost");
    openapiFields.add("name");
    openapiFields.add("raise_mode");
    openapiFields.add("report_id");
    openapiFields.add("start_time");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsTaskRaiseGetV2ResponseDataReportsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsTaskRaiseGetV2ResponseDataReportsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsTaskRaiseGetV2ResponseDataReportsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsTaskRaiseGetV2ResponseDataReportsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsTaskRaiseGetV2ResponseDataReportsInner>() {
           @Override
           public void write(JsonWriter out, ToolsTaskRaiseGetV2ResponseDataReportsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsTaskRaiseGetV2ResponseDataReportsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsTaskRaiseGetV2ResponseDataReportsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsTaskRaiseGetV2ResponseDataReportsInner
  * @throws IOException if the JSON string is invalid with respect to ToolsTaskRaiseGetV2ResponseDataReportsInner
  */
  public static ToolsTaskRaiseGetV2ResponseDataReportsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsTaskRaiseGetV2ResponseDataReportsInner.class);
  }

 /**
  * Convert an instance of ToolsTaskRaiseGetV2ResponseDataReportsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

