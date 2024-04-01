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
@JsonAdapter(ToolsClueLifeGetV2DataListAllocationStatus.Adapter.class)
public enum ToolsClueLifeGetV2DataListAllocationStatus {
  
  NOT_ASSIGN("NOT_ASSIGN"),
  
  ASSIGNED("ASSIGNED");

  private String value;

  ToolsClueLifeGetV2DataListAllocationStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsClueLifeGetV2DataListAllocationStatus fromValue(String value) {
    for (ToolsClueLifeGetV2DataListAllocationStatus b : ToolsClueLifeGetV2DataListAllocationStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsClueLifeGetV2DataListAllocationStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsClueLifeGetV2DataListAllocationStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsClueLifeGetV2DataListAllocationStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsClueLifeGetV2DataListAllocationStatus.fromValue(value);
    }
  }
}

