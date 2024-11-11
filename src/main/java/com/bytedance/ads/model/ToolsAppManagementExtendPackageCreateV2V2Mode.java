/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.28
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
@JsonAdapter(ToolsAppManagementExtendPackageCreateV2V2Mode.Adapter.class)
public enum ToolsAppManagementExtendPackageCreateV2V2Mode {
  
  AUTO("Auto"),
  
  CUSTOMIZE("Customize"),
  
  MANUAL("Manual");

  private String value;

  ToolsAppManagementExtendPackageCreateV2V2Mode(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementExtendPackageCreateV2V2Mode fromValue(String value) {
    for (ToolsAppManagementExtendPackageCreateV2V2Mode b : ToolsAppManagementExtendPackageCreateV2V2Mode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementExtendPackageCreateV2V2Mode> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementExtendPackageCreateV2V2Mode enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementExtendPackageCreateV2V2Mode read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementExtendPackageCreateV2V2Mode.fromValue(value);
    }
  }
}

