/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-09-20T12:38:33.841352661+08:00[PRC]")
public class ReportLiveRoomAttributeGetV2Filtering {
  public static final String SERIALIZED_NAME_PRODUCT_IDS = "product_ids";
  @SerializedName(SERIALIZED_NAME_PRODUCT_IDS)
  private List<Long> productIds = null;

  public static final String SERIALIZED_NAME_ROOM_IDS = "room_ids";
  @SerializedName(SERIALIZED_NAME_ROOM_IDS)
  private List<Long> roomIds = null;

  public ReportLiveRoomAttributeGetV2Filtering() {
  }

  public ReportLiveRoomAttributeGetV2Filtering productIds(List<Long> productIds) {
    
    this.productIds = productIds;
    return this;
  }

  public ReportLiveRoomAttributeGetV2Filtering addProductIdsItem(Long productIdsItem) {
    if (this.productIds == null) {
      this.productIds = new ArrayList<>();
    }
    this.productIds.add(productIdsItem);
    return this;
  }

   /**
   * 
   * @return productIds
  **/
  @javax.annotation.Nullable
  public List<Long> getProductIds() {
    return productIds;
  }


  public void setProductIds(List<Long> productIds) {
    this.productIds = productIds;
  }


  public ReportLiveRoomAttributeGetV2Filtering roomIds(List<Long> roomIds) {
    
    this.roomIds = roomIds;
    return this;
  }

  public ReportLiveRoomAttributeGetV2Filtering addRoomIdsItem(Long roomIdsItem) {
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



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportLiveRoomAttributeGetV2Filtering reportLiveRoomAttributeGetV2Filtering = (ReportLiveRoomAttributeGetV2Filtering) o;
    return Objects.equals(this.productIds, reportLiveRoomAttributeGetV2Filtering.productIds) &&
        Objects.equals(this.roomIds, reportLiveRoomAttributeGetV2Filtering.roomIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productIds, roomIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportLiveRoomAttributeGetV2Filtering {\n");
    sb.append("    productIds: ").append(toIndentedString(productIds)).append("\n");
    sb.append("    roomIds: ").append(toIndentedString(roomIds)).append("\n");
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
    openapiFields.add("product_ids");
    openapiFields.add("room_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomAttributeGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomAttributeGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomAttributeGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomAttributeGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomAttributeGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomAttributeGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomAttributeGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomAttributeGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomAttributeGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomAttributeGetV2Filtering
  */
  public static ReportLiveRoomAttributeGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomAttributeGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportLiveRoomAttributeGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

