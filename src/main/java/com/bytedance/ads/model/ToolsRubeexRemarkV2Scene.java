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
@JsonAdapter(ToolsRubeexRemarkV2Scene.Adapter.class)
public enum ToolsRubeexRemarkV2Scene {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l);

  private Long value;

  ToolsRubeexRemarkV2Scene(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexRemarkV2Scene fromValue(Long value) {
    for (ToolsRubeexRemarkV2Scene b : ToolsRubeexRemarkV2Scene.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexRemarkV2Scene> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexRemarkV2Scene enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexRemarkV2Scene read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsRubeexRemarkV2Scene.fromValue(value);
    }
  }
}

