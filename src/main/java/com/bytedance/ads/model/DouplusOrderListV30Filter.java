/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.DouplusOrderListV30FilterSceneType;
import com.bytedance.ads.model.DouplusOrderListV30FilterStatus;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-10T17:16:22.625414977+08:00[PRC]")
public class DouplusOrderListV30Filter {
  public static final String SERIALIZED_NAME_ORDER_ID = "order_id";
  @SerializedName(SERIALIZED_NAME_ORDER_ID)
  private List<Long> orderId = null;

  public static final String SERIALIZED_NAME_SCENE_TYPE = "scene_type";
  @SerializedName(SERIALIZED_NAME_SCENE_TYPE)
  private DouplusOrderListV30FilterSceneType sceneType = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private List<DouplusOrderListV30FilterStatus> status = null;

  public DouplusOrderListV30Filter() {
  }

  public DouplusOrderListV30Filter orderId(List<Long> orderId) {
    
    this.orderId = orderId;
    return this;
  }

  public DouplusOrderListV30Filter addOrderIdItem(Long orderIdItem) {
    if (this.orderId == null) {
      this.orderId = new ArrayList<>();
    }
    this.orderId.add(orderIdItem);
    return this;
  }

   /**
   * 
   * @return orderId
  **/
  @javax.annotation.Nullable
  public List<Long> getOrderId() {
    return orderId;
  }


  public void setOrderId(List<Long> orderId) {
    this.orderId = orderId;
  }


  public DouplusOrderListV30Filter sceneType(DouplusOrderListV30FilterSceneType sceneType) {
    
    this.sceneType = sceneType;
    return this;
  }

   /**
   * Get sceneType
   * @return sceneType
  **/
  @javax.annotation.Nullable
  public DouplusOrderListV30FilterSceneType getSceneType() {
    return sceneType;
  }


  public void setSceneType(DouplusOrderListV30FilterSceneType sceneType) {
    this.sceneType = sceneType;
  }


  public DouplusOrderListV30Filter status(List<DouplusOrderListV30FilterStatus> status) {
    
    this.status = status;
    return this;
  }

  public DouplusOrderListV30Filter addStatusItem(DouplusOrderListV30FilterStatus statusItem) {
    if (this.status == null) {
      this.status = new ArrayList<>();
    }
    this.status.add(statusItem);
    return this;
  }

   /**
   * 
   * @return status
  **/
  @javax.annotation.Nullable
  public List<DouplusOrderListV30FilterStatus> getStatus() {
    return status;
  }


  public void setStatus(List<DouplusOrderListV30FilterStatus> status) {
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
    DouplusOrderListV30Filter douplusOrderListV30Filter = (DouplusOrderListV30Filter) o;
    return Objects.equals(this.orderId, douplusOrderListV30Filter.orderId) &&
        Objects.equals(this.sceneType, douplusOrderListV30Filter.sceneType) &&
        Objects.equals(this.status, douplusOrderListV30Filter.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, sceneType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DouplusOrderListV30Filter {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    sceneType: ").append(toIndentedString(sceneType)).append("\n");
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
    openapiFields.add("order_id");
    openapiFields.add("scene_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DouplusOrderListV30Filter.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DouplusOrderListV30Filter' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DouplusOrderListV30Filter> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DouplusOrderListV30Filter.class));

       return (TypeAdapter<T>) new TypeAdapter<DouplusOrderListV30Filter>() {
           @Override
           public void write(JsonWriter out, DouplusOrderListV30Filter value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DouplusOrderListV30Filter read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DouplusOrderListV30Filter given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DouplusOrderListV30Filter
  * @throws IOException if the JSON string is invalid with respect to DouplusOrderListV30Filter
  */
  public static DouplusOrderListV30Filter fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DouplusOrderListV30Filter.class);
  }

 /**
  * Convert an instance of DouplusOrderListV30Filter to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
