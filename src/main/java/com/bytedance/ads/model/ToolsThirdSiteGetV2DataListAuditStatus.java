/*
 * Oceanengine Open Api
 * 巨量引擎开放平台 Open Api
 *
 * The version of the OpenAPI document: 1.1.6
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
@JsonAdapter(ToolsThirdSiteGetV2DataListAuditStatus.Adapter.class)
public enum ToolsThirdSiteGetV2DataListAuditStatus {
  
  AUDIT_UNKNOW("AUDIT_UNKNOW"),
  
  AUDIT_ACCEPTED("AUDIT_ACCEPTED"),
  
  AUDIT_REJECTED("AUDIT_REJECTED"),
  
  AUDIT_BANNED("AUDIT_BANNED"),
  
  AUDITING("AUDITING"),
  
  AWAIT_AUDIT("AWAIT_AUDIT");

  private String value;

  ToolsThirdSiteGetV2DataListAuditStatus(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static ToolsThirdSiteGetV2DataListAuditStatus fromValue(String value) {
    for (ToolsThirdSiteGetV2DataListAuditStatus b : ToolsThirdSiteGetV2DataListAuditStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<ToolsThirdSiteGetV2DataListAuditStatus> {
    @Override
    public void write(final JsonWriter jsonWriter, final ToolsThirdSiteGetV2DataListAuditStatus enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public ToolsThirdSiteGetV2DataListAuditStatus read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return ToolsThirdSiteGetV2DataListAuditStatus.fromValue(value);
    }
  }
}

