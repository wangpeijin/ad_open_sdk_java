/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.8
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderReportV30FilterOrderCreateTime;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-06-25T11:19:50.960035423+08:00[PRC]")
public class DouplusOrderReportV30Filter {
  public static final String SERIALIZED_NAME_AUTHOR_UNIQUE_IDS = "author_unique_ids";
  @SerializedName(SERIALIZED_NAME_AUTHOR_UNIQUE_IDS)
  private List<String> authorUniqueIds = null;

  public static final String SERIALIZED_NAME_ITEM_IDS = "item_ids";
  @SerializedName(SERIALIZED_NAME_ITEM_IDS)
  private List<Long> itemIds = null;

  public static final String SERIALIZED_NAME_ORDER_CREATE_TIME = "order_create_time";
  @SerializedName(SERIALIZED_NAME_ORDER_CREATE_TIME)
  private DouplusOrderReportV30FilterOrderCreateTime orderCreateTime = null;

  public static final String SERIALIZED_NAME_ORDER_IDS = "order_ids";
  @SerializedName(SERIALIZED_NAME_ORDER_IDS)
  private List<Long> orderIds = null;

  public static final String SERIALIZED_NAME_ROOM_IDS = "room_ids";
  @SerializedName(SERIALIZED_NAME_ROOM_IDS)
  private List<Long> roomIds = null;

  public static final String SERIALIZED_NAME_TASK_IDS = "task_ids";
  @SerializedName(SERIALIZED_NAME_TASK_IDS)
  private List<Long> taskIds = null;

  public DouplusOrderReportV30Filter() {
  }

  public DouplusOrderReportV30Filter authorUniqueIds(List<String> authorUniqueIds) {
    
    this.authorUniqueIds = authorUniqueIds;
    return this;
  }

  public DouplusOrderReportV30Filter addAuthorUniqueIdsItem(String authorUniqueIdsItem) {
    if (this.authorUniqueIds == null) {
      this.authorUniqueIds = new ArrayList<>();
    }
    this.authorUniqueIds.add(authorUniqueIdsItem);
    return this;
  }

   /**
   * 
   * @return authorUniqueIds
  **/
  @javax.annotation.Nullable
  public List<String> getAuthorUniqueIds() {
    return authorUniqueIds;
  }


  public void setAuthorUniqueIds(List<String> authorUniqueIds) {
    this.authorUniqueIds = authorUniqueIds;
  }


  public DouplusOrderReportV30Filter itemIds(List<Long> itemIds) {
    
    this.itemIds = itemIds;
    return this;
  }

  public DouplusOrderReportV30Filter addItemIdsItem(Long itemIdsItem) {
    if (this.itemIds == null) {
      this.itemIds = new ArrayList<>();
    }
    this.itemIds.add(itemIdsItem);
    return this;
  }

   /**
   * 
   * @return itemIds
  **/
  @javax.annotation.Nullable
  public List<Long> getItemIds() {
    return itemIds;
  }


  public void setItemIds(List<Long> itemIds) {
    this.itemIds = itemIds;
  }


  public DouplusOrderReportV30Filter orderCreateTime(DouplusOrderReportV30FilterOrderCreateTime orderCreateTime) {
    
    this.orderCreateTime = orderCreateTime;
    return this;
  }

   /**
   * Get orderCreateTime
   * @return orderCreateTime
  **/
  @javax.annotation.Nullable
  public DouplusOrderReportV30FilterOrderCreateTime getOrderCreateTime() {
    return orderCreateTime;
  }


  public void setOrderCreateTime(DouplusOrderReportV30FilterOrderCreateTime orderCreateTime) {
    this.orderCreateTime = orderCreateTime;
  }


  public DouplusOrderReportV30Filter orderIds(List<Long> orderIds) {
    
    this.orderIds = orderIds;
    return this;
  }

  public DouplusOrderReportV30Filter addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new ArrayList<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

   /**
   * 
   * @return orderIds
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderIds() {
    return orderIds;
  }


  public void setOrderIds(List<Long> orderIds) {
    this.orderIds = orderIds;
  }


  public DouplusOrderReportV30Filter roomIds(List<Long> roomIds) {
    
    this.roomIds = roomIds;
    return this;
  }

  public DouplusOrderReportV30Filter addRoomIdsItem(Long roomIdsItem) {
    if (this.roomIds == null) {
      this.roomIds = new ArrayList<>();
    }
    this.roomIds.add(roomIdsItem);
    return this;
  }

   /**
   * 
   * @return roomIds
  **/
  @javax.annotation.Nullable
  public List<Long> getRoomIds() {
    return roomIds;
  }


  public void setRoomIds(List<Long> roomIds) {
    this.roomIds = roomIds;
  }


  public DouplusOrderReportV30Filter taskIds(List<Long> taskIds) {
    
    this.taskIds = taskIds;
    return this;
  }

  public DouplusOrderReportV30Filter addTaskIdsItem(Long taskIdsItem) {
    if (this.taskIds == null) {
      this.taskIds = new ArrayList<>();
    }
    this.taskIds.add(taskIdsItem);
    return this;
  }

   /**
   * 
   * @return taskIds
  **/
  @javax.annotation.Nullable
  public List<Long> getTaskIds() {
    return taskIds;
  }


  public void setTaskIds(List<Long> taskIds) {
    this.taskIds = taskIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DouplusOrderReportV30Filter douplusOrderReportV30Filter = (DouplusOrderReportV30Filter) o;
    return Objects.equals(this.authorUniqueIds, douplusOrderReportV30Filter.authorUniqueIds) &&
        Objects.equals(this.itemIds, douplusOrderReportV30Filter.itemIds) &&
        Objects.equals(this.orderCreateTime, douplusOrderReportV30Filter.orderCreateTime) &&
        Objects.equals(this.orderIds, douplusOrderReportV30Filter.orderIds) &&
        Objects.equals(this.roomIds, douplusOrderReportV30Filter.roomIds) &&
        Objects.equals(this.taskIds, douplusOrderReportV30Filter.taskIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authorUniqueIds, itemIds, orderCreateTime, orderIds, roomIds, taskIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderReportV30Filter {\n");
    sb.append("    authorUniqueIds: ").append(toIndentedString(authorUniqueIds)).append("\n");
    sb.append("    itemIds: ").append(toIndentedString(itemIds)).append("\n");
    sb.append("    orderCreateTime: ").append(toIndentedString(orderCreateTime)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
    sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
    openapiFields.add("author_unique_ids");
    openapiFields.add("item_ids");
    openapiFields.add("order_create_time");
    openapiFields.add("order_ids");
    openapiFields.add("room_ids");
    openapiFields.add("task_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderReportV30Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderReportV30Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderReportV30Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderReportV30Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderReportV30Filter>() {
           @Override
           public void write(JsonWriter out, DouplusOrderReportV30Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderReportV30Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderReportV30Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderReportV30Filter
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderReportV30Filter
  */
  public static DouplusOrderReportV30Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderReportV30Filter.class);
  }

 /**
  * Convert an instance of DouplusOrderReportV30Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

