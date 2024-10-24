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
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataBoostFlowStatInfo;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner;
import com.bytedance.ads.model.StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-24T16:27:44.765493616+08:00[Asia/Shanghai]")
public class StarVasGetBoostItemGroupDetailV2ResponseData {
  public static final String SERIALIZED_NAME_ALL_FLOW_STAT_INFO = "all_flow_stat_info";
  @SerializedName(SERIALIZED_NAME_ALL_FLOW_STAT_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo allFlowStatInfo = null;

  public static final String SERIALIZED_NAME_BOOST_FLOW_STAT_INFO = "boost_flow_stat_info";
  @SerializedName(SERIALIZED_NAME_BOOST_FLOW_STAT_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataBoostFlowStatInfo boostFlowStatInfo = null;

  public static final String SERIALIZED_NAME_ORDER_STAT_INFO = "order_stat_info";
  @SerializedName(SERIALIZED_NAME_ORDER_STAT_INFO)
  private List<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner> orderStatInfo = null;

  public static final String SERIALIZED_NAME_TASK_INFO = "task_info";
  @SerializedName(SERIALIZED_NAME_TASK_INFO)
  private StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo taskInfo = null;

  public StarVasGetBoostItemGroupDetailV2ResponseData() {
  }

  public StarVasGetBoostItemGroupDetailV2ResponseData allFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo allFlowStatInfo) {
    
    this.allFlowStatInfo = allFlowStatInfo;
    return this;
  }

   /**
   * Get allFlowStatInfo
   * @return allFlowStatInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo getAllFlowStatInfo() {
    return allFlowStatInfo;
  }


  public void setAllFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataAllFlowStatInfo allFlowStatInfo) {
    this.allFlowStatInfo = allFlowStatInfo;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseData boostFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataBoostFlowStatInfo boostFlowStatInfo) {
    
    this.boostFlowStatInfo = boostFlowStatInfo;
    return this;
  }

   /**
   * Get boostFlowStatInfo
   * @return boostFlowStatInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataBoostFlowStatInfo getBoostFlowStatInfo() {
    return boostFlowStatInfo;
  }


  public void setBoostFlowStatInfo(StarVasGetBoostItemGroupDetailV2ResponseDataBoostFlowStatInfo boostFlowStatInfo) {
    this.boostFlowStatInfo = boostFlowStatInfo;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseData orderStatInfo(List<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner> orderStatInfo) {
    
    this.orderStatInfo = orderStatInfo;
    return this;
  }

  public StarVasGetBoostItemGroupDetailV2ResponseData addOrderStatInfoItem(StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner orderStatInfoItem) {
    if (this.orderStatInfo == null) {
      this.orderStatInfo = new ArrayList<>();
    }
    this.orderStatInfo.add(orderStatInfoItem);
    return this;
  }

   /**
   * 指派单业务指标，最多返回50个指派单的信息
   * @return orderStatInfo
  **/
  @javax.annotation.Nullable
  public List<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner> getOrderStatInfo() {
    return orderStatInfo;
  }


  public void setOrderStatInfo(List<StarVasGetBoostItemGroupDetailV2ResponseDataOrderStatInfoInner> orderStatInfo) {
    this.orderStatInfo = orderStatInfo;
  }


  public StarVasGetBoostItemGroupDetailV2ResponseData taskInfo(StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo taskInfo) {
    
    this.taskInfo = taskInfo;
    return this;
  }

   /**
   * Get taskInfo
   * @return taskInfo
  **/
  @javax.annotation.Nullable
  public StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo getTaskInfo() {
    return taskInfo;
  }


  public void setTaskInfo(StarVasGetBoostItemGroupDetailV2ResponseDataTaskInfo taskInfo) {
    this.taskInfo = taskInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarVasGetBoostItemGroupDetailV2ResponseData starVasGetBoostItemGroupDetailV2ResponseData = (StarVasGetBoostItemGroupDetailV2ResponseData) o;
    return Objects.equals(this.allFlowStatInfo, starVasGetBoostItemGroupDetailV2ResponseData.allFlowStatInfo) &&
        Objects.equals(this.boostFlowStatInfo, starVasGetBoostItemGroupDetailV2ResponseData.boostFlowStatInfo) &&
        Objects.equals(this.orderStatInfo, starVasGetBoostItemGroupDetailV2ResponseData.orderStatInfo) &&
        Objects.equals(this.taskInfo, starVasGetBoostItemGroupDetailV2ResponseData.taskInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allFlowStatInfo, boostFlowStatInfo, orderStatInfo, taskInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarVasGetBoostItemGroupDetailV2ResponseData {\n");
    sb.append("    allFlowStatInfo: ").append(toIndentedString(allFlowStatInfo)).append("\n");
    sb.append("    boostFlowStatInfo: ").append(toIndentedString(boostFlowStatInfo)).append("\n");
    sb.append("    orderStatInfo: ").append(toIndentedString(orderStatInfo)).append("\n");
    sb.append("    taskInfo: ").append(toIndentedString(taskInfo)).append("\n");
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
    openapiFields.add("all_flow_stat_info");
    openapiFields.add("boost_flow_stat_info");
    openapiFields.add("order_stat_info");
    openapiFields.add("task_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("all_flow_stat_info");
    openapiRequiredFields.add("boost_flow_stat_info");
    openapiRequiredFields.add("order_stat_info");
    openapiRequiredFields.add("task_info");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarVasGetBoostItemGroupDetailV2ResponseData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarVasGetBoostItemGroupDetailV2ResponseData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarVasGetBoostItemGroupDetailV2ResponseData.class));

       return (TypeAdapter<T>) new TypeAdapter<StarVasGetBoostItemGroupDetailV2ResponseData>() {
           @Override
           public void write(JsonWriter out, StarVasGetBoostItemGroupDetailV2ResponseData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarVasGetBoostItemGroupDetailV2ResponseData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarVasGetBoostItemGroupDetailV2ResponseData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarVasGetBoostItemGroupDetailV2ResponseData
  * @throws IOException if the JSON string is invalid with respect to StarVasGetBoostItemGroupDetailV2ResponseData
  */
  public static StarVasGetBoostItemGroupDetailV2ResponseData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarVasGetBoostItemGroupDetailV2ResponseData.class);
  }

 /**
  * Convert an instance of StarVasGetBoostItemGroupDetailV2ResponseData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

