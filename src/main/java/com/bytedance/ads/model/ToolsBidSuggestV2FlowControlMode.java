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
@JsonAdapter(ToolsBidSuggestV2FlowControlMode.Adapter.class)
public enum ToolsBidSuggestV2FlowControlMode {
  
  BALANCE("FLOW_CONTROL_MODE_BALANCE"),
  
  HOURLY("FLOW_CONTROL_MODE_HOURLY"),
  
  TWO_PHASES("FLOW_CONTROL_MODE_TWO_PHASES"),
  
  SMOOTH("FLOW_CONTROL_MODE_SMOOTH"),
  
  FAST("FLOW_CONTROL_MODE_FAST");

  private String value;

  ToolsBidSuggestV2FlowControlMode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsBidSuggestV2FlowControlMode fromValue(String value) {
    for (ToolsBidSuggestV2FlowControlMode b : ToolsBidSuggestV2FlowControlMode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsBidSuggestV2FlowControlMode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsBidSuggestV2FlowControlMode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsBidSuggestV2FlowControlMode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsBidSuggestV2FlowControlMode.fromValue(value);
    }
  }
}

