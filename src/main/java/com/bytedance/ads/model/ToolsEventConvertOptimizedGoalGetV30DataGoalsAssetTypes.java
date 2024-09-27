/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.22
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
@JsonAdapter(ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes.Adapter.class)
public enum ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes {
  
  MINI_PROGRAME("MINI_PROGRAME"),
  
  TETRIS_EXTERNAL("TETRIS_EXTERNAL");

  private String value;

  ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes fromValue(String value) {
    for (ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes b : ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventConvertOptimizedGoalGetV30DataGoalsAssetTypes.fromValue(value);
    }
  }
}

