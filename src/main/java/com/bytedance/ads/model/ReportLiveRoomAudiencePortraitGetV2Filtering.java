/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.12
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2023-10-13T17:19:23.525018957+08:00[PRC]")
public class ReportLiveRoomAudiencePortraitGetV2Filtering {
  public static final String SERIALIZED_NAME_PRODUCT_ID = "product_id";
  @SerializedName(SERIALIZED_NAME_PRODUCT_ID)
  private Long productId = null;

  public static final String SERIALIZED_NAME_ROOM_ID = "room_id";
  @SerializedName(SERIALIZED_NAME_ROOM_ID)
  private Long roomId = null;

  public ReportLiveRoomAudiencePortraitGetV2Filtering() {
  }

  public ReportLiveRoomAudiencePortraitGetV2Filtering productId(Long productId) {
    
    this.productId = productId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return productId
  **/
  @javax.annotation.Nullable
  public Long getProductId() {
    return productId;
  }


  public void setProductId(Long productId) {
    this.productId = productId;
  }


  public ReportLiveRoomAudiencePortraitGetV2Filtering roomId(Long roomId) {
    
    this.roomId = roomId;
    return this;
  }

   /**
   * 
   * minimum: 1
   * maximum: 9223372036854775807
   * @return roomId
  **/
  @javax.annotation.Nullable
  public Long getRoomId() {
    return roomId;
  }


  public void setRoomId(Long roomId) {
    this.roomId = roomId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportLiveRoomAudiencePortraitGetV2Filtering reportLiveRoomAudiencePortraitGetV2Filtering = (ReportLiveRoomAudiencePortraitGetV2Filtering) o;
    return Objects.equals(this.productId, reportLiveRoomAudiencePortraitGetV2Filtering.productId) &&
        Objects.equals(this.roomId, reportLiveRoomAudiencePortraitGetV2Filtering.roomId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, roomId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportLiveRoomAudiencePortraitGetV2Filtering {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    roomId: ").append(toIndentedString(roomId)).append("\n");
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
    openapiFields.add("product_id");
    openapiFields.add("room_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportLiveRoomAudiencePortraitGetV2Filtering.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportLiveRoomAudiencePortraitGetV2Filtering' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportLiveRoomAudiencePortraitGetV2Filtering> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportLiveRoomAudiencePortraitGetV2Filtering.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportLiveRoomAudiencePortraitGetV2Filtering>() {
           @Override
           public void write(JsonWriter out, ReportLiveRoomAudiencePortraitGetV2Filtering value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportLiveRoomAudiencePortraitGetV2Filtering read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReportLiveRoomAudiencePortraitGetV2Filtering given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReportLiveRoomAudiencePortraitGetV2Filtering
  * @throws IOException if the JSON string is invalid with respect to ReportLiveRoomAudiencePortraitGetV2Filtering
  */
  public static ReportLiveRoomAudiencePortraitGetV2Filtering fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportLiveRoomAudiencePortraitGetV2Filtering.class);
  }

 /**
  * Convert an instance of ReportLiveRoomAudiencePortraitGetV2Filtering to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

