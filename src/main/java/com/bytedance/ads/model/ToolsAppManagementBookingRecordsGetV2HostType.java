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
@JsonAdapter(ToolsAppManagementBookingRecordsGetV2HostType.Adapter.class)
public enum ToolsAppManagementBookingRecordsGetV2HostType {
  
  IN("HOST_IN"),
  
  OUT("HOST_OUT");

  private String value;

  ToolsAppManagementBookingRecordsGetV2HostType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementBookingRecordsGetV2HostType fromValue(String value) {
    for (ToolsAppManagementBookingRecordsGetV2HostType b : ToolsAppManagementBookingRecordsGetV2HostType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementBookingRecordsGetV2HostType> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementBookingRecordsGetV2HostType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementBookingRecordsGetV2HostType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementBookingRecordsGetV2HostType.fromValue(value);
    }
  }
}

