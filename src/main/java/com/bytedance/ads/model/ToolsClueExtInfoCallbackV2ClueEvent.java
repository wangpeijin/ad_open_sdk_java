/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.27
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
@JsonAdapter(ToolsClueExtInfoCallbackV2ClueEvent.Adapter.class)
public enum ToolsClueExtInfoCallbackV2ClueEvent {
  
  NUMBER_1(1l),
  
  NUMBER_2(2l),
  
  NUMBER_3(3l),
  
  NUMBER_4(4l);

  private Long value;

  ToolsClueExtInfoCallbackV2ClueEvent(Long value) {
    this.value = value;
  }

  public Long getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueExtInfoCallbackV2ClueEvent fromValue(Long value) {
    for (ToolsClueExtInfoCallbackV2ClueEvent b : ToolsClueExtInfoCallbackV2ClueEvent.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsClueExtInfoCallbackV2ClueEvent> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueExtInfoCallbackV2ClueEvent enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueExtInfoCallbackV2ClueEvent read(final JsonReader jsonReader) throws IOException {
      Long value = jsonReader.nextLong();
      return ToolsClueExtInfoCallbackV2ClueEvent.fromValue(value);
    }
  }
}

