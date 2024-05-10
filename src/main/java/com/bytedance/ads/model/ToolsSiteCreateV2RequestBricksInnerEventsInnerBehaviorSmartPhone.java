/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.4
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
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-05-10T19:28:16.178647353+08:00[PRC]")
public class ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone {
  public static final String SERIALIZED_NAME_CALL_DISPLAY = "call_display";
  @SerializedName(SERIALIZED_NAME_CALL_DISPLAY)
  private Long callDisplay = null;

  public static final String SERIALIZED_NAME_INSTANCE_ID = "instance_id";
  @SerializedName(SERIALIZED_NAME_INSTANCE_ID)
  private Long instanceId = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name = null;

  public static final String SERIALIZED_NAME_PHONE_NUMBER = "phone_number";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER)
  private Long phoneNumber = null;

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone() {
  }

  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone callDisplay(Long callDisplay) {
    
    this.callDisplay = callDisplay;
    return this;
  }

   /**
   * 
   * @return callDisplay
  **/
  @javax.annotation.Nullable
  public Long getCallDisplay() {
    return callDisplay;
  }


  public void setCallDisplay(Long callDisplay) {
    this.callDisplay = callDisplay;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone instanceId(Long instanceId) {
    
    this.instanceId = instanceId;
    return this;
  }

   /**
   * 
   * @return instanceId
  **/
  @javax.annotation.Nullable
  public Long getInstanceId() {
    return instanceId;
  }


  public void setInstanceId(Long instanceId) {
    this.instanceId = instanceId;
  }


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone name(String name) {
    
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


  public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone phoneNumber(Long phoneNumber) {
    
    this.phoneNumber = phoneNumber;
    return this;
  }

   /**
   * 
   * @return phoneNumber
  **/
  @javax.annotation.Nullable
  public Long getPhoneNumber() {
    return phoneNumber;
  }


  public void setPhoneNumber(Long phoneNumber) {
    this.phoneNumber = phoneNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone = (ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone) o;
    return Objects.equals(this.callDisplay, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.callDisplay) &&
        Objects.equals(this.instanceId, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.instanceId) &&
        Objects.equals(this.name, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.name) &&
        Objects.equals(this.phoneNumber, toolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.phoneNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callDisplay, instanceId, name, phoneNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone {\n");
    sb.append("    callDisplay: ").append(toIndentedString(callDisplay)).append("\n");
    sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
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
    openapiFields.add("call_display");
    openapiFields.add("instance_id");
    openapiFields.add("name");
    openapiFields.add("phone_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.class));

       return (TypeAdapter<T>) new TypeAdapter<ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone>() {
           @Override
           public void write(JsonWriter out, ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone
  * @throws IOException if the JSON string is invalid with respect to ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone
  */
  public static ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone.class);
  }

 /**
  * Convert an instance of ToolsSiteCreateV2RequestBricksInnerEventsInnerBehaviorSmartPhone to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

