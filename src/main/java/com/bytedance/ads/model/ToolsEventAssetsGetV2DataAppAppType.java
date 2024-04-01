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
@JsonAdapter(ToolsEventAssetsGetV2DataAppAppType.Adapter.class)
public enum ToolsEventAssetsGetV2DataAppAppType {
  
  ANDROID("ANDROID"),
  
  IOS("IOS");

  private String value;

  ToolsEventAssetsGetV2DataAppAppType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsEventAssetsGetV2DataAppAppType fromValue(String value) {
    for (ToolsEventAssetsGetV2DataAppAppType b : ToolsEventAssetsGetV2DataAppAppType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsEventAssetsGetV2DataAppAppType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsEventAssetsGetV2DataAppAppType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsEventAssetsGetV2DataAppAppType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsEventAssetsGetV2DataAppAppType.fromValue(value);
    }
  }
}

