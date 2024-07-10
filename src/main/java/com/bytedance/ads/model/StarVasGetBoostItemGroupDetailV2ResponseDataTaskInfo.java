/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.12
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2DataTaskInfoBidType;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostAction;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus;
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
 * 助推组信息
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-07-10T17:51:16.380351592+08:00[PRC]")
public class StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo {
  public static final String SERIALIZED_NAME_BID_AMOUNT = "bid_amount";
  @SerializedName(SERIALIZED_NAME_BID_AMOUNT)
  private Long bidAmount = null;

  public static final String SERIALIZED_NAME_BID_TYPE = "bid_type";
  @SerializedName(SERIALIZED_NAME_BID_TYPE)
  private StarVasGetBoostItemGroupDetailV2DataTaskInfoBidType bidType = null;

  public static final String SERIALIZED_NAME_BOOST_ACTION = "boost_action";
  @SerializedName(SERIALIZED_NAME_BOOST_ACTION)
  private StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostAction boostAction = null;

  public static final String SERIALIZED_NAME_BOOST_AMOUNT = "boost_amount";
  @SerializedName(SERIALIZED_NAME_BOOST_AMOUNT)
  private Long boostAmount = null;

  public static final String SERIALIZED_NAME_BOOST_COST = "boost_cost";
  @SerializedName(SERIALIZED_NAME_BOOST_COST)
  private Long boostCost = null;

  public static final String SERIALIZED_NAME_BOOST_HOURS = "boost_hours";
  @SerializedName(SERIALIZED_NAME_BOOST_HOURS)
  private Long boostHours = null;

  public static final String SERIALIZED_NAME_BOOST_TYPE = "boost_type";
  @SerializedName(SERIALIZED_NAME_BOOST_TYPE)
  private StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType boostType = null;

  public static final String SERIALIZED_NAME_CREATE_TIME = "create_time";
  @SerializedName(SERIALIZED_NAME_CREATE_TIME)
  private Long createTime = null;

  public static final String SERIALIZED_NAME_PACK_ID = "pack_id";
  @SerializedName(SERIALIZED_NAME_PACK_ID)
  private Long packId = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus status = null;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Long taskId = null;

  public static final String SERIALIZED_NAME_TASK_NAME = "task_name";
  @SerializedName(SERIALIZED_NAME_TASK_NAME)
  private String taskName = null;

  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo() {
  }

  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo bidAmount(Long bidAmount) {
    
    this.bidAmount = bidAmount;
    return this;
  }

   /**
   * 手动出价，乘百取整（如：0.1 -&gt; 10）。若没有则代表自动出价
   * @return bidAmount
  **/
  @javax.annotation.Nullable
  public Long getBidAmount() {
    return bidAmount;
  }


