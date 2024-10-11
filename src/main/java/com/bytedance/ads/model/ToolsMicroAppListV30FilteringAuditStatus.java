/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.23
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
@JsonAdapter(ToolsMicroAppListV30FilteringAuditStatus.Adapter.class)
public enum ToolsMicroAppListV30FilteringAuditStatus {
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDITING("AUDITING"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  ALL("ALL");

  private String value;

  ToolsMicroAppListV30FilteringAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsMicroAppListV30FilteringAuditStatus fromValue(String value) {
    for (ToolsMicroAppListV30FilteringAuditStatus b : ToolsMicroAppListV30FilteringAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsMicroAppListV30FilteringAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsMicroAppListV30FilteringAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsMicroAppListV30FilteringAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsMicroAppListV30FilteringAuditStatus.fromValue(value);
    }
  }
}

