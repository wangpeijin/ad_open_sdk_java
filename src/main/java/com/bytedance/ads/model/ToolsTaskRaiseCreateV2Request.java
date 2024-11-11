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
import com.bytedance.ads.model.ToolsTaskRaiseCreateV2BudgetMode;
import com.bytedance.ads.model.ToolsTaskRaiseCreateV2RaiseMode;
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
 * ToolsTaskRaiseCreateV2Request
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class ToolsTaskRaiseCreateV2Request {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_ALLOCATED_BUDGET = "allocated_budget";
  @SerializedName(SERIALIZED_NAME_ALLOCATED_BUDGET)
  private Double allocatedBudget = null;

  public static final String SERIALIZED_NAME_BUDGET_MODE = "budget_mode";
  @SerializedName(SERIALIZED_NAME_BUDGET_MODE)
  private ToolsTaskRaiseCreateV2BudgetMode budgetMode = null;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime = null;

  public static final String SERIALIZED_NAME_RAISE_MODE = "raise_mode";
  @SerializedName(SERIALIZED_NAME_RAISE_MODE)
  private ToolsTaskRaiseCreateV2RaiseMode raiseMode = null;

  public ToolsTaskRaiseCreateV2Request() {
  }

  public ToolsTaskRaiseCreateV2Request advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 广告主ID
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public ToolsTaskRaiseCreateV2Request allocatedBudget(Double allocatedBudget) {
    
    this.allocatedBudget = allocatedBudget;
    return this;
  }

   /**
   * 日预算金额，当budget_mode为LIMIT时必填，范围：1000-9999999
   * @return allocatedBudget
  **/
  @javax.annotation.Nullable
  public Double getAllocatedBudget() {
    return allocatedBudget;
  }


  public void setAllocatedBudget(Double allocatedBudget) {
    this.allocatedBudget = allocatedBudget;
  }


  public ToolsTaskRaiseCreateV2Request budgetMode(ToolsTaskRaiseCreateV2BudgetMode budgetMode) {
    
    this.budgetMode = budgetMode;
    return this;
  }

   /**
   * Get budgetMode
   * @return budgetMode
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseCreateV2BudgetMode getBudgetMode() {
    return budgetMode;
  }


  public void setBudgetMode(ToolsTaskRaiseCreateV2BudgetMode budgetMode) {
    this.budgetMode = budgetMode;
  }


  public ToolsTaskRaiseCreateV2Request endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 起量任务结束时间yyyy-mm-dd，传空为不限时长，起量将在指定日期0点结束
   * @return endTime
  **/
  @javax.annotation.Nullable
  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public ToolsTaskRaiseCreateV2Request raiseMode(ToolsTaskRaiseCreateV2RaiseMode raiseMode) {
    
    this.raiseMode = raiseMode;
    return this;
  }

   /**
   * Get raiseMode
   * @return raiseMode
  **/
  @javax.annotation.Nullable
  public ToolsTaskRaiseCreateV2RaiseMode getRaiseMode() {
    return raiseMode;
  }


  public void setRaiseMode(ToolsTaskRaiseCreateV2RaiseMode raiseMode) {
    this.raiseMode = raiseMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsTaskRaiseCreateV2Request toolsTaskRaiseCreateV2Request = (ToolsTaskRaiseCreateV2Request) o;
    return Objects.equals(this.advertiserId, toolsTaskRaiseCreateV2Request.advertiserId) &&
        Objects.equals(this.allocatedBudget, toolsTaskRaiseCreateV2Request.allocatedBudget) &&
        Objects.equals(this.budgetMode, toolsTaskRaiseCreateV2Request.budgetMode) &&
        Objects.equals(this.endTime, toolsTaskRaiseCreateV2Request.endTime) &&
        Objects.equals(this.raiseMode, toolsTaskRaiseCreateV2Request.raiseMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, allocatedBudget, budgetMode, endTime, raiseMode);
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
    sb.append("class ToolsTaskRaiseCreateV2Request {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    allocatedBudget: ").append(toIndentedString(allocatedBudget)).append("\n");
    sb.append("    budgetMode: ").append(toIndentedString(budgetMode)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    raiseMode: ").append(toIndentedString(raiseMode)).append("\n");
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
    openapiFields.add("allocated_budget");
    openapiFields.add("budget_mode");
    openapiFields.add("end_time");
    openapiFields.add("raise_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("budget_mode");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsTaskRaiseCreateV2Request.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsTaskRaiseCreateV2Request' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsTaskRaiseCreateV2Request> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsTaskRaiseCreateV2Request.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsTaskRaiseCreateV2Request>() {
           @Override
           public void write(JsonWriter out, ToolsTaskRaiseCreateV2Request value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsTaskRaiseCreateV2Request read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsTaskRaiseCreateV2Request given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsTaskRaiseCreateV2Request
  * @throws IOException if the JSON string is invalid with respect to ToolsTaskRaiseCreateV2Request
  */
  public static ToolsTaskRaiseCreateV2Request fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsTaskRaiseCreateV2Request.class);
  }

 /**
  * Convert an instance of ToolsTaskRaiseCreateV2Request to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

