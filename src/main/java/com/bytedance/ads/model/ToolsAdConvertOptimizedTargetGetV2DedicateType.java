/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.1
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
@JsonAdapter(ToolsAdConvertOptimizedTargetGetV2DedicateType.Adapter.class)
public enum ToolsAdConvertOptimizedTargetGetV2DedicateType {
  
  UNSET("UNSET"),
  
  DEDICATED("DEDICATED");

  private String value;

  ToolsAdConvertOptimizedTargetGetV2DedicateType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertOptimizedTargetGetV2DedicateType fromValue(String value) {
    for (ToolsAdConvertOptimizedTargetGetV2DedicateType b : ToolsAdConvertOptimizedTargetGetV2DedicateType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertOptimizedTargetGetV2DedicateType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertOptimizedTargetGetV2DedicateType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertOptimizedTargetGetV2DedicateType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertOptimizedTargetGetV2DedicateType.fromValue(value);
    }
  }
}

