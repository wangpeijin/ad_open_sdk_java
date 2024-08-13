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
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * 
 */
@JsonAdapter(ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType.Adapter.class)
public enum ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType {
  
  DISABLED("Disabled"),
  
  DISCRIMINATEBYGROUP("DiscriminateByGroup"),
  
  DYNAMICVALUE("DynamicValue"),
  
  FIXED("Fixed");

  private String value;

  ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType fromValue(String value) {
    for (ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType b : ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventConvertOptimizedGoalGetV30DataGoalsValueType.fromValue(value);
    }
  }
}

