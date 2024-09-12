/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.20
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
@JsonAdapter(ToolsEventAssetsGetV2SortType.Adapter.class)
public enum ToolsEventAssetsGetV2SortType {
  
  DESC("DESC"),
  
  ASC("ASC");

  private String value;

  ToolsEventAssetsGetV2SortType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAssetsGetV2SortType fromValue(String value) {
    for (ToolsEventAssetsGetV2SortType b : ToolsEventAssetsGetV2SortType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsEventAssetsGetV2SortType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAssetsGetV2SortType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAssetsGetV2SortType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAssetsGetV2SortType.fromValue(value);
    }
  }
}