  public void setBidAmount(Long bidAmount) {
    this.bidAmount = bidAmount;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo bidType(StarVasGetBoostItemGroupDetailV2DataTaskInfoBidType bidType) {
    
    this.bidType = bidType;
    return this;
  }

   /**
   * Get bidType
   * @return bidType
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2DataTaskInfoBidType getBidType() {
    return bidType;
  }


  public void setBidType(StarVasGetBoostItemGroupDetailV2DataTaskInfoBidType bidType) {
    this.bidType = bidType;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo boostAction(StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostAction boostAction) {
    
    this.boostAction = boostAction;
    return this;
  }

   /**
   * Get boostAction
   * @return boostAction
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostAction getBoostAction() {
    return boostAction;
  }


  public void setBoostAction(StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostAction boostAction) {
    this.boostAction = boostAction;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo boostAmount(Long boostAmount) {
    
    this.boostAmount = boostAmount;
    return this;
  }

   /**
   * 助推预算，单位元
   * @return boostAmount
  **/
  @javax.annotation.Nullable
  public Long getBoostAmount() {
    return boostAmount;
  }


  public void setBoostAmount(Long boostAmount) {
    this.boostAmount = boostAmount;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo boostCost(Long boostCost) {
    
    this.boostCost = boostCost;
    return this;
  }

   /**
   * 助推消耗，单位千分之一元
   * @return boostCost
  **/
  @javax.annotation.Nullable
  public Long getBoostCost() {
    return boostCost;
  }


  public void setBoostCost(Long boostCost) {
    this.boostCost = boostCost;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo boostHours(Long boostHours) {
    
    this.boostHours = boostHours;
    return this;
  }

   /**
   * 自定义投放时长，单位时。若没有则代表非自定义投放时长
   * @return boostHours
  **/
  @javax.annotation.Nullable
  public Long getBoostHours() {
    return boostHours;
  }


  public void setBoostHours(Long boostHours) {
    this.boostHours = boostHours;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo boostType(StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType boostType) {
    
    this.boostType = boostType;
    return this;
  }

   /**
   * Get boostType
   * @return boostType
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType getBoostType() {
    return boostType;
  }


  public void setBoostType(StarVasGetBoostItemGroupDetailV2DataTaskInfoBoostType boostType) {
    this.boostType = boostType;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo createTime(Long createTime) {
    
    this.createTime = createTime;
    return this;
  }

   /**
   * 创建时间
   * @return createTime
  **/
  @javax.annotation.Nullable
  public Long getCreateTime() {
    return createTime;
  }


  public void setCreateTime(Long createTime) {
    this.createTime = createTime;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo packId(Long packId) {
    
    this.packId = packId;
    return this;
  }

   /**
   * 关联人群包，仅boost_type为CUSTOM_PACKAGE有效
   * @return packId
  **/
  @javax.annotation.Nullable
  public Long getPackId() {
    return packId;
  }


  public void setPackId(Long packId) {
    this.packId = packId;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo status(StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus getStatus() {
    return status;
  }


  public void setStatus(StarVasGetBoostItemGroupDetailV2DataTaskInfoStatus status) {
    this.status = status;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo taskId(Long taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 助推组ID
   * @return taskId
  **/
  @javax.annotation.Nullable
  public Long getTaskId() {
    return taskId;
  }


  public void setTaskId(Long taskId) {
    this.taskId = taskId;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo taskName(String taskName) {
    
    this.taskName = taskName;
    return this;
  }

   /**
   * 助推组名称
   * @return taskName
  **/
  @javax.annotation.Nullable
  public String getTaskName() {
    return taskName;
  }


  public void setTaskName(String taskName) {
    this.taskName = taskName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo = (StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo) o;
    return Objects.equals(this.bidAmount, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.bidAmount) &&
        Objects.equals(this.bidType, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.bidType) &&
        Objects.equals(this.boostAction, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.boostAction) &&
        Objects.equals(this.boostAmount, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.boostAmount) &&
        Objects.equals(this.boostCost, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.boostCost) &&
        Objects.equals(this.boostHours, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.boostHours) &&
        Objects.equals(this.boostType, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.boostType) &&
        Objects.equals(this.createTime, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.createTime) &&
        Objects.equals(this.packId, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.packId) &&
        Objects.equals(this.status, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.status) &&
        Objects.equals(this.taskId, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.taskId) &&
        Objects.equals(this.taskName, starVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.taskName);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(bidAmount, bidType, boostAction, boostAmount, boostCost, boostHours, boostType, createTime, packId, status, taskId, taskName);
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
    sb.append("class StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo {\n");
    sb.append("    bidAmount: ").append(toIndentedString(bidAmount)).append("\n");
    sb.append("    bidType: ").append(toIndentedString(bidType)).append("\n");
    sb.append("    boostAction: ").append(toIndentedString(boostAction)).append("\n");
    sb.append("    boostAmount: ").append(toIndentedString(boostAmount)).append("\n");
    sb.append("    boostCost: ").append(toIndentedString(boostCost)).append("\n");
    sb.append("    boostHours: ").append(toIndentedString(boostHours)).append("\n");
    sb.append("    boostType: ").append(toIndentedString(boostType)).append("\n");
    sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
    sb.append("    packId: ").append(toIndentedString(packId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
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
    openapiFields.add("bid_amount");
    openapiFields.add("bid_type");
    openapiFields.add("boost_action");
    openapiFields.add("boost_amount");
    openapiFields.add("boost_cost");
    openapiFields.add("boost_hours");
    openapiFields.add("boost_type");
    openapiFields.add("create_time");
    openapiFields.add("pack_id");
    openapiFields.add("status");
    openapiFields.add("task_id");
    openapiFields.add("task_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("boost_action");
    openapiRequiredFields.add("boost_amount");
    openapiRequiredFields.add("boost_cost");
    openapiRequiredFields.add("boost_type");
    openapiRequiredFields.add("create_time");
    openapiRequiredFields.add("status");
    openapiRequiredFields.add("task_id");
    openapiRequiredFields.add("task_name");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo
  */
  public static StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo.class);
  }

 /**
  * Convert an instance of StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

