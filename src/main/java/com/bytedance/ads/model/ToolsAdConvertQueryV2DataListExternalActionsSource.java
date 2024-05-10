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
@JsonAdapter(ToolsAdConvertQueryV2DataListExternalActionsSource.Adapter.class)
public enum ToolsAdConvertQueryV2DataListExternalActionsSource {
  
  CONFIG("SOURCE_CONFIG"),
  
  TETRIS("SOURCE_TETRIS"),
  
  METEOR("SOURCE_METEOR");

  private String value;

  ToolsAdConvertQueryV2DataListExternalActionsSource(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAdConvertQueryV2DataListExternalActionsSource fromValue(String value) {
    for (ToolsAdConvertQueryV2DataListExternalActionsSource b : ToolsAdConvertQueryV2DataListExternalActionsSource.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAdConvertQueryV2DataListExternalActionsSource> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAdConvertQueryV2DataListExternalActionsSource enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAdConvertQueryV2DataListExternalActionsSource read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAdConvertQueryV2DataListExternalActionsSource.fromValue(value);
    }
  }
}

