/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.bytedance.ads.model;

import java.util.Objects;
import java.util.Arrays;
import com.bytedance.ads.model.EventManagerShareGetV30DataListAllAccountType;
import com.bytedance.ads.model.EventManagerShareGetV30DataListShareMode;
import com.bytedance.ads.model.EventManagerShareGetV30ResponseDataListInnerAccountInfo;
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
 * EventManagerShareGetV30ResponseDataListInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-08-13T20:41:09.626365829+08:00[PRC]")
public class EventManagerShareGetV30ResponseDataListInner {
  public static final String SERIALIZED_NAME_ACCOUNT_INFO = "account_info";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_INFO)
  private EventManagerShareGetV30ResponseDataListInnerAccountInfo accountInfo = null;

  public static final String SERIALIZED_NAME_ALL_ACCOUNT_TYPE = "all_account_type";
  @SerializedName(SERIALIZED_NAME_ALL_ACCOUNT_TYPE)
  private EventManagerShareGetV30DataListAllAccountType allAccountType = null;

  public static final String SERIALIZED_NAME_SHARE_MODE = "share_mode";
  @SerializedName(SERIALIZED_NAME_SHARE_MODE)
  private EventManagerShareGetV30DataListShareMode shareMode = null;

  public EventManagerShareGetV30ResponseDataListInner() {
  }

  public EventManagerShareGetV30ResponseDataListInner accountInfo(EventManagerShareGetV30ResponseDataListInnerAccountInfo accountInfo) {
    
    this.accountInfo = accountInfo;
    return this;
  }

   /**
   * Get accountInfo
   * @return accountInfo
  **/
  @javax.annotation.Nullable
  public EventManagerShareGetV30ResponseDataListInnerAccountInfo getAccountInfo() {
    return accountInfo;
  }


  public void setAccountInfo(EventManagerShareGetV30ResponseDataListInnerAccountInfo accountInfo) {
    this.accountInfo = accountInfo;
  }


  public EventManagerShareGetV30ResponseDataListInner allAccountType(EventManagerShareGetV30DataListAllAccountType allAccountType) {
    
    this.allAccountType = allAccountType;
    return this;
  }

   /**
   * Get allAccountType
   * @return allAccountType
  **/
  @javax.annotation.Nullable
  public EventManagerShareGetV30DataListAllAccountType getAllAccountType() {
    return allAccountType;
  }


  public void setAllAccountType(EventManagerShareGetV30DataListAllAccountType allAccountType) {
    this.allAccountType = allAccountType;
  }


  public EventManagerShareGetV30ResponseDataListInner shareMode(EventManagerShareGetV30DataListShareMode shareMode) {
    
    this.shareMode = shareMode;
    return this;
  }

   /**
   * Get shareMode
   * @return shareMode
  **/
  @javax.annotation.Nullable
  public EventManagerShareGetV30DataListShareMode getShareMode() {
    return shareMode;
  }


  public void setShareMode(EventManagerShareGetV30DataListShareMode shareMode) {
    this.shareMode = shareMode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerShareGetV30ResponseDataListInner eventManagerShareGetV30ResponseDataListInner = (EventManagerShareGetV30ResponseDataListInner) o;
    return Objects.equals(this.accountInfo, eventManagerShareGetV30ResponseDataListInner.accountInfo) &&
        Objects.equals(this.allAccountType, eventManagerShareGetV30ResponseDataListInner.allAccountType) &&
        Objects.equals(this.shareMode, eventManagerShareGetV30ResponseDataListInner.shareMode);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountInfo, allAccountType, shareMode);
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
    sb.append("class EventManagerShareGetV30ResponseDataListInner {\n");
    sb.append("    accountInfo: ").append(toIndentedString(accountInfo)).append("\n");
    sb.append("    allAccountType: ").append(toIndentedString(allAccountType)).append("\n");
    sb.append("    shareMode: ").append(toIndentedString(shareMode)).append("\n");
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
    openapiFields.add("account_info");
    openapiFields.add("all_account_type");
    openapiFields.add("share_mode");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerShareGetV30ResponseDataListInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerShareGetV30ResponseDataListInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerShareGetV30ResponseDataListInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerShareGetV30ResponseDataListInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerShareGetV30ResponseDataListInner>() {
           @Override
           public void write(JsonWriter out, EventManagerShareGetV30ResponseDataListInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerShareGetV30ResponseDataListInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerShareGetV30ResponseDataListInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerShareGetV30ResponseDataListInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerShareGetV30ResponseDataListInner
  */
  public static EventManagerShareGetV30ResponseDataListInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerShareGetV30ResponseDataListInner.class);
  }

 /**
  * Convert an instance of EventManagerShareGetV30ResponseDataListInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

