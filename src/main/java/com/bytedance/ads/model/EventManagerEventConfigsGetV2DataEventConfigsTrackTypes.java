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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(EventManagerEventConfigsGetV2DataEventConfigsTrackTypes.Adapter.class)
public enum EventManagerEventConfigsGetV2DataEventConfigsTrackTypes {
  
  JSSDK("JSSDK"),
  
  XPATH("XPATH"),
  
  APPLICATION_API("APPLICATION_API"),
  
  EXTERNAL_API("EXTERNAL_API"),
  
  APPLICATION_SDK("APPLICATION_SDK"),
  
  MINI_PROGRAME_SDK("MINI_PROGRAME_SDK"),
  
  MINI_PROGRAME_API("MINI_PROGRAME_API"),
  
  OFFLINE_CALLBACK("OFFLINE_CALLBACK"),
  
  OFFLINE_API("OFFLINE_API"),
  
  APPLOG("APPLOG"),
  
  TETRIS("TETRIS"),
  
  TETRIS_FE("TETRIS_FE"),
  
  FLY_FISH("FLY_FISH"),
  
  E_CHAT("E_CHAT"),
  
  QUICK_APP_API("QUICK_APP_API");

  private String value;

  EventManagerEventConfigsGetV2DataEventConfigsTrackTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerEventConfigsGetV2DataEventConfigsTrackTypes fromValue(String value) {
    for (EventManagerEventConfigsGetV2DataEventConfigsTrackTypes b : EventManagerEventConfigsGetV2DataEventConfigsTrackTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerEventConfigsGetV2DataEventConfigsTrackTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerEventConfigsGetV2DataEventConfigsTrackTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerEventConfigsGetV2DataEventConfigsTrackTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerEventConfigsGetV2DataEventConfigsTrackTypes.fromValue(value);
    }
  }
}

