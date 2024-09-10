/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.19
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
@JsonAdapter(ToolsAppManagementShareAccountListV2SearchType.Adapter.class)
public enum ToolsAppManagementShareAccountListV2SearchType {
  
  ORGANIZATION_SHARE("ORGANIZATION_SHARE"),
  
  OTHER("OTHER");

  private String value;

  ToolsAppManagementShareAccountListV2SearchType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementShareAccountListV2SearchType fromValue(String value) {
    for (ToolsAppManagementShareAccountListV2SearchType b : ToolsAppManagementShareAccountListV2SearchType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementShareAccountListV2SearchType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementShareAccountListV2SearchType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementShareAccountListV2SearchType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementShareAccountListV2SearchType.fromValue(value);
    }
  }
}

