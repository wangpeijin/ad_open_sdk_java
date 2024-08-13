/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.15
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
@JsonAdapter(ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType.Adapter.class)
public enum ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType {
  
  BP("BP"),
  
  STAR("STAR"),
  
  AD("AD");

  private String value;

  ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType fromValue(String value) {
    for (ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType b : ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBpShareV2DataErrorListAccountInfoAccountType.fromValue(value);
    }
  }
}

