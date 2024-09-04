/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.17
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.StarDemandListV2FilteringComponentType;
import com.bytedance.ads.model.StarDemandListV2FilteringQueryTimeRange;
import com.bytedance.ads.model.StarDemandListV2FilteringTaskCategory;
import com.bytedance.ads.model.StarDemandListV2FilteringUniversalOrderStatus;
import com.bytedance.ads.model.StarDemandListV2FilteringUniversalSettlementType;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-09-04T13:08:12.620169007+08:00[Asia/Shanghai]")
public class StarDemandListV2Filtering {
  public static final String SERIALIZED_NAME_COMPONENT_TYPE = "component_type";
  @SerializedName(SERIALIZED_NAME_COMPONENT_TYPE)
  private StarDemandListV2FilteringComponentType componentType = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_QUERY_TIME_RANGE = "query_time_range";
  @SerializedName(SERIALIZED_NAME_QUERY_TIME_RANGE)
  private StarDemandListV2FilteringQueryTimeRange queryTimeRange = null;

  public static final String SERIALIZED_NAME_TASK_CATEGORY = "task_category";
  @SerializedName(SERIALIZED_NAME_TASK_CATEGORY)
  private StarDemandListV2FilteringTaskCategory taskCategory = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS = "universal_order_status";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_ORDER_STATUS)
  private StarDemandListV2FilteringUniversalOrderStatus universalOrderStatus = null;

  public static final String SERIALIZED_NAME_UNIVERSAL_SETTLEMENT_TYPE = "universal_settlement_type";
  @SerializedName(SERIALIZED_NAME_UNIVERSAL_SETTLEMENT_TYPE)
  private StarDemandListV2FilteringUniversalSettlementType universalSettlementType = null;

  public StarDemandListV2Filtering() {
  }

  public StarDemandListV2Filtering componentType(StarDemandListV2FilteringComponentType componentType) {
    
    this.componentType = componentType;
    return this;
  }

   /**
   * Get componentType
   * @return componentType
  **/
  @javax.annotation.Nullable
  public StarDemandListV2FilteringComponentType getComponentType() {
    return componentType;
  }


  public void setComponentType(StarDemandListV2FilteringComponentType componentType) {
    this.componentType = componentType;
  }


  public StarDemandListV2Filtering name(String name) {
    
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


  public StarDemandListV2Filtering queryTimeRange(StarDemandListV2FilteringQueryTimeRange queryTimeRange) {
    
    this.queryTimeRange = queryTimeRange;
    return this;
  }

   /**
   * Get queryTimeRange
   * @return queryTimeRange
  **/
  @javax.annotation.Nullable
  public StarDemandListV2FilteringQueryTimeRange getQueryTimeRange() {
    return queryTimeRange;
  }


  public void setQueryTimeRange(StarDemandListV2FilteringQueryTimeRange queryTimeRange) {
    this.queryTimeRange = queryTimeRange;
  }


  public StarDemandListV2Filtering taskCategory(StarDemandListV2FilteringTaskCategory taskCategory) {
    
    this.taskCategory = taskCategory;
    return this;
  }

   /**
   * Get taskCategory
   * @return taskCategory
  **/
  @javax.annotation.Nullable
  public StarDemandListV2FilteringTaskCategory getTaskCategory() {
    return taskCategory;
  }


  public void setTaskCategory(StarDemandListV2FilteringTaskCategory taskCategory) {
    this.taskCategory = taskCategory;
  }


  public StarDemandListV2Filtering universalOrderStatus(StarDemandListV2FilteringUniversalOrderStatus universalOrderStatus) {
    
    this.universalOrderStatus = universalOrderStatus;
    return this;
  }

   /**
   * Get universalOrderStatus
   * @return universalOrderStatus
  **/
  @javax.annotation.Nullable
  public StarDemandListV2FilteringUniversalOrderStatus getUniversalOrderStatus() {
    return universalOrderStatus;
  }


  public void setUniversalOrderStatus(StarDemandListV2FilteringUniversalOrderStatus universalOrderStatus) {
    this.universalOrderStatus = universalOrderStatus;
  }


  public StarDemandListV2Filtering universalSettlementType(StarDemandListV2FilteringUniversalSettlementType universalSettlementType) {
    
    this.universalSettlementType = universalSettlementType;
    return this;
  }

   /**
   * Get universalSettlementType
   * @return universalSettlementType
  **/
  @javax.annotation.Nullable
  public StarDemandListV2FilteringUniversalSettlementType getUniversalSettlementType() {
    return universalSettlementType;
  }


  public void setUniversalSettlementType(StarDemandListV2FilteringUniversalSettlementType universalSettlementType) {
    this.universalSettlementType = universalSettlementType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StarDemandListV2Filtering starDemandListV2Filtering = (StarDemandListV2Filtering) o;
    return Objects.equals(this.componentType, starDemandListV2Filtering.componentType) &&
        Objects.equals(this.name, starDemandListV2Filtering.name) &&
        Objects.equals(this.queryTimeRange, starDemandListV2Filtering.queryTimeRange) &&
        Objects.equals(this.taskCategory, starDemandListV2Filtering.taskCategory) &&
        Objects.equals(this.universalOrderStatus, starDemandListV2Filtering.universalOrderStatus) &&
        Objects.equals(this.universalSettlementType, starDemandListV2Filtering.universalSettlementType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentType, name, queryTimeRange, taskCategory, universalOrderStatus, universalSettlementType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StarDemandListV2Filtering {\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryTimeRange: ").append(toIndentedString(queryTimeRange)).append("\n");
    sb.append("    taskCategory: ").append(toIndentedString(taskCategory)).append("\n");
    sb.append("    universalOrderStatus: ").append(toIndentedString(universalOrderStatus)).append("\n");
    sb.append("    universalSettlementType: ").append(toIndentedString(universalSettlementType)).append("\n");
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
    openapiFields.add("component_type");
    openapiFields.add("name");
    openapiFields.add("query_time_range");
    openapiFields.add("task_category");
    openapiFields.add("universal_order_status");
    openapiFields.add("universal_settlement_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StarDemandListV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StarDemandListV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StarDemandListV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StarDemandListV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<StarDemandListV2Filtering>() {
           @Override
           public void write(JsonWriter out, StarDemandListV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StarDemandListV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StarDemandListV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StarDemandListV2Filtering
  * @throws IOException if the JSON string is invalid with respect to StarDemandListV2Filtering
  */
  public static StarDemandListV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StarDemandListV2Filtering.class);
  }

 /**
  * Convert an instance of StarDemandListV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

