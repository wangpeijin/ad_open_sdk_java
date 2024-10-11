/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.SubscribeAccountsListV30DataAdvertisersStatus;
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
 * SubscribeAccountsListV30ResponseDataAdvertisersInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class SubscribeAccountsListV30ResponseDataAdvertisersInner {
  public static final String SERIALIZED_NAME_ADVERTISER_ID = "advertiser_id";
  @SerializedName(SERIALIZED_NAME_ADVERTISER_ID)
  private Long advertiserId = null;

  public static final String SERIALIZED_NAME_CORE_USER_ID = "core_user_id";
  @SerializedName(SERIALIZED_NAME_CORE_USER_ID)
  private Long coreUserId = null;

  public static final String SERIALIZED_NAME_EVENT = "event";
  @SerializedName(SERIALIZED_NAME_EVENT)
  private String event = null;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason = null;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private SubscribeAccountsListV30DataAdvertisersStatus status = null;

  public SubscribeAccountsListV30ResponseDataAdvertisersInner() {
  }

  public SubscribeAccountsListV30ResponseDataAdvertisersInner advertiserId(Long advertiserId) {
    
    this.advertiserId = advertiserId;
    return this;
  }

   /**
   * 
   * @return advertiserId
  **/
  @javax.annotation.Nullable
  public Long getAdvertiserId() {
    return advertiserId;
  }


  public void setAdvertiserId(Long advertiserId) {
    this.advertiserId = advertiserId;
  }


  public SubscribeAccountsListV30ResponseDataAdvertisersInner coreUserId(Long coreUserId) {
    
    this.coreUserId = coreUserId;
    return this;
  }

   /**
   * 
   * @return coreUserId
  **/
  @javax.annotation.Nullable
  public Long getCoreUserId() {
    return coreUserId;
  }


  public void setCoreUserId(Long coreUserId) {
    this.coreUserId = coreUserId;
  }


  public SubscribeAccountsListV30ResponseDataAdvertisersInner event(String event) {
    
    this.event = event;
    return this;
  }

   /**
   * 
   * @return event
  **/
  @javax.annotation.Nullable
  public String getEvent() {
    return event;
  }


  public void setEvent(String event) {
    this.event = event;
  }


  public SubscribeAccountsListV30ResponseDataAdvertisersInner reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * 
   * @return reason
  **/
  @javax.annotation.Nullable
  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public SubscribeAccountsListV30ResponseDataAdvertisersInner status(SubscribeAccountsListV30DataAdvertisersStatus status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  public SubscribeAccountsListV30DataAdvertisersStatus getStatus() {
    return status;
  }


  public void setStatus(SubscribeAccountsListV30DataAdvertisersStatus status) {
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
    SubscribeAccountsListV30ResponseDataAdvertisersInner subscribeAccountsListV30ResponseDataAdvertisersInner = (SubscribeAccountsListV30ResponseDataAdvertisersInner) o;
    return Objects.equals(this.advertiserId, subscribeAccountsListV30ResponseDataAdvertisersInner.advertiserId) &&
        Objects.equals(this.coreUserId, subscribeAccountsListV30ResponseDataAdvertisersInner.coreUserId) &&
        Objects.equals(this.event, subscribeAccountsListV30ResponseDataAdvertisersInner.event) &&
        Objects.equals(this.reason, subscribeAccountsListV30ResponseDataAdvertisersInner.reason) &&
        Objects.equals(this.status, subscribeAccountsListV30ResponseDataAdvertisersInner.status);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(advertiserId, coreUserId, event, reason, status);
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
    sb.append("class SubscribeAccountsListV30ResponseDataAdvertisersInner {\n");
    sb.append("    advertiserId: ").append(toIndentedString(advertiserId)).append("\n");
    sb.append("    coreUserId: ").append(toIndentedString(coreUserId)).append("\n");
    sb.append("    event: ").append(toIndentedString(event)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
    openapiFields.add("advertiser_id");
    openapiFields.add("core_user_id");
    openapiFields.add("event");
    openapiFields.add("reason");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("advertiser_id");
    openapiRequiredFields.add("core_user_id");
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubscribeAccountsListV30ResponseDataAdvertisersInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubscribeAccountsListV30ResponseDataAdvertisersInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubscribeAccountsListV30ResponseDataAdvertisersInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubscribeAccountsListV30ResponseDataAdvertisersInner.class));

       return (TypeAdapter<T>) new TypeAdapter<SubscribeAccountsListV30ResponseDataAdvertisersInner>() {
           @Override
           public void write(JsonWriter out, SubscribeAccountsListV30ResponseDataAdvertisersInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubscribeAccountsListV30ResponseDataAdvertisersInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubscribeAccountsListV30ResponseDataAdvertisersInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubscribeAccountsListV30ResponseDataAdvertisersInner
  * @throws IOException if the JSON string is invalid with respect to SubscribeAccountsListV30ResponseDataAdvertisersInner
  */
  public static SubscribeAccountsListV30ResponseDataAdvertisersInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubscribeAccountsListV30ResponseDataAdvertisersInner.class);
  }

 /**
  * Convert an instance of SubscribeAccountsListV30ResponseDataAdvertisersInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

