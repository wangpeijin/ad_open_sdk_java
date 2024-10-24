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
@JsonAdapter(ToolsAppManagementAppGetV2Status.Adapter.class)
public enum ToolsAppManagementAppGetV2Status {
  
  ALL("ALL"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_DOING("AUDIT_DOING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  ENABLE("ENABLE");

  private String value;

  ToolsAppManagementAppGetV2Status(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsAppManagementAppGetV2Status fromValue(String value) {
    for (ToolsAppManagementAppGetV2Status b : ToolsAppManagementAppGetV2Status.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsAppManagementAppGetV2Status> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsAppManagementAppGetV2Status enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsAppManagementAppGetV2Status read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsAppManagementAppGetV2Status.fromValue(value);
    }
  }
}

