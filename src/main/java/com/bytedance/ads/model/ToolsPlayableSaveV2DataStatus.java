/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.25
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
@JsonAdapter(ToolsPlayableSaveV2DataStatus.Adapter.class)
public enum ToolsPlayableSaveV2DataStatus {
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  VALIDATE_FAIL("VALIDATE_FAIL"),
  
  VALIDATE_SUCCESS("VALIDATE_SUCCESS"),
  
  VALIDATING("VALIDATING");

  private String value;

  ToolsPlayableSaveV2DataStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableSaveV2DataStatus fromValue(String value) {
    for (ToolsPlayableSaveV2DataStatus b : ToolsPlayableSaveV2DataStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableSaveV2DataStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableSaveV2DataStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableSaveV2DataStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableSaveV2DataStatus.fromValue(value);
    }
  }
}

