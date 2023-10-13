/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.11
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
@JsonAdapter(EventManagerAssetsCreateV2AssetType.Adapter.class)
public enum EventManagerAssetsCreateV2AssetType {
  
  APP("APP"),
  
  TETRIS_EXTERNAL("TETRIS_EXTERNAL"),
  
  THIRD_EXTERNAL("THIRD_EXTERNAL"),
  
  MINI_PROGRAME("MINI_PROGRAME"),
  
  OFFLINE_EVENT("OFFLINE_EVENT"),
  
  OTHER("OTHER"),
  
  QUICK_APP("QUICK_APP");

  private String value;

  EventManagerAssetsCreateV2AssetType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerAssetsCreateV2AssetType fromValue(String value) {
    for (EventManagerAssetsCreateV2AssetType b : EventManagerAssetsCreateV2AssetType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<EventManagerAssetsCreateV2AssetType> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerAssetsCreateV2AssetType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerAssetsCreateV2AssetType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerAssetsCreateV2AssetType.fromValue(value);
    }
  }
}

