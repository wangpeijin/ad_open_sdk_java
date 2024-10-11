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
import com.bytedance.ads.model.EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes;
import com.bytedance.ads.model.EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
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
 * EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner
 */
@javax.annotation.Generated(value = "com.org.bytedance.ad_open_sdk.JavacusGenerator", date = "2024-10-11T21:50:39.675066214+08:00[Asia/Shanghai]")
public class EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description = null;

  public static final String SERIALIZED_NAME_EVENT_CN_NAME = "event_cn_name";
  @SerializedName(SERIALIZED_NAME_EVENT_CN_NAME)
  private String eventCnName = null;

  public static final String SERIALIZED_NAME_EVENT_ID = "event_id";
  @SerializedName(SERIALIZED_NAME_EVENT_ID)
  private Long eventId = null;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "event_type";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType = null;

  public static final String SERIALIZED_NAME_PROPERTIES = "properties";
  @SerializedName(SERIALIZED_NAME_PROPERTIES)
  private List<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties = null;

  public static final String SERIALIZED_NAME_TRACK_TYPES = "track_types";
  @SerializedName(SERIALIZED_NAME_TRACK_TYPES)
  private List<EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes> trackTypes = null;

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner() {
  }

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 事件描述信息
   * @return description
  **/
  @javax.annotation.Nullable
  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner eventCnName(String eventCnName) {
    
    this.eventCnName = eventCnName;
    return this;
  }

   /**
   * 事件中文名称
   * @return eventCnName
  **/
  @javax.annotation.Nullable
  public String getEventCnName() {
    return eventCnName;
  }


  public void setEventCnName(String eventCnName) {
    this.eventCnName = eventCnName;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner eventId(Long eventId) {
    
    this.eventId = eventId;
    return this;
  }

   /**
   * 事件ID
   * @return eventId
  **/
  @javax.annotation.Nullable
  public Long getEventId() {
    return eventId;
  }


  public void setEventId(Long eventId) {
    this.eventId = eventId;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * 事件类型
   * @return eventType
  **/
  @javax.annotation.Nullable
  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner properties(List<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties) {
    
    this.properties = properties;
    return this;
  }

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner addPropertiesItem(EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    return this;
  }

   /**
   * 事件的附加属性
   * @return properties
  **/
  @javax.annotation.Nullable
  public List<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner> getProperties() {
    return properties;
  }


  public void setProperties(List<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInnerPropertiesInner> properties) {
    this.properties = properties;
  }


  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner trackTypes(List<EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes> trackTypes) {
    
    this.trackTypes = trackTypes;
    return this;
  }

  public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner addTrackTypesItem(EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes trackTypesItem) {
    if (this.trackTypes == null) {
      this.trackTypes = new ArrayList<>();
    }
    this.trackTypes.add(trackTypesItem);
    return this;
  }

   /**
   * 事件回传方式列表，枚举值：&#x60;JSSDK&#x60; JS埋码 、&#x60;EXTERNAL_API&#x60; API回传 、&#x60;XPATH&#x60; XPath圈选
   * @return trackTypes
  **/
  @javax.annotation.Nullable
  public List<EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes> getTrackTypes() {
    return trackTypes;
  }


  public void setTrackTypes(List<EventManagerAvailableEventsGetV2DataEventConfigsTrackTypes> trackTypes) {
    this.trackTypes = trackTypes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner = (EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner) o;
    return Objects.equals(this.description, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.description) &&
        Objects.equals(this.eventCnName, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.eventCnName) &&
        Objects.equals(this.eventId, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.eventId) &&
        Objects.equals(this.eventType, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.eventType) &&
        Objects.equals(this.properties, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.properties) &&
        Objects.equals(this.trackTypes, eventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.trackTypes);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, eventCnName, eventId, eventType, properties, trackTypes);
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
    sb.append("class EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    eventCnName: ").append(toIndentedString(eventCnName)).append("\n");
    sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    trackTypes: ").append(toIndentedString(trackTypes)).append("\n");
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
    openapiFields.add("description");
    openapiFields.add("event_cn_name");
    openapiFields.add("event_id");
    openapiFields.add("event_type");
    openapiFields.add("properties");
    openapiFields.add("track_types");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }


  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner>() {
           @Override
           public void write(JsonWriter out, EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner
  * @throws IOException if the JSON string is invalid with respect to EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner
  */
  public static EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner.class);
  }

 /**
  * Convert an instance of EventManagerAvailableEventsGetV2ResponseDataEventConfigsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

