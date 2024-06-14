/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ToolsClueFormGetV2FormType.Adapter.class)
public enum ToolsClueFormGetV2FormType {
  
  ADVANCED_CREATIVE_FORM("ADVANCED_CREATIVE_FORM"),
  
  NATIVE_FORM("NATIVE_FORM"),
  
  NORMAL_FORM("NORMAL_FORM");

  private String value;

  ToolsClueFormGetV2FormType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueFormGetV2FormType fromValue(String value) {
    for (ToolsClueFormGetV2FormType b : ToolsClueFormGetV2FormType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsClueFormGetV2FormType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueFormGetV2FormType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueFormGetV2FormType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueFormGetV2FormType.fromValue(value);
    }
  }
}

