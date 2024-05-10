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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes.Adapter.class)
public enum EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes {
  
  APP("APP"),
  
  MINI_PROGRAM("MINI_PROGRAM"),
  
  ORANGE("ORANGE"),
  
  QUICK_APP("QUICK_APP"),
  
  THIRDPARTY("THIRDPARTY");

  private String value;

  EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes fromValue(String value) {
    for (EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes b : EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EventManagerOptimizedGoalGetV2V30DataGoalsDeepGoalsAssetTypes.fromValue(value);
    }
  }
}

