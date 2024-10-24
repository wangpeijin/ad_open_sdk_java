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
@JsonAdapter(ToolsPlayableCloudGameListV2FilteringStatus.Adapter.class)
public enum ToolsPlayableCloudGameListV2FilteringStatus {
  
  ON_SHELF("ON_SHELF"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  UPLOAD_STATUS("UPLOAD_STATUS"),
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  OFF_SHELF("OFF_SHELF");

  private String value;

  ToolsPlayableCloudGameListV2FilteringStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsPlayableCloudGameListV2FilteringStatus fromValue(String value) {
    for (ToolsPlayableCloudGameListV2FilteringStatus b : ToolsPlayableCloudGameListV2FilteringStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsPlayableCloudGameListV2FilteringStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsPlayableCloudGameListV2FilteringStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsPlayableCloudGameListV2FilteringStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsPlayableCloudGameListV2FilteringStatus.fromValue(value);
    }
  }
}

