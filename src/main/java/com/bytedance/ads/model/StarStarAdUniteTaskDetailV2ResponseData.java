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
import com.bytedance.ads.model.StarStarAdUniteTaskDetailV2DataAuditStatus;
import com.bytedance.ads.model.StarStarAdUniteTaskDetailV2DataEvaluateType;
import com.bytedance.ads.model.StarStarAdUniteTaskDetailV2DataStatus;
import com.bytedance.ads.model.StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarStarAdUniteTaskDetailV2ResponseData {
  public static final String SERIALIZED_NAME_AUDIT_STATUS = "audit_status";
  @SerializedName(SERIALIZED_NAME_AUDIT_STATUS)
  private StarStarAdUniteTaskDetailV2DataAuditStatus auditStatus = null;

  public static final String SERIALIZED_NAME_BUDGET = "budget";
  @SerializedName(SERIALIZED_NAME_BUDGET)
  private Long budget = null;

  public static final String SERIALIZED_NAME_DEMAND_ID = "demand_id";
  @SerializedName(SERIALIZED_NAME_DEMAND_ID)
  private Long demandId = null;

  public static final String SERIALIZED_NAME_EVALUATE_TYPE = "evaluate_type";
  @SerializedName(SERIALIZED_NAME_EVALUATE_TYPE)
  private StarStarAdUniteTaskDetailV2DataEvaluateType evaluateType = null;

  public static final String SERIALIZED_NAME_STAR_ID = "star_id";
  @SerializedName(SERIALIZED_NAME_STAR_ID)
  private Long starId = null;

  public static final String SERIALIZED_NAME_STAT_INFO = "stat_info";
  @SerializedName(SERIALIZED_NAME_STAT_INFO)
  private List<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner> statInfo = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StarStarAdUniteTaskDetailV2DataStatus status = null;

  public static final String SERIALIZED_NAME_WEEK_SCHEDULE = "week_schedule";
  @SerializedName(SERIALIZED_NAME_WEEK_SCHEDULE)
  private List<List<Long>> weekSchedule = null;

  public StarStarAdUniteTaskDetailV2ResponseData() {
  }

  public StarStarAdUniteTaskDetailV2ResponseData auditStatus(StarStarAdUniteTaskDetailV2DataAuditStatus auditStatus) {
    
    this.auditStatus = auditStatus;
    return this;
  }

   /**
   * Get auditStatus
   * @return auditStatus
  **/
  @javax.annotation.Nullable
  public StarStarAdUniteTaskDetailV2DataAuditStatus getAuditStatus() {
    return auditStatus;
  }


  public void setAuditStatus(StarStarAdUniteTaskDetailV2DataAuditStatus auditStatus) {
    this.auditStatus = auditStatus;
  }


  public StarStarAdUniteTaskDetailV2ResponseData budget(Long budget) {
    
    this.budget = budget;
    return this;
  }

   /**
   * 任务预算，单位：元*1000，建议获取后除以1000展示为元单位
   * @return budget
  **/
  @javax.annotation.Nullable
  public Long getBudget() {
    return budget;
  }


  public void setBudget(Long budget) {
    this.budget = budget;
  }


  public StarStarAdUniteTaskDetailV2ResponseData demandId(Long demandId) {
    
    this.demandId = demandId;
    return this;
  }

   /**
   * 任务id
   * @return demandId
  **/
  @javax.annotation.Nullable
  public Long getDemandId() {
    return demandId;
  }


  public void setDemandId(Long demandId) {
    this.demandId = demandId;
  }


  public StarStarAdUniteTaskDetailV2ResponseData evaluateType(StarStarAdUniteTaskDetailV2DataEvaluateType evaluateType) {
    
    this.evaluateType = evaluateType;
    return this;
  }

   /**
   * Get evaluateType
   * @return evaluateType
  **/
  @javax.annotation.Nullable
  public StarStarAdUniteTaskDetailV2DataEvaluateType getEvaluateType() {
    return evaluateType;
  }


  public void setEvaluateType(StarStarAdUniteTaskDetailV2DataEvaluateType evaluateType) {
    this.evaluateType = evaluateType;
  }


  public StarStarAdUniteTaskDetailV2ResponseData starId(Long starId) {
    
    this.starId = starId;
    return this;
  }

   /**
   * 客户的星图id
   * @return starId
  **/
  @javax.annotation.Nullable
  public Long getStarId() {
    return starId;
  }


  public void setStarId(Long starId) {
    this.starId = starId;
  }


  public StarStarAdUniteTaskDetailV2ResponseData statInfo(List<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner> statInfo) {
    
    this.statInfo = statInfo;
    return this;
  }

  public StarStarAdUniteTaskDetailV2ResponseData addStatInfoItem(StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner statInfoItem) {
    if (this.statInfo == null) {
      this.statInfo = new ArrayList<>();
    }
    this.statInfo.add(statInfoItem);
    return this;
  }

   /**
   * 
   * @return statInfo
  **/
  @javax.annotation.Nullable
  public List<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner> getStatInfo() {
    return statInfo;
  }


  public void setStatInfo(List<StarStarAdUniteTaskDetailV2ResponseDataStatInfoInner> statInfo) {
    this.statInfo = statInfo;
  }


  public StarStarAdUniteTaskDetailV2ResponseData status(StarStarAdUniteTaskDetailV2DataStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StarStarAdUniteTaskDetailV2DataStatus getStatus() {
    return status;
  }


  public void setStatus(StarStarAdUniteTaskDetailV2DataStatus status) {
    this.status = status;
  }


  public StarStarAdUniteTaskDetailV2ResponseData weekSchedule(List<List<Long>> weekSchedule) {
    
    this.weekSchedule = weekSchedule;
    return this;
  }

  public StarStarAdUniteTaskDetailV2ResponseData addWeekScheduleItem(List<Long> weekScheduleItem) {
    if (this.weekSchedule == null) {
      this.weekSchedule = new ArrayList<>();
    }
    this.weekSchedule.add(weekScheduleItem);
    return this;
  }

   /**
   * 投放时段(没返回就是全时段投放)
   * @return weekSchedule
  **/
  @javax.annotation.Nullable
  public List<List<Long>> getWeekSchedule() {
    return weekSchedule;
  }


  public void setWeekSchedule(List<List<Long>> weekSchedule) {
    this.weekSchedule = weekSchedule;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarStarAdUniteTaskDetailV2ResponseData starStarAdUniteTaskDetailV2ResponseData = (StarStarAdUniteTaskDetailV2ResponseData) o;
    return Objects.equals(this.auditStatus, starStarAdUniteTaskDetailV2ResponseData.auditStatus) &&
        Objects.equals(this.budget, starStarAdUniteTaskDetailV2ResponseData.budget) &&
        Objects.equals(this.demandId, starStarAdUniteTaskDetailV2ResponseData.demandId) &&
        Objects.equals(this.evaluateType, starStarAdUniteTaskDetailV2ResponseData.evaluateType) &&
        Objects.equals(this.starId, starStarAdUniteTaskDetailV2ResponseData.starId) &&
        Objects.equals(this.statInfo, starStarAdUniteTaskDetailV2ResponseData.statInfo) &&
        Objects.equals(this.status, starStarAdUniteTaskDetailV2ResponseData.status) &&
        Objects.equals(this.weekSchedule, starStarAdUniteTaskDetailV2ResponseData.weekSchedule);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditStatus, budget, demandId, evaluateType, starId, statInfo, status, weekSchedule);
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
    sb.append("class StarStarAdUniteTaskDetailV2ResponseData {\n");
    sb.append("    auditStatus: ").append(toIndentedString(auditStatus)).append("\n");
    sb.append("    budget: ").append(toIndentedString(budget)).append("\n");
    sb.append("    demandId: ").append(toIndentedString(demandId)).append("\n");
    sb.append("    evaluateType: ").append(toIndentedString(evaluateType)).append("\n");
    sb.append("    starId: ").append(toIndentedString(starId)).append("\n");
    sb.append("    statInfo: ").append(toIndentedString(statInfo)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    weekSchedule: ").append(toIndentedString(weekSchedule)).append("\n");
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
    openapiFields.add("audit_status");
    openapiFields.add("budget");
    openapiFields.add("demand_id");
    openapiFields.add("evaluate_type");
    openapiFields.add("star_id");
    openapiFields.add("stat_info");
    openapiFields.add("status");
    openapiFields.add("week_schedule");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("audit_status");
    openapiRequiredFields.add("budget");
    openapiRequiredFields.add("demand_id");
    openapiRequiredFields.add("evaluate_type");
    openapiRequiredFields.add("star_id");
    openapiRequiredFields.add("stat_info");
    openapiRequiredFields.add("status");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarStarAdUniteTaskDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarStarAdUniteTaskDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarStarAdUniteTaskDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarStarAdUniteTaskDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarStarAdUniteTaskDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarStarAdUniteTaskDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarStarAdUniteTaskDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarStarAdUniteTaskDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarStarAdUniteTaskDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarStarAdUniteTaskDetailV2ResponseData
  */
  public static StarStarAdUniteTaskDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarStarAdUniteTaskDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of StarStarAdUniteTaskDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

