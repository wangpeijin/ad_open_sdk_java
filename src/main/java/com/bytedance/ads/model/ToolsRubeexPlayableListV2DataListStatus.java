/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.0.9
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
@JsonAdapter(ToolsRubeexPlayableListV2DataListStatus.Adapter.class)
public enum ToolsRubeexPlayableListV2DataListStatus {
  
  AUDIT_FAIL("AUDIT_FAIL"),
  
  AUDIT_SUCCESS("AUDIT_SUCCESS"),
  
  VALIDATE_FAIL("VALIDATE_FAIL"),
  
  VALIDATE_SUCCESS("VALIDATE_SUCCESS"),
  
  VALIDATING("VALIDATING");

  private String value;

  ToolsRubeexPlayableListV2DataListStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsRubeexPlayableListV2DataListStatus fromValue(String value) {
    for (ToolsRubeexPlayableListV2DataListStatus b : ToolsRubeexPlayableListV2DataListStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<ToolsRubeexPlayableListV2DataListStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsRubeexPlayableListV2DataListStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsRubeexPlayableListV2DataListStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsRubeexPlayableListV2DataListStatus.fromValue(value);
    }
  }
}
