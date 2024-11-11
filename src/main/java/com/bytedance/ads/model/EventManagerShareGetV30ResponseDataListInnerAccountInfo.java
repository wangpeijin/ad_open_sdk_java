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
import com.bytedance.ads.model.EventManagerShareGetV30DataListAccountInfoAccountType;
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
 * 
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-11-11T17:17:04.881129010+08:00[Asia/Shanghai]")
public class EventManagerShareGetV30ResponseDataListInnerAccountInfo {
  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private Long accountId = null;

  public static final String SERIALIZED_NAME_ACCOUNT_TYPE = "account_type";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_TYPE)
  private EventManagerShareGetV30DataListAccountInfoAccountType accountType = null;

  public EventManagerShareGetV30ResponseDataListInnerAccountInfo() {
  }

  public EventManagerShareGetV30ResponseDataListInnerAccountInfo accountId(Long accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 
   * @return accountId
  **/
  @javax.annotation.Nullable
  public Long getAccountId() {
    return accountId;
  }


  public void setAccountId(Long accountId) {
    this.accountId = accountId;
  }


  public EventManagerShareGetV30ResponseDataListInnerAccountInfo accountType(EventManagerShareGetV30DataListAccountInfoAccountType accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Get accountType
   * @return accountType
  **/
  @javax.annotation.Nullable
  public EventManagerShareGetV30DataListAccountInfoAccountType getAccountType() {
    return accountType;
  }


  public void setAccountType(EventManagerShareGetV30DataListAccountInfoAccountType accountType) {
    this.accountType = accountType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerShareGetV30ResponseDataListInnerAccountInfo eventManagerShareGetV30ResponseDataListInnerAccountInfo = (EventManagerShareGetV30ResponseDataListInnerAccountInfo) o;
    return Objects.equals(this.accountId, eventManagerShareGetV30ResponseDataListInnerAccountInfo.accountId) &&
        Objects.equals(this.accountType, eventManagerShareGetV30ResponseDataListInnerAccountInfo.accountType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, accountType);
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
    sb.append("class EventManagerShareGetV30ResponseDataListInnerAccountInfo {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("account_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerShareGetV30ResponseDataListInnerAccountInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerShareGetV30ResponseDataListInnerAccountInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerShareGetV30ResponseDataListInnerAccountInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerShareGetV30ResponseDataListInnerAccountInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerShareGetV30ResponseDataListInnerAccountInfo>() {
           @Override
           public void write(JsonWriter out, EventManagerShareGetV30ResponseDataListInnerAccountInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerShareGetV30ResponseDataListInnerAccountInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerShareGetV30ResponseDataListInnerAccountInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerShareGetV30ResponseDataListInnerAccountInfo
  * @throws IOException if the JSON string is invalid with respect to EventManagerShareGetV30ResponseDataListInnerAccountInfo
  */
  public static EventManagerShareGetV30ResponseDataListInnerAccountInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerShareGetV30ResponseDataListInnerAccountInfo.class);
  }

 /**
  * Convert an instance of EventManagerShareGetV30ResponseDataListInnerAccountInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

